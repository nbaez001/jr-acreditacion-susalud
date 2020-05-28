package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InConAse270;

public interface ConAse270Service {
  String beanToX12N(InConAse270 paramInConAse270);
  
  InConAse270 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\ConAse270Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */