/*    */ package pe.gob.susalud.jr.transaccion.susalud.service.imp;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InLogAcreInsert271;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.service.LogAcreInsert271Service;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.LogAcreInsert271_ToX12N;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.util.LogAcreInsertt271_ToBean;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.validator.ConAseValidador;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LogAcreInsert271ServiceImpl
/*    */   implements LogAcreInsert271Service
/*    */ {
/*    */   private ConAseValidador consultaValidador;
/*    */   
/*    */   public String beanToX12N(InLogAcreInsert271 inLogAcreInsert) {
/* 19 */     String sX12N = "";
/* 20 */     String validar = "";
/* 21 */     if (inLogAcreInsert == null) {
/* 22 */       System.out.println("[Cod 0110] Bean logAcreInsert nulo");
/*    */       
/* 24 */       sX12N = "0010";
/*    */ 
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */ 
/*    */       
/* 33 */       sX12N = LogAcreInsert271_ToX12N.traducirEstructura271(inLogAcreInsert);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 38 */     return sX12N;
/*    */   }
/*    */ 
/*    */   
/*    */   public InLogAcreInsert271 x12NToBean(String sX12N) {
/* 43 */     InLogAcreInsert271 inLogAcreInsert = LogAcreInsertt271_ToBean.traducirEstructura271(sX12N);
/* 44 */     return inLogAcreInsert;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\imp\LogAcreInsert271ServiceImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */