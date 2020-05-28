/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResEntVincValidador
/*     */ {
/*     */   public String ValidateBeanInSolAut271(InResEntVinc278 inResEntVinc) {
/*  14 */     String buscarPorDNI = "OK";
/*  15 */     String error = "0000";
/*     */ 
/*     */     
/*  18 */     if ("".equals(inResEntVinc.getNoTransaccion())) {
/*  19 */       error = "0100";
/*  20 */     } else if ("".equals(inResEntVinc.getIdRemitente())) {
/*  21 */       error = "0101";
/*  22 */     } else if ("".equals(inResEntVinc.getIdReceptor())) {
/*  23 */       error = "0102";
/*  24 */     } else if ("".equals(inResEntVinc.getFeTransaccion())) {
/*  25 */       error = "0103";
/*  26 */     } else if ("".equals(inResEntVinc.getHoTransaccion())) {
/*  27 */       error = "0104";
/*  28 */     } else if ("".equals(inResEntVinc.getIdCorrelativo())) {
/*  29 */       error = "0105";
/*  30 */     } else if ("".equals(inResEntVinc.getIdTransaccion())) {
/*  31 */       error = "0106";
/*  32 */     } else if ("".equals(inResEntVinc.getTiFinalidad())) {
/*  33 */       error = "0107";
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
/*     */     }
/*  63 */     else if ("".equals(inResEntVinc.getRespuesta())) {
/*  64 */       error = "0129";
/*  65 */     } else if ("".equals(inResEntVinc.getMsgRespuesta())) {
/*  66 */       error = "0130";
/*     */     } 
/*     */ 
/*     */     
/*  70 */     if (error.equals("0000")) {
/*  71 */       if (inResEntVinc.getNoTransaccion().trim().length() < 1 || inResEntVinc.getNoTransaccion().trim().length() > 60) {
/*  72 */         error = "0750";
/*  73 */       } else if (ManagerUtil.validaAlfanumerico(inResEntVinc.getIdRemitente()) != '0' || inResEntVinc.getIdRemitente().length() != 15) {
/*  74 */         error = "0751";
/*  75 */       } else if (inResEntVinc.getIdReceptor().length() != 15) {
/*  76 */         error = "0752";
/*  77 */       } else if (!ManagerUtil.validaFecha(inResEntVinc.getFeTransaccion(), "YYYYmmdd") || inResEntVinc.getFeTransaccion().trim().length() != 8) {
/*  78 */         error = "0753";
/*  79 */       } else if (ManagerUtil.validaSoloDigito(inResEntVinc.getHoTransaccion()) != '0' || inResEntVinc.getHoTransaccion().trim().length() < 4 || inResEntVinc.getHoTransaccion().trim().length() > 8) {
/*  80 */         error = "0754";
/*  81 */       } else if (ManagerUtil.validaSoloDigito(inResEntVinc.getIdCorrelativo()) != '0' || inResEntVinc.getIdCorrelativo().trim().length() != 9) {
/*  82 */         error = "0755";
/*  83 */       } else if (ManagerUtil.validaSoloDigito(inResEntVinc.getIdTransaccion()) != '0' || inResEntVinc.getIdTransaccion().trim().length() != 3) {
/*  84 */         error = "0756";
/*  85 */       } else if (ManagerUtil.validaSoloDigito(inResEntVinc.getTiFinalidad()) != '0' || inResEntVinc.getTiFinalidad().trim().length() != 2) {
/*  86 */         error = "0757";
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
/*     */       }
/* 134 */       else if (ManagerUtil.validaAlfanumerico(inResEntVinc.getRespuesta()) != '0' || inResEntVinc.getRespuesta().trim().length() != 1) {
/* 135 */         error = "0779";
/* 136 */       } else if (ManagerUtil.validaAlfanumerico(inResEntVinc.getMsgRespuesta()) != '0' || inResEntVinc.getMsgRespuesta().trim().length() < 1 || inResEntVinc.getMsgRespuesta().trim().length() > 80) {
/* 137 */         error = "0780";
/*     */       } 
/*     */     }
/* 140 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ResEntVincValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */