/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctr;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In271ResSctrService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ResSctr_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ResSctr_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class In271ResSctrServiceImpl
/*    */   implements In271ResSctrService
/*    */ {
/*    */   public String In271ResSctr_ToX12N(In271ResSctr in271ResSctr) {
/* 19 */     String sX12N = "";
/* 20 */     String validar = "";
/* 21 */     if (in271ResSctr == null) {
/* 22 */       System.out.println("[Cod 0110] Bean In271ResSctr nulo");
/*    */       
/* 24 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 31 */       sX12N = In271ResSctr_ToX12N.traducirEstructura271ResSctr(in271ResSctr);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In271ResSctr In271ResSctr_ToBean(String sX12N) {
/* 43 */     In271ResSctr in271ResSctr = In271ResSctr_ToBean.traducirEstructura271ResSctr(sX12N);
/*    */     
/* 45 */     return in271ResSctr;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In271ResSctrServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */