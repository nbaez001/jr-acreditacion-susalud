/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.RegAfi271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.RegAfi271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.RegAfi271_ToX12N;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.validator.ConAseValidador;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RegAfi271ServiceImpl
/*    */   implements RegAfi271Service
/*    */ {
/*    */   private ConAseValidador consultaValidador;
/*    */   
/*    */   public String beanToX12N(InRegAfi271 inRegAfi271) {
/* 19 */     String sX12N = "";
/* 20 */     String validar = "";
/* 21 */     if (inRegAfi271 == null) {
/* 22 */       System.out.println("[Cod 0110] Bean InRegAfi271 nulo");
/*    */       
/* 24 */       sX12N = "0110";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 31 */       sX12N = RegAfi271_ToX12N.traducirEstructura271(inRegAfi271);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     return sX12N;
/*    */   }
/*    */   
/*    */   public InRegAfi271 x12NToBean(String sX12N) {
/* 41 */     InRegAfi271 inRegAfi = RegAfi271_ToBean.traducirEstructura271(sX12N);
/* 42 */     return inRegAfi;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\RegAfi271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */