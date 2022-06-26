package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_Locacion extends Serializable{

    public abstract double versus(I_Locacion locacion);

    public abstract double homeOffice();

    public abstract double presencial();

    public abstract double indistinto();
    
    public String toString();
}
