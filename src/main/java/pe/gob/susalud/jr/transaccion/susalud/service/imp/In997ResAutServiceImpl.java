/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In997ResAut;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In997ResAutService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In997ResAut_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In997ResAut_ToXs12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class In997ResAutServiceImpl
/*    */   implements In997ResAutService
/*    */ {
/*    */   public String beanToX12N(In997ResAut in997ResAut) {
/* 18 */     String sX12N = "";
/* 19 */     sX12N = In997ResAut_ToXs12N.traducirEstructura997ResAut(in997ResAut);
/* 20 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In997ResAut x12NToBean(String sX12N) {
/* 25 */     In997ResAut in997ResAut = new In997ResAut();
/* 26 */     in997ResAut = In997ResAut_ToBean.traducirEstructura997ResAut(sX12N);
/* 27 */     return in997ResAut;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In997ResAutServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */