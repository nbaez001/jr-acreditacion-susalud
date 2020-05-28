/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In997ResAut;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_AK1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_AK2;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_AK5;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_AK9;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In997ResAut_ToXs12N
/*     */ {
/*     */   public static String traducirEstructura997ResAut(In997ResAut in997ResAut) {
/*  24 */     String sReturn = "", sReturn01 = "";
/*  25 */     in997ResAut.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  26 */     in997ResAut.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  29 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  30 */     subTrama_ISA.generaSubTrama(in997ResAut.getIdRemitente(), in997ResAut.getIdReceptor(), in997ResAut
/*  31 */         .getFeTransaccion(), in997ResAut.getHoTransaccion(), in997ResAut
/*  32 */         .getIdCorrelativo());
/*  33 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  36 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  37 */     subTrama_GS.generaSubTrama("FA", in997ResAut.getIdRemitente(), in997ResAut.getIdReceptor(), in997ResAut
/*  38 */         .getFeTransaccion(), in997ResAut.getHoTransaccion(), in997ResAut
/*  39 */         .getNuControl());
/*  40 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  43 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  44 */     subTrama_ST.generaSubTrama(in997ResAut.getIdTransaccion(), in997ResAut.getNuControlST(), "");
/*  45 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  48 */     SubTrama_AK1 subTrama_AK1 = new SubTrama_AK1();
/*  49 */     subTrama_AK1.generaSubTrama("PO", in997ResAut.getNuControl(), in997ResAut.getNuAutorizacion());
/*  50 */     subTrama_AK1.completaLongitud();
/*     */ 
/*     */     
/*  53 */     SubTrama_AK2 subTrama_AK2 = new SubTrama_AK2();
/*  54 */     subTrama_AK2.generaSubTrama(in997ResAut.getIdTransaccion(), in997ResAut.getNuControlST(), in997ResAut.getCoSeguridad());
/*  55 */     subTrama_AK2.completaLongitud();
/*     */ 
/*     */     
/*  58 */     SubTrama_AK5 subTrama_AK5 = new SubTrama_AK5();
/*  59 */     subTrama_AK5.generaSubTrama(in997ResAut.getCoError(), in997ResAut.getInCoErrorEncontrado());
/*  60 */     subTrama_AK5.completaLongitud();
/*     */ 
/*     */     
/*  63 */     SubTrama_AK9 subTrama_AK9 = new SubTrama_AK9();
/*  64 */     subTrama_AK9.generaSubTrama(in997ResAut.getCoError(), "1", "1", "1");
/*  65 */     subTrama_AK9.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_AK1.returnComoString("AK1*", "*", "~") + subTrama_AK2.returnComoString("AK2*", "*", "~") + subTrama_AK5.returnComoString("AK5*", "*", "~") + subTrama_AK9.returnComoString("AK9*", "*", "~");
/*     */     
/*  76 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/*  79 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/*  80 */     subTrama_SE.generaSubTrama(canTxSE, in997ResAut.getNuControlST());
/*  81 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/*  84 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/*  85 */     subTrama_GE.generaSubTrama(in997ResAut.getNuControl());
/*  86 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/*  89 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/*  90 */     subTrama_IEA.generaSubTrama(in997ResAut.getIdCorrelativo());
/*  91 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*     */     
/*  99 */     return sReturn01;
/*     */   }
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 102 */     String[] arrayCadena = sReturn.split("\\~");
/* 103 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 104 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In997ResAut_ToXs12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */