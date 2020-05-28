/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In278SolCG_ToX12N
/*     */ {
/*     */   public static String traducirEstructura278Sol(In278SolCG in278SolCG) {
/*  28 */     int caSeTransacciones = 0;
/*  29 */     String sReturn = "", sReturn01 = "";
/*  30 */     in278SolCG.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  31 */     in278SolCG.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  34 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  35 */     subTrama_ISA.generaSubTrama(in278SolCG.getIdRemitente(), in278SolCG.getIdReceptor(), in278SolCG.getFeTransaccion(), in278SolCG
/*  36 */         .getHoTransaccion(), in278SolCG.getIdCorrelativo());
/*  37 */     subTrama_ISA.completaLongitud();
/*     */     
/*  39 */     caSeTransacciones++;
/*     */     
/*  41 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  42 */     subTrama_GS.generaSubTrama("HI", in278SolCG.getIdRemitente(), in278SolCG.getIdReceptor(), in278SolCG.getFeTransaccion(), in278SolCG
/*  43 */         .getHoTransaccion(), in278SolCG.getNuControl());
/*  44 */     subTrama_GS.completaLongitud();
/*     */     
/*  46 */     caSeTransacciones++;
/*     */     
/*  48 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  49 */     subTrama_ST.generaSubTrama(in278SolCG.getIdTransaccion(), in278SolCG.getNuControlST(), "");
/*  50 */     subTrama_ST.completaLongitud();
/*     */     
/*  52 */     caSeTransacciones++;
/*     */     
/*  54 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  55 */     subTrama_BHT.generaSubTrama("0020", in278SolCG.getTiFinalidad());
/*  56 */     subTrama_BHT.completaLongitud();
/*     */     
/*  58 */     caSeTransacciones++;
/*     */     
/*  60 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  61 */     subTrama_HL3.generaSubTrama("1", "20", "0");
/*  62 */     subTrama_HL3.completaLongitud();
/*     */     
/*  64 */     caSeTransacciones++;
/*     */     
/*  66 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  67 */     subTrama_NM1.generaSubTrama("IL", in278SolCG.getCaPaciente(), in278SolCG.getApPaternoPaciente(), in278SolCG.getNoPaciente(), "", "", in278SolCG
/*  68 */         .getApMaternoPaciente());
/*  69 */     subTrama_NM1.completaLongitud();
/*     */     
/*  71 */     caSeTransacciones++;
/*     */     
/*  73 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  74 */     subTrama_REF1.generaSubTrama("DD", in278SolCG.getCoTiDoPaciente());
/*  75 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  78 */     SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/*  79 */     subTrama_REF1_4.generaSubTrama("4A", in278SolCG.getNuDoPaciente());
/*  80 */     subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */     
/*  83 */     SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  84 */     subTrama_REF2.generaSubTrama("BB", in278SolCG.getNuCarGarantia());
/*  85 */     subTrama_REF2.completaLongitud();
/*     */ 
/*     */     
/*  88 */     SubTrama_REF4 subTrama_REF2_4 = new SubTrama_REF4();
/*  89 */     subTrama_REF2_4.generaSubTrama("ACC", in278SolCG.getEsCarGarantia());
/*  90 */     subTrama_REF2_4.completaLongitud();
/*     */ 
/*     */     
/*  93 */     SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/*  94 */     subTrama_REF3.generaSubTrama("5F", "");
/*  95 */     subTrama_REF3.completaLongitud();
/*     */ 
/*     */     
/*  98 */     SubTrama_REF4 subTrama_REF4_3 = new SubTrama_REF4();
/*  99 */     subTrama_REF4_3.generaSubTrama("ZZ", in278SolCG.getNuSoCarGarantia());
/* 100 */     subTrama_REF4_3.completaLongitud();
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
/* 111 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF2_4.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF4_3.returnComoString("", ":", "~"));
/*     */     
/* 113 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 116 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 117 */     subTrama_SE.generaSubTrama(canTxSE, in278SolCG.getNuControlST());
/* 118 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 121 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 122 */     subTrama_GE.generaSubTrama(in278SolCG.getNuControl());
/* 123 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 126 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 127 */     subTrama_IEA.generaSubTrama(in278SolCG.getIdCorrelativo());
/* 128 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*     */     
/* 136 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 140 */     String[] arrayCadena = sReturn.split("\\~");
/* 141 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 142 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In278SolCG_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */