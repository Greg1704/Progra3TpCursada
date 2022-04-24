package calculosAspectosLaborales;

public class Mucha implements I_ExperienciaPrevia {
    @Override
    public double versus(I_ExperienciaPrevia exp) {
        return exp.mucha();
    }

    @Override
    public double nada() {
        return 2;
    }

    @Override
    public double media() {
        return 1.5;
    }

    @Override
    public double mucha() {
        return 1;
    }
}
