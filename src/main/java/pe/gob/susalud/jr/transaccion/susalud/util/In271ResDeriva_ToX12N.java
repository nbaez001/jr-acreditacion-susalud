/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDerivaDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
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
/*     */ 
/*     */ 
/*     */ public class In271ResDeriva_ToX12N
/*     */ {
/*     */   public static String traducirEstructura278ResDeriva(In271ResDeriva in271ResDeriva) {
/*  26 */     String sReturn = "", sReturn01 = "";
/*  27 */     in271ResDeriva.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  28 */     in271ResDeriva.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  31 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  32 */     subTrama_ISA.generaSubTrama(in271ResDeriva.getIdRemitente(), in271ResDeriva.getIdReceptor(), in271ResDeriva
/*  33 */         .getFeTransaccion(), in271ResDeriva.getHoTransaccion(), in271ResDeriva
/*  34 */         .getIdCorrelativo());
/*  35 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  39 */     subTrama_GS.generaSubTrama("HI", in271ResDeriva.getIdRemitente(), in271ResDeriva.getIdReceptor(), in271ResDeriva
/*  40 */         .getFeTransaccion(), in271ResDeriva.getHoTransaccion(), in271ResDeriva
/*  41 */         .getNuControl());
/*  42 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  45 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  46 */     subTrama_ST.generaSubTrama(in271ResDeriva.getIdTransaccion(), in271ResDeriva.getNuControlST(), "");
/*  47 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  50 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  51 */     subTrama_BHT.generaSubTrama("0022", in271ResDeriva.getTiFinalidad());
/*  52 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  55 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  56 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  57 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  60 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  61 */     subTrama_NM11.generaSubTrama("PR", in271ResDeriva.getCaRemitente(), "PI", in271ResDeriva.getIdRemitente());
/*  62 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  65 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  66 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  67 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  70 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  71 */     subTrama_NM12.generaSubTrama("1P", in271ResDeriva.getCaReceptor(), "SV", in271ResDeriva.getNuRucReceptor());
/*  72 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  75 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  76 */     subTrama_HL3.generaSubTrama("3", "2", "22", "0");
/*  77 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  80 */     String sDetalle = "";
/*  81 */     for (int i = 0; i < in271ResDeriva.getDetalles().size(); i++) {
/*     */       
/*  83 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  84 */       subTrama_NM13.generaSubTrama("IL", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCaPaciente(), ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getApPaternoPaciente(), ((In271ResDerivaDetalle)in271ResDeriva
/*  85 */           .getDetalles().get(i)).getNoPaciente(), "MI", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoAfPaciente(), ((In271ResDerivaDetalle)in271ResDeriva
/*  86 */           .getDetalles().get(i)).getApMaternoPaciente());
/*  87 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/*  90 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  91 */       subTrama_REF1.generaSubTrama("DD", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiDoPaciente());
/*  92 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/*  95 */       SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/*  96 */       subTrama_REF1_4.generaSubTrama("4A", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuDoPaciente());
/*  97 */       subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */       
/* 100 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 101 */       subTrama_REF2.generaSubTrama("ZZ", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoParentesco());
/* 102 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 105 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 106 */       subTrama_REF3.generaSubTrama("DD", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTiDoTrabajoAfiliado());
/* 107 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 110 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 111 */       subTrama_REF3_4.generaSubTrama("XX5", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuDoTrabajoAfiliado());
/* 112 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 115 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 116 */       subTrama_REF4.generaSubTrama("BB", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuAtencion(), ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTeMsgLibre1());
/* 117 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 120 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 121 */       subTrama_REF5.generaSubTrama("PRT", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiProducto(), ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getDeProducto());
/* 122 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */ 
/*     */       
/* 126 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 127 */       subTrama_REF6.generaSubTrama("D7", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiCobertura());
/* 128 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 131 */       SubTrama_REF4 subTrama_REF6_4 = new SubTrama_REF4();
/* 132 */       subTrama_REF6_4.generaSubTrama("ZZ", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoSubTiCobertura());
/* 133 */       subTrama_REF6_4.completaLongitud();
/*     */ 
/*     */ 
/*     */       
/* 137 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 138 */       subTrama_DTP1.generaSubTrama("382", "D8", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getFeAtSalud());
/* 139 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 142 */       SubTrama_NM1 subTrama_NM1_4 = new SubTrama_NM1();
/* 143 */       subTrama_NM1_4.generaSubTrama("C9", "2", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNoLuAtencion(), "", "MI", "", "");
/* 144 */       subTrama_NM1_4.completaLongitud();
/*     */ 
/*     */       
/* 147 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 148 */       subTrama_REF7.generaSubTrama("EI", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoLuAtencion(), "");
/* 149 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 152 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 153 */       subTrama_REF8.generaSubTrama("DD", ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTiDoContratante());
/* 154 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 157 */       SubTrama_REF4 subTrama_REF8_4 = new SubTrama_REF4();
/* 158 */       subTrama_REF8_4.generaSubTrama(((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getIdCaReferencia(), ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getReIdContratante());
/* 159 */       subTrama_REF8_4.completaLongitud();
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
/* 173 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "*" + subTrama_REF6_4.returnComoString("", ":", "~")) + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_NM1_4.returnComoString("NM1*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "*" + subTrama_REF8_4.returnComoString("", ":", "~"));
/*     */     } 
/*     */     
/* 176 */     if (in271ResDeriva.getDetalles().isEmpty()) {
/*     */       
/* 178 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/* 179 */       subTrama_NM13.generaSubTrama("IL", "", "", "", "MI", "", "");
/* 180 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/* 183 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 184 */       subTrama_REF1.generaSubTrama("DD", "");
/* 185 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 188 */       SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/* 189 */       subTrama_REF1_4.generaSubTrama("4A", "");
/* 190 */       subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */       
/* 193 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 194 */       subTrama_REF2.generaSubTrama("ZZ", "");
/* 195 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 198 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 199 */       subTrama_REF3.generaSubTrama("DD", "");
/* 200 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 203 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 204 */       subTrama_REF3_4.generaSubTrama("4A", "");
/* 205 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 208 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 209 */       subTrama_REF4.generaSubTrama("BB", "", "");
/* 210 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 213 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 214 */       subTrama_REF5.generaSubTrama("PRT", "", "");
/* 215 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 218 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 219 */       subTrama_REF6.generaSubTrama("D7", "");
/* 220 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 223 */       SubTrama_REF4 subTrama_REF6_4 = new SubTrama_REF4();
/* 224 */       subTrama_REF6_4.generaSubTrama("ZZ", "");
/* 225 */       subTrama_REF6_4.completaLongitud();
/*     */ 
/*     */       
/* 228 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 229 */       subTrama_DTP1.generaSubTrama("382", "D8", "");
/* 230 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 233 */       SubTrama_NM1 subTrama_NM1_4 = new SubTrama_NM1();
/* 234 */       subTrama_NM1_4.generaSubTrama("C9", "2", "", "", "MI", "", "");
/* 235 */       subTrama_NM1_4.completaLongitud();
/*     */ 
/*     */       
/* 238 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 239 */       subTrama_REF7.generaSubTrama("EI", "", "");
/* 240 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 243 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 244 */       subTrama_REF8.generaSubTrama("DD", "");
/* 245 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 248 */       SubTrama_REF4 subTrama_REF8_4 = new SubTrama_REF4();
/* 249 */       subTrama_REF8_4.generaSubTrama("", "");
/* 250 */       subTrama_REF8_4.completaLongitud();
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
/* 264 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "*" + subTrama_REF6_4.returnComoString("", ":", "~")) + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_NM1_4.returnComoString("NM1*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "*" + subTrama_REF8_4.returnComoString("", ":", "~"));
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
/* 275 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 278 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */ 
/*     */     
/* 282 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 283 */     subTrama_SE.generaSubTrama(canTxSE, in271ResDeriva.getNuControlST());
/* 284 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 287 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 288 */     subTrama_GE.generaSubTrama(in271ResDeriva.getNuControl());
/* 289 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 292 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 293 */     subTrama_IEA.generaSubTrama(in271ResDeriva.getIdCorrelativo());
/* 294 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 300 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 301 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 305 */     String[] arrayCadena = sReturn.split("\\~");
/* 306 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 307 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ResDeriva_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */