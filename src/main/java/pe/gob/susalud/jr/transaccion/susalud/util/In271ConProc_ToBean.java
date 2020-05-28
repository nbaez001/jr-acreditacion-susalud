/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271Detalle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConProc_ToBean
/*     */ {
/*  13 */   private static Boolean flagISA = Boolean.valueOf(true);
/*  14 */   private static Boolean flaGS = Boolean.valueOf(true);
/*  15 */   private static Boolean flagST = Boolean.valueOf(true);
/*  16 */   private static Boolean flagBHT = Boolean.valueOf(true);
/*  17 */   private static Boolean flagNM1 = Boolean.valueOf(true);
/*  18 */   private static Boolean flagREF = Boolean.valueOf(true);
/*  19 */   private static Boolean flagEB = Boolean.valueOf(true);
/*  20 */   private static Boolean flagHSD = Boolean.valueOf(true);
/*  21 */   private static String tagHL = null;
/*  22 */   private static Boolean flagDTP = Boolean.valueOf(true);
/*  23 */   private static Boolean flagMSG = Boolean.valueOf(true);
/*  24 */   private static Integer tagMSG = Integer.valueOf(1);
/*  25 */   private static Integer tagREF = Integer.valueOf(1);
/*  26 */   private static Integer tagEB = Integer.valueOf(1);
/*  27 */   private static Integer tagHSD = Integer.valueOf(1);
/*  28 */   private static Integer tagDTP = Integer.valueOf(1);
/*     */   
/*     */   public static InConProc271 traducirEstructura271ConProc(String cadena) {
/*  31 */     flagISA = Boolean.valueOf(true);
/*  32 */     flaGS = Boolean.valueOf(true);
/*  33 */     flagST = Boolean.valueOf(true);
/*  34 */     flagBHT = Boolean.valueOf(true);
/*  35 */     flagNM1 = Boolean.valueOf(true);
/*  36 */     flagREF = Boolean.valueOf(true);
/*  37 */     flagEB = Boolean.valueOf(true);
/*  38 */     flagHSD = Boolean.valueOf(true);
/*  39 */     tagHL = null;
/*  40 */     flagDTP = Boolean.valueOf(true);
/*  41 */     flagMSG = Boolean.valueOf(true);
/*  42 */     tagMSG = Integer.valueOf(1);
/*  43 */     tagREF = Integer.valueOf(1);
/*  44 */     tagEB = Integer.valueOf(1);
/*  45 */     tagHSD = Integer.valueOf(1);
/*  46 */     tagDTP = Integer.valueOf(1);
/*     */     
/*  48 */     InConProc271 in271ConProc = new InConProc271();
/*  49 */     String[] arrayCadena = cadena.split("\\~");
/*     */     
/*  51 */     for (String s2 : arrayCadena) {
/*  52 */       String dataCadena = s2;
/*  53 */       String[] s1 = dataCadena.split("\\*");
/*     */       
/*  55 */       if (s1[0].trim().equals("ISA")) {
/*  56 */         if (flagISA.booleanValue()) {
/*  57 */           cargarCamposISA(s1, in271ConProc);
/*     */         }
/*  59 */       } else if (s1[0].trim().equals("GS")) {
/*  60 */         if (flaGS.booleanValue()) {
/*  61 */           cargarCamposGS(s1, in271ConProc);
/*     */         }
/*  63 */       } else if (s1[0].trim().equals("ST")) {
/*  64 */         if (flagST.booleanValue()) {
/*  65 */           cargarCamposST(s1, in271ConProc);
/*     */         }
/*  67 */       } else if (s1[0].trim().equals("BHT")) {
/*  68 */         if (flagBHT.booleanValue()) {
/*  69 */           cargarCamposBHT(s1, in271ConProc);
/*     */         }
/*  71 */       } else if (s1[0].trim().equals("HL")) {
/*  72 */         cargarCamposNM1(s1, in271ConProc);
/*  73 */       } else if (s1[0].trim().equals("NM1")) {
/*  74 */         if (flagNM1.booleanValue()) {
/*  75 */           cargarCamposNM1(s1, in271ConProc);
/*     */         }
/*  77 */       } else if (s1[0].trim().equals("EB")) {
/*  78 */         if (flagEB.booleanValue()) {
/*  79 */           cargarCamposEB(s1, in271ConProc);
/*     */         }
/*  81 */       } else if (s1[0].trim().equals("HSD")) {
/*  82 */         if (flagHSD.booleanValue()) {
/*  83 */           cargarCamposHSD(s1, in271ConProc);
/*     */         }
/*  85 */       } else if (s1[0].trim().equals("DTP")) {
/*  86 */         if (flagDTP.booleanValue()) {
/*  87 */           cargarCamposDTP(s1, in271ConProc);
/*     */         }
/*  89 */       } else if (s1[0].trim().equals("MSG")) {
/*  90 */         if (flagMSG.booleanValue()) {
/*  91 */           cargarCamposMSG(s1, in271ConProc);
/*     */         }
/*  93 */       } else if (s1[0].trim().equals("REF")) {
/*  94 */         if (flagREF.booleanValue()) {
/*  95 */           cargarCamposREF(s1, in271ConProc);
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/* 101 */     return in271ConProc;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposISA(String[] s1, InConProc271 arrayCadena) {
/* 105 */     arrayCadena.setNoTransaccion("271_CON_PROC");
/* 106 */     arrayCadena.setIdRemitente(s1[6]);
/* 107 */     arrayCadena.setIdReceptor(s1[8]);
/* 108 */     arrayCadena.setIdCorrelativo(s1[13]);
/* 109 */     flagISA = Boolean.valueOf(false);
/* 110 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposGS(String[] s1, InConProc271 arrayCadena) {
/* 114 */     arrayCadena.setFeTransaccion(s1[4]);
/* 115 */     arrayCadena.setHoTransaccion(s1[5]);
/* 116 */     flaGS = Boolean.valueOf(false);
/* 117 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposST(String[] s1, InConProc271 arrayCadena) {
/* 121 */     arrayCadena.setIdTransaccion(s1[1]);
/* 122 */     flagST = Boolean.valueOf(false);
/* 123 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposBHT(String[] s1, InConProc271 arrayCadena) {
/* 127 */     arrayCadena.setTiFinalidad(s1[2]);
/* 128 */     flagBHT = Boolean.valueOf(false);
/* 129 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConProc271 cargarCamposNM1(String[] s1, InConProc271 arrayCadena) {
/* 134 */     if (s1[0].trim().equals("HL")) {
/* 135 */       tagHL = s1[1].trim();
/*     */     }
/*     */     
/* 138 */     if ("1".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 139 */       arrayCadena.setCaRemitente(s1[2]);
/*     */     }
/* 141 */     else if ("2".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 142 */       arrayCadena.setCaReceptor(s1[2]);
/* 143 */       arrayCadena.setNuRucReceptor(s1[9]);
/*     */     }
/* 145 */     else if ("3".equals(tagHL) && s1[0].trim().equals("NM1")) {
/* 146 */       arrayCadena.setCaPaciente(s1[2]);
/* 147 */       arrayCadena.setApPaternoPaciente(s1[3]);
/* 148 */       arrayCadena.setNoPaciente(s1[4]);
/* 149 */       arrayCadena.setCoAfPaciente(s1[9]);
/* 150 */       arrayCadena.setApMaternoPaciente(s1[12]);
/* 151 */       flagNM1 = Boolean.valueOf(false);
/*     */     } 
/* 153 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConProc271 cargarCamposEB(String[] s1, InConProc271 arrayCadena) {
/* 158 */     if (s1[0].trim().equals("EB") && tagEB.intValue() == 1) {
/* 159 */       InConProc271Detalle detalle = new InConProc271Detalle();
/* 160 */       detalle.setCoInProcedimiento(s1[9]);
/* 161 */       arrayCadena.addDetalle(detalle);
/*     */       
/* 163 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 164 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 2) {
/* 165 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoInRestriccion(s1[9]);
/*     */       
/* 167 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 168 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 3) {
/* 169 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoProcedimiento(s1[3]);
/* 170 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setImDeducible(s1[7]);
/* 171 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setPoCuExDecimal(s1[8]);
/* 172 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setNuFrecuencia(s1[10]);
/*     */       
/* 174 */       String[] eb13 = s1[13].split(":", 0);
/* 175 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoSexo(eb13[1]);
/*     */       
/* 177 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 178 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 4) {
/* 179 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoTiEspera(s1[3]);
/*     */       
/* 181 */       tagEB = Integer.valueOf(tagEB.intValue() + 1);
/* 182 */     } else if (s1[0].trim().equals("EB") && tagEB.intValue() == 5) {
/* 183 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setCoExCarencia(s1[3]);
/*     */       
/* 185 */       tagEB = Integer.valueOf(1);
/*     */     } 
/* 187 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposHSD(String[] s1, InConProc271 arrayCadena) {
/* 191 */     ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTiNuDias(s1[2]);
/* 192 */     tagHSD = Integer.valueOf(1);
/* 193 */     return arrayCadena;
/*     */   }
/*     */   
/*     */   private static InConProc271 cargarCamposDTP(String[] s1, InConProc271 arrayCadena) {
/* 197 */     ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setFeFinVigencia(s1[3]);
/* 198 */     tagDTP = Integer.valueOf(1);
/* 199 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConProc271 cargarCamposMSG(String[] s1, InConProc271 arrayCadena) {
/* 204 */     if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 1) {
/* 205 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTeMsgObservacion(s1[1]);
/* 206 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdFuentePE(s1[3]);
/*     */       
/* 208 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 209 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 2) {
/* 210 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTeMsgTiEspera(s1[1]);
/* 211 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdFuenteTE(s1[3]);
/*     */       
/* 213 */       tagMSG = Integer.valueOf(tagMSG.intValue() + 1);
/* 214 */     } else if (s1[0].trim().equals("MSG") && tagMSG.intValue() == 3) {
/* 215 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setTeMsgExCarencia(s1[1]);
/* 216 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setIdFuenteEC(s1[3]);
/*     */       
/* 218 */       tagMSG = Integer.valueOf(1);
/*     */     } 
/* 220 */     return arrayCadena;
/*     */   }
/*     */ 
/*     */   
/*     */   private static InConProc271 cargarCamposREF(String[] s1, InConProc271 arrayCadena) {
/* 225 */     if (s1[0].trim().equals("REF") && tagREF.intValue() == 1) {
/* 226 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeTiEspera(s1[3]);
/*     */       
/* 228 */       tagREF = Integer.valueOf(tagREF.intValue() + 1);
/* 229 */     } else if (s1[0].trim().equals("REF") && tagREF.intValue() == 2) {
/* 230 */       ((InConProc271Detalle)arrayCadena.getDetalles().get(arrayCadena.getDetalles().size() - 1)).setDeExCarencia(s1[3]);
/*     */       
/* 232 */       tagREF = Integer.valueOf(1);
/*     */     } 
/* 234 */     return arrayCadena;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConProc_ToBean.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */