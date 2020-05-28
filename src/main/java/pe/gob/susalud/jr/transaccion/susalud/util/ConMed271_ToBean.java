/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConMed271_ToBean
/*     */ {
/*  12 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  13 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  14 */   private static Boolean flagST = Boolean.valueOf(true);
/*  15 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  16 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  18 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  19 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  20 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*  21 */   private static Integer tagREF = Integer.valueOf(1);
/*  22 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  23 */   private static Integer tagDTP = Integer.valueOf(1);
/*  24 */   private static Integer tagEB = Integer.valueOf(1);
/*  25 */   private static Integer tagMSG = Integer.valueOf(1);
/*  26 */   private static String tagHL = null;
/*     */ 
/*     */   
/*     */   public static InConMed271 traducirEstructura271(String cadena) {
/*  30 */     flagISA = Boolean.valueOf(true);
/*  31 */     flaGS = Boolean.valueOf(true);
/*  32 */     flagST = Boolean.valueOf(true);
/*  33 */     flagBHT = Boolean.valueOf(true);
/*  34 */     flagNM1 = Boolean.valueOf(true);
/*  35 */     flagREF = Boolean.valueOf(true);
/*  36 */     flagDTP = Boolean.valueOf(true);
/*  37 */     flagEB = Boolean.valueOf(true);
/*  38 */     flagMSG = Boolean.valueOf(true);
/*  39 */     tagREF = Integer.valueOf(1);
/*  40 */     tagNM1 = Integer.valueOf(1);
/*  41 */     tagDTP = Integer.valueOf(1);
/*  42 */     tagEB = Integer.valueOf(1);
/*  43 */     tagMSG = Integer.valueOf(1);
/*  44 */     tagHL = null;
/*     */     
/*  46 */     InConMed271 inConMed271 = new InConMed271();
/*  47 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  49 */     for (String s2 : arrayCadena) {
/*     */       
/*  51 */       String dataCadena = s2;
/*  52 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  54 */       if (s1[0].trim().equals("ISA")) {
/*  55 */         if (flagISA.booleanValue()) {
/*  56 */           cargarCamposISA(s1, inConMed271);
/*     */         }
/*  58 */       } else if (s1[0].trim().equals("GS")) {
/*  59 */         if (flaGS.booleanValue()) {
/*  60 */           cargarCamposGS(s1, inConMed271);
/*     */         }
/*  62 */       } else if (s1[0].trim().equals("ST")) {
/*  63 */         if (flagST.booleanValue()) {
/*  64 */           cargarCamposST(s1, inConMed271);
/*     */         }
/*  66 */       } else if (s1[0].trim().equals("BHT")) {
/*  67 */         if (flagBHT.booleanValue()) {
/*  68 */           cargarCamposBHT(s1, inConMed271);
/*     */         }
/*  70 */       } else if (s1[0].trim().equals("HL")) {
/*  71 */         cargarCamposNM1(s1, inConMed271);
/*  72 */       } else if (s1[0].trim().equals("NM1")) {
/*  73 */         if (flagNM1.booleanValue()) {
/*  74 */           cargarCamposNM1(s1, inConMed271);
/*     */         }
/*  76 */       } else if (s1[0].trim().equals("REF")) {
/*  77 */         if (flagREF.booleanValue()) {
/*  78 */           cargarCamposREF(s1, inConMed271);
/*     */         }
/*  80 */       } else if (s1[0].trim().equals("DTP")) {
/*  81 */         if (flagDTP.booleanValue()) {
/*  82 */           cargarCamposDTP(s1, inConMed271);
/*     */         }
/*  84 */       } else if (s1[0].trim().equals("EB")) {
/*  85 */         if (flagEB.booleanValue()) {
/*  86 */           cargarCamposEB(s1, inConMed271);
/*     */         }
/*  88 */       } else if (s1[0].trim().equals("MSG") && 
/*  89 */         flagMSG.booleanValue()) {
/*  90 */         cargarCamposMSG(s1, inConMed271);
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     return inConMed271;
/*     */   }
/*     */   
/*     */   private static InConMed271 cargarCamposISA(String[] s1, InConMed271 arrayCadena) {
/*  98 */     arrayCadena.setNoTransaccion("271_CON_MED");
/*  99 */     arrayCadena.setIdRemitente(s1[6]);
/* 100 */     arrayCadena.setIdReceptor(s1[8]);
/* 101 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 102 */     flagISA = Boolean.valueOf(false);
/* 103 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConMed271 cargarCamposGS(String[] s1, InConMed271 arrayCadena) {
/* 107 */     arrayCadena.setFeTransaccion(s1[4]);
/* 108 */     arrayCadena.setHoTransaccion(s1[5]);
/* 109 */     flaGS = Boolean.valueOf(false);
/* 110 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConMed271 cargarCamposST(String[] s1, InConMed271 arrayCadena) {
/* 114 */     arrayCadena.setIdTransaccion(s1[1]);
/* 115 */     flagST = Boolean.valueOf(false);
/* 116 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConMed271 cargarCamposBHT(String[] s1, InConMed271 arrayCadena) {
/* 120 */     arrayCadena.setTiFinalidad(s1[2]);
/* 121 */     flagBHT = Boolean.valueOf(false);
/* 122 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConMed271 cargarCamposNM1(String[] s1, InConMed271 arrayCadena) {
/* 127 */     if (s1[0].trim().equals("HL")) {
/* 128 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 131 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 132 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 134 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 135 */       arrayCadena.setCaReceptor(s1[2]);
/* 136 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 138 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/*     */       
/* 140 */       if (tagNM1.intValue() == 1) {
/*     */         
/* 142 */         arrayCadena.setCaPaciente(s1[2]);
/* 143 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 144 */         arrayCadena.setNoPaciente(s1[4]);
/* 145 */         arrayCadena.setCoPaciente(s1[9]);
/* 146 */         arrayCadena.setApMaternoPaciente(s1[12]);
/*     */       } 
/*     */     } 
/* 149 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConMed271 cargarCamposREF(String[] s1, InConMed271 arrayCadena) {
/* 154 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 155 */       ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDePreexistencia(s1[3]);
/* 156 */       tagREF = Integer.valueOf(1);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConMed271 cargarCamposDTP(String[] s1, InConMed271 arrayCadena) {
/* 167 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 168 */       ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiEspera(s1[3]);
/* 169 */       tagDTP = Integer.valueOf(1);
/*     */     } 
/*     */     
/* 172 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConMed271 cargarCamposEB(String[] s1, InConMed271 arrayCadena) {
/* 177 */     if ("3".equals(tagHL)) {
/* 178 */       if (tagEB.intValue() == 1 && s1[0].trim().equals("EB")) {
/* 179 */         InConMed271Detalle detalle = new InConMed271Detalle();
/* 180 */         detalle.setCoSeCIE10(s1[3]);
/*     */         
/* 182 */         String[] eb13 = s1[13].split(":", 0);
/* 183 */         detalle.setCoRestriccion(eb13[1]);
/*     */         
/* 185 */         arrayCadena.addDetalle(detalle);
/* 186 */         tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 187 */       } else if (tagEB.intValue() == 2 && s1[0].trim().equals("EB")) {
/* 188 */         ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setEsCobertura(s1[1]);
/* 189 */         ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMoDiagnostico(s1[8]);
/*     */         
/* 191 */         tagEB = Integer.valueOf(1);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConMed271 cargarCamposMSG(String[] s1, InConMed271 arrayCadena) {
/* 206 */     if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 1) {
/* 207 */       ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMsgObsPr(s1[1]);
/* 208 */       ((InConMed271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdFuenteRE(s1[3]);
/* 209 */       tagMSG = Integer.valueOf(1);
/*     */     } 
/* 211 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConMed271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */