package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InResEntVinc278;

public interface ResEntVinc278Service {
  String beanToX12N(InResEntVinc278 paramInResEntVinc278);
  
  InResEntVinc278 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\ResEntVinc278Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */