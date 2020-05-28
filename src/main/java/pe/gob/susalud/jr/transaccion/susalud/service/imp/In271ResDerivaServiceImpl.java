/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In271ResDerivaService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ResDeriva_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ResDeriva_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class In271ResDerivaServiceImpl
/*    */   implements In271ResDerivaService
/*    */ {
/*    */   public String beanToX12N(In271ResDeriva in271ResDeriva) {
/* 18 */     String sX12N = "";
/* 19 */     String validar = "";
/* 20 */     if (in271ResDeriva == null) {
/* 21 */       System.out.println("[Cod 0110] Bean In271ResDeriva nulo");
/*    */       
/* 23 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 30 */       sX12N = In271ResDeriva_ToX12N.traducirEstructura278ResDeriva(in271ResDeriva);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 35 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In271ResDeriva x12NToBean(String sX12N) {
/* 40 */     In271ResDeriva in271ResDeriva = In271ResDeriva_ToBean.traducirEstructura271ResDeriva(sX12N);
/* 41 */     return in271ResDeriva;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In271ResDerivaServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */