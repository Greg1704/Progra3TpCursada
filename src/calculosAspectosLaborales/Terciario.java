package calculosAspectosLaborales;

public class Terciario implements I_EstudiosCursados{
    @Override
    public double versus(I_EstudiosCursados estudiosCursados) {
        return estudiosCursados.terciario();
    }

    @Override
    public double primario() {
        return 2;
    }

    @Override
    public double secundario() {
        return 1.5;
    }

    @Override
    public double terciario() {
        return 1;
    }
}
