/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In997ResAut;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResAutValidador
/*     */ {
/*     */   public String ValidateBeanInSolAut271(In997ResAut inResAut) {
/*  14 */     String error = "0000";
/*     */ 
/*     */     
/*  17 */     if ("".equals(inResAut.getNoTransaccion())) {
/*  18 */       error = "0100";
/*  19 */     } else if ("".equals(inResAut.getIdRemitente())) {
/*  20 */       error = "0101";
/*  21 */     } else if ("".equals(inResAut.getIdReceptor())) {
/*  22 */       error = "0102";
/*  23 */     } else if ("".equals(inResAut.getFeTransaccion())) {
/*  24 */       error = "0103";
/*  25 */     } else if ("".equals(inResAut.getHoTransaccion())) {
/*  26 */       error = "0104";
/*  27 */     } else if ("".equals(inResAut.getIdCorrelativo())) {
/*  28 */       error = "0105";
/*  29 */     } else if ("".equals(inResAut.getIdTransaccion())) {
/*  30 */       error = "0106";
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
/*     */     }
/*  53 */     else if ("".equals(inResAut.getNuAutorizacion())) {
/*  54 */       error = "0124";
/*     */     
/*     */     }
/*  57 */     else if ("".equals(inResAut.getCoError())) {
/*  58 */       error = "0127";
/*  59 */     } else if ("".equals(inResAut.getInCoErrorEncontrado())) {
/*  60 */       error = "0128";
/*     */     } 
/*     */ 
/*     */     
/*  64 */     if (error.equals("0000")) {
/*  65 */       if (inResAut.getNoTransaccion().trim().length() < 1 || inResAut.getNoTransaccion().trim().length() > 60) {
/*  66 */         error = "0750";
/*  67 */       } else if (ManagerUtil.validaAlfanumerico(inResAut.getIdRemitente()) != '0' || inResAut.getIdRemitente().length() != 15) {
/*  68 */         error = "0751";
/*  69 */       } else if (inResAut.getIdReceptor().length() != 15) {
/*  70 */         error = "0752";
/*  71 */       } else if (!ManagerUtil.validaFecha(inResAut.getFeTransaccion(), "YYYYmmdd") || inResAut.getFeTransaccion().trim().length() != 8) {
/*  72 */         error = "0753";
/*  73 */       } else if (ManagerUtil.validaSoloDigito(inResAut.getHoTransaccion()) != '0' || inResAut.getHoTransaccion().trim().length() < 4 || inResAut.getHoTransaccion().trim().length() > 8) {
/*  74 */         error = "0754";
/*  75 */       } else if (ManagerUtil.validaSoloDigito(inResAut.getIdCorrelativo()) != '0' || inResAut.getIdCorrelativo().trim().length() != 9) {
/*  76 */         error = "0755";
/*  77 */       } else if (ManagerUtil.validaSoloDigito(inResAut.getIdTransaccion()) != '0' || inResAut.getIdTransaccion().trim().length() != 3) {
/*  78 */         error = "0756";
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
/*     */       }
/* 119 */       else if (ManagerUtil.validaAlfanumerico(inResAut.getNuAutorizacion()) != '0' || inResAut.getNuAutorizacion().trim().length() < 1 || inResAut.getNuAutorizacion().trim().length() > 20) {
/* 120 */         error = "0774";
/*     */       
/*     */       }
/* 123 */       else if (ManagerUtil.validaAlfanumerico(inResAut.getCoError()) != '0' || inResAut.getCoError().trim().length() != 1) {
/* 124 */         error = "0777";
/* 125 */       } else if (ManagerUtil.validaSoloDigito(inResAut.getInCoErrorEncontrado()) != '0' || inResAut.getInCoErrorEncontrado().trim().length() < 1 || inResAut.getInCoErrorEncontrado().trim().length() > 3) {
/* 126 */         error = "0778";
/*     */       } 
/*     */     }
/* 129 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ResAutValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */