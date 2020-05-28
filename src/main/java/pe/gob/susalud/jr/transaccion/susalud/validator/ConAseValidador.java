/*      */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*      */ 
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ConAseValidador
/*      */ {
/*      */   public String ValidateBeanInConAse270(InConAse270 inConAse) {
/*   13 */     String buscarPorDNI = "OK";
/*   14 */     Boolean flagApPaciente = Boolean.valueOf(false);
/*   15 */     String error = "0000";
/*      */     
/*   17 */     String nombreTx = inConAse.getTxRequest();
/*      */     
/*   19 */     if (nombreTx.trim().equalsIgnoreCase("CN")) {
/*      */       
/*   21 */       if ("".equals(inConAse.getNoTransaccion())) {
/*   22 */         error = "0100";
/*   23 */       } else if ("".equals(inConAse.getIdRemitente())) {
/*   24 */         error = "0101";
/*   25 */       } else if ("".equals(inConAse.getIdReceptor())) {
/*   26 */         error = "0102";
/*   27 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/*   28 */         error = "0103";
/*   29 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/*   30 */         error = "0104";
/*   31 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/*   32 */         error = "0105";
/*   33 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/*   34 */         error = "0106";
/*   35 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/*   36 */         error = "0107";
/*   37 */       } else if ("".equals(inConAse.getCaRemitente())) {
/*   38 */         error = "0108";
/*   39 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/*   40 */         error = "0111";
/*   41 */       } else if ("".equals(inConAse.getTxRequest())) {
/*   42 */         error = "0115";
/*   43 */       } else if ("".equals(inConAse.getCaReceptor())) {
/*   44 */         error = "0116";
/*      */       }
/*   46 */       else if ("".equals(inConAse.getCaPaciente())) {
/*   47 */         error = "0150";
/*   48 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/*   49 */         flagApPaciente = Boolean.valueOf(true);
/*   50 */         if ("".equals(inConAse.getTiDocumento()) && "".equals(inConAse.getNuDocumento())) {
/*   51 */           error = "0151";
/*   52 */           buscarPorDNI = "NO-OK";
/*      */         }
/*   54 */         else if ("".equals(inConAse.getTiDocumento())) {
/*   55 */           error = "0156";
/*   56 */         } else if ("".equals(inConAse.getNuDocumento())) {
/*   57 */           error = "0157";
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*   62 */       if (error.equals("0000")) {
/*   63 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/*   64 */           error = "0750";
/*   65 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/*   66 */           error = "0751";
/*   67 */         } else if (inConAse.getIdReceptor().length() != 15) {
/*   68 */           error = "0752";
/*   69 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/*   70 */           error = "0753";
/*   71 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/*   72 */           error = "0754";
/*   73 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/*   74 */           error = "0755";
/*   75 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/*   76 */           error = "0756";
/*   77 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/*   78 */           error = "0757";
/*   79 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/*   80 */           .getCaRemitente().trim().length() != 1 || (
/*   81 */           !inConAse.getCaRemitente().trim().equals("1") && 
/*   82 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/*   83 */           error = "0758";
/*   84 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/*   85 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/*   86 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/*   87 */           .getNuRucRemitente().trim().equals("00000000000")) {
/*   88 */           error = "0761";
/*   89 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/*   90 */           .getTxRequest().trim().length() < 1 || inConAse
/*   91 */           .getTxRequest().trim().length() > 3) {
/*   92 */           error = "0765";
/*   93 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/*   94 */           .getCaReceptor().trim().length() != 1 || (
/*   95 */           !inConAse.getCaReceptor().trim().equals("1") && 
/*   96 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/*   97 */           error = "0766";
/*      */         }
/*   99 */         else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/*  100 */           .getCaPaciente().trim().length() != 1 || (
/*  101 */           !inConAse.getCaPaciente().trim().equals("1") && 
/*  102 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/*  103 */           error = "0800";
/*  104 */         } else if (buscarPorDNI.equals("NO-OK")) {
/*  105 */           if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/*  106 */             .getApPaternoPaciente().trim().length() > 60) {
/*  107 */             error = "0801";
/*      */           }
/*  109 */           else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  110 */             .getTiDocumento().trim().length() > 2) {
/*  111 */             error = "0806";
/*  112 */           } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/*  113 */             error = "0807";
/*      */           }
/*      */         
/*  116 */         } else if (flagApPaciente.booleanValue()) {
/*  117 */           if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  118 */             .getTiDocumento().trim().length() > 2) {
/*  119 */             error = "0806";
/*  120 */           } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse
/*  121 */             .getNuDocumento().trim().length() != 8) {
/*  122 */             error = "0807";
/*      */           } 
/*      */         } 
/*      */       }
/*  126 */     } else if (nombreTx.trim().equalsIgnoreCase("CC")) {
/*      */       
/*  128 */       if ("".equals(inConAse.getNoTransaccion())) {
/*  129 */         error = "0100";
/*  130 */       } else if ("".equals(inConAse.getIdRemitente())) {
/*  131 */         error = "0101";
/*  132 */       } else if ("".equals(inConAse.getIdReceptor())) {
/*  133 */         error = "0102";
/*  134 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/*  135 */         error = "0103";
/*  136 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/*  137 */         error = "0104";
/*  138 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/*  139 */         error = "0105";
/*  140 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/*  141 */         error = "0106";
/*  142 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/*  143 */         error = "0107";
/*  144 */       } else if ("".equals(inConAse.getCaRemitente())) {
/*  145 */         error = "0108";
/*  146 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/*  147 */         error = "0111";
/*  148 */       } else if ("".equals(inConAse.getTxRequest())) {
/*  149 */         error = "0115";
/*  150 */       } else if ("".equals(inConAse.getCaReceptor())) {
/*  151 */         error = "0116";
/*      */       }
/*  153 */       else if ("".equals(inConAse.getCaPaciente())) {
/*  154 */         error = "0150";
/*  155 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/*  156 */         error = "0151";
/*  157 */       } else if ("".equals(inConAse.getNoPaciente())) {
/*  158 */         error = "0152";
/*  159 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/*  160 */         error = "0153";
/*  161 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/*  162 */         error = "0154";
/*  163 */       } else if ("".equals(inConAse.getTiDocumento())) {
/*  164 */         error = "0156";
/*  165 */       } else if ("".equals(inConAse.getNuDocumento())) {
/*  166 */         error = "0157";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  189 */       else if ("".equals(inConAse.getCoEspecialidad())) {
/*  190 */         error = "0176";
/*  191 */       } else if ("".equals(inConAse.getCoParentesco())) {
/*  192 */         error = "0173";
/*  193 */       } else if ("".equals(inConAse.getNuPlan())) {
/*  194 */         error = "0170";
/*      */       }
/*  196 */       else if ("".equals(inConAse.getTiCaContratante())) {
/*  197 */         error = "0350";
/*  198 */       } else if ("".equals(inConAse.getNoPaContratante())) {
/*  199 */         error = "0351";
/*      */       
/*      */       }
/*  202 */       else if ("".equals(inConAse.getNoContratante())) {
/*  203 */         error = "0353";
/*  204 */       } else if ("".equals(inConAse.getNoMaContratante())) {
/*  205 */         error = "0354";
/*  206 */       } else if ("".equals(inConAse.getTiDoContratante())) {
/*  207 */         error = "0355";
/*  208 */       } else if ("".equals(inConAse.getIdReContratante())) {
/*  209 */         error = "0356";
/*  210 */       } else if ("".equals(inConAse.getCoReContratante())) {
/*  211 */         error = "0357";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  216 */       if (error.equals("0000")) {
/*  217 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/*  218 */           error = "0750";
/*  219 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/*  220 */           error = "0751";
/*  221 */         } else if (inConAse.getIdReceptor().length() != 15) {
/*  222 */           error = "0752";
/*  223 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/*  224 */           error = "0753";
/*  225 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/*  226 */           error = "0754";
/*  227 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/*  228 */           error = "0755";
/*  229 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/*  230 */           error = "0756";
/*  231 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/*  232 */           error = "0757";
/*  233 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/*  234 */           .getCaRemitente().trim().length() != 1 || (
/*  235 */           !inConAse.getCaRemitente().trim().equals("1") && 
/*  236 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/*  237 */           error = "0758";
/*  238 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/*  239 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/*  240 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/*  241 */           .getNuRucRemitente().trim().equals("00000000000")) {
/*  242 */           error = "0761";
/*  243 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/*  244 */           .getTxRequest().trim().length() < 1 || inConAse
/*  245 */           .getTxRequest().trim().length() > 3) {
/*  246 */           error = "0765";
/*  247 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/*  248 */           .getCaReceptor().trim().length() != 1 || (
/*  249 */           !inConAse.getCaReceptor().trim().equals("1") && 
/*  250 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/*  251 */           error = "0766";
/*  252 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/*  253 */           .getCaPaciente().trim().length() != 1 || (
/*  254 */           !inConAse.getCaPaciente().trim().equals("1") && 
/*  255 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/*  256 */           error = "0800";
/*  257 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/*  258 */           .getApPaternoPaciente().trim().length() > 60) {
/*  259 */           error = "0801";
/*  260 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/*  261 */           .getNoPaciente().trim().length() > 35) {
/*  262 */           error = "0802";
/*  263 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/*  264 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/*  265 */           .getCoAfPaciente().trim().length() > 20) {
/*  266 */           error = "0803";
/*  267 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/*  268 */           .getApMaternoPaciente().trim().length() > 60) {
/*  269 */           error = "0804";
/*  270 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  271 */           .getTiDocumento().trim().length() > 2) {
/*  272 */           error = "0806";
/*  273 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/*  274 */           error = "0807";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*  312 */         else if (inConAse.getCoEspecialidad().trim().length() < 1 || inConAse
/*  313 */           .getCoEspecialidad().trim().length() > 20) {
/*  314 */           error = "0825";
/*  315 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoParentesco()) != '0' || inConAse
/*  316 */           .getCoParentesco().trim().length() < 1 || inConAse
/*  317 */           .getCoParentesco().trim().length() > 2) {
/*  318 */           error = "0821";
/*  319 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/*  320 */           .getNuPlan().trim().length() < 1 || inConAse
/*  321 */           .getNuPlan().trim().length() > 20) {
/*  322 */           error = "0818";
/*      */         
/*      */         }
/*  325 */         else if (inConAse.getTiCaContratante().trim().length() != 1 || (!inConAse.getTiCaContratante().trim().equals("1") && 
/*  326 */           !inConAse.getTiCaContratante().trim().equals("2"))) {
/*  327 */           error = "1050";
/*  328 */         } else if (inConAse.getNoPaContratante().trim().length() < 1 || inConAse
/*  329 */           .getNoPaContratante().trim().length() > 60) {
/*  330 */           error = "1051";
/*      */ 
/*      */         
/*      */         }
/*  334 */         else if (inConAse.getNoContratante().trim().length() < 1 || inConAse
/*  335 */           .getNoContratante().trim().length() > 35) {
/*  336 */           error = "1053";
/*  337 */         } else if (inConAse.getNoMaContratante().trim().length() < 1 || inConAse
/*  338 */           .getNoMaContratante().trim().length() > 60) {
/*  339 */           error = "1054";
/*  340 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiDoContratante()) != '0' || inConAse
/*  341 */           .getTiDoContratante().trim().length() < 1 || inConAse
/*  342 */           .getTiDoContratante().trim().length() > 2) {
/*  343 */           error = "1055";
/*  344 */         } else if (inConAse.getIdReContratante().trim().length() < 2 || inConAse.getIdReContratante().trim().length() > 3 || (
/*  345 */           !inConAse.getIdReContratante().trim().equals("XX5") && 
/*  346 */           !inConAse.getIdReContratante().trim().equals("4A"))) {
/*  347 */           error = "1056";
/*  348 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoReContratante()) != '0' || inConAse
/*  349 */           .getCoReContratante().trim().length() < 1 || inConAse
/*  350 */           .getCoReContratante().trim().length() > 20) {
/*  351 */           error = "1057";
/*      */         }
/*      */       
/*      */       }
/*  355 */     } else if (nombreTx.trim().equalsIgnoreCase("RS")) {
/*      */       
/*  357 */       if ("".equals(inConAse.getNoTransaccion())) {
/*  358 */         error = "0100";
/*  359 */       } else if ("".equals(inConAse.getIdRemitente())) {
/*  360 */         error = "0101";
/*  361 */       } else if ("".equals(inConAse.getIdReceptor())) {
/*  362 */         error = "0102";
/*  363 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/*  364 */         error = "0103";
/*  365 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/*  366 */         error = "0104";
/*  367 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/*  368 */         error = "0105";
/*  369 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/*  370 */         error = "0106";
/*  371 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/*  372 */         error = "0107";
/*  373 */       } else if ("".equals(inConAse.getCaRemitente())) {
/*  374 */         error = "0108";
/*  375 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/*  376 */         error = "0109";
/*  377 */       } else if ("".equals(inConAse.getTxRequest())) {
/*  378 */         error = "0113";
/*  379 */       } else if ("".equals(inConAse.getCaReceptor())) {
/*  380 */         error = "0114";
/*      */       }
/*  382 */       else if ("".equals(inConAse.getCaPaciente())) {
/*  383 */         error = "0150";
/*  384 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/*  385 */         error = "0151";
/*  386 */       } else if ("".equals(inConAse.getNoPaciente())) {
/*  387 */         error = "0152";
/*  388 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/*  389 */         error = "0153";
/*  390 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/*  391 */         error = "0154";
/*  392 */       } else if ("".equals(inConAse.getTiDocumento())) {
/*  393 */         error = "0156";
/*  394 */       } else if ("".equals(inConAse.getNuDocumento())) {
/*  395 */         error = "0157";
/*  396 */       } else if ("".equals(inConAse.getCoProducto())) {
/*  397 */         error = "0164";
/*  398 */       } else if ("".equals(inConAse.getDeProducto())) {
/*  399 */         error = "0165";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  420 */       else if ("".equals(inConAse.getCoParentesco())) {
/*  421 */         error = "0173";
/*  422 */       } else if ("".equals(inConAse.getNuPlan())) {
/*  423 */         error = "0170";
/*      */       }
/*  425 */       else if ("".equals(inConAse.getTiCaContratante())) {
/*  426 */         error = "0350";
/*  427 */       } else if ("".equals(inConAse.getNoPaContratante())) {
/*  428 */         error = "0351";
/*      */       
/*      */       }
/*  431 */       else if ("".equals(inConAse.getNoContratante())) {
/*  432 */         error = "0353";
/*  433 */       } else if ("".equals(inConAse.getNoMaContratante())) {
/*  434 */         error = "0354";
/*  435 */       } else if ("".equals(inConAse.getTiDoContratante())) {
/*  436 */         error = "0355";
/*  437 */       } else if ("".equals(inConAse.getIdReContratante())) {
/*  438 */         error = "0356";
/*  439 */       } else if ("".equals(inConAse.getCoReContratante())) {
/*  440 */         error = "0357";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  445 */       if (error.equals("0000")) {
/*  446 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/*  447 */           error = "0750";
/*  448 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/*  449 */           error = "0751";
/*  450 */         } else if (inConAse.getIdReceptor().length() != 15) {
/*  451 */           error = "0752";
/*  452 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/*  453 */           error = "0753";
/*  454 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/*  455 */           error = "0754";
/*  456 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/*  457 */           error = "0755";
/*  458 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/*  459 */           error = "0756";
/*  460 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/*  461 */           error = "0757";
/*  462 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/*  463 */           .getCaRemitente().trim().length() != 1 || (
/*  464 */           !inConAse.getCaRemitente().trim().equals("1") && 
/*  465 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/*  466 */           error = "0758";
/*  467 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/*  468 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/*  469 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/*  470 */           .getNuRucRemitente().trim().equals("00000000000")) {
/*  471 */           error = "0761";
/*  472 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/*  473 */           .getTxRequest().trim().length() < 1 || inConAse
/*  474 */           .getTxRequest().trim().length() > 3) {
/*  475 */           error = "0765";
/*  476 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/*  477 */           .getCaReceptor().trim().length() != 1 || (
/*  478 */           !inConAse.getCaReceptor().trim().equals("1") && 
/*  479 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/*  480 */           error = "0766";
/*  481 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/*  482 */           .getCaPaciente().trim().length() != 1 || (
/*  483 */           !inConAse.getCaPaciente().trim().equals("1") && 
/*  484 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/*  485 */           error = "0800";
/*  486 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/*  487 */           .getApPaternoPaciente().trim().length() > 60) {
/*  488 */           error = "0801";
/*  489 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/*  490 */           .getNoPaciente().trim().length() > 35) {
/*  491 */           error = "0802";
/*  492 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/*  493 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/*  494 */           .getCoAfPaciente().trim().length() > 20) {
/*  495 */           error = "0803";
/*  496 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/*  497 */           .getApMaternoPaciente().trim().length() > 60) {
/*  498 */           error = "0804";
/*  499 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  500 */           .getTiDocumento().trim().length() > 2) {
/*  501 */           error = "0806";
/*  502 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/*  503 */           error = "0807";
/*  504 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/*  505 */           .getCoProducto().trim().length() < 1 || inConAse
/*  506 */           .getCoProducto().trim().length() > 20) {
/*  507 */           error = "0814";
/*  508 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/*  509 */           .getDeProducto().trim().length() > 80) {
/*  510 */           error = "0815";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*  544 */         else if (ManagerUtil.validaSoloDigito(inConAse.getCoParentesco()) != '0' || inConAse
/*  545 */           .getCoParentesco().trim().length() < 1 || inConAse
/*  546 */           .getCoParentesco().trim().length() > 2) {
/*  547 */           error = "0821";
/*  548 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/*  549 */           .getNuPlan().trim().length() < 1 || inConAse
/*  550 */           .getNuPlan().trim().length() > 20) {
/*  551 */           error = "0818";
/*      */         
/*      */         }
/*  554 */         else if (inConAse.getTiCaContratante().trim().length() != 1 || (!inConAse.getTiCaContratante().trim().equals("1") && 
/*  555 */           !inConAse.getTiCaContratante().trim().equals("2"))) {
/*  556 */           error = "1050";
/*  557 */         } else if (inConAse.getNoPaContratante().trim().length() < 1 || inConAse
/*  558 */           .getNoPaContratante().trim().length() > 60) {
/*  559 */           error = "1051";
/*      */ 
/*      */         
/*      */         }
/*  563 */         else if (inConAse.getNoContratante().trim().length() < 1 || inConAse
/*  564 */           .getNoContratante().trim().length() > 35) {
/*  565 */           error = "1053";
/*  566 */         } else if (inConAse.getNoMaContratante().trim().length() < 1 || inConAse
/*  567 */           .getNoMaContratante().trim().length() > 60) {
/*  568 */           error = "1054";
/*  569 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiDoContratante()) != '0' || inConAse
/*  570 */           .getTiDoContratante().trim().length() < 1 || inConAse
/*  571 */           .getTiDoContratante().trim().length() > 2) {
/*  572 */           error = "1055";
/*  573 */         } else if (inConAse.getIdReContratante().trim().length() < 2 || inConAse.getIdReContratante().trim().length() > 3 || (
/*  574 */           !inConAse.getIdReContratante().trim().equals("XX5") && 
/*  575 */           !inConAse.getIdReContratante().trim().equals("4A"))) {
/*  576 */           error = "1056";
/*  577 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoReContratante()) != '0' || inConAse
/*  578 */           .getCoReContratante().trim().length() < 1 || inConAse
/*  579 */           .getCoReContratante().trim().length() > 20) {
/*  580 */           error = "1057";
/*      */         }
/*      */       
/*      */       }
/*  584 */     } else if (nombreTx.trim().equalsIgnoreCase("RD")) {
/*      */       
/*  586 */       if ("".equals(inConAse.getNoTransaccion())) {
/*  587 */         error = "0100";
/*  588 */       } else if ("".equals(inConAse.getIdRemitente())) {
/*  589 */         error = "0101";
/*  590 */       } else if ("".equals(inConAse.getIdReceptor())) {
/*  591 */         error = "0102";
/*  592 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/*  593 */         error = "0103";
/*  594 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/*  595 */         error = "0104";
/*  596 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/*  597 */         error = "0105";
/*  598 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/*  599 */         error = "0106";
/*  600 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/*  601 */         error = "0107";
/*  602 */       } else if ("".equals(inConAse.getCaRemitente())) {
/*  603 */         error = "0108";
/*  604 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/*  605 */         error = "0109";
/*  606 */       } else if ("".equals(inConAse.getTxRequest())) {
/*  607 */         error = "0113";
/*  608 */       } else if ("".equals(inConAse.getCaReceptor())) {
/*  609 */         error = "0114";
/*      */       }
/*  611 */       else if ("".equals(inConAse.getCaPaciente())) {
/*  612 */         error = "0150";
/*  613 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/*  614 */         error = "0151";
/*  615 */       } else if ("".equals(inConAse.getNoPaciente())) {
/*  616 */         error = "0152";
/*  617 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/*  618 */         error = "0153";
/*  619 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/*  620 */         error = "0154";
/*  621 */       } else if ("".equals(inConAse.getTiDocumento())) {
/*  622 */         error = "0156";
/*  623 */       } else if ("".equals(inConAse.getNuDocumento())) {
/*  624 */         error = "0157";
/*  625 */       } else if ("".equals(inConAse.getCoProducto())) {
/*  626 */         error = "0164";
/*  627 */       } else if ("".equals(inConAse.getDeProducto())) {
/*  628 */         error = "0165";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/*  649 */       else if ("".equals(inConAse.getCoParentesco())) {
/*  650 */         error = "0173";
/*  651 */       } else if ("".equals(inConAse.getNuPlan())) {
/*  652 */         error = "0170";
/*      */       }
/*  654 */       else if ("".equals(inConAse.getTiCaContratante())) {
/*  655 */         error = "0350";
/*  656 */       } else if ("".equals(inConAse.getNoPaContratante())) {
/*  657 */         error = "0351";
/*      */       
/*      */       }
/*  660 */       else if ("".equals(inConAse.getNoContratante())) {
/*  661 */         error = "0353";
/*  662 */       } else if ("".equals(inConAse.getNoMaContratante())) {
/*  663 */         error = "0354";
/*  664 */       } else if ("".equals(inConAse.getTiDoContratante())) {
/*  665 */         error = "0355";
/*  666 */       } else if ("".equals(inConAse.getIdReContratante())) {
/*  667 */         error = "0356";
/*  668 */       } else if ("".equals(inConAse.getCoReContratante())) {
/*  669 */         error = "0357";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  674 */       if (error.equals("0000")) {
/*  675 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/*  676 */           error = "0750";
/*  677 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/*  678 */           error = "0751";
/*  679 */         } else if (inConAse.getIdReceptor().length() != 15) {
/*  680 */           error = "0752";
/*  681 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/*  682 */           error = "0753";
/*  683 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/*  684 */           error = "0754";
/*  685 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/*  686 */           error = "0755";
/*  687 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/*  688 */           error = "0756";
/*  689 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/*  690 */           error = "0757";
/*  691 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/*  692 */           .getCaRemitente().trim().length() != 1 || (
/*  693 */           !inConAse.getCaRemitente().trim().equals("1") && 
/*  694 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/*  695 */           error = "0758";
/*  696 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/*  697 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/*  698 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/*  699 */           .getNuRucRemitente().trim().equals("00000000000")) {
/*  700 */           error = "0761";
/*  701 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/*  702 */           .getTxRequest().trim().length() < 1 || inConAse
/*  703 */           .getTxRequest().trim().length() > 3) {
/*  704 */           error = "0765";
/*  705 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/*  706 */           .getCaReceptor().trim().length() != 1 || (
/*  707 */           !inConAse.getCaReceptor().trim().equals("1") && 
/*  708 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/*  709 */           error = "0766";
/*  710 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/*  711 */           .getCaPaciente().trim().length() != 1 || (
/*  712 */           !inConAse.getCaPaciente().trim().equals("1") && 
/*  713 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/*  714 */           error = "0800";
/*  715 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/*  716 */           .getApPaternoPaciente().trim().length() > 60) {
/*  717 */           error = "0801";
/*  718 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/*  719 */           .getNoPaciente().trim().length() > 35) {
/*  720 */           error = "0802";
/*  721 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/*  722 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/*  723 */           .getCoAfPaciente().trim().length() > 20) {
/*  724 */           error = "0803";
/*  725 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/*  726 */           .getApMaternoPaciente().trim().length() > 60) {
/*  727 */           error = "0804";
/*  728 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  729 */           .getTiDocumento().trim().length() > 2) {
/*  730 */           error = "0806";
/*  731 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/*  732 */           error = "0723";
/*  733 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/*  734 */           .getCoProducto().trim().length() < 1 || inConAse
/*  735 */           .getCoProducto().trim().length() > 20) {
/*  736 */           error = "0730";
/*  737 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/*  738 */           .getDeProducto().trim().length() > 80) {
/*  739 */           error = "0731";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*  773 */         else if (ManagerUtil.validaSoloDigito(inConAse.getCoParentesco()) != '0' || inConAse
/*  774 */           .getCoParentesco().trim().length() < 1 || inConAse
/*  775 */           .getCoParentesco().trim().length() > 2) {
/*  776 */           error = "0821";
/*  777 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/*  778 */           .getNuPlan().trim().length() < 1 || inConAse
/*  779 */           .getNuPlan().trim().length() > 20) {
/*  780 */           error = "0818";
/*      */         
/*      */         }
/*  783 */         else if (inConAse.getTiCaContratante().trim().length() != 1 || (!inConAse.getTiCaContratante().trim().equals("1") && 
/*  784 */           !inConAse.getTiCaContratante().trim().equals("2"))) {
/*  785 */           error = "1050";
/*  786 */         } else if (inConAse.getNoPaContratante().trim().length() < 1 || inConAse
/*  787 */           .getNoPaContratante().trim().length() > 60) {
/*  788 */           error = "1051";
/*      */ 
/*      */         
/*      */         }
/*  792 */         else if (inConAse.getNoContratante().trim().length() < 1 || inConAse
/*  793 */           .getNoContratante().trim().length() > 35) {
/*  794 */           error = "1053";
/*  795 */         } else if (inConAse.getNoMaContratante().trim().length() < 1 || inConAse
/*  796 */           .getNoMaContratante().trim().length() > 60) {
/*  797 */           error = "1054";
/*  798 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiDoContratante()) != '0' || inConAse
/*  799 */           .getTiDoContratante().trim().length() < 1 || inConAse
/*  800 */           .getTiDoContratante().trim().length() > 2) {
/*  801 */           error = "1055";
/*  802 */         } else if (inConAse.getIdReContratante().trim().length() < 2 || inConAse.getIdReContratante().trim().length() > 3 || (
/*  803 */           !inConAse.getIdReContratante().trim().equals("XX5") && 
/*  804 */           !inConAse.getIdReContratante().trim().equals("4A"))) {
/*  805 */           error = "1056";
/*  806 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoReContratante()) != '0' || inConAse
/*  807 */           .getCoReContratante().trim().length() < 1 || inConAse
/*  808 */           .getCoReContratante().trim().length() > 20) {
/*  809 */           error = "1057";
/*      */         }
/*      */       
/*      */       }
/*  813 */     } else if (nombreTx.trim().equalsIgnoreCase("CP")) {
/*      */       
/*  815 */       if ("".equals(inConAse.getNoTransaccion())) {
/*  816 */         error = "0100";
/*  817 */       } else if ("".equals(inConAse.getIdRemitente())) {
/*  818 */         error = "0101";
/*  819 */       } else if ("".equals(inConAse.getIdReceptor())) {
/*  820 */         error = "0102";
/*  821 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/*  822 */         error = "0103";
/*  823 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/*  824 */         error = "0104";
/*  825 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/*  826 */         error = "0105";
/*  827 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/*  828 */         error = "0106";
/*  829 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/*  830 */         error = "0107";
/*  831 */       } else if ("".equals(inConAse.getCaRemitente())) {
/*  832 */         error = "0108";
/*  833 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/*  834 */         error = "0109";
/*  835 */       } else if ("".equals(inConAse.getTxRequest())) {
/*  836 */         error = "0113";
/*  837 */       } else if ("".equals(inConAse.getCaReceptor())) {
/*  838 */         error = "0114";
/*      */       }
/*  840 */       else if ("".equals(inConAse.getCaPaciente())) {
/*  841 */         error = "0150";
/*  842 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/*  843 */         error = "0151";
/*  844 */       } else if ("".equals(inConAse.getNoPaciente())) {
/*  845 */         error = "0152";
/*  846 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/*  847 */         error = "0153";
/*  848 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/*  849 */         error = "0154";
/*  850 */       } else if ("".equals(inConAse.getTiDocumento())) {
/*  851 */         error = "0156";
/*  852 */       } else if ("".equals(inConAse.getNuDocumento())) {
/*  853 */         error = "0157";
/*  854 */       } else if ("".equals(inConAse.getCoProducto())) {
/*  855 */         error = "0164";
/*  856 */       } else if ("".equals(inConAse.getDeProducto())) {
/*  857 */         error = "0165";
/*      */       
/*      */       }
/*  860 */       else if ("".equals(inConAse.getNuCobertura())) {
/*  861 */         error = "0300";
/*      */       
/*      */       }
/*  864 */       else if ("".equals(inConAse.getCaServicio())) {
/*  865 */         error = "0305";
/*  866 */       } else if ("".equals(inConAse.getCoCalservicio())) {
/*  867 */         error = "0464";
/*  868 */       } else if ("".equals(inConAse.getBeMaxInicial())) {
/*  869 */         error = "0452";
/*  870 */       } else if ("".equals(inConAse.getCoTiCobertura())) {
/*  871 */         error = "0457";
/*  872 */       } else if ("".equals(inConAse.getCoSuTiCobertura())) {
/*  873 */         error = "0458";
/*      */       
/*      */       }
/*  876 */       else if ("".equals(inConAse.getCoEspecialidad())) {
/*  877 */         error = "0176";
/*      */       
/*      */       }
/*  880 */       else if ("".equals(inConAse.getNuPlan())) {
/*  881 */         error = "0170";
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  902 */       if (error.equals("0000")) {
/*  903 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/*  904 */           error = "0750";
/*  905 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/*  906 */           error = "0751";
/*  907 */         } else if (inConAse.getIdReceptor().length() != 15) {
/*  908 */           error = "0752";
/*  909 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/*  910 */           error = "0753";
/*  911 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/*  912 */           error = "0754";
/*  913 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/*  914 */           error = "0755";
/*  915 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/*  916 */           error = "0756";
/*  917 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/*  918 */           error = "0757";
/*  919 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/*  920 */           .getCaRemitente().trim().length() != 1 || (
/*  921 */           !inConAse.getCaRemitente().trim().equals("1") && 
/*  922 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/*  923 */           error = "0758";
/*  924 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/*  925 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/*  926 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/*  927 */           .getNuRucRemitente().trim().equals("00000000000")) {
/*  928 */           error = "0761";
/*  929 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/*  930 */           .getTxRequest().trim().length() < 1 || inConAse
/*  931 */           .getTxRequest().trim().length() > 3) {
/*  932 */           error = "0765";
/*  933 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/*  934 */           .getCaReceptor().trim().length() != 1 || (
/*  935 */           !inConAse.getCaReceptor().trim().equals("1") && 
/*  936 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/*  937 */           error = "0766";
/*  938 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/*  939 */           .getCaPaciente().trim().length() != 1 || (
/*  940 */           !inConAse.getCaPaciente().trim().equals("1") && 
/*  941 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/*  942 */           error = "0800";
/*  943 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/*  944 */           .getApPaternoPaciente().trim().length() > 60) {
/*  945 */           error = "0801";
/*  946 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/*  947 */           .getNoPaciente().trim().length() > 35) {
/*  948 */           error = "0802";
/*  949 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/*  950 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/*  951 */           .getCoAfPaciente().trim().length() > 20) {
/*  952 */           error = "0803";
/*  953 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/*  954 */           .getApMaternoPaciente().trim().length() > 60) {
/*  955 */           error = "0804";
/*  956 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/*  957 */           .getTiDocumento().trim().length() > 2) {
/*  958 */           error = "0806";
/*  959 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/*  960 */           error = "0807";
/*  961 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/*  962 */           .getCoProducto().trim().length() < 1 || inConAse
/*  963 */           .getCoProducto().trim().length() > 20) {
/*  964 */           error = "0814";
/*  965 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/*  966 */           .getDeProducto().trim().length() > 80) {
/*  967 */           error = "0815";
/*      */         
/*      */         }
/*  970 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuCobertura()) != '0' || inConAse
/*  971 */           .getNuCobertura().trim().length() < 1 || inConAse
/*  972 */           .getNuCobertura().trim().length() > 20) {
/*  973 */           error = "1000";
/*      */ 
/*      */         
/*      */         }
/*  977 */         else if (inConAse.getCaServicio().trim().length() < 1 || inConAse
/*  978 */           .getCaServicio().trim().length() > 2) {
/*  979 */           error = "1005";
/*  980 */         } else if (inConAse.getCoCalservicio().trim().length() != 2) {
/*  981 */           error = "1164";
/*  982 */         } else if (ManagerUtil.validaDecimales(inConAse.getBeMaxInicial()) != '0' || inConAse
/*  983 */           .getBeMaxInicial().trim().length() < 1 || inConAse
/*  984 */           .getBeMaxInicial().trim().length() > 18) {
/*  985 */           error = "1152";
/*  986 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoTiCobertura()) != '0' || inConAse
/*  987 */           .getCoTiCobertura().trim().length() < 1 || inConAse
/*  988 */           .getCoTiCobertura().trim().length() > 2) {
/*  989 */           error = "1157";
/*  990 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoSuTiCobertura()) != '0' || inConAse
/*  991 */           .getCoSuTiCobertura().trim().length() < 1 || inConAse
/*  992 */           .getCoSuTiCobertura().trim().length() > 20) {
/*  993 */           error = "1158";
/*      */ 
/*      */         
/*      */         }
/*  997 */         else if (inConAse.getCoEspecialidad().trim().length() < 1 || inConAse
/*  998 */           .getCoEspecialidad().trim().length() > 20) {
/*  999 */           error = "0824";
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1004 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/* 1005 */           .getNuPlan().trim().length() < 1 || inConAse
/* 1006 */           .getNuPlan().trim().length() > 20) {
/* 1007 */           error = "0818";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
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
/* 1040 */     else if (nombreTx.trim().equalsIgnoreCase("CD")) {
/*      */       
/* 1042 */       if ("".equals(inConAse.getNoTransaccion())) {
/* 1043 */         error = "0100";
/* 1044 */       } else if ("".equals(inConAse.getIdRemitente())) {
/* 1045 */         error = "0101";
/* 1046 */       } else if ("".equals(inConAse.getIdReceptor())) {
/* 1047 */         error = "0102";
/* 1048 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/* 1049 */         error = "0103";
/* 1050 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/* 1051 */         error = "0104";
/* 1052 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/* 1053 */         error = "0105";
/* 1054 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/* 1055 */         error = "0106";
/* 1056 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/* 1057 */         error = "0107";
/* 1058 */       } else if ("".equals(inConAse.getCaRemitente())) {
/* 1059 */         error = "0108";
/* 1060 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/* 1061 */         error = "0109";
/* 1062 */       } else if ("".equals(inConAse.getTxRequest())) {
/* 1063 */         error = "0113";
/* 1064 */       } else if ("".equals(inConAse.getCaReceptor())) {
/* 1065 */         error = "0114";
/*      */       }
/* 1067 */       else if ("".equals(inConAse.getCaPaciente())) {
/* 1068 */         error = "0150";
/* 1069 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/* 1070 */         error = "0151";
/* 1071 */       } else if ("".equals(inConAse.getNoPaciente())) {
/* 1072 */         error = "0152";
/* 1073 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/* 1074 */         error = "0153";
/* 1075 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/* 1076 */         error = "0154";
/* 1077 */       } else if ("".equals(inConAse.getTiDocumento())) {
/* 1078 */         error = "0156";
/* 1079 */       } else if ("".equals(inConAse.getNuDocumento())) {
/* 1080 */         error = "0157";
/* 1081 */       } else if ("".equals(inConAse.getCoProducto())) {
/* 1082 */         error = "0164";
/* 1083 */       } else if ("".equals(inConAse.getDeProducto())) {
/* 1084 */         error = "0165";
/*      */       
/*      */       }
/* 1087 */       else if ("".equals(inConAse.getNuCobertura())) {
/* 1088 */         error = "0300";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1103 */       else if ("".equals(inConAse.getCoEspecialidad())) {
/* 1104 */         error = "0141";
/*      */       
/*      */       }
/* 1107 */       else if ("".equals(inConAse.getNuPlan())) {
/* 1108 */         error = "0170";
/*      */       }
/* 1110 */       else if ("".equals(inConAse.getTiCaContratante())) {
/* 1111 */         error = "0350";
/* 1112 */       } else if ("".equals(inConAse.getNoPaContratante())) {
/* 1113 */         error = "0351";
/*      */       
/*      */       }
/* 1116 */       else if ("".equals(inConAse.getNoContratante())) {
/* 1117 */         error = "0353";
/* 1118 */       } else if ("".equals(inConAse.getNoMaContratante())) {
/* 1119 */         error = "0354";
/* 1120 */       } else if ("".equals(inConAse.getTiDoContratante())) {
/* 1121 */         error = "0355";
/* 1122 */       } else if ("".equals(inConAse.getIdReContratante())) {
/* 1123 */         error = "0356";
/* 1124 */       } else if ("".equals(inConAse.getCoReContratante())) {
/* 1125 */         error = "0357";
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1130 */       if (error.equals("0000")) {
/* 1131 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/* 1132 */           error = "0750";
/* 1133 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/* 1134 */           error = "0751";
/* 1135 */         } else if (inConAse.getIdReceptor().length() != 15) {
/* 1136 */           error = "0752";
/* 1137 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/* 1138 */           error = "0753";
/* 1139 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/* 1140 */           error = "0754";
/* 1141 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/* 1142 */           error = "0755";
/* 1143 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/* 1144 */           error = "0756";
/* 1145 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/* 1146 */           error = "0757";
/* 1147 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/* 1148 */           .getCaRemitente().trim().length() != 1 || (
/* 1149 */           !inConAse.getCaRemitente().trim().equals("1") && 
/* 1150 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/* 1151 */           error = "0758";
/* 1152 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/* 1153 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/* 1154 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/* 1155 */           .getNuRucRemitente().trim().equals("00000000000")) {
/* 1156 */           error = "0761";
/* 1157 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/* 1158 */           .getTxRequest().trim().length() < 1 || inConAse
/* 1159 */           .getTxRequest().trim().length() > 3) {
/* 1160 */           error = "0765";
/* 1161 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/* 1162 */           .getCaReceptor().trim().length() != 1 || (
/* 1163 */           !inConAse.getCaReceptor().trim().equals("1") && 
/* 1164 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/* 1165 */           error = "0766";
/* 1166 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/* 1167 */           .getCaPaciente().trim().length() != 1 || (
/* 1168 */           !inConAse.getCaPaciente().trim().equals("1") && 
/* 1169 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/* 1170 */           error = "0800";
/* 1171 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/* 1172 */           .getApPaternoPaciente().trim().length() > 60) {
/* 1173 */           error = "0801";
/* 1174 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/* 1175 */           .getNoPaciente().trim().length() > 35) {
/* 1176 */           error = "0802";
/* 1177 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/* 1178 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/* 1179 */           .getCoAfPaciente().trim().length() > 20) {
/* 1180 */           error = "0803";
/* 1181 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/* 1182 */           .getApMaternoPaciente().trim().length() > 60) {
/* 1183 */           error = "0804";
/* 1184 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/* 1185 */           .getTiDocumento().trim().length() > 2) {
/* 1186 */           error = "0806";
/* 1187 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/* 1188 */           error = "0807";
/* 1189 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/* 1190 */           .getCoProducto().trim().length() < 1 || inConAse
/* 1191 */           .getCoProducto().trim().length() > 20) {
/* 1192 */           error = "0814";
/* 1193 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/* 1194 */           .getDeProducto().trim().length() > 80) {
/* 1195 */           error = "0815";
/*      */         
/*      */         }
/* 1198 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuCobertura()) != '0' || inConAse
/* 1199 */           .getNuCobertura().trim().length() < 1 || inConAse
/* 1200 */           .getNuCobertura().trim().length() > 20) {
/* 1201 */           error = "0300";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1226 */         else if (inConAse.getCoEspecialidad().trim().length() < 1 || inConAse
/* 1227 */           .getCoEspecialidad().trim().length() > 20) {
/* 1228 */           error = "0824";
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1233 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/* 1234 */           .getNuPlan().trim().length() < 1 || inConAse
/* 1235 */           .getNuPlan().trim().length() > 20) {
/* 1236 */           error = "0818";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
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
/* 1269 */     else if (nombreTx.trim().equalsIgnoreCase("CM")) {
/*      */       
/* 1271 */       if ("".equals(inConAse.getNoTransaccion())) {
/* 1272 */         error = "0100";
/* 1273 */       } else if ("".equals(inConAse.getIdRemitente())) {
/* 1274 */         error = "0101";
/* 1275 */       } else if ("".equals(inConAse.getIdReceptor())) {
/* 1276 */         error = "0102";
/* 1277 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/* 1278 */         error = "0103";
/* 1279 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/* 1280 */         error = "0104";
/* 1281 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/* 1282 */         error = "0105";
/* 1283 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/* 1284 */         error = "0106";
/* 1285 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/* 1286 */         error = "0107";
/* 1287 */       } else if ("".equals(inConAse.getCaRemitente())) {
/* 1288 */         error = "0108";
/* 1289 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/* 1290 */         error = "0109";
/* 1291 */       } else if ("".equals(inConAse.getTxRequest())) {
/* 1292 */         error = "0113";
/* 1293 */       } else if ("".equals(inConAse.getCaReceptor())) {
/* 1294 */         error = "0114";
/*      */       }
/* 1296 */       else if ("".equals(inConAse.getCaPaciente())) {
/* 1297 */         error = "0150";
/* 1298 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/* 1299 */         error = "0151";
/* 1300 */       } else if ("".equals(inConAse.getNoPaciente())) {
/* 1301 */         error = "0152";
/* 1302 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/* 1303 */         error = "0153";
/* 1304 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/* 1305 */         error = "0154";
/* 1306 */       } else if ("".equals(inConAse.getTiDocumento())) {
/* 1307 */         error = "0156";
/* 1308 */       } else if ("".equals(inConAse.getNuDocumento())) {
/* 1309 */         error = "0157";
/* 1310 */       } else if ("".equals(inConAse.getCoProducto())) {
/* 1311 */         error = "0164";
/* 1312 */       } else if ("".equals(inConAse.getDeProducto())) {
/* 1313 */         error = "0165";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1336 */       else if ("".equals(inConAse.getNuPlan())) {
/* 1337 */         error = "0170";
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1358 */       if (error.equals("0000")) {
/* 1359 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/* 1360 */           error = "0750";
/* 1361 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/* 1362 */           error = "0751";
/* 1363 */         } else if (inConAse.getIdReceptor().length() != 15) {
/* 1364 */           error = "0752";
/* 1365 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/* 1366 */           error = "0753";
/* 1367 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/* 1368 */           error = "0754";
/* 1369 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/* 1370 */           error = "0755";
/* 1371 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/* 1372 */           error = "0756";
/* 1373 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/* 1374 */           error = "0757";
/* 1375 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/* 1376 */           .getCaRemitente().trim().length() != 1 || (
/* 1377 */           !inConAse.getCaRemitente().trim().equals("1") && 
/* 1378 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/* 1379 */           error = "0758";
/* 1380 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/* 1381 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/* 1382 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/* 1383 */           .getNuRucRemitente().trim().equals("00000000000")) {
/* 1384 */           error = "0761";
/* 1385 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/* 1386 */           .getTxRequest().trim().length() < 1 || inConAse
/* 1387 */           .getTxRequest().trim().length() > 3) {
/* 1388 */           error = "0765";
/* 1389 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/* 1390 */           .getCaReceptor().trim().length() != 1 || (
/* 1391 */           !inConAse.getCaReceptor().trim().equals("1") && 
/* 1392 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/* 1393 */           error = "0766";
/* 1394 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/* 1395 */           .getCaPaciente().trim().length() != 1 || (
/* 1396 */           !inConAse.getCaPaciente().trim().equals("1") && 
/* 1397 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/* 1398 */           error = "0800";
/* 1399 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/* 1400 */           .getApPaternoPaciente().trim().length() > 60) {
/* 1401 */           error = "0801";
/* 1402 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/* 1403 */           .getNoPaciente().trim().length() > 35) {
/* 1404 */           error = "0802";
/* 1405 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/* 1406 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/* 1407 */           .getCoAfPaciente().trim().length() > 20) {
/* 1408 */           error = "0803";
/* 1409 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/* 1410 */           .getApMaternoPaciente().trim().length() > 60) {
/* 1411 */           error = "0804";
/* 1412 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/* 1413 */           .getTiDocumento().trim().length() > 2) {
/* 1414 */           error = "0806";
/* 1415 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/* 1416 */           error = "0807";
/* 1417 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/* 1418 */           .getCoProducto().trim().length() < 1 || inConAse
/* 1419 */           .getCoProducto().trim().length() > 20) {
/* 1420 */           error = "0814";
/* 1421 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/* 1422 */           .getDeProducto().trim().length() > 80) {
/* 1423 */           error = "0815";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1461 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/* 1462 */           .getNuPlan().trim().length() < 1 || inConAse
/* 1463 */           .getNuPlan().trim().length() > 20) {
/* 1464 */           error = "0818";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/*      */ 
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
/* 1496 */     else if (nombreTx.trim().equalsIgnoreCase("CO")) {
/*      */       
/* 1498 */       if ("".equals(inConAse.getNoTransaccion())) {
/* 1499 */         error = "0100";
/* 1500 */       } else if ("".equals(inConAse.getIdRemitente())) {
/* 1501 */         error = "0101";
/* 1502 */       } else if ("".equals(inConAse.getIdReceptor())) {
/* 1503 */         error = "0102";
/* 1504 */       } else if ("".equals(inConAse.getFeTransaccion())) {
/* 1505 */         error = "0103";
/* 1506 */       } else if ("".equals(inConAse.getHoTransaccion())) {
/* 1507 */         error = "0104";
/* 1508 */       } else if ("".equals(inConAse.getIdCorrelativo())) {
/* 1509 */         error = "0105";
/* 1510 */       } else if ("".equals(inConAse.getIdTransaccion())) {
/* 1511 */         error = "0106";
/* 1512 */       } else if ("".equals(inConAse.getTiFinalidad())) {
/* 1513 */         error = "0107";
/* 1514 */       } else if ("".equals(inConAse.getCaRemitente())) {
/* 1515 */         error = "0108";
/* 1516 */       } else if ("".equals(inConAse.getNuRucRemitente())) {
/* 1517 */         error = "0109";
/* 1518 */       } else if ("".equals(inConAse.getTxRequest())) {
/* 1519 */         error = "0113";
/* 1520 */       } else if ("".equals(inConAse.getCaReceptor())) {
/* 1521 */         error = "0114";
/*      */       }
/* 1523 */       else if ("".equals(inConAse.getCaPaciente())) {
/* 1524 */         error = "0150";
/* 1525 */       } else if ("".equals(inConAse.getApPaternoPaciente())) {
/* 1526 */         error = "0151";
/* 1527 */       } else if ("".equals(inConAse.getNoPaciente())) {
/* 1528 */         error = "0152";
/* 1529 */       } else if ("".equals(inConAse.getCoAfPaciente())) {
/* 1530 */         error = "0153";
/* 1531 */       } else if ("".equals(inConAse.getApMaternoPaciente())) {
/* 1532 */         error = "0154";
/* 1533 */       } else if ("".equals(inConAse.getTiDocumento())) {
/* 1534 */         error = "0156";
/* 1535 */       } else if ("".equals(inConAse.getNuDocumento())) {
/* 1536 */         error = "0157";
/* 1537 */       } else if ("".equals(inConAse.getCoProducto())) {
/* 1538 */         error = "0164";
/* 1539 */       } else if ("".equals(inConAse.getDeProducto())) {
/* 1540 */         error = "0165";
/* 1541 */       } else if ("".equals(inConAse.getCoInProducto())) {
/* 1542 */         error = "0168";
/* 1543 */       } else if ("".equals(inConAse.getNuCobertura())) {
/* 1544 */         error = "0300";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
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
/* 1563 */       else if ("".equals(inConAse.getNuPlan())) {
/* 1564 */         error = "0170";
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1585 */       if (error.equals("0000")) {
/* 1586 */         if (inConAse.getNoTransaccion().trim().length() < 1 || inConAse.getNoTransaccion().trim().length() > 60) {
/* 1587 */           error = "0750";
/* 1588 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getIdRemitente()) != '0' || inConAse.getIdRemitente().length() != 15) {
/* 1589 */           error = "0751";
/* 1590 */         } else if (inConAse.getIdReceptor().length() != 15) {
/* 1591 */           error = "0752";
/* 1592 */         } else if (!ManagerUtil.validaFecha(inConAse.getFeTransaccion(), "YYYYmmdd") || inConAse.getFeTransaccion().trim().length() != 8) {
/* 1593 */           error = "0753";
/* 1594 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getHoTransaccion()) != '0' || inConAse.getHoTransaccion().trim().length() < 4 || inConAse.getHoTransaccion().trim().length() > 8) {
/* 1595 */           error = "0754";
/* 1596 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdCorrelativo()) != '0' || inConAse.getIdCorrelativo().trim().length() != 9) {
/* 1597 */           error = "0755";
/* 1598 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getIdTransaccion()) != '0' || inConAse.getIdTransaccion().trim().length() != 3) {
/* 1599 */           error = "0756";
/* 1600 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getTiFinalidad()) != '0' || inConAse.getTiFinalidad().trim().length() != 2) {
/* 1601 */           error = "0757";
/* 1602 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaRemitente()) != '0' || inConAse
/* 1603 */           .getCaRemitente().trim().length() != 1 || (
/* 1604 */           !inConAse.getCaRemitente().trim().equals("1") && 
/* 1605 */           !inConAse.getCaRemitente().trim().equals("2"))) {
/* 1606 */           error = "0758";
/* 1607 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuRucRemitente()) != '0' || inConAse
/* 1608 */           .getNuRucRemitente().trim().length() < 2 || inConAse
/* 1609 */           .getNuRucRemitente().trim().length() > 20 || inConAse
/* 1610 */           .getNuRucRemitente().trim().equals("00000000000")) {
/* 1611 */           error = "0761";
/* 1612 */         } else if (ManagerUtil.validaAlfanumerico(inConAse.getTxRequest()) != '0' || inConAse
/* 1613 */           .getTxRequest().trim().length() < 1 || inConAse
/* 1614 */           .getTxRequest().trim().length() > 3) {
/* 1615 */           error = "0765";
/* 1616 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaReceptor()) != '0' || inConAse
/* 1617 */           .getCaReceptor().trim().length() != 1 || (
/* 1618 */           !inConAse.getCaReceptor().trim().equals("1") && 
/* 1619 */           !inConAse.getCaReceptor().trim().equals("2"))) {
/* 1620 */           error = "0766";
/* 1621 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCaPaciente()) != '0' || inConAse
/* 1622 */           .getCaPaciente().trim().length() != 1 || (
/* 1623 */           !inConAse.getCaPaciente().trim().equals("1") && 
/* 1624 */           !inConAse.getCaPaciente().trim().equals("2"))) {
/* 1625 */           error = "0800";
/* 1626 */         } else if (inConAse.getApPaternoPaciente().trim().length() < 1 || inConAse
/* 1627 */           .getApPaternoPaciente().trim().length() > 60) {
/* 1628 */           error = "0801";
/* 1629 */         } else if (inConAse.getNoPaciente().trim().length() < 1 || inConAse
/* 1630 */           .getNoPaciente().trim().length() > 35) {
/* 1631 */           error = "0802";
/* 1632 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoAfPaciente()) != '0' || inConAse
/* 1633 */           .getCoAfPaciente().trim().length() < 2 || inConAse
/* 1634 */           .getCoAfPaciente().trim().length() > 20) {
/* 1635 */           error = "0803";
/* 1636 */         } else if (inConAse.getApMaternoPaciente().trim().length() < 1 || inConAse
/* 1637 */           .getApMaternoPaciente().trim().length() > 60) {
/* 1638 */           error = "0804";
/* 1639 */         } else if (inConAse.getTiDocumento().trim().length() < 1 || inConAse
/* 1640 */           .getTiDocumento().trim().length() > 2) {
/* 1641 */           error = "0806";
/* 1642 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuDocumento()) != '0' || inConAse.getNuDocumento().trim().length() != 8) {
/* 1643 */           error = "0807";
/* 1644 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getCoProducto()) != '0' || inConAse
/* 1645 */           .getCoProducto().trim().length() < 1 || inConAse
/* 1646 */           .getCoProducto().trim().length() > 20) {
/* 1647 */           error = "0814";
/* 1648 */         } else if (inConAse.getDeProducto().trim().length() < 1 || inConAse
/* 1649 */           .getDeProducto().trim().length() > 80) {
/* 1650 */           error = "0815";
/* 1651 */         } else if (inConAse.getCoInProducto().trim().length() < 1 || inConAse
/* 1652 */           .getCoInProducto().trim().length() > 20) {
/* 1653 */           error = "0817";
/* 1654 */         } else if (ManagerUtil.validaSoloDigito(inConAse.getNuCobertura()) != '0' || inConAse
/* 1655 */           .getNuCobertura().trim().length() < 1 || inConAse
/* 1656 */           .getNuCobertura().trim().length() > 20) {
/* 1657 */           error = "0300";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*      */         }
/* 1689 */         else if (ManagerUtil.validaSoloDigito(inConAse.getNuPlan()) != '0' || inConAse
/* 1690 */           .getNuPlan().trim().length() < 1 || inConAse
/* 1691 */           .getNuPlan().trim().length() > 20) {
/* 1692 */           error = "0818";
/*      */         } 
/*      */       }
/*      */     } 
/* 1696 */     return error;
/*      */   }
/*      */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConAseValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */