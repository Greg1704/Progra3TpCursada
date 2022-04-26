package calculosAspectosLaborales;

public class TipoDePuestoFactory {
    public I_TipoDePuesto getTipoDePuesto(String tipoDePuesto){
        if(tipoDePuesto == null){
            return null;
        }
        if (tipoDePuesto.equalsIgnoreCase("Junior"))
            return  (Junior) new Junior();
        if (tipoDePuesto.equalsIgnoreCase("Senior"))
            return (Senior) new Senior();
        if (tipoDePuesto.equalsIgnoreCase("Managment"))
            return (Managment) new Managment();
        return null;
    }
}
