/*     */ package pe.gob.susalud.jr.transaccion.susalud.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InConProc271Detalle
/*     */   implements Serializable
/*     */ {
/*     */   private String coInProcedimiento;
/*     */   private String coInRestriccion;
/*     */   private String coProcedimiento;
/*     */   private String imDeducible;
/*     */   private String poCuExDecimal;
/*     */   private String nuFrecuencia;
/*     */   private String coSexo;
/*     */   private String tiNuDias;
/*     */   private String teMsgObservacion;
/*     */   private String idFuentePE;
/*     */   private String coTiEspera;
/*     */   private String deTiEspera;
/*     */   private String feFinVigencia;
/*     */   private String teMsgTiEspera;
/*     */   private String idFuenteTE;
/*     */   private String coExCarencia;
/*     */   private String deExCarencia;
/*     */   private String teMsgExCarencia;
/*     */   private String idFuenteEC;
/*     */   
/*     */   public String getCoInProcedimiento() {
/*  32 */     return this.coInProcedimiento;
/*     */   }
/*     */   
/*     */   public void setCoInProcedimiento(String coInProcedimiento) {
/*  36 */     this.coInProcedimiento = coInProcedimiento.trim();
/*     */   }
/*     */   
/*     */   public String getCoInRestriccion() {
/*  40 */     return this.coInRestriccion;
/*     */   }
/*     */   
/*     */   public void setCoInRestriccion(String coInRestriccion) {
/*  44 */     this.coInRestriccion = coInRestriccion.trim();
/*     */   }
/*     */   
/*     */   public String getCoProcedimiento() {
/*  48 */     return this.coProcedimiento;
/*     */   }
/*     */   
/*     */   public void setCoProcedimiento(String coProcedimiento) {
/*  52 */     this.coProcedimiento = coProcedimiento.trim();
/*     */   }
/*     */   
/*     */   public String getImDeducible() {
/*  56 */     return this.imDeducible;
/*     */   }
/*     */   
/*     */   public void setImDeducible(String imDeducible) {
/*  60 */     this.imDeducible = imDeducible.trim();
/*     */   }
/*     */   
/*     */   public String getPoCuExDecimal() {
/*  64 */     return this.poCuExDecimal;
/*     */   }
/*     */   
/*     */   public void setPoCuExDecimal(String poCuExDecimal) {
/*  68 */     this.poCuExDecimal = poCuExDecimal.trim();
/*     */   }
/*     */   
/*     */   public String getNuFrecuencia() {
/*  72 */     return this.nuFrecuencia;
/*     */   }
/*     */   
/*     */   public void setNuFrecuencia(String nuFrecuencia) {
/*  76 */     this.nuFrecuencia = nuFrecuencia.trim();
/*     */   }
/*     */   
/*     */   public String getCoSexo() {
/*  80 */     return this.coSexo;
/*     */   }
/*     */   
/*     */   public void setCoSexo(String coSexo) {
/*  84 */     this.coSexo = coSexo.trim();
/*     */   }
/*     */   
/*     */   public String getTiNuDias() {
/*  88 */     return this.tiNuDias;
/*     */   }
/*     */   
/*     */   public void setTiNuDias(String tiNuDias) {
/*  92 */     this.tiNuDias = tiNuDias.trim();
/*     */   }
/*     */   
/*     */   public String getTeMsgObservacion() {
/*  96 */     return this.teMsgObservacion;
/*     */   }
/*     */   
/*     */   public void setTeMsgObservacion(String teMsgObservacion) {
/* 100 */     this.teMsgObservacion = teMsgObservacion.trim();
/*     */   }
/*     */   
/*     */   public String getIdFuentePE() {
/* 104 */     return this.idFuentePE;
/*     */   }
/*     */   
/*     */   public void setIdFuentePE(String idFuentePE) {
/* 108 */     this.idFuentePE = idFuentePE.trim();
/*     */   }
/*     */   
/*     */   public String getCoTiEspera() {
/* 112 */     return this.coTiEspera;
/*     */   }
/*     */   
/*     */   public void setCoTiEspera(String coTiEspera) {
/* 116 */     this.coTiEspera = coTiEspera.trim();
/*     */   }
/*     */   
/*     */   public String getDeTiEspera() {
/* 120 */     return this.deTiEspera;
/*     */   }
/*     */   
/*     */   public void setDeTiEspera(String deTiEspera) {
/* 124 */     this.deTiEspera = deTiEspera.trim();
/*     */   }
/*     */   
/*     */   public String getFeFinVigencia() {
/* 128 */     return this.feFinVigencia;
/*     */   }
/*     */   
/*     */   public void setFeFinVigencia(String feFinVigencia) {
/* 132 */     this.feFinVigencia = feFinVigencia.trim();
/*     */   }
/*     */   
/*     */   public String getTeMsgTiEspera() {
/* 136 */     return this.teMsgTiEspera;
/*     */   }
/*     */   
/*     */   public void setTeMsgTiEspera(String teMsgTiEspera) {
/* 140 */     this.teMsgTiEspera = teMsgTiEspera.trim();
/*     */   }
/*     */   
/*     */   public String getIdFuenteTE() {
/* 144 */     return this.idFuenteTE;
/*     */   }
/*     */   
/*     */   public void setIdFuenteTE(String idFuenteTE) {
/* 148 */     this.idFuenteTE = idFuenteTE.trim();
/*     */   }
/*     */   
/*     */   public String getCoExCarencia() {
/* 152 */     return this.coExCarencia;
/*     */   }
/*     */   
/*     */   public void setCoExCarencia(String coExCarencia) {
/* 156 */     this.coExCarencia = coExCarencia.trim();
/*     */   }
/*     */   
/*     */   public String getDeExCarencia() {
/* 160 */     return this.deExCarencia;
/*     */   }
/*     */   
/*     */   public void setDeExCarencia(String deExCarencia) {
/* 164 */     this.deExCarencia = deExCarencia.trim();
/*     */   }
/*     */   
/*     */   public String getTeMsgExCarencia() {
/* 168 */     return this.teMsgExCarencia;
/*     */   }
/*     */   
/*     */   public void setTeMsgExCarencia(String teMsgExCarencia) {
/* 172 */     this.teMsgExCarencia = teMsgExCarencia.trim();
/*     */   }
/*     */   
/*     */   public String getIdFuenteEC() {
/* 176 */     return this.idFuenteEC;
/*     */   }
/*     */   
/*     */   public void setIdFuenteEC(String idFuenteEC) {
/* 180 */     this.idFuenteEC = idFuenteEC.trim();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\bean\InConProc271Detalle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */