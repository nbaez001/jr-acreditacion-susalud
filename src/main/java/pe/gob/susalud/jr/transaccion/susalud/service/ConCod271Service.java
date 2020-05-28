package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InConCod271;

public interface ConCod271Service {
  String beanToX12N(InConCod271 paramInConCod271);
  
  InConCod271 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\ConCod271Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */