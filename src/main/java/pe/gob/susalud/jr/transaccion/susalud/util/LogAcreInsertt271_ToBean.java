/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InLogAcreInsert271;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LogAcreInsertt271_ToBean
/*     */ {
/*  15 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  16 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  17 */   private static Boolean flagST = Boolean.valueOf(true);
/*  18 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  19 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  20 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  21 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  22 */   private static Boolean flagDMG = Boolean.valueOf(true);
/*  23 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  24 */   private static Integer tagREF = Integer.valueOf(1);
/*  25 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  26 */   private static Integer tagDTP = Integer.valueOf(1);
/*  27 */   private static Integer tagDMG = Integer.valueOf(1);
/*  28 */   private static Integer tagEB = Integer.valueOf(1);
/*  29 */   private static String tagHL = null;
/*     */ 
/*     */   
/*     */   public static InLogAcreInsert271 traducirEstructura271(String cadena) {
/*  33 */     flagISA = Boolean.valueOf(true);
/*  34 */     flaGS = Boolean.valueOf(true);
/*  35 */     flagST = Boolean.valueOf(true);
/*  36 */     flagBHT = Boolean.valueOf(true);
/*  37 */     flagNM1 = Boolean.valueOf(true);
/*  38 */     flagREF = Boolean.valueOf(true);
/*  39 */     flagDTP = Boolean.valueOf(true);
/*  40 */     flagDMG = Boolean.valueOf(true);
/*  41 */     flagEB = Boolean.valueOf(true);
/*  42 */     tagREF = Integer.valueOf(1);
/*  43 */     tagNM1 = Integer.valueOf(1);
/*  44 */     tagDTP = Integer.valueOf(1);
/*  45 */     tagDMG = Integer.valueOf(1);
/*  46 */     tagEB = Integer.valueOf(1);
/*  47 */     tagHL = null;
/*     */     
/*  49 */     InLogAcreInsert271 inLogAcreInsert271 = new InLogAcreInsert271();
/*  50 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  52 */     for (String s2 : arrayCadena) {
/*     */       
/*  54 */       String dataCadena = s2;
/*  55 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  57 */       if (s1[0].trim().equals("ISA")) {
/*  58 */         if (flagISA.booleanValue()) {
/*  59 */           cargarCamposISA(s1, inLogAcreInsert271);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("GS")) {
/*  62 */         if (flaGS.booleanValue()) {
/*  63 */           cargarCamposGS(s1, inLogAcreInsert271);
/*     */         }
/*  65 */       } else if (s1[0].trim().equals("ST")) {
/*  66 */         if (flagST.booleanValue()) {
/*  67 */           cargarCamposST(s1, inLogAcreInsert271);
/*     */         }
/*  69 */       } else if (s1[0].trim().equals("BHT")) {
/*  70 */         if (flagBHT.booleanValue()) {
/*  71 */           cargarCamposBHT(s1, inLogAcreInsert271);
/*     */         }
/*  73 */       } else if (s1[0].trim().equals("HL")) {
/*  74 */         cargarCamposNM1(s1, inLogAcreInsert271);
/*  75 */       } else if (s1[0].trim().equals("NM1")) {
/*  76 */         if (flagNM1.booleanValue()) {
/*  77 */           cargarCamposNM1(s1, inLogAcreInsert271);
/*     */         }
/*  79 */       } else if (s1[0].trim().equals("REF")) {
/*  80 */         if (flagREF.booleanValue()) {
/*  81 */           cargarCamposREF(s1, inLogAcreInsert271);
/*     */         }
/*  83 */       } else if (s1[0].trim().equals("DMG")) {
/*  84 */         if (flagDMG.booleanValue()) {
/*  85 */           cargarCamposDMG(s1, inLogAcreInsert271);
/*     */         }
/*  87 */       } else if (s1[0].trim().equals("DTP")) {
/*  88 */         if (flagDTP.booleanValue()) {
/*  89 */           cargarCamposDTP(s1, inLogAcreInsert271);
/*     */         }
/*  91 */       } else if (s1[0].trim().equals("EB") && 
/*  92 */         flagEB.booleanValue()) {
/*  93 */         cargarCamposEB(s1, inLogAcreInsert271);
/*     */       } 
/*     */     } 
/*     */     
/*  97 */     return inLogAcreInsert271;
/*     */   }
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposISA(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 101 */     arrayCadena.setNoTransaccion("271_LOG_ACRE_INSERT");
/* 102 */     arrayCadena.setIdRemitente(s1[6]);
/* 103 */     arrayCadena.setIdReceptor(s1[8]);
/* 104 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 105 */     flagISA = Boolean.valueOf(false);
/* 106 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposGS(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 110 */     arrayCadena.setFeTransaccion(s1[4]);
/* 111 */     arrayCadena.setHoTransaccion(s1[5]);
/* 112 */     flaGS = Boolean.valueOf(false);
/* 113 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposST(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 117 */     arrayCadena.setIdTransaccion(s1[1]);
/* 118 */     flagST = Boolean.valueOf(false);
/* 119 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposBHT(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 123 */     arrayCadena.setTiFinalidad(s1[2]);
/* 124 */     flagBHT = Boolean.valueOf(false);
/*     */     
/* 126 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposNM1(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 131 */     if (s1[0].trim().equals("HL")) {
/* 132 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 135 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 136 */       arrayCadena.setCaRemitente(s1[2]);
/* 137 */       arrayCadena.setNuRucRemitente(s1[9]);
/* 138 */     } else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 139 */       arrayCadena.setCaReceptor(s1[2]);
/* 140 */     } else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 141 */       if (tagNM1.intValue() == 1) {
/* 142 */         arrayCadena.setCaPaciente(s1[2]);
/* 143 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 144 */         arrayCadena.setNoPaciente(s1[4]);
/* 145 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 146 */         arrayCadena.setApMaternoPaciente(s1[12]);
/*     */         
/* 148 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 149 */       } else if (tagNM1.intValue() == 2) {
/* 150 */         arrayCadena.setCaContratante(s1[2]);
/* 151 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 152 */       } else if (tagNM1.intValue() == 3) {
/* 153 */         arrayCadena.setCoAfiliadoTitular(s1[9]);
/*     */         
/* 155 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 156 */       } else if (tagNM1.intValue() == 4) {
/* 157 */         arrayCadena.setCaResponsableAut(s1[2]);
/* 158 */         arrayCadena.setNoPaResponsableAut(s1[3]);
/* 159 */         arrayCadena.setNoResponsableAut(s1[4]);
/* 160 */         arrayCadena.setNoMaResponsableAut(s1[12]);
/*     */         
/* 162 */         flagNM1 = Boolean.valueOf(false);
/*     */       } 
/*     */     } 
/* 165 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposREF(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 170 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 171 */       arrayCadena.setCoEsPaciente(s1[2]);
/* 172 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 173 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 174 */       arrayCadena.setTiDoPaciente(s1[2]);
/*     */       
/* 176 */       String[] ref04 = s1[4].split(":", 0);
/* 177 */       arrayCadena.setNuDoPaciente(ref04[1]);
/*     */       
/* 179 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 180 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 181 */       arrayCadena.setNuContratoPaciente(s1[2]);
/*     */       
/* 183 */       String[] ref04 = s1[4].split(":", 0);
/* 184 */       arrayCadena.setCoTiPolizaAfiliacion(ref04[1]);
/* 185 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 186 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 187 */       arrayCadena.setCoProducto(s1[2]);
/*     */       
/* 189 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 190 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 191 */       arrayCadena.setNuPlan(s1[2]);
/*     */       
/* 193 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 194 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 195 */       arrayCadena.setCoParentesco(s1[2]);
/*     */       
/* 197 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 198 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 199 */       arrayCadena.setTiDoContratante(s1[2]);
/*     */       
/* 201 */       String[] ref04 = s1[4].split(":", 0);
/* 202 */       arrayCadena.setIdReContratante(ref04[0]);
/* 203 */       arrayCadena.setRucContratante(ref04[1]);
/* 204 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 205 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 206 */       arrayCadena.setTiDoResponsableAut(s1[2]);
/*     */       
/* 208 */       String[] ref04 = s1[4].split(":", 0);
/* 209 */       arrayCadena.setNuDoResponsableAut(ref04[1]);
/* 210 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 211 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 9) {
/* 212 */       arrayCadena.setNuAutorizacion(s1[2]);
/*     */       
/* 214 */       flagREF = Boolean.valueOf(false);
/*     */     } 
/* 216 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposDMG(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 221 */     if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 1) {
/* 222 */       arrayCadena.setFeNacimiento(s1[2]);
/* 223 */       arrayCadena.setGenero(s1[3]);
/*     */       
/* 225 */       tagDMG = Integer.valueOf(tagDMG.intValue() + 1);
/* 226 */     } else if (s1[0].trim().equals("DMG") && tagDMG.intValue() == 2) {
/* 227 */       arrayCadena.setFeHoAutorizacion(s1[2]);
/*     */       
/* 229 */       flagDMG = Boolean.valueOf(false);
/*     */     } 
/* 231 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposDTP(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 236 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 237 */       arrayCadena.setFeIniVigencia(s1[3]);
/* 238 */       flagDTP = Boolean.valueOf(false);
/*     */     } 
/* 240 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InLogAcreInsert271 cargarCamposEB(String[] s1, InLogAcreInsert271 arrayCadena) {
/* 244 */     if (s1[0].trim().equals("EB") && tagEB.intValue() == 1) {
/* 245 */       arrayCadena.setNuCobertura(s1[2]);
/* 246 */       arrayCadena.setDeCobertura(s1[5]);
/* 247 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 248 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 2) {
/* 249 */       arrayCadena.setBeMaxInicial(s1[7]);
/* 250 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 251 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 3) {
/* 252 */       arrayCadena.setCoPagoFijo(s1[7]);
/* 253 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 254 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 4) {
/* 255 */       arrayCadena.setCoPagoVariable(s1[8]);
/* 256 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 257 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 5) {
/* 258 */       arrayCadena.setFlagCartaGarantia(s1[1]);
/* 259 */       arrayCadena.setDeFlagCartaGarantia(s1[5]);
/* 260 */       flagEB = Boolean.valueOf(false);
/*     */     } 
/*     */     
/* 263 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\LogAcreInsertt271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */