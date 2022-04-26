package calculosAspectosLaborales;

import encuentro.RondaEncuentros;

public class RemuneracionFactory {
    public I_Remuneracion getRemuneracion(double remuneracion){
        if(remuneracion < 0){
            return null;
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
