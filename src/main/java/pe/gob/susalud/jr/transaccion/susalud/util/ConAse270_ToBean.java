/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConAse270_ToBean
/*     */ {
/*  11 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  12 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  13 */   private static Boolean flagST = Boolean.valueOf(true);
/*  14 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  15 */   private static Boolean flagNM1 = Boolean.valueOf(true), flagPRV = Boolean.valueOf(true);
/*  16 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  17 */   private static Integer tagREF = Integer.valueOf(1);
/*  18 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  19 */   private static Integer tagDTP = Integer.valueOf(1);
/*  20 */   private static String tagHL = null;
/*  21 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*     */   
/*     */   public static InConAse270 traducirEstructura270(String cadena) {
/*  24 */     flagISA = Boolean.valueOf(true);
/*  25 */     flaGS = Boolean.valueOf(true);
/*  26 */     flagST = Boolean.valueOf(true);
/*  27 */     flagBHT = Boolean.valueOf(true);
/*  28 */     flagNM1 = Boolean.valueOf(true);
/*  29 */     flagPRV = Boolean.valueOf(true);
/*  30 */     flagREF = Boolean.valueOf(true);
/*  31 */     tagREF = Integer.valueOf(1);
/*  32 */     tagNM1 = Integer.valueOf(1);
/*  33 */     tagDTP = Integer.valueOf(1);
/*  34 */     tagHL = null;
/*  35 */     flagDTP = Boolean.valueOf(true);
/*     */     
/*  37 */     InConAse270 inConAse270 = new InConAse270();
/*  38 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  40 */     for (String s2 : arrayCadena) {
/*     */       
/*  42 */       String dataCadena = s2;
/*  43 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  45 */       if (s1[0].trim().equals("ISA")) {
/*  46 */         if (flagISA.booleanValue()) {
/*  47 */           cargarCamposISA(s1, inConAse270);
/*     */         }
/*  49 */       } else if (s1[0].trim().equals("GS")) {
/*  50 */         if (flaGS.booleanValue()) {
/*  51 */           cargarCamposGS(s1, inConAse270);
/*     */         }
/*  53 */       } else if (s1[0].trim().equals("ST")) {
/*  54 */         if (flagST.booleanValue()) {
/*  55 */           cargarCamposST(s1, inConAse270);
/*     */         }
/*  57 */       } else if (s1[0].trim().equals("BHT")) {
/*  58 */         if (flagBHT.booleanValue()) {
/*  59 */           cargarCamposBHT(s1, inConAse270);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("HL")) {
/*  62 */         cargarCamposNM1(s1, inConAse270);
/*  63 */       } else if (s1[0].trim().equals("NM1")) {
/*  64 */         if (flagNM1.booleanValue()) {
/*  65 */           cargarCamposNM1(s1, inConAse270);
/*     */         }
/*  67 */       } else if (s1[0].trim().equals("PRV")) {
/*  68 */         if (flagPRV.booleanValue()) {
/*  69 */           cargarCamposPRV(s1, inConAse270);
/*     */         }
/*  71 */       } else if (s1[0].trim().equals("REF")) {
/*  72 */         if (flagREF.booleanValue()) {
/*  73 */           cargarCamposREF(s1, inConAse270);
/*     */         } else {
/*     */           break;
/*     */         } 
/*  77 */       } else if (s1[0].trim().equals("DTP")) {
/*  78 */         if (flagDTP.booleanValue()) {
/*  79 */           cargarCamposDTP(s1, inConAse270);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  85 */     return inConAse270;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposISA(String[] s1, InConAse270 arrayCadena) {
/*  89 */     arrayCadena.setNoTransaccion("270_CON_ASE");
/*  90 */     arrayCadena.setIdRemitente(s1[6]);
/*  91 */     arrayCadena.setIdReceptor(s1[8]);
/*  92 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  93 */     flagISA = Boolean.valueOf(false);
/*  94 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposGS(String[] s1, InConAse270 arrayCadena) {
/*  98 */     arrayCadena.setFeTransaccion(s1[4]);
/*  99 */     arrayCadena.setHoTransaccion(s1[5]);
/* 100 */     flaGS = Boolean.valueOf(false);
/* 101 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposST(String[] s1, InConAse270 arrayCadena) {
/* 105 */     arrayCadena.setIdTransaccion(s1[1]);
/* 106 */     flagST = Boolean.valueOf(false);
/* 107 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposBHT(String[] s1, InConAse270 arrayCadena) {
/* 111 */     arrayCadena.setTiFinalidad(s1[2]);
/* 112 */     flagBHT = Boolean.valueOf(false);
/* 113 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConAse270 cargarCamposNM1(String[] s1, InConAse270 arrayCadena) {
/* 118 */     if (s1[0].trim().equals("HL")) {
/* 119 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 122 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 123 */       arrayCadena.setCaRemitente(s1[2]);
/* 124 */       arrayCadena.setNuRucRemitente(s1[9]);
/*     */     }
/* 126 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 127 */       arrayCadena.setCaReceptor(s1[2]);
/*     */     }
/* 129 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 130 */       if (tagNM1.intValue() == 1) {
/* 131 */         arrayCadena.setCaPaciente(s1[2]);
/* 132 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 133 */         arrayCadena.setNoPaciente(s1[4]);
/* 134 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 135 */         arrayCadena.setApMaternoPaciente(s1[12]);
/* 136 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 137 */       } else if (tagNM1.intValue() == 2) {
/* 138 */         arrayCadena.setTiCaContratante(s1[2]);
/* 139 */         arrayCadena.setNoPaContratante(s1[3]);
/* 140 */         arrayCadena.setNoContratante(s1[4]);
/* 141 */         arrayCadena.setNoMaContratante(s1[12]);
/* 142 */         flagNM1 = Boolean.valueOf(false);
/*     */       } 
/*     */     } 
/* 145 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConAse270 cargarCamposREF(String[] s1, InConAse270 arrayCadena) {
/* 150 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 151 */       arrayCadena.setTiDocumento(s1[2]);
/* 152 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 153 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 154 */       arrayCadena.setNuDocumento(s1[2]);
/* 155 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 156 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 157 */       arrayCadena.setCoProducto(s1[2]);
/* 158 */       arrayCadena.setDeProducto(s1[3]);
/*     */       
/* 160 */       String[] ref04 = s1[4].split(":", 0);
/* 161 */       arrayCadena.setCoInProducto(ref04[1]);
/* 162 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 163 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 164 */       arrayCadena.setNuCobertura(s1[2]);
/* 165 */       arrayCadena.setDeCobertura(s1[3]);
/*     */       
/* 167 */       String[] ref04 = s1[4].split(":", 0);
/* 168 */       arrayCadena.setCaServicio(ref04[0]);
/* 169 */       arrayCadena.setCoCalservicio(ref04[1]);
/* 170 */       arrayCadena.setBeMaxInicial(ref04[3]);
/* 171 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 172 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 173 */       arrayCadena.setCoTiCobertura(s1[2]);
/*     */       
/* 175 */       String[] ref04 = s1[4].split(":", 0);
/* 176 */       arrayCadena.setCoSuTiCobertura(ref04[1]);
/* 177 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 178 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 179 */       arrayCadena.setCoAplicativoTx(s1[2]);
/* 180 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 181 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 182 */       arrayCadena.setCoEspecialidad(s1[2]);
/* 183 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 184 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 185 */       arrayCadena.setCoParentesco(s1[2]);
/* 186 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 187 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 9) {
/* 188 */       arrayCadena.setNuPlan(s1[2]);
/*     */       
/* 190 */       String[] ref04 = s1[4].split(":", 0);
/* 191 */       arrayCadena.setNuAutOrigen(ref04[1]);
/*     */       
/* 193 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 194 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 10) {
/* 195 */       arrayCadena.setTiAccidente(s1[2]);
/*     */       
/* 197 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 198 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 11) {
/* 199 */       arrayCadena.setTiDoContratante(s1[2]);
/*     */       
/* 201 */       String[] ref04 = s1[4].split(":", 0);
/* 202 */       arrayCadena.setIdReContratante(ref04[0]);
/* 203 */       arrayCadena.setCoReContratante(ref04[1]);
/*     */       
/* 205 */       flagREF = Boolean.valueOf(false);
/*     */     } 
/* 207 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposPRV(String[] s1, InConAse270 arrayCadena) {
/* 211 */     arrayCadena.setTxRequest(s1[3]);
/* 212 */     flagPRV = Boolean.valueOf(false);
/* 213 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConAse270 cargarCamposDTP(String[] s1, InConAse270 arrayCadena) {
/* 217 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 218 */       arrayCadena.setFeAccidente(s1[3]);
/*     */     }
/* 220 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConAse270_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */