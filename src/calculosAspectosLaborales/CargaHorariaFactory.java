package calculosAspectosLaborales;

public class CargaHorariaFactory {

    public I_CargaHoraria getCargaHoraria(String cargaHoraria){
        if(cargaHoraria == null){
            return null;
        }
        if (cargaHoraria.equalsIgnoreCase("Media"))
            return (Media) new Media();
        if (cargaHoraria.equalsIgnoreCase("Completa"))
            return (Completa) new Completa();
        if(cargaHoraria.equalsIgnoreCase("Extendida"))
            return (Extendida) new Extendida();
        return null;
    }
}
