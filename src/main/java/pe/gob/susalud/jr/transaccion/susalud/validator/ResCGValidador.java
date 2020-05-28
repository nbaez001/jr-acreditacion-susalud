/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCGDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResCGValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(In278ResCG inResCG) {
/*  17 */     List<In278ResCGDetalle> list = new ArrayList<In278ResCGDetalle>();
/*  18 */     String buscarPorDNI = "OK";
/*  19 */     String error = "0000";
/*     */ 
/*     */     
/*  22 */     if ("".equals(inResCG.getNoTransaccion())) {
/*  23 */       error = "0100";
/*  24 */     } else if ("".equals(inResCG.getIdRemitente())) {
/*  25 */       error = "0101";
/*  26 */     } else if ("".equals(inResCG.getIdReceptor())) {
/*  27 */       error = "0102";
/*  28 */     } else if ("".equals(inResCG.getFeTransaccion())) {
/*  29 */       error = "0103";
/*  30 */     } else if ("".equals(inResCG.getHoTransaccion())) {
/*  31 */       error = "0104";
/*  32 */     } else if ("".equals(inResCG.getIdCorrelativo())) {
/*  33 */       error = "0105";
/*  34 */     } else if ("".equals(inResCG.getIdTransaccion())) {
/*  35 */       error = "0106";
/*  36 */     } else if ("".equals(inResCG.getTiFinalidad())) {
/*  37 */       error = "0107";
/*  38 */     } else if ("".equals(inResCG.getCaRemitente())) {
/*  39 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     else if ("".equals(inResCG.getCaReceptor())) {
/*  49 */       error = "0116";
/*  50 */     } else if ("".equals(inResCG.getNuRucReceptor())) {
/*  51 */       error = "0117";
/*  52 */     } else if (inResCG.getIn278ResCGDetalles().size() >= 0) {
/*     */       
/*  54 */       list = inResCG.getIn278ResCGDetalles();
/*  55 */       In278ResCGDetalle inResCGDetalle = new In278ResCGDetalle();
/*     */       
/*  57 */       for (int i = 0; i < list.size(); i++) {
/*  58 */         inResCGDetalle = list.get(i);
/*     */ 
/*     */         
/*  61 */         if ("".equals(inResCGDetalle.getCaPaciente())) {
/*  62 */           error = "0150"; break;
/*     */         } 
/*  64 */         if ("".equals(inResCGDetalle.getApPaternoPaciente())) {
/*  65 */           error = "0151"; break;
/*     */         } 
/*  67 */         if ("".equals(inResCGDetalle.getNoPaciente())) {
/*  68 */           error = "0152"; break;
/*     */         } 
/*  70 */         if ("".equals(inResCGDetalle.getCoAfPaciente())) {
/*  71 */           error = "0153"; break;
/*     */         } 
/*  73 */         if ("".equals(inResCGDetalle.getApMaternoPaciente())) {
/*  74 */           error = "0154"; break;
/*     */         } 
/*  76 */         if ("".equals(inResCGDetalle.getCoTiDoPaciente())) {
/*  77 */           error = "0156"; break;
/*     */         } 
/*  79 */         if ("".equals(inResCGDetalle.getNuDoPaciente())) {
/*  80 */           error = "0157"; break;
/*     */         } 
/*  82 */         if ("".equals(inResCGDetalle.getMonPago()))
/*  83 */         { error = "0452"; }
/*  84 */         else { if ("".equals(inResCGDetalle.getTiCaContratante())) {
/*  85 */             error = "0350"; break;
/*     */           } 
/*  87 */           if ("".equals(inResCGDetalle.getNoPaContratante())) {
/*  88 */             error = "0351"; break;
/*     */           } 
/*  90 */           if ("".equals(inResCGDetalle.getNoContratante())) {
/*  91 */             error = "0353"; break;
/*     */           } 
/*  93 */           if ("".equals(inResCGDetalle.getNoMaContratante())) {
/*  94 */             error = "0354"; break;
/*     */           } 
/*  96 */           if ("".equals(inResCGDetalle.getDeCarGarantia())) {
/*  97 */             error = "0471";
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/* 102 */           if ("".equals(inResCGDetalle.getNuCarGarantia())) {
/* 103 */             error = "0473"; break;
/*     */           } 
/* 105 */           if ("".equals(inResCGDetalle.getVeCarGarantia())) {
/* 106 */             error = "0474"; break;
/*     */           } 
/* 108 */           if ("".equals(inResCGDetalle.getEsCarGarantia())) {
/* 109 */             error = "0475"; break;
/*     */           } 
/* 111 */           if ("".equals(inResCGDetalle.getFeCarGarantia())) {
/* 112 */             error = "0476"; break;
/*     */           } 
/* 114 */           if ("".equals(inResCGDetalle.getCoMoneda())) {
/* 115 */             error = "0462"; break;
/*     */           } 
/* 117 */           if ("".equals(inResCGDetalle.getCoProducto())) {
/* 118 */             error = "0164";
/*     */             
/*     */             break;
/*     */           } 
/*     */           
/* 123 */           if ("".equals(inResCGDetalle.getDeProcedimiento())) {
/* 124 */             error = "0503";
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           }  }
/*     */       
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 136 */     if (error.equals("0000")) {
/* 137 */       if (inResCG.getNoTransaccion().trim().length() < 1 || inResCG.getNoTransaccion().trim().length() > 60) {
/* 138 */         error = "0750";
/* 139 */       } else if (ManagerUtil.validaAlfanumerico(inResCG.getIdRemitente()) != '0' || inResCG.getIdRemitente().length() != 15) {
/* 140 */         error = "0751";
/* 141 */       } else if (inResCG.getIdReceptor().length() != 15) {
/* 142 */         error = "0752";
/* 143 */       } else if (!ManagerUtil.validaFecha(inResCG.getFeTransaccion(), "YYYYmmdd") || inResCG.getFeTransaccion().trim().length() != 8) {
/* 144 */         error = "0753";
/* 145 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getHoTransaccion()) != '0' || inResCG.getHoTransaccion().trim().length() < 4 || inResCG.getHoTransaccion().trim().length() > 8) {
/* 146 */         error = "0754";
/* 147 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getIdCorrelativo()) != '0' || inResCG.getIdCorrelativo().trim().length() != 9) {
/* 148 */         error = "0755";
/* 149 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getIdTransaccion()) != '0' || inResCG.getIdTransaccion().trim().length() != 3) {
/* 150 */         error = "0756";
/* 151 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getTiFinalidad()) != '0' || inResCG.getTiFinalidad().trim().length() != 2) {
/* 152 */         error = "0757";
/* 153 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getCaRemitente()) != '0' || inResCG
/* 154 */         .getCaRemitente().trim().length() != 1 || (
/* 155 */         !inResCG.getCaRemitente().trim().equals("1") && 
/* 156 */         !inResCG.getCaRemitente().trim().equals("2"))) {
/* 157 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 163 */       else if (ManagerUtil.validaSoloDigito(inResCG.getCaReceptor()) != '0' || inResCG
/* 164 */         .getCaReceptor().trim().length() != 1 || (
/* 165 */         !inResCG.getCaReceptor().trim().equals("1") && 
/* 166 */         !inResCG.getCaReceptor().trim().equals("2"))) {
/* 167 */         error = "0766";
/* 168 */       } else if (ManagerUtil.validaSoloDigito(inResCG.getNuRucReceptor()) != '0' || inResCG.getNuRucReceptor().trim().length() < 2 || inResCG
/* 169 */         .getNuRucReceptor().trim().length() > 20 || inResCG
/* 170 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 171 */         error = "0767";
/* 172 */       } else if (inResCG.getIn278ResCGDetalles().size() >= 0) {
/* 173 */         list = inResCG.getIn278ResCGDetalles();
/* 174 */         In278ResCGDetalle inResCGDetalle = new In278ResCGDetalle();
/*     */         
/* 176 */         for (int i = 0; i < list.size(); i++) {
/* 177 */           inResCGDetalle = list.get(i);
/* 178 */           if (ManagerUtil.validaSoloDigito(inResCGDetalle.getCaPaciente()) != '0' || inResCGDetalle
/* 179 */             .getCaPaciente().trim().length() != 1 || (
/* 180 */             !inResCGDetalle.getCaPaciente().trim().equals("1") && 
/* 181 */             !inResCGDetalle.getCaPaciente().trim().equals("2"))) {
/* 182 */             error = "0800";
/* 183 */           } else if (inResCGDetalle.getApPaternoPaciente().trim().length() < 1 || inResCGDetalle
/* 184 */             .getApPaternoPaciente().trim().length() > 60) {
/* 185 */             error = "0801";
/* 186 */           } else if (inResCGDetalle.getNoPaciente().trim().length() < 1 || inResCGDetalle
/* 187 */             .getNoPaciente().trim().length() > 35) {
/* 188 */             error = "0802";
/* 189 */           } else if (inResCGDetalle.getCoAfPaciente().trim().length() < 2 || inResCGDetalle
/* 190 */             .getCoAfPaciente().trim().length() > 20) {
/* 191 */             error = "0803";
/* 192 */           } else if (inResCGDetalle.getApMaternoPaciente().trim().length() < 1 || inResCGDetalle
/* 193 */             .getApMaternoPaciente().trim().length() > 60) {
/* 194 */             error = "0804";
/* 195 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getCoTiDoPaciente()) != '0' || inResCGDetalle
/* 196 */             .getCoTiDoPaciente().trim().length() < 1 || inResCGDetalle
/* 197 */             .getCoTiDoPaciente().trim().length() > 2) {
/* 198 */             error = "0806";
/* 199 */           } else if (inResCGDetalle.getNuDoPaciente().trim().equals("00000000") || 
/* 200 */             ManagerUtil.validaSoloDigito(inResCGDetalle.getNuDoPaciente()) != '0' || inResCGDetalle
/* 201 */             .getNuDoPaciente().trim().length() != 8) {
/* 202 */             error = "0807";
/* 203 */           } else if (ManagerUtil.validaDecimales(inResCGDetalle.getMonPago()) != '0' || inResCGDetalle
/* 204 */             .getMonPago().trim().length() < 1 || inResCGDetalle
/* 205 */             .getMonPago().trim().length() > 18) {
/* 206 */             error = "1152";
/* 207 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getTiCaContratante()) != '0' || inResCGDetalle
/* 208 */             .getTiCaContratante().trim().length() != 1 || (
/* 209 */             !inResCGDetalle.getTiCaContratante().trim().equals("1") && 
/* 210 */             !inResCGDetalle.getTiCaContratante().trim().equals("2"))) {
/* 211 */             error = "1050";
/* 212 */           } else if (inResCGDetalle.getNoPaContratante().trim().length() < 1 || inResCGDetalle
/* 213 */             .getNoPaContratante().trim().length() > 60) {
/* 214 */             error = "1051";
/*     */ 
/*     */           
/*     */           }
/* 218 */           else if (inResCGDetalle.getNoContratante().trim().length() < 1 || inResCGDetalle
/* 219 */             .getNoContratante().trim().length() > 35) {
/* 220 */             error = "1053";
/* 221 */           } else if (inResCGDetalle.getNoMaContratante().trim().length() < 1 || inResCGDetalle
/* 222 */             .getNoMaContratante().trim().length() > 60) {
/* 223 */             error = "1054";
/* 224 */           } else if (inResCGDetalle.getDeCarGarantia().trim().length() < 1 || inResCGDetalle
/* 225 */             .getDeCarGarantia().trim().length() > 80) {
/* 226 */             error = "1171";
/*     */ 
/*     */           
/*     */           }
/* 230 */           else if (inResCGDetalle.getNuCarGarantia().trim().length() < 1 || inResCGDetalle
/* 231 */             .getNuCarGarantia().trim().length() > 20) {
/* 232 */             error = "1173";
/* 233 */           } else if (inResCGDetalle.getVeCarGarantia().trim().length() < 1 || inResCGDetalle
/* 234 */             .getVeCarGarantia().trim().length() > 20) {
/* 235 */             error = "1174";
/* 236 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getEsCarGarantia()) != '0' || inResCGDetalle
/* 237 */             .getEsCarGarantia().trim().length() < 1 || inResCGDetalle
/* 238 */             .getEsCarGarantia().trim().length() > 2) {
/* 239 */             error = "1175";
/* 240 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getFeCarGarantia()) != '0' || inResCGDetalle
/* 241 */             .getFeCarGarantia().trim().length() != 12) {
/* 242 */             error = "1176";
/* 243 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getCoMoneda()) != '0' || inResCGDetalle
/* 244 */             .getCoMoneda().trim().length() < 1 || inResCGDetalle
/* 245 */             .getCoMoneda().trim().length() > 3) {
/* 246 */             error = "1162";
/* 247 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getCoProducto()) != '0' || inResCGDetalle
/* 248 */             .getCoProducto().trim().length() < 1 || inResCGDetalle
/* 249 */             .getCoProducto().trim().length() > 20) {
/* 250 */             error = "0814";
/* 251 */           } else if (ManagerUtil.validaSoloDigito(inResCGDetalle.getCoProcedimiento()) != '0' || inResCGDetalle
/* 252 */             .getCoProcedimiento().trim().length() != 2) {
/* 253 */             error = "1202";
/* 254 */           } else if (inResCGDetalle.getDeProcedimiento().trim().length() < 1 || inResCGDetalle
/* 255 */             .getDeProcedimiento().trim().length() > 80) {
/* 256 */             error = "1203";
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 261 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ResCGValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */