package calculosAspectosLaborales;

public interface I_RangoEtario {

    public abstract double versus(I_RangoEtario rangoEtario);

    public abstract double menos40();

    public abstract double entre40y50();

    public abstract double mas50();
}
