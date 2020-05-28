/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConDtadValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(In271ConDtad inConDtad) {
/*  15 */     String buscarPorDNI = "OK";
/*  16 */     String error = "0000";
/*     */ 
/*     */     
/*  19 */     if ("".equals(inConDtad.getNoTransaccion())) {
/*  20 */       error = "0100";
/*  21 */     } else if ("".equals(inConDtad.getIdRemitente())) {
/*  22 */       error = "0101";
/*  23 */     } else if ("".equals(inConDtad.getIdReceptor())) {
/*  24 */       error = "0102";
/*  25 */     } else if ("".equals(inConDtad.getFeTransaccion())) {
/*  26 */       error = "0103";
/*  27 */     } else if ("".equals(inConDtad.getHoTransaccion())) {
/*  28 */       error = "0104";
/*  29 */     } else if ("".equals(inConDtad.getIdCorrelativo())) {
/*  30 */       error = "0105";
/*  31 */     } else if ("".equals(inConDtad.getIdTransaccion())) {
/*  32 */       error = "0106";
/*  33 */     } else if ("".equals(inConDtad.getTiFinalidad())) {
/*  34 */       error = "0107";
/*  35 */     } else if ("".equals(inConDtad.getCaRemitente())) {
/*  36 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  45 */     else if ("".equals(inConDtad.getCaReceptor())) {
/*  46 */       error = "0116";
/*  47 */     } else if ("".equals(inConDtad.getNuRucReceptor())) {
/*  48 */       error = "0117";
/*     */     }
/*  50 */     else if ("".equals(inConDtad.getCaPaciente())) {
/*  51 */       error = "0150";
/*  52 */     } else if ("".equals(inConDtad.getApPaternoPaciente())) {
/*  53 */       error = "0151";
/*  54 */     } else if ("".equals(inConDtad.getNoPaciente())) {
/*  55 */       error = "0152";
/*  56 */     } else if ("".equals(inConDtad.getCoAfPaciente())) {
/*  57 */       error = "0153";
/*  58 */     } else if ("".equals(inConDtad.getApMaternoPaciente())) {
/*  59 */       error = "0154";
/*  60 */     } else if ("".equals(inConDtad.getDeDirPaciente1())) {
/*  61 */       error = "0182";
/*     */     
/*     */     }
/*  64 */     else if ("".equals(inConDtad.getCoUbigeoPaciente())) {
/*  65 */       error = "0184";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  72 */     else if ("".equals(inConDtad.getTiCaCalificador())) {
/*  73 */       error = "0188";
/*  74 */     } else if ("".equals(inConDtad.getApPaNoEmCalificador())) {
/*  75 */       error = "0189";
/*  76 */     } else if ("".equals(inConDtad.getNoEmCalificador())) {
/*  77 */       error = "0190";
/*  78 */     } else if ("".equals(inConDtad.getApMaCalificador())) {
/*  79 */       error = "0191";
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     if (error.equals("0000")) {
/*  88 */       if (inConDtad.getNoTransaccion().trim().length() < 1 || inConDtad.getNoTransaccion().trim().length() > 60) {
/*  89 */         error = "0750";
/*  90 */       } else if (ManagerUtil.validaAlfanumerico(inConDtad.getIdRemitente()) != '0' || inConDtad
/*  91 */         .getIdRemitente().length() != 15) {
/*  92 */         error = "0751";
/*  93 */       } else if (inConDtad.getIdReceptor().length() != 15) {
/*  94 */         error = "0752";
/*  95 */       } else if (!ManagerUtil.validaFecha(inConDtad.getFeTransaccion(), "YYYYmmdd") || inConDtad.getFeTransaccion().trim().length() != 8) {
/*  96 */         error = "0753";
/*  97 */       } else if (ManagerUtil.validaSoloDigito(inConDtad.getHoTransaccion()) != '0' || inConDtad.getHoTransaccion().trim().length() < 4 || inConDtad.getHoTransaccion().trim().length() > 8) {
/*  98 */         error = "0754";
/*  99 */       } else if (ManagerUtil.validaSoloDigito(inConDtad.getIdCorrelativo()) != '0' || inConDtad.getIdCorrelativo().trim().length() != 9) {
/* 100 */         error = "0755";
/* 101 */       } else if (ManagerUtil.validaSoloDigito(inConDtad.getIdTransaccion()) != '0' || inConDtad.getIdTransaccion().trim().length() != 3) {
/* 102 */         error = "0756";
/* 103 */       } else if (ManagerUtil.validaSoloDigito(inConDtad.getTiFinalidad()) != '0' || inConDtad.getTiFinalidad().trim().length() != 2) {
/* 104 */         error = "0757";
/* 105 */       } else if (inConDtad.getCaRemitente().trim().length() != 1 || (
/* 106 */         !inConDtad.getCaRemitente().trim().equals("1") && 
/* 107 */         !inConDtad.getCaRemitente().trim().equals("2"))) {
/* 108 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 114 */       else if (ManagerUtil.validaSoloDigito(inConDtad.getCaReceptor()) != '0' || inConDtad
/* 115 */         .getCaReceptor().trim().length() != 1 || (
/* 116 */         !inConDtad.getCaReceptor().trim().equals("1") && 
/* 117 */         !inConDtad.getCaReceptor().trim().equals("2"))) {
/* 118 */         error = "0766";
/* 119 */       } else if (ManagerUtil.validaSoloDigito(inConDtad.getNuRucReceptor()) != '0' || inConDtad.getNuRucReceptor().trim().length() < 2 || inConDtad
/* 120 */         .getNuRucReceptor().trim().length() > 20 || inConDtad
/* 121 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 122 */         error = "0767";
/*     */       }
/* 124 */       else if (ManagerUtil.validaSoloDigito(inConDtad.getCaPaciente()) != '0' || inConDtad
/* 125 */         .getCaPaciente().trim().length() != 1 || (
/* 126 */         !inConDtad.getCaPaciente().trim().equals("1") && 
/* 127 */         !inConDtad.getCaPaciente().trim().equals("2"))) {
/* 128 */         error = "0800";
/* 129 */       } else if (inConDtad.getApPaternoPaciente().trim().length() < 1 || inConDtad
/* 130 */         .getApPaternoPaciente().trim().length() > 60) {
/* 131 */         error = "0801";
/* 132 */       } else if (inConDtad.getNoPaciente().trim().length() < 1 || inConDtad
/* 133 */         .getNoPaciente().trim().length() > 35) {
/* 134 */         error = "0802";
/* 135 */       } else if (inConDtad.getCoAfPaciente().trim().length() < 2 || inConDtad
/* 136 */         .getCoAfPaciente().trim().length() > 20) {
/* 137 */         error = "0803";
/* 138 */       } else if (inConDtad.getApMaternoPaciente().trim().length() < 1 || inConDtad
/* 139 */         .getApMaternoPaciente().trim().length() > 60) {
/* 140 */         error = "0804";
/* 141 */       } else if (inConDtad.getDeDirPaciente1().length() < 1 || inConDtad
/* 142 */         .getDeDirPaciente1().trim().length() > 55) {
/* 143 */         error = "0830";
/*     */ 
/*     */       
/*     */       }
/* 147 */       else if (ManagerUtil.validaSoloDigito(inConDtad.getCoUbigeoPaciente()) != '0' || inConDtad
/* 148 */         .getCoUbigeoPaciente().trim().length() < 1 || inConDtad
/* 149 */         .getCoUbigeoPaciente().trim().length() > 30) {
/* 150 */         error = "0832";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 160 */       else if (ManagerUtil.validaSoloDigito(inConDtad.getTiCaCalificador()) != '0' || inConDtad
/* 161 */         .getTiCaCalificador().trim().length() != 1) {
/* 162 */         error = "0836";
/* 163 */       } else if (inConDtad.getApPaNoEmCalificador().trim().length() < 1 || inConDtad
/* 164 */         .getApPaNoEmCalificador().trim().length() > 60) {
/* 165 */         error = "0837";
/* 166 */       } else if (inConDtad.getNoEmCalificador().trim().length() < 1 || inConDtad
/* 167 */         .getNoEmCalificador().trim().length() > 35) {
/* 168 */         error = "0838";
/* 169 */       } else if (inConDtad.getApMaCalificador().trim().length() < 1 || inConDtad
/* 170 */         .getApMaCalificador().trim().length() > 60) {
/* 171 */         error = "0839";
/*     */       } 
/*     */     }
/* 174 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConDtadValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */