/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DMG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConNom271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InConNom271 inConNom) {
/*  24 */     String sReturn = "", sReturn01 = "";
/*  25 */     inConNom.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  26 */     inConNom.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  28 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  29 */     subTrama_ISA.generaSubTrama(inConNom.getIdRemitente(), inConNom.getIdReceptor(), inConNom.getFeTransaccion(), inConNom.getHoTransaccion(), inConNom.getIdCorrelativo());
/*  30 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  33 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  34 */     subTrama_GS.generaSubTrama("HB", inConNom.getIdRemitente(), inConNom.getIdReceptor(), inConNom.getFeTransaccion(), inConNom.getHoTransaccion(), inConNom.getNuControl());
/*  35 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  39 */     subTrama_ST.generaSubTrama(inConNom.getIdTransaccion(), inConNom.getNuControlST(), "");
/*  40 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  43 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  44 */     subTrama_BHT.generaSubTrama("0022", inConNom.getTiFinalidad());
/*  45 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  48 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  49 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  50 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  53 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  54 */     subTrama_NM1.generaSubTrama("PR", inConNom.getCaRemitente(), "PI", inConNom.getIdRemitente());
/*  55 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  58 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  59 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  60 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  63 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  64 */     subTrama_NM11.generaSubTrama("1P", inConNom.getCaReceptor(), "FI", inConNom.getNuRucReceptor());
/*  65 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  68 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  69 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/*  70 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  73 */     String sDetalle = "";
/*  74 */     for (int i = 0; i < inConNom.getDetalles().size(); i++) {
/*     */       
/*  76 */       SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  77 */       subTrama_NM12.generaSubTrama("IL", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCaPaciente(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getApPaternoPaciente(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNoPaciente(), "MI", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoAfPaciente(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getApMaternoPaciente());
/*  78 */       subTrama_NM12.completaLongitud();
/*     */ 
/*     */       
/*  81 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  82 */       subTrama_REF1.generaSubTrama("ACC", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoEsPaciente());
/*  83 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/*  86 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  87 */       subTrama_REF2.generaSubTrama("DD", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getTiDoPaciente());
/*  88 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/*  91 */       SubTrama_REF4 subTrama_REF24 = new SubTrama_REF4();
/*  92 */       subTrama_REF24.generaSubTrama("4A", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNuDoPaciente());
/*  93 */       subTrama_REF24.completaLongitud();
/*     */ 
/*     */       
/*  96 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/*  97 */       subTrama_REF3.generaSubTrama("CT", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNuContratoPaciente());
/*  98 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 101 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 102 */       subTrama_REF4.generaSubTrama("PRT", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoProducto(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoDescripcion());
/* 103 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 106 */       SubTrama_REF4 subTrama_REF44 = new SubTrama_REF4();
/* 107 */       subTrama_REF44.generaSubTrama("ZZ", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNuSCTR());
/* 108 */       subTrama_REF44.completaLongitud();
/*     */ 
/*     */       
/* 111 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 112 */       subTrama_REF5.generaSubTrama("ZZ", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoParentesco());
/* 113 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 116 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 117 */       subTrama_REF6.generaSubTrama("18", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNuPlan());
/* 118 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 121 */       SubTrama_DMG subTrama_DMG = new SubTrama_DMG();
/* 122 */       subTrama_DMG.generaSubTrama("D8", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getFeNacimiento(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getGenero(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getEsMarital(), "");
/* 123 */       subTrama_DMG.completaLongitud();
/*     */ 
/*     */       
/* 126 */       SubTrama_NM1 subTrama_NM22 = new SubTrama_NM1();
/* 127 */       subTrama_NM22.generaSubTrama("P5", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getTiCaContratante(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNoPaContratante(), ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNoContratante(), "", "", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getNoMaContratante());
/* 128 */       subTrama_NM22.completaLongitud();
/*     */ 
/*     */       
/* 131 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 132 */       subTrama_REF7.generaSubTrama("DD", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getTiDoContratante());
/* 133 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 136 */       SubTrama_REF4 subTrama_REF7_4 = new SubTrama_REF4();
/* 137 */       subTrama_REF7_4.generaSubTrama("XX5", ((InConNom271Detalle)inConNom.getDetalles().get(i)).getCoReContratante());
/* 138 */       subTrama_REF7_4.completaLongitud();
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
/* 150 */       sDetalle = sDetalle + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF24.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "*" + subTrama_REF44.returnComoString("", ":", "~")) + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_DMG.returnComoString("DMG*", "*", "~") + subTrama_NM22.returnComoString("NM1*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "*" + subTrama_REF7_4.returnComoString("", ":", "~"));
/*     */     } 
/*     */ 
/*     */     
/* 154 */     if (inConNom.getDetalles().isEmpty()) {
/*     */       
/* 156 */       SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/* 157 */       subTrama_NM12.generaSubTrama("IL", "", "", "", "MI", "", "");
/* 158 */       subTrama_NM12.completaLongitud();
/*     */ 
/*     */       
/* 161 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 162 */       subTrama_REF1.generaSubTrama("ACC", "");
/* 163 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 166 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 167 */       subTrama_REF2.generaSubTrama("DD", "");
/* 168 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 171 */       SubTrama_REF4 subTrama_REF24 = new SubTrama_REF4();
/* 172 */       subTrama_REF24.generaSubTrama("4A", "");
/* 173 */       subTrama_REF24.completaLongitud();
/*     */ 
/*     */       
/* 176 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 177 */       subTrama_REF3.generaSubTrama("CT", "");
/* 178 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 181 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 182 */       subTrama_REF4.generaSubTrama("PRT", "", "");
/* 183 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 186 */       SubTrama_REF4 subTrama_REF44 = new SubTrama_REF4();
/* 187 */       subTrama_REF44.generaSubTrama("ZZ", "");
/* 188 */       subTrama_REF44.completaLongitud();
/*     */ 
/*     */       
/* 191 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 192 */       subTrama_REF5.generaSubTrama("ZZ", "");
/* 193 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 196 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 197 */       subTrama_REF6.generaSubTrama("18", "");
/* 198 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 201 */       SubTrama_DMG subTrama_DMG = new SubTrama_DMG();
/* 202 */       subTrama_DMG.generaSubTrama("D8", "", "", "", "");
/* 203 */       subTrama_DMG.completaLongitud();
/*     */ 
/*     */       
/* 206 */       SubTrama_NM1 subTrama_NM22 = new SubTrama_NM1();
/* 207 */       subTrama_NM22.generaSubTrama("P5", "", "", "", "", "", "");
/* 208 */       subTrama_NM22.completaLongitud();
/*     */ 
/*     */       
/* 211 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 212 */       subTrama_REF7.generaSubTrama("DD", "");
/* 213 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 216 */       SubTrama_REF4 subTrama_REF7_4 = new SubTrama_REF4();
/* 217 */       subTrama_REF7_4.generaSubTrama("XX5", "");
/* 218 */       subTrama_REF7_4.completaLongitud();
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
/* 230 */       sDetalle = sDetalle + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF24.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "*" + subTrama_REF44.returnComoString("", ":", "~")) + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_DMG.returnComoString("DMG*", "*", "~") + subTrama_NM22.returnComoString("NM1*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "*" + subTrama_REF7_4.returnComoString("", ":", "~"));
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
/*     */     
/* 243 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 246 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 251 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 252 */     subTrama_SE.generaSubTrama(canTxSE, inConNom.getNuControlST());
/* 253 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 256 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 257 */     subTrama_GE.generaSubTrama(inConNom.getNuControl());
/* 258 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 261 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 262 */     subTrama_IEA.generaSubTrama(inConNom.getIdCorrelativo());
/* 263 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 269 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 270 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 274 */     String[] arrayCadena = sReturn.split("\\~");
/* 275 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 276 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConNom271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */