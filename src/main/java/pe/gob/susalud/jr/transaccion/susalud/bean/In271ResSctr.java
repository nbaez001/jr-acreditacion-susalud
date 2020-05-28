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
/*     */ public class In271ResSctr
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
/*     */   private String caReceptor;
/*     */   private String nuRucReceptor;
/*     */   private String caPaciente;
/*     */   private String apPaternoPaciente;
/*     */   private String noPaciente;
/*     */   private String coAfPaciente;
/*     */   private String apMaternoPaciente;
/*     */   private String coTiDoPaciente;
/*     */   private String nuDocPaciente;
/*     */   private String nuControl;
/*     */   private String nuControlST;
/*  39 */   private ArrayList<In271ResSctrDetalle> in271ResSctrDetalles = new ArrayList<In271ResSctrDetalle>();
/*     */ 
/*     */   
/*     */   public String getNoTransaccion() {
/*  43 */     return this.noTransaccion;
/*     */   }
/*     */   
/*     */   public void setNoTransaccion(String noTransaccion) {
/*  47 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/*  51 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/*  55 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/*  59 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/*  63 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/*  67 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/*  71 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/*  75 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/*  79 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/*  83 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/*  87 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/*  91 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/*  95 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/*  99 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/* 103 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/* 107 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/* 111 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 115 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 119 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 123 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 127 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getCaPaciente() {
/* 131 */     return this.caPaciente;
/*     */   }
/*     */   
/*     */   public void setCaPaciente(String caPaciente) {
/* 135 */     this.caPaciente = caPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApPaternoPaciente() {
/* 139 */     return this.apPaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApPaternoPaciente(String apPaternoPaciente) {
/* 143 */     this.apPaternoPaciente = apPaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaciente() {
/* 147 */     return this.noPaciente;
/*     */   }
/*     */   
/*     */   public void setNoPaciente(String noPaciente) {
/* 151 */     this.noPaciente = noPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoAfPaciente() {
/* 155 */     return this.coAfPaciente;
/*     */   }
/*     */   
/*     */   public void setCoAfPaciente(String coAfPaciente) {
/* 159 */     this.coAfPaciente = coAfPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApMaternoPaciente() {
/* 163 */     return this.apMaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApMaternoPaciente(String apMaternoPaciente) {
/* 167 */     this.apMaternoPaciente = apMaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoTiDoPaciente() {
/* 171 */     return this.coTiDoPaciente;
/*     */   }
/*     */   
/*     */   public void setCoTiDoPaciente(String coTiDoPaciente) {
/* 175 */     this.coTiDoPaciente = coTiDoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuDocPaciente() {
/* 179 */     return this.nuDocPaciente;
/*     */   }
/*     */   
/*     */   public void setNuDocPaciente(String nuDocPaciente) {
/* 183 */     this.nuDocPaciente = nuDocPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuControl() {
/* 187 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 191 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 195 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 199 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(In271ResSctrDetalle detalle) {
/* 203 */     this.in271ResSctrDetalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<In271ResSctrDetalle> getDetalles() {
/* 207 */     return this.in271ResSctrDetalles;
/*     */   }
/*     */   
/*     */   public ArrayList<In271ResSctrDetalle> getIn271ResSctrDetalles() {
/* 211 */     return this.in271ResSctrDetalles;
/*     */   }
/*     */   
/*     */   public void setIn271ResSctrDetalle(ArrayList<In271ResSctrDetalle> in271ResSctrDetalles) {
/* 215 */     this.in271ResSctrDetalles = in271ResSctrDetalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\In271ResSctr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */