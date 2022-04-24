package calculosAspectosLaborales;

public class EntreV1yV2 implements I_Remuneracion{
    @Override
    public double versus(I_Remuneracion remuneracion) {
        return remuneracion.entreV1yV2();
    }

    @Override
    public double menorV1() {
        return -0.5;
    }

    @Override
    public double entreV1yV2() {
        return 1;
    }

    @Override
    public double mayorV2() {
        return 1;
    }
}
