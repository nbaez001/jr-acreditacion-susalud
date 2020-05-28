package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.In278ResCG;

public interface In278ResCGService {
  String beanToX12N(In278ResCG paramIn278ResCG);
  
  In278ResCG x12NToBena(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\In278ResCGService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */