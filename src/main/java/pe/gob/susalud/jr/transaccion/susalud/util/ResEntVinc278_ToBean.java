/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResEntVinc278_ToBean
/*     */ {
/*  15 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  16 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  17 */   private static Boolean flagST = Boolean.valueOf(true);
/*  18 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  19 */   private static Boolean flagCRC = Boolean.valueOf(true);
/*  20 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*     */ 
/*     */   
/*     */   public static InResEntVinc278 traducirEstructura271(String cadena) {
/*  24 */     flagISA = Boolean.valueOf(true);
/*  25 */     flaGS = Boolean.valueOf(true);
/*  26 */     flagST = Boolean.valueOf(true);
/*  27 */     flagBHT = Boolean.valueOf(true);
/*  28 */     flagCRC = Boolean.valueOf(true);
/*  29 */     flagMSG = Boolean.valueOf(true);
/*     */     
/*  31 */     InResEntVinc278 inResEntVinc278 = new InResEntVinc278();
/*  32 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  34 */     for (String s2 : arrayCadena) {
/*     */       
/*  36 */       String dataCadena = s2;
/*  37 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  39 */       if (s1[0].trim().equals("ISA")) {
/*  40 */         if (flagISA.booleanValue()) {
/*  41 */           cargarCamposISA(s1, inResEntVinc278);
/*     */         }
/*  43 */       } else if (s1[0].trim().equals("GS")) {
/*  44 */         if (flaGS.booleanValue()) {
/*  45 */           cargarCamposGS(s1, inResEntVinc278);
/*     */         }
/*  47 */       } else if (s1[0].trim().equals("ST")) {
/*  48 */         if (flagST.booleanValue()) {
/*  49 */           cargarCamposST(s1, inResEntVinc278);
/*     */         }
/*  51 */       } else if (s1[0].trim().equals("BHT")) {
/*  52 */         if (flagBHT.booleanValue()) {
/*  53 */           cargarCamposBHT(s1, inResEntVinc278);
/*     */         }
/*  55 */       } else if (s1[0].trim().equals("CRC")) {
/*  56 */         if (flagCRC.booleanValue()) {
/*  57 */           cargarCamposCRC(s1, inResEntVinc278);
/*     */         }
/*  59 */       } else if (s1[0].trim().equals("MSG") && 
/*  60 */         flagMSG.booleanValue()) {
/*  61 */         cargarCamposMSG(s1, inResEntVinc278);
/*     */       } 
/*     */     } 
/*     */     
/*  65 */     return inResEntVinc278;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposISA(String[] s1, InResEntVinc278 arrayCadena) {
/*  69 */     arrayCadena.setNoTransaccion("278_RES_ENT_VINC");
/*  70 */     arrayCadena.setIdRemitente(s1[6]);
/*  71 */     arrayCadena.setIdReceptor(s1[8]);
/*  72 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  73 */     flagISA = Boolean.valueOf(false);
/*  74 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposGS(String[] s1, InResEntVinc278 arrayCadena) {
/*  78 */     arrayCadena.setFeTransaccion(s1[4]);
/*  79 */     arrayCadena.setHoTransaccion(s1[5]);
/*  80 */     flaGS = Boolean.valueOf(false);
/*  81 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposST(String[] s1, InResEntVinc278 arrayCadena) {
/*  85 */     arrayCadena.setIdTransaccion(s1[1]);
/*  86 */     flagST = Boolean.valueOf(false);
/*  87 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposBHT(String[] s1, InResEntVinc278 arrayCadena) {
/*  91 */     arrayCadena.setTiFinalidad(s1[2]);
/*  92 */     flagBHT = Boolean.valueOf(false);
/*     */     
/*  94 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposCRC(String[] s1, InResEntVinc278 arrayCadena) {
/*  98 */     arrayCadena.setRespuesta(s1[2]);
/*  99 */     flagBHT = Boolean.valueOf(false);
/*     */     
/* 101 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InResEntVinc278 cargarCamposMSG(String[] s1, InResEntVinc278 arrayCadena) {
/* 105 */     arrayCadena.setMsgRespuesta(s1[1]);
/* 106 */     flagBHT = Boolean.valueOf(false);
/*     */     
/* 108 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ResEntVinc278_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */