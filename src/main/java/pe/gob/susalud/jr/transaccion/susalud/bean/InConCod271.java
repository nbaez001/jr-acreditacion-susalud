/*     */ package pe.gob.susalud.jr.transaccion.susalud.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InConCod271
/*     */ {
/*     */   private String noTransaccion;
/*     */   private String idRemitente;
/*     */   private String idReceptor;
/*     */   private String feTransaccion;
/*     */   private String hoTransaccion;
/*     */   private String idCorrelativo;
/*     */   private String idTransaccion;
/*     */   private String tiFinalidad;
/*     */   private String caRemitente;
/*     */   private String userRemitente;
/*     */   private String passRemitente;
/*     */   private String feUpFoto;
/*     */   private String caReceptor;
/*     */   private String nuRucReceptor;
/*     */   private String caPaciente;
/*     */   private String apPaternoPaciente;
/*     */   private String noPaciente;
/*     */   private String coAfPaciente;
/*     */   private String apMaternoPaciente;
/*     */   private String coEsPaciente;
/*     */   private String tiDoPaciente;
/*     */   private String nuDoPaciente;
/*     */   private String nuIdenPaciente;
/*     */   private String nuContratoPaciente;
/*     */   private String nuPoliza;
/*     */   private String nuCertificado;
/*     */   private String coTiPoliza;
/*     */   private String coProducto;
/*     */   private String deProducto;
/*     */   private String nuPlan;
/*     */   private String tiPlanSalud;
/*     */   private String coMoneda;
/*     */   private String coParentesco;
/*     */   private String soBeneficio;
/*     */   private String nuSoBeneficio;
/*     */   private String feNacimiento;
/*     */   private String genero;
/*     */   private String esMarital;
/*     */   private String feIniVigencia;
/*     */   private String feFinVigencia;
/*     */   private String tiCaContratante;
/*     */   private String noPaContratante;
/*     */   private String noContratante;
/*     */   private String noMaContratante;
/*     */   private String tiDoContratante;
/*     */   private String idReContratante;
/*     */   private String coReContratante;
/*     */   private String caTitular;
/*     */   private String noPaTitular;
/*     */   private String noTitular;
/*     */   private String coAfTitular;
/*     */   private String noMaTitular;
/*     */   private String tiDoTitular;
/*     */   private String nuDoTitular;
/*     */   private String feInsTitular;
/*     */   private String nuControl;
/*     */   private String nuControlST;
/*  82 */   private ArrayList<InConCod271Detalle> inConCod271Detalles = new ArrayList<InConCod271Detalle>();
/*     */ 
/*     */   
/*     */   public String getNuContratoPaciente() {
/*  86 */     return this.nuContratoPaciente;
/*     */   }
/*     */   
/*     */   public void setNuContratoPaciente(String nuContratoPaciente) {
/*  90 */     this.nuContratoPaciente = nuContratoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuPoliza() {
/*  94 */     return this.nuPoliza;
/*     */   }
/*     */   
/*     */   public void setNuPoliza(String nuPoliza) {
/*  98 */     this.nuPoliza = nuPoliza.trim();
/*     */   }
/*     */   
/*     */   public String getNuCertificado() {
/* 102 */     return this.nuCertificado;
/*     */   }
/*     */   
/*     */   public void setNuCertificado(String nuCertificado) {
/* 106 */     this.nuCertificado = nuCertificado.trim();
/*     */   }
/*     */   
/*     */   public String getCoTiPoliza() {
/* 110 */     return this.coTiPoliza;
/*     */   }
/*     */   
/*     */   public void setCoTiPoliza(String coTiPoliza) {
/* 114 */     this.coTiPoliza = coTiPoliza.trim();
/*     */   }
/*     */   
/*     */   public String getCoProducto() {
/* 118 */     return this.coProducto;
/*     */   }
/*     */   
/*     */   public void setCoProducto(String coProducto) {
/* 122 */     this.coProducto = coProducto.trim();
/*     */   }
/*     */   
/*     */   public String getDeProducto() {
/* 126 */     return this.deProducto;
/*     */   }
/*     */   
/*     */   public void setDeProducto(String deProducto) {
/* 130 */     this.deProducto = deProducto.trim();
/*     */   }
/*     */   
/*     */   public String getNuPlan() {
/* 134 */     return this.nuPlan;
/*     */   }
/*     */   
/*     */   public void setNuPlan(String nuPlan) {
/* 138 */     this.nuPlan = nuPlan.trim();
/*     */   }
/*     */   
/*     */   public String getTiPlanSalud() {
/* 142 */     return this.tiPlanSalud;
/*     */   }
/*     */   
/*     */   public void setTiPlanSalud(String tiPlanSalud) {
/* 146 */     this.tiPlanSalud = tiPlanSalud.trim();
/*     */   }
/*     */   
/*     */   public String getCoMoneda() {
/* 150 */     return this.coMoneda;
/*     */   }
/*     */   
/*     */   public void setCoMoneda(String coMoneda) {
/* 154 */     this.coMoneda = coMoneda.trim();
/*     */   }
/*     */   
/*     */   public String getCoParentesco() {
/* 158 */     return this.coParentesco;
/*     */   }
/*     */   
/*     */   public void setCoParentesco(String coParentesco) {
/* 162 */     this.coParentesco = coParentesco.trim();
/*     */   }
/*     */   
/*     */   public String getSoBeneficio() {
/* 166 */     return this.soBeneficio;
/*     */   }
/*     */   
/*     */   public void setSoBeneficio(String soBeneficio) {
/* 170 */     this.soBeneficio = soBeneficio.trim();
/*     */   }
/*     */   
/*     */   public String getNuSoBeneficio() {
/* 174 */     return this.nuSoBeneficio;
/*     */   }
/*     */   
/*     */   public void setNuSoBeneficio(String nuSoBeneficio) {
/* 178 */     this.nuSoBeneficio = nuSoBeneficio.trim();
/*     */   }
/*     */   
/*     */   public String getFeIniVigencia() {
/* 182 */     return this.feIniVigencia;
/*     */   }
/*     */   
/*     */   public void setFeIniVigencia(String feIniVigencia) {
/* 186 */     this.feIniVigencia = feIniVigencia.trim();
/*     */   }
/*     */   
/*     */   public String getFeFinVigencia() {
/* 190 */     return this.feFinVigencia;
/*     */   }
/*     */   
/*     */   public void setFeFinVigencia(String feFinVigencia) {
/* 194 */     this.feFinVigencia = feFinVigencia.trim();
/*     */   }
/*     */   
/*     */   public String getTiCaContratante() {
/* 198 */     return this.tiCaContratante;
/*     */   }
/*     */   
/*     */   public void setTiCaContratante(String tiCaContratante) {
/* 202 */     this.tiCaContratante = tiCaContratante.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaContratante() {
/* 206 */     return this.noPaContratante;
/*     */   }
/*     */   
/*     */   public void setNoPaContratante(String noPaContratante) {
/* 210 */     this.noPaContratante = noPaContratante.trim();
/*     */   }
/*     */   
/*     */   public String getNoContratante() {
/* 214 */     return this.noContratante;
/*     */   }
/*     */   
/*     */   public void setNoContratante(String noContratante) {
/* 218 */     this.noContratante = noContratante.trim();
/*     */   }
/*     */   
/*     */   public String getNoMaContratante() {
/* 222 */     return this.noMaContratante;
/*     */   }
/*     */   
/*     */   public void setNoMaContratante(String noMaContratante) {
/* 226 */     this.noMaContratante = noMaContratante.trim();
/*     */   }
/*     */   
/*     */   public String getTiDoContratante() {
/* 230 */     return this.tiDoContratante;
/*     */   }
/*     */   
/*     */   public void setTiDoContratante(String tiDoContratante) {
/* 234 */     this.tiDoContratante = tiDoContratante.trim();
/*     */   }
/*     */   
/*     */   public String getIdReContratante() {
/* 238 */     return this.idReContratante;
/*     */   }
/*     */   
/*     */   public void setIdReContratante(String idReContratante) {
/* 242 */     this.idReContratante = idReContratante.trim();
/*     */   }
/*     */   
/*     */   public String getCoReContratante() {
/* 246 */     return this.coReContratante;
/*     */   }
/*     */   
/*     */   public void setCoReContratante(String coReContratante) {
/* 250 */     this.coReContratante = coReContratante.trim();
/*     */   }
/*     */   
/*     */   public String getCaTitular() {
/* 254 */     return this.caTitular;
/*     */   }
/*     */   
/*     */   public void setCaTitular(String caTitular) {
/* 258 */     this.caTitular = caTitular.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaTitular() {
/* 262 */     return this.noPaTitular;
/*     */   }
/*     */   
/*     */   public void setNoPaTitular(String noPaTitular) {
/* 266 */     this.noPaTitular = noPaTitular.trim();
/*     */   }
/*     */   
/*     */   public String getNoTitular() {
/* 270 */     return this.noTitular;
/*     */   }
/*     */   
/*     */   public void setNoTitular(String noTitular) {
/* 274 */     this.noTitular = noTitular.trim();
/*     */   }
/*     */   
/*     */   public String getCoAfTitular() {
/* 278 */     return this.coAfTitular;
/*     */   }
/*     */   
/*     */   public void setCoAfTitular(String coAfTitular) {
/* 282 */     this.coAfTitular = coAfTitular.trim();
/*     */   }
/*     */   
/*     */   public String getNoMaTitular() {
/* 286 */     return this.noMaTitular;
/*     */   }
/*     */   
/*     */   public void setNoMaTitular(String noMaTitular) {
/* 290 */     this.noMaTitular = noMaTitular.trim();
/*     */   }
/*     */   
/*     */   public String getTiDoTitular() {
/* 294 */     return this.tiDoTitular;
/*     */   }
/*     */   
/*     */   public void setTiDoTitular(String tiDoTitular) {
/* 298 */     this.tiDoTitular = tiDoTitular.trim();
/*     */   }
/*     */   
/*     */   public String getNuDoTitular() {
/* 302 */     return this.nuDoTitular;
/*     */   }
/*     */   
/*     */   public void setNuDoTitular(String nuDoTitular) {
/* 306 */     this.nuDoTitular = nuDoTitular.trim();
/*     */   }
/*     */   
/*     */   public String getFeInsTitular() {
/* 310 */     return this.feInsTitular;
/*     */   }
/*     */   
/*     */   public void setFeInsTitular(String feInsTitular) {
/* 314 */     this.feInsTitular = feInsTitular.trim();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNoTransaccion() {
/* 319 */     return this.noTransaccion;
/*     */   }
/*     */   
/*     */   public void setNoTransaccion(String noTransaccion) {
/* 323 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/* 327 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/* 331 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/* 335 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/* 339 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/* 343 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/* 347 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/* 351 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/* 355 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/* 359 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/* 363 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/* 367 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/* 371 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/* 375 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/* 379 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/* 383 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/* 387 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getUserRemitente() {
/* 391 */     return this.userRemitente;
/*     */   }
/*     */   
/*     */   public void setUserRemitente(String userRemitente) {
/* 395 */     this.userRemitente = userRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getPassRemitente() {
/* 399 */     return this.passRemitente;
/*     */   }
/*     */   
/*     */   public void setPassRemitente(String passRemitente) {
/* 403 */     this.passRemitente = passRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 407 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 411 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeUpFoto() {
/* 415 */     return this.feUpFoto;
/*     */   }
/*     */   
/*     */   public void setFeUpFoto(String feUpFoto) {
/* 419 */     this.feUpFoto = feUpFoto.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 423 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 427 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getCaPaciente() {
/* 431 */     return this.caPaciente;
/*     */   }
/*     */   
/*     */   public void setCaPaciente(String caPaciente) {
/* 435 */     this.caPaciente = caPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApPaternoPaciente() {
/* 439 */     return this.apPaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApPaternoPaciente(String apPaternoPaciente) {
/* 443 */     this.apPaternoPaciente = apPaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaciente() {
/* 447 */     return this.noPaciente;
/*     */   }
/*     */   
/*     */   public void setNoPaciente(String noPaciente) {
/* 451 */     this.noPaciente = noPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoAfPaciente() {
/* 455 */     return this.coAfPaciente;
/*     */   }
/*     */   
/*     */   public void setCoAfPaciente(String coAfPaciente) {
/* 459 */     this.coAfPaciente = coAfPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApMaternoPaciente() {
/* 463 */     return this.apMaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApMaternoPaciente(String apMaternoPaciente) {
/* 467 */     this.apMaternoPaciente = apMaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoEsPaciente() {
/* 471 */     return this.coEsPaciente;
/*     */   }
/*     */   
/*     */   public void setCoEsPaciente(String coEsPaciente) {
/* 475 */     this.coEsPaciente = coEsPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getTiDoPaciente() {
/* 479 */     return this.tiDoPaciente;
/*     */   }
/*     */   
/*     */   public void setTiDoPaciente(String tiDoPaciente) {
/* 483 */     this.tiDoPaciente = tiDoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuDoPaciente() {
/* 487 */     return this.nuDoPaciente;
/*     */   }
/*     */   
/*     */   public void setNuDoPaciente(String nuDoPaciente) {
/* 491 */     this.nuDoPaciente = nuDoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuIdenPaciente() {
/* 495 */     return this.nuIdenPaciente;
/*     */   }
/*     */   
/*     */   public void setNuIdenPaciente(String nuIdenPaciente) {
/* 499 */     this.nuIdenPaciente = nuIdenPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getGenero() {
/* 503 */     return this.genero;
/*     */   }
/*     */   
/*     */   public void setGenero(String genero) {
/* 507 */     this.genero = genero.trim();
/*     */   }
/*     */   
/*     */   public String getEsMarital() {
/* 511 */     return this.esMarital;
/*     */   }
/*     */   
/*     */   public void setEsMarital(String esMarital) {
/* 515 */     this.esMarital = esMarital.trim();
/*     */   }
/*     */   
/*     */   public String getFeNacimiento() {
/* 519 */     return this.feNacimiento;
/*     */   }
/*     */   
/*     */   public void setFeNacimiento(String feNacimiento) {
/* 523 */     this.feNacimiento = feNacimiento.trim();
/*     */   }
/*     */   
/*     */   public String getNuControl() {
/* 527 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 531 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 535 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 539 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(InConCod271Detalle detalle) {
/* 543 */     this.inConCod271Detalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<InConCod271Detalle> getDetalles() {
/* 547 */     return this.inConCod271Detalles;
/*     */   }
/*     */   
/*     */   public ArrayList<InConCod271Detalle> getInConCod271Detalles() {
/* 551 */     return this.inConCod271Detalles;
/*     */   }
/*     */   
/*     */   public void setInConCod271Detalle(ArrayList<InConCod271Detalle> inConCod271Detalles) {
/* 555 */     this.inConCod271Detalles = inConCod271Detalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InConCod271.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */