/*    */ package pe.gob.susalud.jr.transaccion.susalud.trama;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Campos
/*    */ {
/*  9 */   int orden = 0;
/* 10 */   String nombre = "";
/* 11 */   String atributo = "";
/* 12 */   int ubicacionByte = 0;
/* 13 */   int longitudmin = 0;
/* 14 */   int longitudmax = 0;
/* 15 */   String descripcion = "";
/* 16 */   String contenido = "";
/* 17 */   int requerido = 1;
/* 18 */   int validar = 0;
/*    */ 
/*    */   
/*    */   void imprimeContenido() {
/* 22 */     char bitIni = '.';
/* 23 */     char bitFin = '.';
/* 24 */     System.out.println("(" + this.orden + ")" + this.nombre + "(" + this.atributo + ")(" + this.descripcion + ")[[" + this.ubicacionByte + "]:[" + this.longitudmin + "]:[" + this.longitudmax + "]:[" + this.requerido + "]" + bitIni + this.contenido + bitFin);
/*    */   }
/*    */ 
/*    */   
/*    */   void llenaCampo(String TramaLlegada) {
/* 29 */     this.contenido = TramaLlegada.substring(this.ubicacionByte, this.ubicacionByte + this.longitudmax);
/*    */   }
/*    */   
/*    */   void completaLongitud() {
/* 33 */     int longitudReal = 0;
/* 34 */     char vacio = ' ';
/*    */     
/* 36 */     if (this.contenido == null) { longitudReal = 0; }
/* 37 */     else { longitudReal = this.contenido.length(); }
/*    */     
/* 39 */     if (this.longitudmax < longitudReal || this.contenido == null) {
/* 40 */       if (this.atributo.equals("Numerico")) { this.contenido = "0"; }
/* 41 */       else if (this.atributo.equals("Alfanumerico")) { this.contenido = ""; }
/*    */     
/*    */     }
/* 44 */     for (int c_ont_aux = 0; c_ont_aux < this.longitudmax - longitudReal; c_ont_aux++) {
/* 45 */       if (this.atributo.equals("Numerico")) {
/* 46 */         vacio = '0';
/* 47 */         this.contenido = vacio + this.contenido;
/* 48 */       } else if (this.atributo.equals("Alfanumerico")) {
/* 49 */         vacio = ' ';
/* 50 */         this.contenido += vacio;
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\trama\Campos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */