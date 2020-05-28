/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class conNom271traducir
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
/*     */   public static InConNom271 traducirEstructura271(String cadena) {
/*  24 */     InConNom271 inConNom271 = new InConNom271();
/*  25 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  27 */     for (String s2 : arrayCadena) {
/*     */       
/*  29 */       String dataCadena = s2;
/*  30 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  32 */       if (s1[0].trim().equals("ISA")) {
/*  33 */         if (flagISA.booleanValue()) {
/*  34 */           cargarCamposISA(s1, inConNom271);
/*     */         }
/*  36 */       } else if (s1[0].trim().equals("GS")) {
/*  37 */         if (flaGS.booleanValue()) {
/*  38 */           cargarCamposGS(s1, inConNom271);
/*     */         }
/*  40 */       } else if (s1[0].trim().equals("ST")) {
/*  41 */         if (flagST.booleanValue()) {
/*  42 */           cargarCamposST(s1, inConNom271);
/*     */         }
/*  44 */       } else if (s1[0].trim().equals("BHT")) {
/*  45 */         if (flagBHT.booleanValue()) {
/*  46 */           cargarCamposBHT(s1, inConNom271);
/*     */         }
/*  48 */       } else if (s1[0].trim().equals("HL")) {
/*  49 */         cargarCamposNM1(s1, inConNom271);
/*  50 */       } else if (s1[0].trim().equals("NM1")) {
/*  51 */         if (flagNM1.booleanValue()) {
/*  52 */           cargarCamposNM1(s1, inConNom271);
/*     */         }
/*  54 */       } else if (s1[0].trim().equals("REF")) {
/*  55 */         if (flagREF.booleanValue()) {
/*  56 */           cargarCamposREF(s1, inConNom271);
/*     */         } else {
/*     */           break;
/*     */         } 
/*  60 */       } else if (s1[0].trim().equals("DMG") && 
/*  61 */         flagDMG.booleanValue()) {
/*  62 */         cargarCamposDMG(s1, inConNom271);
/*     */       } 
/*     */     } 
/*     */     
/*  66 */     return inConNom271;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposISA(String[] s1, InConNom271 arrayCadena) {
/*  70 */     arrayCadena.setNoTransaccion("271_CON_NOM");
/*  71 */     arrayCadena.setIdRemitente(s1[6]);
/*  72 */     arrayCadena.setIdReceptor(s1[8]);
/*  73 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  74 */     flagISA = Boolean.valueOf(false);
/*  75 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposGS(String[] s1, InConNom271 arrayCadena) {
/*  79 */     arrayCadena.setFeTransaccion(s1[4]);
/*  80 */     arrayCadena.setHoTransaccion(s1[5]);
/*  81 */     flaGS = Boolean.valueOf(false);
/*  82 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposST(String[] s1, InConNom271 arrayCadena) {
/*  86 */     arrayCadena.setIdTransaccion(s1[1]);
/*  87 */     flagST = Boolean.valueOf(false);
/*  88 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConNom271 cargarCamposBHT(String[] s1, InConNom271 arrayCadena) {
/*  92 */     arrayCadena.setTiFinalidad(s1[2]);
/*  93 */     flagBHT = Boolean.valueOf(false);
/*  94 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposNM1(String[] s1, InConNom271 arrayCadena) {
/*  99 */     if (s1[0].trim().equals("HL")) {
/* 100 */       tagHL = s1[1];
/*     */     }
/*     */     
/* 103 */     if ("1".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/* 104 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 106 */     else if ("2".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/* 107 */       arrayCadena.setCaReceptor(s1[2]);
/* 108 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 110 */     else if ("3".equals(tagHL.trim()) && s1[0].trim().equals("NM1")) {
/*     */       
/* 112 */       if (tagNM1.intValue() == 1) {
/* 113 */         InConNom271Detalle detalle = new InConNom271Detalle();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 121 */         detalle.setCaPaciente(s1[2]);
/* 122 */         detalle.setApPaternoPaciente(s1[3]);
/* 123 */         detalle.setNoPaciente(s1[4]);
/* 124 */         detalle.setCoAfPaciente(s1[9]);
/* 125 */         detalle.setApMaternoPaciente(s1[12]);
/*     */         
/* 127 */         arrayCadena.addDetalle(detalle);
/*     */         
/* 129 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 130 */       } else if (tagNM1.intValue() == 2) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 137 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiCaContratante(s1[2]);
/* 138 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoPaContratante(s1[3]);
/* 139 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoContratante(s1[4]);
/* 140 */         ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoMaContratante(s1[12]);
/*     */ 
/*     */         
/* 143 */         tagNM1 = Integer.valueOf(1);
/*     */       } 
/*     */     } 
/* 146 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposREF(String[] s1, InConNom271 arrayCadena) {
/* 152 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/*     */ 
/*     */       
/* 155 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoEsPaciente(s1[2]);
/* 156 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 157 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/*     */       
/* 159 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoPaciente(s1[2]);
/*     */       
/* 161 */       String[] ref04 = s1[4].split(":", 0);
/*     */       
/* 163 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDoPaciente(ref04[1]);
/* 164 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 165 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/*     */       
/* 167 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuContratoPaciente(s1[2]);
/* 168 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 169 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/*     */ 
/*     */       
/* 172 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProducto(s1[2]);
/* 173 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoDescripcion(s1[3]);
/*     */       
/* 175 */       String[] ref04 = s1[4].split(":", 0);
/*     */       
/* 177 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuSCTR(ref04[1]);
/* 178 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 179 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/*     */       
/* 181 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoParentesco(s1[2]);
/* 182 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 183 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/*     */       
/* 185 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoContratante(s1[2]);
/*     */       
/* 187 */       String[] ref04 = s1[4].split(":", 0);
/*     */ 
/*     */       
/* 190 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdReContratante(ref04[0]);
/* 191 */       ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoReContratante(ref04[1]);
/*     */       
/* 193 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 195 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static InConNom271 cargarCamposDMG(String[] s1, InConNom271 arrayCadena) {
/* 203 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeNacimiento(s1[2]);
/* 204 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setGenero(s1[3]);
/* 205 */     ((InConNom271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setEsMarital(s1[4]);
/*     */     
/* 207 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\conNom271traducir.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */