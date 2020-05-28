package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.In278SolCG;

public interface In278SolCGService {
  String beanToX12N(In278SolCG paramIn278SolCG);
  
  In278SolCG x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\In278SolCGService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */