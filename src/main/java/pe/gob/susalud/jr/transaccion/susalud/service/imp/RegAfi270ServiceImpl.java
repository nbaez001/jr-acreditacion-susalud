/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.RegAfi270Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.RegAfi270_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.RegAfi270_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RegAfi270ServiceImpl
/*    */   implements RegAfi270Service
/*    */ {
/*    */   public String beanToX12N(InRegAfi270 inRegAfi270) {
/* 16 */     String sX12N = "";
/* 17 */     String validar = "";
/* 18 */     if (inRegAfi270 == null) {
/* 19 */       System.out.println("[Cod 0110] Bean inRegAfi270 nulo");
/*    */       
/* 21 */       sX12N = "0110";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 28 */       sX12N = RegAfi270_ToX12N.traducirEstructura270(inRegAfi270);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 33 */     return sX12N;
/*    */   }
/*    */   
/*    */   public InRegAfi270 x12NToBean(String sX12N) {
/* 37 */     InRegAfi270 inRegAfi = RegAfi270_ToBean.traducirEstructura270(sX12N);
/* 38 */     return inRegAfi;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\RegAfi270ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */