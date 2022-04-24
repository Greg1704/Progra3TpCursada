package calculosAspectosLaborales;

public class Managment implements I_TipoDePuesto{
    @Override
    public double versus(I_TipoDePuesto tipoDePuesto) {
        return tipoDePuesto.managment();
    }

    @Override
    public double junior() {
        return -1;
    }

    @Override
    public double senior() {
        return -0.5;
    }

    @Override
    public double managment() {
        return -0.5;
    }
}
