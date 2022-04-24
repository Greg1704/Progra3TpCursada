package calculosAspectosLaborales;

public class MenorV1 implements I_Remuneracion{


    @Override
    public double versus(I_Remuneracion remuneracion) {
        return remuneracion.menorV1();
    }

    @Override
    public double menorV1() {
        return 1;
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
