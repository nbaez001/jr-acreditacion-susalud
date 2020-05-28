/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConMed271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.ConMed271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConMed271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.ConMed271_ToX12N;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConMed271ServiceImpl
/*    */   implements ConMed271Service
/*    */ {
/*    */   public String beanToX12N(InConMed271 inConMed) {
/* 17 */     String sX12N = "";
/* 18 */     String validar = "";
/* 19 */     if (inConMed == null) {
/* 20 */       System.out.println("[Cod 0110] Bean InConMed271 nulo");
/*    */       
/* 22 */       sX12N = "0110";
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */       
/* 29 */       sX12N = ConMed271_ToX12N.traducirEstructura271(inConMed);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 34 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public InConMed271 x12NToBean(String sX12N) {
/* 39 */     InConMed271 inConMed = ConMed271_ToBean.traducirEstructura271(sX12N);
/* 40 */     return inConMed;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\ConMed271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */