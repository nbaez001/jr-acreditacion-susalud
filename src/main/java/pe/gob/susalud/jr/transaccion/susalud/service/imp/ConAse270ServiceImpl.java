/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ConAse270Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConAse270_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConAse270_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConAse270ServiceImpl
/*    */   implements ConAse270Service
/*    */ {
/*    */   public String beanToX12N(InConAse270 inConAse) {
/* 17 */     String sX12N = "";
/* 18 */     String validar = "";
/* 19 */     if (inConAse == null) {
/* 20 */       System.out.println("[Cod 0110] Bean inConAse nulo");
/*    */       
/* 22 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 29 */       sX12N = ConAse270_ToX12N.traducirEstructura270(inConAse);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 34 */     return sX12N;
/*    */   }
/*    */   public InConAse270 x12NToBean(String sX12N) {
/* 37 */     InConAse270 inConAse = ConAse270_ToBean.traducirEstructura270(sX12N);
/* 38 */     return inConAse;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ConAse270ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */