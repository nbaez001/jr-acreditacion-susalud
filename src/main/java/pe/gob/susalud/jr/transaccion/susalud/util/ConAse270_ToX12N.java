/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_PRV;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConAse270_ToX12N
/*     */ {
/*     */   public static String traducirEstructura270(InConAse270 inConAse) {
/*  26 */     String sReturn = "", sReturn01 = "";
/*  27 */     inConAse.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  28 */     inConAse.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  31 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  32 */     subTrama_ISA.generaSubTrama(inConAse.getIdRemitente(), inConAse.getIdReceptor(), inConAse.getFeTransaccion(), inConAse.getHoTransaccion(), inConAse.getIdCorrelativo());
/*  33 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  36 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  37 */     subTrama_GS.generaSubTrama("HS", inConAse.getIdRemitente(), inConAse.getIdReceptor(), inConAse.getFeTransaccion(), inConAse.getHoTransaccion(), inConAse.getNuControl());
/*  38 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  41 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  42 */     subTrama_ST.generaSubTrama(inConAse.getIdTransaccion(), inConAse.getNuControlST(), "");
/*  43 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  46 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  47 */     subTrama_BHT.generaSubTrama("0022", inConAse.getTiFinalidad());
/*  48 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  51 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  52 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  53 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  56 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  57 */     subTrama_NM11.generaSubTrama("PR", inConAse.getCaRemitente(), "PI", inConAse.getNuRucRemitente());
/*  58 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  61 */     SubTrama_PRV subTrama_PRV1 = new SubTrama_PRV();
/*  62 */     subTrama_PRV1.generaSubTrama("OR", "", inConAse.getTxRequest());
/*  63 */     subTrama_PRV1.completaLongitud();
/*     */ 
/*     */     
/*  66 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  67 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  68 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  71 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  72 */     subTrama_NM12.generaSubTrama("1P", inConAse.getCaRemitente(), "FI", inConAse.getIdReceptor());
/*  73 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  76 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  77 */     subTrama_HL3.generaSubTrama("3", "2", "22", "0");
/*  78 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  81 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  82 */     subTrama_NM13.generaSubTrama("IL", inConAse.getCaPaciente(), inConAse.getApPaternoPaciente(), inConAse.getNoPaciente(), "", inConAse.getCoAfPaciente(), inConAse.getApMaternoPaciente());
/*  83 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  86 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  87 */     subTrama_REF1.generaSubTrama("DD", inConAse.getTiDocumento());
/*  88 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  91 */     SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  92 */     subTrama_REF2.generaSubTrama("4A", inConAse.getNuDocumento());
/*  93 */     subTrama_REF2.completaLongitud();
/*     */ 
/*     */     
/*  96 */     SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/*  97 */     subTrama_REF3.generaSubTrama("PRT", inConAse.getCoProducto(), inConAse.getDeProducto());
/*  98 */     subTrama_REF3.completaLongitud();
/*     */ 
/*     */     
/* 101 */     SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 102 */     subTrama_REF3_4.generaSubTrama("ZZ", inConAse.getCoInProducto());
/* 103 */     subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */     
/* 106 */     SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 107 */     subTrama_REF4.generaSubTrama("D7", inConAse.getNuCobertura(), inConAse.getDeCobertura());
/* 108 */     subTrama_REF4.completaLongitud();
/*     */ 
/*     */     
/* 111 */     SubTrama_REF4 subTrama_REF4_4 = new SubTrama_REF4();
/* 112 */     subTrama_REF4_4.generaSubTrama(inConAse.getCaServicio(), inConAse.getCoCalservicio(), inConAse.getBeMaxInicial());
/* 113 */     subTrama_REF4_4.completaLongitud();
/*     */ 
/*     */     
/* 116 */     SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 117 */     subTrama_REF5.generaSubTrama("D7", inConAse.getCoTiCobertura());
/* 118 */     subTrama_REF5.completaLongitud();
/*     */ 
/*     */     
/* 121 */     SubTrama_REF4 subTrama_REF5_4 = new SubTrama_REF4();
/* 122 */     subTrama_REF5_4.generaSubTrama("ZZ", inConAse.getCoSuTiCobertura());
/* 123 */     subTrama_REF5_4.completaLongitud();
/*     */ 
/*     */     
/* 126 */     SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 127 */     subTrama_REF6.generaSubTrama("8X", inConAse.getCoAplicativoTx());
/* 128 */     subTrama_REF6.completaLongitud();
/*     */ 
/*     */     
/* 131 */     SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 132 */     subTrama_REF7.generaSubTrama("S2", inConAse.getCoEspecialidad());
/* 133 */     subTrama_REF7.completaLongitud();
/*     */ 
/*     */     
/* 136 */     SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 137 */     subTrama_REF8.generaSubTrama("ZZ", inConAse.getCoParentesco());
/* 138 */     subTrama_REF8.completaLongitud();
/*     */ 
/*     */     
/* 141 */     SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 142 */     subTrama_REF9.generaSubTrama("18", inConAse.getNuPlan());
/* 143 */     subTrama_REF9.completaLongitud();
/*     */ 
/*     */     
/* 146 */     SubTrama_REF4 subTrama_REF9_4 = new SubTrama_REF4();
/* 147 */     subTrama_REF9_4.generaSubTrama("ZZ", inConAse.getNuAutOrigen());
/* 148 */     subTrama_REF9_4.completaLongitud();
/*     */ 
/*     */     
/* 151 */     SubTrama_REF subTrama_REF10 = new SubTrama_REF();
/* 152 */     subTrama_REF10.generaSubTrama("PRT", inConAse.getTiAccidente());
/* 153 */     subTrama_REF10.completaLongitud();
/*     */     
/* 155 */     SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 156 */     subTrama_DTP1.generaSubTrama("447", "D8", inConAse.getFeAccidente());
/* 157 */     subTrama_DTP1.completaLongitud();
/*     */ 
/*     */     
/* 160 */     SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 161 */     subTrama_NM14.generaSubTrama("P5", inConAse.getTiCaContratante(), inConAse.getNoPaContratante(), inConAse.getNoContratante(), "", "", inConAse.getNoMaContratante());
/* 162 */     subTrama_NM14.completaLongitud();
/*     */ 
/*     */     
/* 165 */     SubTrama_REF subTrama_REF11 = new SubTrama_REF();
/* 166 */     subTrama_REF11.generaSubTrama("DD", inConAse.getTiDoContratante());
/* 167 */     subTrama_REF11.completaLongitud();
/*     */ 
/*     */     
/* 170 */     SubTrama_REF4 subTrama_REF11_4 = new SubTrama_REF4();
/* 171 */     subTrama_REF11_4.generaSubTrama(inConAse.getIdReContratante(), inConAse.getCoReContratante());
/* 172 */     subTrama_REF11_4.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 198 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_PRV1.returnComoString("PRV*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "*" + subTrama_REF4_4.returnComoString("", ":", "~")) + subTrama_REF5.returnComoString("REF*", "*", "*" + subTrama_REF5_4.returnComoString("", ":", "~")) + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "~") + subTrama_REF9.returnComoString("REF*", "*", "*" + subTrama_REF9_4.returnComoString("", ":", "~")) + subTrama_REF10.returnComoString("REF*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF11.returnComoString("REF*", "*", "*" + subTrama_REF11_4.returnComoString("", ":", "~"));
/*     */     
/* 200 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 203 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 204 */     subTrama_SE.generaSubTrama(canTxSE, inConAse.getNuControlST());
/* 205 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 208 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 209 */     subTrama_GE.generaSubTrama(inConAse.getNuControl());
/* 210 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 213 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 214 */     subTrama_IEA.generaSubTrama(inConAse.getIdCorrelativo());
/* 215 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 222 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 226 */     String[] arrayCadena = sReturn.split("\\~");
/* 227 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 228 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConAse270_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */