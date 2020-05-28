package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.In271ConDtad;

public interface In271ConDtadService {
  String beanToX12N(In271ConDtad paramIn271ConDtad);
  
  In271ConDtad x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\In271ConDtadService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */