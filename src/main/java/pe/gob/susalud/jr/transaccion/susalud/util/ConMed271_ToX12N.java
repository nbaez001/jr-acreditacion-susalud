/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB13;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_MSG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConMed271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InConMed271 inConMed) {
/*  27 */     String sReturn = "", sReturn01 = "";
/*  28 */     inConMed.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  29 */     inConMed.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  31 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  32 */     subTrama_ISA.generaSubTrama(inConMed.getIdRemitente(), inConMed.getIdReceptor(), inConMed.getFeTransaccion(), inConMed.getHoTransaccion(), inConMed.getIdCorrelativo());
/*  33 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  36 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  37 */     subTrama_GS.generaSubTrama("HB", inConMed.getIdRemitente(), inConMed.getIdReceptor(), inConMed.getFeTransaccion(), inConMed.getHoTransaccion(), inConMed.getNuControl());
/*  38 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  41 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  42 */     subTrama_ST.generaSubTrama(inConMed.getIdTransaccion(), inConMed.getNuControlST(), "");
/*  43 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  46 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  47 */     subTrama_BHT.generaSubTrama("0022", inConMed.getTiFinalidad());
/*  48 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  51 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  52 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  53 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  56 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  57 */     subTrama_NM1.generaSubTrama("PR", inConMed.getCaRemitente(), "PI", inConMed.getIdRemitente());
/*  58 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  61 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  62 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  63 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  66 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  67 */     subTrama_NM12.generaSubTrama("1P", inConMed.getCaReceptor(), "SV", inConMed.getNuRucReceptor());
/*  68 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  71 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  72 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/*  73 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  76 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  77 */     subTrama_NM13.generaSubTrama("IL", inConMed.getCaPaciente(), inConMed.getApPaternoPaciente(), inConMed.getNoPaciente(), "MI", inConMed.getCoPaciente(), inConMed.getApMaternoPaciente());
/*  78 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  81 */     String sDetalle = "";
/*  82 */     for (int i = 0; i < inConMed.getDetalles().size(); i++) {
/*     */       
/*  84 */       SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/*  85 */       subTrama_EB1.generaSubTrama("W", "", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getCoSeCIE10(), "", "", "", "", "");
/*  86 */       subTrama_EB1.completaLongitud();
/*     */ 
/*     */       
/*  89 */       SubTrama_EB13 subTrama_EB113 = new SubTrama_EB13();
/*  90 */       subTrama_EB113.generaSubTrama("ZZ", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getCoRestriccion(), "");
/*  91 */       subTrama_EB113.completaLongitud();
/*     */ 
/*     */       
/*  94 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  95 */       subTrama_REF1.generaSubTrama("82", "", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getDePreexistencia());
/*  96 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/*  99 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 100 */       subTrama_MSG1.generaSubTrama(((InConMed271Detalle)inConMed.getDetalles().get(i)).getMsgObsPr(), "LC", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getIdFuenteRE());
/* 101 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 104 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 105 */       subTrama_EB2.generaSubTrama(((InConMed271Detalle)inConMed.getDetalles().get(i)).getEsCobertura(), "", "", "", "", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getMoDiagnostico(), "", "");
/* 106 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 109 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 110 */       subTrama_DTP1.generaSubTrama("150", "D8", ((InConMed271Detalle)inConMed.getDetalles().get(i)).getTiEspera());
/* 111 */       subTrama_DTP1.completaLongitud();
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
/* 134 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_EB1.returnComoString("EB*", "*", "*" + subTrama_EB113.returnComoString("", ":", "~")) + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     if (inConMed.getDetalles().isEmpty()) {
/*     */       
/* 142 */       SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/* 143 */       subTrama_EB1.generaSubTrama("W", "", "", "", "", "", "", "");
/* 144 */       subTrama_EB1.completaLongitud();
/*     */ 
/*     */       
/* 147 */       SubTrama_EB13 subTrama_EB113 = new SubTrama_EB13();
/* 148 */       subTrama_EB113.generaSubTrama("ZZ", "", "");
/* 149 */       subTrama_EB113.completaLongitud();
/*     */ 
/*     */       
/* 152 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 153 */       subTrama_REF1.generaSubTrama("82", "", "");
/* 154 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 157 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 158 */       subTrama_MSG1.generaSubTrama("");
/* 159 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 162 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 163 */       subTrama_EB2.generaSubTrama("", "", "", "", "", "", "", "");
/* 164 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 167 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 168 */       subTrama_DTP1.generaSubTrama("150", "D8", "");
/* 169 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 177 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_EB1.returnComoString("EB*", "*", "*" + subTrama_EB113.returnComoString("", ":", "~")) + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~");
/*     */     } 
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
/* 189 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 192 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 195 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 196 */     subTrama_SE.generaSubTrama(canTxSE, inConMed.getNuControlST());
/* 197 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 200 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 201 */     subTrama_GE.generaSubTrama(inConMed.getNuControl());
/* 202 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 205 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 206 */     subTrama_IEA.generaSubTrama(inConMed.getIdCorrelativo());
/* 207 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 214 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 218 */     String[] arrayCadena = sReturn.split("\\~");
/* 219 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 220 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConMed271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */