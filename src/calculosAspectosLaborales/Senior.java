package calculosAspectosLaborales;

public class Senior implements I_TipoDePuesto{
    @Override
    public double versus(I_TipoDePuesto tipoDePuesto) {
        return tipoDePuesto.senior();
    }

    @Override
    public double junior() {
        return -0.5;
    }

    @Override
    public double senior() {
        return 1;
    }

    @Override
    public double managment() {
        return 1;
    }
}
