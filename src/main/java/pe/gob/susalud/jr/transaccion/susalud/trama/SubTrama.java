/*    */ package pe.gob.susalud.jr.transaccion.susalud.trama;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubTrama
/*    */ {
/* 10 */   int num_CamposSubTrama = 50;
/* 11 */   int longitud_SubTrama = 1000;
/* 12 */   String contenidoSubTrama = "";
/* 13 */   String codigoErrorSubtrama = "0000";
/* 14 */   Campos[] campoSubTrama = new Campos[120];
/*    */ 
/*    */   
/*    */   public void recibeContenidoSubTrama(String SubTramaEntradaTotal) {
/* 18 */     this.contenidoSubTrama = SubTramaEntradaTotal;
/*    */   }
/*    */   
/*    */   public void procesaSubTrama() {
/* 22 */     fijaLongitud();
/* 23 */     if (this.longitud_SubTrama <= this.contenidoSubTrama.length()) {
/*    */ 
/*    */ 
/*    */       
/* 27 */       for (int i = 0; i < this.num_CamposSubTrama; i++) {
/*    */         
/* 29 */         if (i == 0) {
/* 30 */           (this.campoSubTrama[i]).ubicacionByte = 0;
/* 31 */           (this.campoSubTrama[i]).orden = 1;
/*    */         } else {
/* 33 */           (this.campoSubTrama[i - 1]).ubicacionByte += (this.campoSubTrama[i - 1]).longitudmax;
/* 34 */           (this.campoSubTrama[i]).orden = i + 1;
/*    */         } 
/* 36 */         this.longitud_SubTrama = (this.campoSubTrama[i]).ubicacionByte + (this.campoSubTrama[i]).longitudmax;
/* 37 */         this.campoSubTrama[i].llenaCampo(this.contenidoSubTrama);
/*    */       } 
/*    */     } else {
/* 40 */       this.codigoErrorSubtrama = "5100";
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String returnComoString(String sPrefijo, String sCampo, String sSegmento) {
/* 46 */     String cadena = sPrefijo;
/* 47 */     for (int i1 = 0; i1 < this.num_CamposSubTrama - 1; i1++) {
/* 48 */       cadena = cadena + (this.campoSubTrama[i1]).contenido + sCampo;
/*    */     }
/* 50 */     cadena = cadena + (this.campoSubTrama[this.num_CamposSubTrama - 1]).contenido + sSegmento;
/* 51 */     return cadena;
/*    */   }
/*    */   
/*    */   public void imprimecampos() {
/* 55 */     int ini_ = 0;
/* 56 */     int fin_ = this.num_CamposSubTrama;
/* 57 */     for (int c_ont_aux = ini_; c_ont_aux < fin_; c_ont_aux++) {
/* 58 */       this.campoSubTrama[c_ont_aux].imprimeContenido();
/*    */     }
/*    */   }
/*    */   
/*    */   public void completaLongitud() {
/* 63 */     int ini_ = 0;
/* 64 */     int fin_ = this.num_CamposSubTrama;
/* 65 */     for (int c_ont_aux = ini_; c_ont_aux < fin_; c_ont_aux++) {
/* 66 */       this.campoSubTrama[c_ont_aux].completaLongitud();
/*    */     }
/*    */   }
/*    */   
/*    */   public void fijaLongitud() {
/* 71 */     this.longitud_SubTrama = 0;
/* 72 */     for (int i = 0; i < this.num_CamposSubTrama; i++) {
/* 73 */       this.longitud_SubTrama += (this.campoSubTrama[i]).longitudmax;
/*    */     }
/*    */   }
/*    */   
/*    */   public String getCampoSubTrama(int pos) {
/* 78 */     return (this.campoSubTrama[pos]).contenido.trim();
/*    */   }
/*    */   
/*    */   public void setCodigoErrorSubtrama(String error) {
/* 82 */     this.codigoErrorSubtrama = error;
/*    */   }
/*    */   
/*    */   public String getCodigoErrorSubtrama() {
/* 86 */     return this.codigoErrorSubtrama;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\trama\SubTrama.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */