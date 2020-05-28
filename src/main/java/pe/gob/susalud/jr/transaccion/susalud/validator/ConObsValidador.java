/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConObs;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConObsValidador
/*     */ {
/*     */   public String ValidateBeanIn271ConObs(In271ConObs inConObs) {
/*  15 */     String buscarPorDNI = "OK";
/*  16 */     String error = "0000";
/*     */ 
/*     */     
/*  19 */     if ("".equals(inConObs.getNoTransaccion())) {
/*  20 */       error = "0100";
/*  21 */     } else if ("".equals(inConObs.getIdRemitente())) {
/*  22 */       error = "0101";
/*  23 */     } else if ("".equals(inConObs.getIdReceptor())) {
/*  24 */       error = "0102";
/*  25 */     } else if ("".equals(inConObs.getFeTransaccion())) {
/*  26 */       error = "0103";
/*  27 */     } else if ("".equals(inConObs.getHoTransaccion())) {
/*  28 */       error = "0104";
/*  29 */     } else if ("".equals(inConObs.getIdCorrelativo())) {
/*  30 */       error = "0105";
/*  31 */     } else if ("".equals(inConObs.getIdTransaccion())) {
/*  32 */       error = "0106";
/*  33 */     } else if ("".equals(inConObs.getTiFinalidad())) {
/*  34 */       error = "0107";
/*  35 */     } else if ("".equals(inConObs.getCaRemitente())) {
/*  36 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  45 */     else if ("".equals(inConObs.getCaReceptor())) {
/*  46 */       error = "0116";
/*  47 */     } else if ("".equals(inConObs.getNuRucReceptor())) {
/*  48 */       error = "0117";
/*     */     }
/*  50 */     else if ("".equals(inConObs.getCaPaciente())) {
/*  51 */       error = "0150";
/*  52 */     } else if ("".equals(inConObs.getApPaternoPaciente())) {
/*  53 */       error = "0151";
/*  54 */     } else if ("".equals(inConObs.getNoPaciente())) {
/*  55 */       error = "0152";
/*  56 */     } else if ("".equals(inConObs.getCoAfPaciente())) {
/*  57 */       error = "0153";
/*  58 */     } else if ("".equals(inConObs.getApMaternoPaciente())) {
/*  59 */       error = "0154";
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
/*  82 */     else if ("".equals(inConObs.getTeMsgLibre1())) {
/*  83 */       error = "0461";
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     if (error.equals("0000")) {
/*  92 */       if (inConObs.getNoTransaccion().trim().length() < 1 || inConObs.getNoTransaccion().trim().length() > 60) {
/*  93 */         error = "0750";
/*  94 */       } else if (ManagerUtil.validaAlfanumerico(inConObs.getIdRemitente()) != '0' || inConObs
/*  95 */         .getIdRemitente().length() != 15) {
/*  96 */         error = "0751";
/*  97 */       } else if (inConObs.getIdReceptor().length() != 15) {
/*  98 */         error = "0752";
/*  99 */       } else if (!ManagerUtil.validaFecha(inConObs.getFeTransaccion(), "YYYYmmdd") || inConObs.getFeTransaccion().trim().length() != 8) {
/* 100 */         error = "0753";
/* 101 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getHoTransaccion()) != '0' || inConObs.getHoTransaccion().trim().length() < 4 || inConObs.getHoTransaccion().trim().length() > 8) {
/* 102 */         error = "0754";
/* 103 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getIdCorrelativo()) != '0' || inConObs.getIdCorrelativo().trim().length() != 9) {
/* 104 */         error = "0755";
/* 105 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getIdTransaccion()) != '0' || inConObs.getIdTransaccion().trim().length() != 3) {
/* 106 */         error = "0756";
/* 107 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getTiFinalidad()) != '0' || inConObs.getTiFinalidad().trim().length() != 2) {
/* 108 */         error = "0757";
/* 109 */       } else if (inConObs.getCaRemitente().trim().length() != 1 || (
/* 110 */         !inConObs.getCaRemitente().trim().equals("1") && 
/* 111 */         !inConObs.getCaRemitente().trim().equals("2"))) {
/* 112 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 118 */       else if (ManagerUtil.validaSoloDigito(inConObs.getCaReceptor()) != '0' || inConObs
/* 119 */         .getCaReceptor().trim().length() != 1 || (
/* 120 */         !inConObs.getCaReceptor().trim().equals("1") && 
/* 121 */         !inConObs.getCaReceptor().trim().equals("2"))) {
/* 122 */         error = "0766";
/* 123 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getNuRucReceptor()) != '0' || inConObs.getNuRucReceptor().trim().length() < 2 || inConObs
/* 124 */         .getNuRucReceptor().trim().length() > 20 || inConObs
/* 125 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 126 */         error = "0767";
/*     */       }
/* 128 */       else if (inConObs.getCaPaciente().trim().length() != 1 || (!inConObs.getCaPaciente().trim().equals("1") && 
/* 129 */         !inConObs.getCaPaciente().trim().equals("2"))) {
/* 130 */         error = "0800";
/* 131 */       } else if (inConObs.getApPaternoPaciente().trim().length() < 1 || inConObs
/* 132 */         .getApPaternoPaciente().trim().length() > 60) {
/* 133 */         error = "0801";
/* 134 */       } else if (inConObs.getNoPaciente().trim().length() < 1 || inConObs
/* 135 */         .getNoPaciente().trim().length() > 35) {
/* 136 */         error = "0802";
/* 137 */       } else if (ManagerUtil.validaSoloDigito(inConObs.getCoAfPaciente()) != '0' || inConObs
/* 138 */         .getCoAfPaciente().trim().length() < 2 || inConObs
/* 139 */         .getCoAfPaciente().trim().length() > 20) {
/* 140 */         error = "0803";
/* 141 */       } else if (inConObs.getApMaternoPaciente().trim().length() < 1 || inConObs
/* 142 */         .getApMaternoPaciente().trim().length() > 60) {
/* 143 */         error = "0804";
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
/* 176 */       else if (inConObs.getTeMsgLibre1().trim().length() < 1 || inConObs
/* 177 */         .getTeMsgLibre1().trim().length() > 264) {
/* 178 */         error = "1161";
/*     */       } 
/*     */     }
/* 181 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConObsValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */