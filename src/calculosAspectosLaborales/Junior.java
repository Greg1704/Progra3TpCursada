package calculosAspectosLaborales;

public class Junior implements I_TipoDePuesto{

    @Override
    public double versus(I_TipoDePuesto tipoDePuesto) {
        return tipoDePuesto.junior();
    }

    @Override
    public double junior() {
        return 1;
    }

    @Override
    public double senior() {
        return -0.5;
    }

    @Override
    public double managment() {
        return -1;
    }
}
