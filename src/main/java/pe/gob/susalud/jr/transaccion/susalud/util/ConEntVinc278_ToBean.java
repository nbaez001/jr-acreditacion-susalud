/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConEntVinc278_ToBean
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
/*     */   public static InConEntVinc278 traducirEstructura271(String cadena) {
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
/*  49 */     InConEntVinc278 inSolEntVinc270 = new InConEntVinc278();
/*  50 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  52 */     for (String s2 : arrayCadena) {
/*     */       
/*  54 */       String dataCadena = s2;
/*  55 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  57 */       if (s1[0].trim().equals("ISA")) {
/*  58 */         if (flagISA.booleanValue()) {
/*  59 */           cargarCamposISA(s1, inSolEntVinc270);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("GS")) {
/*  62 */         if (flaGS.booleanValue()) {
/*  63 */           cargarCamposGS(s1, inSolEntVinc270);
/*     */         }
/*  65 */       } else if (s1[0].trim().equals("ST")) {
/*  66 */         if (flagST.booleanValue()) {
/*  67 */           cargarCamposST(s1, inSolEntVinc270);
/*     */         }
/*  69 */       } else if (s1[0].trim().equals("BHT")) {
/*  70 */         if (flagBHT.booleanValue()) {
/*  71 */           cargarCamposBHT(s1, inSolEntVinc270);
/*     */         }
/*  73 */       } else if (s1[0].trim().equals("HL")) {
/*  74 */         cargarCamposNM1(s1, inSolEntVinc270);
/*  75 */       } else if (s1[0].trim().equals("NM1")) {
/*  76 */         if (flagNM1.booleanValue()) {
/*  77 */           cargarCamposNM1(s1, inSolEntVinc270);
/*     */         }
/*  79 */       } else if (s1[0].trim().equals("REF") && 
/*  80 */         flagREF.booleanValue()) {
/*  81 */         cargarCamposREF(s1, inSolEntVinc270);
/*     */       } 
/*     */     } 
/*     */     
/*  85 */     return inSolEntVinc270;
/*     */   }
/*     */   
/*     */   private static InConEntVinc278 cargarCamposISA(String[] s1, InConEntVinc278 arrayCadena) {
/*  89 */     arrayCadena.setNoTransaccion("278_CON_ENT_VINC");
/*  90 */     arrayCadena.setIdRemitente(s1[6]);
/*  91 */     arrayCadena.setIdReceptor(s1[8]);
/*  92 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  93 */     flagISA = Boolean.valueOf(false);
/*  94 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConEntVinc278 cargarCamposGS(String[] s1, InConEntVinc278 arrayCadena) {
/*  98 */     arrayCadena.setFeTransaccion(s1[4]);
/*  99 */     arrayCadena.setHoTransaccion(s1[5]);
/* 100 */     flaGS = Boolean.valueOf(false);
/* 101 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConEntVinc278 cargarCamposST(String[] s1, InConEntVinc278 arrayCadena) {
/* 105 */     arrayCadena.setIdTransaccion(s1[1]);
/* 106 */     flagST = Boolean.valueOf(false);
/* 107 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConEntVinc278 cargarCamposBHT(String[] s1, InConEntVinc278 arrayCadena) {
/* 111 */     arrayCadena.setTiFinalidad(s1[2]);
/* 112 */     flagBHT = Boolean.valueOf(false);
/*     */     
/* 114 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConEntVinc278 cargarCamposNM1(String[] s1, InConEntVinc278 arrayCadena) {
/* 119 */     if (s1[0].trim().equals("HL")) {
/* 120 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 123 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 124 */       arrayCadena.setCaIPRESS(s1[2]);
/* 125 */       arrayCadena.setNoIPRESS(s1[4]);
/*     */       
/* 127 */       flagNM1 = Boolean.valueOf(false);
/*     */     } 
/* 129 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConEntVinc278 cargarCamposREF(String[] s1, InConEntVinc278 arrayCadena) {
/* 134 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 135 */       arrayCadena.setTiDoIPRESS(s1[2]);
/*     */       
/* 137 */       String[] ref04 = s1[4].split(":", 0);
/* 138 */       arrayCadena.setNuRucIPRESS(ref04[1]);
/*     */       
/* 140 */       flagREF = Boolean.valueOf(false);
/*     */     } 
/* 142 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConEntVinc278_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */