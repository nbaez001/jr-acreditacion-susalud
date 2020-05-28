/*    */ package pe.gob.susalud.jr.transaccion.susalud.trama;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SubTrama_HL
/*    */   extends SubTrama
/*    */ {
/*    */   public SubTrama_HL() {
/* 14 */     this.num_CamposSubTrama = 4;
/*    */     
/* 16 */     this.campoSubTrama[0] = new Campos();
/* 17 */     this.campoSubTrama[1] = new Campos();
/* 18 */     this.campoSubTrama[2] = new Campos();
/* 19 */     this.campoSubTrama[3] = new Campos();
/*    */     
/* 21 */     (this.campoSubTrama[0]).orden = 1;
/* 22 */     (this.campoSubTrama[0]).nombre = "HL01";
/* 23 */     (this.campoSubTrama[0]).atributo = "Alfanumerico";
/* 24 */     (this.campoSubTrama[0]).ubicacionByte = 0;
/* 25 */     (this.campoSubTrama[0]).longitudmin = 1;
/* 26 */     (this.campoSubTrama[0]).longitudmax = 12;
/* 27 */     (this.campoSubTrama[0]).descripcion = "";
/* 28 */     (this.campoSubTrama[0]).contenido = "1";
/* 29 */     (this.campoSubTrama[0]).requerido = 1;
/* 30 */     (this.campoSubTrama[0]).validar = 0;
/*    */     
/* 32 */     (this.campoSubTrama[1]).orden = 2;
/* 33 */     (this.campoSubTrama[1]).nombre = "HL02";
/* 34 */     (this.campoSubTrama[1]).atributo = "Alfanumerico";
/* 35 */     (this.campoSubTrama[1]).ubicacionByte = 0;
/* 36 */     (this.campoSubTrama[1]).longitudmin = 1;
/* 37 */     (this.campoSubTrama[1]).longitudmax = 12;
/* 38 */     (this.campoSubTrama[1]).descripcion = "";
/* 39 */     (this.campoSubTrama[1]).contenido = "";
/* 40 */     (this.campoSubTrama[1]).requerido = 1;
/* 41 */     (this.campoSubTrama[1]).validar = 0;
/*    */     
/* 43 */     (this.campoSubTrama[2]).orden = 3;
/* 44 */     (this.campoSubTrama[2]).nombre = "HL03";
/* 45 */     (this.campoSubTrama[2]).atributo = "Numerico";
/* 46 */     (this.campoSubTrama[2]).ubicacionByte = 0;
/* 47 */     (this.campoSubTrama[2]).longitudmin = 1;
/* 48 */     (this.campoSubTrama[2]).longitudmax = 2;
/* 49 */     (this.campoSubTrama[2]).descripcion = "";
/* 50 */     (this.campoSubTrama[2]).contenido = "20";
/* 51 */     (this.campoSubTrama[2]).requerido = 1;
/* 52 */     (this.campoSubTrama[2]).validar = 0;
/*    */     
/* 54 */     (this.campoSubTrama[3]).orden = 4;
/* 55 */     (this.campoSubTrama[3]).nombre = "HL04";
/* 56 */     (this.campoSubTrama[3]).atributo = "Numerico";
/* 57 */     (this.campoSubTrama[3]).ubicacionByte = 0;
/* 58 */     (this.campoSubTrama[3]).longitudmin = 1;
/* 59 */     (this.campoSubTrama[3]).longitudmax = 1;
/* 60 */     (this.campoSubTrama[3]).descripcion = "";
/* 61 */     (this.campoSubTrama[3]).contenido = "1";
/* 62 */     (this.campoSubTrama[3]).requerido = 1;
/* 63 */     (this.campoSubTrama[3]).validar = 0;
/*    */   }
/*    */   
/*    */   public void generaSubTrama(String sNuJerarquico, String sCoJerarquico, String sCoIndicador) {
/* 67 */     (this.campoSubTrama[0]).contenido = sNuJerarquico;
/* 68 */     (this.campoSubTrama[2]).contenido = sCoJerarquico;
/* 69 */     (this.campoSubTrama[3]).contenido = sCoIndicador;
/*    */   }
/*    */   
/*    */   public void generaSubTrama(String sNuJerarquico, String sNuPadreJerarquico, String sCoJerarquico, String sCoIndicaSegmentos) {
/* 73 */     (this.campoSubTrama[0]).contenido = sNuJerarquico;
/* 74 */     (this.campoSubTrama[1]).contenido = sNuPadreJerarquico;
/* 75 */     (this.campoSubTrama[2]).contenido = sCoJerarquico;
/* 76 */     (this.campoSubTrama[3]).contenido = sCoIndicaSegmentos;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\trama\SubTrama_HL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */