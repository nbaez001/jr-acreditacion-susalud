/*      */ package pe.gob.susalud.jr.transaccion.susalud.bean;
/*      */ 
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class InSolAut271
/*      */ {
/*  160 */   private ArrayList<InSolAutRes271Detalle> inSolAut271Detalle = new ArrayList<InSolAutRes271Detalle>();
/*  161 */   private ArrayList<InSolAutProEsp271Detalle> inSolAutProEsp271Detalle = new ArrayList<InSolAutProEsp271Detalle>();
/*  162 */   private ArrayList<InSolAutTieEsp271Detalle> inSolAutTieEsp271Detalle = new ArrayList<InSolAutTieEsp271Detalle>();
/*  163 */   private ArrayList<InSolAutExeCar271Detalle> inSolAutExeCar271Detalle = new ArrayList<InSolAutExeCar271Detalle>(); private String noTransaccion; private String idRemitente; private String idReceptor; private String feTransaccion; private String hoTransaccion; private String idCorrelativo; private String idTransaccion; private String tiFinalidad; private String caRemitente; private String nuRucRemitente; private String caReceptor; private String coAdmisionista; private String caPaciente; private String apPaternoPaciente; private String noPaciente; private String coAfPaciente; private String apMaternoPaciente; private String coEsPaciente; private String tiDoPaciente; private String nuDoPaciente; private String nuIdenEmpleador; private String nuContratoPaciente; private String nuPoliza; private String nuCertificado; private String coTiPolizaAfiliacion; private String coProducto; private String deProducto; private String nuPlan; private String tiPlanSalud; private String coMoneda; private String coParentesco; private String soBeneficio; private String nuSoBeneficio; private String coEspecialidad; private String feNacimiento; private String genero; private String esMarital; private String feIniVigencia; private String feFinVigencia; private String esCobertura; private String nuDecAccidente; private String idInfAccidente; private String deTiAccidente; private String feAfiliacion; private String feOcuAccidente; private String nuAtencion; private String idDerFarmacia; private String tiProducto; private String deProductoDeFarmacia;
/*      */   private String feAtencion;
/*      */   
/*      */   public String getNoTransaccion() {
/*  167 */     return this.noTransaccion;
/*      */   }
/*      */   private String nuCobertura; private String obsCobertura; private String msgObs; private String msgConEspeciales; private String caContratante; private String noPaContratante; private String noContratante; private String noMaContratante; private String tiDoContratante; private String idReContratante; private String coReContratante; private String caTitular; private String noPaTitular; private String noTitular; private String coAfTitular; private String noMaTitular; private String tiDoTitular; private String idReTitular; private String nuDoTitular; private String feIncTitular; private String nuCobPreExistencia; private String beMaxInicial; private String canServicio; private String idDeProducto; private String coTiCobertura; private String coSubTiCobertura; private String msgObsPre; private String msgConEspecialesPre; private String coTiMoneda; private String coPagoFijo; private String coCalServicio; private String canCalServicio; private String coPagoVariable; private String flagCG; private String deflagCG; private String feFinCarencia; private String feFinEspera; private String caRegafi; private String noPaRegafi; private String noRegafi; private String coAfRegafi; private String noMaRegafi; private String tiDoRegafi; private String idReRegafi; private String nuDoRegafi; private String feNaRegafi; private String geRegafi; private String coPaisRegafi; private String nuControl; private String nuControlST;
/*      */   public void setNoTransaccion(String noTransaccion) {
/*  171 */     this.noTransaccion = noTransaccion.trim();
/*      */   }
/*      */   
/*      */   public String getIdRemitente() {
/*  175 */     return this.idRemitente;
/*      */   }
/*      */   
/*      */   public void setIdRemitente(String idRemitente) {
/*  179 */     this.idRemitente = idRemitente.trim();
/*      */   }
/*      */   
/*      */   public String getIdReceptor() {
/*  183 */     return this.idReceptor;
/*      */   }
/*      */   
/*      */   public void setIdReceptor(String idReceptor) {
/*  187 */     this.idReceptor = idReceptor.trim();
/*      */   }
/*      */   
/*      */   public String getFeTransaccion() {
/*  191 */     return this.feTransaccion;
/*      */   }
/*      */   
/*      */   public void setFeTransaccion(String feTransaccion) {
/*  195 */     this.feTransaccion = feTransaccion.trim();
/*      */   }
/*      */   
/*      */   public String getHoTransaccion() {
/*  199 */     return this.hoTransaccion;
/*      */   }
/*      */   
/*      */   public void setHoTransaccion(String hoTransaccion) {
/*  203 */     this.hoTransaccion = hoTransaccion.trim();
/*      */   }
/*      */   
/*      */   public String getIdCorrelativo() {
/*  207 */     return this.idCorrelativo;
/*      */   }
/*      */   
/*      */   public void setIdCorrelativo(String idCorrelativo) {
/*  211 */     this.idCorrelativo = idCorrelativo.trim();
/*      */   }
/*      */   
/*      */   public String getIdTransaccion() {
/*  215 */     return this.idTransaccion;
/*      */   }
/*      */   
/*      */   public void setIdTransaccion(String idTransaccion) {
/*  219 */     this.idTransaccion = idTransaccion.trim();
/*      */   }
/*      */   
/*      */   public String getTiFinalidad() {
/*  223 */     return this.tiFinalidad;
/*      */   }
/*      */   
/*      */   public void setTiFinalidad(String tiFinalidad) {
/*  227 */     this.tiFinalidad = tiFinalidad.trim();
/*      */   }
/*      */   
/*      */   public String getCaRemitente() {
/*  231 */     return this.caRemitente;
/*      */   }
/*      */   
/*      */   public void setCaRemitente(String caRemitente) {
/*  235 */     this.caRemitente = caRemitente.trim();
/*      */   }
/*      */   
/*      */   public String getNuRucRemitente() {
/*  239 */     return this.nuRucRemitente;
/*      */   }
/*      */   
/*      */   public void setNuRucRemitente(String nuRucRemitente) {
/*  243 */     this.nuRucRemitente = nuRucRemitente.trim();
/*      */   }
/*      */   
/*      */   public String getCaReceptor() {
/*  247 */     return this.caReceptor;
/*      */   }
/*      */   
/*      */   public void setCaReceptor(String caReceptor) {
/*  251 */     this.caReceptor = caReceptor.trim();
/*      */   }
/*      */   
/*      */   public String getCoAdmisionista() {
/*  255 */     return this.coAdmisionista;
/*      */   }
/*      */   
/*      */   public void setCoAdmisionista(String coAdmisionista) {
/*  259 */     this.coAdmisionista = coAdmisionista.trim();
/*      */   }
/*      */   
/*      */   public String getCaPaciente() {
/*  263 */     return this.caPaciente;
/*      */   }
/*      */   
/*      */   public void setCaPaciente(String caPaciente) {
/*  267 */     this.caPaciente = caPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getApPaternoPaciente() {
/*  271 */     return this.apPaternoPaciente;
/*      */   }
/*      */   
/*      */   public void setApPaternoPaciente(String apPaternoPaciente) {
/*  275 */     this.apPaternoPaciente = apPaternoPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getNoPaciente() {
/*  279 */     return this.noPaciente;
/*      */   }
/*      */   
/*      */   public void setNoPaciente(String noPaciente) {
/*  283 */     this.noPaciente = noPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getCoAfPaciente() {
/*  287 */     return this.coAfPaciente;
/*      */   }
/*      */   
/*      */   public void setCoAfPaciente(String coAfPaciente) {
/*  291 */     this.coAfPaciente = coAfPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getApMaternoPaciente() {
/*  295 */     return this.apMaternoPaciente;
/*      */   }
/*      */   
/*      */   public void setApMaternoPaciente(String apMaternoPaciente) {
/*  299 */     this.apMaternoPaciente = apMaternoPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getCoEsPaciente() {
/*  303 */     return this.coEsPaciente;
/*      */   }
/*      */   
/*      */   public void setCoEsPaciente(String coEsPaciente) {
/*  307 */     this.coEsPaciente = coEsPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getTiDoPaciente() {
/*  311 */     return this.tiDoPaciente;
/*      */   }
/*      */   
/*      */   public void setTiDoPaciente(String tiDoPaciente) {
/*  315 */     this.tiDoPaciente = tiDoPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getNuDoPaciente() {
/*  319 */     return this.nuDoPaciente;
/*      */   }
/*      */   
/*      */   public void setNuDoPaciente(String nuDoPaciente) {
/*  323 */     this.nuDoPaciente = nuDoPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getNuIdenEmpleador() {
/*  327 */     return this.nuIdenEmpleador;
/*      */   }
/*      */   
/*      */   public void setNuIdenEmpleador(String nuIdenEmpleador) {
/*  331 */     this.nuIdenEmpleador = nuIdenEmpleador.trim();
/*      */   }
/*      */   
/*      */   public String getNuContratoPaciente() {
/*  335 */     return this.nuContratoPaciente;
/*      */   }
/*      */   
/*      */   public void setNuContratoPaciente(String nuContratoPaciente) {
/*  339 */     this.nuContratoPaciente = nuContratoPaciente.trim();
/*      */   }
/*      */   
/*      */   public String getNuPoliza() {
/*  343 */     return this.nuPoliza;
/*      */   }
/*      */   
/*      */   public void setNuPoliza(String nuPoliza) {
/*  347 */     this.nuPoliza = nuPoliza.trim();
/*      */   }
/*      */   
/*      */   public String getNuCertificado() {
/*  351 */     return this.nuCertificado;
/*      */   }
/*      */   
/*      */   public void setNuCertificado(String nuCertificado) {
/*  355 */     this.nuCertificado = nuCertificado.trim();
/*      */   }
/*      */   
/*      */   public String getCoTiPolizaAfiliacion() {
/*  359 */     return this.coTiPolizaAfiliacion;
/*      */   }
/*      */   
/*      */   public void setCoTiPolizaAfiliacion(String coTiPolizaAfiliacion) {
/*  363 */     this.coTiPolizaAfiliacion = coTiPolizaAfiliacion.trim();
/*      */   }
/*      */   
/*      */   public String getCoProducto() {
/*  367 */     return this.coProducto;
/*      */   }
/*      */   
/*      */   public void setCoProducto(String coProducto) {
/*  371 */     this.coProducto = coProducto.trim();
/*      */   }
/*      */   
/*      */   public String getDeProducto() {
/*  375 */     return this.deProducto;
/*      */   }
/*      */   
/*      */   public void setDeProducto(String deProducto) {
/*  379 */     this.deProducto = deProducto.trim();
/*      */   }
/*      */   
/*      */   public String getNuPlan() {
/*  383 */     return this.nuPlan;
/*      */   }
/*      */   
/*      */   public void setNuPlan(String nuPlan) {
/*  387 */     this.nuPlan = nuPlan.trim();
/*      */   }
/*      */   
/*      */   public String getTiPlanSalud() {
/*  391 */     return this.tiPlanSalud;
/*      */   }
/*      */   
/*      */   public void setTiPlanSalud(String tiPlanSalud) {
/*  395 */     this.tiPlanSalud = tiPlanSalud.trim();
/*      */   }
/*      */   
/*      */   public String getCoMoneda() {
/*  399 */     return this.coMoneda;
/*      */   }
/*      */   
/*      */   public void setCoMoneda(String coMoneda) {
/*  403 */     this.coMoneda = coMoneda.trim();
/*      */   }
/*      */   
/*      */   public String getCoParentesco() {
/*  407 */     return this.coParentesco;
/*      */   }
/*      */   
/*      */   public void setCoParentesco(String coParentesco) {
/*  411 */     this.coParentesco = coParentesco.trim();
/*      */   }
/*      */   
/*      */   public String getSoBeneficio() {
/*  415 */     return this.soBeneficio;
/*      */   }
/*      */   
/*      */   public void setSoBeneficio(String soBeneficio) {
/*  419 */     this.soBeneficio = soBeneficio.trim();
/*      */   }
/*      */   
/*      */   public String getNuSoBeneficio() {
/*  423 */     return this.nuSoBeneficio;
/*      */   }
/*      */   
/*      */   public void setNuSoBeneficio(String nuSoBeneficio) {
/*  427 */     this.nuSoBeneficio = nuSoBeneficio.trim();
/*      */   }
/*      */   
/*      */   public String getCoEspecialidad() {
/*  431 */     return this.coEspecialidad;
/*      */   }
/*      */   
/*      */   public void setCoEspecialidad(String coEspecialidad) {
/*  435 */     this.coEspecialidad = coEspecialidad.trim();
/*      */   }
/*      */   
/*      */   public String getFeNacimiento() {
/*  439 */     return this.feNacimiento;
/*      */   }
/*      */   
/*      */   public void setFeNacimiento(String feNacimiento) {
/*  443 */     this.feNacimiento = feNacimiento.trim();
/*      */   }
/*      */   
/*      */   public String getGenero() {
/*  447 */     return this.genero;
/*      */   }
/*      */   
/*      */   public void setGenero(String genero) {
/*  451 */     this.genero = genero.trim();
/*      */   }
/*      */   
/*      */   public String getEsMarital() {
/*  455 */     return this.esMarital;
/*      */   }
/*      */   
/*      */   public void setEsMarital(String esMarital) {
/*  459 */     this.esMarital = esMarital.trim();
/*      */   }
/*      */   
/*      */   public String getFeIniVigencia() {
/*  463 */     return this.feIniVigencia;
/*      */   }
/*      */   
/*      */   public void setFeIniVigencia(String feIniVigencia) {
/*  467 */     this.feIniVigencia = feIniVigencia.trim();
/*      */   }
/*      */   
/*      */   public String getFeFinVigencia() {
/*  471 */     return this.feFinVigencia;
/*      */   }
/*      */   
/*      */   public void setFeFinVigencia(String feFinVigencia) {
/*  475 */     this.feFinVigencia = feFinVigencia.trim();
/*      */   }
/*      */   
/*      */   public String getEsCobertura() {
/*  479 */     return this.esCobertura;
/*      */   }
/*      */   
/*      */   public void setEsCobertura(String esCobertura) {
/*  483 */     this.esCobertura = esCobertura.trim();
/*      */   }
/*      */   
/*      */   public String getNuDecAccidente() {
/*  487 */     return this.nuDecAccidente;
/*      */   }
/*      */   
/*      */   public void setNuDecAccidente(String nuDecAccidente) {
/*  491 */     this.nuDecAccidente = nuDecAccidente.trim();
/*      */   }
/*      */   
/*      */   public String getIdInfAccidente() {
/*  495 */     return this.idInfAccidente;
/*      */   }
/*      */   
/*      */   public void setIdInfAccidente(String idInfAccidente) {
/*  499 */     this.idInfAccidente = idInfAccidente.trim();
/*      */   }
/*      */   
/*      */   public String getDeTiAccidente() {
/*  503 */     return this.deTiAccidente;
/*      */   }
/*      */   
/*      */   public void setDeTiAccidente(String deTiAccidente) {
/*  507 */     this.deTiAccidente = deTiAccidente.trim();
/*      */   }
/*      */   
/*      */   public String getFeAfiliacion() {
/*  511 */     return this.feAfiliacion;
/*      */   }
/*      */   
/*      */   public void setFeAfiliacion(String feAfiliacion) {
/*  515 */     this.feAfiliacion = feAfiliacion.trim();
/*      */   }
/*      */   
/*      */   public String getFeOcuAccidente() {
/*  519 */     return this.feOcuAccidente;
/*      */   }
/*      */   
/*      */   public void setFeOcuAccidente(String feOcuAccidente) {
/*  523 */     this.feOcuAccidente = feOcuAccidente.trim();
/*      */   }
/*      */   
/*      */   public String getNuAtencion() {
/*  527 */     return this.nuAtencion;
/*      */   }
/*      */   
/*      */   public void setNuAtencion(String nuAtencion) {
/*  531 */     this.nuAtencion = nuAtencion.trim();
/*      */   }
/*      */   
/*      */   public String getIdDerFarmacia() {
/*  535 */     return this.idDerFarmacia;
/*      */   }
/*      */   
/*      */   public void setIdDerFarmacia(String idDerFarmacia) {
/*  539 */     this.idDerFarmacia = idDerFarmacia.trim();
/*      */   }
/*      */   
/*      */   public String getTiProducto() {
/*  543 */     return this.tiProducto;
/*      */   }
/*      */   
/*      */   public void setTiProducto(String tiProducto) {
/*  547 */     this.tiProducto = tiProducto.trim();
/*      */   }
/*      */   
/*      */   public String getDeProductoDeFarmacia() {
/*  551 */     return this.deProductoDeFarmacia;
/*      */   }
/*      */   
/*      */   public void setDeProductoDeFarmacia(String deProductoDeFarmacia) {
/*  555 */     this.deProductoDeFarmacia = deProductoDeFarmacia.trim();
/*      */   }
/*      */   
/*      */   public String getFeAtencion() {
/*  559 */     return this.feAtencion;
/*      */   }
/*      */   
/*      */   public void setFeAtencion(String feAtencion) {
/*  563 */     this.feAtencion = feAtencion.trim();
/*      */   }
/*      */   
/*      */   public String getNuCobertura() {
/*  567 */     return this.nuCobertura;
/*      */   }
/*      */   
/*      */   public void setNuCobertura(String nuCobertura) {
/*  571 */     this.nuCobertura = nuCobertura.trim();
/*      */   }
/*      */   
/*      */   public String getObsCobertura() {
/*  575 */     return this.obsCobertura;
/*      */   }
/*      */   
/*      */   public void setObsCobertura(String obsCobertura) {
/*  579 */     this.obsCobertura = obsCobertura.trim();
/*      */   }
/*      */   
/*      */   public String getMsgObs() {
/*  583 */     return this.msgObs;
/*      */   }
/*      */   
/*      */   public void setMsgObs(String msgObs) {
/*  587 */     this.msgObs = msgObs.trim();
/*      */   }
/*      */   
/*      */   public String getMsgConEspeciales() {
/*  591 */     return this.msgConEspeciales;
/*      */   }
/*      */   
/*      */   public void setMsgConEspeciales(String msgConEspeciales) {
/*  595 */     this.msgConEspeciales = msgConEspeciales.trim();
/*      */   }
/*      */   
/*      */   public String getCaContratante() {
/*  599 */     return this.caContratante;
/*      */   }
/*      */   
/*      */   public void setCaContratante(String caContratante) {
/*  603 */     this.caContratante = caContratante.trim();
/*      */   }
/*      */   
/*      */   public String getNoPaContratante() {
/*  607 */     return this.noPaContratante;
/*      */   }
/*      */   
/*      */   public void setNoPaContratante(String noPaContratante) {
/*  611 */     this.noPaContratante = noPaContratante.trim();
/*      */   }
/*      */   
/*      */   public String getNoContratante() {
/*  615 */     return this.noContratante;
/*      */   }
/*      */   
/*      */   public void setNoContratante(String noContratante) {
/*  619 */     this.noContratante = noContratante.trim();
/*      */   }
/*      */   
/*      */   public String getNoMaContratante() {
/*  623 */     return this.noMaContratante;
/*      */   }
/*      */   
/*      */   public void setNoMaContratante(String noMaContratante) {
/*  627 */     this.noMaContratante = noMaContratante.trim();
/*      */   }
/*      */   
/*      */   public String getTiDoContratante() {
/*  631 */     return this.tiDoContratante;
/*      */   }
/*      */   
/*      */   public void setTiDoContratante(String tiDoContratante) {
/*  635 */     this.tiDoContratante = tiDoContratante.trim();
/*      */   }
/*      */   
/*      */   public String getIdReContratante() {
/*  639 */     return this.idReContratante;
/*      */   }
/*      */   
/*      */   public void setIdReContratante(String idReContratante) {
/*  643 */     this.idReContratante = idReContratante.trim();
/*      */   }
/*      */   
/*      */   public String getCoReContratante() {
/*  647 */     return this.coReContratante;
/*      */   }
/*      */   
/*      */   public void setCoReContratante(String coReContratante) {
/*  651 */     this.coReContratante = coReContratante.trim();
/*      */   }
/*      */   
/*      */   public String getCaTitular() {
/*  655 */     return this.caTitular;
/*      */   }
/*      */   
/*      */   public void setCaTitular(String caTitular) {
/*  659 */     this.caTitular = caTitular.trim();
/*      */   }
/*      */   
/*      */   public String getNoPaTitular() {
/*  663 */     return this.noPaTitular;
/*      */   }
/*      */   
/*      */   public void setNoPaTitular(String noPaTitular) {
/*  667 */     this.noPaTitular = noPaTitular.trim();
/*      */   }
/*      */   
/*      */   public String getNoTitular() {
/*  671 */     return this.noTitular;
/*      */   }
/*      */   
/*      */   public void setNoTitular(String noTitular) {
/*  675 */     this.noTitular = noTitular.trim();
/*      */   }
/*      */   
/*      */   public String getCoAfTitular() {
/*  679 */     return this.coAfTitular;
/*      */   }
/*      */   
/*      */   public void setCoAfTitular(String coAfTitular) {
/*  683 */     this.coAfTitular = coAfTitular.trim();
/*      */   }
/*      */   
/*      */   public String getNoMaTitular() {
/*  687 */     return this.noMaTitular;
/*      */   }
/*      */   
/*      */   public void setNoMaTitular(String noMaTitular) {
/*  691 */     this.noMaTitular = noMaTitular.trim();
/*      */   }
/*      */   
/*      */   public String getTiDoTitular() {
/*  695 */     return this.tiDoTitular;
/*      */   }
/*      */   
/*      */   public void setTiDoTitular(String tiDoTitular) {
/*  699 */     this.tiDoTitular = tiDoTitular.trim();
/*      */   }
/*      */   
/*      */   public String getIdReTitular() {
/*  703 */     return this.idReTitular;
/*      */   }
/*      */   
/*      */   public void setIdReTitular(String idReTitular) {
/*  707 */     this.idReTitular = idReTitular.trim();
/*      */   }
/*      */   
/*      */   public String getNuDoTitular() {
/*  711 */     return this.nuDoTitular;
/*      */   }
/*      */   
/*      */   public void setNuDoTitular(String nuDoTitular) {
/*  715 */     this.nuDoTitular = nuDoTitular.trim();
/*      */   }
/*      */   
/*      */   public String getFeIncTitular() {
/*  719 */     return this.feIncTitular;
/*      */   }
/*      */   
/*      */   public void setFeIncTitular(String feIncTitular) {
/*  723 */     this.feIncTitular = feIncTitular.trim();
/*      */   }
/*      */   
/*      */   public String getNuCobPreExistencia() {
/*  727 */     return this.nuCobPreExistencia;
/*      */   }
/*      */   
/*      */   public void setNuCobPreExistencia(String nuCobPreExistencia) {
/*  731 */     this.nuCobPreExistencia = nuCobPreExistencia.trim();
/*      */   }
/*      */   
/*      */   public String getBeMaxInicial() {
/*  735 */     return this.beMaxInicial;
/*      */   }
/*      */   
/*      */   public void setBeMaxInicial(String beMaxInicial) {
/*  739 */     this.beMaxInicial = beMaxInicial.trim();
/*      */   }
/*      */   
/*      */   public String getCanServicio() {
/*  743 */     return this.canServicio;
/*      */   }
/*      */   
/*      */   public void setCanServicio(String canServicio) {
/*  747 */     this.canServicio = canServicio.trim();
/*      */   }
/*      */   
/*      */   public String getIdDeProducto() {
/*  751 */     return this.idDeProducto;
/*      */   }
/*      */   
/*      */   public void setIdDeProducto(String idDeProducto) {
/*  755 */     this.idDeProducto = idDeProducto.trim();
/*      */   }
/*      */   
/*      */   public String getCoTiCobertura() {
/*  759 */     return this.coTiCobertura;
/*      */   }
/*      */   
/*      */   public void setCoTiCobertura(String coTiCobertura) {
/*  763 */     this.coTiCobertura = coTiCobertura.trim();
/*      */   }
/*      */   
/*      */   public String getCoSubTiCobertura() {
/*  767 */     return this.coSubTiCobertura;
/*      */   }
/*      */   
/*      */   public void setCoSubTiCobertura(String coSubTiCobertura) {
/*  771 */     this.coSubTiCobertura = coSubTiCobertura.trim();
/*      */   }
/*      */   
/*      */   public String getMsgObsPre() {
/*  775 */     return this.msgObsPre;
/*      */   }
/*      */   
/*      */   public void setMsgObsPre(String msgObsPre) {
/*  779 */     this.msgObsPre = msgObsPre.trim();
/*      */   }
/*      */   
/*      */   public String getMsgConEspecialesPre() {
/*  783 */     return this.msgConEspecialesPre;
/*      */   }
/*      */   
/*      */   public void setMsgConEspecialesPre(String msgConEspecialesPre) {
/*  787 */     this.msgConEspecialesPre = msgConEspecialesPre.trim();
/*      */   }
/*      */   
/*      */   public String getCoTiMoneda() {
/*  791 */     return this.coTiMoneda;
/*      */   }
/*      */   
/*      */   public void setCoTiMoneda(String coTiMoneda) {
/*  795 */     this.coTiMoneda = coTiMoneda.trim();
/*      */   }
/*      */   
/*      */   public String getCoPagoFijo() {
/*  799 */     return this.coPagoFijo;
/*      */   }
/*      */   
/*      */   public void setCoPagoFijo(String coPagoFijo) {
/*  803 */     this.coPagoFijo = coPagoFijo.trim();
/*      */   }
/*      */   
/*      */   public String getCoCalServicio() {
/*  807 */     return this.coCalServicio;
/*      */   }
/*      */   
/*      */   public void setCoCalServicio(String coCalServicio) {
/*  811 */     this.coCalServicio = coCalServicio.trim();
/*      */   }
/*      */   
/*      */   public String getCanCalServicio() {
/*  815 */     return this.canCalServicio;
/*      */   }
/*      */   
/*      */   public void setCanCalServicio(String canCalServicio) {
/*  819 */     this.canCalServicio = canCalServicio.trim();
/*      */   }
/*      */   
/*      */   public String getCoPagoVariable() {
/*  823 */     return this.coPagoVariable;
/*      */   }
/*      */   
/*      */   public void setCoPagoVariable(String coPagoVariable) {
/*  827 */     this.coPagoVariable = coPagoVariable.trim();
/*      */   }
/*      */   
/*      */   public String getFlagCG() {
/*  831 */     return this.flagCG;
/*      */   }
/*      */   
/*      */   public void setFlagCG(String flagCG) {
/*  835 */     this.flagCG = flagCG.trim();
/*      */   }
/*      */   
/*      */   public String getDeflagCG() {
/*  839 */     return this.deflagCG;
/*      */   }
/*      */   
/*      */   public void setDeflagCG(String deflagCG) {
/*  843 */     this.deflagCG = deflagCG.trim();
/*      */   }
/*      */   
/*      */   public String getFeFinCarencia() {
/*  847 */     return this.feFinCarencia;
/*      */   }
/*      */   
/*      */   public void setFeFinCarencia(String feFinCarencia) {
/*  851 */     this.feFinCarencia = feFinCarencia.trim();
/*      */   }
/*      */   
/*      */   public String getFeFinEspera() {
/*  855 */     return this.feFinEspera;
/*      */   }
/*      */   
/*      */   public void setFeFinEspera(String feFinEspera) {
/*  859 */     this.feFinEspera = feFinEspera.trim();
/*      */   }
/*      */   
/*      */   public String getCaRegafi() {
/*  863 */     return this.caRegafi;
/*      */   }
/*      */   
/*      */   public void setCaRegafi(String caRegafi) {
/*  867 */     this.caRegafi = caRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getNoPaRegafi() {
/*  871 */     return this.noPaRegafi;
/*      */   }
/*      */   
/*      */   public void setNoPaRegafi(String noPaRegafi) {
/*  875 */     this.noPaRegafi = noPaRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getNoRegafi() {
/*  879 */     return this.noRegafi;
/*      */   }
/*      */   
/*      */   public void setNoRegafi(String noRegafi) {
/*  883 */     this.noRegafi = noRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getCoAfRegafi() {
/*  887 */     return this.coAfRegafi;
/*      */   }
/*      */   
/*      */   public void setCoAfRegafi(String coAfRegafi) {
/*  891 */     this.coAfRegafi = coAfRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getNoMaRegafi() {
/*  895 */     return this.noMaRegafi;
/*      */   }
/*      */   
/*      */   public void setNoMaRegafi(String noMaRegafi) {
/*  899 */     this.noMaRegafi = noMaRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getTiDoRegafi() {
/*  903 */     return this.tiDoRegafi;
/*      */   }
/*      */   
/*      */   public void setTiDoRegafi(String tiDoRegafi) {
/*  907 */     this.tiDoRegafi = tiDoRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getIdReRegafi() {
/*  911 */     return this.idReRegafi;
/*      */   }
/*      */   
/*      */   public void setIdReRegafi(String idReRegafi) {
/*  915 */     this.idReRegafi = idReRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getNuDoRegafi() {
/*  919 */     return this.nuDoRegafi;
/*      */   }
/*      */   
/*      */   public void setNuDoRegafi(String nuDoRegafi) {
/*  923 */     this.nuDoRegafi = nuDoRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getFeNaRegafi() {
/*  927 */     return this.feNaRegafi;
/*      */   }
/*      */   
/*      */   public void setFeNaRegafi(String feNaRegafi) {
/*  931 */     this.feNaRegafi = feNaRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getGeRegafi() {
/*  935 */     return this.geRegafi;
/*      */   }
/*      */   
/*      */   public void setGeRegafi(String geRegafi) {
/*  939 */     this.geRegafi = geRegafi.trim();
/*      */   }
/*      */   
/*      */   public String getCoPaisRegafi() {
/*  943 */     return this.coPaisRegafi;
/*      */   }
/*      */   
/*      */   public void setCoPaisRegafi(String coPaisRegafi) {
/*  947 */     this.coPaisRegafi = coPaisRegafi.trim();
/*      */   }
/*      */   
/*      */   public void addDetalle(InSolAutRes271Detalle detalle) {
/*  951 */     this.inSolAut271Detalle.add(detalle);
/*      */   }
/*      */   
/*      */   public List<InSolAutRes271Detalle> getDetalles() {
/*  955 */     return this.inSolAut271Detalle;
/*      */   }
/*      */   
/*      */   public ArrayList<InSolAutRes271Detalle> getInSolAut271Detalles() {
/*  959 */     return this.inSolAut271Detalle;
/*      */   }
/*      */   
/*      */   public void setInSolAut271Detalle(ArrayList<InSolAutRes271Detalle> inSolAut271Detalles) {
/*  963 */     this.inSolAut271Detalle = inSolAut271Detalles;
/*      */   }
/*      */   
/*      */   public void addDetalle(InSolAutProEsp271Detalle detalle) {
/*  967 */     this.inSolAutProEsp271Detalle.add(detalle);
/*      */   }
/*      */   
/*      */   public List<InSolAutProEsp271Detalle> getDetallesPE() {
/*  971 */     return this.inSolAutProEsp271Detalle;
/*      */   }
/*      */   
/*      */   public ArrayList<InSolAutProEsp271Detalle> getInSolAutProEsp271Detalles() {
/*  975 */     return this.inSolAutProEsp271Detalle;
/*      */   }
/*      */   
/*      */   public void setInSolAutProEsp271Detalle(ArrayList<InSolAutProEsp271Detalle> inSolAutProEsp271Detalles) {
/*  979 */     this.inSolAutProEsp271Detalle = inSolAutProEsp271Detalles;
/*      */   }
/*      */   
/*      */   public void addDetalle(InSolAutTieEsp271Detalle detalle) {
/*  983 */     this.inSolAutTieEsp271Detalle.add(detalle);
/*      */   }
/*      */   
/*      */   public List<InSolAutTieEsp271Detalle> getDetallesTE() {
/*  987 */     return this.inSolAutTieEsp271Detalle;
/*      */   }
/*      */   
/*      */   public ArrayList<InSolAutTieEsp271Detalle> getInSolAutTieEsp271Detalles() {
/*  991 */     return this.inSolAutTieEsp271Detalle;
/*      */   }
/*      */   
/*      */   public void setInSolAutTieEsp271Detalle(ArrayList<InSolAutTieEsp271Detalle> inSolAutTieEsp271Detalles) {
/*  995 */     this.inSolAutTieEsp271Detalle = inSolAutTieEsp271Detalles;
/*      */   }
/*      */   
/*      */   public void addDetalle(InSolAutExeCar271Detalle detalle) {
/*  999 */     this.inSolAutExeCar271Detalle.add(detalle);
/*      */   }
/*      */   
/*      */   public List<InSolAutExeCar271Detalle> getDetallesEC() {
/* 1003 */     return this.inSolAutExeCar271Detalle;
/*      */   }
/*      */   
/*      */   public ArrayList<InSolAutExeCar271Detalle> getInSolAutExeCar271Detalles() {
/* 1007 */     return this.inSolAutExeCar271Detalle;
/*      */   }
/*      */   
/*      */   public void setInSolAutExeCar271Detalle(ArrayList<InSolAutExeCar271Detalle> inSolAutExeCar271Detalles) {
/* 1011 */     this.inSolAutExeCar271Detalle = inSolAutExeCar271Detalles;
/*      */   }
/*      */   
/*      */   public String getNuControl() {
/* 1015 */     return this.nuControl;
/*      */   }
/*      */   
/*      */   public void setNuControl(String nuControl) {
/* 1019 */     this.nuControl = nuControl.trim();
/*      */   }
/*      */   
/*      */   public String getNuControlST() {
/* 1023 */     return this.nuControlST;
/*      */   }
/*      */   
/*      */   public void setNuControlST(String nuControlST) {
/* 1027 */     this.nuControlST = nuControlST.trim();
/*      */   }
/*      */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InSolAut271.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */