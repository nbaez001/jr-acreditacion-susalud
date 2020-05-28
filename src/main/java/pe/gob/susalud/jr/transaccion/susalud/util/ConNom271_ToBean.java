/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConNom271_ToBean
/*     */ {
/*  12 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  13 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  14 */   private static Boolean flagST = Boolean.valueOf(true);
/*  15 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  16 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  17 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  18 */   private static Boolean flagDMG = Boolean.valueOf(true);
/*  19 */   private static Integer tagREF = Integer.valueOf(1);
/*  20 */   private static Integer tagNM1 = Integer.valueOf(1);
/*  21 */   private static String tagHL = null;
/*     */ 
/*     */   
/*     */   public static InConNom271 traducirEstructura271(String cadena) {
/*  25 */     flagISA = Boolean.valueOf(true);
/*  26 */     flaGS = Boolean.valueOf(true);
/*  27 */     flagST = Boolean.valueOf(true);
/*  28 */     flagBHT = Boolean.valueOf(true);
/*  29 */     flagNM1 = Boolean.valueOf(true);
/*  30 */     flagREF = Boolean.valueOf(true);
/*  31 */     flagDMG = Boolean.valueOf(true);
/*  32 */     tagREF = Integer.valueOf(1);
/*  33 */     tagNM1 = Integer.valueOf(1);
/*  34 */     tagHL = null;
/*     */     
/*  36 */     InConNom271 inConNom271 = new InConNom271();
/*  37 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  39 */     for (String s2 : arrayCadena) {
/*     */       
/*  41 */       String dataCadena = s2;
/*  42 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  44 */       if (s1[0].trim().equals("ISA")) {
/*  45 */         if (flagISA.booleanValue()) {
/*  46 */           cargarCamposISA(s1, inConNom271);
/*     */         }
/*  48 */       } else if (s1[0].trim().equals("GS")) {
/*  49 */         if (flaGS.booleanValue()) {
/*  50 */           cargarCamposGS(s1, inConNom271);
/*     */         }
/*  52 */       } else if (s1[0].trim().equals("ST")) {
/*  53 */         if (flagST.booleanValue()) {
/*  54 */           cargarCamposST(s1, inConNom271);
/*     */         }
/*  56 */       } else if (s1[0].trim().equals("BHT")) {
/*  57 */         if (flagBHT.booleanValue()) {
/*  58 */           cargarCamposBHT(s1, inConNom271);
/*     */         }
/*  60 */       } else if (s1[0].trim().equals("HL")) {
/*  61 */         cargarCamposNM1(s1, inConNom271);
/*  62 */       } else if (s1[0].trim().equals("NM1")) {
/*  63 */         if (flagNM1.booleanValue()) {
/*  64 */           cargarCamposNM1(s1, inConNom271);
/*     */         }
/*  66 */       } else if (s1[0].trim().equals("REF")) {
/*  67 */         if (flagREF.booleanValue()) {
/*  68 */           cargarCamposREF(s1, inConNom271);
/*     */         }
/*  70 */       } else if (s1[0].trim().equals("DMG")) {
/*  71 */         if (flagDMG.booleanValue()) {
/*  72 */           cargarCamposDMG(s1, inConNom271);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  78 */     return inConNom271;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposISA(String[] s1, InConNom271 arrayCadena) {
/*  82 */     arrayCadena.setNoTransaccion("271_CON_NOM");
/*  83 */     arrayCadena.setIdRemitente(s1[6]);
/*  84 */     arrayCadena.setIdReceptor(s1[8]);
/*  85 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  86 */     flagISA = Boolean.valueOf(false);
/*  87 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposGS(String[] s1, InConNom271 arrayCadena) {
/*  91 */     arrayCadena.setFeTransaccion(s1[4]);
/*  92 */     arrayCadena.setHoTransaccion(s1[5]);
/*  93 */     flaGS = Boolean.valueOf(false);
/*  94 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposST(String[] s1, InConNom271 arrayCadena) {
/*  98 */     arrayCadena.setIdTransaccion(s1[1]);
/*  99 */     flagST = Boolean.valueOf(false);
/* 100 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposBHT(String[] s1, InConNom271 arrayCadena) {
/* 104 */     arrayCadena.setTiFinalidad(s1[2]);
/* 105 */     flagBHT = Boolean.valueOf(false);
/* 106 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposNM1(String[] s1, InConNom271 arrayCadena) {
/* 111 */     if (s1[0].trim().equals("HL")) {
/* 112 */       tagHL = s1[1];
/*     */     }
/*     */     
/* 115 */     if ("1".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/* 116 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 118 */     else if ("2".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/* 119 */       arrayCadena.setCaReceptor(s1[2]);
/* 120 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 122 */     else if ("3".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/*     */       
/* 124 */       if (tagNM1.intValue() == 1) {
/* 125 */         InConNom271Detalle detalle = new InConNom271Detalle();
/*     */         
/* 127 */         detalle.setCaPaciente(s1[2]);
/* 128 */         detalle.setApPaternoPaciente(s1[3]);
/* 129 */         detalle.setNoPaciente(s1[4]);
/* 130 */         detalle.setCoAfPaciente(s1[9]);
/* 131 */         detalle.setApMaternoPaciente(s1[12]);
/*     */         
/* 133 */         arrayCadena.addDetalle(detalle);
/*     */         
/* 135 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 136 */       } else if (tagNM1.intValue() == 2) {
/*     */         
/* 138 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiCaContratante(s1[2]);
/* 139 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoPaContratante(s1[3]);
/* 140 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoContratante(s1[4]);
/* 141 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoMaContratante(s1[12]);
/*     */         
/* 143 */         tagNM1 = Integer.valueOf(1);
/*     */       } 
/*     */     } 
/* 146 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposREF(String[] s1, InConNom271 arrayCadena) {
/* 151 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 152 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoEsPaciente(s1[2]);
/* 153 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 154 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 155 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoPaciente(s1[2]);
/*     */       
/* 157 */       String[] ref04 = s1[4].split(":", 0);
/* 158 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDoPaciente(ref04[1]);
/* 159 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 160 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 161 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuContratoPaciente(s1[2]);
/* 162 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 163 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 164 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProducto(s1[2]);
/* 165 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoDescripcion(s1[3]);
/*     */       
/* 167 */       String[] ref04 = s1[4].split(":", 0);
/* 168 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuSCTR(ref04[1]);
/* 169 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 170 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 171 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoParentesco(s1[2]);
/* 172 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 173 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 174 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuPlan(s1[2]);
/* 175 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 176 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 177 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoContratante(s1[2]);
/*     */       
/* 179 */       String[] ref04 = s1[4].split(":", 0);
/* 180 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdReContratante(ref04[0]);
/* 181 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoReContratante(ref04[1]);
/*     */       
/* 183 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 185 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposDMG(String[] s1, InConNom271 arrayCadena) {
/* 190 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeNacimiento(s1[2]);
/* 191 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setGenero(s1[3]);
/* 192 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setEsMarital(s1[4]);
/*     */     
/* 194 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConNom271_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */