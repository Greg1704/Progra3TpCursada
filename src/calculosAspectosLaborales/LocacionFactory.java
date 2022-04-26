package calculosAspectosLaborales;

public class LocacionFactory {

    public I_Locacion getLocacion(String locacion){

        if(locacion == null){
            return null;
        }
        if(locacion.equalsIgnoreCase("HomeOffice")){
            return (HomeOffice) new HomeOffice();
        }
        if (locacion.equalsIgnoreCase("Presencial"))
            return (Presencial) new Presencial();
        if (locacion.equalsIgnoreCase("Indistinto"))
            return (Indistinto) new Indistinto();

        return null;
    }
}
