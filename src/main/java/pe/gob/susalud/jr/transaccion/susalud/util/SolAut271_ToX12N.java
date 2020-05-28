/*     */ package pe.gob.susalud.jr.transaccion.susalud.util;
/*     */ 
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.DatosBean;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutExeCar271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutProEsp271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutRes271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAutTieEsp271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_BHT;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_DMG;
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
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_REF4;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_SE;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.trama.SubTrama_ST;
/*     */ 
/*     */ 
/*     */ public class SolAut271_ToX12N
/*     */ {
/*     */   public static String traducirEstructura271(InSolAut271 inSolAut) {
/*  31 */     DatosBean datosBean = new DatosBean();
/*  32 */     String sReturn = "", sReturn01 = "";
/*  33 */     inSolAut.setNuControl(TransaccionUtil.generarAleatorio(1000000000, 8));
/*  34 */     inSolAut.setNuControlST(TransaccionUtil.generarAleatorioST(1000000000, 8));
/*  35 */     int canDetalle = inSolAut.getInSolAut271Detalles().size();
/*  36 */     datosBean.setCaDetalle(Integer.valueOf(canDetalle));
/*     */     
/*  38 */     String canDetalleTot = inSolAut.getInSolAutProEsp271Detalles().size() + "#" + inSolAut.getInSolAutTieEsp271Detalles().size() + "#" + inSolAut.getInSolAutExeCar271Detalles().size() + "#" + inSolAut.getInSolAut271Detalles().size();
/*     */ 
/*     */     
/*  41 */     SubTrama_ISA subTrama_ISA = new SubTrama_ISA();
/*  42 */     subTrama_ISA.generaSubTrama(inSolAut.getIdRemitente(), inSolAut.getIdReceptor(), inSolAut.getFeTransaccion(), inSolAut.getHoTransaccion(), inSolAut.getIdCorrelativo());
/*  43 */     subTrama_ISA.completaLongitud();
/*     */ 
/*     */     
/*  46 */     SubTrama_GS subTrama_GS = new SubTrama_GS();
/*  47 */     subTrama_GS.generaSubTrama("HB", inSolAut.getIdRemitente(), inSolAut.getIdReceptor(), inSolAut.getFeTransaccion(), inSolAut.getHoTransaccion(), inSolAut.getNuControl());
/*  48 */     subTrama_GS.completaLongitud();
/*     */ 
/*     */     
/*  51 */     SubTrama_ST subTrama_ST = new SubTrama_ST();
/*  52 */     subTrama_ST.generaSubTrama(inSolAut.getIdTransaccion(), inSolAut.getNuControlST(), canDetalleTot);
/*  53 */     subTrama_ST.completaLongitud();
/*     */ 
/*     */     
/*  56 */     SubTrama_BHT subTrama_BHT = new SubTrama_BHT();
/*  57 */     subTrama_BHT.generaSubTrama("0023", inSolAut.getTiFinalidad());
/*  58 */     subTrama_BHT.completaLongitud();
/*     */ 
/*     */     
/*  61 */     SubTrama_HL subTrama_HL = new SubTrama_HL();
/*  62 */     subTrama_HL.generaSubTrama("1", "20", "1");
/*  63 */     subTrama_HL.completaLongitud();
/*     */ 
/*     */     
/*  66 */     SubTrama_NM1 subTrama_NM1 = new SubTrama_NM1();
/*  67 */     subTrama_NM1.generaSubTrama("PR", inSolAut.getCaRemitente(), "PI", inSolAut.getNuRucRemitente());
/*  68 */     subTrama_NM1.completaLongitud();
/*     */ 
/*     */     
/*  71 */     SubTrama_REF subTrama_REF1 = new SubTrama_REF();
/*  72 */     subTrama_REF1.generaSubTrama("OL", inSolAut.getCoAdmisionista());
/*  73 */     subTrama_REF1.completaLongitud();
/*     */ 
/*     */     
/*  76 */     SubTrama_HL subTrama_HL1 = new SubTrama_HL();
/*  77 */     subTrama_HL1.generaSubTrama("2", "1", "21", "1");
/*  78 */     subTrama_HL1.completaLongitud();
/*     */ 
/*     */     
/*  81 */     SubTrama_NM1 subTrama_NM12 = new SubTrama_NM1();
/*  82 */     subTrama_NM12.generaSubTrama("1P", inSolAut.getCaReceptor(), "FI", inSolAut.getIdReceptor());
/*  83 */     subTrama_NM12.completaLongitud();
/*     */ 
/*     */     
/*  86 */     SubTrama_HL subTrama_HL2 = new SubTrama_HL();
/*  87 */     subTrama_HL2.generaSubTrama("3", "2", "22", "1");
/*  88 */     subTrama_HL2.completaLongitud();
/*     */ 
/*     */     
/*  91 */     SubTrama_NM1 subTrama_NM13 = new SubTrama_NM1();
/*  92 */     subTrama_NM13.generaSubTrama("IL", inSolAut.getCaPaciente(), inSolAut.getApPaternoPaciente(), inSolAut.getNoPaciente(), "MI", inSolAut.getCoAfPaciente(), inSolAut.getApMaternoPaciente());
/*  93 */     subTrama_NM13.completaLongitud();
/*     */ 
/*     */     
/*  96 */     SubTrama_REF subTrama_REF2 = new SubTrama_REF();
/*  97 */     subTrama_REF2.generaSubTrama("ACC", inSolAut.getCoEsPaciente());
/*  98 */     subTrama_REF2.completaLongitud();
/*     */ 
/*     */     
/* 101 */     SubTrama_REF subTrama_REF3 = new SubTrama_REF();
/* 102 */     subTrama_REF3.generaSubTrama("DD", inSolAut.getTiDoPaciente());
/* 103 */     subTrama_REF3.completaLongitud();
/*     */ 
/*     */     
/* 106 */     SubTrama_REF4 subTrama_REF3_4 = new SubTrama_REF4();
/* 107 */     subTrama_REF3_4.generaSubTrama("4A", inSolAut.getNuDoPaciente());
/* 108 */     subTrama_REF3_4.completaLongitud();
/*     */ 
/*     */     
/* 111 */     SubTrama_REF subTrama_REF4 = new SubTrama_REF();
/* 112 */     subTrama_REF4.generaSubTrama("EI", inSolAut.getNuIdenEmpleador());
/* 113 */     subTrama_REF4.completaLongitud();
/*     */ 
/*     */     
/* 116 */     SubTrama_REF subTrama_REF5 = new SubTrama_REF();
/* 117 */     subTrama_REF5.generaSubTrama("CT", inSolAut.getNuContratoPaciente());
/* 118 */     subTrama_REF5.completaLongitud();
/*     */ 
/*     */     
/* 121 */     SubTrama_REF4 subTrama_REF5_4 = new SubTrama_REF4();
/* 122 */     subTrama_REF5_4.generaSubTrama("AZ", inSolAut.getNuPoliza(), "ID", inSolAut.getNuCertificado(), "TY", inSolAut.getCoTiPolizaAfiliacion());
/* 123 */     subTrama_REF5_4.completaLongitud();
/*     */ 
/*     */     
/* 126 */     SubTrama_REF subTrama_REF6 = new SubTrama_REF();
/* 127 */     subTrama_REF6.generaSubTrama("PRT", inSolAut.getCoProducto(), inSolAut.getDeProducto());
/* 128 */     subTrama_REF6.completaLongitud();
/*     */ 
/*     */     
/* 131 */     SubTrama_REF subTrama_REF7 = new SubTrama_REF();
/* 132 */     subTrama_REF7.generaSubTrama("18", inSolAut.getNuPlan());
/* 133 */     subTrama_REF7.completaLongitud();
/*     */ 
/*     */     
/* 136 */     SubTrama_REF4 subTrama_REF7_4 = new SubTrama_REF4();
/* 137 */     subTrama_REF7_4.generaSubTrama("IMP", inSolAut.getTiPlanSalud(), "ZZ", inSolAut.getCoMoneda(), "", "");
/* 138 */     subTrama_REF7_4.completaLongitud();
/*     */ 
/*     */     
/* 141 */     SubTrama_REF subTrama_REF8 = new SubTrama_REF();
/* 142 */     subTrama_REF8.generaSubTrama("ZZ", inSolAut.getCoParentesco());
/* 143 */     subTrama_REF8.completaLongitud();
/*     */ 
/*     */     
/* 146 */     SubTrama_REF subTrama_REF9 = new SubTrama_REF();
/* 147 */     subTrama_REF9.generaSubTrama("ZZ", inSolAut.getSoBeneficio());
/* 148 */     subTrama_REF9.completaLongitud();
/*     */ 
/*     */     
/* 151 */     SubTrama_REF4 subTrama_REF9_4 = new SubTrama_REF4();
/* 152 */     subTrama_REF9_4.generaSubTrama("3B", inSolAut.getNuSoBeneficio(), "ZZ", inSolAut.getCoEspecialidad(), "", "");
/* 153 */     subTrama_REF9_4.completaLongitud();
/*     */ 
/*     */     
/* 156 */     SubTrama_DMG subTrama_DMG1 = new SubTrama_DMG();
/* 157 */     subTrama_DMG1.generaSubTrama("D8", inSolAut.getFeNacimiento(), inSolAut.getGenero(), inSolAut.getEsMarital(), "");
/* 158 */     subTrama_DMG1.completaLongitud();
/*     */ 
/*     */     
/* 161 */     SubTrama_DTP subTrama_DTP1 = new SubTrama_DTP();
/* 162 */     subTrama_DTP1.generaSubTrama("356", "D8", inSolAut.getFeIniVigencia());
/* 163 */     subTrama_DTP1.completaLongitud();
/*     */ 
/*     */     
/* 166 */     SubTrama_DTP subTrama_DTP2 = new SubTrama_DTP();
/* 167 */     subTrama_DTP2.generaSubTrama("357", "D8", inSolAut.getFeFinVigencia());
/* 168 */     subTrama_DTP2.completaLongitud();
/*     */ 
/*     */     
/* 171 */     SubTrama_EB subTrama_EB1 = new SubTrama_EB();
/* 172 */     subTrama_EB1.generaSubTrama(inSolAut.getEsCobertura(), "", "", inSolAut.getNuDecAccidente(), "", "", "", "");
/* 173 */     subTrama_EB1.completaLongitud();
/*     */ 
/*     */     
/* 176 */     SubTrama_EB13 subTrama_EB113 = new SubTrama_EB13();
/* 177 */     subTrama_EB113.generaSubTrama("ZZ", inSolAut.getIdInfAccidente(), "");
/* 178 */     subTrama_EB113.completaLongitud();
/*     */ 
/*     */     
/* 181 */     SubTrama_REF subTrama_REF10 = new SubTrama_REF();
/* 182 */     subTrama_REF10.generaSubTrama("3H", inSolAut.getDeTiAccidente());
/* 183 */     subTrama_REF10.completaLongitud();
/*     */ 
/*     */     
/* 186 */     SubTrama_DTP subTrama_DTP3 = new SubTrama_DTP();
/* 187 */     subTrama_DTP3.generaSubTrama("356", "D8", inSolAut.getFeAfiliacion());
/* 188 */     subTrama_DTP3.completaLongitud();
/*     */ 
/*     */     
/* 191 */     SubTrama_DTP subTrama_DTP4 = new SubTrama_DTP();
/* 192 */     subTrama_DTP4.generaSubTrama("357", "D8", inSolAut.getFeOcuAccidente());
/* 193 */     subTrama_DTP4.completaLongitud();
/*     */ 
/*     */     
/* 196 */     SubTrama_EB subTrama_EB2 = new SubTrama_EB();
/* 197 */     subTrama_EB2.generaSubTrama(inSolAut.getEsCobertura(), "", "", inSolAut.getNuAtencion(), "", "", "", "");
/* 198 */     subTrama_EB2.completaLongitud();
/*     */ 
/*     */     
/* 201 */     SubTrama_EB13 subTrama_EB213 = new SubTrama_EB13();
/* 202 */     subTrama_EB213.generaSubTrama("ZZ", inSolAut.getIdDerFarmacia(), "");
/* 203 */     subTrama_EB213.completaLongitud();
/*     */ 
/*     */     
/* 206 */     SubTrama_REF subTrama_REF11 = new SubTrama_REF();
/* 207 */     subTrama_REF11.generaSubTrama("PRT", inSolAut.getTiProducto(), inSolAut.getDeProductoDeFarmacia());
/* 208 */     subTrama_REF11.completaLongitud();
/*     */ 
/*     */     
/* 211 */     SubTrama_DTP subTrama_DTP5 = new SubTrama_DTP();
/* 212 */     subTrama_DTP5.generaSubTrama("382", "D8", inSolAut.getFeAtencion());
/* 213 */     subTrama_DTP5.completaLongitud();
/*     */ 
/*     */     
/* 216 */     SubTrama_EB subTrama_EB3 = new SubTrama_EB();
/* 217 */     subTrama_EB3.generaSubTrama(inSolAut.getEsCobertura(), "", "", inSolAut.getNuCobertura(), "", "", "", "");
/* 218 */     subTrama_EB3.completaLongitud();
/*     */ 
/*     */     
/* 221 */     SubTrama_EB13 subTrama_EB313 = new SubTrama_EB13();
/* 222 */     subTrama_EB313.generaSubTrama("ZZ", inSolAut.getObsCobertura(), "");
/* 223 */     subTrama_EB313.completaLongitud();
/*     */ 
/*     */     
/* 226 */     SubTrama_MSG subTrama_MSG1 = new SubTrama_MSG();
/* 227 */     subTrama_MSG1.generaSubTrama(inSolAut.getMsgObs());
/* 228 */     subTrama_MSG1.completaLongitud();
/*     */ 
/*     */     
/* 231 */     SubTrama_MSG subTrama_MSG2 = new SubTrama_MSG();
/* 232 */     subTrama_MSG2.generaSubTrama(inSolAut.getMsgConEspeciales());
/* 233 */     subTrama_MSG2.completaLongitud();
/*     */ 
/*     */     
/* 236 */     SubTrama_NM1 subTrama_NM14 = new SubTrama_NM1();
/* 237 */     subTrama_NM14.generaSubTrama("P5", inSolAut.getCaContratante(), inSolAut.getNoPaContratante(), inSolAut.getNoContratante(), "", "", inSolAut.getNoMaContratante());
/* 238 */     subTrama_NM14.completaLongitud();
/*     */ 
/*     */     
/* 241 */     SubTrama_REF subTrama_REF12 = new SubTrama_REF();
/* 242 */     subTrama_REF12.generaSubTrama("DD", inSolAut.getTiDoContratante(), "");
/* 243 */     subTrama_REF12.completaLongitud();
/*     */ 
/*     */     
/* 246 */     SubTrama_REF4 subTrama_REF12_4 = new SubTrama_REF4();
/* 247 */     subTrama_REF12_4.generaSubTrama(inSolAut.getIdReContratante(), inSolAut.getCoReContratante());
/* 248 */     subTrama_REF12_4.completaLongitud();
/*     */ 
/*     */     
/* 251 */     SubTrama_NM1 subTrama_NM15 = new SubTrama_NM1();
/* 252 */     subTrama_NM15.generaSubTrama("C9", inSolAut.getCaTitular(), inSolAut.getNoPaTitular(), inSolAut.getNoTitular(), "MI", inSolAut.getCoAfTitular(), inSolAut.getNoMaTitular());
/* 253 */     subTrama_NM15.completaLongitud();
/*     */ 
/*     */     
/* 256 */     SubTrama_REF subTrama_REF13 = new SubTrama_REF();
/* 257 */     subTrama_REF13.generaSubTrama("DD", inSolAut.getTiDoTitular());
/* 258 */     subTrama_REF13.completaLongitud();
/*     */ 
/*     */     
/* 261 */     SubTrama_REF4 subTrama_REF13_4 = new SubTrama_REF4();
/* 262 */     subTrama_REF13_4.generaSubTrama(inSolAut.getIdReTitular(), inSolAut.getNuDoTitular());
/* 263 */     subTrama_REF13_4.completaLongitud();
/*     */ 
/*     */     
/* 266 */     SubTrama_DTP subTrama_DTP6 = new SubTrama_DTP();
/* 267 */     subTrama_DTP6.generaSubTrama("382", "D8", inSolAut.getFeIncTitular());
/* 268 */     subTrama_DTP6.completaLongitud();
/*     */ 
/*     */     
/* 271 */     SubTrama_EB subTrama_EB4 = new SubTrama_EB();
/* 272 */     subTrama_EB4.generaSubTrama(inSolAut.getEsCobertura(), "", "", inSolAut.getNuCobPreExistencia(), inSolAut.getBeMaxInicial(), "", "", inSolAut.getCanServicio());
/* 273 */     subTrama_EB4.completaLongitud();
/*     */ 
/*     */     
/* 276 */     SubTrama_EB13 subTrama_EB413 = new SubTrama_EB13();
/* 277 */     subTrama_EB413.generaSubTrama("ZZ", inSolAut.getIdDeProducto(), "");
/* 278 */     subTrama_EB413.completaLongitud();
/*     */ 
/*     */     
/* 281 */     SubTrama_REF subTrama_REF14 = new SubTrama_REF();
/* 282 */     subTrama_REF14.generaSubTrama("D7", inSolAut.getCoTiCobertura());
/* 283 */     subTrama_REF14.completaLongitud();
/*     */ 
/*     */     
/* 286 */     SubTrama_REF4 subTrama_REF14_4 = new SubTrama_REF4();
/* 287 */     subTrama_REF14_4.generaSubTrama("ZZ", inSolAut.getCoSubTiCobertura());
/* 288 */     subTrama_REF14_4.completaLongitud();
/*     */ 
/*     */     
/* 291 */     SubTrama_MSG subTrama_MSG3 = new SubTrama_MSG();
/* 292 */     subTrama_MSG3.generaSubTrama(inSolAut.getMsgObsPre());
/* 293 */     subTrama_MSG3.completaLongitud();
/*     */ 
/*     */     
/* 296 */     SubTrama_MSG subTrama_MSG4 = new SubTrama_MSG();
/* 297 */     subTrama_MSG4.generaSubTrama(inSolAut.getMsgConEspecialesPre());
/* 298 */     subTrama_MSG4.completaLongitud();
/*     */ 
/*     */     
/* 301 */     SubTrama_EB subTrama_EB5 = new SubTrama_EB();
/* 302 */     subTrama_EB5.generaSubTrama("C", "", "", inSolAut.getCoTiMoneda(), inSolAut.getCoPagoFijo(), "", inSolAut.getCoCalServicio(), inSolAut.getCanCalServicio());
/* 303 */     subTrama_EB5.completaLongitud();
/*     */ 
/*     */     
/* 306 */     SubTrama_EB subTrama_EB6 = new SubTrama_EB();
/* 307 */     subTrama_EB6.generaSubTrama(inSolAut.getEsCobertura(), "", "", "", "", inSolAut.getCoPagoVariable(), "", "");
/* 308 */     subTrama_EB6.completaLongitud();
/*     */ 
/*     */     
/* 311 */     SubTrama_EB subTrama_EB7 = new SubTrama_EB();
/* 312 */     subTrama_EB7.generaSubTrama(inSolAut.getFlagCG(), "", "", inSolAut.getDeflagCG(), "", "", "", "");
/* 313 */     subTrama_EB7.completaLongitud();
/*     */ 
/*     */     
/* 316 */     SubTrama_DTP subTrama_DTP7 = new SubTrama_DTP();
/* 317 */     subTrama_DTP7.generaSubTrama("348", "D8", inSolAut.getFeFinCarencia());
/* 318 */     subTrama_DTP7.completaLongitud();
/*     */ 
/*     */     
/* 321 */     SubTrama_DTP subTrama_DTP8 = new SubTrama_DTP();
/* 322 */     subTrama_DTP8.generaSubTrama("338", "D8", inSolAut.getFeFinEspera());
/* 323 */     subTrama_DTP8.completaLongitud();
/*     */ 
/*     */     
/* 326 */     String sDetallePE = "";
/* 327 */     for (int i = 0; i < inSolAut.getDetallesPE().size(); i++) {
/*     */       
/* 329 */       SubTrama_EB subTrama_EB8 = new SubTrama_EB();
/* 330 */       subTrama_EB8.generaSubTrama("1", "", "", "", "", "", ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getCoInProcedimiento(), "");
/* 331 */       subTrama_EB8.completaLongitud();
/*     */       
/* 333 */       SubTrama_EB subTrama_EB9 = new SubTrama_EB();
/* 334 */       subTrama_EB9.generaSubTrama("P", "", ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getCoTiProConAmbulatoria(), ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getNuPlanConAmbulatoria(), ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getImDeducible(), ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getPoConAmbulatoria(), "5U", ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getFrConAmbulatoria());
/* 335 */       subTrama_EB9.completaLongitud();
/*     */       
/* 337 */       SubTrama_EB13 subTrama_EB9_13 = new SubTrama_EB13();
/* 338 */       subTrama_EB9_13.generaSubTrama("ZZ", ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getGeConAmbulatoria(), "");
/* 339 */       subTrama_EB9_13.completaLongitud();
/*     */       
/* 341 */       SubTrama_HSD subTrama_HSD1 = new SubTrama_HSD();
/* 342 */       subTrama_HSD1.generaSubTrama("9S", ((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getCaConAmbulatoria());
/* 343 */       subTrama_HSD1.completaLongitud();
/*     */       
/* 345 */       SubTrama_MSG subTrama_MSG5 = new SubTrama_MSG();
/* 346 */       subTrama_MSG5.generaSubTrama(((InSolAutProEsp271Detalle)inSolAut.getDetallesPE().get(i)).getMsgConAmbulatoria());
/* 347 */       subTrama_MSG5.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 352 */       sDetallePE = sDetallePE + subTrama_EB8.returnComoString("EB*", "*", "~") + subTrama_EB9.returnComoString("EB*", "*", "*" + subTrama_EB9_13.returnComoString("", ":", "~")) + subTrama_HSD1.returnComoString("HSD*", "*", "~") + subTrama_MSG5.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */     
/* 355 */     if (inSolAut.getDetallesPE().isEmpty()) {
/*     */       
/* 357 */       SubTrama_EB subTrama_EB8 = new SubTrama_EB();
/* 358 */       subTrama_EB8.generaSubTrama("1", "", "", "", "", "", "", "");
/* 359 */       subTrama_EB8.completaLongitud();
/*     */       
/* 361 */       SubTrama_EB subTrama_EB9 = new SubTrama_EB();
/* 362 */       subTrama_EB9.generaSubTrama("P", "", "", "", "", "", "5U", "");
/* 363 */       subTrama_EB9.completaLongitud();
/*     */       
/* 365 */       SubTrama_EB13 subTrama_EB9_13 = new SubTrama_EB13();
/* 366 */       subTrama_EB9_13.generaSubTrama("ZZ", "", "");
/* 367 */       subTrama_EB9_13.completaLongitud();
/*     */       
/* 369 */       SubTrama_HSD subTrama_HSD1 = new SubTrama_HSD();
/* 370 */       subTrama_HSD1.generaSubTrama("9S", "");
/* 371 */       subTrama_HSD1.completaLongitud();
/*     */       
/* 373 */       SubTrama_MSG subTrama_MSG5 = new SubTrama_MSG();
/* 374 */       subTrama_MSG5.generaSubTrama("");
/* 375 */       subTrama_MSG5.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 380 */       sDetallePE = sDetallePE + subTrama_EB8.returnComoString("EB*", "*", "~") + subTrama_EB9.returnComoString("EB*", "*", "*" + subTrama_EB9_13.returnComoString("", ":", "~")) + subTrama_HSD1.returnComoString("HSD*", "*", "~") + subTrama_MSG5.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */     
/* 383 */     String sDetalleTE = "";
/* 384 */     for (int j = 0; j < inSolAut.getDetallesTE().size(); j++) {
/*     */       
/* 386 */       SubTrama_EB subTrama_EB10 = new SubTrama_EB();
/* 387 */       subTrama_EB10.generaSubTrama("W", "", ((InSolAutTieEsp271Detalle)inSolAut.getDetallesTE().get(j)).getCoTiEspera(), "", "", "", "", "");
/* 388 */       subTrama_EB10.completaLongitud();
/*     */       
/* 390 */       SubTrama_EB13 subTrama_EB10_13 = new SubTrama_EB13();
/* 391 */       subTrama_EB10_13.generaSubTrama("ZZ", ((InSolAutTieEsp271Detalle)inSolAut.getDetallesTE().get(j)).getIdTiEspera(), "");
/* 392 */       subTrama_EB10_13.completaLongitud();
/*     */       
/* 394 */       SubTrama_REF subTrama_REF15 = new SubTrama_REF();
/* 395 */       subTrama_REF15.generaSubTrama("82", ((InSolAutTieEsp271Detalle)inSolAut.getDetallesTE().get(j)).getDeTiEspera());
/* 396 */       subTrama_REF15.completaLongitud();
/*     */       
/* 398 */       SubTrama_DTP subTrama_DTP9 = new SubTrama_DTP();
/* 399 */       subTrama_DTP9.generaSubTrama("150", "D8", ((InSolAutTieEsp271Detalle)inSolAut.getDetallesTE().get(j)).getFeFinVigenciaTiEspera());
/* 400 */       subTrama_DTP9.completaLongitud();
/*     */       
/* 402 */       SubTrama_MSG subTrama_MSG6 = new SubTrama_MSG();
/* 403 */       subTrama_MSG6.generaSubTrama(((InSolAutTieEsp271Detalle)inSolAut.getDetallesTE().get(j)).getMsgTiEspera());
/* 404 */       subTrama_MSG6.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 409 */       sDetalleTE = sDetalleTE + subTrama_EB10.returnComoString("EB*", "*", "*" + subTrama_EB10_13.returnComoString("", ":", "~")) + subTrama_REF15.returnComoString("REF*", "*", "~") + subTrama_DTP9.returnComoString("DTP*", "*", "~") + subTrama_MSG6.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */     
/* 412 */     if (inSolAut.getDetallesTE().isEmpty()) {
/*     */       
/* 414 */       SubTrama_EB subTrama_EB10 = new SubTrama_EB();
/* 415 */       subTrama_EB10.generaSubTrama("W", "", "", "", "", "", "", "");
/* 416 */       subTrama_EB10.completaLongitud();
/*     */       
/* 418 */       SubTrama_EB13 subTrama_EB10_13 = new SubTrama_EB13();
/* 419 */       subTrama_EB10_13.generaSubTrama("ZZ", "", "");
/* 420 */       subTrama_EB10_13.completaLongitud();
/*     */       
/* 422 */       SubTrama_REF subTrama_REF15 = new SubTrama_REF();
/* 423 */       subTrama_REF15.generaSubTrama("82", "");
/* 424 */       subTrama_REF15.completaLongitud();
/*     */       
/* 426 */       SubTrama_DTP subTrama_DTP9 = new SubTrama_DTP();
/* 427 */       subTrama_DTP9.generaSubTrama("150", "D8", "");
/* 428 */       subTrama_DTP9.completaLongitud();
/*     */       
/* 430 */       SubTrama_MSG subTrama_MSG6 = new SubTrama_MSG();
/* 431 */       subTrama_MSG6.generaSubTrama("");
/* 432 */       subTrama_MSG6.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 437 */       sDetalleTE = sDetalleTE + subTrama_EB10.returnComoString("EB*", "*", "*" + subTrama_EB10_13.returnComoString("", ":", "~")) + subTrama_REF15.returnComoString("REF*", "*", "~") + subTrama_DTP9.returnComoString("DTP*", "*", "~") + subTrama_MSG6.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */     
/* 440 */     String sDetalleEC = "";
/* 441 */     for (int k = 0; k < inSolAut.getDetallesEC().size(); k++) {
/*     */       
/* 443 */       SubTrama_EB subTrama_EB11 = new SubTrama_EB();
/* 444 */       subTrama_EB11.generaSubTrama("W", "", ((InSolAutExeCar271Detalle)inSolAut.getDetallesEC().get(k)).getCoExCarencia(), "", "", "", "", "");
/* 445 */       subTrama_EB11.completaLongitud();
/*     */       
/* 447 */       SubTrama_EB13 subTrama_EB11_13 = new SubTrama_EB13();
/* 448 */       subTrama_EB11_13.generaSubTrama("ZZ", ((InSolAutExeCar271Detalle)inSolAut.getDetallesEC().get(k)).getIdExCarencia(), "");
/* 449 */       subTrama_EB11_13.completaLongitud();
/*     */       
/* 451 */       SubTrama_REF subTrama_REF16 = new SubTrama_REF();
/* 452 */       subTrama_REF16.generaSubTrama("82", ((InSolAutExeCar271Detalle)inSolAut.getDetallesEC().get(k)).getDeExCarencia());
/* 453 */       subTrama_REF16.completaLongitud();
/*     */       
/* 455 */       SubTrama_MSG subTrama_MSG7 = new SubTrama_MSG();
/* 456 */       subTrama_MSG7.generaSubTrama(((InSolAutExeCar271Detalle)inSolAut.getDetallesEC().get(k)).getMsgExCarencia());
/* 457 */       subTrama_MSG7.completaLongitud();
/*     */ 
/*     */ 
/*     */       
/* 461 */       sDetalleEC = sDetalleEC + subTrama_EB11.returnComoString("EB*", "*", "*" + subTrama_EB11_13.returnComoString("", ":", "~")) + subTrama_REF16.returnComoString("REF*", "*", "~") + subTrama_MSG7.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */     
/* 464 */     if (inSolAut.getDetallesEC().isEmpty()) {
/*     */       
/* 466 */       SubTrama_EB subTrama_EB11 = new SubTrama_EB();
/* 467 */       subTrama_EB11.generaSubTrama("W", "", "", "", "", "", "", "");
/* 468 */       subTrama_EB11.completaLongitud();
/*     */       
/* 470 */       SubTrama_EB13 subTrama_EB11_13 = new SubTrama_EB13();
/* 471 */       subTrama_EB11_13.generaSubTrama("ZZ", "", "");
/* 472 */       subTrama_EB11_13.completaLongitud();
/*     */       
/* 474 */       SubTrama_REF subTrama_REF16 = new SubTrama_REF();
/* 475 */       subTrama_REF16.generaSubTrama("82", "");
/* 476 */       subTrama_REF16.completaLongitud();
/*     */       
/* 478 */       SubTrama_MSG subTrama_MSG7 = new SubTrama_MSG();
/* 479 */       subTrama_MSG7.generaSubTrama("");
/* 480 */       subTrama_MSG7.completaLongitud();
/*     */ 
/*     */ 
/*     */       
/* 484 */       sDetalleEC = sDetalleEC + subTrama_EB11.returnComoString("EB*", "*", "*" + subTrama_EB11_13.returnComoString("", ":", "~")) + subTrama_REF16.returnComoString("REF*", "*", "~") + subTrama_MSG7.returnComoString("MSG*", "*", "~");
/*     */     } 
/*     */ 
/*     */     
/* 488 */     SubTrama_NM1 subTrama_NM16 = new SubTrama_NM1();
/* 489 */     subTrama_NM16.generaSubTrama("IL", inSolAut.getCaPaciente(), inSolAut.getApPaternoPaciente(), inSolAut.getNoPaciente(), "MI", inSolAut.getCoAfPaciente(), inSolAut.getApMaternoPaciente());
/* 490 */     subTrama_NM16.completaLongitud();
/*     */     
/* 492 */     String sDetalle = "";
/* 493 */     for (int m = 0; m < inSolAut.getDetalles().size(); m++) {
/*     */       
/* 495 */       SubTrama_EB subTrama_EB12 = new SubTrama_EB();
/* 496 */       subTrama_EB12.generaSubTrama("W", "", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getCIE10Restricciones(), "", "", "", "", "");
/* 497 */       subTrama_EB12.completaLongitud();
/*     */       
/* 499 */       SubTrama_EB13 subTrama_EB12_13 = new SubTrama_EB13();
/* 500 */       subTrama_EB12_13.generaSubTrama("ZZ", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getIdRestricciones(), "");
/* 501 */       subTrama_EB12_13.completaLongitud();
/*     */       
/* 503 */       SubTrama_REF subTrama_REF17 = new SubTrama_REF();
/* 504 */       subTrama_REF17.generaSubTrama("82", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getObsRestricciones());
/* 505 */       subTrama_REF17.completaLongitud();
/*     */       
/* 507 */       SubTrama_REF subTrama_REF18 = new SubTrama_REF();
/* 508 */       subTrama_REF18.generaSubTrama("82", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getDeRestricciones());
/* 509 */       subTrama_REF18.completaLongitud();
/*     */       
/* 511 */       SubTrama_MSG subTrama_MSG8 = new SubTrama_MSG();
/* 512 */       subTrama_MSG8.generaSubTrama(((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getMsgRestricciones());
/* 513 */       subTrama_MSG8.completaLongitud();
/*     */       
/* 515 */       SubTrama_EB subTrama_EB13 = new SubTrama_EB();
/* 516 */       subTrama_EB13.generaSubTrama(inSolAut.getEsCobertura(), "", "", "", "", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getMonTopeRestricciones(), "", "");
/* 517 */       subTrama_EB13.completaLongitud();
/*     */       
/* 519 */       SubTrama_DTP subTrama_DTP10 = new SubTrama_DTP();
/* 520 */       subTrama_DTP10.generaSubTrama("150", "D8", ((InSolAutRes271Detalle)inSolAut.getDetalles().get(m)).getFeFinEsperaRestricciones());
/* 521 */       subTrama_DTP10.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 528 */       sDetalle = sDetalle + subTrama_EB12.returnComoString("EB*", "*", "*" + subTrama_EB12_13.returnComoString("", ":", "~")) + subTrama_REF17.returnComoString("REF*", "*", "~") + subTrama_REF18.returnComoString("REF*", "*", "~") + subTrama_MSG8.returnComoString("MSG*", "*", "~") + subTrama_EB13.returnComoString("EB*", "*", "~") + subTrama_DTP10.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */     
/* 531 */     if (inSolAut.getDetalles().isEmpty()) {
/*     */       
/* 533 */       SubTrama_EB subTrama_EB12 = new SubTrama_EB();
/* 534 */       subTrama_EB12.generaSubTrama("W", "", "", "", "", "", "", "");
/* 535 */       subTrama_EB12.completaLongitud();
/*     */       
/* 537 */       SubTrama_EB13 subTrama_EB12_13 = new SubTrama_EB13();
/* 538 */       subTrama_EB12_13.generaSubTrama("ZZ", "", "");
/* 539 */       subTrama_EB12_13.completaLongitud();
/*     */       
/* 541 */       SubTrama_REF subTrama_REF17 = new SubTrama_REF();
/* 542 */       subTrama_REF17.generaSubTrama("82", "");
/* 543 */       subTrama_REF17.completaLongitud();
/*     */       
/* 545 */       SubTrama_REF subTrama_REF18 = new SubTrama_REF();
/* 546 */       subTrama_REF18.generaSubTrama("82", "");
/* 547 */       subTrama_REF18.completaLongitud();
/*     */       
/* 549 */       SubTrama_MSG subTrama_MSG8 = new SubTrama_MSG();
/* 550 */       subTrama_MSG8.generaSubTrama("");
/* 551 */       subTrama_MSG8.completaLongitud();
/*     */       
/* 553 */       SubTrama_EB subTrama_EB13 = new SubTrama_EB();
/* 554 */       subTrama_EB13.generaSubTrama("", "", "", "", "", "", "", "");
/* 555 */       subTrama_EB13.completaLongitud();
/*     */       
/* 557 */       SubTrama_DTP subTrama_DTP10 = new SubTrama_DTP();
/* 558 */       subTrama_DTP10.generaSubTrama("150", "D8", "");
/* 559 */       subTrama_DTP10.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 566 */       sDetalle = sDetalle + subTrama_EB12.returnComoString("EB*", "*", "*" + subTrama_EB12_13.returnComoString("", ":", "~")) + subTrama_REF17.returnComoString("REF*", "*", "~") + subTrama_REF18.returnComoString("REF*", "*", "~") + subTrama_MSG8.returnComoString("MSG*", "*", "~") + subTrama_EB13.returnComoString("EB*", "*", "~") + subTrama_DTP10.returnComoString("DTP*", "*", "~");
/*     */     } 
/*     */ 
/*     */     
/* 570 */     SubTrama_HL subTrama_HL4 = new SubTrama_HL();
/* 571 */     subTrama_HL4.generaSubTrama("4", "3", "23", "0");
/* 572 */     subTrama_HL4.completaLongitud();
/*     */     
/* 574 */     SubTrama_NM1 subTrama_NM17 = new SubTrama_NM1();
/* 575 */     subTrama_NM17.generaSubTrama("IL", inSolAut.getCaRegafi(), inSolAut.getNoPaRegafi(), inSolAut.getNoRegafi(), "MI", inSolAut.getCoAfRegafi(), inSolAut.getNoMaRegafi());
/* 576 */     subTrama_NM17.completaLongitud();
/*     */ 
/*     */     
/* 579 */     SubTrama_REF subTrama_REF19 = new SubTrama_REF();
/* 580 */     subTrama_REF19.generaSubTrama("DD", inSolAut.getTiDoRegafi());
/* 581 */     subTrama_REF19.completaLongitud();
/*     */ 
/*     */     
/* 584 */     SubTrama_REF4 subTrama_REF19_4 = new SubTrama_REF4();
/* 585 */     subTrama_REF19_4.generaSubTrama(inSolAut.getIdReRegafi(), inSolAut.getNuDoRegafi());
/* 586 */     subTrama_REF19_4.completaLongitud();
/*     */ 
/*     */     
/* 589 */     SubTrama_DMG subTrama_DMG2 = new SubTrama_DMG();
/* 590 */     subTrama_DMG2.generaSubTrama("D8", inSolAut.getFeNaRegafi(), inSolAut.getGeRegafi(), "", inSolAut.getCoPaisRegafi());
/* 591 */     subTrama_DMG2.completaLongitud();
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
/* 648 */     sReturn = subTrama_ISA.returnComoString("ISA*", "*", "~") + subTrama_GS.returnComoString("GS*", "*", "~") + subTrama_ST.returnComoString("ST*", "*", "~") + subTrama_BHT.returnComoString("BHT*", "*", "~") + subTrama_HL.returnComoString("HL*", "*", "~") + subTrama_NM1.returnComoString("NM1*", "*", "~") + subTrama_REF1.returnComoString("REF*", "*", "~") + subTrama_HL1.returnComoString("HL*", "*", "~") + subTrama_NM12.returnComoString("NM1*", "*", "~") + subTrama_HL2.returnComoString("HL*", "*", "~") + subTrama_NM13.returnComoString("NM1*", "*", "~") + subTrama_REF2.returnComoString("REF*", "*", "~") + subTrama_REF3.returnComoString("REF*", "*", "*" + subTrama_REF3_4.returnComoString("", ":", "~")) + subTrama_REF4.returnComoString("REF*", "*", "~") + subTrama_REF5.returnComoString("REF*", "*", "*" + subTrama_REF5_4.returnComoString("", ":", "~")) + subTrama_REF6.returnComoString("REF*", "*", "~") + subTrama_REF7.returnComoString("REF*", "*", "*" + subTrama_REF7_4.returnComoString("", ":", "~")) + subTrama_REF8.returnComoString("REF*", "*", "~") + subTrama_REF9.returnComoString("REF*", "*", "*" + subTrama_REF9_4.returnComoString("", ":", "~")) + subTrama_DMG1.returnComoString("DMG*", "*", "~") + subTrama_DTP1.returnComoString("DTP*", "*", "~") + subTrama_DTP2.returnComoString("DTP*", "*", "~") + subTrama_EB1.returnComoString("EB*", "*", "*" + subTrama_EB113.returnComoString("", ":", "~")) + subTrama_REF10.returnComoString("REF*", "*", "~") + subTrama_DTP3.returnComoString("DTP*", "*", "~") + subTrama_DTP4.returnComoString("DTP*", "*", "~") + subTrama_EB2.returnComoString("EB*", "*", "*" + subTrama_EB213.returnComoString("", ":", "~")) + subTrama_REF11.returnComoString("REF*", "*", "~") + subTrama_DTP5.returnComoString("DTP*", "*", "~") + subTrama_EB3.returnComoString("EB*", "*", "*" + subTrama_EB313.returnComoString("", ":", "~")) + subTrama_MSG1.returnComoString("MSG*", "*", "~") + subTrama_MSG2.returnComoString("MSG*", "*", "~") + subTrama_NM14.returnComoString("NM1*", "*", "~") + subTrama_REF12.returnComoString("REF*", "*", "*" + subTrama_REF12_4.returnComoString("", ":", "~")) + subTrama_NM15.returnComoString("NM1*", "*", "~") + subTrama_REF13.returnComoString("REF*", "*", "*" + subTrama_REF13_4.returnComoString("", ":", "~")) + subTrama_DTP6.returnComoString("DTP*", "*", "~") + subTrama_EB4.returnComoString("EB*", "*", "*" + subTrama_EB413.returnComoString("", ":", "~")) + subTrama_REF14.returnComoString("REF*", "*", "*" + subTrama_REF14_4.returnComoString("", ":", "~")) + subTrama_MSG3.returnComoString("MSG*", "*", "~") + subTrama_MSG4.returnComoString("MSG*", "*", "~") + subTrama_EB5.returnComoString("EB*", "*", "~") + subTrama_EB6.returnComoString("EB*", "*", "~") + subTrama_EB7.returnComoString("EB*", "*", "~") + subTrama_DTP7.returnComoString("DTP*", "*", "~") + subTrama_DTP8.returnComoString("DTP*", "*", "~") + sDetallePE + sDetalleTE + sDetalleEC + subTrama_NM16.returnComoString("NM1*", "*", "~") + sDetalle + subTrama_HL4.returnComoString("HL*", "*", "~") + subTrama_NM17.returnComoString("NM1*", "*", "~") + subTrama_REF19.returnComoString("REF*", "*", "*" + subTrama_REF19_4.returnComoString("", ":", "~")) + subTrama_DMG2.returnComoString("DMG*", "*", "~");
/*     */     
/* 650 */     String canTxSE = cantidaSegementosTx(sReturn);
/*     */ 
/*     */     
/* 653 */     SubTrama_SE subTrama_SE = new SubTrama_SE();
/* 654 */     subTrama_SE.generaSubTrama(canTxSE, inSolAut.getNuControlST());
/* 655 */     subTrama_SE.completaLongitud();
/*     */ 
/*     */     
/* 658 */     SubTrama_GE subTrama_GE = new SubTrama_GE();
/* 659 */     subTrama_GE.generaSubTrama(inSolAut.getNuControl());
/* 660 */     subTrama_GE.completaLongitud();
/*     */ 
/*     */     
/* 663 */     SubTrama_IEA subTrama_IEA = new SubTrama_IEA();
/* 664 */     subTrama_IEA.generaSubTrama(inSolAut.getIdCorrelativo());
/* 665 */     subTrama_IEA.completaLongitud();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 671 */     sReturn01 = sReturn + subTrama_SE.returnComoString("SE*", "*", "~") + subTrama_GE.returnComoString("GE*", "*", "~") + subTrama_IEA.returnComoString("IEA*", "*", "~");
/* 672 */     return sReturn01;
/*     */   }
/*     */   
/*     */   private static String cantidaSegementosTx(String sReturn) {
/* 676 */     String[] arrayCadena = sReturn.split("\\~");
/* 677 */     Integer longArray = Integer.valueOf(arrayCadena.length);
/* 678 */     return longArray.toString();
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalu\\util\SolAut271_ToX12N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */