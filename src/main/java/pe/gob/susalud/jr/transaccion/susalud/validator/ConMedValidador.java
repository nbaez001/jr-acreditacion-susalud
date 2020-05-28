/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConMedValidador
/*     */ {
/*     */   public String ValidateBeanIn271ConMed(InConMed271 InConMed) {
/*  15 */     String buscarPorDNI = "OK";
/*  16 */     String error = "0000";
/*     */ 
/*     */ 
/*     */     
/*  20 */     if ("".equals(InConMed.getNoTransaccion())) {
/*  21 */       error = "0100";
/*  22 */     } else if ("".equals(InConMed.getIdRemitente())) {
/*  23 */       error = "0101";
/*  24 */     } else if ("".equals(InConMed.getIdReceptor())) {
/*  25 */       error = "0102";
/*  26 */     } else if ("".equals(InConMed.getFeTransaccion())) {
/*  27 */       error = "0103";
/*  28 */     } else if ("".equals(InConMed.getHoTransaccion())) {
/*  29 */       error = "0104";
/*  30 */     } else if ("".equals(InConMed.getIdCorrelativo())) {
/*  31 */       error = "0105";
/*  32 */     } else if ("".equals(InConMed.getIdTransaccion())) {
/*  33 */       error = "0106";
/*  34 */     } else if ("".equals(InConMed.getTiFinalidad())) {
/*  35 */       error = "0107";
/*  36 */     } else if ("".equals(InConMed.getCaRemitente())) {
/*  37 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  46 */     else if ("".equals(InConMed.getCaReceptor())) {
/*  47 */       error = "0116";
/*  48 */     } else if ("".equals(InConMed.getNuRucReceptor())) {
/*  49 */       error = "0117";
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     if (error.equals("0000")) {
/*  89 */       if (InConMed.getNoTransaccion().trim().length() < 1 || InConMed.getNoTransaccion().trim().length() > 60) {
/*  90 */         error = "0750";
/*  91 */       } else if (ManagerUtil.validaAlfanumerico(InConMed.getIdRemitente()) != '0' || InConMed
/*  92 */         .getIdRemitente().length() != 15) {
/*  93 */         error = "0751";
/*  94 */       } else if (InConMed.getIdReceptor().length() != 15) {
/*  95 */         error = "0752";
/*  96 */       } else if (!ManagerUtil.validaFecha(InConMed.getFeTransaccion(), "YYYYmmdd") || InConMed.getFeTransaccion().trim().length() != 8) {
/*  97 */         error = "0753";
/*  98 */       } else if (ManagerUtil.validaSoloDigito(InConMed.getHoTransaccion()) != '0' || InConMed.getHoTransaccion().trim().length() < 4 || InConMed.getHoTransaccion().trim().length() > 8) {
/*  99 */         error = "0754";
/* 100 */       } else if (ManagerUtil.validaSoloDigito(InConMed.getIdCorrelativo()) != '0' || InConMed.getIdCorrelativo().trim().length() != 9) {
/* 101 */         error = "0755";
/* 102 */       } else if (ManagerUtil.validaSoloDigito(InConMed.getIdTransaccion()) != '0' || InConMed.getIdTransaccion().trim().length() != 3) {
/* 103 */         error = "0756";
/* 104 */       } else if (ManagerUtil.validaSoloDigito(InConMed.getTiFinalidad()) != '0' || InConMed.getTiFinalidad().trim().length() != 2) {
/* 105 */         error = "0757";
/* 106 */       } else if (InConMed.getCaRemitente().trim().length() != 1 || (
/* 107 */         !InConMed.getCaRemitente().trim().equals("1") && 
/* 108 */         !InConMed.getCaRemitente().trim().equals("2"))) {
/* 109 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 115 */       else if (ManagerUtil.validaSoloDigito(InConMed.getCaReceptor()) != '0' || InConMed
/* 116 */         .getCaReceptor().trim().length() != 1 || (
/* 117 */         !InConMed.getCaReceptor().trim().equals("1") && 
/* 118 */         !InConMed.getCaReceptor().trim().equals("2"))) {
/* 119 */         error = "0766";
/* 120 */       } else if (ManagerUtil.validaSoloDigito(InConMed.getNuRucReceptor()) != '0' || InConMed.getNuRucReceptor().trim().length() < 2 || InConMed
/* 121 */         .getNuRucReceptor().trim().length() > 20 || InConMed
/* 122 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 123 */         error = "0767";
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConMedValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */