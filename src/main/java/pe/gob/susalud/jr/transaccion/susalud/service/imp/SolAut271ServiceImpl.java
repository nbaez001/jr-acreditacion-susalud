/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.SolAut271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.SolAut271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.SolAut271_ToX12N;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.validator.ConAseValidador;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SolAut271ServiceImpl
/*    */   implements SolAut271Service
/*    */ {
/*    */   private ConAseValidador consultaValidador;
/*    */   
/*    */   public String beanToX12N(InSolAut271 inSolAut271) {
/* 18 */     String sX12N = "";
/* 19 */     String validar = "";
/* 20 */     if (inSolAut271 == null) {
/* 21 */       System.out.println("[Cod 0110] Bean inConAse nulo");
/*    */       
/* 23 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 30 */       sX12N = SolAut271_ToX12N.traducirEstructura271(inSolAut271);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 35 */     return sX12N;
/*    */   }
/*    */   
/*    */   public InSolAut271 x12NToBean(String sX12N) {
/* 39 */     InSolAut271 inSolAut271 = SolAut271_ToBean.traducirEstructura271(sX12N);
/* 40 */     return inSolAut271;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\SolAut271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */