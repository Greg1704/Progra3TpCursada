package calculosAspectosLaborales;

public class Menos40 implements I_RangoEtario{
    @Override
    public double versus(I_RangoEtario rangoEtario) {
        return rangoEtario.menos40();
    }

    @Override
    public double menos40() {
        return 1;
    }

    @Override
    public double entre40y50() {
        return -0.5;
    }

    @Override
    public double mas50() {
        return -1;
    }
}
