/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.In271ConProcService;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConProc_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.In271ConProc_ToX12N;
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
/*    */ public class In271ConProcServiceImpl
/*    */   implements In271ConProcService
/*    */ {
/*    */   public String beanToX12N(InConProc271 in271ConProc) {
/* 22 */     String sX12N = "";
/* 23 */     String validar = "";
/* 24 */     if (in271ConProc == null) {
/* 25 */       System.out.println("[Cod 0110] Bean InConProc271 nulo");
/*    */       
/* 27 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 34 */       sX12N = In271ConProc_ToX12N.traducirEstructura278ConProc(in271ConProc);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 39 */     return sX12N;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public InConProc271 x12NToBean(String sX12N) {
/* 45 */     InConProc271 inConProc = In271ConProc_ToBean.traducirEstructura271ConProc(sX12N);
/* 46 */     return inConProc;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\In271ConProcServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */