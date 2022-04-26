package calculosAspectosLaborales;

public class RangoEtarioFactory {
    public I_RangoEtario getRangoEtario(int rangoEtario){
        if(rangoEtario<18){
            return null;
        }
        if(rangoEtario < 40)
            return (Menos40) new Menos40();
        if(rangoEtario < 50)
            return (Entre40y50) new Entre40y50();
        else
            return (Mas50) new Mas50();
    }
}
