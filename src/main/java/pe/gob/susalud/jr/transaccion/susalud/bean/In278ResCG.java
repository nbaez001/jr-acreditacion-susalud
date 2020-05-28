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
/*     */ public class In278ResCG
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
/*     */   private String nuControl;
/*     */   private String nuControlST;
/*  31 */   private ArrayList<In278ResCGDetalle> in278ResCGDetalles = new ArrayList<In278ResCGDetalle>();
/*     */ 
/*     */   
/*     */   public String getNoTransaccion() {
/*  35 */     return this.noTransaccion;
/*     */   }
/*     */   
/*     */   public void setNoTransaccion(String noTransaccion) {
/*  39 */     this.noTransaccion = noTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdRemitente() {
/*  43 */     return this.idRemitente;
/*     */   }
/*     */   
/*     */   public void setIdRemitente(String idRemitente) {
/*  47 */     this.idRemitente = idRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getIdReceptor() {
/*  51 */     return this.idReceptor;
/*     */   }
/*     */   
/*     */   public void setIdReceptor(String idReceptor) {
/*  55 */     this.idReceptor = idReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getFeTransaccion() {
/*  59 */     return this.feTransaccion;
/*     */   }
/*     */   
/*     */   public void setFeTransaccion(String feTransaccion) {
/*  63 */     this.feTransaccion = feTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getHoTransaccion() {
/*  67 */     return this.hoTransaccion;
/*     */   }
/*     */   
/*     */   public void setHoTransaccion(String hoTransaccion) {
/*  71 */     this.hoTransaccion = hoTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getIdCorrelativo() {
/*  75 */     return this.idCorrelativo;
/*     */   }
/*     */   
/*     */   public void setIdCorrelativo(String idCorrelativo) {
/*  79 */     this.idCorrelativo = idCorrelativo.trim();
/*     */   }
/*     */   
/*     */   public String getIdTransaccion() {
/*  83 */     return this.idTransaccion;
/*     */   }
/*     */   
/*     */   public void setIdTransaccion(String idTransaccion) {
/*  87 */     this.idTransaccion = idTransaccion.trim();
/*     */   }
/*     */   
/*     */   public String getTiFinalidad() {
/*  91 */     return this.tiFinalidad;
/*     */   }
/*     */   
/*     */   public void setTiFinalidad(String tiFinalidad) {
/*  95 */     this.tiFinalidad = tiFinalidad.trim();
/*     */   }
/*     */   
/*     */   public String getCaRemitente() {
/*  99 */     return this.caRemitente;
/*     */   }
/*     */   
/*     */   public void setCaRemitente(String caRemitente) {
/* 103 */     this.caRemitente = caRemitente.trim();
/*     */   }
/*     */   
/*     */   public String getCaReceptor() {
/* 107 */     return this.caReceptor;
/*     */   }
/*     */   
/*     */   public void setCaReceptor(String caReceptor) {
/* 111 */     this.caReceptor = caReceptor.trim();
/*     */   }
/*     */   
/*     */   public String getNuRucReceptor() {
/* 115 */     return this.nuRucReceptor;
/*     */   }
/*     */   
/*     */   public void setNuRucReceptor(String nuRucReceptor) {
/* 119 */     this.nuRucReceptor = nuRucReceptor.trim();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNuControl() {
/* 125 */     return this.nuControl;
/*     */   }
/*     */   
/*     */   public void setNuControl(String nuControl) {
/* 129 */     this.nuControl = nuControl.trim();
/*     */   }
/*     */   
/*     */   public String getNuControlST() {
/* 133 */     return this.nuControlST;
/*     */   }
/*     */   
/*     */   public void setNuControlST(String nuControlST) {
/* 137 */     this.nuControlST = nuControlST.trim();
/*     */   }
/*     */   
/*     */   public void addDetalle(In278ResCGDetalle detalle) {
/* 141 */     this.in278ResCGDetalles.add(detalle);
/*     */   }
/*     */   
/*     */   public List<In278ResCGDetalle> getDetalles() {
/* 145 */     return this.in278ResCGDetalles;
/*     */   }
/*     */   
/*     */   public ArrayList<In278ResCGDetalle> getIn278ResCGDetalles() {
/* 149 */     return this.in278ResCGDetalles;
/*     */   }
/*     */   
/*     */   public void setIn278ResCGDetalle(ArrayList<In278ResCGDetalle> in278ResCGDetalles) {
/* 153 */     this.in278ResCGDetalles = in278ResCGDetalles;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\In278ResCG.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */