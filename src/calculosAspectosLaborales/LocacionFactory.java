package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class LocacionFactory {

    public I_Locacion getLocacion(String locacion) throws AtributoInvalidoException {

        if(locacion.equalsIgnoreCase("HomeOffice")){
            return (HomeOffice) new HomeOffice();
        }
        if (locacion.equalsIgnoreCase("Presencial"))
            return (Presencial) new Presencial();
        if (locacion.equalsIgnoreCase("Indistinto"))
            return (Indistinto) new Indistinto();
        throw new AtributoInvalidoException("Atributo Locacion incorrecto");
    }
}
