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
/*     */ public class InConNom271
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
/*  27 */   private ArrayList<InConNom271Detalle> inConNom271Detalles = new ArrayList<InConNom271Detalle>();
/*     */   private String nuControl;
/*     */   
/*     */   public String getNoTransaccion() {
/*  31 */     return this.noTransaccion;
/*     */   }
/*     */   private String nuControlST;
/*     */   public void setNoTransaccion(String noTransaccion) {
/*  35 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/*  39 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/*  43 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/*  47 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/*  51 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/*  55 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/*  59 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/*  63 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/*  67 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/*  71 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/*  75 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/*  79 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/*  83 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/*  87 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/*  91 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/*  95 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/*  99 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 103 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 107 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 111 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 115 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuControl() {
/* 119 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 123 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 127 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 131 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(InConNom271Detalle detalle) {
/* 135 */     this.inConNom271Detalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<InConNom271Detalle> getDetalles() {
/* 139 */     return this.inConNom271Detalles;
/*     */   }
/*     */   
/*     */   public ArrayList<InConNom271Detalle> getInConNom271Detalles() {
/* 143 */     return this.inConNom271Detalles;
/*     */   }
/*     */   
/*     */   public void setInConNom271Detalles(ArrayList<InConNom271Detalle> inConNom271Detalles) {
/* 147 */     this.inConNom271Detalles = inConNom271Detalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InConNom271.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */