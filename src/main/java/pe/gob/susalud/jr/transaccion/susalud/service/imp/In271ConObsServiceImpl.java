/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConObs;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In271ConObsService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConObs_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConObs_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class In271ConObsServiceImpl
/*    */   implements In271ConObsService
/*    */ {
/*    */   public String beanToX12N(In271ConObs inConObs) {
/* 22 */     String sX12N = "";
/* 23 */     String validar = "";
/* 24 */     if (inConObs == null) {
/* 25 */       System.out.println("[Cod 0110] Bean In271ConObs nulo");
/*    */       
/* 27 */       sX12N = "0010";
/*    */ 
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */ 
/*    */       
/* 36 */       sX12N = In271ConObs_ToX12N.traducirEstructura278ConObs(inConObs);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 41 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In271ConObs x12NToBean(String sX12N) {
/* 46 */     In271ConObs in271ConObs = new In271ConObs();
/* 47 */     in271ConObs = In271ConObs_ToBean.traducirEstructura271ConObs(sX12N);
/* 48 */     return in271ConObs;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In271ConObsServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */