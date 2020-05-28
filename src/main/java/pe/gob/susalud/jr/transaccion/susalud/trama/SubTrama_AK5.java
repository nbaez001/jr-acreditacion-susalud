/*    */ package pe.gob.susalud.jr.transaccion.susalud.trama;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubTrama_AK5
/*    */   extends SubTrama
/*    */ {
/*    */   public SubTrama_AK5() {
/* 13 */     this.num_CamposSubTrama = 2;
/*    */     
/* 15 */     this.campoSubTrama[0] = new Campos();
/* 16 */     this.campoSubTrama[1] = new Campos();
/*    */     
/* 18 */     (this.campoSubTrama[0]).orden = 1;
/* 19 */     (this.campoSubTrama[0]).nombre = "AK501";
/* 20 */     (this.campoSubTrama[0]).atributo = "Alfanumerico";
/* 21 */     (this.campoSubTrama[0]).ubicacionByte = 0;
/* 22 */     (this.campoSubTrama[0]).longitudmin = 1;
/* 23 */     (this.campoSubTrama[0]).longitudmax = 1;
/* 24 */     (this.campoSubTrama[0]).descripcion = "CodigoIdRechazoTransaccion";
/* 25 */     (this.campoSubTrama[0]).contenido = "";
/* 26 */     (this.campoSubTrama[0]).requerido = 1;
/* 27 */     (this.campoSubTrama[0]).validar = 0;
/*    */     
/* 29 */     (this.campoSubTrama[1]).orden = 2;
/* 30 */     (this.campoSubTrama[1]).nombre = "AK502";
/* 31 */     (this.campoSubTrama[1]).atributo = "Alfanumerico";
/* 32 */     (this.campoSubTrama[1]).ubicacionByte = 0;
/* 33 */     (this.campoSubTrama[1]).longitudmin = 1;
/* 34 */     (this.campoSubTrama[1]).longitudmax = 3;
/* 35 */     (this.campoSubTrama[1]).descripcion = "idCodigoErrorENcontrado";
/* 36 */     (this.campoSubTrama[1]).contenido = "";
/* 37 */     (this.campoSubTrama[1]).requerido = 1;
/* 38 */     (this.campoSubTrama[1]).validar = 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public void generaSubTrama(String sParameter1, String sParameter2) {
/* 43 */     (this.campoSubTrama[0]).contenido = sParameter1;
/* 44 */     (this.campoSubTrama[1]).contenido = sParameter2;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\trama\SubTrama_AK5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */