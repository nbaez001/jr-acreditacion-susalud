package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.In271ResDeriva;

public interface In271ResDerivaService {
  String beanToX12N(In271ResDeriva paramIn271ResDeriva);
  
  In271ResDeriva x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\In271ResDerivaService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */