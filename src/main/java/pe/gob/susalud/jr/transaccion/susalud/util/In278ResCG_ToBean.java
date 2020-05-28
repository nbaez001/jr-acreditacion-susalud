/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCGDetalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In278ResCG_ToBean
/*     */ {
/*  13 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  14 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  15 */   private static Boolean flagST = Boolean.valueOf(true);
/*  16 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  17 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  18 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  19 */   private static String tagHL = null;
/*  20 */   private static Boolean flagINS = Boolean.valueOf(true);
/*  21 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  22 */   private static Integer tagREF = Integer.valueOf(1);
/*  23 */   private static Integer tagNM1 = Integer.valueOf(1);
/*     */   
/*     */   public static In278ResCG traducirEstructura278Res(String cadena) {
/*  26 */     flagISA = Boolean.valueOf(true);
/*  27 */     flaGS = Boolean.valueOf(true);
/*  28 */     flagST = Boolean.valueOf(true);
/*  29 */     flagBHT = Boolean.valueOf(true);
/*  30 */     flagNM1 = Boolean.valueOf(true);
/*  31 */     flagREF = Boolean.valueOf(true);
/*  32 */     tagHL = null;
/*  33 */     flagINS = Boolean.valueOf(true);
/*  34 */     flagDTP = Boolean.valueOf(true);
/*  35 */     tagREF = Integer.valueOf(1);
/*  36 */     tagNM1 = Integer.valueOf(1);
/*     */     
/*  38 */     In278ResCG in278ResCG = new In278ResCG();
/*     */     
/*  40 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  42 */     for (String s2 : arrayCadena) {
/*  43 */       String dataCadena = s2;
/*  44 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  46 */       if (s1[0].trim().equals("ISA")) {
/*  47 */         if (flagISA.booleanValue()) {
/*  48 */           cargarCamposISA(s1, in278ResCG);
/*     */         }
/*  50 */       } else if (s1[0].trim().equals("GS")) {
/*  51 */         if (flaGS.booleanValue()) {
/*  52 */           cargarCamposGS(s1, in278ResCG);
/*     */         }
/*  54 */       } else if (s1[0].trim().equals("ST")) {
/*  55 */         if (flagST.booleanValue()) {
/*  56 */           cargarCamposST(s1, in278ResCG);
/*     */         }
/*  58 */       } else if (s1[0].trim().equals("BHT")) {
/*  59 */         if (flagBHT.booleanValue()) {
/*  60 */           cargarCamposBHT(s1, in278ResCG);
/*     */         }
/*  62 */       } else if (s1[0].trim().equals("HL")) {
/*  63 */         cargarCamposNM1(s1, in278ResCG);
/*  64 */       } else if (s1[0].trim().equals("NM1")) {
/*  65 */         if (flagNM1.booleanValue()) {
/*  66 */           cargarCamposNM1(s1, in278ResCG);
/*     */         }
/*  68 */       } else if (s1[0].trim().equals("INS")) {
/*  69 */         if (flagINS.booleanValue()) {
/*  70 */           cargarCamposINS(s1, in278ResCG);
/*     */         }
/*  72 */       } else if (s1[0].trim().equals("DTP")) {
/*  73 */         if (flagDTP.booleanValue()) {
/*  74 */           cargarCamposDTP(s1, in278ResCG);
/*     */         }
/*  76 */       } else if (s1[0].trim().equals("REF")) {
/*  77 */         if (flagREF.booleanValue()) {
/*  78 */           cargarCamposREF(s1, in278ResCG);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*  84 */     return in278ResCG;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposISA(String[] s1, In278ResCG arrayCadena) {
/*  88 */     arrayCadena.setNoTransaccion("278_RES_CG");
/*  89 */     arrayCadena.setIdRemitente(s1[6]);
/*  90 */     arrayCadena.setIdReceptor(s1[8]);
/*  91 */     arrayCadena.setIdCorrelativo(s1[13]);
/*  92 */     flagISA = Boolean.valueOf(false);
/*  93 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposGS(String[] s1, In278ResCG arrayCadena) {
/*  97 */     arrayCadena.setFeTransaccion(s1[4]);
/*  98 */     arrayCadena.setHoTransaccion(s1[5]);
/*  99 */     flaGS = Boolean.valueOf(false);
/* 100 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposST(String[] s1, In278ResCG arrayCadena) {
/* 104 */     arrayCadena.setIdTransaccion(s1[1]);
/* 105 */     flagST = Boolean.valueOf(false);
/* 106 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposBHT(String[] s1, In278ResCG arrayCadena) {
/* 110 */     arrayCadena.setTiFinalidad(s1[2]);
/* 111 */     flagBHT = Boolean.valueOf(false);
/* 112 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In278ResCG cargarCamposNM1(String[] s1, In278ResCG arrayCadena) {
/* 117 */     if (s1[0].trim().equals("HL")) {
/* 118 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 121 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 122 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 124 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 125 */       arrayCadena.setCaReceptor(s1[2]);
/* 126 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 128 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 129 */       if (tagNM1.intValue() == 1) {
/* 130 */         In278ResCGDetalle detalle = new In278ResCGDetalle();
/*     */         
/* 132 */         detalle.setCaPaciente(s1[2]);
/* 133 */         detalle.setApPaternoPaciente(s1[3]);
/* 134 */         detalle.setNoPaciente(s1[4]);
/* 135 */         detalle.setCoAfPaciente(s1[9]);
/* 136 */         detalle.setApMaternoPaciente(s1[12]);
/*     */         
/* 138 */         arrayCadena.addDetalle(detalle);
/* 139 */         tagNM1 = Integer.valueOf(tagNM1.intValue() + 1);
/* 140 */       } else if (tagNM1.intValue() == 2) {
/* 141 */         ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiCaContratante(s1[2]);
/* 142 */         ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoPaContratante(s1[3]);
/* 143 */         ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoContratante(s1[4]);
/* 144 */         ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNoMaContratante(s1[12]);
/* 145 */         tagNM1 = Integer.valueOf(1);
/* 146 */         tagHL = "3";
/*     */       } 
/*     */     } 
/* 149 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposINS(String[] s1, In278ResCG arrayCadena) {
/* 153 */     ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setMonPago(s1[17]);
/* 154 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static In278ResCG cargarCamposREF(String[] s1, In278ResCG arrayCadena) {
/* 159 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 160 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiDoPaciente(s1[2]);
/*     */       
/* 162 */       String[] ref04 = s1[4].split(":", 0);
/* 163 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuDoPaciente(ref04[1]);
/* 164 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 165 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 166 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiDoContratante(s1[2]);
/*     */       
/* 168 */       String[] ref04 = s1[4].split(":", 0);
/* 169 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdCaReContratante(ref04[0]);
/* 170 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuCaReContratante(ref04[1]);
/* 171 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 172 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 3) {
/* 173 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeCarGarantia(s1[3]);
/*     */       
/* 175 */       String[] ref04 = s1[4].split(":", 0);
/* 176 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuSoCarGarantia(ref04[1]);
/* 177 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 178 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 4) {
/* 179 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuCarGarantia(s1[2]);
/*     */       
/* 181 */       String[] ref04 = s1[4].split(":", 0);
/* 182 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setVeCarGarantia(ref04[1]);
/*     */       
/* 184 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 185 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 5) {
/* 186 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setEsCarGarantia(s1[2]);
/*     */       
/* 188 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 189 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 6) {
/* 190 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProducto(s1[2]);
/*     */       
/* 192 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 193 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 7) {
/* 194 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProcedimiento(s1[2]);
/* 195 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeProcedimiento(s1[3]);
/*     */       
/* 197 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 198 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 8) {
/* 199 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuPlan(s1[2]);
/*     */       
/* 201 */       String[] ref04 = s1[4].split(":", 0);
/* 202 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiPlanSalud(ref04[1]);
/* 203 */       ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoMoneda(ref04[3]);
/*     */       
/* 205 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 207 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static In278ResCG cargarCamposDTP(String[] s1, In278ResCG arrayCadena) {
/* 211 */     ((In278ResCGDetalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeCarGarantia(s1[3]);
/*     */     
/* 213 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In278ResCG_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */