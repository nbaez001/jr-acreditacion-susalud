/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DMG;
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
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConCod271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InConCod271 inConCod) {
/*  29 */     String sReturn = "", sReturn01 = "";
/*  30 */     inConCod.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  31 */     inConCod.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
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
/*  54 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  55 */     subTrama_ISA.generaSubTrama(inConCod.getIdRemitente(), inConCod.getIdReceptor(), inConCod.getFeTransaccion(), inConCod.getHoTransaccion(), inConCod.getIdCorrelativo());
/*  56 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  59 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  60 */     subTrama_GS.generaSubTrama("HB", inConCod.getIdRemitente(), inConCod.getIdReceptor(), inConCod.getFeTransaccion(), inConCod.getHoTransaccion(), inConCod.getNuControl());
/*  61 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  64 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  65 */     subTrama_ST.generaSubTrama(inConCod.getIdTransaccion(), inConCod.getNuControlST(), "");
/*  66 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  69 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  70 */     subTrama_BHT.generaSubTrama("0022", inConCod.getTiFinalidad());
/*  71 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  74 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  75 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  76 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  79 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  80 */     subTrama_NM1.generaSubTrama("PR", inConCod.getCaRemitente(), "PI", inConCod.getIdRemitente());
/*  81 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  84 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  85 */     subTrama_REF1.generaSubTrama("OL", inConCod.getUserRemitente());
/*  86 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  89 */     SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/*  90 */     subTrama_REF1_4.generaSubTrama("Y8", inConCod.getPassRemitente());
/*  91 */     subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 100 */     subTrama_DTP1.generaSubTrama("163", "D8", inConCod.getFeUpFoto());
/* 101 */     subTrama_DTP1.completaLongitud();
/*     */ 
/*     */     
/* 104 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/* 105 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/* 106 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/* 109 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/* 110 */     subTrama_NM11.generaSubTrama("1P", inConCod.getCaReceptor(), "FI", inConCod.getNuRucReceptor());
/* 111 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/* 114 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/* 115 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/* 116 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/* 119 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/* 120 */     subTrama_NM12.generaSubTrama("3", inConCod.getCaPaciente(), inConCod.getApPaternoPaciente(), inConCod.getNoPaciente(), "MI", inConCod.getCoAfPaciente(), inConCod.getApMaternoPaciente());
/* 121 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/* 124 */     SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 125 */     subTrama_REF2.generaSubTrama("ACC", inConCod.getCoEsPaciente());
/* 126 */     subTrama_REF2.completaLongitud();
/*     */ 
/*     */     
/* 129 */     SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 130 */     subTrama_REF3.generaSubTrama("DD", inConCod.getTiDoPaciente());
/* 131 */     subTrama_REF3.completaLongitud();
/*     */ 
/*     */     
/* 134 */     SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 135 */     subTrama_REF3_4.generaSubTrama("4A", inConCod.getNuDoPaciente());
/* 136 */     subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */     
/* 139 */     SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 140 */     subTrama_REF4.generaSubTrama("EI", inConCod.getNuIdenPaciente());
/* 141 */     subTrama_REF4.completaLongitud();
/*     */     
/* 143 */     String sDetalle = "";
/*     */     
/* 145 */     SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 146 */     subTrama_REF5.generaSubTrama("CT", inConCod.getNuContratoPaciente());
/* 147 */     subTrama_REF5.completaLongitud();
/*     */ 
/*     */     
/* 150 */     SubTrama_REF4 subTrama_REF5_4 = new SubTrama_REF4();
/* 151 */     subTrama_REF5_4.generaSubTrama("AZ", inConCod.getNuPoliza(), "ID", inConCod.getNuCertificado(), "TY", inConCod.getCoTiPoliza());
/* 152 */     subTrama_REF5_4.completaLongitud();
/*     */ 
/*     */     
/* 155 */     SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 156 */     subTrama_REF6.generaSubTrama("PRT", inConCod.getCoProducto(), inConCod.getDeProducto());
/* 157 */     subTrama_REF6.completaLongitud();
/*     */ 
/*     */     
/* 160 */     SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 161 */     subTrama_REF7.generaSubTrama("18", inConCod.getNuPlan());
/* 162 */     subTrama_REF7.completaLongitud();
/*     */ 
/*     */     
/* 165 */     SubTrama_REF4 subTrama_REF7_4 = new SubTrama_REF4();
/* 166 */     subTrama_REF7_4.generaSubTrama("IMP", inConCod.getTiPlanSalud(), "ZZ", inConCod.getCoMoneda(), "", "");
/* 167 */     subTrama_REF7_4.completaLongitud();
/*     */ 
/*     */     
/* 170 */     SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 171 */     subTrama_REF8.generaSubTrama("ZZ", inConCod.getCoParentesco());
/* 172 */     subTrama_REF8.completaLongitud();
/*     */ 
/*     */     
/* 175 */     SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 176 */     subTrama_REF9.generaSubTrama("ZZ", inConCod.getSoBeneficio());
/* 177 */     subTrama_REF9.completaLongitud();
/*     */ 
/*     */     
/* 180 */     SubTrama_REF4 subTrama_REF9_4 = new SubTrama_REF4();
/* 181 */     subTrama_REF9_4.generaSubTrama("3B", inConCod.getNuSoBeneficio());
/* 182 */     subTrama_REF9_4.completaLongitud();
/*     */ 
/*     */     
/* 185 */     SubTrama_DMG subTrama_DMG = new SubTrama_DMG();
/* 186 */     subTrama_DMG.generaSubTrama("D8", inConCod.getFeNacimiento(), inConCod.getGenero(), inConCod.getEsMarital(), "");
/* 187 */     subTrama_DMG.completaLongitud();
/*     */ 
/*     */     
/* 190 */     SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 191 */     subTrama_DTP2.generaSubTrama("356", "D8", inConCod.getFeIniVigencia());
/* 192 */     subTrama_DTP2.completaLongitud();
/*     */ 
/*     */     
/* 195 */     SubTrama_DTP subTrama_DTP3 = new SubTrama_DTP();
/* 196 */     subTrama_DTP3.generaSubTrama("357", "D8", inConCod.getFeFinVigencia());
/* 197 */     subTrama_DTP3.completaLongitud();
/*     */ 
/*     */     
/* 200 */     SubTrama_NM1 subTrama_NM2 = new SubTrama_NM1();
/* 201 */     subTrama_NM2.generaSubTrama("P5", inConCod.getTiCaContratante(), inConCod.getNoPaContratante(), inConCod.getNoContratante(), "", "", inConCod.getNoMaContratante());
/* 202 */     subTrama_NM2.completaLongitud();
/*     */ 
/*     */     
/* 205 */     SubTrama_REF subTrama_REF10 = new SubTrama_REF();
/* 206 */     subTrama_REF10.generaSubTrama("DD", inConCod.getTiDoContratante());
/* 207 */     subTrama_REF10.completaLongitud();
/*     */ 
/*     */     
/* 210 */     SubTrama_REF4 subTrama_REF10_4 = new SubTrama_REF4();
/* 211 */     subTrama_REF10_4.generaSubTrama("XX5", inConCod.getCoReContratante());
/* 212 */     subTrama_REF10_4.completaLongitud();
/*     */ 
/*     */     
/* 215 */     SubTrama_NM1 subTrama_NM3 = new SubTrama_NM1();
/* 216 */     subTrama_NM3.generaSubTrama("C9", inConCod.getCaTitular(), inConCod.getNoPaTitular(), inConCod.getNoTitular(), "MI", inConCod.getCoAfTitular(), inConCod.getNoMaTitular());
/* 217 */     subTrama_NM3.completaLongitud();
/*     */ 
/*     */     
/* 220 */     SubTrama_REF subTrama_REF11 = new SubTrama_REF();
/* 221 */     subTrama_REF11.generaSubTrama("DD", inConCod.getTiDoTitular());
/* 222 */     subTrama_REF11.completaLongitud();
/*     */ 
/*     */     
/* 225 */     SubTrama_REF4 subTrama_REF11_4 = new SubTrama_REF4();
/* 226 */     subTrama_REF11_4.generaSubTrama("4A", inConCod.getNuDoTitular());
/* 227 */     subTrama_REF11_4.completaLongitud();
/*     */ 
/*     */     
/* 230 */     SubTrama_DTP subTrama_DTP4 = new SubTrama_DTP();
/* 231 */     subTrama_DTP4.generaSubTrama("382", "D8", inConCod.getFeInsTitular());
/* 232 */     subTrama_DTP4.completaLongitud();
/*     */ 
/*     */     
/* 235 */     for (int i = 0; i < inConCod.getDetalles().size(); i++) {
/*     */       
/* 237 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 238 */       subTrama_EB2.generaSubTrama(((InConCod271Detalle)inConCod.getDetalles().get(i)).getInfBeneficio(), "", "", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getNuCobertura(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getBeMaxInicial(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getMoCobertura(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoInRestriccion(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCanServicio());
/* 239 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 242 */       SubTrama_EB13 subTrama_EB2_13 = new SubTrama_EB13();
/* 243 */       subTrama_EB2_13.generaSubTrama("ZZ", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getIdProducto(), "");
/* 244 */       subTrama_EB2_13.completaLongitud();
/*     */ 
/*     */       
/* 247 */       SubTrama_REF subTrama_REF12 = new SubTrama_REF();
/* 248 */       subTrama_REF12.generaSubTrama("D7", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoTiCobertura());
/* 249 */       subTrama_REF12.completaLongitud();
/*     */ 
/*     */       
/* 252 */       SubTrama_REF4 subTrama_REF12_4 = new SubTrama_REF4();
/* 253 */       subTrama_REF12_4.generaSubTrama("ZZ", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoSubTiCobertura());
/* 254 */       subTrama_REF12_4.completaLongitud();
/*     */ 
/*     */       
/* 257 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 258 */       subTrama_MSG1.generaSubTrama(((InConCod271Detalle)inConCod.getDetalles().get(i)).getMsgObs());
/* 259 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 262 */       SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/* 263 */       subTrama_MSG2.generaSubTrama(((InConCod271Detalle)inConCod.getDetalles().get(i)).getMsgConEspeciales());
/* 264 */       subTrama_MSG2.completaLongitud();
/*     */ 
/*     */       
/* 267 */       SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 268 */       subTrama_EB3.generaSubTrama("C", "", "", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoTiMoneda(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoPagoFijo(), "", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoCalServicio(), ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCanCalServicio());
/* 269 */       subTrama_EB3.completaLongitud();
/*     */ 
/*     */       
/* 272 */       SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 273 */       subTrama_EB4.generaSubTrama("1", "", "", "", "", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getCoPagoVariable(), "", "");
/* 274 */       subTrama_EB4.completaLongitud();
/*     */ 
/*     */       
/* 277 */       SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 278 */       subTrama_EB5.generaSubTrama(((InConCod271Detalle)inConCod.getDetalles().get(i)).getFlagCaGarantia(), "", "", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getDeflagCaGarantia(), "", "", "", "");
/* 279 */       subTrama_EB5.completaLongitud();
/*     */ 
/*     */       
/* 282 */       SubTrama_DTP subTrama_DTP5 = new SubTrama_DTP();
/* 283 */       subTrama_DTP5.generaSubTrama("327", "D8", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getFeFinCarencia());
/* 284 */       subTrama_DTP5.completaLongitud();
/*     */ 
/*     */       
/* 287 */       SubTrama_DTP subTrama_DTP6 = new SubTrama_DTP();
/* 288 */       subTrama_DTP6.generaSubTrama("338", "D8", ((InConCod271Detalle)inConCod.getDetalles().get(i)).getFeFinEspera());
/* 289 */       subTrama_DTP6.completaLongitud();
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
/* 302 */       sDetalle = sDetalle + subTrama_EB2.returnComoString("EB*", "*", "*" + subTrama_EB2_13.returnComoString("", ":", "~")) + subTrama_REF12.returnComoString("REF*", "*", "*" + subTrama_REF12_4.returnComoString("", ":", "~")) + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~") + subTrama_DTP5.returnComoString("DTP*", "*", "~") + subTrama_DTP6.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */ 
/*     */     
/* 306 */     if (inConCod.getDetalles().isEmpty()) {
/*     */       
/* 308 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 309 */       subTrama_EB2.generaSubTrama("", "", "", "", "", "", "", "");
/* 310 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 313 */       SubTrama_EB13 subTrama_EB2_13 = new SubTrama_EB13();
/* 314 */       subTrama_EB2_13.generaSubTrama("ZZ", "", "");
/* 315 */       subTrama_EB2_13.completaLongitud();
/*     */ 
/*     */       
/* 318 */       SubTrama_REF subTrama_REF12 = new SubTrama_REF();
/* 319 */       subTrama_REF12.generaSubTrama("D7", "");
/* 320 */       subTrama_REF12.completaLongitud();
/*     */ 
/*     */       
/* 323 */       SubTrama_REF4 subTrama_REF12_4 = new SubTrama_REF4();
/* 324 */       subTrama_REF12_4.generaSubTrama("ZZ", "");
/* 325 */       subTrama_REF12_4.completaLongitud();
/*     */ 
/*     */       
/* 328 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 329 */       subTrama_MSG1.generaSubTrama("");
/* 330 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 333 */       SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/* 334 */       subTrama_MSG2.generaSubTrama("");
/* 335 */       subTrama_MSG2.completaLongitud();
/*     */ 
/*     */       
/* 338 */       SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 339 */       subTrama_EB3.generaSubTrama("C", "", "", "", "", "", "", "");
/* 340 */       subTrama_EB3.completaLongitud();
/*     */ 
/*     */       
/* 343 */       SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 344 */       subTrama_EB4.generaSubTrama("1", "", "", "", "", "", "", "");
/* 345 */       subTrama_EB4.completaLongitud();
/*     */ 
/*     */       
/* 348 */       SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 349 */       subTrama_EB5.generaSubTrama("", "", "", "", "", "", "", "");
/* 350 */       subTrama_EB5.completaLongitud();
/*     */ 
/*     */       
/* 353 */       SubTrama_DTP subTrama_DTP5 = new SubTrama_DTP();
/* 354 */       subTrama_DTP5.generaSubTrama("327", "D8", "");
/* 355 */       subTrama_DTP5.completaLongitud();
/*     */ 
/*     */       
/* 358 */       SubTrama_DTP subTrama_DTP6 = new SubTrama_DTP();
/* 359 */       subTrama_DTP6.generaSubTrama("338", "D8", "");
/* 360 */       subTrama_DTP6.completaLongitud();
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
/* 373 */       sDetalle = sDetalle + subTrama_EB2.returnComoString("EB*", "*", "*" + subTrama_EB2_13.returnComoString("", ":", "~")) + subTrama_REF12.returnComoString("REF*", "*", "*" + subTrama_REF12_4.returnComoString("", ":", "~")) + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~") + subTrama_DTP5.returnComoString("DTP*", "*", "~") + subTrama_DTP6.returnComoString("DTP*", "*", "~");
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
/* 404 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "*" + subTrama_REF5_4.returnComoString("", ":", "~")) + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "*" + subTrama_REF7_4.returnComoString("", ":", "~")) + subTrama_REF8.returnComoString("REF*", "*", "~") + subTrama_REF9.returnComoString("REF*", "*", "*" + subTrama_REF9_4.returnComoString("", ":", "~")) + subTrama_DMG.returnComoString("DMG*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~") + subTrama_DTP3.returnComoString("DTP*", "*", "~") + subTrama_NM2.returnComoString("NM1*", "*", "~") + subTrama_REF10.returnComoString("REF*", "*", "*" + subTrama_REF10_4.returnComoString("", ":", "~")) + subTrama_NM3.returnComoString("NM1*", "*", "~") + subTrama_REF11.returnComoString("REF*", "*", "*" + subTrama_REF11_4.returnComoString("", ":", "~")) + subTrama_DTP4.returnComoString("DTP*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 407 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 410 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 411 */     subTrama_SE.generaSubTrama(canTxSE, inConCod.getNuControlST());
/* 412 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 415 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 416 */     subTrama_GE.generaSubTrama(inConCod.getNuControl());
/* 417 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 420 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 421 */     subTrama_IEA.generaSubTrama(inConCod.getIdCorrelativo());
/* 422 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 428 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 429 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 433 */     String[] arrayCadena = sReturn.split("\\~");
/* 434 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 435 */     return longArray.toString();
/*     */   }
/*     */   
/*     */   private static String cargarDMG(String[][] arrayDMG, int i) {
/* 439 */     String valFeNacimiento = null, valGenero = null, valEsMarital = null;
/*     */     
/* 441 */     int fila = 0;
/*     */     
/* 443 */     for (fila = 0; fila < 3; fila++) {
/* 444 */       if (fila == 0) {
/* 445 */         valFeNacimiento = arrayDMG[i][fila];
/* 446 */       } else if (fila == 1) {
/* 447 */         valGenero = arrayDMG[i][fila];
/* 448 */       } else if (fila == 2) {
/* 449 */         valEsMarital = arrayDMG[i][fila];
/*     */       } 
/*     */     } 
/* 452 */     String cadDMG = "DMG*D8 *" + valFeNacimiento.trim() + "                           *" + valGenero + "*" + valEsMarital + "*                    *  *   ~";
/* 453 */     return cadDMG;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConCod271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */