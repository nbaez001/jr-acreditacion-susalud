/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctr;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResSctrDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResSctrValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(In271ResSctr inResSctr) {
/*  17 */     List<In271ResSctrDetalle> list = new ArrayList<In271ResSctrDetalle>();
/*  18 */     String buscarPorDNI = "OK";
/*  19 */     String error = "0000";
/*     */ 
/*     */     
/*  22 */     if ("".equals(inResSctr.getNoTransaccion())) {
/*  23 */       error = "0100";
/*  24 */     } else if ("".equals(inResSctr.getIdRemitente())) {
/*  25 */       error = "0101";
/*  26 */     } else if ("".equals(inResSctr.getIdReceptor())) {
/*  27 */       error = "0102";
/*  28 */     } else if ("".equals(inResSctr.getFeTransaccion())) {
/*  29 */       error = "0103";
/*  30 */     } else if ("".equals(inResSctr.getHoTransaccion())) {
/*  31 */       error = "0104";
/*  32 */     } else if ("".equals(inResSctr.getIdCorrelativo())) {
/*  33 */       error = "0105";
/*  34 */     } else if ("".equals(inResSctr.getIdTransaccion())) {
/*  35 */       error = "0106";
/*  36 */     } else if ("".equals(inResSctr.getTiFinalidad())) {
/*  37 */       error = "0107";
/*  38 */     } else if ("".equals(inResSctr.getCaRemitente())) {
/*  39 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     else if ("".equals(inResSctr.getCaReceptor())) {
/*  49 */       error = "0116";
/*  50 */     } else if ("".equals(inResSctr.getNuRucReceptor())) {
/*  51 */       error = "0117";
/*     */     }
/*  53 */     else if ("".equals(inResSctr.getCaPaciente())) {
/*  54 */       error = "0150";
/*  55 */     } else if ("".equals(inResSctr.getApPaternoPaciente())) {
/*  56 */       error = "0151";
/*  57 */     } else if ("".equals(inResSctr.getNoPaciente())) {
/*  58 */       error = "0152";
/*  59 */     } else if ("".equals(inResSctr.getCoAfPaciente())) {
/*  60 */       error = "0153";
/*  61 */     } else if ("".equals(inResSctr.getApMaternoPaciente())) {
/*  62 */       error = "0154";
/*  63 */     } else if ("".equals(inResSctr.getCoTiDoPaciente())) {
/*  64 */       error = "0156";
/*  65 */     } else if ("".equals(inResSctr.getNuDocPaciente())) {
/*  66 */       error = "0157";
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
/*     */     }
/*  97 */     else if (inResSctr.getIn271ResSctrDetalles().size() >= 0) {
/*     */       
/*  99 */       list = inResSctr.getIn271ResSctrDetalles();
/* 100 */       In271ResSctrDetalle inResSctrDetalle = new In271ResSctrDetalle();
/*     */       
/* 102 */       for (int i = 0; i < list.size(); i++) {
/* 103 */         inResSctrDetalle = list.get(i);
/*     */         
/* 105 */         if ("".equals(inResSctrDetalle.getTiCaContratante())) {
/* 106 */           error = "0350";
/* 107 */         } else if ("".equals(inResSctrDetalle.getNoEmApPaContratante())) {
/* 108 */           error = "0351";
/* 109 */         } else if ("".equals(inResSctrDetalle.getCoEmContratante())) {
/* 110 */           error = "0352";
/* 111 */         } else if ("".equals(inResSctrDetalle.getIdCaReContratante())) {
/* 112 */           error = "0356";
/* 113 */         } else if ("".equals(inResSctrDetalle.getReIdContratante())) {
/* 114 */           error = "0357";
/*     */         }
/* 116 */         else if ("".equals(inResSctrDetalle.getTiCaLuAtencion())) {
/* 117 */           error = "0200";
/* 118 */         } else if ("".equals(inResSctrDetalle.getNoEmLuAtencion())) {
/* 119 */           error = "0201";
/* 120 */         } else if ("".equals(inResSctrDetalle.getCoEmReLuAtencion())) {
/* 121 */           error = "0202";
/* 122 */         } else if ("".equals(inResSctrDetalle.getIdCaReLuAtencion())) {
/* 123 */           error = "0203";
/* 124 */         } else if ("".equals(inResSctrDetalle.getReIdLuAtencion())) {
/* 125 */           error = "0204";
/* 126 */         } else if ("".equals(inResSctrDetalle.getCoLuAtencion())) {
/* 127 */           error = "0205";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/* 134 */         else if ("".equals(inResSctrDetalle.getDeTiAccidente())) {
/* 135 */           error = "0209";
/* 136 */         } else if ("".equals(inResSctrDetalle.getFeAfiliacion())) {
/* 137 */           error = "0210";
/*     */         
/*     */         }
/* 140 */         else if ("".equals(inResSctrDetalle.getFeOcAccidente())) {
/* 141 */           error = "0212";
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 148 */     if (error.equals("0000")) {
/* 149 */       if (inResSctr.getNoTransaccion().trim().length() < 1 || inResSctr.getNoTransaccion().trim().length() > 60) {
/* 150 */         error = "0750";
/* 151 */       } else if (ManagerUtil.validaAlfanumerico(inResSctr.getIdRemitente()) != '0' || inResSctr.getIdRemitente().length() != 15) {
/* 152 */         error = "0751";
/* 153 */       } else if (inResSctr.getIdReceptor().length() != 15) {
/* 154 */         error = "0752";
/* 155 */       } else if (!ManagerUtil.validaFecha(inResSctr.getFeTransaccion(), "YYYYmmdd") || inResSctr.getFeTransaccion().trim().length() != 8) {
/* 156 */         error = "0753";
/* 157 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getHoTransaccion()) != '0' || inResSctr.getHoTransaccion().trim().length() < 4 || inResSctr.getHoTransaccion().trim().length() > 8) {
/* 158 */         error = "0754";
/* 159 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getIdCorrelativo()) != '0' || inResSctr.getIdCorrelativo().trim().length() != 9) {
/* 160 */         error = "0755";
/* 161 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getIdTransaccion()) != '0' || inResSctr.getIdTransaccion().trim().length() != 3) {
/* 162 */         error = "0756";
/* 163 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getTiFinalidad()) != '0' || inResSctr.getTiFinalidad().trim().length() != 2) {
/* 164 */         error = "0757";
/* 165 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getCaRemitente()) != '0' || inResSctr
/* 166 */         .getCaRemitente().trim().length() != 1 || (
/* 167 */         !inResSctr.getCaRemitente().trim().equals("1") && 
/* 168 */         !inResSctr.getCaRemitente().trim().equals("2"))) {
/* 169 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 175 */       else if (ManagerUtil.validaSoloDigito(inResSctr.getCaReceptor()) != '0' || inResSctr
/* 176 */         .getCaReceptor().trim().length() != 1 || (
/* 177 */         !inResSctr.getCaReceptor().trim().equals("1") && 
/* 178 */         !inResSctr.getCaReceptor().trim().equals("2"))) {
/* 179 */         error = "0766";
/* 180 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getNuRucReceptor()) != '0' || inResSctr.getNuRucReceptor().trim().length() < 2 || inResSctr
/* 181 */         .getNuRucReceptor().trim().length() > 20 || inResSctr
/* 182 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 183 */         error = "0767";
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
/*     */       }
/* 206 */       else if (ManagerUtil.validaSoloDigito(inResSctr.getCaPaciente()) != '0' || inResSctr
/* 207 */         .getCaPaciente().trim().length() != 1 || (
/* 208 */         !inResSctr.getCaPaciente().trim().equals("1") && 
/* 209 */         !inResSctr.getCaPaciente().trim().equals("2"))) {
/* 210 */         error = "0800";
/* 211 */       } else if (inResSctr.getApPaternoPaciente().trim().length() < 1 || inResSctr
/* 212 */         .getApPaternoPaciente().trim().length() > 60) {
/* 213 */         error = "0801";
/* 214 */       } else if (inResSctr.getNoPaciente().trim().length() < 1 || inResSctr
/* 215 */         .getNoPaciente().trim().length() > 35) {
/* 216 */         error = "0802";
/* 217 */       } else if (ManagerUtil.validaSoloDigito(inResSctr.getCoAfPaciente()) != '0' || inResSctr
/* 218 */         .getCoAfPaciente().trim().length() < 2 || inResSctr
/* 219 */         .getCoAfPaciente().trim().length() > 20) {
/* 220 */         error = "0803";
/* 221 */       } else if (inResSctr.getApMaternoPaciente().trim().length() < 1 || inResSctr
/* 222 */         .getApMaternoPaciente().trim().length() > 60) {
/* 223 */         error = "0804";
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 228 */       else if (ManagerUtil.validaSoloDigito(inResSctr.getCoTiDoPaciente()) != '0' || inResSctr
/* 229 */         .getCoTiDoPaciente().trim().length() < 1 || inResSctr
/* 230 */         .getCoTiDoPaciente().trim().length() > 2) {
/* 231 */         error = "0806";
/* 232 */       } else if (inResSctr.getNuDocPaciente().trim().equals("00000000") || 
/* 233 */         ManagerUtil.validaSoloDigito(inResSctr.getNuDocPaciente()) != '0' || inResSctr
/* 234 */         .getNuDocPaciente().trim().length() != 8) {
/* 235 */         error = "0807";
/* 236 */       } else if (inResSctr.getIn271ResSctrDetalles().size() >= 0) {
/*     */         
/* 238 */         list = inResSctr.getIn271ResSctrDetalles();
/* 239 */         In271ResSctrDetalle in271ResSctrDetalle = new In271ResSctrDetalle();
/*     */         
/* 241 */         for (int i = 0; i < list.size(); i++) {
/* 242 */           in271ResSctrDetalle = list.get(i);
/*     */ 
/*     */           
/* 245 */           if (in271ResSctrDetalle.getTiCaContratante().trim().length() != 1 || (
/* 246 */             !in271ResSctrDetalle.getTiCaContratante().trim().equals("1") && 
/* 247 */             !in271ResSctrDetalle.getTiCaContratante().trim().equals("2"))) {
/* 248 */             error = "1050";
/* 249 */           } else if (in271ResSctrDetalle.getNoEmApPaContratante().trim().length() < 1 || in271ResSctrDetalle
/* 250 */             .getNoEmApPaContratante().trim().length() > 60) {
/* 251 */             error = "1051";
/* 252 */           } else if (in271ResSctrDetalle.getCoEmContratante().trim().length() < 1 || in271ResSctrDetalle
/* 253 */             .getCoEmContratante().trim().length() > 20) {
/* 254 */             error = "1052";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           }
/* 265 */           else if (in271ResSctrDetalle.getIdCaReContratante().trim().length() < 2 || in271ResSctrDetalle.getIdCaReContratante().trim().length() > 3 || (
/* 266 */             !in271ResSctrDetalle.getIdCaReContratante().trim().equals("XX5") && 
/* 267 */             !in271ResSctrDetalle.getIdCaReContratante().trim().equals("4A"))) {
/* 268 */             error = "1056";
/* 269 */           } else if (ManagerUtil.validaSoloDigito(in271ResSctrDetalle.getReIdContratante()) != '0' || in271ResSctrDetalle
/* 270 */             .getReIdContratante().trim().length() < 1 || in271ResSctrDetalle
/* 271 */             .getReIdContratante().trim().length() > 20) {
/* 272 */             error = "1057";
/*     */           }
/* 274 */           else if (in271ResSctrDetalle.getTiCaLuAtencion().trim().length() != 1 || (
/* 275 */             !in271ResSctrDetalle.getTiCaLuAtencion().trim().equals("1") && 
/* 276 */             !in271ResSctrDetalle.getTiCaLuAtencion().trim().equals("2"))) {
/* 277 */             error = "0900";
/* 278 */           } else if (in271ResSctrDetalle.getNoEmLuAtencion().trim().length() < 1 || in271ResSctrDetalle
/* 279 */             .getNoEmLuAtencion().trim().length() > 60) {
/* 280 */             error = "0901";
/* 281 */           } else if (in271ResSctrDetalle.getCoEmReLuAtencion().trim().length() < 1 || in271ResSctrDetalle
/* 282 */             .getCoEmReLuAtencion().trim().length() > 20) {
/* 283 */             error = "0902";
/* 284 */           } else if (in271ResSctrDetalle.getIdCaReLuAtencion().trim().length() < 2 || in271ResSctrDetalle.getIdCaReLuAtencion().trim().length() > 3 || (
/* 285 */             !in271ResSctrDetalle.getIdCaReLuAtencion().trim().equals("XX5") && 
/* 286 */             !in271ResSctrDetalle.getIdCaReLuAtencion().trim().equals("4A"))) {
/* 287 */             error = "0903";
/* 288 */           } else if (in271ResSctrDetalle.getReIdLuAtencion().trim().length() < 1 || in271ResSctrDetalle
/* 289 */             .getReIdLuAtencion().trim().length() > 20) {
/* 290 */             error = "0904";
/* 291 */           } else if (in271ResSctrDetalle.getCoLuAtencion().trim().length() < 1 || in271ResSctrDetalle
/* 292 */             .getCoLuAtencion().trim().length() > 20) {
/* 293 */             error = "0905";
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
/*     */           }
/* 306 */           else if (in271ResSctrDetalle.getDeTiAccidente().trim().length() < 1 || in271ResSctrDetalle
/* 307 */             .getDeTiAccidente().trim().length() > 60) {
/* 308 */             error = "0909";
/* 309 */           } else if (!ManagerUtil.validaFecha(in271ResSctrDetalle.getFeAfiliacion(), "YYYYmmdd") || in271ResSctrDetalle.getFeAfiliacion().trim().length() != 8) {
/* 310 */             error = "0910";
/*     */           
/*     */           }
/* 313 */           else if (!ManagerUtil.validaFecha(in271ResSctrDetalle.getFeOcAccidente(), "YYYYmmdd") || in271ResSctrDetalle.getFeOcAccidente().trim().length() != 8) {
/* 314 */             error = "0912";
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 319 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ResSctrValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */