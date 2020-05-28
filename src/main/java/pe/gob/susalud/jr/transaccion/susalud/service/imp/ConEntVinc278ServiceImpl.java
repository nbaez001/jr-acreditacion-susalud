/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ConEntVinc278Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConEntVinc278_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConEntVinc278_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConEntVinc278ServiceImpl
/*    */   implements ConEntVinc278Service
/*    */ {
/*    */   public String beanToX12N(InConEntVinc278 insolEntVinc270) {
/* 16 */     String sX12N = "";
/* 17 */     String validar = "";
/* 18 */     if (insolEntVinc270 == null) {
/* 19 */       System.out.println("[Cod 0110] Bean InConEntVinc278 nulo");
/*    */       
/* 21 */       sX12N = "0010";
/*    */     } else {
/* 23 */       System.out.println("El Bean InConEntVinc278 es diferente a null");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 29 */       sX12N = ConEntVinc278_ToX12N.traducirEstructura271(insolEntVinc270);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 34 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public InConEntVinc278 x12NToBean(String sX12N) {
/* 39 */     InConEntVinc278 insolEntVinc270 = ConEntVinc278_ToBean.traducirEstructura271(sX12N);
/* 40 */     return insolEntVinc270;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ConEntVinc278ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */