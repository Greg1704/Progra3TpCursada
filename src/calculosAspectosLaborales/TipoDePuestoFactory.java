package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class TipoDePuestoFactory {
    public I_TipoDePuesto getTipoDePuesto(String tipoDePuesto) throws AtributoInvalidoException {
        if (tipoDePuesto.equalsIgnoreCase("Junior"))
            return  (Junior) new Junior();
        if (tipoDePuesto.equalsIgnoreCase("Senior"))
            return (Senior) new Senior();
        if (tipoDePuesto.equalsIgnoreCase("Managment"))
            return (Managment) new Managment();
        throw new AtributoInvalidoException("Atributo Tipo de puesto Laboral invalido");
    }
}
