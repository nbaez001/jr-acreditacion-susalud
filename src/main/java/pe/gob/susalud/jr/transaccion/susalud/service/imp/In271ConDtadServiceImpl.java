/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In271ConDtadService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConDtad_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConDtad_ToXs12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class In271ConDtadServiceImpl
/*    */   implements In271ConDtadService
/*    */ {
/*    */   public String beanToX12N(In271ConDtad in271ConDtad) {
/* 19 */     String sX12N = "";
/* 20 */     String validar = "";
/* 21 */     if (in271ConDtad == null) {
/* 22 */       System.out.println("[Cod 0110] Bean In271ConDtad nulo");
/*    */       
/* 24 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 31 */       sX12N = In271ConDtad_ToXs12N.traducirEstructura278ConDtad(in271ConDtad);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 36 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In271ConDtad x12NToBean(String sX12N) {
/* 41 */     In271ConDtad in271ConDtad = new In271ConDtad();
/* 42 */     in271ConDtad = In271ConDtad_ToBean.traducirEstructura278ConDtad(sX12N);
/* 43 */     return in271ConDtad;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In271ConDtadServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */