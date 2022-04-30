package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class EstudiosCursadosFactory {
    public I_EstudiosCursados getEstudiosCursados(String estudiosCursados) throws AtributoInvalidoException {
        if (estudiosCursados.equalsIgnoreCase("Primario"))
            return (Primario) new Primario();
        if (estudiosCursados.equalsIgnoreCase("Secundario"))
            return (Secundario) new Secundario();
        if (estudiosCursados.equalsIgnoreCase("Terciario"))
            return (Terciario) new Terciario();
        throw new AtributoInvalidoException("Atributo Estudios Cursados incorrecto");
    }
}
