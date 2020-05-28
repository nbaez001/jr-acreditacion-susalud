/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DMG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_N2;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_N4;
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
/*     */ public class RegAfi271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InRegAfi271 inRegafi) {
/*  28 */     String sReturn = "", sReturn01 = "";
/*  29 */     inRegafi.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  30 */     inRegafi.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  32 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  33 */     subTrama_ISA.generaSubTrama(inRegafi.getIdRemitente(), inRegafi.getIdReceptor(), inRegafi.getFeTransaccion(), inRegafi.getHoTransaccion(), inRegafi.getIdCorrelativo());
/*  34 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  37 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  38 */     subTrama_GS.generaSubTrama("HB", inRegafi.getIdRemitente(), inRegafi.getIdReceptor(), inRegafi.getFeTransaccion(), inRegafi.getHoTransaccion(), inRegafi.getNuControl());
/*  39 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  42 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  43 */     subTrama_ST.generaSubTrama(inRegafi.getIdTransaccion(), inRegafi.getNuControlST(), "");
/*  44 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  47 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  48 */     subTrama_BHT.generaSubTrama("0024", inRegafi.getTiFinalidad());
/*  49 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  52 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  53 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  54 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  57 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  58 */     subTrama_NM1.generaSubTrama("RGA", inRegafi.getCaRemitente(), inRegafi.getIdRemitente(), "", "", "", "");
/*  59 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  62 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  63 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  64 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  67 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  68 */     subTrama_NM12.generaSubTrama("PR", inRegafi.getCaReceptor(), "PI", inRegafi.getNuRucReceptor());
/*  69 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  72 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  73 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/*  74 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  77 */     String sDetalle = "";
/*  78 */     for (int i = 0; i < inRegafi.getDetalles().size(); i++) {
/*     */       
/*  80 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  81 */       subTrama_NM13.generaSubTrama("IL", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCaPaciente(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApPaternoPaciente(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNoPaciente(), "MI", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoPaciente(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApMaternoPaciente());
/*  82 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/*  85 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  86 */       subTrama_REF1.generaSubTrama("DD", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getTiDocumentoPaciente());
/*  87 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/*  90 */       SubTrama_REF4 subTrama_REF14 = new SubTrama_REF4();
/*  91 */       subTrama_REF14.generaSubTrama("4A", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNuDocumentoPaciente());
/*  92 */       subTrama_REF14.completaLongitud();
/*     */ 
/*     */       
/*  95 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  96 */       subTrama_REF2.generaSubTrama("CT", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoContratoPaciente());
/*  97 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 100 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 101 */       subTrama_REF3.generaSubTrama("ACC", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getEsPaciente());
/* 102 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 105 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 106 */       subTrama_REF4.generaSubTrama("BLT", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getTiRegimenPaciente());
/* 107 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 110 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 111 */       subTrama_REF5.generaSubTrama("6P", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getTiPlanPaciente());
/* 112 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 115 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 116 */       subTrama_REF6.generaSubTrama("OZ", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoProductoPaciente());
/* 117 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 120 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 121 */       subTrama_REF7.generaSubTrama("18", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoPlanPaciente());
/* 122 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 125 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 126 */       subTrama_REF8.generaSubTrama("C6", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNuCarnetPaciente());
/* 127 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 130 */       SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 131 */       subTrama_REF9.generaSubTrama("ACD", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoVinculoFamPaciente());
/* 132 */       subTrama_REF9.completaLongitud();
/*     */ 
/*     */       
/* 135 */       SubTrama_N2 subTrama_N2 = new SubTrama_N2();
/* 136 */       subTrama_N2.generaSubTrama(((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApCasadaPaciente());
/* 137 */       subTrama_N2.completaLongitud();
/*     */ 
/*     */       
/* 140 */       SubTrama_N4 subTrama_N4 = new SubTrama_N4();
/* 141 */       subTrama_N4.generaSubTrama("W", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getDeUbigeoPaciente());
/* 142 */       subTrama_N4.completaLongitud();
/*     */ 
/*     */       
/* 145 */       SubTrama_DMG subTrama_DMG = new SubTrama_DMG();
/* 146 */       subTrama_DMG.generaSubTrama("D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeNacePaciente(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getGePaciente(), "", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoPaisPaciente());
/* 147 */       subTrama_DMG.completaLongitud();
/*     */ 
/*     */       
/* 150 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 151 */       subTrama_DTP1.generaSubTrama("442", "D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeFallecidoPaciente());
/* 152 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 155 */       SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 156 */       subTrama_DTP2.generaSubTrama("276", "D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeIniAfiliaPaciente());
/* 157 */       subTrama_DTP2.completaLongitud();
/*     */ 
/*     */       
/* 160 */       SubTrama_DTP subTrama_DTP3 = new SubTrama_DTP();
/* 161 */       subTrama_DTP3.generaSubTrama("093", "D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeFinAfiliaPaciente());
/* 162 */       subTrama_DTP3.completaLongitud();
/*     */ 
/*     */       
/* 165 */       SubTrama_DTP subTrama_DTP4 = new SubTrama_DTP();
/* 166 */       subTrama_DTP4.generaSubTrama("349", "D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeFinAtencionPaciente());
/* 167 */       subTrama_DTP4.completaLongitud();
/*     */ 
/*     */       
/* 170 */       SubTrama_NM1 subTrama_NM22 = new SubTrama_NM1();
/* 171 */       subTrama_NM22.generaSubTrama("PR", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCaAseguradora(), "PI", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoAseguradora());
/* 172 */       subTrama_NM22.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 180 */       SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 181 */       subTrama_NM14.generaSubTrama("C9", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCaTitular(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApPaternoTitular(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNoTitular(), "MI", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoTitular(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApMaternoTitular());
/* 182 */       subTrama_NM14.completaLongitud();
/*     */ 
/*     */       
/* 185 */       SubTrama_REF subTrama_REF10 = new SubTrama_REF();
/* 186 */       subTrama_REF10.generaSubTrama("DD", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getTiDocumentoTitular());
/* 187 */       subTrama_REF10.completaLongitud();
/*     */ 
/*     */       
/* 190 */       SubTrama_REF4 subTrama_REF104 = new SubTrama_REF4();
/* 191 */       subTrama_REF104.generaSubTrama("A4", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNuDocumentoTitular());
/* 192 */       subTrama_REF104.completaLongitud();
/*     */ 
/*     */       
/* 195 */       SubTrama_REF subTrama_REF11 = new SubTrama_REF();
/* 196 */       subTrama_REF11.generaSubTrama("EI", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoEstablecimientoTitular());
/* 197 */       subTrama_REF11.completaLongitud();
/*     */ 
/*     */       
/* 200 */       SubTrama_DMG subTrama_DMG1 = new SubTrama_DMG();
/* 201 */       subTrama_DMG1.generaSubTrama("D8", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getFeFallecidoTitular(), "", "", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoPaisTitular());
/* 202 */       subTrama_DMG1.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 210 */       SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 211 */       subTrama_NM15.generaSubTrama("C9", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCaContratante(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApPaternoContratante(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNoContratante(), "", "", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getApMaternoContratante());
/* 212 */       subTrama_NM15.completaLongitud();
/*     */ 
/*     */       
/* 215 */       SubTrama_REF subTrama_REF12 = new SubTrama_REF();
/* 216 */       subTrama_REF12.generaSubTrama("DD", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getTiDocumentoContratante());
/* 217 */       subTrama_REF12.completaLongitud();
/*     */ 
/*     */       
/* 220 */       SubTrama_REF4 subTrama_REF124 = new SubTrama_REF4();
/* 221 */       subTrama_REF124.generaSubTrama(((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getIdReContratante(), ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getNuDocumentoContratante());
/* 222 */       subTrama_REF124.completaLongitud();
/*     */ 
/*     */       
/* 225 */       SubTrama_DMG subTrama_DMG2 = new SubTrama_DMG();
/* 226 */       subTrama_DMG2.generaSubTrama("", "", "", "", ((InRegAfi271Detalle)inRegafi.getDetalles().get(i)).getCoPaisContratante());
/* 227 */       subTrama_DMG2.completaLongitud();
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
/* 256 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF14.returnComoString("", ":", "~")) + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "~") + subTrama_REF9.returnComoString("REF*", "*", "~") + subTrama_N2.returnComoString("N2*", "*", "~") + subTrama_N4.returnComoString("N4*", "*", "~") + subTrama_DMG.returnComoString("DMG*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~") + subTrama_DTP3.returnComoString("DTP*", "*", "~") + subTrama_DTP4.returnComoString("DTP*", "*", "~") + subTrama_NM22.returnComoString("NM1*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF10.returnComoString("REF*", "*", "*" + subTrama_REF104.returnComoString("", ":", "~")) + subTrama_REF11.returnComoString("REF*", "*", "~") + subTrama_DMG1.returnComoString("DMG*", "*", "~") + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_REF12.returnComoString("REF*", "*", "*" + subTrama_REF124.returnComoString("", ":", "~")) + subTrama_DMG2.returnComoString("DMG*", "*", "~");
/*     */     } 
/*     */ 
/*     */     
/* 260 */     if (inRegafi.getDetalles().isEmpty()) {
/*     */       
/* 262 */       SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/* 263 */       subTrama_NM13.generaSubTrama("IL", "", "", "", "MI", "", "");
/* 264 */       subTrama_NM13.completaLongitud();
/*     */ 
/*     */       
/* 267 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 268 */       subTrama_REF1.generaSubTrama("DD", "");
/* 269 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 272 */       SubTrama_REF4 subTrama_REF14 = new SubTrama_REF4();
/* 273 */       subTrama_REF14.generaSubTrama("4A", "");
/* 274 */       subTrama_REF14.completaLongitud();
/*     */ 
/*     */       
/* 277 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 278 */       subTrama_REF2.generaSubTrama("CT", "");
/* 279 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 282 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 283 */       subTrama_REF3.generaSubTrama("ACC", "");
/* 284 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 287 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 288 */       subTrama_REF4.generaSubTrama("BLT", "");
/* 289 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 292 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 293 */       subTrama_REF5.generaSubTrama("6P", "");
/* 294 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 297 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 298 */       subTrama_REF6.generaSubTrama("OZ", "");
/* 299 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 302 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 303 */       subTrama_REF7.generaSubTrama("18", "");
/* 304 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 307 */       SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 308 */       subTrama_REF8.generaSubTrama("C6", "");
/* 309 */       subTrama_REF8.completaLongitud();
/*     */ 
/*     */       
/* 312 */       SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 313 */       subTrama_REF9.generaSubTrama("ACD", "");
/* 314 */       subTrama_REF9.completaLongitud();
/*     */ 
/*     */       
/* 317 */       SubTrama_N2 subTrama_N2 = new SubTrama_N2();
/* 318 */       subTrama_N2.generaSubTrama("");
/* 319 */       subTrama_N2.completaLongitud();
/*     */ 
/*     */       
/* 322 */       SubTrama_N4 subTrama_N4 = new SubTrama_N4();
/* 323 */       subTrama_N4.generaSubTrama("W", "");
/* 324 */       subTrama_N4.completaLongitud();
/*     */ 
/*     */       
/* 327 */       SubTrama_DMG subTrama_DMG = new SubTrama_DMG();
/* 328 */       subTrama_DMG.generaSubTrama("D8", "", "", "", "");
/* 329 */       subTrama_DMG.completaLongitud();
/*     */ 
/*     */       
/* 332 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 333 */       subTrama_DTP1.generaSubTrama("442", "D8", "");
/* 334 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 337 */       SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 338 */       subTrama_DTP2.generaSubTrama("276", "D8", "");
/* 339 */       subTrama_DTP2.completaLongitud();
/*     */ 
/*     */       
/* 342 */       SubTrama_DTP subTrama_DTP3 = new SubTrama_DTP();
/* 343 */       subTrama_DTP3.generaSubTrama("093", "D8", "");
/* 344 */       subTrama_DTP3.completaLongitud();
/*     */ 
/*     */       
/* 347 */       SubTrama_DTP subTrama_DTP4 = new SubTrama_DTP();
/* 348 */       subTrama_DTP4.generaSubTrama("349", "D8", "");
/* 349 */       subTrama_DTP4.completaLongitud();
/*     */ 
/*     */       
/* 352 */       SubTrama_NM1 subTrama_NM22 = new SubTrama_NM1();
/* 353 */       subTrama_NM22.generaSubTrama("PR", "", "PI", "");
/* 354 */       subTrama_NM22.completaLongitud();
/*     */ 
/*     */       
/* 357 */       SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 358 */       subTrama_NM14.generaSubTrama("C9", "", "", "", "MI", "", "");
/* 359 */       subTrama_NM14.completaLongitud();
/*     */ 
/*     */       
/* 362 */       SubTrama_REF subTrama_REF10 = new SubTrama_REF();
/* 363 */       subTrama_REF10.generaSubTrama("DD", "");
/* 364 */       subTrama_REF10.completaLongitud();
/*     */ 
/*     */       
/* 367 */       SubTrama_REF4 subTrama_REF104 = new SubTrama_REF4();
/* 368 */       subTrama_REF104.generaSubTrama("A4", "");
/* 369 */       subTrama_REF104.completaLongitud();
/*     */ 
/*     */       
/* 372 */       SubTrama_REF subTrama_REF11 = new SubTrama_REF();
/* 373 */       subTrama_REF11.generaSubTrama("EI", "");
/* 374 */       subTrama_REF11.completaLongitud();
/*     */ 
/*     */       
/* 377 */       SubTrama_DMG subTrama_DMG1 = new SubTrama_DMG();
/* 378 */       subTrama_DMG1.generaSubTrama("D8", "", "", "", "");
/* 379 */       subTrama_DMG1.completaLongitud();
/*     */ 
/*     */       
/* 382 */       SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 383 */       subTrama_NM15.generaSubTrama("C9", "", "", "", "", "", "");
/* 384 */       subTrama_NM15.completaLongitud();
/*     */ 
/*     */       
/* 387 */       SubTrama_REF subTrama_REF12 = new SubTrama_REF();
/* 388 */       subTrama_REF12.generaSubTrama("DD", "");
/* 389 */       subTrama_REF12.completaLongitud();
/*     */ 
/*     */       
/* 392 */       SubTrama_REF4 subTrama_REF124 = new SubTrama_REF4();
/* 393 */       subTrama_REF124.generaSubTrama("", "");
/* 394 */       subTrama_REF124.completaLongitud();
/*     */ 
/*     */       
/* 397 */       SubTrama_DMG subTrama_DMG2 = new SubTrama_DMG();
/* 398 */       subTrama_DMG2.generaSubTrama("", "", "", "", "");
/* 399 */       subTrama_DMG2.completaLongitud();
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
/* 426 */       sDetalle = sDetalle + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF14.returnComoString("", ":", "~")) + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "~") + subTrama_REF9.returnComoString("REF*", "*", "~") + subTrama_N2.returnComoString("N2*", "*", "~") + subTrama_N4.returnComoString("N4*", "*", "~") + subTrama_DMG.returnComoString("DMG*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~") + subTrama_DTP3.returnComoString("DTP*", "*", "~") + subTrama_DTP4.returnComoString("DTP*", "*", "~") + subTrama_NM22.returnComoString("NM1*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF10.returnComoString("REF*", "*", "*" + subTrama_REF104.returnComoString("", ":", "~")) + subTrama_REF11.returnComoString("REF*", "*", "~") + subTrama_DMG1.returnComoString("DMG*", "*", "~") + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_REF12.returnComoString("REF*", "*", "*" + subTrama_REF124.returnComoString("", ":", "~")) + subTrama_DMG2.returnComoString("DMG*", "*", "~");
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
/* 437 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 440 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 443 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 444 */     subTrama_SE.generaSubTrama(canTxSE, inRegafi.getNuControlST());
/* 445 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 448 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 449 */     subTrama_GE.generaSubTrama(inRegafi.getNuControl());
/* 450 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 453 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 454 */     subTrama_IEA.generaSubTrama(inRegafi.getIdCorrelativo());
/*     */     
/* 456 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 462 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 463 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 467 */     String[] arrayCadena = sReturn.split("\\~");
/* 468 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 469 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\RegAfi271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */