package calculosAspectosLaborales;

public class Secundario implements I_EstudiosCursados{
    @Override
    public double versus(I_EstudiosCursados estudiosCursados) {
        return estudiosCursados.secundario();
    }

    @Override
    public double primario() {
        return 1.5;
    }

    @Override
    public double secundario() {
        return 1;
    }

    @Override
    public double terciario() {
        return -1.5;
    }
}
