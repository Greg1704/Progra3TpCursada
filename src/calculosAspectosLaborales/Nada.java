package calculosAspectosLaborales;

public class Nada implements I_ExperienciaPrevia {
    @Override
    public double versus(I_ExperienciaPrevia exp) {
        return exp.nada();
    }

    @Override
    public double nada() {
        return 1;
    }

    @Override
    public double media() {
        return -0.5;
    }

    @Override
    public double mucha() {
        return -2;
    }
}
