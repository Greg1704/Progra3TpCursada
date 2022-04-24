package calculosAspectosLaborales;

public class Extendida implements I_CargaHoraria{
    @Override
    public double versus(I_CargaHoraria cargaHoraria) {
        return cargaHoraria.extendida();
    }

    @Override
    public double media() {
        return -1;
    }

    @Override
    public double completa() {
        return -0.5;
    }

    @Override
    public double extendida() {
        return -0.5;
    }
}
