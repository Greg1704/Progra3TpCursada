package calculosAspectosLaborales;

public class ExpPreviaMedia implements I_ExperienciaPrevia {
    @Override
    public double versus(I_ExperienciaPrevia exp) {
        return exp.media();
    }

    @Override
    public double nada() {
        return 1.5;
    }

    @Override
    public double media() {
        return 1;
    }

    @Override
    public double mucha() {
        return -1.5;
    }
}
