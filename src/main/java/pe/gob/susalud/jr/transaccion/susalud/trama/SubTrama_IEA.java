/*    */ package pe.gob.susalud.jr.transaccion.susalud.trama;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubTrama_IEA
/*    */   extends SubTrama
/*    */ {
/*    */   public SubTrama_IEA() {
/* 14 */     this.num_CamposSubTrama = 2;
/*    */     
/* 16 */     this.campoSubTrama[0] = new Campos();
/* 17 */     this.campoSubTrama[1] = new Campos();
/*    */     
/* 19 */     (this.campoSubTrama[0]).orden = 1;
/* 20 */     (this.campoSubTrama[0]).nombre = "IEA01";
/* 21 */     (this.campoSubTrama[0]).atributo = "Alfanumerico";
/* 22 */     (this.campoSubTrama[0]).ubicacionByte = 0;
/* 23 */     (this.campoSubTrama[0]).longitudmin = 1;
/* 24 */     (this.campoSubTrama[0]).longitudmax = 5;
/* 25 */     (this.campoSubTrama[0]).descripcion = "";
/* 26 */     (this.campoSubTrama[0]).contenido = "1";
/* 27 */     (this.campoSubTrama[0]).requerido = 1;
/* 28 */     (this.campoSubTrama[0]).validar = 0;
/*    */     
/* 30 */     (this.campoSubTrama[1]).orden = 2;
/* 31 */     (this.campoSubTrama[1]).nombre = "IEA02";
/* 32 */     (this.campoSubTrama[1]).atributo = "Numerico";
/* 33 */     (this.campoSubTrama[1]).ubicacionByte = 0;
/* 34 */     (this.campoSubTrama[1]).longitudmin = 9;
/* 35 */     (this.campoSubTrama[1]).longitudmax = 9;
/* 36 */     (this.campoSubTrama[1]).descripcion = "";
/* 37 */     (this.campoSubTrama[1]).contenido = "";
/* 38 */     (this.campoSubTrama[1]).requerido = 1;
/* 39 */     (this.campoSubTrama[1]).validar = 0;
/*    */   }
/*    */   
/*    */   public void generaSubTrama(String sIdCorrelativo) {
/* 43 */     (this.campoSubTrama[1]).contenido = sIdCorrelativo;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\trama\SubTrama_IEA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */