/*    */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConEntVinValidador
/*    */ {
/*    */   public String ValidateBeanIn271ConMed(InConEntVinc278 inConEntVinc) {
/* 15 */     String buscarPorDNI = "OK";
/* 16 */     String error = "0000";
/*    */ 
/*    */     
/* 19 */     if ("".equals(inConEntVinc.getNoTransaccion())) {
/* 20 */       error = "0100";
/* 21 */     } else if ("".equals(inConEntVinc.getIdRemitente())) {
/* 22 */       error = "0101";
/* 23 */     } else if ("".equals(inConEntVinc.getIdReceptor())) {
/* 24 */       error = "0102";
/* 25 */     } else if ("".equals(inConEntVinc.getFeTransaccion())) {
/* 26 */       error = "0103";
/* 27 */     } else if ("".equals(inConEntVinc.getHoTransaccion())) {
/* 28 */       error = "0104";
/* 29 */     } else if ("".equals(inConEntVinc.getIdCorrelativo())) {
/* 30 */       error = "0105";
/* 31 */     } else if ("".equals(inConEntVinc.getIdTransaccion())) {
/* 32 */       error = "0106";
/* 33 */     } else if ("".equals(inConEntVinc.getTiFinalidad())) {
/* 34 */       error = "0107";
/* 35 */     } else if ("".equals(inConEntVinc.getCaIPRESS())) {
/* 36 */       error = "0108";
/* 37 */     } else if ("".equals(inConEntVinc.getNoIPRESS())) {
/* 38 */       error = "0109";
/* 39 */     } else if ("".equals(inConEntVinc.getTiDoIPRESS())) {
/* 40 */       error = "0110";
/* 41 */     } else if ("".equals(inConEntVinc.getNuRucIPRESS())) {
/* 42 */       error = "0111";
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     if (error.equals("0000")) {
/* 51 */       if (inConEntVinc.getNoTransaccion().trim().length() < 1 || inConEntVinc.getNoTransaccion().trim().length() > 60) {
/* 52 */         error = "0750";
/* 53 */       } else if (ManagerUtil.validaAlfanumerico(inConEntVinc.getIdRemitente()) != '0' || inConEntVinc
/* 54 */         .getIdRemitente().length() != 15) {
/* 55 */         error = "0751";
/* 56 */       } else if (inConEntVinc.getIdReceptor().length() != 15) {
/* 57 */         error = "0752";
/* 58 */       } else if (!ManagerUtil.validaFecha(inConEntVinc.getFeTransaccion(), "YYYYmmdd") || inConEntVinc.getFeTransaccion().trim().length() != 8) {
/* 59 */         error = "0753";
/* 60 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getHoTransaccion()) != '0' || inConEntVinc.getHoTransaccion().trim().length() < 4 || inConEntVinc.getHoTransaccion().trim().length() > 8) {
/* 61 */         error = "0754";
/* 62 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getIdCorrelativo()) != '0' || inConEntVinc.getIdCorrelativo().trim().length() != 9) {
/* 63 */         error = "0755";
/* 64 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getIdTransaccion()) != '0' || inConEntVinc.getIdTransaccion().trim().length() != 3) {
/* 65 */         error = "0756";
/* 66 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getTiFinalidad()) != '0' || inConEntVinc.getTiFinalidad().trim().length() != 2) {
/* 67 */         error = "0757";
/* 68 */       } else if (inConEntVinc.getCaIPRESS().trim().length() != 1 || (
/* 69 */         !inConEntVinc.getCaIPRESS().trim().equals("1") && 
/* 70 */         !inConEntVinc.getCaIPRESS().trim().equals("2"))) {
/* 71 */         error = "0758";
/* 72 */       } else if (inConEntVinc.getNoIPRESS().trim().length() < 1 || inConEntVinc
/* 73 */         .getNoIPRESS().trim().length() > 35) {
/* 74 */         error = "0759";
/* 75 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getTiDoIPRESS()) != '0' || inConEntVinc
/* 76 */         .getTiDoIPRESS().trim().length() < 1 || inConEntVinc
/* 77 */         .getTiDoIPRESS().trim().length() > 2) {
/* 78 */         error = "0760";
/* 79 */       } else if (ManagerUtil.validaSoloDigito(inConEntVinc.getNuRucIPRESS()) != '0' || inConEntVinc
/* 80 */         .getNuRucIPRESS().trim().length() < 2 || inConEntVinc
/* 81 */         .getNuRucIPRESS().trim().length() > 20 || inConEntVinc
/* 82 */         .getNuRucIPRESS().trim().equals("00000000000")) {
/* 83 */         error = "0761";
/*    */       } 
/*    */     }
/* 86 */     return error;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConEntVinValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */