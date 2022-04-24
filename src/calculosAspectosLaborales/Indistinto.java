package calculosAspectosLaborales;

public class Indistinto implements I_Locacion {
    @Override
    public double versus(I_Locacion locacion) {
        return locacion.indistinto();
    }

    @Override
    public double homeOffice() {
        return 1;
    }

    @Override
    public double presencial() {
        return -1;
    }

    @Override
    public double indistinto() {
        return 1;
    }
}
