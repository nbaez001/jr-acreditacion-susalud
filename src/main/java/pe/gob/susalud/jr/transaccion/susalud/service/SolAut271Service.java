package pe.gob.susalud.jr.transaccion.susalud.service;

import pe.gob.susalud.jr.transaccion.susalud.bean.InSolAut271;

public interface SolAut271Service {
  String beanToX12N(InSolAut271 paramInSolAut271);
  
  InSolAut271 x12NToBean(String paramString);
}


/* Location:              D:\Usuarios\externo.nbaez\Desktop\ESSALUD\RECURSOS\SITEDS - IAFAS _ ESSALUD\Librerias MQ\jr-acreditacion-susalud-1.0.jar!\pe\gob\susalud\jr\transaccion\susalud\service\SolAut271Service.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */