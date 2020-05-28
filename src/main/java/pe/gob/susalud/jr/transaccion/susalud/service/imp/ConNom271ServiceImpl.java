/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ConNom271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConNom271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConNom271_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConNom271ServiceImpl
/*    */   implements ConNom271Service
/*    */ {
/*    */   public String beanToX12N(InConNom271 inConNom) {
/* 16 */     String sX12N = "";
/* 17 */     String validar = "";
/* 18 */     if (inConNom == null) {
/* 19 */       System.out.println("[Cod 0110] Bean InConCod271 nulo");
/*    */       
/* 21 */       sX12N = "0010";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 28 */       sX12N = ConNom271_ToX12N.traducirEstructura271(inConNom);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 33 */     return sX12N;
/*    */   }
/*    */   
/*    */   public InConNom271 x12NToBean(String sX12N) {
/* 37 */     InConNom271 inConNom = ConNom271_ToBean.traducirEstructura271(sX12N);
/* 38 */     return inConNom;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ConNom271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */