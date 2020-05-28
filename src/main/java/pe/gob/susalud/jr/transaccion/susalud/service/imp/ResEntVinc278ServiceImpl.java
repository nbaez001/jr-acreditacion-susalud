/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ResEntVinc278Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ResEntVinc278_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ResEntVinc278_ToX12N;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.validator.ConAseValidador;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResEntVinc278ServiceImpl
/*    */   implements ResEntVinc278Service
/*    */ {
/*    */   private ConAseValidador consultaValidador;
/*    */   
/*    */   public String beanToX12N(InResEntVinc278 inResEntVinc278) {
/* 18 */     String sX12N = "";
/* 19 */     String validar = "";
/* 20 */     if (inResEntVinc278 == null) {
/* 21 */       System.out.println("[Cod 0110] Bean inConAse nulo");
/*    */       
/* 23 */       sX12N = "0110";
/*    */     } else {
/* 25 */       System.out.println("El Bean inConAse es diferente a null");
/*    */ 
/*    */ 
/*    */       
/* 29 */       sX12N = ResEntVinc278_ToX12N.traducirEstructura271(inResEntVinc278);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 34 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public InResEntVinc278 x12NToBean(String sX12N) {
/* 39 */     InResEntVinc278 inResEntVinc278 = ResEntVinc278_ToBean.traducirEstructura271(sX12N);
/* 40 */     return inResEntVinc278;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ResEntVinc278ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */