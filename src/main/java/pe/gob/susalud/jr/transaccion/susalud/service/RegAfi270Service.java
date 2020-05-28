package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InRegAfi270;

public interface RegAfi270Service {
  String beanToX12N(InRegAfi270 paramInRegAfi270);
  
  InRegAfi270 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\RegAfi270Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */