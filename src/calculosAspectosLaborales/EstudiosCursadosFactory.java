package calculosAspectosLaborales;

public class EstudiosCursadosFactory {
    public I_EstudiosCursados getEstudiosCursados(String estudiosCursados){
        if(estudiosCursados == null){
            return null;
        }
        if (estudiosCursados.equalsIgnoreCase("Primario"))
            return (Primario) new Primario();
        if (estudiosCursados.equalsIgnoreCase("Secundario"))
            return (Secundario) new Secundario();
        if (estudiosCursados.equalsIgnoreCase("Terciario"))
            return (Terciario) new Terciario();
        return null;
    }
}
