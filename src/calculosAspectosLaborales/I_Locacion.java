package calculosAspectosLaborales;

public interface I_Locacion {

    public abstract double versus(I_Locacion locacion);

    public abstract double homeOffice();

    public abstract double presencial();

    public abstract double indistinto();
    
    public String toString();
}
