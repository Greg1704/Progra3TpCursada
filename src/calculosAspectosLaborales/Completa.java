package calculosAspectosLaborales;

public class Completa implements I_CargaHoraria{
    @Override
    public double versus(I_CargaHoraria cargaHoraria) {
        return cargaHoraria.completa();
    }

    @Override
    public double media() {
        return -0.5;
    }

    @Override
    public double completa() {
        return 1;
    }

    @Override
    public double extendida() {
        return 1;
    }
}
