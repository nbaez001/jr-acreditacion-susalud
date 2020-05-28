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
/*     */ public class InConMed271
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
/*     */   private String coPaciente;
/*     */   private String apMaternoPaciente;
/*  37 */   private ArrayList<InConMed271Detalle> inConMed271Detalles = new ArrayList<InConMed271Detalle>();
/*     */   private String nuControl;
/*     */   
/*     */   public String getNoTransaccion() {
/*  41 */     return this.noTransaccion;
/*     */   }
/*     */   private String nuControlST;
/*     */   public void setNoTransaccion(String noTransaccion) {
/*  45 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/*  49 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/*  53 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/*  57 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/*  61 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/*  65 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/*  69 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/*  73 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/*  77 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/*  81 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/*  85 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/*  89 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/*  93 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/*  97 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/* 101 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/* 105 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/* 109 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 113 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 117 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 121 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 125 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getCaPaciente() {
/* 129 */     return this.caPaciente;
/*     */   }
/*     */   
/*     */   public void setCaPaciente(String caPaciente) {
/* 133 */     this.caPaciente = caPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApPaternoPaciente() {
/* 137 */     return this.apPaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApPaternoPaciente(String apPaternoPaciente) {
/* 141 */     this.apPaternoPaciente = apPaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNoPaciente() {
/* 145 */     return this.noPaciente;
/*     */   }
/*     */   
/*     */   public void setNoPaciente(String noPaciente) {
/* 149 */     this.noPaciente = noPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getCoPaciente() {
/* 153 */     return this.coPaciente;
/*     */   }
/*     */   
/*     */   public void setCoPaciente(String coPaciente) {
/* 157 */     this.coPaciente = coPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getApMaternoPaciente() {
/* 161 */     return this.apMaternoPaciente;
/*     */   }
/*     */   
/*     */   public void setApMaternoPaciente(String apMaternoPaciente) {
/* 165 */     this.apMaternoPaciente = apMaternoPaciente.trim();
/*     */   }
/*     */   
/*     */   public String getNuControl() {
/* 169 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 173 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 177 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 181 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(InConMed271Detalle detalle) {
/* 185 */     this.inConMed271Detalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<InConMed271Detalle> getDetalles() {
/* 189 */     return this.inConMed271Detalles;
/*     */   }
/*     */   
/*     */   public ArrayList<InConMed271Detalle> getInConMed271Detalles() {
/* 193 */     return this.inConMed271Detalles;
/*     */   }
/*     */   
/*     */   public void setInConMed271Detalle(ArrayList<InConMed271Detalle> inConMed271Detalles) {
/* 197 */     this.inConMed271Detalles = inConMed271Detalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InConMed271.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */