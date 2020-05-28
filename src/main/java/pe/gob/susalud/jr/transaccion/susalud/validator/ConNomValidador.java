/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConNom271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConNomValidador
/*     */ {
/*     */   public String ValidateBeanInConNom271(InConNom271 inConNom) {
/*  17 */     List<InConNom271Detalle> list = new ArrayList<InConNom271Detalle>();
/*  18 */     String buscarPorDNI = "OK";
/*  19 */     String error = "0000";
/*     */ 
/*     */     
/*  22 */     if ("".equals(inConNom.getNoTransaccion())) {
/*  23 */       error = "0100";
/*  24 */     } else if ("".equals(inConNom.getIdRemitente())) {
/*  25 */       error = "0101";
/*  26 */     } else if ("".equals(inConNom.getIdReceptor())) {
/*  27 */       error = "0102";
/*  28 */     } else if ("".equals(inConNom.getFeTransaccion())) {
/*  29 */       error = "0103";
/*  30 */     } else if ("".equals(inConNom.getHoTransaccion())) {
/*  31 */       error = "0104";
/*  32 */     } else if ("".equals(inConNom.getIdCorrelativo())) {
/*  33 */       error = "0105";
/*  34 */     } else if ("".equals(inConNom.getIdTransaccion())) {
/*  35 */       error = "0106";
/*  36 */     } else if ("".equals(inConNom.getTiFinalidad())) {
/*  37 */       error = "0107";
/*  38 */     } else if ("".equals(inConNom.getCaRemitente())) {
/*  39 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     else if ("".equals(inConNom.getCaReceptor())) {
/*  49 */       error = "0116";
/*  50 */     } else if ("".equals(inConNom.getNuRucReceptor())) {
/*  51 */       error = "0117";
/*  52 */     } else if (inConNom.getInConNom271Detalles().size() >= 0) {
/*     */       
/*  54 */       list = inConNom.getInConNom271Detalles();
/*  55 */       InConNom271Detalle inConNom271Detalle = new InConNom271Detalle();
/*     */       
/*  57 */       for (int i = 0; i < list.size(); i++) {
/*  58 */         inConNom271Detalle = list.get(i);
/*     */         
/*  60 */         if ("".equals(inConNom271Detalle.getCaPaciente())) {
/*  61 */           error = "0150"; break;
/*     */         } 
/*  63 */         if ("".equals(inConNom271Detalle.getApPaternoPaciente())) {
/*  64 */           error = "0151"; break;
/*     */         } 
/*  66 */         if ("".equals(inConNom271Detalle.getNoPaciente())) {
/*  67 */           error = "0152"; break;
/*     */         } 
/*  69 */         if ("".equals(inConNom271Detalle.getCoAfPaciente())) {
/*  70 */           error = "0153"; break;
/*     */         } 
/*  72 */         if ("".equals(inConNom271Detalle.getApMaternoPaciente())) {
/*  73 */           error = "0154"; break;
/*     */         } 
/*  75 */         if ("".equals(inConNom271Detalle.getCoEsPaciente())) {
/*  76 */           error = "0155"; break;
/*     */         } 
/*  78 */         if ("".equals(inConNom271Detalle.getTiDoPaciente())) {
/*  79 */           error = "0156"; break;
/*     */         } 
/*  81 */         if ("".equals(inConNom271Detalle.getNuDoPaciente())) {
/*  82 */           error = "0157";
/*     */ 
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */ 
/*     */         
/*  90 */         if ("".equals(inConNom271Detalle.getNuContratoPaciente())) {
/*  91 */           error = "0160";
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
/* 102 */         if ("".equals(inConNom271Detalle.getCoProducto())) {
/* 103 */           error = "0164"; break;
/*     */         } 
/* 105 */         if ("".equals(inConNom271Detalle.getCoDescripcion())) {
/* 106 */           error = "0165";
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 111 */         if ("".equals(inConNom271Detalle.getCoParentesco())) {
/* 112 */           error = "0173";
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
/* 132 */         if ("".equals(inConNom271Detalle.getFeNacimiento())) {
/* 133 */           error = "0177";
/* 134 */         } else if ("".equals(inConNom271Detalle.getGenero())) {
/* 135 */           error = "0178";
/*     */         } 
/*     */       } 
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
/* 174 */     if (error.equals("0000")) {
/* 175 */       if (inConNom.getNoTransaccion().trim().length() < 1 || inConNom.getNoTransaccion().trim().length() > 60) {
/* 176 */         error = "0750";
/* 177 */       } else if (ManagerUtil.validaAlfanumerico(inConNom.getIdRemitente()) != '0' || inConNom.getIdRemitente().length() != 15) {
/* 178 */         error = "0751";
/* 179 */       } else if (inConNom.getIdReceptor().length() != 15) {
/* 180 */         error = "0752";
/* 181 */       } else if (!ManagerUtil.validaFecha(inConNom.getFeTransaccion(), "YYYYmmdd") || inConNom.getFeTransaccion().trim().length() != 8) {
/* 182 */         error = "0753";
/* 183 */       } else if (ManagerUtil.validaSoloDigito(inConNom.getHoTransaccion()) != '0' || inConNom.getHoTransaccion().trim().length() < 4 || inConNom.getHoTransaccion().trim().length() > 8) {
/* 184 */         error = "0754";
/* 185 */       } else if (ManagerUtil.validaSoloDigito(inConNom.getIdCorrelativo()) != '0' || inConNom.getIdCorrelativo().trim().length() != 9) {
/* 186 */         error = "0755";
/* 187 */       } else if (ManagerUtil.validaSoloDigito(inConNom.getIdTransaccion()) != '0' || inConNom.getIdTransaccion().trim().length() != 3) {
/* 188 */         error = "0756";
/* 189 */       } else if (ManagerUtil.validaSoloDigito(inConNom.getTiFinalidad()) != '0' || inConNom.getTiFinalidad().trim().length() != 2) {
/* 190 */         error = "0757";
/* 191 */       } else if (ManagerUtil.validaSoloDigito(inConNom.getCaRemitente()) != '0' || inConNom
/* 192 */         .getCaRemitente().trim().length() != 1 || (
/* 193 */         !inConNom.getCaRemitente().trim().equals("1") && 
/* 194 */         !inConNom.getCaRemitente().trim().equals("2"))) {
/* 195 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 201 */       else if (ManagerUtil.validaSoloDigito(inConNom.getCaReceptor()) != '0' || inConNom
/* 202 */         .getCaReceptor().trim().length() != 1 || (
/* 203 */         !inConNom.getCaReceptor().trim().equals("1") && 
/* 204 */         !inConNom.getCaReceptor().trim().equals("2"))) {
/* 205 */         error = "0766";
/* 206 */       } else if (inConNom.getNuRucReceptor().trim().length() < 2 || inConNom
/* 207 */         .getNuRucReceptor().trim().length() > 20 || inConNom
/* 208 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 209 */         error = "0715";
/* 210 */       } else if (inConNom.getInConNom271Detalles().size() >= 0) {
/* 211 */         list = inConNom.getInConNom271Detalles();
/* 212 */         InConNom271Detalle inConNom271Detalle = new InConNom271Detalle();
/*     */         
/* 214 */         for (int i = 0; i < list.size(); i++) {
/* 215 */           inConNom271Detalle = list.get(i);
/*     */ 
/*     */           
/* 218 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getCaPaciente()) != '0' || inConNom271Detalle
/* 219 */             .getCaPaciente().trim().length() != 1 || (
/* 220 */             !inConNom271Detalle.getCaPaciente().trim().equals("1") && 
/* 221 */             !inConNom271Detalle.getCaPaciente().trim().equals("2"))) {
/* 222 */             error = "0800"; break;
/*     */           } 
/* 224 */           if (inConNom271Detalle.getApPaternoPaciente().trim().length() < 1 || inConNom271Detalle
/* 225 */             .getApPaternoPaciente().trim().length() > 60) {
/* 226 */             error = "0801"; break;
/*     */           } 
/* 228 */           if (inConNom271Detalle.getNoPaciente().trim().length() < 1 || inConNom271Detalle
/* 229 */             .getNoPaciente().trim().length() > 35) {
/* 230 */             error = "0802"; break;
/*     */           } 
/* 232 */           if (inConNom271Detalle.getCoAfPaciente().trim().length() < 2 || inConNom271Detalle
/* 233 */             .getCoAfPaciente().trim().length() > 20) {
/* 234 */             error = "0803"; break;
/*     */           } 
/* 236 */           if (inConNom271Detalle.getApMaternoPaciente().trim().length() < 1 || inConNom271Detalle
/* 237 */             .getApMaternoPaciente().trim().length() > 60) {
/* 238 */             error = "0804"; break;
/*     */           } 
/* 240 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getCoEsPaciente()) != '0' || inConNom271Detalle
/* 241 */             .getCoEsPaciente().trim().length() < 1 || inConNom271Detalle
/* 242 */             .getCoEsPaciente().trim().length() > 2) {
/* 243 */             error = "0805"; break;
/*     */           } 
/* 245 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getTiDoPaciente()) != '0' || inConNom271Detalle
/* 246 */             .getTiDoPaciente().trim().length() < 1 || inConNom271Detalle
/* 247 */             .getTiDoPaciente().trim().length() > 2) {
/* 248 */             error = "0806"; break;
/*     */           } 
/* 250 */           if (inConNom271Detalle.getNuDoPaciente().trim().equals("00000000") || 
/* 251 */             ManagerUtil.validaSoloDigito(inConNom271Detalle.getNuDoPaciente()) != '0' || inConNom271Detalle
/* 252 */             .getNuDoPaciente().trim().length() != 8) {
/* 253 */             error = "0807";
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */           
/* 263 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getNuContratoPaciente()) != '0' || inConNom271Detalle
/* 264 */             .getNuContratoPaciente().trim().length() < 1 || inConNom271Detalle
/* 265 */             .getNuContratoPaciente().trim().length() > 20) {
/* 266 */             error = "0810";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 282 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getCoProducto()) != '0' || inConNom271Detalle
/* 283 */             .getCoProducto().trim().length() < 1 || inConNom271Detalle
/* 284 */             .getCoProducto().trim().length() > 20) {
/* 285 */             error = "0814"; break;
/*     */           } 
/* 287 */           if (inConNom271Detalle.getCoDescripcion().trim().length() < 1 || inConNom271Detalle
/* 288 */             .getCoDescripcion().trim().length() > 80) {
/* 289 */             error = "0815";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 305 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getCoParentesco()) != '0' || inConNom271Detalle
/* 306 */             .getCoParentesco().trim().length() < 1 || inConNom271Detalle
/* 307 */             .getCoParentesco().trim().length() > 2) {
/* 308 */             error = "0821";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 322 */           if (!ManagerUtil.validaFecha(inConNom271Detalle.getFeNacimiento(), "YYYYmmdd") || inConNom271Detalle.getFeNacimiento().trim().length() != 8) {
/* 323 */             error = "0825"; break;
/*     */           } 
/* 325 */           if (ManagerUtil.validaSoloDigito(inConNom271Detalle.getGenero()) != '0' || inConNom271Detalle
/* 326 */             .getGenero().trim().length() != 1) {
/* 327 */             error = "0826";
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
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
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
/* 378 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConNomValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */