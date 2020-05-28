/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConObs;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_MSG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConObs_ToX12N
/*     */ {
/*     */   public static String traducirEstructura278ConObs(In271ConObs in271ConObs) {
/*  25 */     String sReturn = "", sReturn01 = "";
/*  26 */     in271ConObs.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  27 */     in271ConObs.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  30 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  31 */     subTrama_ISA.generaSubTrama(in271ConObs.getIdRemitente(), in271ConObs.getIdReceptor(), in271ConObs
/*  32 */         .getFeTransaccion(), in271ConObs.getHoTransaccion(), in271ConObs
/*  33 */         .getIdCorrelativo());
/*  34 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  37 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  38 */     subTrama_GS.generaSubTrama("HB", in271ConObs.getIdRemitente(), in271ConObs.getIdReceptor(), in271ConObs
/*  39 */         .getFeTransaccion(), in271ConObs.getHoTransaccion(), in271ConObs
/*  40 */         .getNuControl());
/*  41 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  44 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  45 */     subTrama_ST.generaSubTrama(in271ConObs.getIdTransaccion(), in271ConObs.getNuControlST(), "");
/*  46 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  49 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  50 */     subTrama_BHT.generaSubTrama("0022", in271ConObs.getTiFinalidad());
/*  51 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  54 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  55 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  56 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  59 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  60 */     subTrama_NM11.generaSubTrama("PR", in271ConObs.getCaRemitente(), "PI", in271ConObs.getIdRemitente());
/*  61 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  64 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  65 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  66 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  69 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  70 */     subTrama_NM12.generaSubTrama("1P", in271ConObs.getCaReceptor(), "SV", in271ConObs.getNuRucReceptor());
/*  71 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  74 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  75 */     subTrama_HL3.generaSubTrama("3", "2", "22", "1");
/*  76 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  79 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  80 */     subTrama_NM13.generaSubTrama("IL", in271ConObs.getCaPaciente(), in271ConObs.getApPaternoPaciente(), in271ConObs
/*  81 */         .getNoPaciente(), "MI", in271ConObs.getCoAfPaciente(), in271ConObs
/*  82 */         .getApMaternoPaciente());
/*  83 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  86 */     SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/*  87 */     subTrama_EB1.generaSubTrama("1", "", "", in271ConObs.getCoSubCobertura(), "", "", "", "");
/*  88 */     subTrama_EB1.completaLongitud();
/*     */ 
/*     */     
/*  91 */     SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/*  92 */     subTrama_MSG1.generaSubTrama(in271ConObs.getTeMsgLibre1());
/*  93 */     subTrama_MSG1.completaLongitud();
/*     */ 
/*     */     
/*  96 */     SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/*  97 */     subTrama_MSG2.generaSubTrama(in271ConObs.getTeMsgLibre2());
/*  98 */     subTrama_MSG2.completaLongitud();
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
/*     */ 
/*     */     
/* 113 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_EB1.returnComoString("EB*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~");
/*     */     
/* 115 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 118 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 119 */     subTrama_SE.generaSubTrama(canTxSE, in271ConObs.getNuControlST());
/* 120 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 123 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 124 */     subTrama_GE.generaSubTrama(in271ConObs.getNuControl());
/* 125 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 128 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 129 */     subTrama_IEA.generaSubTrama(in271ConObs.getIdCorrelativo());
/* 130 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 136 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 137 */     return sReturn01;
/*     */   }
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 140 */     String[] arrayCadena = sReturn.split("\\~");
/* 141 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 142 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConObs_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */