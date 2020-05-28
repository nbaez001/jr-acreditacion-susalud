/*      */ package pe.gob.susalud.jr.transaccion.susalud.demo;
/*      */ 
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConObs;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDerivaDetalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctr;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctrDetalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCGDetalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.In997ResAut;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InLogAcreInsert271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutExeCar271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutProEsp271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutRes271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutTieEsp271Detalle;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.service.imp.In997ResAutServiceImpl;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.service.imp.RegAfi271ServiceImpl;
/*      */ import pe.gob.susalud.jr.transaccion.susalud.util.RegAfi271_ToBean;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class TransaccionDemo
/*      */ {
/*      */   public static void main(String[] args) {
/*   75 */     String sX12N = "";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  117 */     System.out.println("------------------REGAFI271-----------------");
/*  118 */     RegAfi271ServiceImpl regAfi271Service = new RegAfi271ServiceImpl();
/*  119 */     InRegAfi271 regAfi271 = generarRegafi271();
/*  120 */     sX12N = regAfi271Service.beanToX12N(regAfi271);
/*  121 */     System.out.println("*****REGAFI_271*****");
/*  122 */     System.out.println(sX12N);
/*      */     
/*  124 */     regAfi271 = RegAfi271_ToBean.traducirEstructura271(sX12N);
/*  125 */     InRegAfi271coming(regAfi271);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  159 */     In997ResAutServiceImpl in997ResAutService = new In997ResAutServiceImpl();
/*  160 */     In997ResAut in997ResAut = generarIn997ResAut();
/*  161 */     sX12N = in997ResAutService.beanToX12N(in997ResAut);
/*  162 */     System.out.println("********* 997_RES_AUT  *************");
/*  163 */     System.out.println(sX12N);
/*      */     
/*  165 */     in997ResAut = in997ResAutService.x12NToBean(sX12N);
/*  166 */     In997ResAutComing(in997ResAut);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static InConAse270 generarConAse270() {
/*  270 */     InConAse270 inConAse270 = new InConAse270();
/*      */ 
/*      */     
/*  273 */     inConAse270.setNoTransaccion("270_CON_ASE");
/*  274 */     inConAse270.setIdRemitente("980001C        ");
/*  275 */     inConAse270.setIdReceptor("3009          ");
/*  276 */     inConAse270.setFeTransaccion("20151511");
/*  277 */     inConAse270.setHoTransaccion("152200");
/*  278 */     inConAse270.setIdCorrelativo("756496608");
/*  279 */     inConAse270.setIdTransaccion("270");
/*  280 */     inConAse270.setTiFinalidad("13");
/*  281 */     inConAse270.setCaRemitente("2");
/*  282 */     inConAse270.setNuRucRemitente("20100054184");
/*  283 */     inConAse270.setTxRequest("CO");
/*  284 */     inConAse270.setCaReceptor("2");
/*  285 */     inConAse270.setCaPaciente("1");
/*  286 */     inConAse270.setApPaternoPaciente("rengifo");
/*  287 */     inConAse270.setNoPaciente("JOSE");
/*      */     
/*  289 */     inConAse270.setCoAfPaciente("0000062408");
/*  290 */     inConAse270.setApMaternoPaciente("GUTIEREZ");
/*  291 */     inConAse270.setTiDocumento("1");
/*  292 */     inConAse270.setNuDocumento("08834001");
/*  293 */     inConAse270.setCoProducto("4");
/*  294 */     inConAse270.setDeProducto("Descripción ");
/*  295 */     inConAse270.setCoInProducto("001");
/*  296 */     inConAse270.setNuCobertura("4");
/*  297 */     inConAse270.setDeCobertura("2");
/*  298 */     inConAse270.setCaServicio("1");
/*  299 */     inConAse270.setCoCalservicio("Z3");
/*  300 */     inConAse270.setBeMaxInicial("50.9");
/*  301 */     inConAse270.setCoTiCobertura("4");
/*  302 */     inConAse270.setCoSuTiCobertura("001");
/*  303 */     inConAse270.setCoAplicativoTx("1");
/*  304 */     inConAse270.setCoEspecialidad("CO321");
/*      */     
/*  306 */     inConAse270.setCoParentesco("01");
/*  307 */     inConAse270.setNuPlan("00743621");
/*  308 */     inConAse270.setNuAutOrigen("0011223344");
/*  309 */     inConAse270.setTiAccidente("1");
/*  310 */     inConAse270.setFeAccidente("20161511");
/*  311 */     inConAse270.setTiCaContratante("2");
/*  312 */     inConAse270.setNoPaContratante("ICM PACHAPAQUI SAC");
/*  313 */     inConAse270.setNoContratante("ICM PACHAPAQUI SAC");
/*  314 */     inConAse270.setNoMaContratante("ICM PACHAPAQUI SAC");
/*  315 */     inConAse270.setTiDoContratante("6");
/*  316 */     inConAse270.setIdReContratante("XX5");
/*  317 */     inConAse270.setCoReContratante("20100973473");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  361 */     return inConAse270;
/*      */   }
/*      */ 
/*      */   
/*      */   private static InRegAfi270 generarRegafi270() {
/*  366 */     InRegAfi270 regafi270 = new InRegAfi270();
/*      */     
/*  368 */     regafi270.setNoTransaccion("270_REGAFI");
/*  369 */     regafi270.setIdRemitente("980001C        ");
/*  370 */     regafi270.setIdReceptor("SUSALUD        ");
/*  371 */     regafi270.setFeTransaccion("20150311");
/*  372 */     regafi270.setHoTransaccion("152200");
/*  373 */     regafi270.setIdCorrelativo("756496608");
/*  374 */     regafi270.setIdTransaccion("270");
/*  375 */     regafi270.setTiFinalidad("13");
/*  376 */     regafi270.setCaRemitente("2");
/*  377 */     regafi270.setNuRucRemitente("20100054184");
/*  378 */     regafi270.setCaReceptor("2");
/*  379 */     regafi270.setCaPaciente("1");
/*  380 */     regafi270.setApPaternoPaciente("");
/*  381 */     regafi270.setNoPaciente("");
/*  382 */     regafi270.setApMaternoPaciente("");
/*  383 */     regafi270.setTiDocumento("1");
/*  384 */     regafi270.setNuDocumento("41059144");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  404 */     return regafi270;
/*      */   }
/*      */   
/*      */   private static InRegAfi271 generarRegafi271() {
/*  408 */     InRegAfi271 regafi271 = new InRegAfi271();
/*  409 */     regafi271.setNoTransaccion("271_REGAFI");
/*  410 */     regafi271.setIdRemitente("SUSALUD        ");
/*  411 */     regafi271.setIdReceptor("980001C        ");
/*  412 */     regafi271.setFeTransaccion("20150311");
/*  413 */     regafi271.setHoTransaccion("152200");
/*  414 */     regafi271.setIdCorrelativo("756496608");
/*  415 */     regafi271.setIdTransaccion("271");
/*  416 */     regafi271.setTiFinalidad("11");
/*  417 */     regafi271.setCaRemitente("2");
/*  418 */     regafi271.setCaReceptor("2");
/*  419 */     regafi271.setNuRucReceptor("20100054184");
/*      */     
/*  421 */     InRegAfi271Detalle regafi271Detalle = new InRegAfi271Detalle();
/*      */     
/*  423 */     regafi271Detalle.setCaPaciente("2");
/*  424 */     regafi271Detalle.setApPaternoPaciente("BALLON");
/*  425 */     regafi271Detalle.setNoPaciente("ANGELA RITA");
/*  426 */     regafi271Detalle.setCoPaciente("0000424421");
/*  427 */     regafi271Detalle.setApMaternoPaciente("ARENAS");
/*  428 */     regafi271Detalle.setTiDocumentoPaciente("1");
/*  429 */     regafi271Detalle.setNuDocumentoPaciente("08834001");
/*  430 */     regafi271Detalle.setCoContratoPaciente("0000000751");
/*  431 */     regafi271Detalle.setEsPaciente("1");
/*  432 */     regafi271Detalle.setTiRegimenPaciente("1");
/*  433 */     regafi271Detalle.setTiPlanPaciente("2");
/*  434 */     regafi271Detalle.setCoProductoPaciente("2");
/*  435 */     regafi271Detalle.setCoPlanPaciente("1");
/*  436 */     regafi271Detalle.setNuCarnetPaciente("ID142");
/*  437 */     regafi271Detalle.setCoVinculoFamPaciente("01");
/*  438 */     regafi271Detalle.setApCasadaPaciente("AP CASADA");
/*  439 */     regafi271Detalle.setDeUbigeoPaciente("140101");
/*  440 */     regafi271Detalle.setFeNacePaciente("19610512");
/*  441 */     regafi271Detalle.setGePaciente("1");
/*  442 */     regafi271Detalle.setCoPaisPaciente("33");
/*  443 */     regafi271Detalle.setFeFallecidoPaciente("FE FACLLECIMIENTO");
/*  444 */     regafi271Detalle.setFeIniAfiliaPaciente("20040701");
/*  445 */     regafi271Detalle.setFeFinAfiliaPaciente("00000000");
/*  446 */     regafi271Detalle.setFeFinAtencionPaciente("00000000");
/*      */     
/*  448 */     regafi271Detalle.setCaAseguradora("2");
/*  449 */     regafi271Detalle.setCoAseguradora("20002");
/*      */     
/*  451 */     regafi271Detalle.setCaTitular("1");
/*  452 */     regafi271Detalle.setApPaternoTitular("APTITULAR");
/*  453 */     regafi271Detalle.setNoTitular("NOMBRE TITULAR");
/*  454 */     regafi271Detalle.setCoTitular("0000424421");
/*  455 */     regafi271Detalle.setApMaternoTitular("MATERNO TITULAR");
/*  456 */     regafi271Detalle.setTiDocumentoTitular("1");
/*  457 */     regafi271Detalle.setNuDocumentoTitular("08834001");
/*  458 */     regafi271Detalle.setCoEstablecimientoTitular("CO ESTABLECIMIENTO");
/*  459 */     regafi271Detalle.setFeFallecidoTitular("19610512");
/*  460 */     regafi271Detalle.setCoPaisTitular("33");
/*      */     
/*  462 */     regafi271Detalle.setCaContratante("2");
/*  463 */     regafi271Detalle.setApPaternoContratante("COLTUR PERUANA DE TU");
/*  464 */     regafi271Detalle.setNoContratante("COLTUR PERUANA DE TU");
/*  465 */     regafi271Detalle.setApMaternoContratante("COLTUR PERUANA DE TU");
/*  466 */     regafi271Detalle.setTiDocumentoContratante("6");
/*  467 */     regafi271Detalle.setIdReContratante("XX5");
/*  468 */     regafi271Detalle.setNuDocumentoContratante("20100973473");
/*  469 */     regafi271Detalle.setCoPaisContratante("33");
/*      */     
/*  471 */     regafi271.addDetalle(regafi271Detalle);
/*  472 */     regafi271.addDetalle(regafi271Detalle);
/*  473 */     regafi271.addDetalle(regafi271Detalle);
/*  474 */     regafi271.addDetalle(regafi271Detalle);
/*  475 */     regafi271.addDetalle(regafi271Detalle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5799 */     return regafi271;
/*      */   }
/*      */   
/*      */   private static InConNom271 generarConNom271() {
/* 5803 */     InConNom271 inConNom270 = new InConNom271();
/* 5804 */     inConNom270.setNoTransaccion("271_CON_NOM");
/* 5805 */     inConNom270.setIdRemitente("20002          ");
/* 5806 */     inConNom270.setIdReceptor("980001C        ");
/* 5807 */     inConNom270.setFeTransaccion("20150311");
/* 5808 */     inConNom270.setHoTransaccion("152200");
/* 5809 */     inConNom270.setIdCorrelativo("756496608");
/* 5810 */     inConNom270.setIdTransaccion("271");
/* 5811 */     inConNom270.setTiFinalidad("11");
/* 5812 */     inConNom270.setCaRemitente("2");
/* 5813 */     inConNom270.setCaReceptor("2");
/* 5814 */     inConNom270.setNuRucReceptor("20100054184");
/*      */ 
/*      */     
/* 5817 */     InConNom271Detalle detalle = new InConNom271Detalle();
/* 5818 */     detalle.setCaPaciente("1");
/* 5819 */     detalle.setApPaternoPaciente("BALLON");
/* 5820 */     detalle.setNoPaciente("ANGELA RITA");
/* 5821 */     detalle.setCoAfPaciente("0000424421");
/* 5822 */     detalle.setApMaternoPaciente("ARENAS");
/* 5823 */     detalle.setCoEsPaciente("1");
/* 5824 */     detalle.setTiDoPaciente("1");
/* 5825 */     detalle.setNuDoPaciente("08834001");
/* 5826 */     detalle.setNuContratoPaciente("121212");
/* 5827 */     detalle.setCoProducto("EPS");
/* 5828 */     detalle.setCoDescripcion("Descripcion");
/* 5829 */     detalle.setNuSCTR("001");
/* 5830 */     detalle.setCoParentesco("01");
/* 5831 */     detalle.setNuPlan("00743621");
/* 5832 */     detalle.setFeNacimiento("19610512");
/* 5833 */     detalle.setGenero("1");
/* 5834 */     detalle.setEsMarital("1");
/* 5835 */     detalle.setTiCaContratante("2");
/* 5836 */     detalle.setNoPaContratante("ICM PACHAPAQUI SAC");
/* 5837 */     detalle.setNoContratante("ICM PACHAPAQUI SAC");
/* 5838 */     detalle.setNoMaContratante("ICM PACHAPAQUI SAC");
/* 5839 */     detalle.setTiDoContratante("6");
/* 5840 */     detalle.setIdReContratante("XX5");
/* 5841 */     detalle.setCoReContratante("20100973473");
/* 5842 */     InConNom271Detalle detalle1 = new InConNom271Detalle();
/* 5843 */     detalle1.setCaPaciente("1");
/* 5844 */     detalle1.setApPaternoPaciente("BALLON");
/* 5845 */     detalle1.setNoPaciente("ANGELA RITA");
/* 5846 */     detalle1.setCoAfPaciente("0000424421");
/* 5847 */     detalle1.setApMaternoPaciente("ARENAS");
/* 5848 */     detalle1.setCoEsPaciente("1");
/* 5849 */     detalle1.setTiDoPaciente("1");
/* 5850 */     detalle1.setNuDoPaciente("08834001");
/* 5851 */     detalle1.setNuContratoPaciente("121212");
/* 5852 */     detalle1.setCoProducto("EPS");
/* 5853 */     detalle1.setCoDescripcion("Descripcion");
/* 5854 */     detalle1.setNuSCTR("001");
/* 5855 */     detalle1.setCoParentesco("01");
/* 5856 */     detalle1.setNuPlan("00743621");
/* 5857 */     detalle1.setFeNacimiento("19610512");
/* 5858 */     detalle1.setGenero("1");
/* 5859 */     detalle1.setEsMarital("1");
/* 5860 */     detalle1.setTiCaContratante("2");
/* 5861 */     detalle1.setNoPaContratante("ICM PACHAPAQUI SAC");
/* 5862 */     detalle1.setNoContratante("ICM PACHAPAQUI SAC");
/* 5863 */     detalle1.setNoMaContratante("ICM PACHAPAQUI SAC");
/* 5864 */     detalle1.setTiDoContratante("6");
/* 5865 */     detalle1.setIdReContratante("XX5");
/* 5866 */     detalle1.setCoReContratante("20100973473");
/*      */     
/* 5868 */     inConNom270.addDetalle(detalle);
/* 5869 */     inConNom270.addDetalle(detalle1);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5874 */     return inConNom270;
/*      */   }
/*      */ 
/*      */   
/*      */   private static InConCod271 generarConCod271() {
/* 5879 */     InConCod271 inConCod271 = new InConCod271();
/* 5880 */     inConCod271.setNoTransaccion("271_CON_COD");
/* 5881 */     inConCod271.setIdRemitente("20002          ");
/* 5882 */     inConCod271.setIdReceptor("980001C        ");
/* 5883 */     inConCod271.setFeTransaccion("20150311");
/* 5884 */     inConCod271.setHoTransaccion("152200");
/* 5885 */     inConCod271.setIdCorrelativo("756496608");
/* 5886 */     inConCod271.setIdTransaccion("271");
/* 5887 */     inConCod271.setTiFinalidad("11");
/* 5888 */     inConCod271.setCaRemitente("2");
/* 5889 */     inConCod271.setUserRemitente("USER IAFAS");
/* 5890 */     inConCod271.setPassRemitente("PASS IAFAS");
/*      */     
/* 5892 */     inConCod271.setFeUpFoto("20150607");
/* 5893 */     inConCod271.setCaReceptor("2");
/* 5894 */     inConCod271.setNuRucReceptor("20100054184");
/* 5895 */     inConCod271.setCaPaciente("1");
/* 5896 */     inConCod271.setApPaternoPaciente("RUIZ");
/* 5897 */     inConCod271.setNoPaciente("ERNESTO ANGEL");
/* 5898 */     inConCod271.setCoAfPaciente("0000424422");
/* 5899 */     inConCod271.setApMaternoPaciente("PEREZ");
/* 5900 */     inConCod271.setCoEsPaciente("1");
/* 5901 */     inConCod271.setTiDoPaciente("1");
/* 5902 */     inConCod271.setNuDoPaciente("08834001");
/* 5903 */     inConCod271.setNuIdenPaciente("00001");
/*      */     
/* 5905 */     inConCod271.setNuContratoPaciente("131313");
/* 5906 */     inConCod271.setNuPoliza("3134124314");
/* 5907 */     inConCod271.setNuCertificado("645318424");
/* 5908 */     inConCod271.setCoTiPoliza("1");
/* 5909 */     inConCod271.setCoProducto("EPS");
/* 5910 */     inConCod271.setDeProducto("Descripcion");
/* 5911 */     inConCod271.setNuPlan("00743621");
/* 5912 */     inConCod271.setTiPlanSalud("7");
/* 5913 */     inConCod271.setCoMoneda("1");
/* 5914 */     inConCod271.setCoParentesco("01");
/* 5915 */     inConCod271.setSoBeneficio("S");
/* 5916 */     inConCod271.setNuSoBeneficio("01");
/* 5917 */     inConCod271.setFeNacimiento("19900512");
/* 5918 */     inConCod271.setGenero("1");
/* 5919 */     inConCod271.setEsMarital("2");
/* 5920 */     inConCod271.setFeIniVigencia("20040701");
/* 5921 */     inConCod271.setFeFinVigencia("20040801");
/* 5922 */     inConCod271.setTiCaContratante("2");
/* 5923 */     inConCod271.setNoPaContratante("ICM PACHAPAQUI SAC");
/* 5924 */     inConCod271.setNoContratante("ICM PACHAPAQUI SAC");
/* 5925 */     inConCod271.setNoMaContratante("ICM PACHAPAQUI SAC");
/* 5926 */     inConCod271.setTiDoContratante("6");
/* 5927 */     inConCod271.setIdReContratante("XX5");
/* 5928 */     inConCod271.setCoReContratante("20100973473");
/* 5929 */     inConCod271.setCaTitular("1");
/* 5930 */     inConCod271.setNoPaTitular("MENDOZA");
/* 5931 */     inConCod271.setNoTitular("LUIS");
/* 5932 */     inConCod271.setCoAfTitular("0000424421");
/* 5933 */     inConCod271.setNoMaTitular("ARIAS");
/* 5934 */     inConCod271.setTiDoTitular("1");
/* 5935 */     inConCod271.setNuDoTitular("09834991");
/* 5936 */     inConCod271.setFeInsTitular("20040703");
/*      */ 
/*      */     
/* 5939 */     InConCod271Detalle detalle = new InConCod271Detalle();
/*      */     
/* 5941 */     detalle.setInfBeneficio("1");
/* 5942 */     detalle.setNuCobertura("4");
/* 5943 */     detalle.setBeMaxInicial("50");
/* 5944 */     detalle.setMoCobertura("0.50");
/* 5945 */     detalle.setCoInRestriccion("1 ");
/* 5946 */     detalle.setCanServicio("1");
/* 5947 */     detalle.setIdProducto("2");
/* 5948 */     detalle.setCoTiCobertura("4");
/* 5949 */     detalle.setCoSubTiCobertura("100");
/* 5950 */     detalle.setMsgObs("OBSERVACIONES");
/* 5951 */     detalle.setMsgConEspeciales("CONDICIONES ESPECIALES");
/* 5952 */     detalle.setCoTiMoneda("1");
/* 5953 */     detalle.setCoPagoFijo("60");
/* 5954 */     detalle.setCoCalServicio("Z3");
/* 5955 */     detalle.setCanCalServicio("1");
/* 5956 */     detalle.setCoPagoVariable("0.50");
/* 5957 */     detalle.setFlagCaGarantia("0");
/* 5958 */     detalle.setDeflagCaGarantia("Descripción Carta Garantía");
/* 5959 */     detalle.setFeFinCarencia("20100701");
/* 5960 */     detalle.setFeFinEspera("20040601");
/*      */ 
/*      */     
/* 5963 */     inConCod271.addDetalle(detalle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 5973 */     return inConCod271;
/*      */   }
/*      */   
/*      */   private static InConMed271 generarConMed271() {
/* 5977 */     InConMed271 inConMed271 = new InConMed271();
/*      */     
/* 5979 */     inConMed271.setNoTransaccion("271_CON_MED");
/* 5980 */     inConMed271.setIdRemitente("20002          ");
/* 5981 */     inConMed271.setIdReceptor("980001C        ");
/* 5982 */     inConMed271.setFeTransaccion("20150311");
/* 5983 */     inConMed271.setHoTransaccion("152200");
/* 5984 */     inConMed271.setIdCorrelativo("756496608");
/* 5985 */     inConMed271.setIdTransaccion("271");
/* 5986 */     inConMed271.setTiFinalidad("11");
/* 5987 */     inConMed271.setCaRemitente("2");
/* 5988 */     inConMed271.setCaReceptor("2");
/* 5989 */     inConMed271.setNuRucReceptor("20100054184");
/*      */     
/* 5991 */     inConMed271.setCaPaciente("1");
/* 5992 */     inConMed271.setApPaternoPaciente("RENGIFO");
/* 5993 */     inConMed271.setNoPaciente("JOSE");
/* 5994 */     inConMed271.setCoPaciente("0000424421");
/* 5995 */     inConMed271.setApMaternoPaciente("GUTIEREZ");
/*      */     
/* 5997 */     InConMed271Detalle inConMed271Detalle = new InConMed271Detalle();
/* 5998 */     inConMed271Detalle.setCoSeCIE10("CIE10");
/* 5999 */     inConMed271Detalle.setCoRestriccion("Pr");
/* 6000 */     inConMed271Detalle.setDePreexistencia("CONSULTA PREEXISTENCIA");
/* 6001 */     inConMed271Detalle.setMsgObsPr("OBSERVACIONES");
/* 6002 */     inConMed271Detalle.setIdFuenteRE("2");
/* 6003 */     inConMed271Detalle.setEsCobertura("1");
/* 6004 */     inConMed271Detalle.setMoDiagnostico("0.50");
/* 6005 */     inConMed271Detalle.setTiEspera("20080321");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6010 */     InConMed271Detalle inConMed271Detalle01 = new InConMed271Detalle();
/* 6011 */     inConMed271Detalle01.setCoSeCIE10("CIE10");
/* 6012 */     inConMed271Detalle01.setCoRestriccion("Ca");
/* 6013 */     inConMed271Detalle01.setDePreexistencia("CONSULTA PREEXISTENCIA");
/* 6014 */     inConMed271Detalle01.setMsgObsPr("OBSERVACIONES");
/* 6015 */     inConMed271Detalle01.setIdFuenteRE("1");
/* 6016 */     inConMed271Detalle01.setEsCobertura("1");
/* 6017 */     inConMed271Detalle01.setMoDiagnostico("0.70");
/* 6018 */     inConMed271Detalle01.setTiEspera("20084321");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6023 */     inConMed271.addDetalle(inConMed271Detalle);
/* 6024 */     inConMed271.addDetalle(inConMed271Detalle01);
/*      */ 
/*      */ 
/*      */     
/* 6028 */     return inConMed271;
/*      */   }
/*      */   
/*      */   private static In278SolCG generarIn278Sol() {
/* 6032 */     In278SolCG in278SolCG = new In278SolCG();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6052 */     in278SolCG.setNoTransaccion("278_SOL_CG");
/* 6053 */     in278SolCG.setIdRemitente("980001C");
/* 6054 */     in278SolCG.setIdReceptor("20002          ");
/* 6055 */     in278SolCG.setFeTransaccion("20150311");
/* 6056 */     in278SolCG.setHoTransaccion("152200");
/* 6057 */     in278SolCG.setIdCorrelativo("756496608");
/* 6058 */     in278SolCG.setIdTransaccion("278");
/* 6059 */     in278SolCG.setTiFinalidad("13");
/* 6060 */     in278SolCG.setCaPaciente("1");
/* 6061 */     in278SolCG.setApPaternoPaciente("");
/* 6062 */     in278SolCG.setNoPaciente("");
/* 6063 */     in278SolCG.setApMaternoPaciente("");
/* 6064 */     in278SolCG.setCoTiDoPaciente("1");
/* 6065 */     in278SolCG.setNuDoPaciente("44665159");
/* 6066 */     in278SolCG.setNuCarGarantia("11237978");
/* 6067 */     in278SolCG.setEsCarGarantia("1");
/* 6068 */     in278SolCG.setNuSoCarGarantia("");
/*      */     
/* 6070 */     return in278SolCG;
/*      */   }
/*      */ 
/*      */   
/*      */   private static In278ResCG generarIn278Res() {
/* 6075 */     In278ResCG in278ResCG = new In278ResCG();
/*      */     
/* 6077 */     in278ResCG.setNoTransaccion("278_RES_CG");
/* 6078 */     in278ResCG.setIdRemitente("20002          ");
/* 6079 */     in278ResCG.setIdReceptor("980001C");
/* 6080 */     in278ResCG.setFeTransaccion("20150311");
/* 6081 */     in278ResCG.setHoTransaccion("152200");
/* 6082 */     in278ResCG.setIdCorrelativo("756496608");
/* 6083 */     in278ResCG.setIdTransaccion("278");
/* 6084 */     in278ResCG.setTiFinalidad("11");
/* 6085 */     in278ResCG.setCaRemitente("2");
/* 6086 */     in278ResCG.setCaReceptor("2");
/* 6087 */     in278ResCG.setNuRucReceptor("20100054184");
/*      */     
/* 6089 */     In278ResCGDetalle in278ResCGDetalle = new In278ResCGDetalle();
/* 6090 */     in278ResCGDetalle.setCaPaciente("1");
/* 6091 */     in278ResCGDetalle.setApPaternoPaciente("RENGIFO");
/* 6092 */     in278ResCGDetalle.setNoPaciente("JOSE");
/* 6093 */     in278ResCGDetalle.setCoAfPaciente("0000424421");
/* 6094 */     in278ResCGDetalle.setApMaternoPaciente("GUTIEREZ");
/* 6095 */     in278ResCGDetalle.setCoTiDoPaciente("1");
/* 6096 */     in278ResCGDetalle.setNuDoPaciente("08834001");
/* 6097 */     in278ResCGDetalle.setMonPago("40");
/* 6098 */     in278ResCGDetalle.setTiCaContratante("2");
/* 6099 */     in278ResCGDetalle.setNoPaContratante("ICM PACHAPAQUI SAC");
/* 6100 */     in278ResCGDetalle.setNoContratante("ICM PACHAPAQUI SAC");
/* 6101 */     in278ResCGDetalle.setNoMaContratante("ICM PACHAPAQUI SAC");
/* 6102 */     in278ResCGDetalle.setTiDoContratante("6");
/* 6103 */     in278ResCGDetalle.setIdCaReContratante("XX5");
/* 6104 */     in278ResCGDetalle.setNuCaReContratante("20100973473");
/* 6105 */     in278ResCGDetalle.setDeCarGarantia("Descripción");
/* 6106 */     in278ResCGDetalle.setNuSoCarGarantia("123456");
/* 6107 */     in278ResCGDetalle.setNuCarGarantia("123456");
/* 6108 */     in278ResCGDetalle.setVeCarGarantia("V1");
/* 6109 */     in278ResCGDetalle.setEsCarGarantia("1");
/* 6110 */     in278ResCGDetalle.setCoProducto("EPS");
/* 6111 */     in278ResCGDetalle.setCoProcedimiento("900152");
/* 6112 */     in278ResCGDetalle.setDeProcedimiento("DESC PROCEDIMIENTO");
/*      */ 
/*      */     
/* 6115 */     in278ResCGDetalle.setNuPlan("00743621");
/* 6116 */     in278ResCGDetalle.setTiPlanSalud("7");
/* 6117 */     in278ResCGDetalle.setCoMoneda("1");
/* 6118 */     in278ResCGDetalle.setFeCarGarantia("200803210900");
/*      */ 
/*      */     
/* 6121 */     in278ResCG.addDetalle(in278ResCGDetalle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6132 */     return in278ResCG;
/*      */   }
/*      */   
/*      */   private static In271ResSctr generarIn271ResSctr() {
/* 6136 */     In271ResSctr in271ResSctr = new In271ResSctr();
/*      */     
/* 6138 */     in271ResSctr.setNoTransaccion("271_RES_SCTR");
/* 6139 */     in271ResSctr.setIdRemitente("20002          ");
/* 6140 */     in271ResSctr.setIdReceptor("980001C        ");
/* 6141 */     in271ResSctr.setFeTransaccion("20150311");
/* 6142 */     in271ResSctr.setHoTransaccion("152200");
/* 6143 */     in271ResSctr.setIdCorrelativo("756496608");
/* 6144 */     in271ResSctr.setIdTransaccion("271");
/* 6145 */     in271ResSctr.setTiFinalidad("11");
/* 6146 */     in271ResSctr.setCaRemitente("2");
/* 6147 */     in271ResSctr.setCaReceptor("2");
/* 6148 */     in271ResSctr.setNuRucReceptor("20100054184");
/* 6149 */     in271ResSctr.setCaPaciente("1");
/* 6150 */     in271ResSctr.setApPaternoPaciente("RENGIFO");
/* 6151 */     in271ResSctr.setNoPaciente("JOSE");
/* 6152 */     in271ResSctr.setCoAfPaciente("0000424421");
/* 6153 */     in271ResSctr.setApMaternoPaciente("GUTIEREZ");
/* 6154 */     in271ResSctr.setCoTiDoPaciente("1");
/* 6155 */     in271ResSctr.setNuDocPaciente("08834001");
/*      */     
/* 6157 */     In271ResSctrDetalle in271ResSctrDetalle = new In271ResSctrDetalle();
/* 6158 */     in271ResSctrDetalle.setTiCaContratante("2");
/* 6159 */     in271ResSctrDetalle.setNoEmApPaContratante("ICM PACHAPAQUI SAC");
/* 6160 */     in271ResSctrDetalle.setCoEmContratante("00001");
/* 6161 */     in271ResSctrDetalle.setIdCaReContratante("XX5");
/* 6162 */     in271ResSctrDetalle.setReIdContratante("20100973473");
/* 6163 */     in271ResSctrDetalle.setTiCaLuAtencion("2");
/* 6164 */     in271ResSctrDetalle.setNoEmLuAtencion("HOSPITAL SAN BARTOLOME");
/* 6165 */     in271ResSctrDetalle.setCoEmReLuAtencion("00001");
/* 6166 */     in271ResSctrDetalle.setIdCaReLuAtencion("XX5");
/* 6167 */     in271ResSctrDetalle.setReIdLuAtencion("20100973473");
/* 6168 */     in271ResSctrDetalle.setCoLuAtencion("471000");
/* 6169 */     in271ResSctrDetalle.setDeTiAccidente("1");
/* 6170 */     in271ResSctrDetalle.setFeAfiliacion("20080321");
/* 6171 */     in271ResSctrDetalle.setFeOcAccidente("20080321");
/*      */     
/* 6173 */     in271ResSctr.addDetalle(in271ResSctrDetalle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6182 */     return in271ResSctr;
/*      */   }
/*      */ 
/*      */   
/*      */   private static InSolAut271 generarSolAut271() {
/* 6187 */     InSolAut271 inSolAut271 = new InSolAut271();
/*      */     
/* 6189 */     inSolAut271.setNoTransaccion("271_SOL_AUT");
/* 6190 */     inSolAut271.setIdRemitente("980001C        ");
/* 6191 */     inSolAut271.setIdReceptor("20002          ");
/* 6192 */     inSolAut271.setFeTransaccion("20150311");
/* 6193 */     inSolAut271.setHoTransaccion("152200");
/* 6194 */     inSolAut271.setIdCorrelativo("756496608");
/* 6195 */     inSolAut271.setIdTransaccion("271");
/* 6196 */     inSolAut271.setTiFinalidad("13");
/* 6197 */     inSolAut271.setCaRemitente("2");
/* 6198 */     inSolAut271.setNuRucRemitente("20100054184");
/* 6199 */     inSolAut271.setCaReceptor("2");
/* 6200 */     inSolAut271.setCoAdmisionista("9876543abc");
/*      */     
/* 6202 */     inSolAut271.setCaPaciente("1");
/* 6203 */     inSolAut271.setApPaternoPaciente("RUIZ");
/* 6204 */     inSolAut271.setNoPaciente("ERNESTO ANGEL");
/* 6205 */     inSolAut271.setCoAfPaciente("0000424422");
/* 6206 */     inSolAut271.setApMaternoPaciente("PEREZ");
/* 6207 */     inSolAut271.setCoEsPaciente("1");
/* 6208 */     inSolAut271.setTiDoPaciente("1");
/* 6209 */     inSolAut271.setNuDoPaciente("08834001");
/* 6210 */     inSolAut271.setNuIdenEmpleador("00001");
/* 6211 */     inSolAut271.setNuContratoPaciente("131313");
/* 6212 */     inSolAut271.setNuPoliza("3134124314");
/* 6213 */     inSolAut271.setNuCertificado("1");
/* 6214 */     inSolAut271.setCoTiPolizaAfiliacion("1");
/* 6215 */     inSolAut271.setCoProducto("02");
/* 6216 */     inSolAut271.setDeProducto("Descripción producto");
/*      */     
/* 6218 */     inSolAut271.setNuPlan("00743621");
/* 6219 */     inSolAut271.setTiPlanSalud("7");
/* 6220 */     inSolAut271.setCoMoneda("1");
/* 6221 */     inSolAut271.setCoParentesco("01");
/* 6222 */     inSolAut271.setSoBeneficio("S");
/* 6223 */     inSolAut271.setNuSoBeneficio("01");
/* 6224 */     inSolAut271.setCoEspecialidad("CO321");
/* 6225 */     inSolAut271.setFeNacimiento("19900512");
/* 6226 */     inSolAut271.setGenero("1");
/* 6227 */     inSolAut271.setEsMarital("2");
/* 6228 */     inSolAut271.setFeIniVigencia("20040701");
/* 6229 */     inSolAut271.setFeFinVigencia("20040801");
/*      */     
/* 6231 */     inSolAut271.setEsCobertura("1");
/* 6232 */     inSolAut271.setNuDecAccidente("ACD100");
/* 6233 */     inSolAut271.setIdInfAccidente("Acc");
/* 6234 */     inSolAut271.setDeTiAccidente("ACCIDENTE PERSONAL");
/* 6235 */     inSolAut271.setFeAfiliacion("20080321");
/* 6236 */     inSolAut271.setFeOcuAccidente("20080321");
/*      */     
/* 6238 */     inSolAut271.setNuAtencion("70014");
/* 6239 */     inSolAut271.setIdDerFarmacia("Far");
/* 6240 */     inSolAut271.setTiProducto("2");
/* 6241 */     inSolAut271.setDeProductoDeFarmacia("FARMA");
/* 6242 */     inSolAut271.setFeAtencion("20091011");
/*      */     
/* 6244 */     inSolAut271.setNuCobertura("4");
/* 6245 */     inSolAut271.setObsCobertura("Obs");
/* 6246 */     inSolAut271.setMsgObs("OBSERVACIONES");
/* 6247 */     inSolAut271.setMsgConEspeciales("CONDICIONES ESPECIALES");
/*      */     
/* 6249 */     inSolAut271.setCaContratante("2");
/* 6250 */     inSolAut271.setNoPaContratante("ICM PACHAPAQUI SAC");
/* 6251 */     inSolAut271.setNoContratante("ICM PACHAPAQUI SAC");
/* 6252 */     inSolAut271.setNoMaContratante("ICM PACHAPAQUI SAC");
/* 6253 */     inSolAut271.setTiDoContratante("6");
/* 6254 */     inSolAut271.setIdReContratante("XX5");
/* 6255 */     inSolAut271.setCoReContratante("20100973473");
/*      */     
/* 6257 */     inSolAut271.setCaTitular("1");
/* 6258 */     inSolAut271.setNoPaTitular("MENDOZA");
/* 6259 */     inSolAut271.setNoTitular("LUIS");
/* 6260 */     inSolAut271.setCoAfTitular("0000424421");
/* 6261 */     inSolAut271.setNoMaTitular("ARIAS");
/* 6262 */     inSolAut271.setTiDoTitular("6");
/* 6263 */     inSolAut271.setIdReTitular("XX5");
/* 6264 */     inSolAut271.setNuDoTitular("20100973473");
/* 6265 */     inSolAut271.setFeIncTitular("20040701");
/*      */     
/* 6267 */     inSolAut271.setNuCobPreExistencia("4");
/* 6268 */     inSolAut271.setBeMaxInicial("50");
/*      */     
/* 6270 */     inSolAut271.setCanServicio("1");
/* 6271 */     inSolAut271.setIdDeProducto("2");
/* 6272 */     inSolAut271.setCoTiCobertura("4");
/* 6273 */     inSolAut271.setCoSubTiCobertura("100");
/* 6274 */     inSolAut271.setMsgObsPre("OBSERVACIONES");
/* 6275 */     inSolAut271.setMsgConEspecialesPre("CONDICIONES ESPECIALES");
/* 6276 */     inSolAut271.setCoTiMoneda("1");
/* 6277 */     inSolAut271.setCoPagoFijo("60");
/* 6278 */     inSolAut271.setCoCalServicio("Z3");
/* 6279 */     inSolAut271.setCanCalServicio("1");
/* 6280 */     inSolAut271.setCoPagoVariable("0.50");
/* 6281 */     inSolAut271.setFlagCG("0");
/* 6282 */     inSolAut271.setDeflagCG("Descricpión de C.G");
/*      */     
/* 6284 */     inSolAut271.setFeFinCarencia("20040701");
/* 6285 */     inSolAut271.setFeFinEspera("20040701");
/*      */     
/* 6287 */     InSolAutProEsp271Detalle inSolAutProEsp271Detalle = new InSolAutProEsp271Detalle();
/* 6288 */     inSolAutProEsp271Detalle.setCoInProcedimiento("66");
/* 6289 */     inSolAutProEsp271Detalle.setCoTiProConAmbulatoria("900152");
/* 6290 */     inSolAutProEsp271Detalle.setNuPlanConAmbulatoria("4");
/* 6291 */     inSolAutProEsp271Detalle.setImDeducible("60");
/* 6292 */     inSolAutProEsp271Detalle.setPoConAmbulatoria("0.50");
/* 6293 */     inSolAutProEsp271Detalle.setFrConAmbulatoria("20");
/* 6294 */     inSolAutProEsp271Detalle.setGeConAmbulatoria("1");
/* 6295 */     inSolAutProEsp271Detalle.setCaConAmbulatoria("2");
/* 6296 */     inSolAutProEsp271Detalle.setMsgConAmbulatoria("OBSERVACIONES C. AMBULATORIAS");
/* 6297 */     inSolAut271.addDetalle(inSolAutProEsp271Detalle);
/* 6298 */     inSolAut271.addDetalle(inSolAutProEsp271Detalle);
/* 6299 */     inSolAut271.addDetalle(inSolAutProEsp271Detalle);
/*      */     
/* 6301 */     InSolAutTieEsp271Detalle inSolAutTieEsp271Detalle = new InSolAutTieEsp271Detalle();
/* 6302 */     inSolAutTieEsp271Detalle.setCoTiEspera("1");
/* 6303 */     inSolAutTieEsp271Detalle.setIdTiEspera("1");
/* 6304 */     inSolAutTieEsp271Detalle.setDeTiEspera("Tiempo");
/* 6305 */     inSolAutTieEsp271Detalle.setFeFinVigenciaTiEspera("02022016");
/* 6306 */     inSolAutTieEsp271Detalle.setMsgTiEspera("TIEMPO DE ESPERA");
/* 6307 */     inSolAut271.addDetalle(inSolAutTieEsp271Detalle);
/* 6308 */     inSolAut271.addDetalle(inSolAutTieEsp271Detalle);
/*      */     
/* 6310 */     InSolAutExeCar271Detalle inSolAutExeCar271Detalle = new InSolAutExeCar271Detalle();
/* 6311 */     inSolAutExeCar271Detalle.setCoExCarencia("A74.0");
/* 6312 */     inSolAutExeCar271Detalle.setIdExCarencia("Car");
/* 6313 */     inSolAutExeCar271Detalle.setDeExCarencia("DESCRIPCION EXCEPCION CARENCIA");
/* 6314 */     inSolAutExeCar271Detalle.setMsgExCarencia("OBSERVACIONES EC");
/* 6315 */     inSolAut271.addDetalle(inSolAutExeCar271Detalle);
/* 6316 */     inSolAut271.addDetalle(inSolAutExeCar271Detalle);
/* 6317 */     inSolAut271.addDetalle(inSolAutExeCar271Detalle);
/* 6318 */     inSolAut271.addDetalle(inSolAutExeCar271Detalle);
/*      */     
/* 6320 */     InSolAutRes271Detalle inSolAut271Detalle = new InSolAutRes271Detalle();
/* 6321 */     inSolAut271Detalle.setCIE10Restricciones("CIE10");
/* 6322 */     inSolAut271Detalle.setIdRestricciones("Pr");
/* 6323 */     inSolAut271Detalle.setObsRestricciones("OBSERVACION DIAGNOSTICO");
/* 6324 */     inSolAut271Detalle.setDeRestricciones("DESCRIPCION EXCLUSIONES");
/* 6325 */     inSolAut271Detalle.setMsgRestricciones("OBSERVACIONES Restricciones");
/* 6326 */     inSolAut271Detalle.setMonTopeRestricciones("80");
/* 6327 */     inSolAut271Detalle.setFeFinEsperaRestricciones("20040702");
/* 6328 */     inSolAut271.addDetalle(inSolAut271Detalle);
/* 6329 */     inSolAut271.addDetalle(inSolAut271Detalle);
/*      */ 
/*      */     
/* 6332 */     inSolAut271.setCaRegafi("1");
/* 6333 */     inSolAut271.setNoPaRegafi("BALLON");
/* 6334 */     inSolAut271.setNoRegafi("ANGELA RITA");
/* 6335 */     inSolAut271.setCoAfRegafi("0000424422");
/* 6336 */     inSolAut271.setNoMaRegafi("CUEVA");
/* 6337 */     inSolAut271.setTiDoRegafi("1");
/* 6338 */     inSolAut271.setIdReRegafi("A4");
/* 6339 */     inSolAut271.setNuDoRegafi("08834001");
/* 6340 */     inSolAut271.setFeNaRegafi("19610512");
/* 6341 */     inSolAut271.setGeRegafi("1");
/* 6342 */     inSolAut271.setCoPaisRegafi("33");
/*      */     
/* 6344 */     return inSolAut271;
/*      */   }
/*      */   
/*      */   private static InConProc271 generarIn271ConProc() {
/* 6348 */     InConProc271 inConProc271 = new InConProc271();
/*      */     
/* 6350 */     inConProc271.setNoTransaccion("271_CON_PROC");
/* 6351 */     inConProc271.setIdRemitente("20002          ");
/* 6352 */     inConProc271.setIdReceptor("980001C        ");
/* 6353 */     inConProc271.setFeTransaccion("20150311");
/* 6354 */     inConProc271.setHoTransaccion("152200");
/* 6355 */     inConProc271.setIdCorrelativo("756496608");
/* 6356 */     inConProc271.setIdTransaccion("271");
/* 6357 */     inConProc271.setTiFinalidad("11");
/* 6358 */     inConProc271.setCaRemitente("2");
/* 6359 */     inConProc271.setCaReceptor("2");
/* 6360 */     inConProc271.setNuRucReceptor("20100054184");
/* 6361 */     inConProc271.setCaPaciente("1");
/* 6362 */     inConProc271.setApPaternoPaciente("RENGIFO");
/* 6363 */     inConProc271.setNoPaciente("JOSE");
/* 6364 */     inConProc271.setCoAfPaciente("0000424421");
/* 6365 */     inConProc271.setApMaternoPaciente("GUTIEREZ");
/*      */     
/* 6367 */     InConProc271Detalle inConProc271Detalle = new InConProc271Detalle();
/* 6368 */     inConProc271Detalle.setCoInProcedimiento("66");
/* 6369 */     inConProc271Detalle.setCoInRestriccion("Y0");
/* 6370 */     inConProc271Detalle.setCoProcedimiento("900152");
/* 6371 */     inConProc271Detalle.setImDeducible("60");
/* 6372 */     inConProc271Detalle.setPoCuExDecimal("0.50");
/* 6373 */     inConProc271Detalle.setNuFrecuencia("20");
/* 6374 */     inConProc271Detalle.setCoSexo("1");
/* 6375 */     inConProc271Detalle.setTiNuDias("1");
/* 6376 */     inConProc271Detalle.setTeMsgObservacion("Observaciones PE");
/* 6377 */     inConProc271Detalle.setIdFuentePE("1");
/* 6378 */     inConProc271Detalle.setCoTiEspera("B30.9");
/* 6379 */     inConProc271Detalle.setDeTiEspera("DESCRIPCION TIEMPO DE ESPERA");
/* 6380 */     inConProc271Detalle.setFeFinVigencia("00000000");
/* 6381 */     inConProc271Detalle.setTeMsgTiEspera("OBSERVACIONES TE");
/* 6382 */     inConProc271Detalle.setIdFuenteTE("2");
/* 6383 */     inConProc271Detalle.setCoExCarencia("A74.0");
/* 6384 */     inConProc271Detalle.setDeExCarencia("DESCRIPCION EXCEPCION A LA CARENCIA");
/* 6385 */     inConProc271Detalle.setTeMsgExCarencia("OBSERVACIONES EC");
/* 6386 */     inConProc271Detalle.setIdFuenteEC("1");
/*      */     
/* 6388 */     inConProc271.addDetalle(inConProc271Detalle);
/* 6389 */     inConProc271.addDetalle(inConProc271Detalle);
/* 6390 */     inConProc271.addDetalle(inConProc271Detalle);
/* 6391 */     inConProc271.addDetalle(inConProc271Detalle);
/* 6392 */     inConProc271.addDetalle(inConProc271Detalle);
/* 6393 */     inConProc271.addDetalle(inConProc271Detalle);
/*      */     
/* 6395 */     return inConProc271;
/*      */   }
/*      */   
/*      */   private static In997ResAut generarIn997ResAut() {
/* 6399 */     In997ResAut in997ResAut = new In997ResAut();
/*      */     
/* 6401 */     in997ResAut.setNoTransaccion("997_RES_AUT");
/* 6402 */     in997ResAut.setIdRemitente("20002          ");
/* 6403 */     in997ResAut.setIdReceptor("980001C");
/* 6404 */     in997ResAut.setFeTransaccion("20150311");
/* 6405 */     in997ResAut.setHoTransaccion("152200");
/* 6406 */     in997ResAut.setIdCorrelativo("756496608");
/* 6407 */     in997ResAut.setIdTransaccion("997");
/* 6408 */     in997ResAut.setNuAutorizacion("0001234");
/* 6409 */     in997ResAut.setCoSeguridad("09ab");
/* 6410 */     in997ResAut.setCoError("A");
/* 6411 */     in997ResAut.setInCoErrorEncontrado("1");
/*      */     
/* 6413 */     return in997ResAut;
/*      */   }
/*      */   
/*      */   private static In271ConObs generarIn271ConObs() {
/* 6417 */     In271ConObs in271ConObs = new In271ConObs();
/*      */     
/* 6419 */     in271ConObs.setNoTransaccion("271_CON_OBS");
/* 6420 */     in271ConObs.setIdRemitente("20002          ");
/* 6421 */     in271ConObs.setIdReceptor("980001C        ");
/* 6422 */     in271ConObs.setFeTransaccion("20150311");
/* 6423 */     in271ConObs.setHoTransaccion("152200");
/* 6424 */     in271ConObs.setIdCorrelativo("756496608");
/* 6425 */     in271ConObs.setIdTransaccion("271");
/* 6426 */     in271ConObs.setTiFinalidad("11");
/* 6427 */     in271ConObs.setCaRemitente("2");
/* 6428 */     in271ConObs.setCaReceptor("2");
/* 6429 */     in271ConObs.setNuRucReceptor("20100054184");
/* 6430 */     in271ConObs.setCaPaciente("1");
/* 6431 */     in271ConObs.setApPaternoPaciente("RENGIFO");
/* 6432 */     in271ConObs.setNoPaciente("JOSE");
/* 6433 */     in271ConObs.setCoAfPaciente("0000424421");
/* 6434 */     in271ConObs.setApMaternoPaciente("GUTIEREZ");
/* 6435 */     in271ConObs.setCoSubCobertura("4");
/* 6436 */     in271ConObs.setTeMsgLibre1("1");
/* 6437 */     in271ConObs.setTeMsgLibre2("OBSERVACIÓN COND. ESPECIALES");
/*      */     
/* 6439 */     return in271ConObs;
/*      */   }
/*      */   
/*      */   private static InConEntVinc278 generarInSolEntVinc278() {
/* 6443 */     InConEntVinc278 inSolEntVinc278 = new InConEntVinc278();
/*      */     
/* 6445 */     inSolEntVinc278.setNoTransaccion("278_CON_ENT_VINC");
/* 6446 */     inSolEntVinc278.setIdRemitente("980001C        ");
/* 6447 */     inSolEntVinc278.setIdReceptor("20002          ");
/* 6448 */     inSolEntVinc278.setFeTransaccion("20150311");
/* 6449 */     inSolEntVinc278.setHoTransaccion("152200");
/* 6450 */     inSolEntVinc278.setIdCorrelativo("756496608");
/* 6451 */     inSolEntVinc278.setIdTransaccion("278");
/* 6452 */     inSolEntVinc278.setTiFinalidad("13");
/*      */     
/* 6454 */     inSolEntVinc278.setCaIPRESS("2");
/* 6455 */     inSolEntVinc278.setNoIPRESS("CLINICA RICARDO PALMA");
/* 6456 */     inSolEntVinc278.setTiDoIPRESS("6");
/* 6457 */     inSolEntVinc278.setNuRucIPRESS("20100121809");
/*      */     
/* 6459 */     return inSolEntVinc278;
/*      */   }
/*      */   
/*      */   private static InResEntVinc278 generarInResEntVinc278() {
/* 6463 */     InResEntVinc278 inResEntVinc278 = new InResEntVinc278();
/*      */     
/* 6465 */     inResEntVinc278.setNoTransaccion("278_RES_ENT_VINC");
/* 6466 */     inResEntVinc278.setIdRemitente("20002          ");
/* 6467 */     inResEntVinc278.setIdReceptor("980001C");
/* 6468 */     inResEntVinc278.setFeTransaccion("20150311");
/* 6469 */     inResEntVinc278.setHoTransaccion("152200");
/* 6470 */     inResEntVinc278.setIdCorrelativo("756496608");
/* 6471 */     inResEntVinc278.setIdTransaccion("278");
/* 6472 */     inResEntVinc278.setTiFinalidad("11");
/*      */     
/* 6474 */     inResEntVinc278.setRespuesta("Y");
/* 6475 */     inResEntVinc278.setMsgRespuesta("Mensaje Entidad Vinculada");
/*      */     
/* 6477 */     return inResEntVinc278;
/*      */   }
/*      */ 
/*      */   
/*      */   private static InLogAcreInsert271 generarLogAcreInsert271() {
/* 6482 */     InLogAcreInsert271 inLogAcreInsert271 = new InLogAcreInsert271();
/*      */     
/* 6484 */     inLogAcreInsert271.setNoTransaccion("271_LOG_ACRE_INSERT");
/* 6485 */     inLogAcreInsert271.setIdRemitente("980001C        ");
/* 6486 */     inLogAcreInsert271.setIdReceptor("SUSALUD        ");
/* 6487 */     inLogAcreInsert271.setFeTransaccion("20150311");
/* 6488 */     inLogAcreInsert271.setHoTransaccion("152200");
/* 6489 */     inLogAcreInsert271.setIdCorrelativo("756496608");
/* 6490 */     inLogAcreInsert271.setIdTransaccion("271");
/* 6491 */     inLogAcreInsert271.setTiFinalidad("13");
/* 6492 */     inLogAcreInsert271.setCaRemitente("2");
/* 6493 */     inLogAcreInsert271.setNuRucRemitente("20100054184");
/* 6494 */     inLogAcreInsert271.setCaReceptor("2");
/*      */     
/* 6496 */     inLogAcreInsert271.setCaPaciente("1");
/* 6497 */     inLogAcreInsert271.setApPaternoPaciente("RUIZ");
/* 6498 */     inLogAcreInsert271.setNoPaciente("JOSE");
/* 6499 */     inLogAcreInsert271.setCoAfPaciente("0000424421");
/* 6500 */     inLogAcreInsert271.setApMaternoPaciente("GUTIEREZ");
/* 6501 */     inLogAcreInsert271.setCoEsPaciente("6");
/* 6502 */     inLogAcreInsert271.setTiDoPaciente("1");
/* 6503 */     inLogAcreInsert271.setNuDoPaciente("08834001");
/* 6504 */     inLogAcreInsert271.setNuContratoPaciente("0000000751");
/* 6505 */     inLogAcreInsert271.setCoTiPolizaAfiliacion("1");
/* 6506 */     inLogAcreInsert271.setCoProducto("02");
/* 6507 */     inLogAcreInsert271.setNuPlan("00743621");
/* 6508 */     inLogAcreInsert271.setCoParentesco("01");
/* 6509 */     inLogAcreInsert271.setFeNacimiento("19610512");
/* 6510 */     inLogAcreInsert271.setGenero("1");
/* 6511 */     inLogAcreInsert271.setFeIniVigencia("20040701");
/*      */     
/* 6513 */     inLogAcreInsert271.setNuCobertura("4");
/* 6514 */     inLogAcreInsert271.setDeCobertura("Descripción Producto");
/*      */     
/* 6516 */     inLogAcreInsert271.setCaContratante("1");
/* 6517 */     inLogAcreInsert271.setTiDoContratante("1");
/* 6518 */     inLogAcreInsert271.setIdReContratante("XX5");
/* 6519 */     inLogAcreInsert271.setRucContratante("20100054184");
/*      */     
/* 6521 */     inLogAcreInsert271.setCoAfiliadoTitular("0000424421");
/*      */     
/* 6523 */     inLogAcreInsert271.setCaResponsableAut("1");
/* 6524 */     inLogAcreInsert271.setNoPaResponsableAut("AP PATERNO AUTORIZA");
/* 6525 */     inLogAcreInsert271.setNoResponsableAut("JOSE");
/* 6526 */     inLogAcreInsert271.setNoMaResponsableAut("AP MATERNO AUTORIZA");
/* 6527 */     inLogAcreInsert271.setTiDoResponsableAut("1");
/* 6528 */     inLogAcreInsert271.setNuDoResponsableAut("90844362");
/* 6529 */     inLogAcreInsert271.setNuAutorizacion("0011223344");
/* 6530 */     inLogAcreInsert271.setFeHoAutorizacion("201501202000");
/* 6531 */     inLogAcreInsert271.setBeMaxInicial("50");
/* 6532 */     inLogAcreInsert271.setCoPagoFijo("60");
/* 6533 */     inLogAcreInsert271.setCoPagoVariable("0.50");
/* 6534 */     inLogAcreInsert271.setFlagCartaGarantia("0");
/* 6535 */     inLogAcreInsert271.setDeFlagCartaGarantia("Descripción de C.G");
/*      */     
/* 6537 */     return inLogAcreInsert271;
/*      */   }
/*      */   
/*      */   private static In271ConDtad generarIn271ConDtad() {
/* 6541 */     In271ConDtad in271ConDtad = new In271ConDtad();
/*      */     
/* 6543 */     in271ConDtad.setNoTransaccion("271_Con_Dtad");
/* 6544 */     in271ConDtad.setIdRemitente("20002          ");
/* 6545 */     in271ConDtad.setIdReceptor("980001C        ");
/* 6546 */     in271ConDtad.setFeTransaccion("20150311");
/* 6547 */     in271ConDtad.setHoTransaccion("152200");
/* 6548 */     in271ConDtad.setIdCorrelativo("756496608");
/* 6549 */     in271ConDtad.setIdTransaccion("271");
/* 6550 */     in271ConDtad.setTiFinalidad("11");
/* 6551 */     in271ConDtad.setCaRemitente("2");
/* 6552 */     in271ConDtad.setCaReceptor("2");
/* 6553 */     in271ConDtad.setNuRucReceptor("20100054184");
/* 6554 */     in271ConDtad.setCaPaciente("1");
/* 6555 */     in271ConDtad.setApPaternoPaciente("RENGIFO");
/* 6556 */     in271ConDtad.setNoPaciente("JOSE");
/* 6557 */     in271ConDtad.setCoAfPaciente("0000424421");
/* 6558 */     in271ConDtad.setApMaternoPaciente("GUTIEREZ");
/* 6559 */     in271ConDtad.setDeDirPaciente1("Dirección 1");
/* 6560 */     in271ConDtad.setDeDirPaciente2("Dirección 2");
/* 6561 */     in271ConDtad.setCoUbigeoPaciente("140101");
/* 6562 */     in271ConDtad.setNoContacto("Juan Pérez");
/* 6563 */     in271ConDtad.setEmContacto("email@email.com");
/* 6564 */     in271ConDtad.setNuTeContacto("2581296");
/* 6565 */     in271ConDtad.setTiCaCalificador("1");
/* 6566 */     in271ConDtad.setApPaNoEmCalificador("BALLON");
/* 6567 */     in271ConDtad.setNoEmCalificador("ANGELA RITA");
/* 6568 */     in271ConDtad.setApMaCalificador("ARENAS");
/*      */     
/* 6570 */     return in271ConDtad;
/*      */   }
/*      */   
/*      */   private static In271ResDeriva generarIn271ResDeriva() {
/* 6574 */     In271ResDeriva in271ResDeriva = new In271ResDeriva();
/*      */     
/* 6576 */     in271ResDeriva.setNoTransaccion("271_CON_PROC");
/* 6577 */     in271ResDeriva.setIdRemitente("20002          ");
/* 6578 */     in271ResDeriva.setIdReceptor("980001C        ");
/* 6579 */     in271ResDeriva.setFeTransaccion("20150311");
/* 6580 */     in271ResDeriva.setHoTransaccion("152200");
/* 6581 */     in271ResDeriva.setIdCorrelativo("756496608");
/* 6582 */     in271ResDeriva.setIdTransaccion("271");
/* 6583 */     in271ResDeriva.setTiFinalidad("11");
/* 6584 */     in271ResDeriva.setCaRemitente("2");
/* 6585 */     in271ResDeriva.setCaReceptor("2");
/* 6586 */     in271ResDeriva.setNuRucReceptor("20100054184");
/*      */     
/* 6588 */     In271ResDerivaDetalle in271ResDerivaDetalle = new In271ResDerivaDetalle();
/* 6589 */     in271ResDerivaDetalle.setCaPaciente("1");
/* 6590 */     in271ResDerivaDetalle.setApPaternoPaciente("RENGIFO");
/* 6591 */     in271ResDerivaDetalle.setNoPaciente("JOSE");
/* 6592 */     in271ResDerivaDetalle.setCoAfPaciente("0000424421");
/* 6593 */     in271ResDerivaDetalle.setApMaternoPaciente("GUTIEREZ");
/* 6594 */     in271ResDerivaDetalle.setCoTiDoPaciente("1");
/* 6595 */     in271ResDerivaDetalle.setNuDoPaciente("08834001");
/* 6596 */     in271ResDerivaDetalle.setCoParentesco("3");
/* 6597 */     in271ResDerivaDetalle.setTiDoTrabajoAfiliado("2");
/* 6598 */     in271ResDerivaDetalle.setNuDoTrabajoAfiliado("012345678790");
/*      */     
/* 6600 */     in271ResDerivaDetalle.setNuAtencion("70014");
/* 6601 */     in271ResDerivaDetalle.setTeMsgLibre1("OBSERVACION ATENCIÓN");
/* 6602 */     in271ResDerivaDetalle.setCoTiProducto("2");
/* 6603 */     in271ResDerivaDetalle.setDeProducto("DESCRIPCIÓN");
/* 6604 */     in271ResDerivaDetalle.setCoTiCobertura("4");
/* 6605 */     in271ResDerivaDetalle.setCoSubTiCobertura("100");
/* 6606 */     in271ResDerivaDetalle.setFeAtSalud("20080321");
/* 6607 */     in271ResDerivaDetalle.setNoLuAtencion("HOSPITAL SAN BARTOLOME");
/* 6608 */     in271ResDerivaDetalle.setCoLuAtencion("980001C");
/* 6609 */     in271ResDerivaDetalle.setTiDoContratante("6");
/* 6610 */     in271ResDerivaDetalle.setIdCaReferencia("XX5");
/* 6611 */     in271ResDerivaDetalle.setReIdContratante("20100973473");
/*      */     
/* 6613 */     in271ResDeriva.addDetalle(in271ResDerivaDetalle);
/* 6614 */     in271ResDeriva.addDetalle(in271ResDerivaDetalle);
/* 6615 */     in271ResDeriva.addDetalle(in271ResDerivaDetalle);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 6643 */     return in271ResDeriva;
/*      */   }
/*      */   
/*      */   private static void InConAse270coming(InConAse270 inConAse270) {
/* 6647 */     System.out.println("-----------Data Entrante-----------");
/* 6648 */     System.out.println("noTransaccion :" + inConAse270.getNoTransaccion());
/* 6649 */     System.out.println("idRemitente :" + inConAse270.getIdRemitente());
/* 6650 */     System.out.println("idReceptor :" + inConAse270.getIdReceptor());
/* 6651 */     System.out.println("feTransaccion :" + inConAse270.getFeTransaccion());
/* 6652 */     System.out.println("hoTransaccion :" + inConAse270.getHoTransaccion());
/* 6653 */     System.out.println("idCorrelativo :" + inConAse270.getIdCorrelativo());
/* 6654 */     System.out.println("idTransaccion :" + inConAse270.getIdTransaccion());
/* 6655 */     System.out.println("tiFinalidad :" + inConAse270.getTiFinalidad());
/* 6656 */     System.out.println("caRemitente :" + inConAse270.getCaRemitente());
/* 6657 */     System.out.println("nuRucRemitente :" + inConAse270.getNuRucRemitente());
/* 6658 */     System.out.println("txRequest :" + inConAse270.getTxRequest());
/* 6659 */     System.out.println("caReceptor :" + inConAse270.getCaReceptor());
/* 6660 */     System.out.println("caPaciente :" + inConAse270.getCaPaciente());
/* 6661 */     System.out.println("apPaternoPaciente :" + inConAse270.getApPaternoPaciente());
/* 6662 */     System.out.println("noPaciente :" + inConAse270.getNoPaciente());
/*      */     
/* 6664 */     System.out.println("coAfPaciente :" + inConAse270.getCoAfPaciente());
/* 6665 */     System.out.println("apMaternoPaciente :" + inConAse270.getApMaternoPaciente());
/* 6666 */     System.out.println("tiDoPaciente :" + inConAse270.getTiDocumento());
/* 6667 */     System.out.println("nuDoPaciente :" + inConAse270.getNuDocumento());
/* 6668 */     System.out.println("coProducto :" + inConAse270.getCoProducto());
/* 6669 */     System.out.println("deProducto :" + inConAse270.getDeProducto());
/* 6670 */     System.out.println("coInProducto :" + inConAse270.getCoInProducto());
/* 6671 */     System.out.println("nuCobertura :" + inConAse270.getNuCobertura());
/* 6672 */     System.out.println("deCobertura :" + inConAse270.getDeCobertura());
/* 6673 */     System.out.println("caServicio :" + inConAse270.getCaServicio());
/* 6674 */     System.out.println("coCalservicio :" + inConAse270.getCoCalservicio());
/* 6675 */     System.out.println("beMaxInicial :" + inConAse270.getBeMaxInicial());
/* 6676 */     System.out.println("coTiCobertura :" + inConAse270.getCoTiCobertura());
/* 6677 */     System.out.println("coSuTiCobertura :" + inConAse270.getCoSuTiCobertura());
/* 6678 */     System.out.println("coAplicativoTx :" + inConAse270.getCoAplicativoTx());
/* 6679 */     System.out.println("coEspecialidad :" + inConAse270.getCoEspecialidad());
/*      */     
/* 6681 */     System.out.println("coParentesco :" + inConAse270.getCoParentesco());
/* 6682 */     System.out.println("nuPlan :" + inConAse270.getNuPlan());
/* 6683 */     System.out.println("nuAutOrigen :" + inConAse270.getNuAutOrigen());
/* 6684 */     System.out.println("tiAccidente :" + inConAse270.getTiAccidente());
/* 6685 */     System.out.println("feAccidente :" + inConAse270.getFeAccidente());
/* 6686 */     System.out.println("tiCaContratante :" + inConAse270.getTiCaContratante());
/* 6687 */     System.out.println("noPaContratante :" + inConAse270.getNoPaContratante());
/* 6688 */     System.out.println("noContratante:" + inConAse270.getNoContratante());
/* 6689 */     System.out.println("noMaContratante :" + inConAse270.getNoMaContratante());
/* 6690 */     System.out.println("tiDoContratante :" + inConAse270.getTiDoContratante());
/* 6691 */     System.out.println("idReContratante :" + inConAse270.getIdReContratante());
/* 6692 */     System.out.println("coReContratante :" + inConAse270.getCoReContratante());
/*      */   }
/*      */   
/*      */   private static void InConNom271coming(InConNom271 inConNom271) {
/* 6696 */     System.out.println("-----------Data Entrante-----------");
/* 6697 */     System.out.println("noTransaccion :" + inConNom271.getNoTransaccion());
/* 6698 */     System.out.println("idRemitente :" + inConNom271.getIdRemitente());
/* 6699 */     System.out.println("idReceptor :" + inConNom271.getIdReceptor());
/* 6700 */     System.out.println("feTransaccion :" + inConNom271.getFeTransaccion());
/* 6701 */     System.out.println("hoTransaccion :" + inConNom271.getHoTransaccion());
/* 6702 */     System.out.println("idCorrelativo :" + inConNom271.getIdCorrelativo());
/* 6703 */     System.out.println("idTransaccion :" + inConNom271.getIdTransaccion());
/* 6704 */     System.out.println("tiFinalidad :" + inConNom271.getTiFinalidad());
/* 6705 */     System.out.println("caRemitente :" + inConNom271.getCaRemitente());
/* 6706 */     System.out.println("caReceptor :" + inConNom271.getCaReceptor());
/* 6707 */     System.out.println("nuRucReceptor :" + inConNom271.getNuRucReceptor());
/*      */     
/* 6709 */     for (int i = 0; i < inConNom271.getDetalles().size(); i++) {
/* 6710 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 6711 */       System.out.println("caPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCaPaciente());
/* 6712 */       System.out.println("apPaternoPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getApPaternoPaciente());
/* 6713 */       System.out.println("noPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNoPaciente());
/* 6714 */       System.out.println("coAfPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoAfPaciente());
/* 6715 */       System.out.println("apMaternoPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getApMaternoPaciente());
/* 6716 */       System.out.println("coEsPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoEsPaciente());
/* 6717 */       System.out.println("tiDoPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getTiDoPaciente());
/* 6718 */       System.out.println("nuDoPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNuDoPaciente());
/* 6719 */       System.out.println("nuContratoPaciente :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNuContratoPaciente());
/* 6720 */       System.out.println("coProducto :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoProducto());
/* 6721 */       System.out.println("coDescripcion :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoDescripcion());
/* 6722 */       System.out.println("nuSCTR :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNuSCTR());
/* 6723 */       System.out.println("coParentesco :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoParentesco());
/* 6724 */       System.out.println("nuPlan :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNuPlan());
/* 6725 */       System.out.println("feNacimiento :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getFeNacimiento());
/* 6726 */       System.out.println("sexo :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getGenero());
/* 6727 */       System.out.println("esMarital :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getEsMarital());
/* 6728 */       System.out.println("tiCaContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getTiCaContratante());
/* 6729 */       System.out.println("noPaContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNoPaContratante());
/* 6730 */       System.out.println("noContratant :e" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNoContratante());
/* 6731 */       System.out.println("noMaContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getNoMaContratante());
/* 6732 */       System.out.println("tiDoContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getTiDoContratante());
/* 6733 */       System.out.println("idReContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getIdReContratante());
/* 6734 */       System.out.println("coReContratante :" + ((InConNom271Detalle)inConNom271.getDetalles().get(i)).getCoReContratante());
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void InConCod271coming(InConCod271 inConCod271) {
/* 6739 */     System.out.println("-----------Data Entrante-----------");
/* 6740 */     System.out.println("noTransaccion :" + inConCod271.getNoTransaccion());
/* 6741 */     System.out.println("idRemitente :" + inConCod271.getIdRemitente());
/* 6742 */     System.out.println("idReceptor :" + inConCod271.getIdReceptor());
/* 6743 */     System.out.println("feTransaccion :" + inConCod271.getFeTransaccion());
/* 6744 */     System.out.println("hoTransaccion :" + inConCod271.getHoTransaccion());
/* 6745 */     System.out.println("idCorrelativo :" + inConCod271.getIdCorrelativo());
/* 6746 */     System.out.println("idTransaccion :" + inConCod271.getIdTransaccion());
/* 6747 */     System.out.println("tiFinalidad :" + inConCod271.getTiFinalidad());
/* 6748 */     System.out.println("caRemitente :" + inConCod271.getCaRemitente());
/* 6749 */     System.out.println("userRemitente :" + inConCod271.getUserRemitente());
/* 6750 */     System.out.println("passRemitente :" + inConCod271.getPassRemitente());
/*      */     
/* 6752 */     System.out.println("feUpFoto :" + inConCod271.getFeUpFoto());
/* 6753 */     System.out.println("caReceptor :" + inConCod271.getCaReceptor());
/* 6754 */     System.out.println("nuRucReceptor :" + inConCod271.getNuRucReceptor());
/* 6755 */     System.out.println("caPaciente :" + inConCod271.getCaPaciente());
/* 6756 */     System.out.println("apPaternoPaciente :" + inConCod271.getApPaternoPaciente());
/* 6757 */     System.out.println("noPaciente :" + inConCod271.getNoPaciente());
/* 6758 */     System.out.println("coAfPaciente :" + inConCod271.getCoAfPaciente());
/* 6759 */     System.out.println("apMaternoPaciente :" + inConCod271.getApMaternoPaciente());
/* 6760 */     System.out.println("coEsPaciente :" + inConCod271.getCoEsPaciente());
/* 6761 */     System.out.println("tiDoPaciente :" + inConCod271.getTiDoPaciente());
/* 6762 */     System.out.println("nuDoPaciente :" + inConCod271.getNuDoPaciente());
/* 6763 */     System.out.println("nuIdenPaciente :" + inConCod271.getNuIdenPaciente());
/* 6764 */     System.out.println("nuContratoPaciente :" + inConCod271.getNuContratoPaciente());
/* 6765 */     System.out.println("nuPoliza :" + inConCod271.getNuPoliza());
/* 6766 */     System.out.println("nuCertificado :" + inConCod271.getNuCertificado());
/* 6767 */     System.out.println("coTiPoliza :" + inConCod271.getCoTiPoliza());
/* 6768 */     System.out.println("coProducto :" + inConCod271.getCoProducto());
/* 6769 */     System.out.println("deProducto :" + inConCod271.getDeProducto());
/* 6770 */     System.out.println("nuPlan :" + inConCod271.getNuPlan());
/* 6771 */     System.out.println("tiPlanSalud :" + inConCod271.getTiPlanSalud());
/* 6772 */     System.out.println("coMoneda :" + inConCod271.getCoMoneda());
/* 6773 */     System.out.println("coParentesco :" + inConCod271.getCoParentesco());
/* 6774 */     System.out.println("soBeneficio :" + inConCod271.getSoBeneficio());
/* 6775 */     System.out.println("nuSoBeneficio :" + inConCod271.getNuSoBeneficio());
/* 6776 */     System.out.println("feNacimiento :" + inConCod271.getFeNacimiento());
/* 6777 */     System.out.println("sexo :" + inConCod271.getGenero());
/* 6778 */     System.out.println("esMarital :" + inConCod271.getEsMarital());
/* 6779 */     System.out.println("feIniVigencia :" + inConCod271.getFeIniVigencia());
/* 6780 */     System.out.println("feFinVigencia :" + inConCod271.getFeFinVigencia());
/* 6781 */     System.out.println("tiCaContratante :" + inConCod271.getTiCaContratante());
/* 6782 */     System.out.println("noPaContratante :" + inConCod271.getNoPaContratante());
/* 6783 */     System.out.println("noContratant :e" + inConCod271.getNoContratante());
/* 6784 */     System.out.println("noMaContratante :" + inConCod271.getNoMaContratante());
/* 6785 */     System.out.println("tiDoContratante :" + inConCod271.getTiDoContratante());
/* 6786 */     System.out.println("idReContratante :" + inConCod271.getIdReContratante());
/* 6787 */     System.out.println("coReContratante :" + inConCod271.getCoReContratante());
/* 6788 */     System.out.println("caTitular :" + inConCod271.getCaTitular());
/* 6789 */     System.out.println("noPaTitular :" + inConCod271.getNoPaTitular());
/* 6790 */     System.out.println("noTitular :" + inConCod271.getNoTitular());
/* 6791 */     System.out.println("coAfTitular :" + inConCod271.getCoAfTitular());
/* 6792 */     System.out.println("noMaTitular :" + inConCod271.getNoMaTitular());
/* 6793 */     System.out.println("tiDoTitular :" + inConCod271.getTiDoTitular());
/* 6794 */     System.out.println("nuDoTitular :" + inConCod271.getNuDoTitular());
/* 6795 */     System.out.println("feInsTitular :" + inConCod271.getFeInsTitular());
/*      */     
/* 6797 */     for (int i = 0; i < inConCod271.getDetalles().size(); i++) {
/* 6798 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/*      */       
/* 6800 */       System.out.println("InfBeneficio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getInfBeneficio());
/* 6801 */       System.out.println("nuCobertura :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getNuCobertura());
/* 6802 */       System.out.println("beMaxInicial :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getBeMaxInicial());
/* 6803 */       System.out.println("moCobertura :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getMoCobertura());
/* 6804 */       System.out.println("coInResticcion :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoInRestriccion());
/* 6805 */       System.out.println("canServicio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCanServicio());
/* 6806 */       System.out.println("idProducto :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getIdProducto());
/* 6807 */       System.out.println("coTiCobertura :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoTiCobertura());
/* 6808 */       System.out.println("coSubTiProducto :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoSubTiCobertura());
/* 6809 */       System.out.println("msgObs :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getMsgObs());
/* 6810 */       System.out.println("msgConEspeciales :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getMsgConEspeciales());
/* 6811 */       System.out.println("coTiMoneda :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoTiMoneda());
/* 6812 */       System.out.println("coPagoFijo :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoPagoFijo());
/* 6813 */       System.out.println("coCalServicio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoCalServicio());
/* 6814 */       System.out.println("canCalServicio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCanCalServicio());
/* 6815 */       System.out.println("coPagoVariable :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getCoPagoVariable());
/* 6816 */       System.out.println("flagBeneficio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getFlagCaGarantia());
/* 6817 */       System.out.println("deflagBeneficio :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getDeflagCaGarantia());
/* 6818 */       System.out.println("feFinCarencia :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getFeFinCarencia());
/* 6819 */       System.out.println("feFinEspera :" + ((InConCod271Detalle)inConCod271.getDetalles().get(i)).getFeFinEspera());
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void InRegAfi270coming(InRegAfi270 regafi270) {
/* 6824 */     System.out.println("-----------Data Entrante-----------");
/* 6825 */     System.out.println("noTransaccion :" + regafi270.getNoTransaccion());
/* 6826 */     System.out.println("idRemitente :" + regafi270.getIdRemitente());
/* 6827 */     System.out.println("idReceptor :" + regafi270.getIdReceptor());
/* 6828 */     System.out.println("feTransaccion :" + regafi270.getFeTransaccion());
/* 6829 */     System.out.println("hoTransaccion :" + regafi270.getHoTransaccion());
/* 6830 */     System.out.println("idCorrelativo :" + regafi270.getIdCorrelativo());
/* 6831 */     System.out.println("idTransaccion :" + regafi270.getIdTransaccion());
/* 6832 */     System.out.println("tiFinalidad :" + regafi270.getTiFinalidad());
/* 6833 */     System.out.println("caRemitente :" + regafi270.getCaRemitente());
/* 6834 */     System.out.println("nuRucRemitente :" + regafi270.getNuRucRemitente());
/* 6835 */     System.out.println("caReceptor :" + regafi270.getCaReceptor());
/* 6836 */     System.out.println("caPaciente :" + regafi270.getCaPaciente());
/* 6837 */     System.out.println("apPaternoPaciente :" + regafi270.getApPaternoPaciente());
/* 6838 */     System.out.println("noPaciente :" + regafi270.getNoPaciente());
/* 6839 */     System.out.println("apMaternoPaciente :" + regafi270.getApMaternoPaciente());
/* 6840 */     System.out.println("tiDoPaciente :" + regafi270.getTiDocumento());
/* 6841 */     System.out.println("nuDoPaciente :" + regafi270.getNuDocumento());
/*      */   }
/*      */   
/*      */   private static void InRegAfi271coming(InRegAfi271 regafi271) {
/* 6845 */     System.out.println("-----------Data Entrante-----------");
/* 6846 */     System.out.println("noTransaccion :" + regafi271.getNoTransaccion());
/* 6847 */     System.out.println("idRemitente :" + regafi271.getIdRemitente());
/* 6848 */     System.out.println("idReceptor :" + regafi271.getIdReceptor());
/* 6849 */     System.out.println("feTransaccion :" + regafi271.getFeTransaccion());
/* 6850 */     System.out.println("hoTransaccion :" + regafi271.getHoTransaccion());
/* 6851 */     System.out.println("idCorrelativo :" + regafi271.getIdCorrelativo());
/* 6852 */     System.out.println("idTransaccion :" + regafi271.getIdTransaccion());
/* 6853 */     System.out.println("tiFinalidad :" + regafi271.getTiFinalidad());
/* 6854 */     System.out.println("caRemitente :" + regafi271.getCaRemitente());
/* 6855 */     System.out.println("nuRucRemitente :" + regafi271.getCaReceptor());
/* 6856 */     System.out.println("caReceptor :" + regafi271.getNuRucReceptor());
/*      */     
/* 6858 */     for (int i = 0; i < regafi271.getDetalles().size(); i++) {
/* 6859 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 6860 */       System.out.println("caPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCaPaciente());
/* 6861 */       System.out.println("apPaternoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApPaternoPaciente());
/* 6862 */       System.out.println("noPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNoPaciente());
/* 6863 */       System.out.println("coPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoPaciente());
/* 6864 */       System.out.println("apMaternoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApMaternoPaciente());
/* 6865 */       System.out.println("tiDocumentoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getTiDocumentoPaciente());
/* 6866 */       System.out.println("nuDocumentoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNuDocumentoPaciente());
/* 6867 */       System.out.println("coContratoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoContratoPaciente());
/* 6868 */       System.out.println("esPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getEsPaciente());
/* 6869 */       System.out.println("tiRegimenPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getTiRegimenPaciente());
/* 6870 */       System.out.println("tiPlanPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getTiPlanPaciente());
/* 6871 */       System.out.println("ticoProductoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoProductoPaciente());
/* 6872 */       System.out.println("nocoPlanPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoPlanPaciente());
/* 6873 */       System.out.println("nuCarnetPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNuCarnetPaciente());
/* 6874 */       System.out.println("coVinculoFamPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoVinculoFamPaciente());
/*      */       
/* 6876 */       System.out.println("apCasadaPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApCasadaPaciente());
/* 6877 */       System.out.println("deUbigeoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getDeUbigeoPaciente());
/* 6878 */       System.out.println("feNacePaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeNacePaciente());
/* 6879 */       System.out.println("sePaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getGePaciente());
/* 6880 */       System.out.println("coPaisPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoPaisPaciente());
/* 6881 */       System.out.println("feFallecidoPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeFallecidoPaciente());
/* 6882 */       System.out.println("feIniAfiliaPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeIniAfiliaPaciente());
/* 6883 */       System.out.println("feFinAfiliaPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeFinAfiliaPaciente());
/* 6884 */       System.out.println("feFinAtencionPaciente :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeFinAtencionPaciente());
/*      */       
/* 6886 */       System.out.println("caAseguradora :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCaAseguradora());
/* 6887 */       System.out.println("coAseguradora :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoAseguradora());
/*      */       
/* 6889 */       System.out.println("caTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCaTitular());
/* 6890 */       System.out.println("apPaternoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApPaternoTitular());
/* 6891 */       System.out.println("noTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNoTitular());
/* 6892 */       System.out.println("coTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoTitular());
/* 6893 */       System.out.println("apMaternoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApMaternoTitular());
/* 6894 */       System.out.println("tiDocumentoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getTiDocumentoTitular());
/* 6895 */       System.out.println("nuDocumentoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNuDocumentoTitular());
/* 6896 */       System.out.println("coEstablecimientoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoEstablecimientoTitular());
/* 6897 */       System.out.println("feFallecidoTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getFeFallecidoTitular());
/* 6898 */       System.out.println("coPaisTitular :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoPaisTitular());
/*      */       
/* 6900 */       System.out.println("caContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCaContratante());
/* 6901 */       System.out.println("apPaternoContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApPaternoContratante());
/* 6902 */       System.out.println("noContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getApMaternoContratante());
/* 6903 */       System.out.println("apMaternoContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNoContratante());
/* 6904 */       System.out.println("tiDocumentoContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getTiDocumentoContratante());
/* 6905 */       System.out.println("idReContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getIdReContratante());
/* 6906 */       System.out.println("nuDocumentoContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getNuDocumentoContratante());
/* 6907 */       System.out.println("coPaisContratante :" + ((InRegAfi271Detalle)regafi271.getDetalles().get(i)).getCoPaisContratante());
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void InConMed271coming(InConMed271 inConMed271) {
/* 6912 */     System.out.println("-----------Data Entrante-----------");
/* 6913 */     System.out.println("noTransaccion :" + inConMed271.getNoTransaccion());
/* 6914 */     System.out.println("idRemitente :" + inConMed271.getIdRemitente());
/* 6915 */     System.out.println("idReceptor :" + inConMed271.getIdReceptor());
/* 6916 */     System.out.println("feTransaccion :" + inConMed271.getFeTransaccion());
/* 6917 */     System.out.println("hoTransaccion :" + inConMed271.getHoTransaccion());
/* 6918 */     System.out.println("idCorrelativo :" + inConMed271.getIdCorrelativo());
/* 6919 */     System.out.println("idTransaccion :" + inConMed271.getIdTransaccion());
/* 6920 */     System.out.println("tiFinalidad :" + inConMed271.getTiFinalidad());
/* 6921 */     System.out.println("caRemitente :" + inConMed271.getCaRemitente());
/* 6922 */     System.out.println("nuRucRemitente :" + inConMed271.getCaReceptor());
/* 6923 */     System.out.println("caReceptor :" + inConMed271.getNuRucReceptor());
/* 6924 */     System.out.println("caPaciente :" + inConMed271.getCaPaciente());
/* 6925 */     System.out.println("apPaternoPaciente :" + inConMed271.getApPaternoPaciente());
/* 6926 */     System.out.println("noPaciente :" + inConMed271.getNoPaciente());
/* 6927 */     System.out.println("coPaciente :" + inConMed271.getCoPaciente());
/* 6928 */     System.out.println("apMaternoPaciente :" + inConMed271.getApMaternoPaciente());
/*      */     
/* 6930 */     for (int i = 0; i < inConMed271.getDetalles().size(); i++) {
/* 6931 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 6932 */       System.out.println("coSeCIE10 :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getCoSeCIE10());
/* 6933 */       System.out.println("coRestriccion :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getCoRestriccion());
/* 6934 */       System.out.println("dePreexistencia :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getDePreexistencia());
/* 6935 */       System.out.println("msgObsPr :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getMsgObsPr());
/* 6936 */       System.out.println("idFuenteRE :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getIdFuenteRE());
/* 6937 */       System.out.println("esCobertura :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getEsCobertura());
/* 6938 */       System.out.println("moDiagnostico :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getMoDiagnostico());
/* 6939 */       System.out.println("tiEspera :" + ((InConMed271Detalle)inConMed271.getDetalles().get(i)).getTiEspera());
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void InSolAut271coming(InSolAut271 inSolAut271) {
/* 6947 */     System.out.println("-----------Data Entrante-----------");
/* 6948 */     System.out.println("noTransaccion :" + inSolAut271.getNoTransaccion());
/* 6949 */     System.out.println("idRemitente :" + inSolAut271.getIdRemitente());
/* 6950 */     System.out.println("idReceptor :" + inSolAut271.getIdReceptor());
/* 6951 */     System.out.println("feTransaccion :" + inSolAut271.getFeTransaccion());
/* 6952 */     System.out.println("hoTransaccion :" + inSolAut271.getHoTransaccion());
/* 6953 */     System.out.println("idCorrelativo :" + inSolAut271.getIdCorrelativo());
/* 6954 */     System.out.println("idTransaccion :" + inSolAut271.getIdTransaccion());
/* 6955 */     System.out.println("tiFinalidad :" + inSolAut271.getTiFinalidad());
/* 6956 */     System.out.println("caRemitente :" + inSolAut271.getCaRemitente());
/* 6957 */     System.out.println("nuRucReceptor :" + inSolAut271.getNuRucRemitente());
/* 6958 */     System.out.println("caReceptor :" + inSolAut271.getCaReceptor());
/* 6959 */     System.out.println("caReceptor :" + inSolAut271.getCoAdmisionista());
/*      */     
/* 6961 */     System.out.println("caPaciente :" + inSolAut271.getCaPaciente());
/* 6962 */     System.out.println("apPaternoPaciente :" + inSolAut271.getApPaternoPaciente());
/* 6963 */     System.out.println("noPaciente :" + inSolAut271.getNoPaciente());
/* 6964 */     System.out.println("coAfPaciente :" + inSolAut271.getCoAfPaciente());
/* 6965 */     System.out.println("apMaternoPaciente :" + inSolAut271.getApMaternoPaciente());
/* 6966 */     System.out.println("coEsPaciente :" + inSolAut271.getCoEsPaciente());
/* 6967 */     System.out.println("tiDoPaciente :" + inSolAut271.getTiDoPaciente());
/* 6968 */     System.out.println("nuDoPaciente :" + inSolAut271.getNuDoPaciente());
/* 6969 */     System.out.println("nuIdenPaciente :" + inSolAut271.getNuIdenEmpleador());
/* 6970 */     System.out.println("nuContratoPaciente :" + inSolAut271.getNuContratoPaciente());
/* 6971 */     System.out.println("nuPoliza :" + inSolAut271.getNuPoliza());
/* 6972 */     System.out.println("nuCertificado :" + inSolAut271.getNuCertificado());
/* 6973 */     System.out.println("coTiPolizaAfiliacion :" + inSolAut271.getCoTiPolizaAfiliacion());
/* 6974 */     System.out.println("coProducto :" + inSolAut271.getCoProducto());
/* 6975 */     System.out.println("deProducto :" + inSolAut271.getDeProducto());
/*      */     
/* 6977 */     System.out.println("nuPlan :" + inSolAut271.getNuPlan());
/* 6978 */     System.out.println("tiPlanSalud :" + inSolAut271.getTiPlanSalud());
/* 6979 */     System.out.println("coMoneda :" + inSolAut271.getCoMoneda());
/* 6980 */     System.out.println("coParentesco :" + inSolAut271.getCoParentesco());
/* 6981 */     System.out.println("soBeneficio :" + inSolAut271.getSoBeneficio());
/* 6982 */     System.out.println("nuSoBeneficio :" + inSolAut271.getNuSoBeneficio());
/* 6983 */     System.out.println("coEspecialidad :" + inSolAut271.getCoEspecialidad());
/* 6984 */     System.out.println("feNacimiento :" + inSolAut271.getFeNacimiento());
/* 6985 */     System.out.println("sexo :" + inSolAut271.getGenero());
/* 6986 */     System.out.println("esMarital :" + inSolAut271.getEsMarital());
/* 6987 */     System.out.println("feIniVigencia :" + inSolAut271.getFeIniVigencia());
/* 6988 */     System.out.println("feFinVigencia :" + inSolAut271.getFeFinVigencia());
/*      */     
/* 6990 */     System.out.println("esCobertura :" + inSolAut271.getEsCobertura());
/* 6991 */     System.out.println("nuDecAccidente :" + inSolAut271.getNuDecAccidente());
/* 6992 */     System.out.println("idInfAccidente :" + inSolAut271.getIdInfAccidente());
/* 6993 */     System.out.println("deTiAccidente :" + inSolAut271.getDeTiAccidente());
/* 6994 */     System.out.println("feAfiliacion :" + inSolAut271.getFeAfiliacion());
/* 6995 */     System.out.println("feOcuAccidente :" + inSolAut271.getFeOcuAccidente());
/*      */     
/* 6997 */     System.out.println("nuAtencion :" + inSolAut271.getNuAtencion());
/* 6998 */     System.out.println("idDerFarmacia :" + inSolAut271.getIdDerFarmacia());
/* 6999 */     System.out.println("tiProducto :" + inSolAut271.getTiProducto());
/* 7000 */     System.out.println("deProductoDeFarmacia :" + inSolAut271.getDeProductoDeFarmacia());
/* 7001 */     System.out.println("feAtencion :" + inSolAut271.getFeAtencion());
/*      */     
/* 7003 */     System.out.println("nuCobertura :" + inSolAut271.getNuCobertura());
/* 7004 */     System.out.println("obsCobertura :" + inSolAut271.getObsCobertura());
/* 7005 */     System.out.println("msgObs :" + inSolAut271.getMsgObs());
/* 7006 */     System.out.println("msgConEspeciales :" + inSolAut271.getMsgConEspeciales());
/*      */     
/* 7008 */     System.out.println("caContratante :" + inSolAut271.getCaContratante());
/* 7009 */     System.out.println("noPaContratante :" + inSolAut271.getNoPaContratante());
/* 7010 */     System.out.println("noContratant :e" + inSolAut271.getNoContratante());
/* 7011 */     System.out.println("noMaContratante :" + inSolAut271.getNoMaContratante());
/* 7012 */     System.out.println("tiDoContratante :" + inSolAut271.getTiDoContratante());
/* 7013 */     System.out.println("idReContratante :" + inSolAut271.getIdReContratante());
/* 7014 */     System.out.println("coReContratante :" + inSolAut271.getCoReContratante());
/*      */     
/* 7016 */     System.out.println("caTitular :" + inSolAut271.getCaTitular());
/* 7017 */     System.out.println("noPaTitular :" + inSolAut271.getNoPaTitular());
/* 7018 */     System.out.println("noTitular :" + inSolAut271.getNoTitular());
/* 7019 */     System.out.println("coAfTitular :" + inSolAut271.getCoAfTitular());
/* 7020 */     System.out.println("noMaTitular :" + inSolAut271.getNoMaTitular());
/* 7021 */     System.out.println("tiDoTitular :" + inSolAut271.getTiDoTitular());
/* 7022 */     System.out.println("idReTitular :" + inSolAut271.getIdReTitular());
/* 7023 */     System.out.println("nuDoTitular :" + inSolAut271.getNuDoTitular());
/* 7024 */     System.out.println("feIncTitular :" + inSolAut271.getFeIncTitular());
/*      */     
/* 7026 */     System.out.println("nuCobPreExistencia :" + inSolAut271.getNuCobPreExistencia());
/* 7027 */     System.out.println("beMaxInicial :" + inSolAut271.getBeMaxInicial());
/*      */     
/* 7029 */     System.out.println("canServicio :" + inSolAut271.getCanServicio());
/* 7030 */     System.out.println("idDeProducto :" + inSolAut271.getIdDeProducto());
/* 7031 */     System.out.println("coTiCobertura :" + inSolAut271.getCoTiCobertura());
/* 7032 */     System.out.println("coSubTiCobertura :" + inSolAut271.getCoSubTiCobertura());
/* 7033 */     System.out.println("msgObsPre :" + inSolAut271.getMsgObsPre());
/* 7034 */     System.out.println("msgConEspecialesPre :" + inSolAut271.getMsgConEspecialesPre());
/* 7035 */     System.out.println("coTiMoneda :" + inSolAut271.getCoTiMoneda());
/* 7036 */     System.out.println("coPagoFijo :" + inSolAut271.getCoPagoFijo());
/* 7037 */     System.out.println("coCalServicio :" + inSolAut271.getCoCalServicio());
/* 7038 */     System.out.println("canCalServicio :" + inSolAut271.getCanCalServicio());
/* 7039 */     System.out.println("coPagoVariable :" + inSolAut271.getCoPagoVariable());
/* 7040 */     System.out.println("flagCG :" + inSolAut271.getFlagCG());
/* 7041 */     System.out.println("flagCG :" + inSolAut271.getDeflagCG());
/* 7042 */     System.out.println("feFinCarencia :" + inSolAut271.getFeFinCarencia());
/* 7043 */     System.out.println("feFinEspera :" + inSolAut271.getFeFinEspera());
/*      */     int i;
/* 7045 */     for (i = 0; i < inSolAut271.getDetallesPE().size(); i++) {
/* 7046 */       System.out.println("----REGISTRO ProEsp: " + (i + 1) + " ----");
/* 7047 */       System.out.println("coInProcedimiento :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getCoInProcedimiento());
/* 7048 */       System.out.println("coTiProConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getCoTiProConAmbulatoria());
/* 7049 */       System.out.println("nuPlanConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getNuPlanConAmbulatoria());
/* 7050 */       System.out.println("imDeducible :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getImDeducible());
/* 7051 */       System.out.println("poConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getPoConAmbulatoria());
/* 7052 */       System.out.println("frConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getFrConAmbulatoria());
/* 7053 */       System.out.println("geConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getGeConAmbulatoria());
/* 7054 */       System.out.println("caConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getCaConAmbulatoria());
/* 7055 */       System.out.println("msgConAmbulatoria :" + ((InSolAutProEsp271Detalle)inSolAut271.getDetallesPE().get(i)).getMsgConAmbulatoria());
/*      */     } 
/*      */     
/* 7058 */     for (i = 0; i < inSolAut271.getDetallesTE().size(); i++) {
/* 7059 */       System.out.println("----REGISTRO TieEsp: " + (i + 1) + " ----");
/* 7060 */       System.out.println("coTiEspera :" + ((InSolAutTieEsp271Detalle)inSolAut271.getDetallesTE().get(i)).getCoTiEspera());
/* 7061 */       System.out.println("idTiEspera :" + ((InSolAutTieEsp271Detalle)inSolAut271.getDetallesTE().get(i)).getIdTiEspera());
/* 7062 */       System.out.println("deTiEspera :" + ((InSolAutTieEsp271Detalle)inSolAut271.getDetallesTE().get(i)).getDeTiEspera());
/* 7063 */       System.out.println("feFinVigenciaTiEspera :" + ((InSolAutTieEsp271Detalle)inSolAut271.getDetallesTE().get(i)).getFeFinVigenciaTiEspera());
/* 7064 */       System.out.println("msgTiEspera :" + ((InSolAutTieEsp271Detalle)inSolAut271.getDetallesTE().get(i)).getMsgTiEspera());
/*      */     } 
/*      */     
/* 7067 */     for (i = 0; i < inSolAut271.getDetallesEC().size(); i++) {
/* 7068 */       System.out.println("----REGISTRO ExcCar: " + (i + 1) + " ----");
/* 7069 */       System.out.println("coExCArencia :" + ((InSolAutExeCar271Detalle)inSolAut271.getDetallesEC().get(i)).getCoExCarencia());
/* 7070 */       System.out.println("idExCArencia :" + ((InSolAutExeCar271Detalle)inSolAut271.getDetallesEC().get(i)).getIdExCarencia());
/* 7071 */       System.out.println("deExCArencia :" + ((InSolAutExeCar271Detalle)inSolAut271.getDetallesEC().get(i)).getDeExCarencia());
/* 7072 */       System.out.println("msgExCArencia :" + ((InSolAutExeCar271Detalle)inSolAut271.getDetallesEC().get(i)).getMsgExCarencia());
/*      */     } 
/*      */     
/* 7075 */     for (i = 0; i < inSolAut271.getDetalles().size(); i++) {
/* 7076 */       System.out.println("----REGISTRO Detalles: " + (i + 1) + " ----");
/* 7077 */       System.out.println("CIE10Restricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getCIE10Restricciones());
/* 7078 */       System.out.println("idRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getIdRestricciones());
/* 7079 */       System.out.println("obsRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getObsRestricciones());
/* 7080 */       System.out.println("deRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getDeRestricciones());
/* 7081 */       System.out.println("msgRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getMsgRestricciones());
/* 7082 */       System.out.println("monTopeRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getMonTopeRestricciones());
/* 7083 */       System.out.println("feFinEsperaRestricciones :" + ((InSolAutRes271Detalle)inSolAut271.getDetalles().get(i)).getFeFinEsperaRestricciones());
/*      */     } 
/*      */     
/* 7086 */     System.out.println("caRegafi :" + inSolAut271.getCaRegafi());
/* 7087 */     System.out.println("noPaRegafi :" + inSolAut271.getNoPaRegafi());
/* 7088 */     System.out.println("noRegafi :" + inSolAut271.getNoRegafi());
/* 7089 */     System.out.println("coAfRegafi :" + inSolAut271.getCoAfRegafi());
/* 7090 */     System.out.println("noMaRegafi :" + inSolAut271.getNoMaRegafi());
/* 7091 */     System.out.println("tiDoRegafi :" + inSolAut271.getTiDoRegafi());
/* 7092 */     System.out.println("idReRegafi :" + inSolAut271.getIdReRegafi());
/* 7093 */     System.out.println("nuDoRegafi :" + inSolAut271.getNuDoRegafi());
/* 7094 */     System.out.println("feNaRegafi :" + inSolAut271.getFeNaRegafi());
/* 7095 */     System.out.println("geRegafi :" + inSolAut271.getGeRegafi());
/* 7096 */     System.out.println("coPaisRegafi :" + inSolAut271.getCoPaisRegafi());
/*      */   }
/*      */   
/*      */   private static void In278SolCGcoming(In278SolCG in278SolCG) {
/* 7100 */     System.out.println("-----------Data Entrante-----------");
/* 7101 */     System.out.println("noTransaccion :" + in278SolCG.getNoTransaccion());
/* 7102 */     System.out.println("idRemitente :" + in278SolCG.getIdRemitente());
/* 7103 */     System.out.println("idReceptor :" + in278SolCG.getIdReceptor());
/* 7104 */     System.out.println("feTransaccion :" + in278SolCG.getFeTransaccion());
/* 7105 */     System.out.println("hoTransaccion :" + in278SolCG.getHoTransaccion());
/* 7106 */     System.out.println("idCorrelativo :" + in278SolCG.getIdCorrelativo());
/* 7107 */     System.out.println("idTransaccion :" + in278SolCG.getIdTransaccion());
/* 7108 */     System.out.println("tiFinalidad :" + in278SolCG.getTiFinalidad());
/* 7109 */     System.out.println("caPaciente :" + in278SolCG.getCaPaciente());
/* 7110 */     System.out.println("apPaternoPaciente :" + in278SolCG.getApPaternoPaciente());
/* 7111 */     System.out.println("noPaciente :" + in278SolCG.getNoPaciente());
/* 7112 */     System.out.println("apMaternoPaciente :" + in278SolCG.getApMaternoPaciente());
/* 7113 */     System.out.println("coTiDoPaciente :" + in278SolCG.getCoTiDoPaciente());
/* 7114 */     System.out.println("nuDoPaciente :" + in278SolCG.getNuDoPaciente());
/* 7115 */     System.out.println("nuCarGarantia :" + in278SolCG.getNuCarGarantia());
/* 7116 */     System.out.println("esCarGarantia :" + in278SolCG.getEsCarGarantia());
/* 7117 */     System.out.println("nuSoCarGarantia :" + in278SolCG.getNuSoCarGarantia());
/*      */   }
/*      */   
/*      */   private static void In278ResCGcoming(In278ResCG in278ResCG) {
/* 7121 */     System.out.println("-----------Data Entrante-----------");
/* 7122 */     System.out.println("noTransaccion :" + in278ResCG.getNoTransaccion());
/* 7123 */     System.out.println("idRemitente :" + in278ResCG.getIdRemitente());
/* 7124 */     System.out.println("idReceptor :" + in278ResCG.getIdReceptor());
/* 7125 */     System.out.println("feTransaccion :" + in278ResCG.getFeTransaccion());
/* 7126 */     System.out.println("hoTransaccion :" + in278ResCG.getHoTransaccion());
/* 7127 */     System.out.println("idCorrelativo :" + in278ResCG.getIdCorrelativo());
/* 7128 */     System.out.println("idTransaccion :" + in278ResCG.getIdTransaccion());
/* 7129 */     System.out.println("tiFinalidad :" + in278ResCG.getTiFinalidad());
/* 7130 */     System.out.println("caRemitente :" + in278ResCG.getCaRemitente());
/* 7131 */     System.out.println("caReceptor :" + in278ResCG.getCaReceptor());
/* 7132 */     System.out.println("rucReceptor :" + in278ResCG.getNuRucReceptor());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 7137 */     for (int i = 0; i < in278ResCG.getDetalles().size(); i++) {
/* 7138 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 7139 */       System.out.println("caPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCaPaciente());
/* 7140 */       System.out.println("apPaternoPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getApPaternoPaciente());
/* 7141 */       System.out.println("noPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoPaciente());
/* 7142 */       System.out.println("coAfPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoAfPaciente());
/* 7143 */       System.out.println("apMaternoPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getApMaternoPaciente());
/* 7144 */       System.out.println("coTiDoPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoTiDoPaciente());
/* 7145 */       System.out.println("nuDoPaciente :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuDoPaciente());
/* 7146 */       System.out.println("monPago :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getMonPago());
/* 7147 */       System.out.println("tiCaContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiCaContratante());
/* 7148 */       System.out.println("noPaContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoPaContratante());
/* 7149 */       System.out.println("noContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoContratante());
/* 7150 */       System.out.println("noMaContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNoMaContratante());
/* 7151 */       System.out.println("tiDoContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiDoContratante());
/* 7152 */       System.out.println("idCaReContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getIdCaReContratante());
/* 7153 */       System.out.println("idCaReContratante :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuCaReContratante());
/* 7154 */       System.out.println("deCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getDeCarGarantia());
/* 7155 */       System.out.println("nuSoCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuSoCarGarantia());
/* 7156 */       System.out.println("nuCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuCarGarantia());
/* 7157 */       System.out.println("veCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getVeCarGarantia());
/* 7158 */       System.out.println("esCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getEsCarGarantia());
/* 7159 */       System.out.println("coProducto :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoProducto());
/* 7160 */       System.out.println("coProcedimiento :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoProcedimiento());
/* 7161 */       System.out.println("deProcedimiento :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getDeProcedimiento());
/* 7162 */       System.out.println("nuPlan :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getNuPlan());
/* 7163 */       System.out.println("tiPlanSalud :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getTiPlanSalud());
/* 7164 */       System.out.println("coMoneda :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getCoMoneda());
/* 7165 */       System.out.println("feCarGarantia :" + ((In278ResCGDetalle)in278ResCG.getDetalles().get(i)).getFeCarGarantia());
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private static void In271ConProcComing(InConProc271 inConProc271) {
/* 7171 */     System.out.println("-----------Data Entrante-----------");
/* 7172 */     System.out.println("noTransaccion :" + inConProc271.getNoTransaccion());
/* 7173 */     System.out.println("idRemitente :" + inConProc271.getIdRemitente());
/* 7174 */     System.out.println("idReceptor :" + inConProc271.getIdReceptor());
/* 7175 */     System.out.println("feTransaccion :" + inConProc271.getFeTransaccion());
/* 7176 */     System.out.println("hoTransaccion :" + inConProc271.getHoTransaccion());
/* 7177 */     System.out.println("idCorrelativo :" + inConProc271.getIdCorrelativo());
/* 7178 */     System.out.println("idTransaccion :" + inConProc271.getIdTransaccion());
/* 7179 */     System.out.println("tiFinalidad :" + inConProc271.getTiFinalidad());
/* 7180 */     System.out.println("caRemitente :" + inConProc271.getCaRemitente());
/* 7181 */     System.out.println("caReceptor :" + inConProc271.getCaReceptor());
/* 7182 */     System.out.println("rucReceptor :" + inConProc271.getNuRucReceptor());
/* 7183 */     System.out.println("caPaciente :" + inConProc271.getCaPaciente());
/* 7184 */     System.out.println("apPaternoPaciente :" + inConProc271.getApPaternoPaciente());
/* 7185 */     System.out.println("noPaciente :" + inConProc271.getNoPaciente());
/* 7186 */     System.out.println("coAfPaciente :" + inConProc271.getCoAfPaciente());
/* 7187 */     System.out.println("apMaternoPaciente :" + inConProc271.getApMaternoPaciente());
/*      */     
/* 7189 */     for (int i = 0; i < inConProc271.getDetalles().size(); i++) {
/* 7190 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 7191 */       System.out.println("coInProcedimiento :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoInProcedimiento());
/* 7192 */       System.out.println("coInRestriccion :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoInRestriccion());
/* 7193 */       System.out.println("coProcedimiento :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoProcedimiento());
/* 7194 */       System.out.println("imDeducible :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getImDeducible());
/* 7195 */       System.out.println("poCuExDecimal :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getPoCuExDecimal());
/* 7196 */       System.out.println("nuFrecuencia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getNuFrecuencia());
/* 7197 */       System.out.println("nuCarGarantia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoSexo());
/* 7198 */       System.out.println("tiNuDias :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTiNuDias());
/* 7199 */       System.out.println("teMsgObservacion :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgObservacion());
/* 7200 */       System.out.println("idFuentePE :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuentePE());
/* 7201 */       System.out.println("coTiEspera :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoTiEspera());
/* 7202 */       System.out.println("deTiEspera :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getDeTiEspera());
/* 7203 */       System.out.println("feFinVigencia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getFeFinVigencia());
/* 7204 */       System.out.println("teMsgTiEspera :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgTiEspera());
/* 7205 */       System.out.println("idFuenteTE :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuenteTE());
/* 7206 */       System.out.println("coExCarencia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoExCarencia());
/* 7207 */       System.out.println("deExCarencia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getDeExCarencia());
/* 7208 */       System.out.println("teMsgExCarencia :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgExCarencia());
/* 7209 */       System.out.println("idFuenteEC :" + ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuenteEC());
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void In997ResAutComing(In997ResAut in997ResAut) {
/* 7214 */     System.out.println("-----------Data Entrante-----------");
/* 7215 */     System.out.println("noTransaccion :" + in997ResAut.getNoTransaccion());
/* 7216 */     System.out.println("idRemitente :" + in997ResAut.getIdRemitente());
/* 7217 */     System.out.println("idReceptor :" + in997ResAut.getIdReceptor());
/* 7218 */     System.out.println("feTransaccion :" + in997ResAut.getFeTransaccion());
/* 7219 */     System.out.println("hoTransaccion :" + in997ResAut.getHoTransaccion());
/* 7220 */     System.out.println("idCorrelativo :" + in997ResAut.getIdCorrelativo());
/* 7221 */     System.out.println("idTransaccion :" + in997ResAut.getIdTransaccion());
/* 7222 */     System.out.println("nuAutorizacion :" + in997ResAut.getNuAutorizacion());
/* 7223 */     System.out.println("coSeguridad :" + in997ResAut.getCoSeguridad());
/* 7224 */     System.out.println("coError :" + in997ResAut.getCoError());
/* 7225 */     System.out.println("inCoErrorEncontrado :" + in997ResAut.getInCoErrorEncontrado());
/*      */   }
/*      */   
/*      */   private static void In271ResSctrComing(In271ResSctr in271ResSctr) {
/* 7229 */     System.out.println("-----------Data Entrante-----------");
/* 7230 */     System.out.println("noTransaccion :" + in271ResSctr.getNoTransaccion());
/* 7231 */     System.out.println("idRemitente :" + in271ResSctr.getIdRemitente());
/* 7232 */     System.out.println("idReceptor :" + in271ResSctr.getIdReceptor());
/* 7233 */     System.out.println("feTransaccion :" + in271ResSctr.getFeTransaccion());
/* 7234 */     System.out.println("hoTransaccion :" + in271ResSctr.getHoTransaccion());
/* 7235 */     System.out.println("idCorrelativo :" + in271ResSctr.getIdCorrelativo());
/* 7236 */     System.out.println("idTransaccion :" + in271ResSctr.getIdTransaccion());
/* 7237 */     System.out.println("tiFinalidad :" + in271ResSctr.getTiFinalidad());
/* 7238 */     System.out.println("caRemitente :" + in271ResSctr.getCaRemitente());
/* 7239 */     System.out.println("caReceptor :" + in271ResSctr.getCaReceptor());
/* 7240 */     System.out.println("rucReceptor :" + in271ResSctr.getNuRucReceptor());
/* 7241 */     System.out.println("caPaciente :" + in271ResSctr.getCaPaciente());
/* 7242 */     System.out.println("apPaternoPaciente :" + in271ResSctr.getApPaternoPaciente());
/* 7243 */     System.out.println("noPaciente :" + in271ResSctr.getNoPaciente());
/* 7244 */     System.out.println("coAfPaciente :" + in271ResSctr.getCoAfPaciente());
/* 7245 */     System.out.println("apMaternoPaciente :" + in271ResSctr.getApMaternoPaciente());
/* 7246 */     System.out.println("coTiDoPaciente :" + in271ResSctr.getCoTiDoPaciente());
/* 7247 */     System.out.println("nuDocPaciente :" + in271ResSctr.getNuDocPaciente());
/*      */     
/* 7249 */     for (int i = 0; i < in271ResSctr.getDetalles().size(); i++) {
/* 7250 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 7251 */       System.out.println("nuAtencion :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getTiCaContratante());
/* 7252 */       System.out.println("teMsgLibre1 :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getNoEmApPaContratante());
/* 7253 */       System.out.println("coTiProducto :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoEmContratante());
/* 7254 */       System.out.println("deProducto :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getIdCaReContratante());
/* 7255 */       System.out.println("feAtSalud :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getReIdContratante());
/* 7256 */       System.out.println("noLuAtencion :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getTiCaLuAtencion());
/* 7257 */       System.out.println("coLuAtencion :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getNoEmLuAtencion());
/* 7258 */       System.out.println("tiDoContratante :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoEmReLuAtencion());
/* 7259 */       System.out.println("idCaReferencia :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getIdCaReLuAtencion());
/* 7260 */       System.out.println("reIdContratante :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getReIdLuAtencion());
/* 7261 */       System.out.println("coLuAtencion :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoLuAtencion());
/* 7262 */       System.out.println("tiDoContratante :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getDeTiAccidente());
/* 7263 */       System.out.println("idCaReferencia :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getFeAfiliacion());
/* 7264 */       System.out.println("reIdContratante :" + ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getFeOcAccidente());
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void InLogAcreInsert271coming(InLogAcreInsert271 inLogAcreInsert271) {
/* 7269 */     System.out.println("-----------Data Entrante-----------");
/*      */     
/* 7271 */     System.out.println("noTransaccion :" + inLogAcreInsert271.getNoTransaccion());
/* 7272 */     System.out.println("idRemitente :" + inLogAcreInsert271.getIdRemitente());
/* 7273 */     System.out.println("idReceptor :" + inLogAcreInsert271.getIdReceptor());
/* 7274 */     System.out.println("feTransaccion :" + inLogAcreInsert271.getFeTransaccion());
/* 7275 */     System.out.println("hoTransaccion :" + inLogAcreInsert271.getHoTransaccion());
/* 7276 */     System.out.println("idCorrelativo :" + inLogAcreInsert271.getIdCorrelativo());
/* 7277 */     System.out.println("idTransaccion :" + inLogAcreInsert271.getIdTransaccion());
/* 7278 */     System.out.println("tiFinalidad :" + inLogAcreInsert271.getTiFinalidad());
/* 7279 */     System.out.println("caRemitente :" + inLogAcreInsert271.getCaRemitente());
/* 7280 */     System.out.println("nuRucRemitente :" + inLogAcreInsert271.getNuRucRemitente());
/* 7281 */     System.out.println("caReceptor :" + inLogAcreInsert271.getCaReceptor());
/*      */     
/* 7283 */     System.out.println("caPaciente :" + inLogAcreInsert271.getCaPaciente());
/* 7284 */     System.out.println("apPaternoPaciente :" + inLogAcreInsert271.getApPaternoPaciente());
/* 7285 */     System.out.println("noPaciente :" + inLogAcreInsert271.getNoPaciente());
/* 7286 */     System.out.println("coAfPaciente :" + inLogAcreInsert271.getCoAfPaciente());
/* 7287 */     System.out.println("apMaternoPaciente :" + inLogAcreInsert271.getApMaternoPaciente());
/* 7288 */     System.out.println("coEsPaciente :" + inLogAcreInsert271.getCoEsPaciente());
/* 7289 */     System.out.println("tiDoPaciente :" + inLogAcreInsert271.getTiDoPaciente());
/* 7290 */     System.out.println("nuDoPaciente :" + inLogAcreInsert271.getNuDoPaciente());
/* 7291 */     System.out.println("nuContratoPaciente :" + inLogAcreInsert271.getNuContratoPaciente());
/* 7292 */     System.out.println("coTiPolizaAfiliacion :" + inLogAcreInsert271.getCoTiPolizaAfiliacion());
/* 7293 */     System.out.println("coProducto :" + inLogAcreInsert271.getCoProducto());
/* 7294 */     System.out.println("nuPlan :" + inLogAcreInsert271.getNuPlan());
/* 7295 */     System.out.println("coParentesco :" + inLogAcreInsert271.getCoParentesco());
/* 7296 */     System.out.println("feNacimiento :" + inLogAcreInsert271.getFeNacimiento());
/* 7297 */     System.out.println("genero :" + inLogAcreInsert271.getGenero());
/* 7298 */     System.out.println("feIniVigencia :" + inLogAcreInsert271.getFeIniVigencia());
/*      */     
/* 7300 */     System.out.println("nuCobertura :" + inLogAcreInsert271.getNuCobertura());
/* 7301 */     System.out.println("deCobertura :" + inLogAcreInsert271.getDeCobertura());
/*      */     
/* 7303 */     System.out.println("caContratante :" + inLogAcreInsert271.getCaContratante());
/* 7304 */     System.out.println("tiDoContratante :" + inLogAcreInsert271.getTiDoContratante());
/* 7305 */     System.out.println("idReContratante :" + inLogAcreInsert271.getIdReContratante());
/* 7306 */     System.out.println("rucContratante :" + inLogAcreInsert271.getRucContratante());
/*      */     
/* 7308 */     System.out.println("coAfiliadoTitular :" + inLogAcreInsert271.getCoAfiliadoTitular());
/*      */     
/* 7310 */     System.out.println("caResponsableAut :" + inLogAcreInsert271.getCaResponsableAut());
/* 7311 */     System.out.println("noPaResponsableAut :" + inLogAcreInsert271.getNoPaResponsableAut());
/* 7312 */     System.out.println("noResponsableAut :" + inLogAcreInsert271.getNoResponsableAut());
/* 7313 */     System.out.println("noMaResponsableAut :" + inLogAcreInsert271.getNoMaResponsableAut());
/* 7314 */     System.out.println("tiDoResponsableAut :" + inLogAcreInsert271.getTiDoResponsableAut());
/* 7315 */     System.out.println("nuDoResponsableAut :" + inLogAcreInsert271.getNuDoResponsableAut());
/* 7316 */     System.out.println("nuAutorizacion :" + inLogAcreInsert271.getNuAutorizacion());
/* 7317 */     System.out.println("feHoAutorizacion :" + inLogAcreInsert271.getFeHoAutorizacion());
/* 7318 */     System.out.println("feBeMaxInicial :" + inLogAcreInsert271.getBeMaxInicial());
/* 7319 */     System.out.println("coPagoFijo :" + inLogAcreInsert271.getCoPagoFijo());
/* 7320 */     System.out.println("coPagoVariable :" + inLogAcreInsert271.getCoPagoVariable());
/* 7321 */     System.out.println("flagCaratGarantia :" + inLogAcreInsert271.getFlagCartaGarantia());
/* 7322 */     System.out.println("deFlagCaratGarantia :" + inLogAcreInsert271.getDeFlagCartaGarantia());
/*      */   }
/*      */   
/*      */   private static void In271ConObsComing(In271ConObs in271ConObs) {
/* 7326 */     System.out.println("-----------Data Entrante-----------");
/* 7327 */     System.out.println("noTransaccion :" + in271ConObs.getNoTransaccion());
/* 7328 */     System.out.println("idRemitente :" + in271ConObs.getIdRemitente());
/* 7329 */     System.out.println("idReceptor :" + in271ConObs.getIdReceptor());
/* 7330 */     System.out.println("feTransaccion :" + in271ConObs.getFeTransaccion());
/* 7331 */     System.out.println("hoTransaccion :" + in271ConObs.getHoTransaccion());
/* 7332 */     System.out.println("idCorrelativo :" + in271ConObs.getIdCorrelativo());
/* 7333 */     System.out.println("idTransaccion :" + in271ConObs.getIdTransaccion());
/* 7334 */     System.out.println("tiFinalidad :" + in271ConObs.getTiFinalidad());
/* 7335 */     System.out.println("caRemitente :" + in271ConObs.getCaRemitente());
/* 7336 */     System.out.println("caReceptor :" + in271ConObs.getCaReceptor());
/* 7337 */     System.out.println("rucReceptor :" + in271ConObs.getNuRucReceptor());
/* 7338 */     System.out.println("caPaciente :" + in271ConObs.getCaPaciente());
/* 7339 */     System.out.println("apPaternoPaciente :" + in271ConObs.getApPaternoPaciente());
/* 7340 */     System.out.println("noPaciente :" + in271ConObs.getNoPaciente());
/* 7341 */     System.out.println("coAfPaciente :" + in271ConObs.getCoAfPaciente());
/* 7342 */     System.out.println("apMaternoPaciente :" + in271ConObs.getApMaternoPaciente());
/* 7343 */     System.out.println("coSubCobertura :" + in271ConObs.getCoSubCobertura());
/* 7344 */     System.out.println("teMsgLibre1 :" + in271ConObs.getTeMsgLibre1());
/* 7345 */     System.out.println("teMsgLibre2 :" + in271ConObs.getTeMsgLibre2());
/*      */   }
/*      */   
/*      */   private static void In278InConEntVincComing(InConEntVinc278 inConEntVinc278) {
/* 7349 */     System.out.println("-----------Data Entrante-----------");
/* 7350 */     System.out.println("noTransaccion :" + inConEntVinc278.getNoTransaccion());
/* 7351 */     System.out.println("idRemitente :" + inConEntVinc278.getIdRemitente());
/* 7352 */     System.out.println("idReceptor :" + inConEntVinc278.getIdReceptor());
/* 7353 */     System.out.println("feTransaccion :" + inConEntVinc278.getFeTransaccion());
/* 7354 */     System.out.println("hoTransaccion :" + inConEntVinc278.getHoTransaccion());
/* 7355 */     System.out.println("idCorrelativo :" + inConEntVinc278.getIdCorrelativo());
/* 7356 */     System.out.println("idTransaccion :" + inConEntVinc278.getIdTransaccion());
/* 7357 */     System.out.println("tiFinalidad :" + inConEntVinc278.getTiFinalidad());
/*      */     
/* 7359 */     System.out.println("caIPRESS :" + inConEntVinc278.getCaIPRESS());
/* 7360 */     System.out.println("noIPRESS :" + inConEntVinc278.getNoIPRESS());
/* 7361 */     System.out.println("tiDoIPRESS :" + inConEntVinc278.getTiDoIPRESS());
/* 7362 */     System.out.println("nuRucIPRESS :" + inConEntVinc278.getNuRucIPRESS());
/*      */   }
/*      */   
/*      */   private static void In278InResEntVinc278Coming(InResEntVinc278 inResEntVinc278) {
/* 7366 */     System.out.println("-----------Data Entrante-----------");
/* 7367 */     System.out.println("noTransaccion :" + inResEntVinc278.getNoTransaccion());
/* 7368 */     System.out.println("idRemitente :" + inResEntVinc278.getIdRemitente());
/* 7369 */     System.out.println("idReceptor :" + inResEntVinc278.getIdReceptor());
/* 7370 */     System.out.println("feTransaccion :" + inResEntVinc278.getFeTransaccion());
/* 7371 */     System.out.println("hoTransaccion :" + inResEntVinc278.getHoTransaccion());
/* 7372 */     System.out.println("idCorrelativo :" + inResEntVinc278.getIdCorrelativo());
/* 7373 */     System.out.println("idTransaccion :" + inResEntVinc278.getIdTransaccion());
/* 7374 */     System.out.println("tiFinalidad :" + inResEntVinc278.getTiFinalidad());
/*      */     
/* 7376 */     System.out.println("respuesta :" + inResEntVinc278.getRespuesta());
/* 7377 */     System.out.println("msgRespuesta :" + inResEntVinc278.getMsgRespuesta());
/*      */   }
/*      */   
/*      */   private static void In271ConDtadComing(In271ConDtad in271ConDtad) {
/* 7381 */     System.out.println("-----------Data Entrante-----------");
/* 7382 */     System.out.println("noTransaccion :" + in271ConDtad.getNoTransaccion());
/* 7383 */     System.out.println("idRemitente :" + in271ConDtad.getIdRemitente());
/* 7384 */     System.out.println("idReceptor :" + in271ConDtad.getIdReceptor());
/* 7385 */     System.out.println("feTransaccion :" + in271ConDtad.getFeTransaccion());
/* 7386 */     System.out.println("hoTransaccion :" + in271ConDtad.getHoTransaccion());
/* 7387 */     System.out.println("idCorrelativo :" + in271ConDtad.getIdCorrelativo());
/* 7388 */     System.out.println("idTransaccion :" + in271ConDtad.getIdTransaccion());
/* 7389 */     System.out.println("tiFinalidad :" + in271ConDtad.getTiFinalidad());
/* 7390 */     System.out.println("caRemitente :" + in271ConDtad.getCaRemitente());
/* 7391 */     System.out.println("caReceptor :" + in271ConDtad.getCaReceptor());
/* 7392 */     System.out.println("rucReceptor :" + in271ConDtad.getNuRucReceptor());
/* 7393 */     System.out.println("caPaciente :" + in271ConDtad.getCaPaciente());
/* 7394 */     System.out.println("apPaternoPaciente :" + in271ConDtad.getApPaternoPaciente());
/* 7395 */     System.out.println("noPaciente :" + in271ConDtad.getNoPaciente());
/* 7396 */     System.out.println("coAfPaciente :" + in271ConDtad.getCoAfPaciente());
/* 7397 */     System.out.println("apMaternoPaciente :" + in271ConDtad.getApMaternoPaciente());
/* 7398 */     System.out.println("deDirPaciente1 :" + in271ConDtad.getDeDirPaciente1());
/* 7399 */     System.out.println("deDirPaciente2 :" + in271ConDtad.getDeDirPaciente2());
/* 7400 */     System.out.println("coUbigeoPaciente :" + in271ConDtad.getCoUbigeoPaciente());
/* 7401 */     System.out.println("noContacto :" + in271ConDtad.getNoContacto());
/* 7402 */     System.out.println("emContacto :" + in271ConDtad.getEmContacto());
/* 7403 */     System.out.println("nutelContacto :" + in271ConDtad.getNuTeContacto());
/* 7404 */     System.out.println("tiCaCalificador :" + in271ConDtad.getTiCaCalificador());
/* 7405 */     System.out.println("apPaNoEmCalificador :" + in271ConDtad.getApPaNoEmCalificador());
/* 7406 */     System.out.println("noEmLuAtencion :" + in271ConDtad.getNoEmCalificador());
/* 7407 */     System.out.println("coEmReLuAtencion :" + in271ConDtad.getApMaCalificador());
/*      */   }
/*      */   
/*      */   private static void In271ResDerivaComing(In271ResDeriva in271ResDeriva) {
/* 7411 */     System.out.println("-----------Data Entrante-----------");
/* 7412 */     System.out.println("noTransaccion :" + in271ResDeriva.getNoTransaccion());
/* 7413 */     System.out.println("idRemitente :" + in271ResDeriva.getIdRemitente());
/* 7414 */     System.out.println("idReceptor :" + in271ResDeriva.getIdReceptor());
/* 7415 */     System.out.println("feTransaccion :" + in271ResDeriva.getFeTransaccion());
/* 7416 */     System.out.println("hoTransaccion :" + in271ResDeriva.getHoTransaccion());
/* 7417 */     System.out.println("idCorrelativo :" + in271ResDeriva.getIdCorrelativo());
/* 7418 */     System.out.println("idTransaccion :" + in271ResDeriva.getIdTransaccion());
/* 7419 */     System.out.println("tiFinalidad :" + in271ResDeriva.getTiFinalidad());
/* 7420 */     System.out.println("caRemitente :" + in271ResDeriva.getCaRemitente());
/* 7421 */     System.out.println("caReceptor :" + in271ResDeriva.getCaReceptor());
/* 7422 */     System.out.println("rucReceptor :" + in271ResDeriva.getNuRucReceptor());
/*      */     
/* 7424 */     for (int i = 0; i < in271ResDeriva.getDetalles().size(); i++) {
/* 7425 */       System.out.println("----REGISTRO: " + (i + 1) + " ----");
/* 7426 */       System.out.println("caPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCaPaciente());
/* 7427 */       System.out.println("apPaternoPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getApPaternoPaciente());
/* 7428 */       System.out.println("noPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNoPaciente());
/* 7429 */       System.out.println("coAfPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoAfPaciente());
/* 7430 */       System.out.println("apMaternoPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getApMaternoPaciente());
/* 7431 */       System.out.println("coTiDoPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiDoPaciente());
/* 7432 */       System.out.println("nuDoPaciente :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuDoPaciente());
/* 7433 */       System.out.println("coParentesco :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoParentesco());
/* 7434 */       System.out.println("tiDoTrabajoAfiliado :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTiDoTrabajoAfiliado());
/* 7435 */       System.out.println("nuDoTrabajoAfiliado :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuDoTrabajoAfiliado());
/*      */       
/* 7437 */       System.out.println("nuAtencion :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNuAtencion());
/* 7438 */       System.out.println("teMsgLibre1 :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTeMsgLibre1());
/* 7439 */       System.out.println("coTiProducto :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiProducto());
/* 7440 */       System.out.println("deProducto :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getDeProducto());
/* 7441 */       System.out.println("coTiCobertura :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoTiCobertura());
/* 7442 */       System.out.println("coSubTiCobertura :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoSubTiCobertura());
/* 7443 */       System.out.println("feAtSalud :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getFeAtSalud());
/* 7444 */       System.out.println("noLuAtencion :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getNoLuAtencion());
/* 7445 */       System.out.println("coLuAtencion :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getCoLuAtencion());
/* 7446 */       System.out.println("tiDoContratante :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getTiDoContratante());
/* 7447 */       System.out.println("idCaReferencia :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getIdCaReferencia());
/* 7448 */       System.out.println("reIdContratante :" + ((In271ResDerivaDetalle)in271ResDeriva.getDetalles().get(i)).getReIdContratante());
/*      */     } 
/*      */   }
/*      */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\demo\TransaccionDemo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */