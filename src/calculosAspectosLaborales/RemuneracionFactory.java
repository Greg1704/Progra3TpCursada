package calculosAspectosLaborales;

import encuentro.RondaEncuentros;
import excepciones.AtributoInvalidoException;

public class RemuneracionFactory {
    public I_Remuneracion getRemuneracion(double remuneracion) throws AtributoInvalidoException {
        if(remuneracion < 0){
            throw new AtributoInvalidoException("Atributo Remuneracion menor a cero");
        }
        if(remuneracion < RondaEncuentros.getV1()){
            return (MenorV1) new MenorV1();
        }
        if(remuneracion < RondaEncuentros.getV2()){
            return (EntreV1yV2) new EntreV1yV2();
        }else{
            return (MayorV2) new MayorV2();
        }
    }
}
