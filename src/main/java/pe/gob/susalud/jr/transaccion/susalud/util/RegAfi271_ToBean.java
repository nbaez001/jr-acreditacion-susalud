/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegAfi271_ToBean
/*     */ {
/*  16 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  17 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  18 */   private static Boolean flagST = Boolean.valueOf(true);
/*  19 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  20 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  21 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  22 */   private static Boolean flagN2 = Boolean.valueOf(true);
/*  23 */   private static Boolean flagN4 = Boolean.valueOf(true);
/*  24 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  25 */   private static Boolean flagDMG = Boolean.valueOf(true);
/*  26 */   private static Integer tagREF = Integer.valueOf(1);
/*  27 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  28 */   private static Integer tagDTP = Integer.valueOf(1);
/*  29 */   private static Integer tagDMG = Integer.valueOf(1);
/*  30 */   private static String tagHL = null;
/*     */   
/*     */   public static InRegAfi271 traducirEstructura271(String cadena) {
/*  33 */     flagISA = Boolean.valueOf(true);
/*  34 */     flaGS = Boolean.valueOf(true);
/*  35 */     flagST = Boolean.valueOf(true);
/*  36 */     flagBHT = Boolean.valueOf(true);
/*  37 */     flagNM1 = Boolean.valueOf(true);
/*  38 */     flagREF = Boolean.valueOf(true);
/*  39 */     flagN2 = Boolean.valueOf(true);
/*  40 */     flagN4 = Boolean.valueOf(true);
/*  41 */     flagDTP = Boolean.valueOf(true);
/*  42 */     flagDMG = Boolean.valueOf(true);
/*  43 */     tagREF = Integer.valueOf(1);
/*  44 */     tagNM1 = Integer.valueOf(1);
/*  45 */     tagDTP = Integer.valueOf(1);
/*  46 */     tagDMG = Integer.valueOf(1);
/*  47 */     tagHL = null;
/*     */     
/*  49 */     InRegAfi271 inRegAfi271 = new InRegAfi271();
/*  50 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  52 */     for (String s2 : arrayCadena) {
/*     */       
/*  54 */       String dataCadena = s2;
/*  55 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  57 */       if (s1[0].trim().equals("ISA")) {
/*  58 */         if (flagISA.booleanValue()) {
/*  59 */           cargarCamposISA(s1, inRegAfi271);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("GS")) {
/*  62 */         if (flaGS.booleanValue()) {
/*  63 */           cargarCamposGS(s1, inRegAfi271);
/*     */         }
/*  65 */       } else if (s1[0].trim().equals("ST")) {
/*  66 */         if (flagST.booleanValue()) {
/*  67 */           cargarCamposST(s1, inRegAfi271);
/*     */         }
/*  69 */       } else if (s1[0].trim().equals("BHT")) {
/*  70 */         if (flagBHT.booleanValue()) {
/*  71 */           cargarCamposBHT(s1, inRegAfi271);
/*     */         }
/*  73 */       } else if (s1[0].trim().equals("HL")) {
/*  74 */         cargarCamposNM1(s1, inRegAfi271);
/*  75 */       } else if (s1[0].trim().equals("NM1")) {
/*  76 */         if (flagNM1.booleanValue()) {
/*  77 */           cargarCamposNM1(s1, inRegAfi271);
/*     */         }
/*  79 */       } else if (s1[0].trim().equals("REF")) {
/*  80 */         if (flagREF.booleanValue()) {
/*  81 */           cargarCamposREF(s1, inRegAfi271);
/*     */         }
/*  83 */       } else if (s1[0].trim().equals("N2")) {
/*  84 */         if (flagN2.booleanValue()) {
/*  85 */           cargarCamposN2(s1, inRegAfi271);
/*     */         }
/*  87 */       } else if (s1[0].trim().equals("N4")) {
/*  88 */         if (flagN4.booleanValue()) {
/*  89 */           cargarCamposN4(s1, inRegAfi271);
/*     */         }
/*  91 */       } else if (s1[0].trim().equals("DMG")) {
/*  92 */         if (flagN2.booleanValue()) {
/*  93 */           cargarCamposDMG(s1, inRegAfi271);
/*     */         } else {
/*     */           break;
/*     */         } 
/*  97 */       } else if (s1[0].trim().equals("DTP") && 
/*  98 */         flagDTP.booleanValue()) {
/*  99 */         cargarCamposDTP(s1, inRegAfi271);
/*     */       } 
/*     */     } 
/*     */     
/* 103 */     return inRegAfi271;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposISA(String[] s1, InRegAfi271 arrayCadena) {
/* 107 */     arrayCadena.setNoTransaccion("271_REGAFI");
/* 108 */     arrayCadena.setIdRemitente(s1[6]);
/* 109 */     arrayCadena.setIdReceptor(s1[8]);
/* 110 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 111 */     flagISA = Boolean.valueOf(false);
/* 112 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposGS(String[] s1, InRegAfi271 arrayCadena) {
/* 116 */     arrayCadena.setFeTransaccion(s1[4]);
/* 117 */     arrayCadena.setHoTransaccion(s1[5]);
/* 118 */     flaGS = Boolean.valueOf(false);
/* 119 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposST(String[] s1, InRegAfi271 arrayCadena) {
/* 123 */     arrayCadena.setIdTransaccion(s1[1]);
/* 124 */     flagST = Boolean.valueOf(false);
/* 125 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposBHT(String[] s1, InRegAfi271 arrayCadena) {
/* 129 */     arrayCadena.setTiFinalidad(s1[2]);
/* 130 */     flagBHT = Boolean.valueOf(false);
/* 131 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi271 cargarCamposNM1(String[] s1, InRegAfi271 arrayCadena) {
/* 136 */     if (s1[0].trim().equals("HL")) {
/* 137 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 140 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 141 */       arrayCadena.setCaRemitente(s1[2]);
/* 142 */     } else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 143 */       arrayCadena.setCaReceptor(s1[2]);
/* 144 */       arrayCadena.setNuRucReceptor(s1[9]);
/* 145 */     } else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 146 */       if (tagNM1.intValue() == 1) {
/* 147 */         InRegAfi271Detalle detalle = new InRegAfi271Detalle();
/*     */         
/* 149 */         detalle.setCaPaciente(s1[2]);
/* 150 */         detalle.setApPaternoPaciente(s1[3]);
/* 151 */         detalle.setNoPaciente(s1[4]);
/* 152 */         detalle.setCoPaciente(s1[9]);
/* 153 */         detalle.setApMaternoPaciente(s1[12]);
/* 154 */         arrayCadena.addDetalle(detalle);
/*     */         
/* 156 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 157 */       } else if (tagNM1.intValue() == 2) {
/* 158 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCaAseguradora(s1[2]);
/* 159 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoAseguradora(s1[9]);
/*     */         
/* 161 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 162 */       } else if (tagNM1.intValue() == 3) {
/* 163 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCaTitular(s1[2]);
/* 164 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setApPaternoTitular(s1[3]);
/* 165 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoTitular(s1[4]);
/* 166 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTitular(s1[9]);
/* 167 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setApMaternoTitular(s1[12]);
/*     */         
/* 169 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 170 */       } else if (tagNM1.intValue() == 4) {
/* 171 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCaContratante(s1[2]);
/* 172 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setApPaternoContratante(s1[3]);
/* 173 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoContratante(s1[4]);
/* 174 */         ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setApMaternoContratante(s1[12]);
/* 175 */         tagNM1 = Integer.valueOf(1);
/*     */       } 
/*     */     } 
/* 178 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi271 cargarCamposREF(String[] s1, InRegAfi271 arrayCadena) {
/* 183 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 184 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDocumentoPaciente(s1[2]);
/*     */       
/* 186 */       String[] ref04 = s1[4].split(":", 0);
/* 187 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDocumentoPaciente(ref04[1]);
/* 188 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 189 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 190 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoContratoPaciente(s1[2]);
/* 191 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 192 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 193 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setEsPaciente(s1[2]);
/* 194 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 195 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 196 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiRegimenPaciente(s1[2]);
/* 197 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 198 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 199 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiPlanPaciente(s1[2]);
/* 200 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 201 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 202 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProductoPaciente(s1[2]);
/* 203 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 204 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 205 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPlanPaciente(s1[2]);
/* 206 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 207 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 208 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuCarnetPaciente(s1[2]);
/* 209 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 210 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 9) {
/* 211 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoVinculoFamPaciente(s1[2]);
/* 212 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 213 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 10) {
/* 214 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDocumentoTitular(s1[2]);
/*     */       
/* 216 */       String[] ref04 = s1[4].split(":", 0);
/* 217 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDocumentoTitular(ref04[1]);
/* 218 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 219 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 11) {
/* 220 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoEstablecimientoTitular(s1[2]);
/* 221 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 222 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 12) {
/* 223 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDocumentoContratante(s1[2]);
/*     */       
/* 225 */       String[] ref04 = s1[4].split(":", 0);
/* 226 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdReContratante(ref04[0]);
/* 227 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDocumentoContratante(ref04[1]);
/* 228 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 230 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposN2(String[] s1, InRegAfi271 arrayCadena) {
/* 234 */     if (s1[0].trim().equals("N2")) {
/* 235 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setApCasadaPaciente(s1[1]);
/*     */     }
/* 237 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi271 cargarCamposN4(String[] s1, InRegAfi271 arrayCadena) {
/* 241 */     if (s1[0].trim().equals("N4")) {
/* 242 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeUbigeoPaciente(s1[6]);
/*     */     }
/* 244 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi271 cargarCamposDMG(String[] s1, InRegAfi271 arrayCadena) {
/* 249 */     if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 1) {
/* 250 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeNacePaciente(s1[2]);
/* 251 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setGePaciente(s1[3]);
/* 252 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPaisPaciente(s1[7]);
/* 253 */       tagDMG = Integer.valueOf(tagDMG.intValue() + 1);
/* 254 */     } else if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 2) {
/* 255 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFallecidoTitular(s1[2]);
/* 256 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPaisTitular(s1[7]);
/* 257 */       tagDMG = Integer.valueOf(tagDMG.intValue() + 1);
/* 258 */     } else if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 3) {
/* 259 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoPaisContratante(s1[7]);
/* 260 */       tagDMG = Integer.valueOf(1);
/* 261 */       tagHL = "3";
/* 262 */       tagNM1 = Integer.valueOf(1);
/*     */     } 
/* 264 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi271 cargarCamposDTP(String[] s1, InRegAfi271 arrayCadena) {
/* 269 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 270 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFallecidoPaciente(s1[3]);
/* 271 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 272 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 2) {
/* 273 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeIniAfiliaPaciente(s1[3]);
/* 274 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 275 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 3) {
/* 276 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinAfiliaPaciente(s1[3]);
/* 277 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 278 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 4) {
/* 279 */       ((InRegAfi271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinAtencionPaciente(s1[3]);
/* 280 */       tagDTP = Integer.valueOf(1);
/*     */     } 
/*     */     
/* 283 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\RegAfi271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */