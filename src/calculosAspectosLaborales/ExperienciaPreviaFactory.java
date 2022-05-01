package calculosAspectosLaborales;

import excepciones.AtributoInvalidoException;

public class ExperienciaPreviaFactory {
    public I_ExperienciaPrevia getExperienciaPrevia(String experienciaPrevia) throws AtributoInvalidoException {
        if(experienciaPrevia.equalsIgnoreCase("Nada"))
            return (Nada) new Nada();
        if(experienciaPrevia.equalsIgnoreCase("Media"))
            return (ExpPreviaMedia) new ExpPreviaMedia();
        if(experienciaPrevia.equalsIgnoreCase("Mucha"))
            return (Mucha) new Mucha();
        throw new AtributoInvalidoException("Atributo Experiencia Previa incorrecto");
    }
}
