package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class RangoEtarioFactory {
    public I_RangoEtario getRangoEtario(int rangoEtario) throws AtributoInvalidoException {
        if(rangoEtario<18){
            throw new AtributoInvalidoException("Atributo Edad invalido");
        }
        if(rangoEtario < 40)
            return (Menos40) new Menos40();
        if(rangoEtario < 50)
            return (Entre40y50) new Entre40y50();
        else
            return (Mas50) new Mas50();
    }
}
