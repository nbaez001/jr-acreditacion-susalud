/*     */ package pe.gob.susalud.jr.transaccion.susalud.validator;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi271Detalle;
/*     */ import pe.gob.susalud.jr.transaccion.susalud.util.ManagerUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegAfi271Validador
/*     */ {
/*     */   public String ValidateBeanInRegAfi271(InRegAfi271 inRegAfi271) {
/*  18 */     List<InRegAfi271Detalle> list = new ArrayList<InRegAfi271Detalle>();
/*  19 */     String buscarPorDNI = "OK";
/*  20 */     String error = "0000";
/*     */ 
/*     */     
/*  23 */     if ("".equals(inRegAfi271.getNoTransaccion())) {
/*  24 */       error = "0100";
/*  25 */     } else if ("".equals(inRegAfi271.getIdRemitente())) {
/*  26 */       error = "0101";
/*  27 */     } else if ("".equals(inRegAfi271.getIdReceptor())) {
/*  28 */       error = "0102";
/*  29 */     } else if ("".equals(inRegAfi271.getFeTransaccion())) {
/*  30 */       error = "0103";
/*  31 */     } else if ("".equals(inRegAfi271.getHoTransaccion())) {
/*  32 */       error = "0104";
/*  33 */     } else if ("".equals(inRegAfi271.getIdCorrelativo())) {
/*  34 */       error = "0105";
/*  35 */     } else if ("".equals(inRegAfi271.getIdTransaccion())) {
/*  36 */       error = "0106";
/*  37 */     } else if ("".equals(inRegAfi271.getTiFinalidad())) {
/*  38 */       error = "0107";
/*  39 */     } else if ("".equals(inRegAfi271.getCaRemitente())) {
/*  40 */       error = "0108";
/*  41 */     } else if ("".equals(inRegAfi271.getCaReceptor())) {
/*  42 */       error = "0116";
/*  43 */     } else if ("".equals(inRegAfi271.getNuRucReceptor())) {
/*  44 */       error = "0117";
/*  45 */     } else if (inRegAfi271.getInRegAfi271Detalles().size() >= 0) {
/*     */       
/*  47 */       list = inRegAfi271.getInRegAfi271Detalles();
/*  48 */       InRegAfi271Detalle inRegAfi271Detalle = new InRegAfi271Detalle();
/*     */       
/*  50 */       for (int i = 0; i < list.size(); i++) {
/*  51 */         inRegAfi271Detalle = list.get(i);
/*     */         
/*  53 */         if ("".equals(inRegAfi271Detalle.getCaPaciente())) {
/*  54 */           error = "0150"; break;
/*     */         } 
/*  56 */         if ("".equals(inRegAfi271Detalle.getApPaternoPaciente())) {
/*  57 */           error = "0151"; break;
/*     */         } 
/*  59 */         if ("".equals(inRegAfi271Detalle.getNoPaciente())) {
/*  60 */           error = "0152"; break;
/*     */         } 
/*  62 */         if ("".equals(inRegAfi271Detalle.getCoPaciente())) {
/*  63 */           error = "0153"; break;
/*     */         } 
/*  65 */         if ("".equals(inRegAfi271Detalle.getApMaternoPaciente())) {
/*  66 */           error = "0154"; break;
/*     */         } 
/*  68 */         if ("".equals(inRegAfi271Detalle.getEsPaciente())) {
/*  69 */           error = "0155"; break;
/*     */         } 
/*  71 */         if ("".equals(inRegAfi271Detalle.getTiDocumentoPaciente())) {
/*  72 */           error = "0156"; break;
/*     */         } 
/*  74 */         if ("".equals(inRegAfi271Detalle.getNuDocumentoPaciente())) {
/*  75 */           error = "0157"; break;
/*     */         } 
/*  77 */         if ("".equals(inRegAfi271Detalle.getCoVinculoFamPaciente())) {
/*  78 */           error = "0171"; break;
/*     */         } 
/*  80 */         if ("".equals(inRegAfi271Detalle.getFeNacePaciente())) {
/*  81 */           error = "0175"; break;
/*     */         } 
/*  83 */         if ("".equals(inRegAfi271Detalle.getGePaciente())) {
/*  84 */           error = "0176"; break;
/*     */         } 
/*  86 */         if ("".equals(inRegAfi271Detalle.getTiRegimenPaciente())) {
/*  87 */           error = "0190"; break;
/*     */         } 
/*  89 */         if ("".equals(inRegAfi271Detalle.getNuCarnetPaciente())) {
/*  90 */           error = "0191"; break;
/*     */         } 
/*  92 */         if ("".equals(inRegAfi271Detalle.getFeFinAtencionPaciente())) {
/*  93 */           error = "0192"; break;
/*     */         } 
/*  95 */         if ("".equals(inRegAfi271Detalle.getCaAseguradora())) {
/*  96 */           error = "0193"; break;
/*     */         } 
/*  98 */         if ("".equals(inRegAfi271Detalle.getCoAseguradora())) {
/*  99 */           error = "0194"; break;
/*     */         } 
/* 101 */         if ("".equals(inRegAfi271Detalle.getFeIniAfiliaPaciente())) {
/* 102 */           error = "0210"; break;
/*     */         } 
/* 104 */         if ("".equals(inRegAfi271Detalle.getFeFinAfiliaPaciente())) {
/* 105 */           error = "0211";
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 110 */         if ("".equals(inRegAfi271Detalle.getCaTitular())) {
/* 111 */           error = "0400"; break;
/*     */         } 
/* 113 */         if ("".equals(inRegAfi271Detalle.getApPaternoTitular())) {
/* 114 */           error = "0401"; break;
/*     */         } 
/* 116 */         if ("".equals(inRegAfi271Detalle.getNoTitular())) {
/* 117 */           error = "0402"; break;
/*     */         } 
/* 119 */         if ("".equals(inRegAfi271Detalle.getCoTitular())) {
/* 120 */           error = "0403"; break;
/*     */         } 
/* 122 */         if ("".equals(inRegAfi271Detalle.getApMaternoTitular())) {
/* 123 */           error = "0404"; break;
/*     */         } 
/* 125 */         if ("".equals(inRegAfi271Detalle.getTiDocumentoTitular())) {
/* 126 */           error = "0405";
/*     */           
/*     */           break;
/*     */         } 
/* 130 */         if ("".equals(inRegAfi271Detalle.getNuDocumentoTitular())) {
/* 131 */           error = "0407";
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */         
/* 137 */         if ("".equals(inRegAfi271Detalle.getFeFallecidoTitular())) {
/* 138 */           error = "0410"; break;
/*     */         } 
/* 140 */         if ("".equals(inRegAfi271Detalle.getCoPaisTitular())) {
/* 141 */           error = "0411";
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 149 */     if (error.equals("0000"))
/* 150 */       if (inRegAfi271.getNoTransaccion().trim().length() < 1 || inRegAfi271
/* 151 */         .getNoTransaccion().trim().length() > 60) {
/* 152 */         error = "0750";
/* 153 */       } else if (ManagerUtil.validaAlfanumerico(inRegAfi271.getIdRemitente()) != '0' || inRegAfi271
/* 154 */         .getIdRemitente().length() != 15) {
/* 155 */         error = "0751";
/* 156 */       } else if (inRegAfi271.getIdReceptor().length() != 15) {
/* 157 */         error = "0752";
/* 158 */       } else if (!ManagerUtil.validaFecha(inRegAfi271.getFeTransaccion(), "YYYYmmdd") || inRegAfi271
/* 159 */         .getFeTransaccion().trim().length() != 8) {
/* 160 */         error = "0753";
/* 161 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getHoTransaccion()) != '0' || inRegAfi271
/* 162 */         .getHoTransaccion().trim().length() < 4 || inRegAfi271
/* 163 */         .getHoTransaccion().trim().length() > 8) {
/* 164 */         error = "0754";
/* 165 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getIdCorrelativo()) != '0' || inRegAfi271
/* 166 */         .getIdCorrelativo().trim().length() != 9) {
/* 167 */         error = "0755";
/* 168 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getIdTransaccion()) != '0' || inRegAfi271
/* 169 */         .getIdTransaccion().trim().length() != 3) {
/* 170 */         error = "0756";
/* 171 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getTiFinalidad()) != '0' || inRegAfi271
/* 172 */         .getTiFinalidad().trim().length() != 2) {
/* 173 */         error = "0757";
/* 174 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getCaRemitente()) != '0' || inRegAfi271
/* 175 */         .getCaRemitente().trim().length() != 1 || (
/* 176 */         !inRegAfi271.getCaRemitente().trim().equals("1") && 
/* 177 */         !inRegAfi271.getCaRemitente().trim().equals("2"))) {
/* 178 */         error = "0758";
/* 179 */       } else if (ManagerUtil.validaSoloDigito(inRegAfi271.getCaReceptor()) != '0' || inRegAfi271
/* 180 */         .getCaReceptor().trim().length() != 1 || (
/* 181 */         !inRegAfi271.getCaReceptor().trim().equals("1") && 
/* 182 */         !inRegAfi271.getCaReceptor().trim().equals("2"))) {
/* 183 */         error = "0766";
/* 184 */       } else if (inRegAfi271.getNuRucReceptor().trim().length() < 2 || inRegAfi271
/* 185 */         .getNuRucReceptor().trim().length() > 20 || inRegAfi271
/* 186 */         .getNuRucReceptor().trim().equals("00000000000")) {
/* 187 */         error = "0767";
/* 188 */       } else if (inRegAfi271.getInRegAfi271Detalles().size() >= 0) {
/* 189 */         list = inRegAfi271.getInRegAfi271Detalles();
/* 190 */         InRegAfi271Detalle inRegAfi271Detalle = new InRegAfi271Detalle();
/*     */         
/* 192 */         for (int i = 0; i < list.size(); i++) {
/* 193 */           inRegAfi271Detalle = list.get(i);
/*     */ 
/*     */ 
/*     */           
/* 197 */           if (inRegAfi271Detalle.getCaPaciente().length() == 1)
/* 198 */             if (((!inRegAfi271Detalle.getCaPaciente().trim().equals("1") ? 1 : 0) & (
/* 199 */               !inRegAfi271Detalle.getCaPaciente().trim().equals("2") ? 1 : 0)) == 0) {
/*     */ 
/*     */               
/* 202 */               if (inRegAfi271Detalle.getApPaternoPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 203 */                 .getApPaternoPaciente().trim().length() > 60) {
/* 204 */                 error = "0801"; break;
/*     */               } 
/* 206 */               if (inRegAfi271Detalle.getNoPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 207 */                 .getNoPaciente().trim().length() > 35) {
/* 208 */                 error = "0802"; break;
/*     */               } 
/* 210 */               if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getCoPaciente()) != '0' || inRegAfi271Detalle
/* 211 */                 .getCoPaciente().trim().length() < 2 || inRegAfi271Detalle
/* 212 */                 .getCoPaciente().trim().length() > 20) {
/* 213 */                 error = "0803"; break;
/*     */               } 
/* 215 */               if (inRegAfi271Detalle.getApMaternoPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 216 */                 .getApMaternoPaciente().trim().length() > 60) {
/* 217 */                 error = "0804"; break;
/*     */               } 
/* 219 */               if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getEsPaciente()) != '0' || inRegAfi271Detalle
/* 220 */                 .getEsPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 221 */                 .getEsPaciente().trim().length() > 2) {
/* 222 */                 error = "0805"; break;
/*     */               } 
/* 224 */               if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getTiDocumentoPaciente()) != '0' || inRegAfi271Detalle
/* 225 */                 .getTiDocumentoPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 226 */                 .getTiDocumentoPaciente().trim().length() > 2) {
/* 227 */                 error = "0806"; break;
/*     */               } 
/* 229 */               if (inRegAfi271Detalle.getNuDocumentoPaciente().trim().equals("00000000") || 
/* 230 */                 ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getNuDocumentoPaciente()) != '0' || inRegAfi271Detalle
/* 231 */                 .getNuDocumentoPaciente().trim().length() != 8) {
/* 232 */                 error = "0807"; break;
/*     */               } 
/* 234 */               if (inRegAfi271Detalle.getCoVinculoFamPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 235 */                 .getCoVinculoFamPaciente().trim().length() > 2) {
/* 236 */                 error = "0821"; continue;
/* 237 */               }  if (!ManagerUtil.validaFecha(inRegAfi271Detalle.getFeNacePaciente(), "YYYYmmdd") || inRegAfi271Detalle
/* 238 */                 .getFeNacePaciente().trim().length() != 8) {
/* 239 */                 error = "0825"; break;
/*     */               } 
/* 241 */               if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getGePaciente()) != '0' || inRegAfi271Detalle
/* 242 */                 .getGePaciente().trim().length() != 1) {
/* 243 */                 error = "0826"; break;
/*     */               } 
/* 245 */               if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getTiRegimenPaciente()) != '0' || inRegAfi271Detalle
/* 246 */                 .getTiRegimenPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 247 */                 .getTiRegimenPaciente().trim().length() > 15) {
/* 248 */                 error = "0840"; break;
/*     */               } 
/* 250 */               if (inRegAfi271Detalle.getNuCarnetPaciente().trim().length() < 1 || inRegAfi271Detalle
/* 251 */                 .getNuCarnetPaciente().trim().length() > 20) {
/* 252 */                 error = "0841"; break;
/*     */               } 
/* 254 */               if (!ManagerUtil.validaFecha(inRegAfi271Detalle.getFeFinAtencionPaciente(), "YYYYmmdd") || inRegAfi271Detalle
/* 255 */                 .getFeFinAtencionPaciente().trim().length() != 8) {
/* 256 */                 error = "0842"; break;
/*     */               } 
/* 258 */               if (inRegAfi271Detalle.getCaAseguradora().trim().length() == 1)
/* 259 */                 if (((!inRegAfi271Detalle.getCaAseguradora().trim().equals("1") ? 1 : 0) & (
/* 260 */                   !inRegAfi271Detalle.getCaAseguradora().trim().equals("2") ? 1 : 0)) == 0) {
/*     */ 
/*     */                   
/* 263 */                   if (inRegAfi271Detalle.getCoAseguradora().trim().length() < 1 || inRegAfi271Detalle
/* 264 */                     .getCoAseguradora().trim().length() > 20) {
/* 265 */                     error = "0844"; break;
/*     */                   } 
/* 267 */                   if (!ManagerUtil.validaFecha(inRegAfi271Detalle.getFeIniAfiliaPaciente(), "YYYYmmdd") || inRegAfi271Detalle
/* 268 */                     .getFeIniAfiliaPaciente().trim().length() != 8) {
/* 269 */                     error = "0910"; break;
/*     */                   } 
/* 271 */                   if (!ManagerUtil.validaFecha(inRegAfi271Detalle.getFeFinAfiliaPaciente(), "YYYYmmdd") || inRegAfi271Detalle
/* 272 */                     .getFeFinAfiliaPaciente().trim().length() != 8) {
/* 273 */                     error = "0912";
/*     */                     
/*     */                     break;
/*     */                   } 
/*     */                   
/* 278 */                   if (inRegAfi271Detalle.getCaTitular().trim().length() != 1 || (
/* 279 */                     !inRegAfi271Detalle.getCaTitular().trim().equals("1") && 
/* 280 */                     !inRegAfi271Detalle.getCaTitular().trim().equals("2"))) {
/* 281 */                     error = "1100"; break;
/*     */                   } 
/* 283 */                   if (inRegAfi271Detalle.getApPaternoTitular().trim().length() < 1 || inRegAfi271Detalle
/* 284 */                     .getApPaternoTitular().trim().length() > 60) {
/* 285 */                     error = "1101"; break;
/*     */                   } 
/* 287 */                   if (inRegAfi271Detalle.getNoTitular().trim().length() < 1 || inRegAfi271Detalle
/* 288 */                     .getNoTitular().trim().length() > 35) {
/* 289 */                     error = "1102"; break;
/*     */                   } 
/* 291 */                   if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getCoTitular()) != '0' || inRegAfi271Detalle
/* 292 */                     .getCoTitular().trim().length() < 2 || inRegAfi271Detalle
/* 293 */                     .getCoTitular().trim().length() > 80) {
/* 294 */                     error = "1103"; break;
/*     */                   } 
/* 296 */                   if (inRegAfi271Detalle.getApMaternoTitular().trim().length() < 1 || inRegAfi271Detalle
/* 297 */                     .getApMaternoTitular().trim().length() > 60)
/* 298 */                   { error = "1104"; }
/* 299 */                   else { if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getTiDocumentoTitular()) != '0' || inRegAfi271Detalle
/* 300 */                       .getTiDocumentoTitular().trim().length() < 1 || inRegAfi271Detalle
/* 301 */                       .getTiDocumentoTitular().trim().length() > 2) {
/* 302 */                       error = "1105";
/*     */ 
/*     */                       
/*     */                       break;
/*     */                     } 
/*     */ 
/*     */                     
/* 309 */                     if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getNuDocumentoTitular()) != '0' || inRegAfi271Detalle
/* 310 */                       .getNuDocumentoTitular().trim().length() < 1 || inRegAfi271Detalle
/* 311 */                       .getNuDocumentoTitular().trim().length() > 20) {
/* 312 */                       error = "1107";
/*     */                       
/*     */                       break;
/*     */                     } 
/* 316 */                     if (!ManagerUtil.validaFecha(inRegAfi271Detalle.getFeFallecidoTitular(), "YYYYmmdd") || inRegAfi271Detalle
/* 317 */                       .getFeFallecidoTitular().trim().length() != 8) {
/* 318 */                       error = "1110"; break;
/*     */                     } 
/* 320 */                     if (ManagerUtil.validaSoloDigito(inRegAfi271Detalle.getCoPaisTitular()) != '0' || inRegAfi271Detalle
/* 321 */                       .getCoPaisTitular().trim().length() < 2 || inRegAfi271Detalle
/* 322 */                       .getCoPaisTitular().trim().length() > 3) {
/* 323 */                       error = "1111"; break;
/*     */                     }  }
/*     */                    continue;
/*     */                 }   error = "0843"; break;
/*     */             }   error = "0800";
/*     */         } 
/*     */       }  
/* 330 */     return error;
/*     */   }
/*     */ }


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\validator\RegAfi271Validador.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */