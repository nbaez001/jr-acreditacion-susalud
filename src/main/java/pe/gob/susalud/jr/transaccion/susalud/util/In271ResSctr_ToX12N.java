/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctr;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctrDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
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
/*     */ public class In271ResSctr_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271ResSctr(In271ResSctr in271ResSctr) {
/*  26 */     String sReturn = "", sReturn01 = "";
/*  27 */     in271ResSctr.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  28 */     in271ResSctr.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  31 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  32 */     subTrama_ISA.generaSubTrama(in271ResSctr.getIdRemitente(), in271ResSctr.getIdReceptor(), in271ResSctr
/*  33 */         .getFeTransaccion(), in271ResSctr.getHoTransaccion(), in271ResSctr
/*  34 */         .getIdCorrelativo());
/*  35 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  38 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  39 */     subTrama_GS.generaSubTrama("HB", in271ResSctr.getIdRemitente(), in271ResSctr.getIdReceptor(), in271ResSctr
/*  40 */         .getFeTransaccion(), in271ResSctr.getHoTransaccion(), in271ResSctr
/*  41 */         .getNuControl());
/*  42 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  45 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  46 */     subTrama_ST.generaSubTrama(in271ResSctr.getIdTransaccion(), in271ResSctr.getNuControlST(), "");
/*  47 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  50 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  51 */     subTrama_BHT.generaSubTrama("0022", in271ResSctr.getTiFinalidad());
/*  52 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  55 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  56 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  57 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  60 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  61 */     subTrama_NM11.generaSubTrama("PR", in271ResSctr.getCaRemitente(), "PI", in271ResSctr.getIdRemitente());
/*  62 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  65 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  66 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  67 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  70 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  71 */     subTrama_NM12.generaSubTrama("1P", in271ResSctr.getCaReceptor(), "SV", in271ResSctr.getNuRucReceptor());
/*  72 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  75 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  76 */     subTrama_HL3.generaSubTrama("3", "2", "22", "1");
/*  77 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  80 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  81 */     subTrama_NM13.generaSubTrama("IL", in271ResSctr.getCaPaciente(), in271ResSctr.getApPaternoPaciente(), in271ResSctr
/*  82 */         .getNoPaciente(), "MI", in271ResSctr.getCoAfPaciente(), in271ResSctr
/*  83 */         .getApMaternoPaciente());
/*  84 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  87 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  88 */     subTrama_REF1.generaSubTrama("DD", in271ResSctr.getCoTiDoPaciente(), in271ResSctr.getNuDocPaciente());
/*  89 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  92 */     SubTrama_REF4 subTrama_REF1_4 = new SubTrama_REF4();
/*  93 */     subTrama_REF1_4.generaSubTrama("4A", in271ResSctr.getNuDocPaciente());
/*  94 */     subTrama_REF1_4.completaLongitud();
/*     */ 
/*     */     
/*  97 */     String sDetalle = "";
/*  98 */     for (int i = 0; i < in271ResSctr.getDetalles().size(); i++) {
/*     */       
/* 100 */       SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 101 */       subTrama_NM14.generaSubTrama("C9", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getTiCaContratante(), ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getNoEmApPaContratante(), "", "MI", "", "");
/*     */       
/* 103 */       subTrama_NM14.completaLongitud();
/*     */ 
/*     */       
/* 106 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 107 */       subTrama_REF2.generaSubTrama("EI", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoEmContratante(), "");
/* 108 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 111 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 112 */       subTrama_REF3.generaSubTrama("DD", "6", "");
/* 113 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 116 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 117 */       subTrama_REF3_4.generaSubTrama(((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getIdCaReContratante(), ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getReIdContratante());
/* 118 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 121 */       SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 122 */       subTrama_NM15.generaSubTrama("C9", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getTiCaLuAtencion(), ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getNoEmLuAtencion(), "", "", "", "");
/*     */       
/* 124 */       subTrama_NM15.completaLongitud();
/*     */ 
/*     */       
/* 127 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 128 */       subTrama_REF4.generaSubTrama("EI", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoEmReLuAtencion(), "");
/* 129 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 132 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 133 */       subTrama_REF5.generaSubTrama("DD", "6", "");
/* 134 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 137 */       SubTrama_REF4 subTrama_REF5_4 = new SubTrama_REF4();
/* 138 */       subTrama_REF5_4.generaSubTrama(((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getIdCaReLuAtencion(), ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getReIdLuAtencion());
/* 139 */       subTrama_REF5_4.completaLongitud();
/*     */ 
/*     */       
/* 142 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 143 */       subTrama_REF6.generaSubTrama("BB", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getCoLuAtencion(), "");
/* 144 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 147 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 148 */       subTrama_REF7.generaSubTrama("3H", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getDeTiAccidente());
/* 149 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 152 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 153 */       subTrama_DTP1.generaSubTrama("382", "D8", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getFeAfiliacion());
/* 154 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 157 */       SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 158 */       subTrama_DTP2.generaSubTrama("382", "D8", ((In271ResSctrDetalle)in271ResSctr.getDetalles().get(i)).getFeOcAccidente());
/* 159 */       subTrama_DTP2.completaLongitud();
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
/* 172 */       sDetalle = sDetalle + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "*" + subTrama_REF5_4.returnComoString("", ":", "~")) + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */     
/* 175 */     if (in271ResSctr.getDetalles().isEmpty()) {
/*     */       
/* 177 */       SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 178 */       subTrama_NM14.generaSubTrama("C9", "", "", "", "MI", "", "");
/*     */       
/* 180 */       subTrama_NM14.completaLongitud();
/*     */ 
/*     */       
/* 183 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 184 */       subTrama_REF2.generaSubTrama("EI", "", "");
/* 185 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 188 */       SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 189 */       subTrama_REF3.generaSubTrama("DD", "6", "");
/* 190 */       subTrama_REF3.completaLongitud();
/*     */ 
/*     */       
/* 193 */       SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 194 */       subTrama_REF3_4.generaSubTrama("", "");
/* 195 */       subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */       
/* 198 */       SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 199 */       subTrama_NM15.generaSubTrama("C9", "", "", "", "", "", "");
/*     */       
/* 201 */       subTrama_NM15.completaLongitud();
/*     */ 
/*     */       
/* 204 */       SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 205 */       subTrama_REF4.generaSubTrama("EI", "", "");
/* 206 */       subTrama_REF4.completaLongitud();
/*     */ 
/*     */       
/* 209 */       SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 210 */       subTrama_REF5.generaSubTrama("DD", "6", "");
/* 211 */       subTrama_REF5.completaLongitud();
/*     */ 
/*     */       
/* 214 */       SubTrama_REF4 subTrama_REF5_4 = new SubTrama_REF4();
/* 215 */       subTrama_REF5_4.generaSubTrama("", "");
/* 216 */       subTrama_REF5_4.completaLongitud();
/*     */ 
/*     */       
/* 219 */       SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 220 */       subTrama_REF6.generaSubTrama("BB", "", "");
/* 221 */       subTrama_REF6.completaLongitud();
/*     */ 
/*     */       
/* 224 */       SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 225 */       subTrama_REF7.generaSubTrama("3H", "");
/* 226 */       subTrama_REF7.completaLongitud();
/*     */ 
/*     */       
/* 229 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 230 */       subTrama_DTP1.generaSubTrama("382", "D8", "");
/* 231 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 234 */       SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 235 */       subTrama_DTP2.generaSubTrama("382", "D8", "");
/* 236 */       subTrama_DTP2.completaLongitud();
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
/* 249 */       sDetalle = sDetalle + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "*" + subTrama_REF5_4.returnComoString("", ":", "~")) + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~");
/*     */     } 
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
/* 262 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "*" + subTrama_REF1_4.returnComoString("", ":", "~")) + sDetalle;
/*     */ 
/*     */     
/* 265 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 268 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 269 */     subTrama_SE.generaSubTrama(canTxSE, in271ResSctr.getNuControlST());
/* 270 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 273 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 274 */     subTrama_GE.generaSubTrama(in271ResSctr.getNuControl());
/* 275 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 278 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 279 */     subTrama_IEA.generaSubTrama(in271ResSctr.getIdCorrelativo());
/* 280 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*     */     
/* 288 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 292 */     String[] arrayCadena = sReturn.split("\\~");
/* 293 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 294 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ResSctr_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */