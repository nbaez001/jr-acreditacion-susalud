/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConCodValidador
/*     */ {
/*     */   public String ValidateBeanInConCod271(InConCod271 inConCod) {
/*  18 */     List<InConCod271Detalle> list = new ArrayList<InConCod271Detalle>();
/*  19 */     String buscarPorDNI = "OK";
/*  20 */     String error = "0000";
/*     */ 
/*     */     
/*  23 */     if ("".equals(inConCod.getNoTransaccion())) {
/*  24 */       error = "0100";
/*  25 */     } else if ("".equals(inConCod.getIdRemitente())) {
/*  26 */       error = "0101";
/*  27 */     } else if ("".equals(inConCod.getIdReceptor())) {
/*  28 */       error = "0102";
/*  29 */     } else if ("".equals(inConCod.getFeTransaccion())) {
/*  30 */       error = "0103";
/*  31 */     } else if ("".equals(inConCod.getHoTransaccion())) {
/*  32 */       error = "0104";
/*  33 */     } else if ("".equals(inConCod.getIdCorrelativo())) {
/*  34 */       error = "0105";
/*  35 */     } else if ("".equals(inConCod.getIdTransaccion())) {
/*  36 */       error = "0106";
/*  37 */     } else if ("".equals(inConCod.getTiFinalidad())) {
/*  38 */       error = "0107";
/*  39 */     } else if ("".equals(inConCod.getCaRemitente())) {
/*  40 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*  55 */     else if ("".equals(inConCod.getCaReceptor())) {
/*  56 */       error = "0116";
/*  57 */     } else if ("".equals(inConCod.getNuRucReceptor())) {
/*  58 */       error = "0117";
/*     */     }
/*  60 */     else if ("".equals(inConCod.getCaPaciente())) {
/*  61 */       error = "0150";
/*  62 */     } else if ("".equals(inConCod.getApPaternoPaciente())) {
/*  63 */       error = "0151";
/*  64 */     } else if ("".equals(inConCod.getNoPaciente())) {
/*  65 */       error = "0152";
/*  66 */     } else if ("".equals(inConCod.getCoAfPaciente())) {
/*  67 */       error = "0153";
/*  68 */     } else if ("".equals(inConCod.getApMaternoPaciente())) {
/*  69 */       error = "0154";
/*  70 */     } else if ("".equals(inConCod.getCoEsPaciente())) {
/*  71 */       error = "0155";
/*  72 */     } else if ("".equals(inConCod.getTiDoPaciente())) {
/*  73 */       error = "0156";
/*  74 */     } else if ("".equals(inConCod.getNuDoPaciente())) {
/*  75 */       error = "0157";
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  80 */     else if ("".equals(inConCod.getNuContratoPaciente())) {
/*  81 */       error = "0160";
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  86 */     else if ("".equals(inConCod.getCoTiPoliza())) {
/*  87 */       error = "0163";
/*  88 */     } else if ("".equals(inConCod.getCoProducto())) {
/*  89 */       error = "0164";
/*  90 */     } else if ("".equals(inConCod.getDeProducto())) {
/*  91 */       error = "0165";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  98 */     else if ("".equals(inConCod.getNuPlan())) {
/*  99 */       error = "0170";
/* 100 */     } else if ("".equals(inConCod.getTiPlanSalud())) {
/* 101 */       error = "0171";
/* 102 */     } else if ("".equals(inConCod.getCoMoneda())) {
/* 103 */       error = "0172";
/* 104 */     } else if ("".equals(inConCod.getCoParentesco())) {
/* 105 */       error = "0173";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 112 */     else if ("".equals(inConCod.getFeNacimiento())) {
/* 113 */       error = "0177";
/* 114 */     } else if ("".equals(inConCod.getGenero())) {
/* 115 */       error = "0178";
/* 116 */     } else if ("".equals(inConCod.getEsMarital())) {
/* 117 */       error = "0179";
/* 118 */     } else if ("".equals(inConCod.getFeIniVigencia())) {
/* 119 */       error = "0180";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 172 */     else if ("".equals(inConCod.getTiCaContratante())) {
/* 173 */       error = "0350";
/* 174 */     } else if ("".equals(inConCod.getNoPaContratante())) {
/* 175 */       error = "0351";
/*     */     
/*     */     }
/* 178 */     else if ("".equals(inConCod.getNoContratante())) {
/* 179 */       error = "0353";
/* 180 */     } else if ("".equals(inConCod.getNoMaContratante())) {
/* 181 */       error = "0354";
/* 182 */     } else if ("".equals(inConCod.getTiDoContratante())) {
/* 183 */       error = "0355";
/* 184 */     } else if ("".equals(inConCod.getIdReContratante())) {
/* 185 */       error = "0356";
/* 186 */     } else if ("".equals(inConCod.getCoReContratante())) {
/* 187 */       error = "0357";
/*     */     }
/* 189 */     else if ("".equals(inConCod.getCaTitular())) {
/* 190 */       error = "0400";
/* 191 */     } else if ("".equals(inConCod.getNoPaTitular())) {
/* 192 */       error = "0401";
/* 193 */     } else if ("".equals(inConCod.getNoTitular())) {
/* 194 */       error = "0402";
/* 195 */     } else if ("".equals(inConCod.getCoAfTitular())) {
/* 196 */       error = "0403";
/* 197 */     } else if ("".equals(inConCod.getNoMaTitular())) {
/* 198 */       error = "0404";
/* 199 */     } else if ("".equals(inConCod.getTiDoTitular())) {
/* 200 */       error = "0405";
/*     */     
/*     */     }
/* 203 */     else if ("".equals(inConCod.getNuDoTitular())) {
/* 204 */       error = "0407";
/* 205 */     } else if ("".equals(inConCod.getFeInsTitular())) {
/* 206 */       error = "0408";
/* 207 */     } else if (inConCod.getInConCod271Detalles().size() >= 0) {
/*     */       
/* 209 */       list = inConCod.getInConCod271Detalles();
/* 210 */       InConCod271Detalle inConCod271Detalle = new InConCod271Detalle();
/*     */       
/* 212 */       for (int i = 0; i < list.size(); i++) {
/* 213 */         inConCod271Detalle = list.get(i);
/*     */         
/* 215 */         if ("".equals(inConCod271Detalle.getInfBeneficio())) {
/* 216 */           error = "0450"; break;
/*     */         } 
/* 218 */         if ("".equals(inConCod271Detalle.getNuCobertura())) {
/* 219 */           error = "0451"; break;
/*     */         } 
/* 221 */         if ("".equals(inConCod271Detalle.getBeMaxInicial())) {
/* 222 */           error = "0452";
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 227 */         if ("".equals(inConCod271Detalle.getCoInRestriccion())) {
/* 228 */           error = "0454";
/*     */ 
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */ 
/*     */         
/* 236 */         if ("".equals(inConCod271Detalle.getCoTiCobertura())) {
/* 237 */           error = "0457"; break;
/*     */         } 
/* 239 */         if ("".equals(inConCod271Detalle.getCoSubTiCobertura())) {
/* 240 */           error = "0458";
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */ 
/*     */ 
/*     */         
/* 250 */         if ("".equals(inConCod271Detalle.getCoTiMoneda())) {
/* 251 */           error = "0462"; break;
/*     */         } 
/* 253 */         if ("".equals(inConCod271Detalle.getCoPagoFijo())) {
/* 254 */           error = "0463"; break;
/*     */         } 
/* 256 */         if ("".equals(inConCod271Detalle.getCoCalServicio())) {
/* 257 */           error = "0464";
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 262 */         if ("".equals(inConCod271Detalle.getCoPagoVariable())) {
/* 263 */           error = "0466"; break;
/*     */         } 
/* 265 */         if ("".equals(inConCod271Detalle.getFlagCaGarantia())) {
/* 266 */           error = "0467";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 282 */     if (error.equals("0000")) {
/* 283 */       if (inConCod.getNoTransaccion().trim().length() < 1 || inConCod.getNoTransaccion().trim().length() > 60) {
/* 284 */         error = "0750";
/* 285 */       } else if (ManagerUtil.validaAlfanumerico(inConCod.getIdRemitente()) != '0' || inConCod.getIdRemitente().length() != 15) {
/* 286 */         error = "0751";
/* 287 */       } else if (inConCod.getIdReceptor().length() != 15) {
/* 288 */         error = "0752";
/* 289 */       } else if (!ManagerUtil.validaFecha(inConCod.getFeTransaccion(), "YYYYmmdd") || inConCod.getFeTransaccion().trim().length() != 8) {
/* 290 */         error = "0753";
/* 291 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getHoTransaccion()) != '0' || inConCod.getHoTransaccion().trim().length() < 4 || inConCod.getHoTransaccion().trim().length() > 8) {
/* 292 */         error = "0754";
/* 293 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getIdCorrelativo()) != '0' || inConCod.getIdCorrelativo().trim().length() != 9) {
/* 294 */         error = "0755";
/* 295 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getIdTransaccion()) != '0' || inConCod.getIdTransaccion().trim().length() != 3) {
/* 296 */         error = "0756";
/* 297 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getTiFinalidad()) != '0' || inConCod.getTiFinalidad().trim().length() != 2) {
/* 298 */         error = "0757";
/* 299 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCaRemitente()) != '0' || inConCod
/* 300 */         .getCaRemitente().trim().length() != 1 || (
/* 301 */         !inConCod.getCaRemitente().trim().equals("1") && 
/* 302 */         !inConCod.getCaRemitente().trim().equals("2"))) {
/* 303 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 327 */       else if (ManagerUtil.validaSoloDigito(inConCod.getCaReceptor()) != '0' || inConCod
/* 328 */         .getCaReceptor().trim().length() != 1 || (
/* 329 */         !inConCod.getCaReceptor().trim().equals("1") && 
/* 330 */         !inConCod.getCaReceptor().trim().equals("2"))) {
/* 331 */         error = "0766";
/* 332 */       } else if (inConCod.getNuRucReceptor().trim().length() < 2 || inConCod
/* 333 */         .getNuRucReceptor().trim().length() > 20 || inConCod
/* 334 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 335 */         error = "0767";
/*     */       }
/* 337 */       else if (inConCod.getCaPaciente().trim().length() != 1 || (!inConCod.getCaPaciente().trim().equals("1") && 
/* 338 */         !inConCod.getCaPaciente().trim().equals("2"))) {
/* 339 */         error = "0800";
/* 340 */       } else if (inConCod.getApPaternoPaciente().trim().length() < 1 || inConCod
/* 341 */         .getApPaternoPaciente().trim().length() > 60) {
/* 342 */         error = "0801";
/* 343 */       } else if (inConCod.getNoPaciente().trim().length() < 1 || inConCod
/* 344 */         .getNoPaciente().trim().length() > 35) {
/* 345 */         error = "0802";
/* 346 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoAfPaciente()) != '0' || inConCod
/* 347 */         .getCoAfPaciente().trim().length() < 2 || inConCod
/* 348 */         .getCoAfPaciente().trim().length() > 20) {
/* 349 */         error = "0803";
/* 350 */       } else if (inConCod.getApMaternoPaciente().trim().length() < 1 || inConCod
/* 351 */         .getApMaternoPaciente().trim().length() > 60) {
/* 352 */         error = "0804";
/* 353 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoEsPaciente()) != '0' || inConCod
/* 354 */         .getCoEsPaciente().trim().length() < 1 || inConCod
/* 355 */         .getCoEsPaciente().trim().length() > 2) {
/* 356 */         error = "0805";
/* 357 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getTiDoPaciente()) != '0' || inConCod
/* 358 */         .getTiDoPaciente().trim().length() < 1 || inConCod
/* 359 */         .getTiDoPaciente().trim().length() > 2) {
/* 360 */         error = "0806";
/* 361 */       } else if (inConCod.getNuDoPaciente().trim().equals("00000000") || 
/* 362 */         ManagerUtil.validaSoloDigito(inConCod.getNuDoPaciente()) != '0' || inConCod
/* 363 */         .getNuDoPaciente().trim().length() != 8) {
/* 364 */         error = "0807";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 372 */       else if (ManagerUtil.validaSoloDigito(inConCod.getNuContratoPaciente()) != '0' || inConCod
/* 373 */         .getNuContratoPaciente().trim().length() < 1 || inConCod
/* 374 */         .getNuContratoPaciente().trim().length() > 20) {
/* 375 */         error = "0810";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 383 */       else if (ManagerUtil.validaSoloDigito(inConCod.getCoTiPoliza()) != '0' || inConCod
/* 384 */         .getCoTiPoliza().trim().length() < 1 || inConCod
/* 385 */         .getCoTiPoliza().trim().length() > 2) {
/* 386 */         error = "0813";
/* 387 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoProducto()) != '0' || inConCod
/* 388 */         .getCoProducto().trim().length() < 1 || inConCod
/* 389 */         .getCoProducto().trim().length() > 20) {
/* 390 */         error = "0814";
/* 391 */       } else if (inConCod.getDeProducto().trim().length() < 1 || inConCod
/* 392 */         .getDeProducto().trim().length() > 80) {
/* 393 */         error = "0815";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 400 */       else if (ManagerUtil.validaSoloDigito(inConCod.getNuPlan()) != '0' || inConCod
/* 401 */         .getNuPlan().trim().length() < 1 || inConCod
/* 402 */         .getNuPlan().trim().length() > 20) {
/* 403 */         error = "0818";
/* 404 */       } else if (inConCod.getTiPlanSalud().trim().length() < 1 || inConCod
/* 405 */         .getTiPlanSalud().trim().length() > 80) {
/* 406 */         error = "0819";
/* 407 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoMoneda()) != '0' || inConCod
/* 408 */         .getCoMoneda().trim().length() < 1 || inConCod
/* 409 */         .getCoMoneda().trim().length() > 3) {
/* 410 */         error = "0820";
/* 411 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoParentesco()) != '0' || inConCod
/* 412 */         .getCoParentesco().trim().length() < 1 || inConCod
/* 413 */         .getCoParentesco().trim().length() > 2) {
/* 414 */         error = "0821";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 424 */       else if (!ManagerUtil.validaFecha(inConCod.getFeNacimiento(), "YYYYmmdd") || inConCod.getFeNacimiento().trim().length() != 8) {
/* 425 */         error = "0825";
/* 426 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getGenero()) != '0' || inConCod
/* 427 */         .getGenero().trim().length() != 1) {
/* 428 */         error = "0826";
/* 429 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getEsMarital()) != '0' || inConCod
/* 430 */         .getEsMarital().trim().length() != 1) {
/* 431 */         error = "0827";
/* 432 */       } else if (!ManagerUtil.validaFecha(inConCod.getFeIniVigencia(), "YYYYmmdd") || inConCod.getFeIniVigencia().trim().length() != 8) {
/* 433 */         error = "0828";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 521 */       else if (inConCod.getTiCaContratante().trim().length() != 1 || (!inConCod.getTiCaContratante().trim().equals("1") && 
/* 522 */         !inConCod.getTiCaContratante().trim().equals("2"))) {
/* 523 */         error = "1050";
/* 524 */       } else if (inConCod.getNoPaContratante().trim().length() < 1 || inConCod
/* 525 */         .getNoPaContratante().trim().length() > 60) {
/* 526 */         error = "1051";
/*     */ 
/*     */       
/*     */       }
/* 530 */       else if (inConCod.getNoContratante().trim().length() < 1 || inConCod
/* 531 */         .getNoContratante().trim().length() > 35) {
/* 532 */         error = "1053";
/* 533 */       } else if (inConCod.getNoMaContratante().trim().length() < 1 || inConCod
/* 534 */         .getNoMaContratante().trim().length() > 60) {
/* 535 */         error = "1054";
/* 536 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getTiDoContratante()) != '0' || inConCod
/* 537 */         .getTiDoContratante().trim().length() < 1 || inConCod
/* 538 */         .getTiDoContratante().trim().length() > 2) {
/* 539 */         error = "1055";
/* 540 */       } else if (inConCod.getIdReContratante().trim().length() < 2 || inConCod.getIdReContratante().trim().length() > 3 || (
/* 541 */         !inConCod.getIdReContratante().trim().equals("XX5") && 
/* 542 */         !inConCod.getIdReContratante().trim().equals("4A"))) {
/* 543 */         error = "1056";
/* 544 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoReContratante()) != '0' || inConCod
/* 545 */         .getCoReContratante().trim().length() < 1 || inConCod
/* 546 */         .getCoReContratante().trim().length() > 20) {
/* 547 */         error = "1057";
/*     */ 
/*     */       
/*     */       }
/* 551 */       else if (inConCod.getCaTitular().trim().length() != 1 || (
/* 552 */         !inConCod.getCaTitular().trim().equals("1") && 
/* 553 */         !inConCod.getCaTitular().trim().equals("2"))) {
/* 554 */         error = "1100";
/* 555 */       } else if (inConCod.getNoPaTitular().trim().length() < 1 || inConCod
/* 556 */         .getNoPaTitular().trim().length() > 60) {
/* 557 */         error = "1101";
/* 558 */       } else if (inConCod.getNoTitular().trim().length() < 1 || inConCod
/* 559 */         .getNoTitular().trim().length() > 35) {
/* 560 */         error = "1102";
/* 561 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getCoAfTitular()) != '0' || inConCod
/* 562 */         .getCoAfTitular().trim().length() < 2 || inConCod
/* 563 */         .getCoAfTitular().trim().length() > 80) {
/* 564 */         error = "1103";
/* 565 */       } else if (inConCod.getNoMaTitular().trim().length() < 1 || inConCod
/* 566 */         .getNoMaTitular().trim().length() > 60) {
/* 567 */         error = "1104";
/* 568 */       } else if (ManagerUtil.validaSoloDigito(inConCod.getTiDoTitular()) != '0' || inConCod
/* 569 */         .getTiDoTitular().trim().length() < 1 || inConCod
/* 570 */         .getTiDoTitular().trim().length() > 2) {
/* 571 */         error = "1105";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 577 */       else if (ManagerUtil.validaSoloDigito(inConCod.getNuDoTitular()) != '0' || inConCod
/* 578 */         .getNuDoTitular().trim().length() < 1 || inConCod
/* 579 */         .getNuDoTitular().trim().length() > 20) {
/* 580 */         error = "1107";
/* 581 */       } else if (!ManagerUtil.validaFecha(inConCod.getFeInsTitular(), "YYYYmmdd") || inConCod.getFeInsTitular().trim().length() != 8) {
/* 582 */         error = "1108";
/* 583 */       } else if (inConCod.getInConCod271Detalles().size() >= 0) {
/*     */         
/* 585 */         list = inConCod.getInConCod271Detalles();
/* 586 */         InConCod271Detalle inConCod271Detalle = new InConCod271Detalle();
/*     */         
/* 588 */         for (int i = 0; i < list.size(); i++) {
/* 589 */           inConCod271Detalle = list.get(i);
/*     */ 
/*     */           
/* 592 */           if (ManagerUtil.validaSoloDigito(inConCod271Detalle.getInfBeneficio()) != '0' || inConCod271Detalle
/* 593 */             .getInfBeneficio().trim().length() < 1 || inConCod271Detalle
/* 594 */             .getInfBeneficio().trim().length() > 2) {
/* 595 */             error = "1150"; break;
/*     */           } 
/* 597 */           if (ManagerUtil.validaAlfanumerico(inConCod271Detalle.getNuCobertura()) != '0' || inConCod271Detalle
/* 598 */             .getNuCobertura().trim().length() < 1 || inConCod271Detalle.getNuCobertura().trim().length() > 20) {
/* 599 */             error = "1151"; break;
/*     */           } 
/* 601 */           if (ManagerUtil.validaDecimales(inConCod271Detalle.getBeMaxInicial()) != '0' || inConCod271Detalle
/* 602 */             .getBeMaxInicial().trim().length() < 1 || inConCod271Detalle.getBeMaxInicial().trim().length() > 18) {
/* 603 */             error = "1152"; break;
/*     */           } 
/* 605 */           if (ManagerUtil.validaDecimales(inConCod271Detalle.getMoCobertura()) != '0' || inConCod271Detalle
/* 606 */             .getMoCobertura().trim().length() < 1 || inConCod271Detalle.getMoCobertura().trim().length() > 10) {
/* 607 */             error = "1153"; break;
/*     */           } 
/* 609 */           if (inConCod271Detalle.getCoInRestriccion().length() != 2) {
/* 610 */             error = "1154";
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 620 */           if (ManagerUtil.validaAlfanumerico(inConCod271Detalle.getCoTiCobertura()) != '0' || inConCod271Detalle
/* 621 */             .getCoTiCobertura().trim().length() < 1 || inConCod271Detalle.getCoTiCobertura().trim().length() > 2) {
/* 622 */             error = "1157"; break;
/*     */           } 
/* 624 */           if (ManagerUtil.validaSoloDigito(inConCod271Detalle.getCoSubTiCobertura()) != '0' || inConCod271Detalle
/* 625 */             .getCoSubTiCobertura().trim().length() < 1 || inConCod271Detalle.getCoSubTiCobertura().trim().length() > 20) {
/* 626 */             error = "1158";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 639 */           if (ManagerUtil.validaSoloDigito(inConCod271Detalle.getCoTiMoneda()) != '0' || inConCod271Detalle
/* 640 */             .getCoTiMoneda().trim().length() < 1 || inConCod271Detalle.getCoTiMoneda().trim().length() > 3) {
/* 641 */             error = "1162"; break;
/*     */           } 
/* 643 */           if (ManagerUtil.validaDecimales(inConCod271Detalle.getCoPagoFijo()) != '0' || inConCod271Detalle
/* 644 */             .getCoPagoFijo().trim().length() < 1 || inConCod271Detalle
/* 645 */             .getCoPagoFijo().trim().length() > 15) {
/* 646 */             error = "1163"; break;
/*     */           } 
/* 648 */           if (inConCod271Detalle.getCoCalServicio().trim().length() != 2) {
/* 649 */             error = "1164";
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/* 655 */           if (ManagerUtil.validaDecimales(inConCod271Detalle.getCoPagoVariable()) != '0' || inConCod271Detalle
/* 656 */             .getCoPagoVariable().trim().length() < 1 || inConCod271Detalle
/* 657 */             .getCoPagoVariable().trim().length() > 15) {
/* 658 */             error = "1166"; break;
/*     */           } 
/* 660 */           if (inConCod271Detalle.getFlagCaGarantia().trim().length() < 1 || inConCod271Detalle.getFlagCaGarantia().trim().length() > 2 || (
/* 661 */             !inConCod271Detalle.getFlagCaGarantia().trim().equals("0") && 
/* 662 */             !inConCod271Detalle.getFlagCaGarantia().trim().equals("1") && 
/* 663 */             !inConCod271Detalle.getFlagCaGarantia().trim().equals("2"))) {
/* 664 */             error = "1167";
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/* 670 */           if (!ManagerUtil.validaFecha(inConCod271Detalle.getFeFinCarencia(), "YYYYmmdd") || inConCod271Detalle.getFeFinCarencia().trim().length() != 8) {
/* 671 */             error = "1169";
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 680 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConCodValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */