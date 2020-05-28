/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In278ResCGService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In278ResCG_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In278ResCG_ToX12N;
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
/*    */ public class In278ResCGServiceImpl
/*    */   implements In278ResCGService
/*    */ {
/*    */   public String beanToX12N(In278ResCG in278ResCG) {
/* 21 */     String sX12N = In278ResCG_ToX12N.traducirEstructura278Res(in278ResCG);
/* 22 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In278ResCG x12NToBena(String sX12N) {
/* 27 */     In278ResCG in278ResCG = new In278ResCG();
/* 28 */     in278ResCG = In278ResCG_ToBean.traducirEstructura278Res(sX12N);
/* 29 */     return in278ResCG;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In278ResCGServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */