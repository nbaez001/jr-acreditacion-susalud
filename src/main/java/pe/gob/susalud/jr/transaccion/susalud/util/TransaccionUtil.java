/*    */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*    */ 
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TransaccionUtil
/*    */ {
/*    */   public static String generarAleatorio(int iLimite, int iLongitud) {
/* 11 */     String sRetorno = "";
/* 12 */     Random r = new Random();
/*    */ 
/*    */     
/* 15 */     boolean flag = true;
/* 16 */     while (flag) {
/* 17 */       sRetorno = String.valueOf(r.nextInt(iLimite + 1));
/* 18 */       if (sRetorno.length() != iLongitud) { flag = true; continue; }
/* 19 */        flag = false;
/*    */     } 
/* 21 */     return sRetorno;
/*    */   }
/*    */   
/*    */   public static String generarAleatorioST(int iLimite, int iLongitud) {
/* 25 */     String sRetorno = "";
/* 26 */     Random r = new Random();
/*    */ 
/*    */     
/* 29 */     boolean flag = true;
/* 30 */     while (flag) {
/* 31 */       sRetorno = String.valueOf(r.nextInt(iLimite + 1));
/* 32 */       if (sRetorno.length() != iLongitud) { flag = true; continue; }
/* 33 */        flag = false;
/*    */     } 
/* 35 */     return sRetorno;
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\TransaccionUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */