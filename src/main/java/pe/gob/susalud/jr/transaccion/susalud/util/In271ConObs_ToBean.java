/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConObs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConObs_ToBean
/*     */ {
/*  12 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  13 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  14 */   private static Boolean flagST = Boolean.valueOf(true);
/*  15 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  16 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  18 */   private static String tagHL = null;
/*  19 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*  20 */   private static Integer tagMSG = Integer.valueOf(1);
/*  21 */   private static Integer tagEB = Integer.valueOf(1);
/*     */   
/*     */   public static In271ConObs traducirEstructura271ConObs(String cadena) {
/*  24 */     flagISA = Boolean.valueOf(true);
/*  25 */     flaGS = Boolean.valueOf(true);
/*  26 */     flagST = Boolean.valueOf(true);
/*  27 */     flagBHT = Boolean.valueOf(true);
/*  28 */     flagNM1 = Boolean.valueOf(true);
/*  29 */     flagEB = Boolean.valueOf(true);
/*  30 */     tagHL = null;
/*  31 */     flagMSG = Boolean.valueOf(true);
/*  32 */     tagMSG = Integer.valueOf(1);
/*  33 */     tagEB = Integer.valueOf(1);
/*     */     
/*  35 */     In271ConObs in271ConObs = new In271ConObs();
/*  36 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  38 */     for (String s2 : arrayCadena) {
/*  39 */       String dataCadena = s2;
/*  40 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  42 */       if (s1[0].trim().equals("ISA")) {
/*  43 */         if (flagISA.booleanValue()) {
/*  44 */           cargarCamposISA(s1, in271ConObs);
/*     */         }
/*  46 */       } else if (s1[0].trim().equals("GS")) {
/*  47 */         if (flaGS.booleanValue()) {
/*  48 */           cargarCamposGS(s1, in271ConObs);
/*     */         }
/*  50 */       } else if (s1[0].trim().equals("ST")) {
/*  51 */         if (flagST.booleanValue()) {
/*  52 */           cargarCamposST(s1, in271ConObs);
/*     */         }
/*  54 */       } else if (s1[0].trim().equals("BHT")) {
/*  55 */         if (flagBHT.booleanValue()) {
/*  56 */           cargarCamposBHT(s1, in271ConObs);
/*     */         }
/*  58 */       } else if (s1[0].trim().equals("HL")) {
/*  59 */         cargarCamposNM1(s1, in271ConObs);
/*  60 */       } else if (s1[0].trim().equals("NM1")) {
/*  61 */         if (flagNM1.booleanValue()) {
/*  62 */           cargarCamposNM1(s1, in271ConObs);
/*     */         }
/*  64 */       } else if (s1[0].trim().equals("EB")) {
/*  65 */         if (flagEB.booleanValue()) {
/*  66 */           cargarCamposEB(s1, in271ConObs);
/*     */         }
/*  68 */       } else if (s1[0].trim().equals("MSG") && 
/*  69 */         flagMSG.booleanValue()) {
/*  70 */         cargarCamposMSG(s1, in271ConObs);
/*     */       } 
/*     */     } 
/*     */     
/*  74 */     return in271ConObs;
/*     */   }
/*     */   
/*     */   private static In271ConObs cargarCamposISA(String[] s1, In271ConObs arrayCadena) {
/*  78 */     arrayCadena.setNoTransaccion("271_CON_OBS");
/*  79 */     arrayCadena.setIdRemitente(s1[6]);
/*  80 */     arrayCadena.setIdReceptor(s1[8]);
/*  81 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  82 */     flagISA = Boolean.valueOf(false);
/*  83 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConObs cargarCamposGS(String[] s1, In271ConObs arrayCadena) {
/*  87 */     arrayCadena.setFeTransaccion(s1[4]);
/*  88 */     arrayCadena.setHoTransaccion(s1[5]);
/*  89 */     flaGS = Boolean.valueOf(false);
/*  90 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConObs cargarCamposST(String[] s1, In271ConObs arrayCadena) {
/*  94 */     arrayCadena.setIdTransaccion(s1[1]);
/*  95 */     flagST = Boolean.valueOf(false);
/*  96 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ConObs cargarCamposBHT(String[] s1, In271ConObs arrayCadena) {
/* 100 */     arrayCadena.setTiFinalidad(s1[2]);
/* 101 */     flagBHT = Boolean.valueOf(false);
/* 102 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ConObs cargarCamposNM1(String[] s1, In271ConObs arrayCadena) {
/* 107 */     if (s1[0].trim().equals("HL")) {
/* 108 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 111 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 112 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 114 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 115 */       arrayCadena.setCaReceptor(s1[2]);
/* 116 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 118 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 119 */       arrayCadena.setCaPaciente(s1[2]);
/* 120 */       arrayCadena.setApPaternoPaciente(s1[3]);
/* 121 */       arrayCadena.setNoPaciente(s1[4]);
/* 122 */       arrayCadena.setCoAfPaciente(s1[9]);
/* 123 */       arrayCadena.setApMaternoPaciente(s1[12]);
/* 124 */       flagNM1 = Boolean.valueOf(false);
/*     */     } 
/* 126 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ConObs cargarCamposEB(String[] s1, In271ConObs arrayCadena) {
/* 131 */     if (s1[0].trim().equals("EB") && tagEB.intValue() == 1) {
/* 132 */       arrayCadena.setCoSubCobertura(s1[5]);
/*     */       
/* 134 */       flagEB = Boolean.valueOf(false);
/*     */     } 
/* 136 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ConObs cargarCamposMSG(String[] s1, In271ConObs arrayCadena) {
/* 141 */     if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 1) {
/* 142 */       arrayCadena.setTeMsgLibre1(s1[1]);
/*     */       
/* 144 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 145 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 2) {
/* 146 */       arrayCadena.setTeMsgLibre2(s1[1]);
/*     */       
/* 148 */       flagMSG = Boolean.valueOf(false);
/*     */     } 
/* 150 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConObs_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */