package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_RangoEtario extends Serializable{

    public abstract double versus(I_RangoEtario rangoEtario);

    public abstract double menos40();

    public abstract double entre40y50();

    public abstract double mas50();
}
