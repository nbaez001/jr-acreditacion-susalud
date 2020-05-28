/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegAfi270Validador
/*     */ {
/*     */   public String ValidateBeanInRegafi270(InRegAfi270 inRegAfi270) {
/*  15 */     String buscarPorDNI = "OK";
/*  16 */     String error = "0000";
/*  17 */     boolean flagApPaciente1 = false, flagApPaciente2 = false;
/*     */ 
/*     */     
/*  20 */     if ("".equals(inRegAfi270.getNoTransaccion())) {
/*  21 */       error = "0100";
/*  22 */     } else if ("".equals(inRegAfi270.getIdRemitente())) {
/*  23 */       error = "0101";
/*  24 */     } else if ("".equals(inRegAfi270.getIdReceptor())) {
/*  25 */       error = "0102";
/*  26 */     } else if ("".equals(inRegAfi270.getFeTransaccion())) {
/*  27 */       error = "0103";
/*  28 */     } else if ("".equals(inRegAfi270.getHoTransaccion())) {
/*  29 */       error = "0104";
/*  30 */     } else if ("".equals(inRegAfi270.getIdCorrelativo())) {
/*  31 */       error = "0105";
/*  32 */     } else if ("".equals(inRegAfi270.getIdTransaccion())) {
/*  33 */       error = "0106";
/*  34 */     } else if ("".equals(inRegAfi270.getTiFinalidad())) {
/*  35 */       error = "0107";
/*  36 */     } else if ("".equals(inRegAfi270.getCaRemitente())) {
/*  37 */       error = "0108";
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  42 */     else if ("".equals(inRegAfi270.getNuRucRemitente())) {
/*  43 */       error = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  52 */     else if ("".equals(inRegAfi270.getCaReceptor())) {
/*  53 */       error = "0116";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  59 */     else if ("".equals(inRegAfi270.getApPaternoPaciente()) || "".equals(inRegAfi270.getApMaternoPaciente()) || "".equals(inRegAfi270.getCaPaciente())) {
/*  60 */       flagApPaciente1 = true;
/*  61 */       if ("".equals(inRegAfi270.getTiDocumento()) && "".equals(inRegAfi270.getNuDocumento())) {
/*     */         
/*  63 */         if ("".equals(inRegAfi270.getCaPaciente())) {
/*  64 */           error = "0150";
/*  65 */           buscarPorDNI = "NO-OK";
/*     */         } 
/*     */         
/*  68 */         if ("".equals(inRegAfi270.getApPaternoPaciente())) {
/*  69 */           error = "0151";
/*  70 */           buscarPorDNI = "NO-OK";
/*     */         } 
/*     */         
/*  73 */         if ("".equals(inRegAfi270.getApMaternoPaciente())) {
/*  74 */           error = "0154";
/*  75 */           buscarPorDNI = "NO-OK";
/*     */         } 
/*     */       } else {
/*  78 */         flagApPaciente2 = true;
/*  79 */         if ("".equals(inRegAfi270.getTiDocumento())) {
/*  80 */           error = "0156";
/*  81 */         } else if ("".equals(inRegAfi270.getNuDocumento())) {
/*  82 */           error = "0157";
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/*  88 */     if (error.equals("0000")) {
/*  89 */       if (inRegAfi270.getNoTransaccion().trim().length() < 1 || inRegAfi270.getNoTransaccion().trim().length() > 60) {
/*  90 */         error = "0750";
/*  91 */       } else if (ManagerUtil.validaAlfanumerico(inRegAfi270.getIdRemitente()) != '0' || inRegAfi270.getIdRemitente().length() != 15) {
/*  92 */         error = "0751";
/*  93 */       } else if (inRegAfi270.getIdReceptor().length() != 15) {
/*  94 */         error = "0752";
/*  95 */       } else if (!ManagerUtil.validaFecha(inRegAfi270.getFeTransaccion(), "YYYYmmdd") || inRegAfi270.getFeTransaccion().trim().length() != 8) {
/*  96 */         error = "0753";
/*  97 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getHoTransaccion()) != '0' || inRegAfi270.getHoTransaccion().trim().length() < 4 || inRegAfi270.getHoTransaccion().trim().length() > 8) {
/*  98 */         error = "0754";
/*  99 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getIdCorrelativo()) != '0' || inRegAfi270.getIdCorrelativo().trim().length() != 9) {
/* 100 */         error = "0755";
/* 101 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getIdTransaccion()) != '0' || inRegAfi270.getIdTransaccion().trim().length() != 3) {
/* 102 */         error = "0756";
/* 103 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getTiFinalidad()) != '0' || inRegAfi270.getTiFinalidad().trim().length() != 2) {
/* 104 */         error = "0757";
/* 105 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getCaRemitente()) != '0' || inRegAfi270
/* 106 */         .getCaRemitente().trim().length() != 1 || (
/* 107 */         !inRegAfi270.getCaRemitente().trim().equals("1") && 
/* 108 */         !inRegAfi270.getCaRemitente().trim().equals("2"))) {
/* 109 */         error = "0758";
/* 110 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getNuRucRemitente()) != '0' || inRegAfi270
/* 111 */         .getNuRucRemitente().trim().length() < 2 || inRegAfi270
/* 112 */         .getNuRucRemitente().trim().length() > 20 || inRegAfi270
/* 113 */         .getNuRucRemitente().trim().equals("00000000000")) {
/* 114 */         error = "0761";
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 119 */       else if (ManagerUtil.validaSoloDigito(inRegAfi270.getCaReceptor()) != '0' || inRegAfi270
/* 120 */         .getCaReceptor().trim().length() != 1 || (
/* 121 */         !inRegAfi270.getCaReceptor().trim().equals("1") && 
/* 122 */         !inRegAfi270.getCaReceptor().trim().equals("2"))) {
/* 123 */         error = "0766";
/*     */       }
/* 125 */       else if (!flagApPaciente1) {
/* 126 */         if (ManagerUtil.validaSoloDigito(inRegAfi270.getCaPaciente()) != '0' || inRegAfi270
/* 127 */           .getCaPaciente().trim().length() != 1 || (
/* 128 */           !inRegAfi270.getCaPaciente().trim().equals("1") && 
/* 129 */           !inRegAfi270.getCaPaciente().trim().equals("2")))
/* 130 */           error = "0800"; 
/* 131 */       } else if (buscarPorDNI.equals("NO-OK")) {
/*     */         
/* 133 */         if (ManagerUtil.validaSoloDigito(inRegAfi270.getCaPaciente()) != '0' || inRegAfi270
/* 134 */           .getCaPaciente().trim().length() != 1 || (
/* 135 */           !inRegAfi270.getCaPaciente().trim().equals("1") && 
/* 136 */           !inRegAfi270.getCaPaciente().trim().equals("2"))) {
/* 137 */           error = "0800";
/*     */         }
/*     */         
/* 140 */         if (inRegAfi270.getApPaternoPaciente().trim().length() < 1 || inRegAfi270
/* 141 */           .getApPaternoPaciente().trim().length() > 60) {
/* 142 */           error = "0801";
/*     */         }
/*     */         
/* 145 */         if (inRegAfi270.getApMaternoPaciente().trim().length() < 1 || inRegAfi270
/* 146 */           .getApMaternoPaciente().trim().length() > 60) {
/* 147 */           error = "0804";
/*     */         }
/* 149 */       } else if (flagApPaciente2) {
/* 150 */         if (inRegAfi270.getTiDocumento().length() < 1 || inRegAfi270
/* 151 */           .getTiDocumento().length() > 2) {
/* 152 */           error = "0806";
/* 153 */         } else if (ManagerUtil.validaSoloDigito(inRegAfi270.getNuDocumento()) != '0' || inRegAfi270
/* 154 */           .getNuDocumento().trim().length() != 8) {
/* 155 */           error = "0807";
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 160 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\RegAfi270Validador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */