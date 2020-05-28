/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ConCod271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConCod271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConCod271_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConCod271ServiceImpl
/*    */   implements ConCod271Service
/*    */ {
/*    */   public String beanToX12N(InConCod271 inConCod) {
/* 16 */     String sX12N = "";
/* 17 */     String validar = "";
/* 18 */     if (inConCod == null) {
/* 19 */       System.out.println("[Cod 0110] Bean InConCod271 nulo");
/*    */       
/* 21 */       sX12N = "0010";
/*    */ 
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */ 
/*    */       
/* 30 */       sX12N = ConCod271_ToX12N.traducirEstructura271(inConCod);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 36 */     return sX12N;
/*    */   }
/*    */   
/*    */   public InConCod271 x12NToBean(String sX12N) {
/* 40 */     InConCod271 inConCod = ConCod271_ToBean.traducirEstructura271(sX12N);
/* 41 */     return inConCod;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ConCod271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */