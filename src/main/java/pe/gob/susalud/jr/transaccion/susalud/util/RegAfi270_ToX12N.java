/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;
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
/*     */ public class RegAfi270_ToX12N
/*     */ {
/*     */   public static String traducirEstructura270(InRegAfi270 inRegafi) {
/*  24 */     String sReturn = "", sReturn01 = "";
/*  25 */     inRegafi.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  26 */     inRegafi.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  28 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  29 */     subTrama_ISA.generaSubTrama(inRegafi.getIdRemitente(), inRegafi.getIdReceptor(), inRegafi.getFeTransaccion(), inRegafi.getHoTransaccion(), inRegafi.getIdCorrelativo());
/*  30 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  33 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  34 */     subTrama_GS.generaSubTrama("HS", inRegafi.getIdRemitente(), inRegafi.getIdReceptor(), inRegafi.getFeTransaccion(), inRegafi.getHoTransaccion(), inRegafi.getNuControl());
/*  35 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  39 */     subTrama_ST.generaSubTrama(inRegafi.getIdTransaccion(), inRegafi.getNuControlST(), "");
/*  40 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  43 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  44 */     subTrama_BHT.generaSubTrama("0022", inRegafi.getTiFinalidad());
/*  45 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  48 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  49 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  50 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  53 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  54 */     subTrama_NM1.generaSubTrama("PR", inRegafi.getCaRemitente(), "PI", inRegafi.getNuRucRemitente());
/*  55 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  58 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  59 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  60 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  63 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  64 */     subTrama_NM11.generaSubTrama("RGA", inRegafi.getCaReceptor(), inRegafi.getIdReceptor(), "", "", "", "");
/*  65 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  68 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  69 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/*  70 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  73 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  74 */     subTrama_NM12.generaSubTrama("IL", inRegafi.getCaPaciente(), inRegafi.getApPaternoPaciente(), inRegafi.getNoPaciente(), "", "", inRegafi.getApMaternoPaciente());
/*  75 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  78 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  79 */     subTrama_REF1.generaSubTrama("DD", inRegafi.getTiDocumento());
/*  80 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  83 */     SubTrama_REF4 subTrama_REF14 = new SubTrama_REF4();
/*  84 */     subTrama_REF14.generaSubTrama("4A", inRegafi.getNuDocumento());
/*  85 */     subTrama_REF14.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF14.returnComoString("", ":", "~"));
/*  99 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 102 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 103 */     subTrama_SE.generaSubTrama(canTxSE, inRegafi.getNuControlST());
/* 104 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 107 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 108 */     subTrama_GE.generaSubTrama(inRegafi.getNuControl());
/* 109 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 112 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 113 */     subTrama_IEA.generaSubTrama(inRegafi.getIdCorrelativo());
/* 114 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 121 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 125 */     String[] arrayCadena = sReturn.split("\\~");
/* 126 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 127 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\RegAfi270_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */