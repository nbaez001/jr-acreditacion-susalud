/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctr;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctrDetalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ResSctr_ToBean
/*     */ {
/*  14 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  15 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  16 */   private static Boolean flagST = Boolean.valueOf(true);
/*  17 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  18 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  19 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  20 */   private static String tagHL = null;
/*  21 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  22 */   private static Integer tagDTP = Integer.valueOf(1);
/*  23 */   private static Integer tagREF = Integer.valueOf(1);
/*  24 */   private static Integer tagNM1 = Integer.valueOf(1);
/*     */ 
/*     */   
/*     */   public static In271ResSctr traducirEstructura271ResSctr(String cadena) {
/*  28 */     flagISA = Boolean.valueOf(true);
/*  29 */     flaGS = Boolean.valueOf(true);
/*  30 */     flagST = Boolean.valueOf(true);
/*  31 */     flagBHT = Boolean.valueOf(true);
/*  32 */     flagNM1 = Boolean.valueOf(true);
/*  33 */     flagREF = Boolean.valueOf(true);
/*  34 */     tagHL = null;
/*  35 */     flagDTP = Boolean.valueOf(true);
/*  36 */     tagDTP = Integer.valueOf(1);
/*  37 */     tagREF = Integer.valueOf(1);
/*  38 */     tagNM1 = Integer.valueOf(1);
/*     */     
/*  40 */     In271ResSctr in271ResSctr = new In271ResSctr();
/*  41 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  43 */     for (String s2 : arrayCadena) {
/*  44 */       String dataCadena = s2;
/*  45 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  47 */       if (s1[0].trim().equals("ISA")) {
/*  48 */         if (flagISA.booleanValue()) {
/*  49 */           cargarCamposISA(s1, in271ResSctr);
/*     */         }
/*  51 */       } else if (s1[0].trim().equals("GS")) {
/*  52 */         if (flaGS.booleanValue()) {
/*  53 */           cargarCamposGS(s1, in271ResSctr);
/*     */         }
/*  55 */       } else if (s1[0].trim().equals("ST")) {
/*  56 */         if (flagST.booleanValue()) {
/*  57 */           cargarCamposST(s1, in271ResSctr);
/*     */         }
/*  59 */       } else if (s1[0].trim().equals("BHT")) {
/*  60 */         if (flagBHT.booleanValue()) {
/*  61 */           cargarCamposBHT(s1, in271ResSctr);
/*     */         }
/*  63 */       } else if (s1[0].trim().equals("HL")) {
/*  64 */         cargarCamposNM1(s1, in271ResSctr);
/*  65 */       } else if (s1[0].trim().equals("NM1")) {
/*  66 */         if (flagNM1.booleanValue()) {
/*  67 */           cargarCamposNM1(s1, in271ResSctr);
/*     */         }
/*  69 */       } else if (s1[0].trim().equals("DTP")) {
/*  70 */         if (flagDTP.booleanValue()) {
/*  71 */           cargarCamposDTP(s1, in271ResSctr);
/*     */         }
/*  73 */       } else if (s1[0].trim().equals("REF")) {
/*  74 */         if (flagREF.booleanValue()) {
/*  75 */           cargarCamposREF(s1, in271ResSctr);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  81 */     return in271ResSctr;
/*     */   }
/*     */   
/*     */   private static In271ResSctr cargarCamposISA(String[] s1, In271ResSctr arrayCadena) {
/*  85 */     arrayCadena.setNoTransaccion("271_RES_SCTR");
/*  86 */     arrayCadena.setIdRemitente(s1[6]);
/*  87 */     arrayCadena.setIdReceptor(s1[8]);
/*  88 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  89 */     flagISA = Boolean.valueOf(false);
/*  90 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResSctr cargarCamposGS(String[] s1, In271ResSctr arrayCadena) {
/*  94 */     arrayCadena.setFeTransaccion(s1[4]);
/*  95 */     arrayCadena.setHoTransaccion(s1[5]);
/*  96 */     flaGS = Boolean.valueOf(false);
/*  97 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResSctr cargarCamposST(String[] s1, In271ResSctr arrayCadena) {
/* 101 */     arrayCadena.setIdTransaccion(s1[1]);
/* 102 */     flagST = Boolean.valueOf(false);
/* 103 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResSctr cargarCamposBHT(String[] s1, In271ResSctr arrayCadena) {
/* 107 */     arrayCadena.setTiFinalidad(s1[2]);
/* 108 */     flagBHT = Boolean.valueOf(false);
/* 109 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ResSctr cargarCamposNM1(String[] s1, In271ResSctr arrayCadena) {
/* 114 */     if (s1[0].trim().equals("HL")) {
/* 115 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 118 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 119 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 121 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 122 */       arrayCadena.setCaReceptor(s1[2]);
/* 123 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 125 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 126 */       if (tagNM1.intValue() == 1) {
/* 127 */         arrayCadena.setCaPaciente(s1[2]);
/* 128 */         arrayCadena.setApPaternoPaciente(s1[3]);
/* 129 */         arrayCadena.setNoPaciente(s1[4]);
/* 130 */         arrayCadena.setCoAfPaciente(s1[9]);
/* 131 */         arrayCadena.setApMaternoPaciente(s1[12]);
/* 132 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 133 */       } else if (tagNM1.intValue() == 2) {
/* 134 */         In271ResSctrDetalle detalle = new In271ResSctrDetalle();
/*     */         
/* 136 */         detalle.setTiCaContratante(s1[2]);
/* 137 */         detalle.setNoEmApPaContratante(s1[3]);
/*     */         
/* 139 */         arrayCadena.addDetalle(detalle);
/* 140 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 141 */       } else if (tagNM1.intValue() == 3) {
/* 142 */         ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiCaLuAtencion(s1[2]);
/* 143 */         ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoEmLuAtencion(s1[3]);
/* 144 */         tagNM1 = Integer.valueOf(2);
/*     */       } 
/*     */     } 
/* 147 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResSctr cargarCamposDTP(String[] s1, In271ResSctr arrayCadena) {
/* 151 */     if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 1) {
/* 152 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeAfiliacion(s1[3]);
/* 153 */       tagDTP = Integer.valueOf(tagDTP.intValue() + 1);
/* 154 */     } else if (s1[0].trim().equals("DTP") && tagDTP.intValue() == 2) {
/* 155 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeOcAccidente(s1[3]);
/* 156 */       tagDTP = Integer.valueOf(1);
/*     */     } 
/*     */     
/* 159 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ResSctr cargarCamposREF(String[] s1, In271ResSctr arrayCadena) {
/* 164 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 165 */       arrayCadena.setCoTiDoPaciente(s1[2]);
/*     */       
/* 167 */       String[] REF4 = s1[4].split(":", 0);
/* 168 */       arrayCadena.setNuDocPaciente(REF4[1]);
/* 169 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 170 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 171 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoEmContratante(s1[2]);
/*     */       
/* 173 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 174 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/*     */       
/* 176 */       String[] REF4 = s1[4].split(":", 0);
/* 177 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdCaReContratante(REF4[0]);
/* 178 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setReIdContratante(REF4[1]);
/* 179 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 180 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 181 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoEmReLuAtencion(s1[2]);
/*     */       
/* 183 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 184 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/*     */       
/* 186 */       String[] REF4 = s1[4].split(":", 0);
/* 187 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdCaReLuAtencion(REF4[0]);
/* 188 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setReIdLuAtencion(REF4[1]);
/* 189 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 190 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 191 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoLuAtencion(s1[2]);
/*     */       
/* 193 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 194 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 195 */       ((In271ResSctrDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeTiAccidente(s1[3]);
/*     */       
/* 197 */       tagREF = Integer.valueOf(2);
/*     */     } 
/* 199 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ResSctr_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */