package calculosAspectosLaborales;

public class Primario implements  I_EstudiosCursados{
    @Override
    public double versus(I_EstudiosCursados estudiosCursados) {
        return estudiosCursados.primario();
    }

    @Override
    public double primario() {
        return 1;
    }

    @Override
    public double secundario() {
        return -0.5;
    }

    @Override
    public double terciario() {
        return -2;
    }
}
