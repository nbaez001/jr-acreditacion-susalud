/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In278SolCGService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In278SolCG_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In278SolCG_ToX12N;
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
/*    */ public class In278SolCGServiceImpl
/*    */   implements In278SolCGService
/*    */ {
/*    */   public String beanToX12N(In278SolCG in278SolCG) {
/* 21 */     String sX12N = In278SolCG_ToX12N.traducirEstructura278Sol(in278SolCG);
/* 22 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public In278SolCG x12NToBean(String sX12N) {
/* 27 */     In278SolCG in278SolCG = new In278SolCG();
/* 28 */     in278SolCG = In278SolCG_ToBean.traducirEstructura278Sol(sX12N);
/* 29 */     return in278SolCG;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In278SolCGServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */