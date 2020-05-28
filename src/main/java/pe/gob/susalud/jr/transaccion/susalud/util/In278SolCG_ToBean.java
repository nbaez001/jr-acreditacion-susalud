/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In278SolCG_ToBean
/*     */ {
/*  12 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  13 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  14 */   private static Boolean flagST = Boolean.valueOf(true);
/*  15 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  16 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  18 */   private static Integer tagREF = Integer.valueOf(1);
/*  19 */   private static String tagHL = null;
/*     */   
/*     */   public static In278SolCG traducirEstructura278Sol(String cadena) {
/*  22 */     flagISA = Boolean.valueOf(true);
/*  23 */     flaGS = Boolean.valueOf(true);
/*  24 */     flagST = Boolean.valueOf(true);
/*  25 */     flagBHT = Boolean.valueOf(true);
/*  26 */     flagNM1 = Boolean.valueOf(true);
/*  27 */     flagREF = Boolean.valueOf(true);
/*  28 */     tagREF = Integer.valueOf(1);
/*  29 */     tagHL = null;
/*     */     
/*  31 */     In278SolCG in278SolCG = new In278SolCG();
/*  32 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  34 */     for (String s2 : arrayCadena) {
/*  35 */       String dataCadena = s2;
/*  36 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  38 */       if (s1[0].trim().equals("ISA")) {
/*  39 */         if (flagISA.booleanValue()) {
/*  40 */           cargarCamposISA(s1, in278SolCG);
/*     */         }
/*  42 */       } else if (s1[0].trim().equals("GS")) {
/*  43 */         if (flaGS.booleanValue()) {
/*  44 */           cargarCamposGS(s1, in278SolCG);
/*     */         }
/*  46 */       } else if (s1[0].trim().equals("ST")) {
/*  47 */         if (flagST.booleanValue()) {
/*  48 */           cargarCamposST(s1, in278SolCG);
/*     */         }
/*  50 */       } else if (s1[0].trim().equals("BHT")) {
/*  51 */         if (flagBHT.booleanValue()) {
/*  52 */           cargarCamposBHT(s1, in278SolCG);
/*     */         }
/*  54 */       } else if (s1[0].trim().equals("HL")) {
/*  55 */         cargarCamposNM1(s1, in278SolCG);
/*  56 */       } else if (s1[0].trim().equals("NM1")) {
/*  57 */         if (flagNM1.booleanValue()) {
/*  58 */           cargarCamposNM1(s1, in278SolCG);
/*     */         }
/*  60 */       } else if (s1[0].trim().equals("REF")) {
/*  61 */         if (flagREF.booleanValue()) {
/*  62 */           cargarCamposREF(s1, in278SolCG);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  68 */     return in278SolCG;
/*     */   }
/*     */   
/*     */   private static In278SolCG cargarCamposISA(String[] s1, In278SolCG arrayCadena) {
/*  72 */     arrayCadena.setNoTransaccion("278_SOL_CG");
/*  73 */     arrayCadena.setIdRemitente(s1[6]);
/*  74 */     arrayCadena.setIdReceptor(s1[8]);
/*  75 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  76 */     flagISA = Boolean.valueOf(false);
/*  77 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278SolCG cargarCamposGS(String[] s1, In278SolCG arrayCadena) {
/*  81 */     arrayCadena.setFeTransaccion(s1[4]);
/*  82 */     arrayCadena.setHoTransaccion(s1[5]);
/*  83 */     flaGS = Boolean.valueOf(false);
/*  84 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278SolCG cargarCamposST(String[] s1, In278SolCG arrayCadena) {
/*  88 */     arrayCadena.setIdTransaccion(s1[1]);
/*  89 */     flagST = Boolean.valueOf(false);
/*  90 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278SolCG cargarCamposBHT(String[] s1, In278SolCG arrayCadena) {
/*  94 */     arrayCadena.setTiFinalidad(s1[2]);
/*  95 */     flagBHT = Boolean.valueOf(false);
/*  96 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In278SolCG cargarCamposNM1(String[] s1, In278SolCG arrayCadena) {
/* 101 */     if (s1[0].trim().equals("HL")) {
/* 102 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 105 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 106 */       arrayCadena.setCaPaciente(s1[2]);
/* 107 */       arrayCadena.setApPaternoPaciente(s1[3]);
/* 108 */       arrayCadena.setNoPaciente(s1[4]);
/* 109 */       arrayCadena.setApMaternoPaciente(s1[12]);
/* 110 */       flagNM1 = Boolean.valueOf(false);
/*     */     } 
/* 112 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In278SolCG cargarCamposREF(String[] s1, In278SolCG arrayCadena) {
/* 117 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 118 */       arrayCadena.setCoTiDoPaciente(s1[2]);
/*     */       
/* 120 */       String[] ref04 = s1[4].split(":", 0);
/* 121 */       arrayCadena.setNuDoPaciente(ref04[1]);
/* 122 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 123 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 124 */       arrayCadena.setNuCarGarantia(s1[2]);
/*     */       
/* 126 */       String[] ref04 = s1[4].split(":", 0);
/* 127 */       arrayCadena.setEsCarGarantia(ref04[1]);
/* 128 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 129 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/*     */       
/* 131 */       String[] ref04 = s1[4].split(":", 0);
/* 132 */       arrayCadena.setNuSoCarGarantia(ref04[1]);
/* 133 */       flagREF = Boolean.valueOf(false);
/*     */     } 
/* 135 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In278SolCG_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */