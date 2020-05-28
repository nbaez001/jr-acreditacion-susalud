/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import java.text.ParseException;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Locale;
/*     */ 
/*     */ 
/*     */ public class ManagerUtil
/*     */ {
/*     */   public static String DateToString(Date fech) {
/*  12 */     SimpleDateFormat dayFormatter = new SimpleDateFormat("yyyyMMdd");
/*  13 */     String displayDate = dayFormatter.format(fech);
/*  14 */     return displayDate;
/*     */   }
/*     */   
/*     */   public static final char validaCaracterPalabra(String p_palabra) {
/*  18 */     String palabra = p_palabra.toUpperCase();
/*  19 */     String validos = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ ";
/*  20 */     int len = palabra.length();
/*  21 */     char c = '0';
/*  22 */     for (int i = 0; i < len; i++) {
/*  23 */       c = palabra.charAt(i);
/*  24 */       if ("ABCDEFGHIJKLMN�OPQRSTUVWXYZ ".indexOf(c) == -1) return c; 
/*     */     } 
/*  26 */     return '0';
/*     */   }
/*     */   
/*     */   public static final boolean cadenaUsuarioCorrecto(String p_usuario) {
/*  30 */     char c_caracter = '0';
/*  31 */     int len = p_usuario.length();
/*  32 */     if (len != 8) return false; 
/*  33 */     c_caracter = validaSoloDigito(p_usuario);
/*  34 */     if (c_caracter != '0') return false; 
/*  35 */     return true;
/*     */   }
/*     */   
/*     */   public static final boolean validaCantidadDigito(String p_digitos) {
/*  39 */     char c_caracter = '0';
/*  40 */     int len = p_digitos.length();
/*  41 */     if (len != 8) return false;
/*     */ 
/*     */ 
/*     */     
/*  45 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final char validaDigitoEspacio(String p_palabra) {
/*  51 */     String palabra = p_palabra.trim();
/*  52 */     String validos = "0123456789 ";
/*  53 */     int len = palabra.length();
/*  54 */     char c = '0';
/*  55 */     for (int i = 0; i < len; i++) {
/*  56 */       c = palabra.charAt(i);
/*  57 */       if ("0123456789 ".indexOf(c) == -1) return c; 
/*     */     } 
/*  59 */     return '0';
/*     */   }
/*     */   
/*     */   public static final char validaUnoEspacio(String p_palabra) {
/*  63 */     String palabra = p_palabra.trim();
/*  64 */     String validos = "1 ";
/*  65 */     int len = palabra.length();
/*  66 */     char c = '0';
/*  67 */     for (int i = 0; i < len; i++) {
/*  68 */       c = palabra.charAt(i);
/*  69 */       if ("1 ".indexOf(c) == -1) return c; 
/*     */     } 
/*  71 */     return '0';
/*     */   }
/*     */   
/*     */   public static final char validaSoloDigito(String p_palabra) {
/*  75 */     String palabra = p_palabra.trim();
/*  76 */     String validos = "0123456789";
/*  77 */     int len = palabra.length();
/*  78 */     char c = '0';
/*  79 */     for (int i = 0; i < len; i++) {
/*  80 */       c = palabra.charAt(i);
/*  81 */       if ("0123456789".indexOf(c) == -1) return c; 
/*     */     } 
/*  83 */     return '0';
/*     */   }
/*     */   
/*     */   public static final char validaDecimales(String p_palabra) {
/*  87 */     String palabra = p_palabra.trim();
/*  88 */     String validos = "0123456789.";
/*  89 */     int len = palabra.length();
/*  90 */     char c = '0';
/*  91 */     for (int i = 0; i < len; i++) {
/*  92 */       c = palabra.charAt(i);
/*  93 */       if ("0123456789.".indexOf(c) == -1) return c; 
/*     */     } 
/*  95 */     return '0';
/*     */   }
/*     */   
/*     */   public static char validaAlfanumerico(String p_palabra) {
/*  99 */     String palabra = p_palabra.toUpperCase();
/* 100 */     String validos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
/* 101 */     int len = palabra.length();
/* 102 */     char c = '0';
/* 103 */     for (int i = 0; i < len; i++) {
/* 104 */       c = palabra.charAt(i);
/* 105 */       if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ".indexOf(c) == -1) return c; 
/*     */     } 
/* 107 */     return '0';
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String ordenaListaNumerica(String listaNumerica) {
/* 113 */     String subTipoConsulta = listaNumerica;
/* 114 */     String[] aSubTipo = new String[subTipoConsulta.length()]; int i;
/* 115 */     for (i = 0; i < subTipoConsulta.length(); ) { aSubTipo[i] = subTipoConsulta.substring(i, i + 1); i++; }
/* 116 */      for (i = 0; i < aSubTipo.length - 1; i++) {
/* 117 */       String menor = aSubTipo[i];
/* 118 */       for (int k = i + 1; k < aSubTipo.length; k++) {
/* 119 */         if (Integer.parseInt(menor) > Integer.parseInt(aSubTipo[k])) {
/* 120 */           String mayor = menor;
/* 121 */           menor = aSubTipo[k];
/* 122 */           aSubTipo[k] = mayor;
/*     */         } 
/*     */       } 
/* 125 */       aSubTipo[i] = menor;
/*     */     } 
/* 127 */     String cadena = "";
/* 128 */     for (int j = 0; j < aSubTipo.length - 1; j++) {
/* 129 */       String valor = aSubTipo[j];
/* 130 */       for (int k = j + 1; k < aSubTipo.length; k++) {
/* 131 */         if (Integer.parseInt(valor) != Integer.parseInt(aSubTipo[k]))
/* 132 */         { cadena = cadena + valor;
/* 133 */           k = aSubTipo.length; }
/* 134 */         else { k = aSubTipo.length; }
/*     */       
/*     */       } 
/* 137 */     }  if (aSubTipo.length == 1) { cadena = aSubTipo[0]; }
/* 138 */     else { cadena = cadena + aSubTipo[aSubTipo.length - 1]; }
/* 139 */      return cadena;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final int verificaLista(String[][] listaCompleta, String listaValidar, String tipoConsulta, String tipoFicha) {
/* 144 */     String[][] aConsulta = listaCompleta;
/* 145 */     String subConsultas = listaValidar;
/* 146 */     String tipConsulta = tipoConsulta;
/* 147 */     int iExiste = 0;
/*     */     
/* 149 */     for (int j = 0; j < subConsultas.length(); j++) {
/* 150 */       String sCaracter = subConsultas.substring(j, j + 1);
/* 151 */       for (int i = 0; i < aConsulta.length; i++) {
/* 152 */         if (aConsulta[i][0].equals(tipConsulta) && aConsulta[i][1].equals(sCaracter))
/*     */         {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 160 */           iExiste++;
/*     */         }
/*     */       } 
/*     */     } 
/* 164 */     return iExiste;
/*     */   }
/*     */ 
/*     */   
/*     */   public static final String[] listaConsulta(String listaCadena) {
/* 169 */     String subTipoConsulta = listaCadena.trim();
/* 170 */     String[] aSubTipo = new String[subTipoConsulta.length()];
/* 171 */     for (int i = 0; i < subTipoConsulta.length(); ) { aSubTipo[i] = subTipoConsulta.substring(i, i + 1); i++; }
/* 172 */      return aSubTipo;
/*     */   }
/*     */   
/*     */   public static final int validaConsulta(String[][] listaCompleta, String valor) {
/* 176 */     String[][] aConsulta = listaCompleta;
/* 177 */     int iExiste = 0;
/* 178 */     for (int i = 0; i < aConsulta.length; ) { if (aConsulta[i][0].equals(valor)) iExiste++;  i++; }
/* 179 */      return iExiste;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String DateToStringFechaHora(Date fech) {
/* 184 */     SimpleDateFormat dayFormatter = new SimpleDateFormat("yyyyMMddHHmmss");
/* 185 */     String displayDate = dayFormatter.format(fech);
/* 186 */     return displayDate;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean validaFecha(String sFecha, String sFormato) {
/*     */     try {
/* 192 */       SimpleDateFormat formatoFecha = new SimpleDateFormat(sFormato, Locale.getDefault());
/* 193 */       formatoFecha.setLenient(false);
/* 194 */       formatoFecha.parse(sFecha);
/* 195 */     } catch (ParseException e) {
/* 196 */       return false;
/*     */     } 
/* 198 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String removerCaractEspecial(String input) {
/* 203 */     String original = "áàäéèëíìïóòöúùuñ<>&ÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
/*     */     
/* 205 */     String ascii = "aaaeeeiiiooouuu#   AAAEEEIIIOOOUUU#cC";
/* 206 */     String output = input;
/* 207 */     for (int i = 0; i < original.length(); i++)
/*     */     {
/* 209 */       output = output.replace(original.charAt(i), ascii.charAt(i));
/*     */     }
/* 211 */     return output;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ManagerUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */