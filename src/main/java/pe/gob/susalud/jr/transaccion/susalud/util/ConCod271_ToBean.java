/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConCod271_ToBean
/*     */ {
/*  12 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  13 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  14 */   private static Boolean flagST = Boolean.valueOf(true);
/*  15 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  16 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  18 */   private static Boolean flagDMG = Boolean.valueOf(true);
/*  19 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  20 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  21 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*  22 */   private static Integer tagREF = Integer.valueOf(1);
/*  23 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  24 */   private static Integer tagDTP = Integer.valueOf(1);
/*  25 */   private static Integer tagEB = Integer.valueOf(1);
/*  26 */   private static Integer tagMSG = Integer.valueOf(1);
/*  27 */   private static String tagHL = null;
/*     */ 
/*     */   
/*     */   public static InConCod271 traducirEstructura271(String cadena) {
/*  31 */     flagISA = Boolean.valueOf(true);
/*  32 */     flaGS = Boolean.valueOf(true);
/*  33 */     flagST = Boolean.valueOf(true);
/*  34 */     flagBHT = Boolean.valueOf(true);
/*  35 */     flagNM1 = Boolean.valueOf(true);
/*  36 */     flagREF = Boolean.valueOf(true);
/*  37 */     flagDMG = Boolean.valueOf(true);
/*  38 */     flagDTP = Boolean.valueOf(true);
/*  39 */     flagEB = Boolean.valueOf(true);
/*  40 */     flagMSG = Boolean.valueOf(true);
/*  41 */     tagREF = Integer.valueOf(1);
/*  42 */     tagNM1 = Integer.valueOf(1);
/*  43 */     tagDTP = Integer.valueOf(1);
/*  44 */     tagEB = Integer.valueOf(1);
/*  45 */     tagMSG = Integer.valueOf(1);
/*  46 */     tagHL = null;
/*     */     
/*  48 */     InConCod271 inConCod271 = new InConCod271();
/*  49 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  51 */     for (String s2 : arrayCadena) {
/*     */       
/*  53 */       String dataCadena = s2;
/*  54 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  56 */       if (s1[0].trim().equals("ISA")) {
/*  57 */         if (flagISA.booleanValue()) {
/*  58 */           cargarCamposISA(s1, inConCod271);
/*     */         }
/*  60 */       } else if (s1[0].trim().equals("GS")) {
/*  61 */         if (flaGS.booleanValue()) {
/*  62 */           cargarCamposGS(s1, inConCod271);
/*     */         }
/*  64 */       } else if (s1[0].trim().equals("ST")) {
/*  65 */         if (flagST.booleanValue()) {
/*  66 */           cargarCamposST(s1, inConCod271);
/*     */         }
/*  68 */       } else if (s1[0].trim().equals("BHT")) {
/*  69 */         if (flagBHT.booleanValue()) {
/*  70 */           cargarCamposBHT(s1, inConCod271);
/*     */         }
/*  72 */       } else if (s1[0].trim().equals("HL")) {
/*  73 */         cargarCamposNM1(s1, inConCod271);
/*  74 */       } else if (s1[0].trim().equals("NM1")) {
/*  75 */         if (flagNM1.booleanValue()) {
/*  76 */           cargarCamposNM1(s1, inConCod271);
/*     */         }
/*  78 */       } else if (s1[0].trim().equals("REF")) {
/*  79 */         if (flagREF.booleanValue()) {
/*  80 */           cargarCamposREF(s1, inConCod271);
/*     */         }
/*  82 */       } else if (s1[0].trim().equals("DMG")) {
/*  83 */         if (flagDMG.booleanValue()) {
/*  84 */           cargarCamposDMG(s1, inConCod271);
/*     */         }
/*  86 */       } else if (s1[0].trim().equals("DTP")) {
/*  87 */         if (flagDTP.booleanValue()) {
/*  88 */           cargarCamposDTP(s1, inConCod271);
/*     */         } else {
/*     */           break;
/*     */         } 
/*  92 */       } else if (s1[0].trim().equals("EB")) {
/*  93 */         if (flagEB.booleanValue()) {
/*  94 */           cargarCamposEB(s1, inConCod271);
/*     */         }
/*  96 */       } else if (s1[0].trim().equals("MSG") && 
/*  97 */         flagMSG.booleanValue()) {
/*  98 */         cargarCamposMSG(s1, inConCod271);
/*     */       } 
/*     */     } 
/*     */     
/* 102 */     return inConCod271;
/*     */   }
/*     */   
/*     */   private static InConCod271 cargarCamposISA(String[] s1, InConCod271 arrayCadena) {
/* 106 */     arrayCadena.setNoTransaccion("271_CON_COD");
/* 107 */     arrayCadena.setIdRemitente(s1[6]);
/* 108 */     arrayCadena.setIdReceptor(s1[8]);
/* 109 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 110 */     flagISA = Boolean.valueOf(false);
/* 111 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConCod271 cargarCamposGS(String[] s1, InConCod271 arrayCadena) {
/* 115 */     arrayCadena.setFeTransaccion(s1[4]);
/* 116 */     arrayCadena.setHoTransaccion(s1[5]);
/* 117 */     flaGS = Boolean.valueOf(false);
/* 118 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConCod271 cargarCamposST(String[] s1, InConCod271 arrayCadena) {
/* 122 */     arrayCadena.setIdTransaccion(s1[1]);
/* 123 */     flagST = Boolean.valueOf(false);
/* 124 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConCod271 cargarCamposBHT(String[] s1, InConCod271 arrayCadena) {
/* 128 */     arrayCadena.setTiFinalidad(s1[2]);
/* 129 */     flagBHT = Boolean.valueOf(false);
/* 130 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConCod271 cargarCamposNM1(String[] s1, InConCod271 arrayCadena) {
/* 135 */     if (s1[0].trim().equals("HL")) {
/* 136 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 139 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 140 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 142 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 143 */       arrayCadena.setCaReceptor(s1[2]);
/* 144 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 146 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/*     */       
/* 148 */       if (tagNM1.intValue() == 1) {
/* 149 */         arrayCadena.setCaPaciente(s1[2]);
/* 150 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 151 */         arrayCadena.setNoPaciente(s1[4]);
/* 152 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 153 */         arrayCadena.setApMaternoPaciente(s1[12]);
/*     */         
/* 155 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 156 */       } else if (tagNM1.intValue() == 2) {
/* 157 */         arrayCadena.setTiCaContratante(s1[2]);
/* 158 */         arrayCadena.setNoPaContratante(s1[3]);
/* 159 */         arrayCadena.setNoContratante(s1[4]);
/* 160 */         arrayCadena.setNoMaContratante(s1[12]);
/*     */         
/* 162 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 163 */       } else if (tagNM1.intValue() == 3) {
/* 164 */         arrayCadena.setCaTitular(s1[2]);
/* 165 */         arrayCadena.setNoPaTitular(s1[3]);
/* 166 */         arrayCadena.setNoTitular(s1[4]);
/* 167 */         arrayCadena.setCoAfTitular(s1[9]);
/* 168 */         arrayCadena.setNoMaTitular(s1[12]);
/*     */         
/* 170 */         tagNM1 = Integer.valueOf(2);
/*     */       } 
/*     */     } 
/* 173 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConCod271 cargarCamposREF(String[] s1, InConCod271 arrayCadena) {
/* 178 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 179 */       arrayCadena.setUserRemitente(s1[2]);
/*     */       
/* 181 */       String[] ref04 = s1[4].split(":", 0);
/* 182 */       arrayCadena.setPassRemitente(ref04[1]);
/* 183 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 184 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 185 */       arrayCadena.setCoEsPaciente(s1[2]);
/* 186 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 187 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 188 */       arrayCadena.setTiDoPaciente(s1[2]);
/*     */       
/* 190 */       String[] ref04 = s1[4].split(":", 0);
/* 191 */       arrayCadena.setNuDoPaciente(ref04[1]);
/* 192 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 193 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 194 */       arrayCadena.setNuIdenPaciente(s1[2]);
/* 195 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 196 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 197 */       arrayCadena.setNuContratoPaciente(s1[2]);
/*     */       
/* 199 */       String[] ref04 = s1[4].split(":", 0);
/* 200 */       arrayCadena.setNuPoliza(ref04[1]);
/* 201 */       arrayCadena.setNuCertificado(ref04[3]);
/* 202 */       arrayCadena.setCoTiPoliza(ref04[5]);
/*     */       
/* 204 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 205 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 206 */       arrayCadena.setCoProducto(s1[2]);
/* 207 */       arrayCadena.setDeProducto(s1[3]);
/*     */       
/* 209 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 210 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 211 */       arrayCadena.setNuPlan(s1[2]);
/*     */       
/* 213 */       String[] ref04 = s1[4].split(":", 0);
/* 214 */       arrayCadena.setTiPlanSalud(ref04[1]);
/* 215 */       arrayCadena.setCoMoneda(ref04[3]);
/* 216 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 217 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 218 */       arrayCadena.setCoParentesco(s1[2]);
/* 219 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 220 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 9) {
/* 221 */       arrayCadena.setSoBeneficio(s1[2]);
/*     */       
/* 223 */       String[] ref04 = s1[4].split(":", 0);
/* 224 */       arrayCadena.setNuSoBeneficio(ref04[1]);
/* 225 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 226 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 10) {
/* 227 */       arrayCadena.setTiDoContratante(s1[2]);
/*     */       
/* 229 */       String[] ref04 = s1[4].split(":", 0);
/* 230 */       arrayCadena.setIdReContratante(ref04[0]);
/* 231 */       arrayCadena.setCoReContratante(ref04[1]);
/* 232 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 233 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 11) {
/* 234 */       arrayCadena.setTiDoTitular(s1[2]);
/*     */       
/* 236 */       String[] ref04 = s1[4].split(":", 0);
/* 237 */       arrayCadena.setNuDoTitular(ref04[1]);
/* 238 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 239 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 12) {
/* 240 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiCobertura(s1[2]);
/*     */       
/* 242 */       String[] ref04 = s1[4].split(":", 0);
/* 243 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoSubTiCobertura(ref04[1]);
/* 244 */       tagREF = Integer.valueOf(12);
/*     */     } 
/*     */     
/* 247 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConCod271 cargarCamposDMG(String[] s1, InConCod271 arrayCadena) {
/* 252 */     if ("3".equals(tagHL) && s1[0].trim().equals("DMG")) {
/* 253 */       arrayCadena.setFeNacimiento(s1[2]);
/* 254 */       arrayCadena.setGenero(s1[3]);
/* 255 */       arrayCadena.setEsMarital(s1[4]);
/*     */     } 
/* 257 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConCod271 cargarCamposDTP(String[] s1, InConCod271 arrayCadena) {
/* 262 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 263 */       arrayCadena.setFeUpFoto(s1[3]);
/* 264 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 265 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 2) {
/* 266 */       arrayCadena.setFeIniVigencia(s1[3]);
/* 267 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 268 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 3) {
/* 269 */       arrayCadena.setFeFinVigencia(s1[3]);
/* 270 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 271 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 4) {
/* 272 */       arrayCadena.setFeInsTitular(s1[3]);
/* 273 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 274 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 5) {
/* 275 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinCarencia(s1[3]);
/* 276 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 277 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 6) {
/* 278 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinEspera(s1[3]);
/* 279 */       tagDTP = Integer.valueOf(5);
/*     */     } 
/* 281 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static InConCod271 cargarCamposEB(String[] s1, InConCod271 arrayCadena) {
/* 292 */     if (tagEB.intValue() == 1 && s1[0].trim().equals("EB")) {
/* 293 */       InConCod271Detalle detalle = new InConCod271Detalle();
/*     */       
/* 295 */       detalle.setInfBeneficio(s1[1]);
/* 296 */       detalle.setNuCobertura(s1[5]);
/* 297 */       detalle.setBeMaxInicial(s1[7]);
/* 298 */       detalle.setMoCobertura(s1[8]);
/* 299 */       detalle.setCoInRestriccion(s1[9]);
/* 300 */       detalle.setCanServicio(s1[10]);
/*     */       
/* 302 */       String[] eb13 = s1[13].split(":", 0);
/* 303 */       detalle.setIdProducto(eb13[1]);
/*     */       
/* 305 */       arrayCadena.addDetalle(detalle);
/* 306 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 307 */     } else if (tagEB.intValue() == 2 && s1[0].trim().equals("EB")) {
/* 308 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiMoneda(s1[5]);
/* 309 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPagoFijo(s1[7]);
/* 310 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoCalServicio(s1[9]);
/* 311 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCanCalServicio(s1[10]);
/*     */       
/* 313 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 314 */     } else if (tagEB.intValue() == 3 && s1[0].trim().equals("EB")) {
/* 315 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPagoVariable(s1[8]);
/*     */       
/* 317 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 318 */     } else if (tagEB.intValue() == 4 && s1[0].trim().equals("EB")) {
/* 319 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFlagCaGarantia(s1[1]);
/* 320 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeflagCaGarantia(s1[5]);
/*     */       
/* 322 */       tagEB = Integer.valueOf(1);
/*     */     } 
/* 324 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConCod271 cargarCamposMSG(String[] s1, InConCod271 arrayCadena) {
/* 328 */     if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 1) {
/* 329 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMsgObs(s1[1]);
/* 330 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 331 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 2) {
/* 332 */       ((InConCod271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMsgConEspeciales(s1[1]);
/* 333 */       tagMSG = Integer.valueOf(1);
/*     */     } 
/* 335 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConCod271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */