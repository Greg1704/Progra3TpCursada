package calculosAspectosLaborales;

public class ExperienciaPreviaFactory {
    public I_ExperienciaPrevia getExperienciaPrevia(String experienciaPrevia){
        if(experienciaPrevia == null){
            return null;
        }
        if(experienciaPrevia.equalsIgnoreCase("Nada"))
            return (Nada) new Nada();
        if(experienciaPrevia.equalsIgnoreCase("Media"))
            return (ExpPreviaMedia) new ExpPreviaMedia();
        if(experienciaPrevia.equalsIgnoreCase("Mucha"))
            return (Mucha) new Mucha();
        return null;
    }
}
