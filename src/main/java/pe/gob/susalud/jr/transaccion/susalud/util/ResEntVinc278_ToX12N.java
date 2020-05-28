/*    */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*    */ 
/*    */ import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_CRC;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_MSG;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*    */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ResEntVinc278_ToX12N
/*    */ {
/*    */   public static String traducirEstructura271(InResEntVinc278 inResEntVinc) {
/* 23 */     String sReturn = "", sReturn01 = "";
/* 24 */     inResEntVinc.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/* 25 */     inResEntVinc.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*    */ 
/*    */     
/* 28 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/* 29 */     subTrama_ISA.generaSubTrama(inResEntVinc.getIdRemitente(), inResEntVinc.getIdReceptor(), inResEntVinc.getFeTransaccion(), inResEntVinc.getHoTransaccion(), inResEntVinc.getIdCorrelativo());
/* 30 */     subTrama_ISA.completaLongitud();
/*    */ 
/*    */     
/* 33 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/* 34 */     subTrama_GS.generaSubTrama("HB", inResEntVinc.getIdRemitente(), inResEntVinc.getIdReceptor(), inResEntVinc.getFeTransaccion(), inResEntVinc.getHoTransaccion(), inResEntVinc.getNuControl());
/* 35 */     subTrama_GS.completaLongitud();
/*    */ 
/*    */     
/* 38 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/* 39 */     subTrama_ST.generaSubTrama(inResEntVinc.getIdTransaccion(), inResEntVinc.getNuControlST(), "");
/* 40 */     subTrama_ST.completaLongitud();
/*    */ 
/*    */     
/* 43 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/* 44 */     subTrama_BHT.generaSubTrama("0020", inResEntVinc.getTiFinalidad());
/* 45 */     subTrama_BHT.completaLongitud();
/*    */ 
/*    */     
/* 48 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/* 49 */     subTrama_HL.generaSubTrama("1", "20", "0");
/* 50 */     subTrama_HL.completaLongitud();
/*    */ 
/*    */     
/* 53 */     SubTrama_CRC SubTrama_CRC1 = new SubTrama_CRC();
/* 54 */     SubTrama_CRC1.generaSubTrama("ZZ", inResEntVinc.getRespuesta());
/* 55 */     SubTrama_CRC1.completaLongitud();
/*    */ 
/*    */     
/* 58 */     SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 59 */     subTrama_MSG1.generaSubTrama(inResEntVinc.getMsgRespuesta());
/* 60 */     subTrama_MSG1.completaLongitud();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 69 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + SubTrama_CRC1.returnComoString("CRC*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~");
/*    */     
/* 71 */     String canTxSE = cantidaSegementosTx(sReturn);
/*    */ 
/*    */     
/* 74 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 75 */     subTrama_SE.generaSubTrama(canTxSE, inResEntVinc.getNuControlST());
/* 76 */     subTrama_SE.completaLongitud();
/*    */ 
/*    */     
/* 79 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 80 */     subTrama_GE.generaSubTrama(inResEntVinc.getNuControl());
/* 81 */     subTrama_GE.completaLongitud();
/*    */ 
/*    */     
/* 84 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 85 */     subTrama_IEA.generaSubTrama(inResEntVinc.getIdCorrelativo());
/* 86 */     subTrama_IEA.completaLongitud();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 92 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 93 */     return sReturn01;
/*    */   }
/*    */   private static String cantidaSegementosTx(String sReturn) {
/* 96 */     String[] arrayCadena = sReturn.split("\\~");
/* 97 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 98 */     return longArray.toString();
/*    */   }
/*    */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ResEntVinc278_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */