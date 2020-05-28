/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InLogAcreInsert271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LogAcreInsertValidador
/*     */ {
/*     */   public String ValidateBeanInConCod271(InLogAcreInsert271 inLogAcreInsert) {
/*  15 */     String error = "0000";
/*     */ 
/*     */     
/*  18 */     if ("".equals(inLogAcreInsert.getNoTransaccion())) {
/*  19 */       error = "0100";
/*  20 */     } else if ("".equals(inLogAcreInsert.getIdRemitente())) {
/*  21 */       error = "0101";
/*  22 */     } else if ("".equals(inLogAcreInsert.getIdReceptor())) {
/*  23 */       error = "0102";
/*  24 */     } else if ("".equals(inLogAcreInsert.getFeTransaccion())) {
/*  25 */       error = "0103";
/*  26 */     } else if ("".equals(inLogAcreInsert.getHoTransaccion())) {
/*  27 */       error = "0104";
/*  28 */     } else if ("".equals(inLogAcreInsert.getIdCorrelativo())) {
/*  29 */       error = "0105";
/*  30 */     } else if ("".equals(inLogAcreInsert.getIdTransaccion())) {
/*  31 */       error = "0106";
/*  32 */     } else if ("".equals(inLogAcreInsert.getTiFinalidad())) {
/*  33 */       error = "0107";
/*  34 */     } else if ("".equals(inLogAcreInsert.getCaRemitente())) {
/*  35 */       error = "0108";
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  40 */     else if ("".equals(inLogAcreInsert.getNuRucRemitente())) {
/*  41 */       error = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  50 */     else if ("".equals(inLogAcreInsert.getCaReceptor())) {
/*  51 */       error = "0116";
/*     */ 
/*     */     
/*     */     }
/*  55 */     else if ("".equals(inLogAcreInsert.getCaResponsableAut())) {
/*  56 */       error = "0118";
/*  57 */     } else if ("".equals(inLogAcreInsert.getNoPaResponsableAut())) {
/*  58 */       error = "0119";
/*  59 */     } else if ("".equals(inLogAcreInsert.getNoResponsableAut())) {
/*  60 */       error = "0120";
/*  61 */     } else if ("".equals(inLogAcreInsert.getNoMaResponsableAut())) {
/*  62 */       error = "0121";
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  67 */     else if ("".equals(inLogAcreInsert.getNuAutorizacion())) {
/*  68 */       error = "0124";
/*  69 */     } else if ("".equals(inLogAcreInsert.getFeHoAutorizacion())) {
/*  70 */       error = "0125";
/*     */     }
/*  72 */     else if ("".equals(inLogAcreInsert.getCaPaciente())) {
/*  73 */       error = "0150";
/*  74 */     } else if ("".equals(inLogAcreInsert.getApPaternoPaciente())) {
/*  75 */       error = "0151";
/*  76 */     } else if ("".equals(inLogAcreInsert.getNoPaciente())) {
/*  77 */       error = "0152";
/*  78 */     } else if ("".equals(inLogAcreInsert.getCoAfPaciente())) {
/*  79 */       error = "0153";
/*  80 */     } else if ("".equals(inLogAcreInsert.getApMaternoPaciente())) {
/*  81 */       error = "0154";
/*  82 */     } else if ("".equals(inLogAcreInsert.getCoEsPaciente())) {
/*  83 */       error = "0155";
/*  84 */     } else if ("".equals(inLogAcreInsert.getTiDoPaciente())) {
/*  85 */       error = "0156";
/*  86 */     } else if ("".equals(inLogAcreInsert.getNuDoPaciente())) {
/*  87 */       error = "0157";
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
/* 102 */     else if ("".equals(inLogAcreInsert.getCoProducto())) {
/* 103 */       error = "0164";
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
/* 115 */     else if ("".equals(inLogAcreInsert.getNuPlan())) {
/* 116 */       error = "0170";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 122 */     else if ("".equals(inLogAcreInsert.getCoParentesco())) {
/* 123 */       error = "0173";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 131 */     else if ("".equals(inLogAcreInsert.getFeNacimiento())) {
/* 132 */       error = "0177";
/* 133 */     } else if ("".equals(inLogAcreInsert.getGenero())) {
/* 134 */       error = "0178";
/*     */     
/*     */     }
/* 137 */     else if ("".equals(inLogAcreInsert.getFeIniVigencia())) {
/* 138 */       error = "0180";
/*     */ 
/*     */     
/*     */     }
/* 142 */     else if ("".equals(inLogAcreInsert.getNuCobertura())) {
/* 143 */       error = "0300";
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
/* 155 */     else if ("".equals(inLogAcreInsert.getCaContratante())) {
/* 156 */       error = "0350";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 165 */     else if ("".equals(inLogAcreInsert.getTiDoContratante())) {
/* 166 */       error = "0355";
/* 167 */     } else if ("".equals(inLogAcreInsert.getIdReContratante())) {
/* 168 */       error = "0356";
/* 169 */     } else if ("".equals(inLogAcreInsert.getRucContratante())) {
/* 170 */       error = "0357";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 180 */     else if ("".equals(inLogAcreInsert.getCoAfiliadoTitular())) {
/* 181 */       error = "0403";
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
/* 197 */     else if ("".equals(inLogAcreInsert.getBeMaxInicial())) {
/* 198 */       error = "0452";
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
/* 220 */     else if ("".equals(inLogAcreInsert.getCoPagoFijo())) {
/* 221 */       error = "0463";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 227 */     else if ("".equals(inLogAcreInsert.getCoPagoVariable())) {
/* 228 */       error = "0466";
/* 229 */     } else if ("".equals(inLogAcreInsert.getFlagCartaGarantia())) {
/* 230 */       error = "0467";
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
/* 241 */     if (error.equals("0000")) {
/* 242 */       if (inLogAcreInsert.getNoTransaccion().trim().length() < 1 || inLogAcreInsert.getNoTransaccion().trim().length() > 60) {
/* 243 */         error = "0750";
/* 244 */       } else if (ManagerUtil.validaAlfanumerico(inLogAcreInsert.getIdRemitente()) != '0' || inLogAcreInsert.getIdRemitente().length() != 15) {
/* 245 */         error = "0751";
/* 246 */       } else if (inLogAcreInsert.getIdReceptor().length() != 15) {
/* 247 */         error = "0752";
/* 248 */       } else if (!ManagerUtil.validaFecha(inLogAcreInsert.getFeTransaccion(), "YYYYmmdd") || inLogAcreInsert.getFeTransaccion().trim().length() != 8) {
/* 249 */         error = "0753";
/* 250 */       } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getHoTransaccion()) != '0' || inLogAcreInsert.getHoTransaccion().trim().length() < 4 || inLogAcreInsert.getHoTransaccion().trim().length() > 8) {
/* 251 */         error = "0754";
/* 252 */       } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getIdCorrelativo()) != '0' || inLogAcreInsert.getIdCorrelativo().trim().length() != 9) {
/* 253 */         error = "0755";
/* 254 */       } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getIdTransaccion()) != '0' || inLogAcreInsert.getIdTransaccion().trim().length() != 3) {
/* 255 */         error = "0756";
/* 256 */       } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getTiFinalidad()) != '0' || inLogAcreInsert.getTiFinalidad().trim().length() != 2) {
/* 257 */         error = "0757";
/* 258 */       } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCaRemitente()) != '0' || inLogAcreInsert
/* 259 */         .getCaRemitente().trim().length() != 1 || (
/* 260 */         !inLogAcreInsert.getCaRemitente().trim().equals("1") && 
/* 261 */         !inLogAcreInsert.getCaRemitente().trim().equals("2"))) {
/* 262 */         error = "0758";
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
/* 273 */       else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getNuRucRemitente()) != '0' || inLogAcreInsert
/* 274 */         .getNuRucRemitente().trim().length() < 2 || inLogAcreInsert
/* 275 */         .getNuRucRemitente().trim().length() > 20 || inLogAcreInsert
/* 276 */         .getNuRucRemitente().trim().equals("00000000000")) {
/* 277 */         error = "0761";
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 287 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCaReceptor()) != '0' || inLogAcreInsert
/* 288 */       .getCaReceptor().trim().length() != 1 || (
/* 289 */       !inLogAcreInsert.getCaReceptor().trim().equals("1") && 
/* 290 */       !inLogAcreInsert.getCaReceptor().trim().equals("2"))) {
/* 291 */       error = "0766";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 297 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCaResponsableAut()) != '0' || inLogAcreInsert
/* 298 */       .getCaResponsableAut().trim().length() != 1) {
/* 299 */       error = "0768";
/* 300 */     } else if (inLogAcreInsert.getNoPaResponsableAut().trim().length() < 1 || inLogAcreInsert.getNoPaResponsableAut().trim().length() > 60) {
/* 301 */       error = "0769";
/* 302 */     } else if (inLogAcreInsert.getNoResponsableAut().trim().length() < 1 || inLogAcreInsert.getNoResponsableAut().trim().length() > 35) {
/* 303 */       error = "0770";
/* 304 */     } else if (inLogAcreInsert.getNoMaResponsableAut().trim().length() < 1 || inLogAcreInsert.getNoMaResponsableAut().trim().length() > 60) {
/* 305 */       error = "0771";
/* 306 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getTiDoResponsableAut()) != '0' || inLogAcreInsert
/* 307 */       .getTiDoResponsableAut().trim().length() < 1 || inLogAcreInsert.getTiDoResponsableAut().trim().length() > 2 || (
/* 308 */       !inLogAcreInsert.getTiDoResponsableAut().trim().equals("1") && 
/* 309 */       !inLogAcreInsert.getTiDoResponsableAut().trim().equals("2"))) {
/* 310 */       error = "0772";
/* 311 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getNuDoResponsableAut()) != '0' || inLogAcreInsert
/* 312 */       .getNuDoResponsableAut().trim().length() < 1 || inLogAcreInsert
/* 313 */       .getNuDoResponsableAut().trim().length() > 20) {
/* 314 */       error = "0773";
/* 315 */     } else if (inLogAcreInsert.getNuAutorizacion().trim().length() < 1 || inLogAcreInsert.getNuAutorizacion().trim().length() > 20) {
/* 316 */       error = "0774";
/* 317 */     } else if (inLogAcreInsert.getFeTransaccion().trim().length() != 12) {
/* 318 */       error = "0775";
/*     */     }
/* 320 */     else if (inLogAcreInsert.getCaPaciente().trim().length() != 1 || (!inLogAcreInsert.getCaPaciente().trim().equals("1") && 
/* 321 */       !inLogAcreInsert.getCaPaciente().trim().equals("2"))) {
/* 322 */       error = "0800";
/* 323 */     } else if (inLogAcreInsert.getApPaternoPaciente().trim().length() < 1 || inLogAcreInsert
/* 324 */       .getApPaternoPaciente().trim().length() > 60) {
/* 325 */       error = "0801";
/* 326 */     } else if (inLogAcreInsert.getNoPaciente().trim().length() < 1 || inLogAcreInsert
/* 327 */       .getNoPaciente().trim().length() > 35) {
/* 328 */       error = "0802";
/* 329 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCoAfPaciente()) != '0' || inLogAcreInsert
/* 330 */       .getCoAfPaciente().trim().length() < 2 || inLogAcreInsert
/* 331 */       .getCoAfPaciente().trim().length() > 20) {
/* 332 */       error = "0803";
/* 333 */     } else if (inLogAcreInsert.getApMaternoPaciente().trim().length() < 1 || inLogAcreInsert
/* 334 */       .getApMaternoPaciente().trim().length() > 60) {
/* 335 */       error = "0804";
/* 336 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCoEsPaciente()) != '0' || inLogAcreInsert
/* 337 */       .getCoEsPaciente().trim().length() < 1 || inLogAcreInsert
/* 338 */       .getCoEsPaciente().trim().length() > 2) {
/* 339 */       error = "0805";
/* 340 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getTiDoPaciente()) != '0' || inLogAcreInsert
/* 341 */       .getTiDoPaciente().trim().length() < 1 || inLogAcreInsert
/* 342 */       .getTiDoPaciente().trim().length() > 2) {
/* 343 */       error = "0806";
/* 344 */     } else if (inLogAcreInsert.getNuDoPaciente().trim().equals("00000000") || 
/* 345 */       ManagerUtil.validaSoloDigito(inLogAcreInsert.getNuDoPaciente()) != '0' || inLogAcreInsert
/* 346 */       .getNuDoPaciente().trim().length() != 8) {
/* 347 */       error = "0807";
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
/* 370 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCoProducto()) != '0' || inLogAcreInsert
/* 371 */       .getCoProducto().trim().length() < 1 || inLogAcreInsert
/* 372 */       .getCoProducto().trim().length() > 20) {
/* 373 */       error = "0814";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 383 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getNuPlan()) != '0' || inLogAcreInsert
/* 384 */       .getNuPlan().trim().length() < 1 || inLogAcreInsert
/* 385 */       .getNuPlan().trim().length() > 20) {
/* 386 */       error = "0818";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 394 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCoParentesco()) != '0' || inLogAcreInsert
/* 395 */       .getCoParentesco().trim().length() < 1 || inLogAcreInsert
/* 396 */       .getCoParentesco().trim().length() > 20) {
/* 397 */       error = "0821";
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
/* 408 */     else if (!ManagerUtil.validaFecha(inLogAcreInsert.getFeNacimiento(), "YYYYmmdd") || inLogAcreInsert.getFeNacimiento().trim().length() != 8) {
/* 409 */       error = "0825";
/* 410 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getGenero()) != '0' || inLogAcreInsert
/* 411 */       .getGenero().trim().length() != 1) {
/* 412 */       error = "0826";
/*     */ 
/*     */     
/*     */     }
/* 416 */     else if (!ManagerUtil.validaFecha(inLogAcreInsert.getFeIniVigencia(), "YYYYmmdd") || inLogAcreInsert.getFeIniVigencia().trim().length() != 8) {
/* 417 */       error = "0828";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 424 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getNuCobertura()) != '0' || inLogAcreInsert
/* 425 */       .getNuCobertura().trim().length() < 1 || inLogAcreInsert
/* 426 */       .getNuCobertura().trim().length() > 20) {
/* 427 */       error = "1000";
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
/* 444 */     else if (inLogAcreInsert.getCaContratante().trim().length() != 1 || (!inLogAcreInsert.getCaContratante().trim().equals("1") && 
/* 445 */       !inLogAcreInsert.getCaContratante().trim().equals("2"))) {
/* 446 */       error = "1050";
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
/* 459 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getTiDoContratante()) != '0' || inLogAcreInsert
/* 460 */       .getTiDoContratante().trim().length() < 1 || inLogAcreInsert
/* 461 */       .getTiDoContratante().trim().length() > 2) {
/* 462 */       error = "1055";
/* 463 */     } else if (inLogAcreInsert.getIdReContratante().trim().length() < 2 || inLogAcreInsert.getIdReContratante().trim().length() > 3 || (
/* 464 */       !inLogAcreInsert.getIdReContratante().trim().equals("XX5") && 
/* 465 */       !inLogAcreInsert.getIdReContratante().trim().equals("4A"))) {
/* 466 */       error = "1056";
/* 467 */     } else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getRucContratante()) != '0' || inLogAcreInsert
/* 468 */       .getRucContratante().trim().length() < 1 || inLogAcreInsert
/* 469 */       .getRucContratante().trim().length() > 20) {
/* 470 */       error = "1057";
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
/* 485 */     else if (ManagerUtil.validaSoloDigito(inLogAcreInsert.getCoAfiliadoTitular()) != '0' || inLogAcreInsert
/* 486 */       .getCoAfiliadoTitular().trim().length() < 2 || inLogAcreInsert
/* 487 */       .getCoAfiliadoTitular().trim().length() > 80) {
/* 488 */       error = "1103";
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
/* 514 */     else if (ManagerUtil.validaDecimales(inLogAcreInsert.getBeMaxInicial()) != '0' || inLogAcreInsert
/* 515 */       .getBeMaxInicial().trim().length() < 1 || inLogAcreInsert.getBeMaxInicial().trim().length() > 18) {
/* 516 */       error = "1152";
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
/*     */     }
/* 547 */     else if (ManagerUtil.validaDecimales(inLogAcreInsert.getCoPagoFijo()) != '0' || inLogAcreInsert
/* 548 */       .getCoPagoFijo().trim().length() < 1 || inLogAcreInsert
/* 549 */       .getCoPagoFijo().trim().length() > 15) {
/* 550 */       error = "1163";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 556 */     else if (ManagerUtil.validaDecimales(inLogAcreInsert.getCoPagoVariable()) != '0' || inLogAcreInsert
/* 557 */       .getCoPagoVariable().trim().length() < 1 || inLogAcreInsert
/* 558 */       .getCoPagoVariable().trim().length() > 15) {
/* 559 */       error = "1166";
/* 560 */     } else if (inLogAcreInsert.getFlagCartaGarantia().trim().length() < 1 || inLogAcreInsert.getFlagCartaGarantia().trim().length() > 2 || (
/* 561 */       !inLogAcreInsert.getFlagCartaGarantia().trim().equals("0") && 
/* 562 */       !inLogAcreInsert.getFlagCartaGarantia().trim().equals("1") && 
/* 563 */       !inLogAcreInsert.getFlagCartaGarantia().trim().equals("2"))) {
/* 564 */       error = "1167";
/*     */     } 
/*     */     
/* 567 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\LogAcreInsertValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */