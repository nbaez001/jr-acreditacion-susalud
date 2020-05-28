/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InLogAcreInsert271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DMG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB;
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
/*     */ public class LogAcreInsert271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InLogAcreInsert271 inLogAcreInsert) {
/*  26 */     String sReturn = "", sReturn01 = "";
/*  27 */     inLogAcreInsert.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  28 */     inLogAcreInsert.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */     
/*  30 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  31 */     subTrama_ISA.generaSubTrama(inLogAcreInsert.getIdRemitente(), inLogAcreInsert.getIdReceptor(), inLogAcreInsert.getFeTransaccion(), inLogAcreInsert.getHoTransaccion(), inLogAcreInsert.getIdCorrelativo());
/*  32 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  35 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  36 */     subTrama_GS.generaSubTrama("HB", inLogAcreInsert.getIdRemitente(), inLogAcreInsert.getIdReceptor(), inLogAcreInsert.getFeTransaccion(), inLogAcreInsert.getHoTransaccion(), inLogAcreInsert.getNuControl());
/*  37 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  40 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  41 */     subTrama_ST.generaSubTrama(inLogAcreInsert.getIdTransaccion(), inLogAcreInsert.getNuControlST(), "");
/*  42 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  45 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  46 */     subTrama_BHT.generaSubTrama("0022", inLogAcreInsert.getTiFinalidad());
/*  47 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  50 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  51 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  52 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  55 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  56 */     subTrama_NM1.generaSubTrama("PR", inLogAcreInsert.getCaRemitente(), "PI", inLogAcreInsert.getNuRucRemitente());
/*  57 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  60 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  61 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  62 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  65 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  66 */     subTrama_NM12.generaSubTrama("1P", inLogAcreInsert.getCaReceptor(), "FI", inLogAcreInsert.getIdReceptor());
/*  67 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  70 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  71 */     subTrama_HL2.generaSubTrama("3", "2", "22", "0");
/*  72 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  75 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  76 */     subTrama_NM13.generaSubTrama("IL", inLogAcreInsert.getCaPaciente(), inLogAcreInsert.getApPaternoPaciente(), inLogAcreInsert.getNoPaciente(), "MI", inLogAcreInsert.getCoAfPaciente(), inLogAcreInsert.getApMaternoPaciente());
/*  77 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  80 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  81 */     subTrama_REF1.generaSubTrama("ACC", inLogAcreInsert.getCoEsPaciente());
/*  82 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  85 */     SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  86 */     subTrama_REF2.generaSubTrama("DD", inLogAcreInsert.getTiDoPaciente());
/*  87 */     subTrama_REF2.completaLongitud();
/*     */ 
/*     */     
/*  90 */     SubTrama_REF4 subTrama_REF24 = new SubTrama_REF4();
/*  91 */     subTrama_REF24.generaSubTrama("4A", inLogAcreInsert.getNuDoPaciente());
/*  92 */     subTrama_REF24.completaLongitud();
/*     */ 
/*     */     
/*  95 */     SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/*  96 */     subTrama_REF3.generaSubTrama("CT", inLogAcreInsert.getNuContratoPaciente());
/*  97 */     subTrama_REF3.completaLongitud();
/*     */ 
/*     */     
/* 100 */     SubTrama_REF4 subTrama_REF34 = new SubTrama_REF4();
/* 101 */     subTrama_REF34.generaSubTrama("TY", inLogAcreInsert.getCoTiPolizaAfiliacion());
/* 102 */     subTrama_REF34.completaLongitud();
/*     */ 
/*     */     
/* 105 */     SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 106 */     subTrama_REF4.generaSubTrama("PRT", inLogAcreInsert.getCoProducto());
/* 107 */     subTrama_REF4.completaLongitud();
/*     */ 
/*     */     
/* 110 */     SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 111 */     subTrama_REF5.generaSubTrama("18", inLogAcreInsert.getNuPlan());
/* 112 */     subTrama_REF5.completaLongitud();
/*     */ 
/*     */     
/* 115 */     SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 116 */     subTrama_REF6.generaSubTrama("ZZ", inLogAcreInsert.getCoParentesco());
/* 117 */     subTrama_REF6.completaLongitud();
/*     */ 
/*     */     
/* 120 */     SubTrama_DMG subTrama_DMG1 = new SubTrama_DMG();
/* 121 */     subTrama_DMG1.generaSubTrama("D8", inLogAcreInsert.getFeNacimiento(), inLogAcreInsert.getGenero(), "", "");
/* 122 */     subTrama_DMG1.completaLongitud();
/*     */ 
/*     */     
/* 125 */     SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 126 */     subTrama_DTP1.generaSubTrama("356", "D8", inLogAcreInsert.getFeIniVigencia());
/* 127 */     subTrama_DTP1.completaLongitud();
/*     */ 
/*     */     
/* 130 */     SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/* 131 */     subTrama_EB1.generaSubTrama("1", inLogAcreInsert.getNuCobertura(), "", inLogAcreInsert.getDeCobertura(), "", "", "", "");
/* 132 */     subTrama_EB1.completaLongitud();
/*     */ 
/*     */     
/* 135 */     SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 136 */     subTrama_NM14.generaSubTrama("P5", inLogAcreInsert.getCaContratante(), "", "");
/* 137 */     subTrama_NM14.completaLongitud();
/*     */ 
/*     */     
/* 140 */     SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 141 */     subTrama_REF7.generaSubTrama("DD", inLogAcreInsert.getTiDoContratante());
/* 142 */     subTrama_REF7.completaLongitud();
/*     */ 
/*     */     
/* 145 */     SubTrama_REF4 subTrama_REF74 = new SubTrama_REF4();
/* 146 */     subTrama_REF74.generaSubTrama(inLogAcreInsert.getIdReContratante(), inLogAcreInsert.getRucContratante());
/* 147 */     subTrama_REF74.completaLongitud();
/*     */ 
/*     */     
/* 150 */     SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 151 */     subTrama_NM15.generaSubTrama("C9", "1", "MI", inLogAcreInsert.getCoAfiliadoTitular());
/* 152 */     subTrama_NM15.completaLongitud();
/*     */ 
/*     */     
/* 155 */     SubTrama_NM1 subTrama_NM16 = new SubTrama_NM1();
/* 156 */     subTrama_NM16.generaSubTrama("IL", inLogAcreInsert.getCaResponsableAut(), inLogAcreInsert.getNoPaResponsableAut(), inLogAcreInsert.getNoResponsableAut(), "", "", inLogAcreInsert.getNoMaResponsableAut());
/* 157 */     subTrama_NM16.completaLongitud();
/*     */ 
/*     */     
/* 160 */     SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 161 */     subTrama_REF8.generaSubTrama("DD", inLogAcreInsert.getTiDoResponsableAut());
/* 162 */     subTrama_REF8.completaLongitud();
/*     */ 
/*     */     
/* 165 */     SubTrama_REF4 subTrama_REF84 = new SubTrama_REF4();
/* 166 */     subTrama_REF84.generaSubTrama("4A", inLogAcreInsert.getNuDoResponsableAut());
/* 167 */     subTrama_REF84.completaLongitud();
/*     */ 
/*     */     
/* 170 */     SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 171 */     subTrama_REF9.generaSubTrama("ZZ", inLogAcreInsert.getNuAutorizacion());
/* 172 */     subTrama_REF9.completaLongitud();
/*     */ 
/*     */     
/* 175 */     SubTrama_DMG subTrama_DMG2 = new SubTrama_DMG();
/* 176 */     subTrama_DMG2.generaSubTrama("DT", inLogAcreInsert.getFeHoAutorizacion(), "", "", "");
/* 177 */     subTrama_DMG2.completaLongitud();
/*     */ 
/*     */     
/* 180 */     SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 181 */     subTrama_EB2.generaSubTrama("1", "", "", "", inLogAcreInsert.getBeMaxInicial(), "", "", "");
/* 182 */     subTrama_EB2.completaLongitud();
/*     */ 
/*     */     
/* 185 */     SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 186 */     subTrama_EB3.generaSubTrama("C", "", "", "", inLogAcreInsert.getCoPagoFijo(), "", "", "");
/* 187 */     subTrama_EB3.completaLongitud();
/*     */ 
/*     */     
/* 190 */     SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 191 */     subTrama_EB4.generaSubTrama("1", "", "", "", "", inLogAcreInsert.getCoPagoVariable(), "", "");
/* 192 */     subTrama_EB4.completaLongitud();
/*     */ 
/*     */     
/* 195 */     SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 196 */     subTrama_EB5.generaSubTrama(inLogAcreInsert.getFlagCartaGarantia(), "", "", inLogAcreInsert.getDeFlagCartaGarantia(), "", "", "", "");
/* 197 */     subTrama_EB5.completaLongitud();
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
/* 229 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "*" + subTrama_REF24.returnComoString("", ":", "~")) + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF34.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "~") + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_DMG1.returnComoString("DMG*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_EB1.returnComoString("EB*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "*" + subTrama_REF74.returnComoString("", ":", "~")) + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_NM16.returnComoString("NM1*", "*", "~") + subTrama_REF8.returnComoString("REF*", "*", "*" + subTrama_REF84.returnComoString("", ":", "~")) + subTrama_REF9.returnComoString("REF*", "*", "~") + subTrama_DMG2.returnComoString("DMG*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~");
/*     */     
/* 231 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 234 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 235 */     subTrama_SE.generaSubTrama(canTxSE, inLogAcreInsert.getNuControlST());
/* 236 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 239 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 240 */     subTrama_GE.generaSubTrama(inLogAcreInsert.getNuControl());
/* 241 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 244 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 245 */     subTrama_IEA.generaSubTrama(inLogAcreInsert.getIdCorrelativo());
/* 246 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 252 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 253 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 257 */     String[] arrayCadena = sReturn.split("\\~");
/* 258 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 259 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\LogAcreInsert271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */