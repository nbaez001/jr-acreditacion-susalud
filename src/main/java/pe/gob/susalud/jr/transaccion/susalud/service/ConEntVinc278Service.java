package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InConEntVinc278;

public interface ConEntVinc278Service {
  String beanToX12N(InConEntVinc278 paramInConEntVinc278);
  
  InConEntVinc278 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\ConEntVinc278Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */