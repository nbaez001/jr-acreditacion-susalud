/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DTP;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_EB13;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_GS;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HL;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_HSD;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_IEA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ISA;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_MSG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_NM1;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class In271ConProc_ToX12N
/*     */ {
/*     */   public static String traducirEstructura278ConProc(InConProc271 inConProc271) {
/*  29 */     String sReturn = "", sReturn01 = "";
/*  30 */     inConProc271.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  31 */     inConProc271.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*     */ 
/*     */     
/*  34 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  35 */     subTrama_ISA.generaSubTrama(inConProc271.getIdRemitente(), inConProc271.getIdReceptor(), inConProc271
/*  36 */         .getFeTransaccion(), inConProc271.getHoTransaccion(), inConProc271.getIdCorrelativo());
/*  37 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  40 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  41 */     subTrama_GS.generaSubTrama("HI", inConProc271.getIdRemitente(), inConProc271.getIdReceptor(), inConProc271
/*  42 */         .getFeTransaccion(), inConProc271.getHoTransaccion(), inConProc271.getNuControl());
/*  43 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  46 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  47 */     subTrama_ST.generaSubTrama(inConProc271.getIdTransaccion(), inConProc271.getNuControlST(), "");
/*  48 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  51 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  52 */     subTrama_BHT.generaSubTrama("0022", inConProc271.getTiFinalidad());
/*  53 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  56 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  57 */     subTrama_HL1.generaSubTrama("1", "20", "1");
/*  58 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  61 */     SubTrama_NM1 subTrama_NM11 = new SubTrama_NM1();
/*  62 */     subTrama_NM11.generaSubTrama("PR", inConProc271.getCaRemitente(), "PI", inConProc271.getIdRemitente());
/*  63 */     subTrama_NM11.completaLongitud();
/*     */ 
/*     */     
/*  66 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  67 */     subTrama_HL2.generaSubTrama("2", "1", "21", "1");
/*  68 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  71 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  72 */     subTrama_NM12.generaSubTrama("1P", inConProc271.getCaReceptor(), "SV", inConProc271.getNuRucReceptor());
/*  73 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  76 */     SubTrama_HL subTrama_HL3 = new SubTrama_HL();
/*  77 */     subTrama_HL3.generaSubTrama("3", "2", "22", "0");
/*  78 */     subTrama_HL3.completaLongitud();
/*     */ 
/*     */     
/*  81 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  82 */     subTrama_NM13.generaSubTrama("IL", inConProc271.getCaPaciente(), inConProc271.getApPaternoPaciente(), inConProc271
/*  83 */         .getNoPaciente(), "MI", inConProc271.getCoAfPaciente(), inConProc271.getApMaternoPaciente());
/*  84 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  87 */     String sDetalle = "";
/*  88 */     for (int i = 0; i < inConProc271.getDetalles().size(); i++) {
/*     */       
/*  90 */       SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/*  91 */       subTrama_EB1.generaSubTrama("1", "", "", "", "", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoInProcedimiento(), "");
/*  92 */       subTrama_EB1.completaLongitud();
/*     */ 
/*     */       
/*  95 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/*  96 */       subTrama_EB2.generaSubTrama("1", "", "", "", "", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoInRestriccion(), "");
/*  97 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 100 */       SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 101 */       subTrama_EB3.generaSubTrama("PE", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoProcedimiento(), "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getImDeducible(), ((InConProc271Detalle)inConProc271
/* 102 */           .getDetalles().get(i)).getPoCuExDecimal(), "5U", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getNuFrecuencia());
/* 103 */       subTrama_EB3.completaLongitud();
/*     */ 
/*     */       
/* 106 */       SubTrama_EB13 subTrama_EB3_13 = new SubTrama_EB13();
/* 107 */       subTrama_EB3_13.generaSubTrama("ZZ", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoSexo(), "");
/* 108 */       subTrama_EB3_13.completaLongitud();
/*     */ 
/*     */       
/* 111 */       SubTrama_HSD subTrama_HSD1 = new SubTrama_HSD();
/* 112 */       subTrama_HSD1.generaSubTrama("9S", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTiNuDias());
/* 113 */       subTrama_HSD1.completaLongitud();
/*     */ 
/*     */       
/* 116 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 117 */       subTrama_MSG1.generaSubTrama(((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgObservacion(), "LC", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuentePE());
/* 118 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 121 */       SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 122 */       subTrama_EB4.generaSubTrama("TE", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoTiEspera(), "", "", "", "", "");
/* 123 */       subTrama_EB4.completaLongitud();
/*     */ 
/*     */       
/* 126 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 127 */       subTrama_REF1.generaSubTrama("82", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getDeTiEspera());
/* 128 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 131 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 132 */       subTrama_DTP1.generaSubTrama("327", "D8", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getFeFinVigencia());
/* 133 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 136 */       SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/* 137 */       subTrama_MSG2.generaSubTrama(((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgTiEspera(), "LC", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuenteTE());
/* 138 */       subTrama_MSG2.completaLongitud();
/*     */ 
/*     */       
/* 141 */       SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 142 */       subTrama_EB5.generaSubTrama("EC", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getCoExCarencia(), "", "", "", "", "");
/* 143 */       subTrama_EB5.completaLongitud();
/*     */ 
/*     */       
/* 146 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 147 */       subTrama_REF2.generaSubTrama("82", "", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getDeExCarencia());
/* 148 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 151 */       SubTrama_MSG subTrama_MSG3 = new SubTrama_MSG();
/* 152 */       subTrama_MSG3.generaSubTrama(((InConProc271Detalle)inConProc271.getDetalles().get(i)).getTeMsgExCarencia(), "LC", ((InConProc271Detalle)inConProc271.getDetalles().get(i)).getIdFuenteEC());
/* 153 */       subTrama_MSG3.completaLongitud();
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
/* 167 */       sDetalle = sDetalle + subTrama_EB1.returnComoString("EB*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "*" + subTrama_EB3_13.returnComoString("", ":", "~")) + subTrama_HSD1.returnComoString("HSD*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_MSG3.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */ 
/*     */     
/* 171 */     if (inConProc271.getDetalles().isEmpty()) {
/*     */       
/* 173 */       SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/* 174 */       subTrama_EB1.generaSubTrama("1", "", "", "", "", "", "", "");
/* 175 */       subTrama_EB1.completaLongitud();
/*     */ 
/*     */       
/* 178 */       SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 179 */       subTrama_EB2.generaSubTrama("1", "", "", "", "", "", "", "");
/* 180 */       subTrama_EB2.completaLongitud();
/*     */ 
/*     */       
/* 183 */       SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 184 */       subTrama_EB3.generaSubTrama("PE", "", "", "", "", "", "5U", "");
/* 185 */       subTrama_EB3.completaLongitud();
/*     */ 
/*     */       
/* 188 */       SubTrama_EB13 subTrama_EB3_13 = new SubTrama_EB13();
/* 189 */       subTrama_EB3_13.generaSubTrama("ZZ", "", "");
/* 190 */       subTrama_EB3_13.completaLongitud();
/*     */ 
/*     */       
/* 193 */       SubTrama_HSD subTrama_HSD1 = new SubTrama_HSD();
/* 194 */       subTrama_HSD1.generaSubTrama("9S", "");
/* 195 */       subTrama_HSD1.completaLongitud();
/*     */ 
/*     */       
/* 198 */       SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 199 */       subTrama_MSG1.generaSubTrama("");
/* 200 */       subTrama_MSG1.completaLongitud();
/*     */ 
/*     */       
/* 203 */       SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 204 */       subTrama_EB4.generaSubTrama("TE", "", "", "", "", "", "", "");
/* 205 */       subTrama_EB4.completaLongitud();
/*     */ 
/*     */       
/* 208 */       SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/* 209 */       subTrama_REF1.generaSubTrama("82", "", "");
/* 210 */       subTrama_REF1.completaLongitud();
/*     */ 
/*     */       
/* 213 */       SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 214 */       subTrama_DTP1.generaSubTrama("327", "D8", "");
/* 215 */       subTrama_DTP1.completaLongitud();
/*     */ 
/*     */       
/* 218 */       SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/* 219 */       subTrama_MSG2.generaSubTrama("");
/* 220 */       subTrama_MSG2.completaLongitud();
/*     */ 
/*     */       
/* 223 */       SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 224 */       subTrama_EB5.generaSubTrama("EC", "", "", "", "", "", "", "");
/* 225 */       subTrama_EB5.completaLongitud();
/*     */ 
/*     */       
/* 228 */       SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/* 229 */       subTrama_REF2.generaSubTrama("82", "", "");
/* 230 */       subTrama_REF2.completaLongitud();
/*     */ 
/*     */       
/* 233 */       SubTrama_MSG subTrama_MSG3 = new SubTrama_MSG();
/* 234 */       subTrama_MSG3.generaSubTrama("");
/* 235 */       subTrama_MSG3.completaLongitud();
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
/* 249 */       sDetalle = sDetalle + subTrama_EB1.returnComoString("EB*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "*" + subTrama_EB3_13.returnComoString("", ":", "~")) + subTrama_HSD1.returnComoString("HSD*", "*", "~") + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_MSG3.returnComoString("MSG*", "*", "~");
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
/* 261 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM11.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL3.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + sDetalle;
/*     */ 
/*     */     
/* 264 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 267 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 268 */     subTrama_SE.generaSubTrama(canTxSE, inConProc271.getNuControlST());
/* 269 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 272 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 273 */     subTrama_GE.generaSubTrama(inConProc271.getNuControl());
/* 274 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 277 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 278 */     subTrama_IEA.generaSubTrama(inConProc271.getIdCorrelativo());
/* 279 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/*     */     
/* 288 */     return sReturn01;
/*     */   }
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 291 */     String[] arrayCadena = sReturn.split("\\~");
/* 292 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 293 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\In271ConProc_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */