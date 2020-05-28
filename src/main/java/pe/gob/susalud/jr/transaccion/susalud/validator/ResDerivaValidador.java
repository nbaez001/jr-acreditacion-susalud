/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDerivaDetalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ResDerivaValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(In271ResDeriva inResDeriva) {
/*  17 */     List<In271ResDerivaDetalle> list = new ArrayList<In271ResDerivaDetalle>();
/*  18 */     String buscarPorDNI = "OK";
/*  19 */     String error = "0000";
/*     */ 
/*     */     
/*  22 */     if ("".equals(inResDeriva.getNoTransaccion())) {
/*  23 */       error = "0100";
/*  24 */     } else if ("".equals(inResDeriva.getIdRemitente())) {
/*  25 */       error = "0101";
/*  26 */     } else if ("".equals(inResDeriva.getIdReceptor())) {
/*  27 */       error = "0102";
/*  28 */     } else if ("".equals(inResDeriva.getFeTransaccion())) {
/*  29 */       error = "0103";
/*  30 */     } else if ("".equals(inResDeriva.getHoTransaccion())) {
/*  31 */       error = "0104";
/*  32 */     } else if ("".equals(inResDeriva.getIdCorrelativo())) {
/*  33 */       error = "0105";
/*  34 */     } else if ("".equals(inResDeriva.getIdTransaccion())) {
/*  35 */       error = "0106";
/*  36 */     } else if ("".equals(inResDeriva.getTiFinalidad())) {
/*  37 */       error = "0107";
/*  38 */     } else if ("".equals(inResDeriva.getCaRemitente())) {
/*  39 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     else if ("".equals(inResDeriva.getCaReceptor())) {
/*  49 */       error = "0116";
/*  50 */     } else if ("".equals(inResDeriva.getNuRucReceptor())) {
/*  51 */       error = "0117";
/*     */     
/*     */     }
/*  54 */     else if (inResDeriva.getIn271ResDerivaDetalles().size() >= 0) {
/*     */       
/*  56 */       list = inResDeriva.getIn271ResDerivaDetalles();
/*  57 */       In271ResDerivaDetalle inResDerivaDetalle = new In271ResDerivaDetalle();
/*     */       
/*  59 */       for (int i = 0; i < list.size(); i++) {
/*  60 */         inResDerivaDetalle = list.get(i);
/*     */         
/*  62 */         if ("".equals(inResDerivaDetalle.getCaPaciente())) {
/*  63 */           error = "0150";
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
/*     */           break;
/*     */         } 
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
/* 107 */         if ("".equals(inResDerivaDetalle.getCoTiProducto())) {
/* 108 */           error = "0252"; break;
/*     */         } 
/* 110 */         if ("".equals(inResDerivaDetalle.getDeProducto())) {
/* 111 */           error = "0253"; break;
/*     */         } 
/* 113 */         if ("".equals(inResDerivaDetalle.getFeAtSalud())) {
/* 114 */           error = "0254";
/* 115 */         } else if ("".equals(inResDerivaDetalle.getNoLuAtencion())) {
/* 116 */           error = "0255";
/* 117 */         } else if ("".equals(inResDerivaDetalle.getCoLuAtencion())) {
/* 118 */           error = "0256";
/*     */         } else {
/* 120 */           if ("".equals(inResDerivaDetalle.getTiDoContratante())) {
/* 121 */             error = "0355"; break;
/*     */           } 
/* 123 */           if ("".equals(inResDerivaDetalle.getIdCaReferencia())) {
/* 124 */             error = "0356"; break;
/*     */           } 
/* 126 */           if ("".equals(inResDerivaDetalle.getReIdContratante())) {
/* 127 */             error = "0357";
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 135 */     if (error.equals("0000")) {
/* 136 */       if (inResDeriva.getNoTransaccion().trim().length() < 1 || inResDeriva.getNoTransaccion().trim().length() > 60) {
/* 137 */         error = "0750";
/* 138 */       } else if (ManagerUtil.validaAlfanumerico(inResDeriva.getIdRemitente()) != '0' || inResDeriva.getIdRemitente().length() != 15) {
/* 139 */         error = "0751";
/* 140 */       } else if (inResDeriva.getIdReceptor().length() != 15) {
/* 141 */         error = "0752";
/* 142 */       } else if (!ManagerUtil.validaFecha(inResDeriva.getFeTransaccion(), "YYYYmmdd") || inResDeriva.getFeTransaccion().trim().length() != 8) {
/* 143 */         error = "0753";
/* 144 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getHoTransaccion()) != '0' || inResDeriva.getHoTransaccion().trim().length() < 4 || inResDeriva.getHoTransaccion().trim().length() > 8) {
/* 145 */         error = "0754";
/* 146 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getIdCorrelativo()) != '0' || inResDeriva.getIdCorrelativo().trim().length() != 9) {
/* 147 */         error = "0755";
/* 148 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getIdTransaccion()) != '0' || inResDeriva.getIdTransaccion().trim().length() != 3) {
/* 149 */         error = "0756";
/* 150 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getTiFinalidad()) != '0' || inResDeriva.getTiFinalidad().trim().length() != 2) {
/* 151 */         error = "0757";
/* 152 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getCaRemitente()) != '0' || inResDeriva
/* 153 */         .getCaRemitente().trim().length() != 1 || (
/* 154 */         !inResDeriva.getCaRemitente().trim().equals("1") && 
/* 155 */         !inResDeriva.getCaRemitente().trim().equals("2"))) {
/* 156 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 162 */       else if (ManagerUtil.validaSoloDigito(inResDeriva.getCaReceptor()) != '0' || inResDeriva
/* 163 */         .getCaReceptor().trim().length() != 1 || (
/* 164 */         !inResDeriva.getCaReceptor().trim().equals("1") && 
/* 165 */         !inResDeriva.getCaReceptor().trim().equals("2"))) {
/* 166 */         error = "0766";
/* 167 */       } else if (ManagerUtil.validaSoloDigito(inResDeriva.getNuRucReceptor()) != '0' || inResDeriva.getNuRucReceptor().trim().length() < 2 || inResDeriva
/* 168 */         .getNuRucReceptor().trim().length() > 20 || inResDeriva
/* 169 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 170 */         error = "0767";
/* 171 */       } else if (inResDeriva.getIn271ResDerivaDetalles().size() >= 0) {
/* 172 */         list = inResDeriva.getIn271ResDerivaDetalles();
/* 173 */         In271ResDerivaDetalle in271ResDerivaDetalle = new In271ResDerivaDetalle();
/*     */         
/* 175 */         for (int i = 0; i < list.size(); i++) {
/* 176 */           in271ResDerivaDetalle = list.get(i);
/*     */ 
/*     */           
/* 179 */           if (ManagerUtil.validaSoloDigito(in271ResDerivaDetalle.getCaPaciente()) != '0' || in271ResDerivaDetalle
/* 180 */             .getCaPaciente().trim().length() != 1 || (
/* 181 */             !in271ResDerivaDetalle.getCaPaciente().trim().equals("1") && 
/* 182 */             !in271ResDerivaDetalle.getCaPaciente().trim().equals("2"))) {
/* 183 */             error = "0800";
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */           
/* 190 */           if (ManagerUtil.validaSoloDigito(in271ResDerivaDetalle.getCoTiProducto()) != '0' || in271ResDerivaDetalle
/* 191 */             .getCoTiProducto().trim().length() < 1 || in271ResDerivaDetalle
/* 192 */             .getCoTiProducto().trim().length() > 20) {
/* 193 */             error = "0952";
/* 194 */           } else if (in271ResDerivaDetalle.getDeProducto().trim().length() < 1 || in271ResDerivaDetalle
/* 195 */             .getDeProducto().trim().length() > 60) {
/* 196 */             error = "0953";
/* 197 */           } else if (!ManagerUtil.validaFecha(in271ResDerivaDetalle.getFeAtSalud(), "YYYYmmdd") || in271ResDerivaDetalle.getFeAtSalud().trim().length() != 8) {
/* 198 */             error = "0954";
/* 199 */           } else if (in271ResDerivaDetalle.getNoLuAtencion().trim().length() < 1 || in271ResDerivaDetalle
/* 200 */             .getNoLuAtencion().trim().length() > 60) {
/* 201 */             error = "0955";
/* 202 */           } else if (in271ResDerivaDetalle.getCoLuAtencion().trim().length() < 1 || in271ResDerivaDetalle
/* 203 */             .getCoLuAtencion().trim().length() > 20) {
/* 204 */             error = "0956";
/*     */           }
/* 206 */           else if (ManagerUtil.validaSoloDigito(in271ResDerivaDetalle.getTiDoContratante()) != '0' || in271ResDerivaDetalle
/* 207 */             .getTiDoContratante().trim().length() < 1 || in271ResDerivaDetalle
/* 208 */             .getTiDoContratante().trim().length() > 2) {
/* 209 */             error = "1055";
/* 210 */           } else if (in271ResDerivaDetalle.getIdCaReferencia().trim().length() < 2 || in271ResDerivaDetalle.getIdCaReferencia().trim().length() > 3 || (
/* 211 */             !in271ResDerivaDetalle.getIdCaReferencia().trim().equals("XX5") && 
/* 212 */             !in271ResDerivaDetalle.getIdCaReferencia().trim().equals("4A"))) {
/* 213 */             error = "1056";
/* 214 */           } else if (ManagerUtil.validaSoloDigito(in271ResDerivaDetalle.getReIdContratante()) != '0' || in271ResDerivaDetalle
/* 215 */             .getReIdContratante().trim().length() < 1 || in271ResDerivaDetalle
/* 216 */             .getReIdContratante().trim().length() > 20) {
/* 217 */             error = "1057";
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/* 222 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ResDerivaValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */