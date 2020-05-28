/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConDtad_ToBean
/*     */ {
/*  13 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  14 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  15 */   private static Boolean flagST = Boolean.valueOf(true);
/*  16 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  17 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  18 */   private static String tagHL = null;
/*  19 */   private static Boolean flagN3 = Boolean.valueOf(true);
/*  20 */   private static Boolean flagN4 = Boolean.valueOf(true);
/*  21 */   private static Boolean flagPER = Boolean.valueOf(true);
/*  22 */   private static Integer tagPER = Integer.valueOf(1);
/*  23 */   private static Integer tagNM1 = Integer.valueOf(1);
/*     */ 
/*     */   
/*     */   public static In271ConDtad traducirEstructura278ConDtad(String cadena) {
/*  27 */     flagISA = Boolean.valueOf(true);
/*  28 */     flaGS = Boolean.valueOf(true);
/*  29 */     flagST = Boolean.valueOf(true);
/*  30 */     flagBHT = Boolean.valueOf(true);
/*  31 */     flagNM1 = Boolean.valueOf(true);
/*  32 */     tagHL = null;
/*  33 */     flagN3 = Boolean.valueOf(true);
/*  34 */     flagN4 = Boolean.valueOf(true);
/*  35 */     flagPER = Boolean.valueOf(true);
/*  36 */     tagPER = Integer.valueOf(1);
/*  37 */     tagNM1 = Integer.valueOf(1);
/*     */     
/*  39 */     In271ConDtad in271ConDtad = new In271ConDtad();
/*  40 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  42 */     for (String s2 : arrayCadena) {
/*  43 */       String dataCadena = s2;
/*  44 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  46 */       if (s1[0].trim().equals("ISA")) {
/*  47 */         if (flagISA.booleanValue()) {
/*  48 */           cargarCamposISA(s1, in271ConDtad);
/*     */         }
/*  50 */       } else if (s1[0].trim().equals("GS")) {
/*  51 */         if (flaGS.booleanValue()) {
/*  52 */           cargarCamposGS(s1, in271ConDtad);
/*     */         }
/*  54 */       } else if (s1[0].trim().equals("ST")) {
/*  55 */         if (flagST.booleanValue()) {
/*  56 */           cargarCamposST(s1, in271ConDtad);
/*     */         }
/*  58 */       } else if (s1[0].trim().equals("BHT")) {
/*  59 */         if (flagBHT.booleanValue()) {
/*  60 */           cargarCamposBHT(s1, in271ConDtad);
/*     */         }
/*  62 */       } else if (s1[0].trim().equals("HL")) {
/*  63 */         cargarCamposNM1(s1, in271ConDtad);
/*  64 */       } else if (s1[0].trim().equals("NM1")) {
/*  65 */         if (flagNM1.booleanValue()) {
/*  66 */           cargarCamposNM1(s1, in271ConDtad);
/*     */         }
/*  68 */       } else if (s1[0].trim().equals("N3")) {
/*  69 */         if (flagN3.booleanValue()) {
/*  70 */           cargarCamposN3(s1, in271ConDtad);
/*     */         }
/*  72 */       } else if (s1[0].trim().equals("N4")) {
/*  73 */         if (flagN4.booleanValue()) {
/*  74 */           cargarCamposN4(s1, in271ConDtad);
/*     */         }
/*  76 */       } else if (s1[0].trim().equals("PER") && 
/*  77 */         flagPER.booleanValue()) {
/*  78 */         cargarCamposPER(s1, in271ConDtad);
/*     */       } 
/*     */     } 
/*     */     
/*  82 */     return in271ConDtad;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposISA(String[] s1, In271ConDtad arrayCadena) {
/*  86 */     arrayCadena.setNoTransaccion("271_CON_DTAD");
/*  87 */     arrayCadena.setIdRemitente(s1[6]);
/*  88 */     arrayCadena.setIdReceptor(s1[8]);
/*  89 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  90 */     flagISA = Boolean.valueOf(false);
/*  91 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposGS(String[] s1, In271ConDtad arrayCadena) {
/*  95 */     arrayCadena.setFeTransaccion(s1[4]);
/*  96 */     arrayCadena.setHoTransaccion(s1[5]);
/*  97 */     flaGS = Boolean.valueOf(false);
/*  98 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposST(String[] s1, In271ConDtad arrayCadena) {
/* 102 */     arrayCadena.setIdTransaccion(s1[1]);
/* 103 */     flagST = Boolean.valueOf(false);
/* 104 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposBHT(String[] s1, In271ConDtad arrayCadena) {
/* 108 */     arrayCadena.setTiFinalidad(s1[2]);
/* 109 */     flagBHT = Boolean.valueOf(false);
/* 110 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ConDtad cargarCamposNM1(String[] s1, In271ConDtad arrayCadena) {
/* 115 */     if (s1[0].trim().equals("HL")) {
/* 116 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 119 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 120 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 122 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 123 */       arrayCadena.setCaReceptor(s1[2]);
/* 124 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 126 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 127 */       if (tagNM1.intValue() == 1) {
/* 128 */         arrayCadena.setCaPaciente(s1[2]);
/* 129 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 130 */         arrayCadena.setNoPaciente(s1[4]);
/* 131 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 132 */         arrayCadena.setApMaternoPaciente(s1[12]);
/* 133 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 134 */       } else if (tagNM1.intValue() == 2) {
/* 135 */         arrayCadena.setTiCaCalificador(s1[2]);
/* 136 */         arrayCadena.setApPaNoEmCalificador(s1[3]);
/* 137 */         arrayCadena.setNoEmCalificador(s1[4]);
/* 138 */         arrayCadena.setApMaCalificador(s1[12]);
/* 139 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 140 */         flagNM1 = Boolean.valueOf(false);
/*     */       } 
/*     */     } 
/* 143 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposN3(String[] s1, In271ConDtad arrayCadena) {
/* 147 */     arrayCadena.setDeDirPaciente1(s1[1]);
/* 148 */     arrayCadena.setDeDirPaciente2(s1[2]);
/* 149 */     flagN3 = Boolean.valueOf(false);
/* 150 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposN4(String[] s1, In271ConDtad arrayCadena) {
/* 154 */     arrayCadena.setCoUbigeoPaciente(s1[6]);
/* 155 */     flagN4 = Boolean.valueOf(false);
/* 156 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConDtad cargarCamposPER(String[] s1, In271ConDtad arrayCadena) {
/* 160 */     if (s1[0].trim().equals("PER") && tagPER.intValue() == 1) {
/* 161 */       arrayCadena.setNoContacto(s1[2]);
/* 162 */       tagPER = Integer.valueOf(tagPER.intValue() + 1);
/* 163 */     } else if (s1[0].trim().equals("PER") && tagPER.intValue() == 2) {
/* 164 */       arrayCadena.setEmContacto(s1[4]);
/* 165 */       arrayCadena.setNuTeContacto(s1[6]);
/* 166 */       flagPER = Boolean.valueOf(false);
/*     */     } 
/* 168 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConDtad_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */