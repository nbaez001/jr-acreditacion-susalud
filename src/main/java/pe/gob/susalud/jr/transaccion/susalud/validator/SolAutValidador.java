/*      */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutRes271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class SolAutValidador
/*      */ {
/*      */   public String ValidateBeanInSolAut271(InSolAut271 inSolAut) {
/*   17 */     List<InSolAutRes271Detalle> list = new ArrayList<InSolAutRes271Detalle>();
/*   18 */     String buscarPorDNI = "OK";
/*   19 */     String error = "0000";
/*      */ 
/*      */     
/*   22 */     if ("".equals(inSolAut.getNoTransaccion())) {
/*   23 */       error = "0100";
/*   24 */     } else if ("".equals(inSolAut.getIdRemitente())) {
/*   25 */       error = "0101";
/*   26 */     } else if ("".equals(inSolAut.getIdReceptor())) {
/*   27 */       error = "0102";
/*   28 */     } else if ("".equals(inSolAut.getFeTransaccion())) {
/*   29 */       error = "0103";
/*   30 */     } else if ("".equals(inSolAut.getHoTransaccion())) {
/*   31 */       error = "0104";
/*   32 */     } else if ("".equals(inSolAut.getIdCorrelativo())) {
/*   33 */       error = "0105";
/*   34 */     } else if ("".equals(inSolAut.getIdTransaccion())) {
/*   35 */       error = "0106";
/*   36 */     } else if ("".equals(inSolAut.getTiFinalidad())) {
/*   37 */       error = "0107";
/*   38 */     } else if ("".equals(inSolAut.getCaRemitente())) {
/*   39 */       error = "0108";
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*   44 */     else if ("".equals(inSolAut.getNuRucRemitente())) {
/*   45 */       error = "0111";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*   54 */     else if ("".equals(inSolAut.getCaReceptor())) {
/*   55 */       error = "0116";
/*      */ 
/*      */     
/*      */     }
/*   59 */     else if ("".equals(inSolAut.getCaPaciente())) {
/*   60 */       error = "0150";
/*   61 */     } else if ("".equals(inSolAut.getApPaternoPaciente())) {
/*   62 */       error = "0151";
/*   63 */     } else if ("".equals(inSolAut.getNoPaciente())) {
/*   64 */       error = "0152";
/*   65 */     } else if ("".equals(inSolAut.getCoAfPaciente())) {
/*   66 */       error = "0153";
/*   67 */     } else if ("".equals(inSolAut.getApMaternoPaciente())) {
/*   68 */       error = "0154";
/*   69 */     } else if ("".equals(inSolAut.getCoEsPaciente())) {
/*   70 */       error = "0155";
/*   71 */     } else if ("".equals(inSolAut.getTiDoPaciente())) {
/*   72 */       error = "0156";
/*   73 */     } else if ("".equals(inSolAut.getNuDoPaciente())) {
/*   74 */       error = "0157";
/*      */     
/*      */     }
/*   77 */     else if ("".equals(inSolAut.getNuIdenEmpleador())) {
/*   78 */       error = "0159";
/*   79 */     } else if ("".equals(inSolAut.getNuContratoPaciente())) {
/*   80 */       error = "0160";
/*   81 */     } else if ("".equals(inSolAut.getNuPoliza())) {
/*   82 */       error = "0161";
/*      */     
/*      */     }
/*   85 */     else if ("".equals(inSolAut.getCoTiPolizaAfiliacion())) {
/*   86 */       error = "0163";
/*   87 */     } else if ("".equals(inSolAut.getCoProducto())) {
/*   88 */       error = "0164";
/*   89 */     } else if ("".equals(inSolAut.getDeProducto())) {
/*   90 */       error = "0165";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*   96 */     else if ("".equals(inSolAut.getNuPlan())) {
/*   97 */       error = "0168";
/*   98 */     } else if ("".equals(inSolAut.getTiPlanSalud())) {
/*   99 */       error = "0169";
/*  100 */     } else if ("".equals(inSolAut.getCoMoneda())) {
/*  101 */       error = "0170";
/*  102 */     } else if ("".equals(inSolAut.getCoParentesco())) {
/*  103 */       error = "0171";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  110 */     else if ("".equals(inSolAut.getFeNacimiento())) {
/*  111 */       error = "0175";
/*  112 */     } else if ("".equals(inSolAut.getGenero())) {
/*  113 */       error = "0176";
/*  114 */     } else if ("".equals(inSolAut.getEsMarital())) {
/*  115 */       error = "0177";
/*  116 */     } else if ("".equals(inSolAut.getFeIniVigencia())) {
/*  117 */       error = "0178";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  176 */     else if ("".equals(inSolAut.getEsCobertura())) {
/*  177 */       error = "0206";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  193 */     else if ("".equals(inSolAut.getNuAtencion())) {
/*  194 */       error = "0250";
/*  195 */     } else if ("".equals(inSolAut.getIdDerFarmacia())) {
/*  196 */       error = "0251";
/*  197 */     } else if ("".equals(inSolAut.getTiProducto())) {
/*  198 */       error = "0252";
/*  199 */     } else if ("".equals(inSolAut.getDeProductoDeFarmacia())) {
/*  200 */       error = "0253";
/*  201 */     } else if ("".equals(inSolAut.getFeAtencion())) {
/*  202 */       error = "0254";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  208 */     else if ("".equals(inSolAut.getNuCobertura())) {
/*  209 */       error = "0300";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  221 */     else if ("".equals(inSolAut.getCaContratante())) {
/*  222 */       error = "0350";
/*  223 */     } else if ("".equals(inSolAut.getNoPaContratante())) {
/*  224 */       error = "0351";
/*      */     
/*      */     }
/*  227 */     else if ("".equals(inSolAut.getNoContratante())) {
/*  228 */       error = "0353";
/*  229 */     } else if ("".equals(inSolAut.getNoMaContratante())) {
/*  230 */       error = "0354";
/*  231 */     } else if ("".equals(inSolAut.getTiDoContratante())) {
/*  232 */       error = "0355";
/*  233 */     } else if ("".equals(inSolAut.getIdReContratante())) {
/*  234 */       error = "0356";
/*  235 */     } else if ("".equals(inSolAut.getCoReContratante())) {
/*  236 */       error = "0357";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  242 */     else if ("".equals(inSolAut.getCaTitular())) {
/*  243 */       error = "0400";
/*  244 */     } else if ("".equals(inSolAut.getNoPaTitular())) {
/*  245 */       error = "0401";
/*  246 */     } else if ("".equals(inSolAut.getNoTitular())) {
/*  247 */       error = "0402";
/*  248 */     } else if ("".equals(inSolAut.getCoAfTitular())) {
/*  249 */       error = "0403";
/*  250 */     } else if ("".equals(inSolAut.getNoMaTitular())) {
/*  251 */       error = "0404";
/*  252 */     } else if ("".equals(inSolAut.getTiDoTitular())) {
/*  253 */       error = "0405";
/*  254 */     } else if ("".equals(inSolAut.getIdReTitular())) {
/*  255 */       error = "0406";
/*  256 */     } else if ("".equals(inSolAut.getNuDoTitular())) {
/*  257 */       error = "0407";
/*  258 */     } else if ("".equals(inSolAut.getFeIncTitular())) {
/*  259 */       error = "0408";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  271 */     else if ("".equals(inSolAut.getNuCobPreExistencia())) {
/*  272 */       error = "0451";
/*  273 */     } else if ("".equals(inSolAut.getBeMaxInicial())) {
/*  274 */       error = "0452";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  283 */     else if ("".equals(inSolAut.getCoTiCobertura())) {
/*  284 */       error = "0457";
/*  285 */     } else if ("".equals(inSolAut.getCoSubTiCobertura())) {
/*  286 */       error = "0458";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  293 */     else if ("".equals(inSolAut.getCoTiMoneda())) {
/*  294 */       error = "0462";
/*  295 */     } else if ("".equals(inSolAut.getCoPagoFijo())) {
/*  296 */       error = "0463";
/*  297 */     } else if ("".equals(inSolAut.getCoCalServicio())) {
/*  298 */       error = "0464";
/*      */     
/*      */     }
/*  301 */     else if ("".equals(inSolAut.getCoPagoVariable())) {
/*  302 */       error = "0466";
/*  303 */     } else if ("".equals(inSolAut.getFlagCG())) {
/*  304 */       error = "0467";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  370 */     else if (inSolAut.getInSolAut271Detalles().size() >= 0) {
/*      */       
/*  372 */       list = inSolAut.getInSolAut271Detalles();
/*  373 */       InSolAutRes271Detalle inSolAut271Detalle = new InSolAutRes271Detalle();
/*      */       
/*  375 */       for (int i = 0; i < list.size(); i++) {
/*  376 */         inSolAut271Detalle = list.get(i);
/*      */         
/*  378 */         if ("".equals(inSolAut271Detalle.getCIE10Restricciones())) {
/*  379 */           error = "0650"; break;
/*      */         } 
/*  381 */         if ("".equals(inSolAut271Detalle.getIdRestricciones())) {
/*  382 */           error = "0651"; break;
/*      */         } 
/*  384 */         if ("".equals(inSolAut271Detalle.getObsRestricciones())) {
/*  385 */           error = "0652"; break;
/*      */         } 
/*  387 */         if ("".equals(inSolAut271Detalle.getDeRestricciones())) {
/*  388 */           error = "0653"; break;
/*      */         } 
/*  390 */         if ("".equals(inSolAut271Detalle.getMsgRestricciones())) {
/*  391 */           error = "0654";
/*      */           
/*      */           break;
/*      */         } 
/*      */         
/*  396 */         if ("".equals(inSolAut271Detalle.getFeFinEsperaRestricciones())) {
/*  397 */           error = "0656";
/*      */           break;
/*      */         } 
/*      */       } 
/*  401 */     } else if ("".equals(inSolAut.getCaRegafi())) {
/*  402 */       error = "0700";
/*  403 */     } else if ("".equals(inSolAut.getNoPaRegafi())) {
/*  404 */       error = "0701";
/*  405 */     } else if ("".equals(inSolAut.getNoRegafi())) {
/*  406 */       error = "0702";
/*  407 */     } else if ("".equals(inSolAut.getCoAfRegafi())) {
/*  408 */       error = "0703";
/*  409 */     } else if ("".equals(inSolAut.getNoMaRegafi())) {
/*  410 */       error = "0704";
/*  411 */     } else if ("".equals(inSolAut.getTiDoRegafi())) {
/*  412 */       error = "0705";
/*  413 */     } else if ("".equals(inSolAut.getIdReRegafi())) {
/*  414 */       error = "0706";
/*  415 */     } else if ("".equals(inSolAut.getNuDoRegafi())) {
/*  416 */       error = "0707";
/*  417 */     } else if ("".equals(inSolAut.getFeNaRegafi())) {
/*  418 */       error = "0708";
/*  419 */     } else if ("".equals(inSolAut.getGeRegafi())) {
/*  420 */       error = "0709";
/*  421 */     } else if ("".equals(inSolAut.getCoPaisRegafi())) {
/*  422 */       error = "0710";
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  427 */     if (error.equals("0000")) {
/*  428 */       if (inSolAut.getNoTransaccion().trim().length() < 1 || inSolAut.getNoTransaccion().trim().length() > 60) {
/*  429 */         error = "0750";
/*  430 */       } else if (ManagerUtil.validaAlfanumerico(inSolAut.getIdRemitente()) != '0' || inSolAut.getIdRemitente().length() != 15) {
/*  431 */         error = "0751";
/*  432 */       } else if (inSolAut.getIdReceptor().length() != 15) {
/*  433 */         error = "0752";
/*  434 */       } else if (!ManagerUtil.validaFecha(inSolAut.getFeTransaccion(), "YYYYmmdd") || inSolAut.getFeTransaccion().trim().length() != 8) {
/*  435 */         error = "0753";
/*  436 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getHoTransaccion()) != '0' || inSolAut.getHoTransaccion().trim().length() < 4 || inSolAut.getHoTransaccion().trim().length() > 8) {
/*  437 */         error = "0754";
/*  438 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getIdCorrelativo()) != '0' || inSolAut.getIdCorrelativo().trim().length() != 9) {
/*  439 */         error = "0755";
/*  440 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getIdTransaccion()) != '0' || inSolAut.getIdTransaccion().trim().length() != 3) {
/*  441 */         error = "0756";
/*  442 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiFinalidad()) != '0' || inSolAut.getTiFinalidad().trim().length() != 2) {
/*  443 */         error = "0757";
/*  444 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCaRemitente()) != '0' || inSolAut
/*  445 */         .getCaRemitente().trim().length() != 1 || (
/*  446 */         !inSolAut.getCaRemitente().trim().equals("1") && 
/*  447 */         !inSolAut.getCaRemitente().trim().equals("2"))) {
/*  448 */         error = "0758";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  459 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuRucRemitente()) != '0' || inSolAut
/*  460 */         .getNuRucRemitente().trim().length() < 2 || inSolAut
/*  461 */         .getNuRucRemitente().trim().length() > 20 || inSolAut
/*  462 */         .getNuRucRemitente().trim().equals("00000000000")) {
/*  463 */         error = "0761";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  472 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCaReceptor()) != '0' || inSolAut
/*  473 */         .getCaReceptor().trim().length() != 1 || (
/*  474 */         !inSolAut.getCaReceptor().trim().equals("1") && 
/*  475 */         !inSolAut.getCaReceptor().trim().equals("2"))) {
/*  476 */         error = "0766";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  482 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCaPaciente()) != '0' || inSolAut
/*  483 */         .getCaPaciente().trim().length() != 1 || (
/*  484 */         !inSolAut.getCaPaciente().trim().equals("1") && 
/*  485 */         !inSolAut.getCaPaciente().trim().equals("2"))) {
/*  486 */         error = "0800";
/*  487 */       } else if (inSolAut.getApPaternoPaciente().trim().length() < 1 || inSolAut
/*  488 */         .getApPaternoPaciente().trim().length() > 60) {
/*  489 */         error = "0801";
/*  490 */       } else if (inSolAut.getNoPaciente().trim().length() < 1 || inSolAut
/*  491 */         .getNoPaciente().trim().length() > 35) {
/*  492 */         error = "0802";
/*  493 */       } else if (inSolAut.getCoAfPaciente().trim().length() < 2 || inSolAut
/*  494 */         .getCoAfPaciente().trim().length() > 20) {
/*  495 */         error = "0803";
/*  496 */       } else if (inSolAut.getApMaternoPaciente().trim().length() < 1 || inSolAut
/*  497 */         .getApMaternoPaciente().trim().length() > 60) {
/*  498 */         error = "0804";
/*  499 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoEsPaciente()) != '0' || inSolAut
/*  500 */         .getCoEsPaciente().trim().length() < 1 || inSolAut
/*  501 */         .getCoEsPaciente().trim().length() > 2) {
/*  502 */         error = "0805";
/*  503 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiDoPaciente()) != '0' || inSolAut
/*  504 */         .getTiDoPaciente().trim().length() < 1 || inSolAut
/*  505 */         .getTiDoPaciente().trim().length() > 2) {
/*  506 */         error = "0806";
/*  507 */       } else if (inSolAut.getNuDoPaciente().trim().equals("00000000") || 
/*  508 */         ManagerUtil.validaSoloDigito(inSolAut.getNuDoPaciente()) != '0' || inSolAut
/*  509 */         .getNuDoPaciente().trim().length() != 8) {
/*  510 */         error = "0807";
/*      */ 
/*      */       
/*      */       }
/*  514 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuIdenEmpleador()) != '0' || inSolAut
/*  515 */         .getNuIdenEmpleador().trim().length() < 1 || inSolAut
/*  516 */         .getNuIdenEmpleador().trim().length() > 20) {
/*  517 */         error = "0809";
/*  518 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getNuContratoPaciente()) != '0' || inSolAut
/*  519 */         .getNuContratoPaciente().trim().length() < 1 || inSolAut
/*  520 */         .getNuContratoPaciente().trim().length() > 20) {
/*  521 */         error = "0810";
/*  522 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getNuPoliza()) != '0' || inSolAut
/*  523 */         .getNuPoliza().trim().length() < 1 || inSolAut
/*  524 */         .getNuPoliza().trim().length() > 20) {
/*  525 */         error = "0811";
/*      */ 
/*      */       
/*      */       }
/*  529 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCoTiPolizaAfiliacion()) != '0' || inSolAut
/*  530 */         .getCoTiPolizaAfiliacion().trim().length() < 1 || inSolAut
/*  531 */         .getCoTiPolizaAfiliacion().trim().length() > 2) {
/*  532 */         error = "0813";
/*  533 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoProducto()) != '0' || inSolAut
/*  534 */         .getCoProducto().trim().length() < 1 || inSolAut
/*  535 */         .getCoProducto().trim().length() > 20) {
/*  536 */         error = "0814";
/*  537 */       } else if (inSolAut.getDeProducto().trim().length() < 1 || inSolAut
/*  538 */         .getDeProducto().trim().length() > 80) {
/*  539 */         error = "0815";
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  545 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuPlan()) != '0' || inSolAut
/*  546 */         .getNuPlan().trim().length() < 1 || inSolAut
/*  547 */         .getNuPlan().trim().length() > 20) {
/*  548 */         error = "0818";
/*  549 */       } else if (inSolAut.getTiPlanSalud().trim().length() < 1 || inSolAut
/*  550 */         .getTiPlanSalud().trim().length() > 80) {
/*  551 */         error = "0819";
/*  552 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoMoneda()) != '0' || inSolAut
/*  553 */         .getCoMoneda().trim().length() < 1 || inSolAut
/*  554 */         .getCoMoneda().trim().length() > 3) {
/*  555 */         error = "0820";
/*  556 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoParentesco()) != '0' || inSolAut
/*  557 */         .getCoParentesco().trim().length() < 1 || inSolAut
/*  558 */         .getCoParentesco().trim().length() > 2) {
/*  559 */         error = "0821";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  569 */       else if (!ManagerUtil.validaFecha(inSolAut.getFeNacimiento(), "YYYYmmdd") || inSolAut.getFeNacimiento().trim().length() != 8) {
/*  570 */         error = "0825";
/*  571 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getGenero()) != '0' || inSolAut
/*  572 */         .getGenero().trim().length() != 1) {
/*  573 */         error = "0826";
/*  574 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getEsMarital()) != '0' || inSolAut
/*  575 */         .getEsMarital().trim().length() != 1) {
/*  576 */         error = "0827";
/*  577 */       } else if (!ManagerUtil.validaFecha(inSolAut.getFeIniVigencia(), "YYYYmmdd") || inSolAut.getFeIniVigencia().trim().length() != 8) {
/*  578 */         error = "0828";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  644 */       else if (inSolAut.getEsCobertura().trim().length() < 1 || inSolAut.getEsCobertura().trim().length() > 2 || (
/*  645 */         !inSolAut.getEsCobertura().trim().equals("1") && 
/*  646 */         !inSolAut.getEsCobertura().trim().equals("6"))) {
/*  647 */         error = "0906";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  664 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuAtencion()) != '0' || inSolAut
/*  665 */         .getNuAtencion().trim().length() < 1 || inSolAut
/*  666 */         .getNuAtencion().trim().length() > 20) {
/*  667 */         error = "0950";
/*  668 */       } else if (ManagerUtil.validaAlfanumerico(inSolAut.getIdDerFarmacia()) != '0' || inSolAut
/*  669 */         .getIdDerFarmacia().trim().length() < 1 || inSolAut
/*  670 */         .getIdDerFarmacia().trim().length() > 3) {
/*  671 */         error = "0951";
/*  672 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiProducto()) != '0' || inSolAut
/*  673 */         .getTiProducto().trim().length() < 1 || inSolAut
/*  674 */         .getTiProducto().trim().length() > 20) {
/*  675 */         error = "0952";
/*  676 */       } else if (inSolAut.getDeProductoDeFarmacia().trim().length() < 1 || inSolAut
/*  677 */         .getDeProductoDeFarmacia().trim().length() > 60) {
/*  678 */         error = "0953";
/*  679 */       } else if (!ManagerUtil.validaFecha(inSolAut.getFeAtencion(), "YYYYmmdd") || inSolAut.getFeAtencion().trim().length() != 8) {
/*  680 */         error = "0954";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  690 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuCobertura()) != '0' || inSolAut
/*  691 */         .getNuCobertura().trim().length() < 1 || inSolAut
/*  692 */         .getNuCobertura().trim().length() > 20) {
/*  693 */         error = "1000";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  710 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCaContratante()) != '0' || inSolAut
/*  711 */         .getCaContratante().trim().length() != 1 || (
/*  712 */         !inSolAut.getCaContratante().trim().equals("1") && 
/*  713 */         !inSolAut.getCaContratante().trim().equals("2"))) {
/*  714 */         error = "1050";
/*  715 */       } else if (inSolAut.getNoPaContratante().trim().length() < 1 || inSolAut
/*  716 */         .getNoPaContratante().trim().length() > 60) {
/*  717 */         error = "1051";
/*      */ 
/*      */       
/*      */       }
/*  721 */       else if (inSolAut.getNoContratante().trim().length() < 1 || inSolAut
/*  722 */         .getNoContratante().trim().length() > 35) {
/*  723 */         error = "1053";
/*  724 */       } else if (inSolAut.getNoMaContratante().trim().length() < 1 || inSolAut
/*  725 */         .getNoMaContratante().trim().length() > 60) {
/*  726 */         error = "1054";
/*  727 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiDoContratante()) != '0' || inSolAut
/*  728 */         .getTiDoContratante().trim().length() < 1 || inSolAut
/*  729 */         .getTiDoContratante().trim().length() > 2) {
/*  730 */         error = "1055";
/*  731 */       } else if (inSolAut.getIdReContratante().trim().length() < 2 || inSolAut.getIdReContratante().trim().length() > 3 || (
/*  732 */         !inSolAut.getIdReContratante().trim().equals("XX5") && 
/*  733 */         !inSolAut.getIdReContratante().trim().equals("4A"))) {
/*  734 */         error = "1056";
/*  735 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoReContratante()) != '0' || inSolAut
/*  736 */         .getCoReContratante().trim().length() < 1 || inSolAut
/*  737 */         .getCoReContratante().trim().length() > 20) {
/*  738 */         error = "1057";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  746 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCaTitular()) != '0' || inSolAut
/*  747 */         .getCaTitular().trim().length() != 1 || (
/*  748 */         !inSolAut.getCaTitular().trim().equals("1") && 
/*  749 */         !inSolAut.getCaTitular().trim().equals("2"))) {
/*  750 */         error = "1100";
/*  751 */       } else if (inSolAut.getNoPaTitular().trim().length() < 1 || inSolAut
/*  752 */         .getNoPaTitular().trim().length() > 60) {
/*  753 */         error = "1101";
/*  754 */       } else if (inSolAut.getNoTitular().trim().length() < 1 || inSolAut
/*  755 */         .getNoTitular().trim().length() > 35) {
/*  756 */         error = "1102";
/*  757 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoAfTitular()) != '0' || inSolAut
/*  758 */         .getCoAfTitular().trim().length() < 2 || inSolAut
/*  759 */         .getCoAfTitular().trim().length() > 80) {
/*  760 */         error = "1103";
/*  761 */       } else if (inSolAut.getNoMaTitular().trim().length() < 1 || inSolAut
/*  762 */         .getNoMaTitular().trim().length() > 60) {
/*  763 */         error = "1104";
/*  764 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiDoTitular()) != '0' || inSolAut
/*  765 */         .getTiDoTitular().trim().length() < 1 || inSolAut
/*  766 */         .getTiDoTitular().trim().length() > 2) {
/*  767 */         error = "1105";
/*  768 */       } else if (inSolAut.getIdReTitular().trim().length() < 2 || inSolAut
/*  769 */         .getIdReTitular().trim().length() > 3 || (
/*  770 */         !inSolAut.getIdReTitular().trim().equals("XX5") && 
/*  771 */         !inSolAut.getIdReTitular().trim().equals("4A"))) {
/*  772 */         error = "1106";
/*  773 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getNuDoTitular()) != '0' || inSolAut
/*  774 */         .getNuDoTitular().trim().length() < 1 || inSolAut
/*  775 */         .getNuDoTitular().trim().length() > 20) {
/*  776 */         error = "1107";
/*  777 */       } else if (!ManagerUtil.validaFecha(inSolAut.getFeIncTitular(), "YYYYmmdd") || inSolAut.getFeIncTitular().trim().length() != 8) {
/*  778 */         error = "1108";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  792 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getNuCobPreExistencia()) != '0' || inSolAut
/*  793 */         .getNuCobPreExistencia().trim().length() < 1 || inSolAut
/*  794 */         .getNuCobPreExistencia().trim().length() > 20) {
/*  795 */         error = "1151";
/*  796 */       } else if (ManagerUtil.validaDecimales(inSolAut.getBeMaxInicial()) != '0' || inSolAut
/*  797 */         .getBeMaxInicial().trim().length() < 1 || inSolAut
/*  798 */         .getBeMaxInicial().trim().length() > 18) {
/*  799 */         error = "1152";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  815 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCoTiCobertura()) != '0' || inSolAut
/*  816 */         .getCoTiCobertura().trim().length() < 1 || inSolAut
/*  817 */         .getCoTiCobertura().trim().length() > 2) {
/*  818 */         error = "1157";
/*  819 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoSubTiCobertura()) != '0' || inSolAut
/*  820 */         .getCoSubTiCobertura().trim().length() < 1 || inSolAut
/*  821 */         .getCoSubTiCobertura().trim().length() > 20) {
/*  822 */         error = "1158";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  832 */       else if (ManagerUtil.validaSoloDigito(inSolAut.getCoTiMoneda()) != '0' || inSolAut
/*  833 */         .getCoTiMoneda().trim().length() < 1 || inSolAut
/*  834 */         .getCoTiMoneda().trim().length() > 3) {
/*  835 */         error = "1162";
/*  836 */       } else if (ManagerUtil.validaDecimales(inSolAut.getCoPagoFijo()) != '0' || inSolAut
/*  837 */         .getCoPagoFijo().trim().length() < 1 || inSolAut
/*  838 */         .getCoPagoFijo().trim().length() > 15) {
/*  839 */         error = "1163";
/*  840 */       } else if (inSolAut.getCoCalServicio().trim().length() != 2) {
/*  841 */         error = "1164";
/*      */ 
/*      */       
/*      */       }
/*  845 */       else if (ManagerUtil.validaDecimales(inSolAut.getCoPagoVariable()) != '0' || inSolAut
/*  846 */         .getCoPagoVariable().trim().length() < 1 || inSolAut
/*  847 */         .getCoPagoVariable().trim().length() > 15) {
/*  848 */         error = "1166";
/*  849 */       } else if (inSolAut.getFlagCG().trim().length() < 1 || inSolAut.getFlagCG().trim().length() > 2 || (
/*  850 */         !inSolAut.getFlagCG().trim().equals("0") && 
/*  851 */         !inSolAut.getFlagCG().trim().equals("1") && 
/*  852 */         !inSolAut.getFlagCG().trim().equals("2"))) {
/*  853 */         error = "1167";
/*      */ 
/*      */       
/*      */       }
/*  857 */       else if (!ManagerUtil.validaFecha(inSolAut.getFeFinCarencia(), "YYYYmmdd") || inSolAut.getFeFinCarencia().trim().length() != 8) {
/*  858 */         error = "1169";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       }
/*  950 */       else if (inSolAut.getInSolAut271Detalles().size() >= 0) {
/*  951 */         list = inSolAut.getInSolAut271Detalles();
/*  952 */         InSolAutRes271Detalle inSolAut271Detalle = new InSolAutRes271Detalle();
/*      */         
/*  954 */         for (int i = 0; i < list.size(); i++) {
/*  955 */           inSolAut271Detalle = list.get(i);
/*      */           
/*  957 */           if (inSolAut271Detalle.getCIE10Restricciones().trim().length() < 1 || inSolAut271Detalle
/*  958 */             .getCIE10Restricciones().trim().length() > 20) {
/*  959 */             error = "1350"; break;
/*      */           } 
/*  961 */           if (ManagerUtil.validaAlfanumerico(inSolAut271Detalle.getIdRestricciones()) != '0' || inSolAut271Detalle
/*  962 */             .getIdRestricciones().trim().length() < 1 || inSolAut271Detalle.getIdRestricciones().trim().length() > 3) {
/*  963 */             error = "1351"; break;
/*      */           } 
/*  965 */           if (inSolAut271Detalle.getObsRestricciones().trim().length() < 1 || inSolAut271Detalle
/*  966 */             .getObsRestricciones().trim().length() > 80) {
/*  967 */             error = "1352"; break;
/*      */           } 
/*  969 */           if (inSolAut271Detalle.getDeRestricciones().trim().length() < 1 || inSolAut271Detalle
/*  970 */             .getDeRestricciones().trim().length() > 80) {
/*  971 */             error = "1353"; break;
/*      */           } 
/*  973 */           if (inSolAut271Detalle.getMsgRestricciones().trim().length() < 1 || inSolAut271Detalle
/*  974 */             .getMsgRestricciones().trim().length() > 264) {
/*  975 */             error = "1354";
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */           
/*  981 */           if (!ManagerUtil.validaFecha(inSolAut271Detalle.getFeFinEsperaRestricciones(), "YYYYmmdd") || inSolAut271Detalle.getFeFinEsperaRestricciones().trim().length() != 8) {
/*  982 */             error = "1356";
/*      */             break;
/*      */           } 
/*      */         } 
/*  986 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCaRegafi()) != '0' || inSolAut
/*  987 */         .getCaRegafi().trim().length() != 1 || (
/*  988 */         !inSolAut.getCaRegafi().trim().equals("1") && 
/*  989 */         !inSolAut.getCaRegafi().trim().equals("2"))) {
/*  990 */         error = "1400";
/*  991 */       } else if (inSolAut.getNoPaRegafi().trim().length() < 1 || inSolAut
/*  992 */         .getNoPaRegafi().trim().length() > 60) {
/*  993 */         error = "1401";
/*  994 */       } else if (inSolAut.getNoRegafi().trim().length() < 1 || inSolAut
/*  995 */         .getNoRegafi().trim().length() > 35) {
/*  996 */         error = "1402";
/*  997 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoAfRegafi()) != '0' || inSolAut
/*  998 */         .getCoAfRegafi().trim().length() < 2 || inSolAut
/*  999 */         .getCoAfRegafi().trim().length() > 80) {
/* 1000 */         error = "1403";
/* 1001 */       } else if (inSolAut.getNoMaRegafi().trim().length() < 1 || inSolAut
/* 1002 */         .getNoMaRegafi().trim().length() > 60) {
/* 1003 */         error = "1404";
/* 1004 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getTiDoRegafi()) != '0' || inSolAut
/* 1005 */         .getTiDoRegafi().trim().length() != 1) {
/* 1006 */         error = "1405";
/* 1007 */       } else if (inSolAut.getIdReRegafi().trim().length() < 2 || inSolAut
/* 1008 */         .getIdReRegafi().trim().length() > 3) {
/* 1009 */         error = "1406";
/* 1010 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getNuDoRegafi()) != '0' || inSolAut
/* 1011 */         .getNuDoRegafi().trim().length() < 1 || inSolAut
/* 1012 */         .getNuDoRegafi().trim().length() > 20) {
/* 1013 */         error = "1407";
/* 1014 */       } else if (!ManagerUtil.validaFecha(inSolAut.getFeNaRegafi(), "YYYYmmdd") || inSolAut.getFeNaRegafi().trim().length() != 8) {
/* 1015 */         error = "1408";
/* 1016 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getGeRegafi()) != '0' || inSolAut
/* 1017 */         .getGeRegafi().trim().length() != 1) {
/* 1018 */         error = "1409";
/* 1019 */       } else if (ManagerUtil.validaSoloDigito(inSolAut.getCoPaisRegafi()) != '0' || inSolAut
/* 1020 */         .getCoPaisRegafi().trim().length() < 2 || inSolAut
/* 1021 */         .getCoPaisRegafi().trim().length() > 3) {
/* 1022 */         error = "1410";
/*      */       } 
/*      */     }
/* 1025 */     return error;
/*      */   }
/*      */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\SolAutValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */