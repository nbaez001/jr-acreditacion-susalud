/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDerivaDetalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ResDeriva_ToBean
/*     */ {
/*  14 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  15 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  16 */   private static Boolean flagST = Boolean.valueOf(true);
/*  17 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  18 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  19 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  20 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  21 */   private static String tagHL = null;
/*  22 */   private static Integer tagREF = Integer.valueOf(1);
/*  23 */   private static Integer tagNM1 = Integer.valueOf(1);
/*     */   
/*     */   public static In271ResDeriva traducirEstructura271ResDeriva(String cadena) {
/*  26 */     flagISA = Boolean.valueOf(true);
/*  27 */     flaGS = Boolean.valueOf(true);
/*  28 */     flagST = Boolean.valueOf(true);
/*  29 */     flagBHT = Boolean.valueOf(true);
/*  30 */     flagNM1 = Boolean.valueOf(true);
/*  31 */     flagREF = Boolean.valueOf(true);
/*  32 */     flagDTP = Boolean.valueOf(true);
/*  33 */     tagHL = null;
/*  34 */     tagREF = Integer.valueOf(1);
/*  35 */     tagNM1 = Integer.valueOf(1);
/*     */     
/*  37 */     In271ResDeriva in271ResDeriva = new In271ResDeriva();
/*  38 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  40 */     for (String s2 : arrayCadena) {
/*  41 */       String dataCadena = s2;
/*  42 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  44 */       if (s1[0].trim().equals("ISA")) {
/*  45 */         if (flagISA.booleanValue()) {
/*  46 */           cargarCamposISA(s1, in271ResDeriva);
/*     */         }
/*  48 */       } else if (s1[0].trim().equals("GS")) {
/*  49 */         if (flaGS.booleanValue()) {
/*  50 */           cargarCamposGS(s1, in271ResDeriva);
/*     */         }
/*  52 */       } else if (s1[0].trim().equals("ST")) {
/*  53 */         if (flagST.booleanValue()) {
/*  54 */           cargarCamposST(s1, in271ResDeriva);
/*     */         }
/*  56 */       } else if (s1[0].trim().equals("BHT")) {
/*  57 */         if (flagBHT.booleanValue()) {
/*  58 */           cargarCamposBHT(s1, in271ResDeriva);
/*     */         }
/*  60 */       } else if (s1[0].trim().equals("HL")) {
/*  61 */         cargarCamposNM1(s1, in271ResDeriva);
/*  62 */       } else if (s1[0].trim().equals("NM1")) {
/*  63 */         if (flagNM1.booleanValue()) {
/*  64 */           cargarCamposNM1(s1, in271ResDeriva);
/*     */         }
/*  66 */       } else if (s1[0].trim().equals("DTP")) {
/*  67 */         if (flagDTP.booleanValue()) {
/*  68 */           cargarCamposDTP(s1, in271ResDeriva);
/*     */         }
/*  70 */       } else if (s1[0].trim().equals("REF")) {
/*  71 */         if (flagREF.booleanValue()) {
/*  72 */           cargarCamposREF(s1, in271ResDeriva);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  78 */     return in271ResDeriva;
/*     */   }
/*     */   
/*     */   private static In271ResDeriva cargarCamposISA(String[] s1, In271ResDeriva arrayCadena) {
/*  82 */     arrayCadena.setNoTransaccion("271_RES_DERIVA");
/*  83 */     arrayCadena.setIdRemitente(s1[6]);
/*  84 */     arrayCadena.setIdReceptor(s1[8]);
/*  85 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  86 */     flagISA = Boolean.valueOf(false);
/*  87 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResDeriva cargarCamposGS(String[] s1, In271ResDeriva arrayCadena) {
/*  91 */     arrayCadena.setFeTransaccion(s1[4]);
/*  92 */     arrayCadena.setHoTransaccion(s1[5]);
/*  93 */     flaGS = Boolean.valueOf(false);
/*  94 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResDeriva cargarCamposST(String[] s1, In271ResDeriva arrayCadena) {
/*  98 */     arrayCadena.setIdTransaccion(s1[1]);
/*  99 */     flagST = Boolean.valueOf(false);
/* 100 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResDeriva cargarCamposBHT(String[] s1, In271ResDeriva arrayCadena) {
/* 104 */     arrayCadena.setTiFinalidad(s1[2]);
/* 105 */     flagBHT = Boolean.valueOf(false);
/* 106 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ResDeriva cargarCamposNM1(String[] s1, In271ResDeriva arrayCadena) {
/* 111 */     if (s1[0].trim().equals("HL")) {
/* 112 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 115 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 116 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 118 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 119 */       arrayCadena.setCaReceptor(s1[2]);
/* 120 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 122 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 123 */       if (tagNM1.intValue() == 1) {
/* 124 */         In271ResDerivaDetalle detalle = new In271ResDerivaDetalle();
/*     */         
/* 126 */         detalle.setCaPaciente(s1[2]);
/* 127 */         detalle.setApPaternoPaciente(s1[3]);
/* 128 */         detalle.setNoPaciente(s1[4]);
/* 129 */         detalle.setCoAfPaciente(s1[9]);
/* 130 */         detalle.setApMaternoPaciente(s1[12]);
/* 131 */         arrayCadena.addDetalle(detalle);
/* 132 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 133 */       } else if (tagNM1.intValue() == 2) {
/* 134 */         ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoLuAtencion(s1[3]);
/* 135 */         tagNM1 = Integer.valueOf(1);
/*     */       } 
/*     */     } 
/* 138 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In271ResDeriva cargarCamposDTP(String[] s1, In271ResDeriva arrayCadena) {
/* 142 */     ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeAtSalud(s1[3]);
/* 143 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In271ResDeriva cargarCamposREF(String[] s1, In271ResDeriva arrayCadena) {
/* 148 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 149 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiDoPaciente(s1[2]);
/*     */       
/* 151 */       String[] ref04 = s1[4].split(":", 0);
/* 152 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDoPaciente(ref04[1]);
/*     */       
/* 154 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 155 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 156 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoParentesco(s1[2]);
/*     */       
/* 158 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 159 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 160 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoTrabajoAfiliado(s1[2]);
/*     */       
/* 162 */       String[] ref04 = s1[4].split(":", 0);
/* 163 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDoTrabajoAfiliado(ref04[1]);
/*     */       
/* 165 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 166 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 167 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuAtencion(s1[2]);
/* 168 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTeMsgLibre1(s1[3]);
/*     */       
/* 170 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/*     */     }
/* 172 */     else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 173 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiProducto(s1[2]);
/* 174 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeProducto(s1[3]);
/*     */       
/* 176 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 177 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 178 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiCobertura(s1[2]);
/*     */       
/* 180 */       String[] ref04 = s1[4].split(":", 0);
/* 181 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoSubTiCobertura(ref04[1]);
/* 182 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/*     */     }
/* 184 */     else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 185 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoLuAtencion(s1[2]);
/*     */       
/* 187 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 188 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 189 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoContratante(s1[2]);
/*     */       
/* 191 */       String[] ref04 = s1[4].split(":", 0);
/* 192 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdCaReferencia(ref04[0]);
/* 193 */       ((In271ResDerivaDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setReIdContratante(ref04[1]);
/*     */       
/* 195 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 197 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ResDeriva_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */