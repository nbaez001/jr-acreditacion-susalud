/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConEntVinc278_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InConEntVinc278 inConEntVinc) {
/*  24 */     String sReturn = "", sReturn01 = "";
/*  25 */     inConEntVinc.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  26 */     inConEntVinc.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  28 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  29 */     subTrama_ISA.generaSubTrama(inConEntVinc.getIdRemitente(), inConEntVinc.getIdReceptor(), inConEntVinc.getFeTransaccion(), inConEntVinc.getHoTransaccion(), inConEntVinc.getIdCorrelativo());
/*  30 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  33 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  34 */     subTrama_GS.generaSubTrama("HB", inConEntVinc.getIdRemitente(), inConEntVinc.getIdReceptor(), inConEntVinc.getFeTransaccion(), inConEntVinc.getHoTransaccion(), inConEntVinc.getNuControl());
/*  35 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  39 */     subTrama_ST.generaSubTrama(inConEntVinc.getIdTransaccion(), inConEntVinc.getNuControlST(), "");
/*  40 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  43 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  44 */     subTrama_BHT.generaSubTrama("0020", inConEntVinc.getTiFinalidad());
/*  45 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  48 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  49 */     subTrama_HL.generaSubTrama("1", "20", "0");
/*  50 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  53 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  54 */     subTrama_NM1.generaSubTrama("IL", inConEntVinc.getCaIPRESS(), "", inConEntVinc.getNoIPRESS(), "", "", "");
/*  55 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  58 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  59 */     subTrama_REF1.generaSubTrama("DD", inConEntVinc.getTiDoIPRESS());
/*  60 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  63 */     SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/*  64 */     subTrama_REF1_4.generaSubTrama("XX5", inConEntVinc.getNuRucIPRESS());
/*  65 */     subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~"));
/*     */     
/*  76 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/*  79 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/*  80 */     subTrama_SE.generaSubTrama(canTxSE, inConEntVinc.getNuControlST());
/*  81 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/*  84 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/*  85 */     subTrama_GE.generaSubTrama(inConEntVinc.getNuControl());
/*  86 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/*  89 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/*  90 */     subTrama_IEA.generaSubTrama(inConEntVinc.getIdCorrelativo());
/*  91 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  97 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*  98 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 102 */     String[] arrayCadena = sReturn.split("\\~");
/* 103 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 104 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\ConEntVinc278_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */