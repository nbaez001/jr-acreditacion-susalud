/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_N3;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_N4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_PER;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConDtad_ToXs12N
/*     */ {
/*     */   public static String traducirEstructura278ConDtad(In271ConDtad in271ConDtad) {
/*  26 */     String sReturn = "", sReturn01 = "";
/*  27 */     in271ConDtad.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  28 */     in271ConDtad.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  31 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  32 */     subTrama_ISA.generaSubTrama(in271ConDtad.getIdRemitente(), in271ConDtad.getIdReceptor(), in271ConDtad
/*  33 */         .getFeTransaccion(), in271ConDtad.getHoTransaccion(), in271ConDtad
/*  34 */         .getIdCorrelativo());
/*  35 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  39 */     subTrama_GS.generaSubTrama("HB", in271ConDtad.getIdRemitente(), in271ConDtad.getIdReceptor(), in271ConDtad
/*  40 */         .getFeTransaccion(), in271ConDtad.getHoTransaccion(), in271ConDtad
/*  41 */         .getNuControl());
/*  42 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  45 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  46 */     subTrama_ST.generaSubTrama(in271ConDtad.getIdTransaccion(), in271ConDtad.getNuControlST(), "");
/*  47 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  50 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  51 */     subTrama_BHT.generaSubTrama("0022", in271ConDtad.getTiFinalidad());
/*  52 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  55 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  56 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  57 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  60 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  61 */     subTrama_NM11.generaSubTrama("PR", in271ConDtad.getCaRemitente(), "PI", in271ConDtad.getIdRemitente());
/*  62 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  65 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  66 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  67 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  70 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  71 */     subTrama_NM12.generaSubTrama("1P", in271ConDtad.getCaReceptor(), "SV", in271ConDtad.getNuRucReceptor());
/*  72 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  75 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  76 */     subTrama_HL3.generaSubTrama("3", "2", "22", "1");
/*  77 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  80 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  81 */     subTrama_NM13.generaSubTrama("IL", in271ConDtad.getCaPaciente(), in271ConDtad.getApPaternoPaciente(), in271ConDtad
/*  82 */         .getNoPaciente(), "MI", in271ConDtad.getCoAfPaciente(), in271ConDtad
/*  83 */         .getApMaternoPaciente());
/*  84 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  87 */     SubTrama_N3 subTrama_N3_1 = new SubTrama_N3();
/*  88 */     subTrama_N3_1.generaSubTrama(in271ConDtad.getDeDirPaciente1(), in271ConDtad.getDeDirPaciente2());
/*  89 */     subTrama_N3_1.completaLongitud();
/*     */ 
/*     */     
/*  92 */     SubTrama_N4 subTrama_N4_1 = new SubTrama_N4();
/*  93 */     subTrama_N4_1.generaSubTrama("W", in271ConDtad.getCoUbigeoPaciente());
/*  94 */     subTrama_N4_1.completaLongitud();
/*     */ 
/*     */     
/*  97 */     SubTrama_PER subTrama_PER1 = new SubTrama_PER();
/*  98 */     subTrama_PER1.generaSubTrama("IC", in271ConDtad.getNoContacto());
/*  99 */     subTrama_PER1.completaLongitud();
/*     */ 
/*     */     
/* 102 */     SubTrama_PER subTrama_PER2 = new SubTrama_PER();
/* 103 */     subTrama_PER2.generaSubTrama("IP", "EM", in271ConDtad.getEmContacto(), "TE", in271ConDtad
/* 104 */         .getNuTeContacto());
/* 105 */     subTrama_PER2.completaLongitud();
/*     */ 
/*     */     
/* 108 */     SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 109 */     subTrama_NM14.generaSubTrama("CA", in271ConDtad.getTiCaCalificador(), in271ConDtad.getApPaNoEmCalificador(), in271ConDtad
/* 110 */         .getNoEmCalificador(), "", "", in271ConDtad
/* 111 */         .getApMaCalificador());
/* 112 */     subTrama_NM14.completaLongitud();
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
/*     */ 
/*     */     
/* 129 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_N3_1.returnComoString("N3*", "*", "~") + subTrama_N4_1.returnComoString("N4*", "*", "~") + subTrama_PER1.returnComoString("PER*", "*", "~") + subTrama_PER2.returnComoString("PER*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~");
/*     */     
/* 131 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 134 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 135 */     subTrama_SE.generaSubTrama(canTxSE, in271ConDtad.getNuControlST());
/* 136 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 139 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 140 */     subTrama_GE.generaSubTrama(in271ConDtad.getNuControl());
/* 141 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 144 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 145 */     subTrama_IEA.generaSubTrama(in271ConDtad.getIdCorrelativo());
/* 146 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*     */     
/* 154 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 158 */     String[] arrayCadena = sReturn.split("\\~");
/* 159 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 160 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConDtad_ToXs12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */