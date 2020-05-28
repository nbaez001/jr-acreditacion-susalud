/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ConProcValidador
/*     */ {
/*     */   public String ValidateBeanIn271ResSctr(InConProc271 inConProc) {
/*  17 */     List<InConProc271Detalle> list = new ArrayList<InConProc271Detalle>();
/*  18 */     String buscarPorDNI = "OK";
/*  19 */     String error = "0000";
/*     */ 
/*     */     
/*  22 */     if ("".equals(inConProc.getNoTransaccion())) {
/*  23 */       error = "0100";
/*  24 */     } else if ("".equals(inConProc.getIdRemitente())) {
/*  25 */       error = "0101";
/*  26 */     } else if ("".equals(inConProc.getIdReceptor())) {
/*  27 */       error = "0102";
/*  28 */     } else if ("".equals(inConProc.getFeTransaccion())) {
/*  29 */       error = "0103";
/*  30 */     } else if ("".equals(inConProc.getHoTransaccion())) {
/*  31 */       error = "0104";
/*  32 */     } else if ("".equals(inConProc.getIdCorrelativo())) {
/*  33 */       error = "0105";
/*  34 */     } else if ("".equals(inConProc.getIdTransaccion())) {
/*  35 */       error = "0106";
/*  36 */     } else if ("".equals(inConProc.getTiFinalidad())) {
/*  37 */       error = "0107";
/*  38 */     } else if ("".equals(inConProc.getCaRemitente())) {
/*  39 */       error = "0108";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*  48 */     else if ("".equals(inConProc.getCaReceptor())) {
/*  49 */       error = "0116";
/*  50 */     } else if ("".equals(inConProc.getNuRucReceptor())) {
/*  51 */       error = "0117";
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
/*  63 */     else if (inConProc.getInConProc271Detalles().size() >= 0) {
/*     */       
/*  65 */       list = inConProc.getInConProc271Detalles();
/*  66 */       InConProc271Detalle inConProcDetalle = new InConProc271Detalle();
/*     */       
/*  68 */       for (int i = 0; i < list.size(); i++) {
/*  69 */         inConProcDetalle = list.get(i);
/*     */         
/*  71 */         if ("".equals(inConProcDetalle.getCoInProcedimiento())) {
/*  72 */           error = "0500";
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
/* 104 */     if (error.equals("0000")) {
/* 105 */       if (inConProc.getNoTransaccion().trim().length() < 1 || inConProc.getNoTransaccion().trim().length() > 60) {
/* 106 */         error = "0750";
/* 107 */       } else if (ManagerUtil.validaAlfanumerico(inConProc.getIdRemitente()) != '0' || inConProc.getIdRemitente().length() != 15) {
/* 108 */         error = "0751";
/* 109 */       } else if (inConProc.getIdReceptor().length() != 15) {
/* 110 */         error = "0752";
/* 111 */       } else if (!ManagerUtil.validaFecha(inConProc.getFeTransaccion(), "YYYYmmdd") || inConProc.getFeTransaccion().trim().length() != 8) {
/* 112 */         error = "0753";
/* 113 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getHoTransaccion()) != '0' || inConProc.getHoTransaccion().trim().length() < 4 || inConProc.getHoTransaccion().trim().length() > 8) {
/* 114 */         error = "0754";
/* 115 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getIdCorrelativo()) != '0' || inConProc.getIdCorrelativo().trim().length() != 9) {
/* 116 */         error = "0755";
/* 117 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getIdTransaccion()) != '0' || inConProc.getIdTransaccion().trim().length() != 3) {
/* 118 */         error = "0756";
/* 119 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getTiFinalidad()) != '0' || inConProc.getTiFinalidad().trim().length() != 2) {
/* 120 */         error = "0757";
/* 121 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getCaRemitente()) != '0' || inConProc
/* 122 */         .getCaRemitente().trim().length() != 1 || (
/* 123 */         !inConProc.getCaRemitente().trim().equals("1") && 
/* 124 */         !inConProc.getCaRemitente().trim().equals("2"))) {
/* 125 */         error = "0758";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 131 */       else if (ManagerUtil.validaSoloDigito(inConProc.getCaReceptor()) != '0' || inConProc
/* 132 */         .getCaReceptor().trim().length() != 1 || (
/* 133 */         !inConProc.getCaReceptor().trim().equals("1") && 
/* 134 */         !inConProc.getCaReceptor().trim().equals("2"))) {
/* 135 */         error = "0766";
/* 136 */       } else if (ManagerUtil.validaSoloDigito(inConProc.getNuRucReceptor()) != '0' || inConProc.getNuRucReceptor().trim().length() < 2 || inConProc
/* 137 */         .getNuRucReceptor().trim().length() > 20 || inConProc
/* 138 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 139 */         error = "0767";
/* 140 */       } else if (inConProc.getInConProc271Detalles().size() >= 0) {
/*     */         
/* 142 */         list = inConProc.getInConProc271Detalles();
/* 143 */         InConProc271Detalle inConProc271Detalle = new InConProc271Detalle();
/*     */         
/* 145 */         for (int i = 0; i < list.size(); i++) {
/* 146 */           inConProc271Detalle = list.get(i);
/*     */           
/* 148 */           if (ManagerUtil.validaSoloDigito(inConProc271Detalle.getCoInProcedimiento()) != '0' || inConProc271Detalle
/* 149 */             .getCoInProcedimiento().trim().length() != 2) {
/* 150 */             error = "1200";
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 155 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\ConProcValidador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */