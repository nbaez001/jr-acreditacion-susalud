/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutExeCar271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutProEsp271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutRes271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutTieEsp271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SolAut271_ToBean
/*     */ {
/*  19 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  20 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  21 */   private static Boolean flagST = Boolean.valueOf(true);
/*  22 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  23 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  24 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  25 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  26 */   private static Boolean flagDMG = Boolean.valueOf(true);
/*  27 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  28 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*  29 */   private static Boolean flagHSD = Boolean.valueOf(true);
/*  30 */   private static Integer tagREF = Integer.valueOf(1);
/*  31 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  32 */   private static Integer tagDTP = Integer.valueOf(1);
/*  33 */   private static Integer tagDMG = Integer.valueOf(1);
/*  34 */   private static Integer tagEB = Integer.valueOf(1);
/*  35 */   private static Integer tagMSG = Integer.valueOf(1);
/*  36 */   private static Integer tagHSD = Integer.valueOf(1);
/*  37 */   private static Integer conEBPE = Integer.valueOf(0), conEBTE = Integer.valueOf(0), conEBEC = Integer.valueOf(0), conEB = Integer.valueOf(0), conDTP = Integer.valueOf(0), conREF = Integer.valueOf(0), conMSG = Integer.valueOf(0);
/*  38 */   private static Integer candetalle = Integer.valueOf(0);
/*  39 */   private static String tagHL = null;
/*     */   
/*     */   public static InSolAut271 traducirEstructura271(String cadena) {
/*  42 */     flagISA = Boolean.valueOf(true);
/*  43 */     flaGS = Boolean.valueOf(true);
/*  44 */     flagST = Boolean.valueOf(true);
/*  45 */     flagBHT = Boolean.valueOf(true);
/*  46 */     flagNM1 = Boolean.valueOf(true);
/*  47 */     flagREF = Boolean.valueOf(true);
/*  48 */     flagDTP = Boolean.valueOf(true);
/*  49 */     flagDMG = Boolean.valueOf(true);
/*  50 */     flagEB = Boolean.valueOf(true);
/*  51 */     flagMSG = Boolean.valueOf(true);
/*  52 */     flagHSD = Boolean.valueOf(true);
/*  53 */     tagREF = Integer.valueOf(1);
/*  54 */     tagNM1 = Integer.valueOf(1);
/*  55 */     tagDTP = Integer.valueOf(1);
/*  56 */     tagDMG = Integer.valueOf(1);
/*  57 */     tagEB = Integer.valueOf(1);
/*  58 */     tagMSG = Integer.valueOf(1);
/*  59 */     tagHSD = Integer.valueOf(1);
/*  60 */     tagHL = null;
/*  61 */     conEBPE = Integer.valueOf(0);
/*  62 */     conEBTE = Integer.valueOf(0);
/*  63 */     conEBEC = Integer.valueOf(0);
/*  64 */     conEB = Integer.valueOf(0);
/*  65 */     conDTP = Integer.valueOf(0);
/*  66 */     conREF = Integer.valueOf(0);
/*  67 */     conMSG = Integer.valueOf(0);
/*     */ 
/*     */     
/*  70 */     String[] canDetalle = cantidaSegmentosTx(cadena);
/*     */ 
/*     */     
/*  73 */     int canPE = Integer.parseInt(canDetalle[0]);
/*  74 */     int canTE = Integer.parseInt(canDetalle[1]);
/*  75 */     int canEC = Integer.parseInt(canDetalle[2]);
/*  76 */     int canRE = Integer.parseInt(canDetalle[3].trim());
/*     */     
/*  78 */     InSolAut271 inSolAut271 = new InSolAut271();
/*  79 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  81 */     for (String s2 : arrayCadena) {
/*  82 */       String dataCadena = s2;
/*  83 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  85 */       if (s1[0].trim().equals("ISA")) {
/*  86 */         if (flagISA.booleanValue()) {
/*  87 */           cargarCamposISA(s1, inSolAut271);
/*     */         }
/*  89 */       } else if (s1[0].trim().equals("GS")) {
/*  90 */         if (flaGS.booleanValue()) {
/*  91 */           cargarCamposGS(s1, inSolAut271);
/*     */         }
/*  93 */       } else if (s1[0].trim().equals("ST")) {
/*  94 */         if (flagST.booleanValue()) {
/*  95 */           cargarCamposST(s1, inSolAut271);
/*     */         }
/*  97 */       } else if (s1[0].trim().equals("BHT")) {
/*  98 */         if (flagBHT.booleanValue()) {
/*  99 */           cargarCamposBHT(s1, inSolAut271);
/*     */         }
/* 101 */       } else if (s1[0].trim().equals("HL")) {
/* 102 */         cargarCamposNM1(s1, inSolAut271);
/* 103 */       } else if (s1[0].trim().equals("NM1")) {
/* 104 */         if (flagNM1.booleanValue()) {
/* 105 */           cargarCamposNM1(s1, inSolAut271);
/*     */         }
/* 107 */       } else if (s1[0].trim().equals("REF")) {
/* 108 */         if (flagREF.booleanValue()) {
/* 109 */           cargarCamposREF(s1, inSolAut271, canTE, canEC, canRE);
/*     */         }
/* 111 */       } else if (s1[0].trim().equals("DMG")) {
/* 112 */         if (flagDMG.booleanValue()) {
/* 113 */           cargarCamposDMG(s1, inSolAut271);
/*     */         }
/* 115 */       } else if (s1[0].trim().equals("DTP")) {
/* 116 */         if (flagDTP.booleanValue()) {
/* 117 */           cargarCamposDTP(s1, inSolAut271, canTE);
/*     */         }
/* 119 */       } else if (s1[0].trim().equals("EB")) {
/* 120 */         if (flagEB.booleanValue()) {
/* 121 */           cargarCamposEB(s1, inSolAut271, canPE, canTE, canEC, canRE);
/*     */         }
/* 123 */       } else if (s1[0].trim().equals("MSG")) {
/* 124 */         if (flagMSG.booleanValue()) {
/* 125 */           cargarCamposMSG(s1, inSolAut271, canPE, canTE, canEC);
/*     */         }
/* 127 */       } else if (s1[0].trim().equals("HSD") && 
/* 128 */         flagHSD.booleanValue()) {
/* 129 */         cargarCamposHSD(s1, inSolAut271);
/*     */       } 
/*     */     } 
/*     */     
/* 133 */     return inSolAut271;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposISA(String[] s1, InSolAut271 arrayCadena) {
/* 137 */     arrayCadena.setNoTransaccion("271_SOL_AUT");
/* 138 */     arrayCadena.setIdRemitente(s1[6]);
/* 139 */     arrayCadena.setIdReceptor(s1[8]);
/* 140 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 141 */     flagISA = Boolean.valueOf(false);
/* 142 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposGS(String[] s1, InSolAut271 arrayCadena) {
/* 146 */     arrayCadena.setFeTransaccion(s1[4]);
/* 147 */     arrayCadena.setHoTransaccion(s1[5]);
/* 148 */     flaGS = Boolean.valueOf(false);
/* 149 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposST(String[] s1, InSolAut271 arrayCadena) {
/* 153 */     arrayCadena.setIdTransaccion(s1[1]);
/* 154 */     flagST = Boolean.valueOf(false);
/* 155 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposBHT(String[] s1, InSolAut271 arrayCadena) {
/* 159 */     arrayCadena.setTiFinalidad(s1[2]);
/* 160 */     flagBHT = Boolean.valueOf(false);
/*     */     
/* 162 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InSolAut271 cargarCamposNM1(String[] s1, InSolAut271 arrayCadena) {
/* 167 */     if (s1[0].trim().equals("HL")) {
/* 168 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 171 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 172 */       arrayCadena.setCaRemitente(s1[2]);
/* 173 */       arrayCadena.setNuRucRemitente(s1[9]);
/* 174 */     } else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 175 */       arrayCadena.setCaReceptor(s1[2]);
/* 176 */     } else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 177 */       if (tagNM1.intValue() == 1) {
/* 178 */         arrayCadena.setCaPaciente(s1[2]);
/* 179 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 180 */         arrayCadena.setNoPaciente(s1[4]);
/* 181 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 182 */         arrayCadena.setApMaternoPaciente(s1[12]);
/*     */         
/* 184 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 185 */       } else if (tagNM1.intValue() == 2) {
/* 186 */         arrayCadena.setCaContratante(s1[2]);
/* 187 */         arrayCadena.setNoPaContratante(s1[3]);
/* 188 */         arrayCadena.setNoContratante(s1[4]);
/* 189 */         arrayCadena.setNoMaContratante(s1[12]);
/*     */         
/* 191 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 192 */       } else if (tagNM1.intValue() == 3) {
/* 193 */         arrayCadena.setCaTitular(s1[2]);
/* 194 */         arrayCadena.setNoPaTitular(s1[3]);
/* 195 */         arrayCadena.setNoTitular(s1[4]);
/* 196 */         arrayCadena.setCoAfTitular(s1[9]);
/* 197 */         arrayCadena.setNoMaTitular(s1[12]);
/*     */         
/* 199 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 200 */       } else if (tagNM1.intValue() == 4) {
/* 201 */         arrayCadena.setCaPaciente(s1[2]);
/* 202 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 203 */         arrayCadena.setNoPaciente(s1[4]);
/* 204 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 205 */         arrayCadena.setApMaternoPaciente(s1[12]);
/*     */         
/* 207 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/*     */       } 
/* 209 */     } else if ("4".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 210 */       arrayCadena.setCaRegafi(s1[2]);
/* 211 */       arrayCadena.setNoPaRegafi(s1[3]);
/* 212 */       arrayCadena.setNoRegafi(s1[4]);
/* 213 */       arrayCadena.setCoAfRegafi(s1[9]);
/* 214 */       arrayCadena.setNoMaRegafi(s1[12]);
/* 215 */       tagHL = "3";
/* 216 */       tagNM1 = Integer.valueOf(1);
/*     */     } 
/* 218 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InSolAut271 cargarCamposREF(String[] s1, InSolAut271 arrayCadena, int canTE, int canEC, int canRE) {
/* 223 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 224 */       arrayCadena.setCoAdmisionista(s1[2]);
/*     */       
/* 226 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 227 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 228 */       arrayCadena.setCoEsPaciente(s1[2]);
/*     */       
/* 230 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 231 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 232 */       arrayCadena.setTiDoPaciente(s1[2]);
/*     */       
/* 234 */       String[] ref04 = s1[4].split(":", 0);
/* 235 */       arrayCadena.setNuDoPaciente(ref04[1]);
/*     */       
/* 237 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 238 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 239 */       arrayCadena.setNuIdenEmpleador(s1[2]);
/*     */       
/* 241 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 242 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 243 */       arrayCadena.setNuContratoPaciente(s1[2]);
/*     */       
/* 245 */       String[] ref04 = s1[4].split(":", 0);
/* 246 */       arrayCadena.setNuPoliza(ref04[1]);
/* 247 */       arrayCadena.setNuCertificado(ref04[3]);
/* 248 */       arrayCadena.setCoTiPolizaAfiliacion(ref04[5]);
/*     */       
/* 250 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 251 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 252 */       arrayCadena.setCoProducto(s1[2]);
/* 253 */       arrayCadena.setDeProducto(s1[3]);
/*     */       
/* 255 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 256 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 257 */       arrayCadena.setNuPlan(s1[2]);
/*     */       
/* 259 */       String[] ref04 = s1[4].split(":", 0);
/* 260 */       arrayCadena.setTiPlanSalud(ref04[1]);
/* 261 */       arrayCadena.setCoMoneda(ref04[3]);
/* 262 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 263 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 264 */       arrayCadena.setCoParentesco(s1[2]);
/* 265 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 266 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 9) {
/* 267 */       arrayCadena.setSoBeneficio(s1[2]);
/*     */       
/* 269 */       String[] ref04 = s1[4].split(":", 0);
/* 270 */       arrayCadena.setNuSoBeneficio(ref04[1]);
/* 271 */       arrayCadena.setCoEspecialidad(ref04[3]);
/* 272 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 273 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 10) {
/* 274 */       arrayCadena.setDeTiAccidente(s1[2]);
/*     */       
/* 276 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 277 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 11) {
/* 278 */       arrayCadena.setTiProducto(s1[2]);
/* 279 */       arrayCadena.setDeProductoDeFarmacia(s1[3]);
/* 280 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 281 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 12) {
/* 282 */       arrayCadena.setTiDoContratante(s1[2]);
/*     */       
/* 284 */       String[] ref04 = s1[4].split(":", 0);
/* 285 */       arrayCadena.setIdReContratante(ref04[0]);
/* 286 */       arrayCadena.setCoReContratante(ref04[1]);
/*     */       
/* 288 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 289 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 13) {
/* 290 */       arrayCadena.setTiDoTitular(s1[2]);
/*     */       
/* 292 */       String[] ref04 = s1[4].split(":", 0);
/* 293 */       arrayCadena.setIdReTitular(ref04[0]);
/* 294 */       arrayCadena.setNuDoTitular(ref04[1]);
/*     */       
/* 296 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 297 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 14) {
/* 298 */       arrayCadena.setCoTiCobertura(s1[2]);
/*     */       
/* 300 */       String[] ref04 = s1[4].split(":", 0);
/* 301 */       arrayCadena.setCoSubTiCobertura(ref04[1]);
/*     */       
/* 303 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 304 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 15) {
/* 305 */       ((InSolAutTieEsp271Detalle)arrayCadena.getDetallesTE().get(arrayCadena.getDetallesTE().size() - 1)).setDeTiEspera(s1[2]);
/*     */       
/* 307 */       if (conEBTE.intValue() == canTE) {
/* 308 */         tagREF = Integer.valueOf(tagREF.intValue() + 1);
/*     */       }
/* 310 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 16) {
/* 311 */       ((InSolAutExeCar271Detalle)arrayCadena.getDetallesEC().get(arrayCadena.getDetallesEC().size() - 1)).setDeExCarencia(s1[2]);
/*     */       
/* 313 */       if (conEBEC.intValue() == canEC) {
/* 314 */         tagREF = Integer.valueOf(tagREF.intValue() + 1);
/*     */       }
/* 316 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 17) {
/* 317 */       ((InSolAutRes271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setObsRestricciones(s1[2]);
/*     */       
/* 319 */       conREF = Integer.valueOf(conREF.intValue() + 1);
/* 320 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 321 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 18) {
/* 322 */       ((InSolAutRes271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeRestricciones(s1[2]);
/*     */       
/* 324 */       if (conREF.intValue() < canRE) {
/* 325 */         tagREF = Integer.valueOf(17);
/*     */       } else {
/* 327 */         tagREF = Integer.valueOf(tagREF.intValue() + 1);
/*     */       } 
/* 329 */     } else if (s1[0].trim().equals("REF")) {
/* 330 */       tagREF = Integer.valueOf(19);
/* 331 */       if (s1[0].trim().equals("REF") && tagREF.intValue() == 19) {
/* 332 */         arrayCadena.setTiDoRegafi(s1[2]);
/*     */         
/* 334 */         String[] ref04 = s1[4].split(":", 0);
/* 335 */         arrayCadena.setIdReRegafi(ref04[0]);
/* 336 */         arrayCadena.setNuDoRegafi(ref04[1]);
/*     */         
/* 338 */         tagREF = Integer.valueOf(1);
/*     */       } 
/*     */     } 
/* 341 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InSolAut271 cargarCamposDMG(String[] s1, InSolAut271 arrayCadena) {
/* 346 */     if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 1) {
/* 347 */       arrayCadena.setFeNacimiento(s1[2]);
/* 348 */       arrayCadena.setGenero(s1[3]);
/* 349 */       arrayCadena.setEsMarital(s1[4]);
/* 350 */       tagDMG = Integer.valueOf(tagDMG.intValue() + 1);
/* 351 */     } else if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 2) {
/* 352 */       arrayCadena.setFeNaRegafi(s1[2]);
/* 353 */       arrayCadena.setGeRegafi(s1[3]);
/* 354 */       arrayCadena.setCoPaisRegafi(s1[7]);
/*     */       
/* 356 */       tagDMG = Integer.valueOf(1);
/*     */     } 
/* 358 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InSolAut271 cargarCamposDTP(String[] s1, InSolAut271 arrayCadena, int canTE) {
/* 363 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 364 */       arrayCadena.setFeIniVigencia(s1[3]);
/* 365 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 366 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 2) {
/* 367 */       arrayCadena.setFeFinVigencia(s1[3]);
/* 368 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 369 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 3) {
/* 370 */       arrayCadena.setFeAfiliacion(s1[3]);
/* 371 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 372 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 4) {
/* 373 */       arrayCadena.setFeOcuAccidente(s1[3]);
/* 374 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 375 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 5) {
/* 376 */       arrayCadena.setFeAtencion(s1[3]);
/* 377 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 378 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 6) {
/* 379 */       arrayCadena.setFeIncTitular(s1[3]);
/* 380 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 381 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 7) {
/* 382 */       arrayCadena.setFeFinCarencia(s1[3]);
/* 383 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 384 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 8) {
/* 385 */       arrayCadena.setFeFinEspera(s1[3]);
/* 386 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 387 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 9) {
/* 388 */       ((InSolAutTieEsp271Detalle)arrayCadena.getDetallesTE().get(arrayCadena.getDetallesTE().size() - 1)).setFeFinVigenciaTiEspera(s1[3]);
/* 389 */       if (conEBTE.intValue() == canTE) {
/* 390 */         tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/*     */       }
/* 392 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 10) {
/* 393 */       ((InSolAutRes271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinEsperaRestricciones(s1[3]);
/*     */     } 
/* 395 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InSolAut271 cargarCamposEB(String[] s1, InSolAut271 arrayCadena, int canPE, int canTE, int canEC, int canRE) {
/* 400 */     if (s1[0].trim().equals("EB") && tagEB.intValue() == 1) {
/* 401 */       arrayCadena.setEsCobertura(s1[1]);
/* 402 */       arrayCadena.setNuDecAccidente(s1[5]);
/*     */       
/* 404 */       String[] eb13 = s1[13].split(":", 0);
/* 405 */       arrayCadena.setIdInfAccidente(eb13[1]);
/* 406 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 407 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 2) {
/* 408 */       arrayCadena.setNuAtencion(s1[5]);
/*     */       
/* 410 */       String[] eb13 = s1[13].split(":", 0);
/* 411 */       arrayCadena.setIdDerFarmacia(eb13[1]);
/* 412 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 413 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 3) {
/* 414 */       arrayCadena.setNuCobertura(s1[5]);
/*     */       
/* 416 */       String[] eb13 = s1[13].split(":", 0);
/* 417 */       arrayCadena.setObsCobertura(eb13[1]);
/* 418 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 419 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 4) {
/* 420 */       arrayCadena.setNuCobPreExistencia(s1[5]);
/* 421 */       arrayCadena.setBeMaxInicial(s1[7]);
/*     */       
/* 423 */       arrayCadena.setCanServicio(s1[10]);
/*     */       
/* 425 */       String[] eb13 = s1[13].split(":", 0);
/* 426 */       arrayCadena.setIdDeProducto(eb13[1]);
/* 427 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 428 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 5) {
/* 429 */       arrayCadena.setCoTiMoneda(s1[5]);
/* 430 */       arrayCadena.setCoPagoFijo(s1[7]);
/* 431 */       arrayCadena.setCoCalServicio(s1[9]);
/* 432 */       arrayCadena.setCanCalServicio(s1[10]);
/*     */       
/* 434 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 435 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 6) {
/* 436 */       arrayCadena.setCoPagoVariable(s1[8]);
/*     */       
/* 438 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 439 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 7) {
/* 440 */       arrayCadena.setFlagCG(s1[1]);
/* 441 */       arrayCadena.setDeflagCG(s1[5]);
/*     */       
/* 443 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 444 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 8) {
/* 445 */       InSolAutProEsp271Detalle detallePE = new InSolAutProEsp271Detalle();
/* 446 */       detallePE.setCoInProcedimiento(s1[9]);
/*     */       
/* 448 */       arrayCadena.addDetalle(detallePE);
/* 449 */       conEBPE = Integer.valueOf(conEBPE.intValue() + 1);
/* 450 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 451 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 9) {
/* 452 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setCoTiProConAmbulatoria(s1[3]);
/* 453 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setNuPlanConAmbulatoria(s1[5]);
/* 454 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setImDeducible(s1[7]);
/* 455 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setPoConAmbulatoria(s1[8]);
/* 456 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setFrConAmbulatoria(s1[10]);
/*     */       
/* 458 */       String[] eb13 = s1[13].split(":", 0);
/* 459 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setGeConAmbulatoria(eb13[1]);
/*     */       
/* 461 */       if (conEBPE.intValue() < canPE) {
/* 462 */         tagEB = Integer.valueOf(8);
/*     */       }
/* 464 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 10) {
/* 465 */       InSolAutTieEsp271Detalle detalleTE = new InSolAutTieEsp271Detalle();
/* 466 */       detalleTE.setCoTiEspera(s1[3]);
/*     */       
/* 468 */       String[] eb13 = s1[13].split(":", 0);
/* 469 */       detalleTE.setIdTiEspera(eb13[1]);
/*     */       
/* 471 */       arrayCadena.addDetalle(detalleTE);
/* 472 */       conEBTE = Integer.valueOf(conEBTE.intValue() + 1);
/* 473 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/*     */       
/* 475 */       if (conEBTE.intValue() < canTE) {
/* 476 */         tagEB = Integer.valueOf(10);
/*     */       }
/* 478 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 11) {
/* 479 */       InSolAutExeCar271Detalle detalleEC = new InSolAutExeCar271Detalle();
/* 480 */       detalleEC.setCoExCarencia(s1[3]);
/*     */       
/* 482 */       String[] eb13 = s1[13].split(":", 0);
/* 483 */       detalleEC.setIdExCarencia(eb13[1]);
/*     */       
/* 485 */       arrayCadena.addDetalle(detalleEC);
/* 486 */       conEBEC = Integer.valueOf(conEBEC.intValue() + 1);
/* 487 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/*     */       
/* 489 */       if (conEBEC.intValue() < canEC) {
/* 490 */         tagEB = Integer.valueOf(11);
/*     */       }
/* 492 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 12) {
/* 493 */       InSolAutRes271Detalle detalle = new InSolAutRes271Detalle();
/* 494 */       detalle.setCIE10Restricciones(s1[3]);
/*     */       
/* 496 */       String[] eb13 = s1[13].split(":", 0);
/* 497 */       detalle.setIdRestricciones(eb13[1]);
/* 498 */       arrayCadena.addDetalle(detalle);
/* 499 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 500 */       conEB = Integer.valueOf(conEB.intValue() + 1);
/* 501 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 13) {
/* 502 */       ((InSolAutRes271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMonTopeRestricciones(s1[8]);
/*     */       
/* 504 */       if (conEB.intValue() < canRE) {
/* 505 */         tagEB = Integer.valueOf(12);
/*     */       }
/*     */     } 
/* 508 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposMSG(String[] s1, InSolAut271 arrayCadena, int canPE, int canTE, int canEC) {
/* 512 */     if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 1) {
/* 513 */       arrayCadena.setMsgObs(s1[1]);
/* 514 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 515 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 2) {
/* 516 */       arrayCadena.setMsgConEspeciales(s1[1]);
/* 517 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 518 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 3) {
/* 519 */       arrayCadena.setMsgObsPre(s1[1]);
/* 520 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 521 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 4) {
/* 522 */       arrayCadena.setMsgConEspecialesPre(s1[1]);
/* 523 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 524 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 5) {
/* 525 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setMsgConAmbulatoria(s1[1]);
/*     */       
/* 527 */       if (conEBPE.intValue() == canPE || canPE == 0) {
/* 528 */         tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 529 */         tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/*     */       } 
/* 531 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 6) {
/* 532 */       ((InSolAutTieEsp271Detalle)arrayCadena.getDetallesTE().get(arrayCadena.getDetallesTE().size() - 1)).setMsgTiEspera(s1[1]);
/*     */       
/* 534 */       if (conEBTE.intValue() == canTE || canTE == 0) {
/* 535 */         tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/*     */       }
/* 537 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 7) {
/* 538 */       ((InSolAutExeCar271Detalle)arrayCadena.getDetallesEC().get(arrayCadena.getDetallesEC().size() - 1)).setMsgExCarencia(s1[1]);
/* 539 */       if (conEBEC.intValue() == canEC || canEC == 0) {
/* 540 */         tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/*     */       }
/* 542 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 8) {
/* 543 */       ((InSolAutRes271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMsgRestricciones(s1[1]);
/*     */     } 
/* 545 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InSolAut271 cargarCamposHSD(String[] s1, InSolAut271 arrayCadena) {
/* 549 */     if (s1[0].trim().equals("HSD") && tagHSD.intValue() == 1) {
/* 550 */       ((InSolAutProEsp271Detalle)arrayCadena.getDetallesPE().get(arrayCadena.getDetallesPE().size() - 1)).setCaConAmbulatoria(s1[2]);
/* 551 */       tagHSD = Integer.valueOf(1);
/*     */     } 
/* 553 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static String[] cantidaSegmentosTx(String cadena) {
/* 557 */     String[] arrayCadena1 = cadena.split("\\~");
/* 558 */     String canDetalle = null;
/* 559 */     String ST = "", cant = "";
/* 560 */     int v1 = 0, v2 = 0, v3 = 0;
/*     */     
/* 562 */     String[] va2 = null;
/*     */     
/* 564 */     if (arrayCadena1.length > 1) {
/*     */       
/* 566 */       ST = arrayCadena1[2];
/* 567 */       String[] va1 = ST.split("\\*");
/*     */       
/* 569 */       cant = va1[3];
/* 570 */       va2 = cant.split("\\#");
/*     */       
/* 572 */       v1 = Integer.parseInt(va2[1]);
/* 573 */       v2 = Integer.parseInt(va2[2]);
/* 574 */       v3 = Integer.parseInt(va2[3].trim());
/*     */       
/* 576 */       if (v1 == 0) va2[1] = "1"; 
/* 577 */       if (v2 == 0) va2[2] = "1"; 
/* 578 */       if (v3 == 0) va2[3] = "1"; 
/*     */     } 
/* 580 */     return va2;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\SolAut271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */