package calculosAspectosLaborales;

public class Media implements  I_CargaHoraria{
    @Override
    public double versus(I_CargaHoraria cargaHoraria) {
        return cargaHoraria.media();
    }

    @Override
    public double media() {
        return 1;
    }

    @Override
    public double completa() {
        return -0.5;
    }

    @Override
    public double extendida() {
        return -1;
    }
}
