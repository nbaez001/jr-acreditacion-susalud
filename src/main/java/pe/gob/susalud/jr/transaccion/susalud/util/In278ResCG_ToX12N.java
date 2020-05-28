/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCGDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_INS;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In278ResCG_ToX12N
/*     */ {
/*     */   public static String traducirEstructura278Res(In278ResCG in278ResCG) {
/*  31 */     String sReturn = "", sReturn01 = "";
/*  32 */     in278ResCG.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  33 */     in278ResCG.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  36 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  37 */     subTrama_ISA.generaSubTrama(in278ResCG.getIdRemitente(), in278ResCG.getIdReceptor(), in278ResCG
/*  38 */         .getFeTransaccion(), in278ResCG.getHoTransaccion(), in278ResCG
/*  39 */         .getIdCorrelativo());
/*  40 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  43 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  44 */     subTrama_GS.generaSubTrama("HI", in278ResCG.getIdRemitente(), in278ResCG.getIdReceptor(), in278ResCG
/*  45 */         .getFeTransaccion(), in278ResCG.getHoTransaccion(), in278ResCG
/*  46 */         .getNuControl());
/*  47 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  50 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  51 */     subTrama_ST.generaSubTrama(in278ResCG.getIdTransaccion(), in278ResCG.getNuControlST(), "");
/*  52 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  55 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  56 */     subTrama_BHT.generaSubTrama("0022", in278ResCG.getTiFinalidad());
/*  57 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  60 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  61 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  62 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  65 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  66 */     subTrama_NM11.generaSubTrama("PR", in278ResCG.getCaRemitente(), "PI", in278ResCG.getIdRemitente());
/*  67 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  70 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  71 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  72 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  75 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  76 */     subTrama_NM12.generaSubTrama("1P", in278ResCG.getCaReceptor(), "SV", in278ResCG.getNuRucReceptor());
/*  77 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  80 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  81 */     subTrama_HL3.generaSubTrama("3", "2", "22", "0");
/*  82 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */ 
/*     */     
/*  86 */     String sDetalle = "";
/*  87 */     for (int i = 0; i < in278ResCG.getDetalles().size(); i++) {
/*     */       
/*  89 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  90 */       subTrama_NM13.generaSubTrama("IL", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCaPaciente(), ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getApPaternoPaciente(), ((In278ResCGDetalle)in278ResCG
/*  91 */           .getDetalles().get(i)).getNoPaciente(), "MI", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoAfPaciente(), ((In278ResCGDetalle)in278ResCG
/*  92 */           .getDetalles().get(i)).getApMaternoPaciente());
/*  93 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/*  96 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  97 */       subTrama_REF1.generaSubTrama("DD", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoTiDoPaciente());
/*  98 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 101 */       SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/* 102 */       subTrama_REF1_4.generaSubTrama("4A", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuDoPaciente());
/* 103 */       subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 111 */       SubTrama_INS subTrama_INS1 = new SubTrama_INS();
/* 112 */       subTrama_INS1.generaSubTrama("Y", "F7", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getMonPago());
/* 113 */       subTrama_INS1.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 121 */       SubTrama_NM1 subTrama_NM1_4 = new SubTrama_NM1();
/* 122 */       subTrama_NM1_4.generaSubTrama("P5", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiCaContratante(), ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoPaContratante(), ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoContratante(), "", "", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoMaContratante());
/* 123 */       subTrama_NM1_4.completaLongitud();
/*     */ 
/*     */       
/* 126 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 127 */       subTrama_REF2.generaSubTrama("DD", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiDoContratante());
/* 128 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 131 */       SubTrama_REF4 subTrama_REF2_4 = new SubTrama_REF4();
/* 132 */       subTrama_REF2_4.generaSubTrama(((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getIdCaReContratante(), ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuCaReContratante());
/* 133 */       subTrama_REF2_4.completaLongitud();
/*     */ 
/*     */       
/* 136 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 137 */       subTrama_REF3.generaSubTrama("5F", "", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getDeCarGarantia());
/* 138 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 141 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 142 */       subTrama_REF3_4.generaSubTrama("ZZ", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuSoCarGarantia());
/* 143 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 146 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 147 */       subTrama_REF4.generaSubTrama("BB", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuCarGarantia());
/* 148 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 151 */       SubTrama_REF4 subTrama_REF4_4 = new SubTrama_REF4();
/* 152 */       subTrama_REF4_4.generaSubTrama("ZZ", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getVeCarGarantia());
/* 153 */       subTrama_REF4_4.completaLongitud();
/*     */ 
/*     */       
/* 156 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 157 */       subTrama_REF5.generaSubTrama("ACC", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getEsCarGarantia());
/* 158 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 161 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 162 */       subTrama_REF6.generaSubTrama("OZ", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoProducto());
/* 163 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 166 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 167 */       subTrama_REF7.generaSubTrama("ZZ", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoProcedimiento(), ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getDeProcedimiento());
/* 168 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 171 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 172 */       subTrama_REF8.generaSubTrama("18", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuPlan());
/* 173 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 176 */       SubTrama_REF4 subTrama_REF8_4 = new SubTrama_REF4();
/* 177 */       subTrama_REF8_4.generaSubTrama("IMP", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiPlanSalud(), "ZZ", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoMoneda(), "", "");
/* 178 */       subTrama_REF8_4.completaLongitud();
/*     */ 
/*     */       
/* 181 */       SubTrama_DTP subTrama_DTP6 = new SubTrama_DTP();
/* 182 */       subTrama_DTP6.generaSubTrama("447", "DT", ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getFeCarGarantia());
/* 183 */       subTrama_DTP6.completaLongitud();
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
/* 198 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_INS1.returnComoString("INS*", "*", "~") + subTrama_NM1_4.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF2_4.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "*" + subTrama_REF4_4.returnComoString("", ":", "~")) + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "*" + subTrama_REF8_4.returnComoString("", ":", "~")) + subTrama_DTP6.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */     
/* 201 */     if (in278ResCG.getDetalles().isEmpty()) {
/*     */       
/* 203 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/* 204 */       subTrama_NM13.generaSubTrama("IL", "", "", "", "MI", "", "");
/* 205 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/* 208 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 209 */       subTrama_REF1.generaSubTrama("DD", "");
/* 210 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 213 */       SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/* 214 */       subTrama_REF1_4.generaSubTrama("4A", "");
/* 215 */       subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */       
/* 218 */       SubTrama_INS subTrama_INS1 = new SubTrama_INS();
/* 219 */       subTrama_INS1.generaSubTrama("Y", "F7", "");
/* 220 */       subTrama_INS1.completaLongitud();
/*     */ 
/*     */       
/* 223 */       SubTrama_NM1 subTrama_NM1_4 = new SubTrama_NM1();
/* 224 */       subTrama_NM1_4.generaSubTrama("P5", "", "", "", "", "", "");
/* 225 */       subTrama_NM1_4.completaLongitud();
/* 226 */       subTrama_NM1_4.imprimecampos();
/*     */       
/* 228 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 229 */       subTrama_REF2.generaSubTrama("DD", "");
/* 230 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 233 */       SubTrama_REF4 subTrama_REF2_4 = new SubTrama_REF4();
/* 234 */       subTrama_REF2_4.generaSubTrama("", "");
/* 235 */       subTrama_REF2_4.completaLongitud();
/*     */ 
/*     */       
/* 238 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 239 */       subTrama_REF3.generaSubTrama("5F", "", "");
/* 240 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 243 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 244 */       subTrama_REF3_4.generaSubTrama("ZZ", "");
/* 245 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 248 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 249 */       subTrama_REF4.generaSubTrama("BB", "");
/* 250 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 253 */       SubTrama_REF4 subTrama_REF4_4 = new SubTrama_REF4();
/* 254 */       subTrama_REF4_4.generaSubTrama("ZZ", "");
/* 255 */       subTrama_REF4_4.completaLongitud();
/*     */ 
/*     */       
/* 258 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 259 */       subTrama_REF5.generaSubTrama("ACC", "");
/* 260 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 263 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 264 */       subTrama_REF6.generaSubTrama("OZ", "");
/* 265 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 268 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 269 */       subTrama_REF7.generaSubTrama("ZZ", "", "");
/* 270 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 273 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 274 */       subTrama_REF8.generaSubTrama("18", "");
/* 275 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 278 */       SubTrama_REF4 subTrama_REF8_4 = new SubTrama_REF4();
/* 279 */       subTrama_REF8_4.generaSubTrama("IMP", "", "ZZ", "", "", "");
/* 280 */       subTrama_REF8_4.completaLongitud();
/*     */ 
/*     */       
/* 283 */       SubTrama_DTP subTrama_DTP6 = new SubTrama_DTP();
/* 284 */       subTrama_DTP6.generaSubTrama("447", "DT", "");
/* 285 */       subTrama_DTP6.completaLongitud();
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
/* 300 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_INS1.returnComoString("INS*", "*", "~") + subTrama_NM1_4.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF2_4.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "*" + subTrama_REF4_4.returnComoString("", ":", "~")) + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "*" + subTrama_REF8_4.returnComoString("", ":", "~")) + subTrama_DTP6.returnComoString("DTP*", "*", "~");
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
/* 311 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + sDetalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 317 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 320 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 321 */     subTrama_SE.generaSubTrama(canTxSE, in278ResCG.getNuControlST());
/* 322 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 325 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 326 */     subTrama_GE.generaSubTrama(in278ResCG.getNuControl());
/* 327 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 330 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 331 */     subTrama_IEA.generaSubTrama(in278ResCG.getIdCorrelativo());
/* 332 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 338 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 339 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 343 */     String[] arrayCadena = sReturn.split("\\~");
/* 344 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 345 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In278ResCG_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */