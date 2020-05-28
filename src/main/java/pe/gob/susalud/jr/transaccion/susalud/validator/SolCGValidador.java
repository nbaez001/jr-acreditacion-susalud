/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SolCGValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(In278SolCG inSolCG) {
/*  15 */     String buscarPorDNI = "OK";
/*  16 */     String error = "0000";
/*     */ 
/*     */     
/*  19 */     if ("".equals(inSolCG.getNoTransaccion())) {
/*  20 */       error = "0100";
/*  21 */     } else if ("".equals(inSolCG.getIdRemitente())) {
/*  22 */       error = "0101";
/*  23 */     } else if ("".equals(inSolCG.getIdReceptor())) {
/*  24 */       error = "0102";
/*  25 */     } else if ("".equals(inSolCG.getFeTransaccion())) {
/*  26 */       error = "0103";
/*  27 */     } else if ("".equals(inSolCG.getHoTransaccion())) {
/*  28 */       error = "0104";
/*  29 */     } else if ("".equals(inSolCG.getIdCorrelativo())) {
/*  30 */       error = "0105";
/*  31 */     } else if ("".equals(inSolCG.getIdTransaccion())) {
/*  32 */       error = "0106";
/*  33 */     } else if ("".equals(inSolCG.getTiFinalidad())) {
/*  34 */       error = "0107";
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
/*  50 */     else if ("".equals(inSolCG.getCaPaciente())) {
/*  51 */       error = "0150";
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
/*  68 */     else if ("".equals(inSolCG.getNuSoCarGarantia())) {
/*  69 */       error = "0469";
/*     */ 
/*     */     
/*     */     }
/*  73 */     else if ("".equals(inSolCG.getEsCarGarantia())) {
/*  74 */       error = "0472";
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
/*  85 */     if (error.equals("0000")) {
/*  86 */       if (inSolCG.getNoTransaccion().trim().length() < 1 || inSolCG.getNoTransaccion().trim().length() > 60) {
/*  87 */         error = "0750";
/*  88 */       } else if (ManagerUtil.validaAlfanumerico(inSolCG.getIdRemitente()) != '0' || inSolCG.getIdRemitente().length() != 15) {
/*  89 */         error = "0751";
/*  90 */       } else if (inSolCG.getIdReceptor().length() != 15) {
/*  91 */         error = "0752";
/*  92 */       } else if (!ManagerUtil.validaFecha(inSolCG.getFeTransaccion(), "YYYYmmdd") || inSolCG.getFeTransaccion().trim().length() != 8) {
/*  93 */         error = "0753";
/*  94 */       } else if (ManagerUtil.validaSoloDigito(inSolCG.getHoTransaccion()) != '0' || inSolCG.getHoTransaccion().trim().length() < 4 || inSolCG.getHoTransaccion().trim().length() > 8) {
/*  95 */         error = "0754";
/*  96 */       } else if (ManagerUtil.validaSoloDigito(inSolCG.getIdCorrelativo()) != '0' || inSolCG.getIdCorrelativo().trim().length() != 9) {
/*  97 */         error = "0755";
/*  98 */       } else if (ManagerUtil.validaSoloDigito(inSolCG.getIdTransaccion()) != '0' || inSolCG.getIdTransaccion().trim().length() != 3) {
/*  99 */         error = "0756";
/* 100 */       } else if (ManagerUtil.validaSoloDigito(inSolCG.getTiFinalidad()) != '0' || inSolCG.getTiFinalidad().trim().length() != 2) {
/* 101 */         error = "0757";
/*     */       }
/* 103 */       else if (ManagerUtil.validaSoloDigito(inSolCG.getCaPaciente()) != '0' || inSolCG
/* 104 */         .getCaPaciente().trim().length() != 1 || (
/* 105 */         !inSolCG.getCaPaciente().trim().equals("1") && 
/* 106 */         !inSolCG.getCaPaciente().trim().equals("2"))) {
/* 107 */         error = "0800";
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
/* 138 */       else if (inSolCG.getNuSoCarGarantia().trim().length() < 1 || inSolCG
/* 139 */         .getNuSoCarGarantia().trim().length() > 20) {
/* 140 */         error = "1169";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 147 */       else if (ManagerUtil.validaSoloDigito(inSolCG.getEsCarGarantia()) != '0' || inSolCG
/* 148 */         .getEsCarGarantia().trim().length() < 1 || inSolCG
/* 149 */         .getEsCarGarantia().trim().length() > 2) {
/* 150 */         error = "1172";
/*     */       } 
/*     */     }
/* 153 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\SolCGValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */