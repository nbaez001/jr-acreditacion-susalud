package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InConProc271;

public interface In271ConProcService {
  String beanToX12N(InConProc271 paramInConProc271);
  
  InConProc271 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\In271ConProcService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */