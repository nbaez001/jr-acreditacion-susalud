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
/*     */ public class InConProc271
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
/*  34 */   private ArrayList<InConProc271Detalle> inConProc271Detalles = new ArrayList<InConProc271Detalle>();
/*     */   private String nuControl;
/*     */   
/*     */   public String getNoTransaccion() {
/*  38 */     return this.noTransaccion;
/*     */   }
/*     */   private String nuControlST;
/*     */   public void setNoTransaccion(String noTransaccion) {
/*  42 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/*  46 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/*  50 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/*  54 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/*  58 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/*  62 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/*  66 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/*  70 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/*  74 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/*  78 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/*  82 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/*  86 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/*  90 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/*  94 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/*  98 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/* 102 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/* 106 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 110 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 114 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 118 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 122 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getCaPaciente() {
/* 126 */     return this.caPaciente;
/*     */   }
/*     */   
/*     */   public void setCaPaciente(String caPaciente) {
/* 130 */     this.caPaciente = caPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApPaternoPaciente() {
/* 134 */     return this.apPaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApPaternoPaciente(String apPaternoPaciente) {
/* 138 */     this.apPaternoPaciente = apPaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaciente() {
/* 142 */     return this.noPaciente;
/*     */   }
/*     */   
/*     */   public void setNoPaciente(String noPaciente) {
/* 146 */     this.noPaciente = noPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoAfPaciente() {
/* 150 */     return this.coAfPaciente;
/*     */   }
/*     */   
/*     */   public void setCoAfPaciente(String coAfPaciente) {
/* 154 */     this.coAfPaciente = coAfPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApMaternoPaciente() {
/* 158 */     return this.apMaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApMaternoPaciente(String apMaternoPaciente) {
/* 162 */     this.apMaternoPaciente = apMaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuControl() {
/* 166 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 170 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 174 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 178 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(InConProc271Detalle detalle) {
/* 182 */     this.inConProc271Detalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<InConProc271Detalle> getDetalles() {
/* 186 */     return this.inConProc271Detalles;
/*     */   }
/*     */   
/*     */   public ArrayList<InConProc271Detalle> getInConProc271Detalles() {
/* 190 */     return this.inConProc271Detalles;
/*     */   }
/*     */   
/*     */   public void setInConProc271Detalle(ArrayList<InConProc271Detalle> inConProc271Detalles) {
/* 194 */     this.inConProc271Detalles = inConProc271Detalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InConProc271.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */