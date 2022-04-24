package calculosAspectosLaborales;

public class Mas50 implements I_RangoEtario{
    @Override
    public double versus(I_RangoEtario rangoEtario) {
        return rangoEtario.mas50();
    }

    @Override
    public double menos40() {
        return -1;
    }

    @Override
    public double entre40y50() {
        return -0.5;
    }

    @Override
    public double mas50() {
        return -0.5;
    }
}
