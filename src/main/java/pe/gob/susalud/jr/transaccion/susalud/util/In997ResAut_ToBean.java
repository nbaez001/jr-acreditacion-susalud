/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In997ResAut;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In997ResAut_ToBean
/*     */ {
/*  13 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  14 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  15 */   private static Boolean flagST = Boolean.valueOf(true);
/*  16 */   private static Boolean flagAK1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagAK2 = Boolean.valueOf(true);
/*  18 */   private static Boolean flagAK5 = Boolean.valueOf(true);
/*  19 */   private static Boolean flagAK9 = Boolean.valueOf(true);
/*     */   
/*     */   public static In997ResAut traducirEstructura997ResAut(String cadena) {
/*  22 */     flagISA = Boolean.valueOf(true);
/*  23 */     flaGS = Boolean.valueOf(true);
/*  24 */     flagST = Boolean.valueOf(true);
/*  25 */     flagAK1 = Boolean.valueOf(true);
/*  26 */     flagAK2 = Boolean.valueOf(true);
/*  27 */     flagAK5 = Boolean.valueOf(true);
/*  28 */     flagAK9 = Boolean.valueOf(true);
/*     */     
/*  30 */     In997ResAut in997ResAut = new In997ResAut();
/*  31 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  33 */     for (String s2 : arrayCadena) {
/*  34 */       String dataCadena = s2;
/*  35 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  37 */       if (s1[0].trim().equals("ISA")) {
/*  38 */         if (flagISA.booleanValue()) {
/*  39 */           cargarCamposISA(s1, in997ResAut);
/*     */         }
/*  41 */       } else if (s1[0].trim().equals("GS")) {
/*  42 */         if (flaGS.booleanValue()) {
/*  43 */           cargarCamposGS(s1, in997ResAut);
/*     */         }
/*  45 */       } else if (s1[0].trim().equals("ST")) {
/*  46 */         if (flagST.booleanValue()) {
/*  47 */           cargarCamposST(s1, in997ResAut);
/*     */         }
/*  49 */       } else if (s1[0].trim().equals("AK1")) {
/*  50 */         if (flagAK1.booleanValue()) {
/*  51 */           cargarCamposAK1(s1, in997ResAut);
/*     */         }
/*  53 */       } else if (s1[0].trim().equals("AK2")) {
/*  54 */         if (flagAK2.booleanValue()) {
/*  55 */           cargarCamposAK2(s1, in997ResAut);
/*     */         }
/*  57 */       } else if (s1[0].trim().equals("AK5")) {
/*  58 */         if (flagAK5.booleanValue()) {
/*  59 */           cargarCamposAK5(s1, in997ResAut);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("AK9") && 
/*  62 */         flagAK9.booleanValue()) {
/*  63 */         cargarCamposAK9(s1, in997ResAut);
/*     */       } 
/*     */     } 
/*     */     
/*  67 */     return in997ResAut;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposISA(String[] s1, In997ResAut arrayCadena) {
/*  71 */     arrayCadena.setNoTransaccion("997_RES_AUT");
/*  72 */     arrayCadena.setIdRemitente(s1[6]);
/*  73 */     arrayCadena.setIdReceptor(s1[8]);
/*  74 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  75 */     flagISA = Boolean.valueOf(false);
/*  76 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposGS(String[] s1, In997ResAut arrayCadena) {
/*  80 */     arrayCadena.setFeTransaccion(s1[4]);
/*  81 */     arrayCadena.setHoTransaccion(s1[5]);
/*  82 */     flaGS = Boolean.valueOf(false);
/*  83 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposST(String[] s1, In997ResAut arrayCadena) {
/*  87 */     arrayCadena.setIdTransaccion(s1[1]);
/*  88 */     flagST = Boolean.valueOf(false);
/*  89 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposAK1(String[] s1, In997ResAut arrayCadena) {
/*  93 */     arrayCadena.setNuAutorizacion(s1[3]);
/*  94 */     flagAK1 = Boolean.valueOf(false);
/*  95 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposAK2(String[] s1, In997ResAut arrayCadena) {
/*  99 */     arrayCadena.setCoSeguridad(s1[3]);
/* 100 */     flagAK2 = Boolean.valueOf(false);
/* 101 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposAK5(String[] s1, In997ResAut arrayCadena) {
/* 105 */     arrayCadena.setCoError(s1[1]);
/* 106 */     arrayCadena.setInCoErrorEncontrado(s1[2]);
/* 107 */     flagAK2 = Boolean.valueOf(false);
/* 108 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In997ResAut cargarCamposAK9(String[] s1, In997ResAut arrayCadena) {
/* 112 */     arrayCadena.setCoError(s1[1]);
/*     */     
/* 114 */     flagAK2 = Boolean.valueOf(false);
/* 115 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In997ResAut_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */