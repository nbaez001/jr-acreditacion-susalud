/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegAfi270_ToBean
/*     */ {
/*  17 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  18 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  19 */   private static Boolean flagST = Boolean.valueOf(true);
/*  20 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  21 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  22 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  23 */   private static Integer tagREF = Integer.valueOf(1);
/*  24 */   private static String tagHL = null;
/*     */ 
/*     */   
/*     */   public static InRegAfi270 traducirEstructura270(String cadena) {
/*  28 */     flagISA = Boolean.valueOf(true);
/*  29 */     flaGS = Boolean.valueOf(true);
/*  30 */     flagST = Boolean.valueOf(true);
/*  31 */     flagBHT = Boolean.valueOf(true);
/*  32 */     flagNM1 = Boolean.valueOf(true);
/*  33 */     flagREF = Boolean.valueOf(true);
/*  34 */     tagREF = Integer.valueOf(1);
/*  35 */     tagHL = null;
/*     */     
/*  37 */     InRegAfi270 inRegAfi270 = new InRegAfi270();
/*  38 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  40 */     for (String s2 : arrayCadena) {
/*     */       
/*  42 */       String dataCadena = s2;
/*  43 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  45 */       if (s1[0].trim().equals("ISA")) {
/*  46 */         if (flagISA.booleanValue()) {
/*  47 */           cargarCamposISA(s1, inRegAfi270);
/*     */         }
/*  49 */       } else if (s1[0].trim().equals("GS")) {
/*  50 */         if (flaGS.booleanValue()) {
/*  51 */           cargarCamposGS(s1, inRegAfi270);
/*     */         }
/*  53 */       } else if (s1[0].trim().equals("ST")) {
/*  54 */         if (flagST.booleanValue()) {
/*  55 */           cargarCamposST(s1, inRegAfi270);
/*     */         }
/*  57 */       } else if (s1[0].trim().equals("BHT")) {
/*  58 */         if (flagBHT.booleanValue()) {
/*  59 */           cargarCamposBHT(s1, inRegAfi270);
/*     */         }
/*  61 */       } else if (s1[0].trim().equals("HL")) {
/*  62 */         cargarCamposNM1(s1, inRegAfi270);
/*  63 */       } else if (s1[0].trim().equals("NM1")) {
/*  64 */         if (flagNM1.booleanValue()) {
/*  65 */           cargarCamposNM1(s1, inRegAfi270);
/*     */         }
/*  67 */       } else if (s1[0].trim().equals("REF")) {
/*  68 */         if (flagREF.booleanValue()) {
/*  69 */           cargarCamposREF(s1, inRegAfi270);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  76 */     return inRegAfi270;
/*     */   }
/*     */   
/*     */   private static InRegAfi270 cargarCamposISA(String[] s1, InRegAfi270 arrayCadena) {
/*  80 */     arrayCadena.setNoTransaccion("270_REGAFI");
/*  81 */     arrayCadena.setIdRemitente(s1[6]);
/*  82 */     arrayCadena.setIdReceptor(s1[8]);
/*  83 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  84 */     flagISA = Boolean.valueOf(false);
/*  85 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi270 cargarCamposGS(String[] s1, InRegAfi270 arrayCadena) {
/*  89 */     arrayCadena.setFeTransaccion(s1[4]);
/*  90 */     arrayCadena.setHoTransaccion(s1[5]);
/*  91 */     flaGS = Boolean.valueOf(false);
/*  92 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi270 cargarCamposST(String[] s1, InRegAfi270 arrayCadena) {
/*  96 */     arrayCadena.setIdTransaccion(s1[1]);
/*  97 */     flagST = Boolean.valueOf(false);
/*  98 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InRegAfi270 cargarCamposBHT(String[] s1, InRegAfi270 arrayCadena) {
/* 102 */     arrayCadena.setTiFinalidad(s1[2]);
/* 103 */     flagBHT = Boolean.valueOf(false);
/* 104 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi270 cargarCamposNM1(String[] s1, InRegAfi270 arrayCadena) {
/* 109 */     if (s1[0].trim().equals("HL")) {
/* 110 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 113 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 114 */       arrayCadena.setCaRemitente(s1[2]);
/* 115 */       arrayCadena.setNuRucRemitente(s1[9]);
/*     */     }
/* 117 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 118 */       arrayCadena.setCaReceptor(s1[2]);
/*     */     }
/* 120 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 121 */       arrayCadena.setCaPaciente(s1[2]);
/* 122 */       arrayCadena.setApPaternoPaciente(s1[3]);
/* 123 */       arrayCadena.setNoPaciente(s1[4]);
/* 124 */       arrayCadena.setApMaternoPaciente(s1[12]);
/* 125 */       flagNM1 = Boolean.valueOf(false);
/*     */     } 
/* 127 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InRegAfi270 cargarCamposREF(String[] s1, InRegAfi270 arrayCadena) {
/* 132 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 133 */       arrayCadena.setTiDocumento(s1[2]);
/*     */       
/* 135 */       String[] ref04 = s1[4].split(":", 0);
/* 136 */       arrayCadena.setNuDocumento(ref04[1]);
/* 137 */       flagREF = Boolean.valueOf(false);
/*     */     } 
/* 139 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\RegAfi270_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */