package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_EstudiosCursados extends Serializable{

    public abstract double versus(I_EstudiosCursados estudiosCursados);

    public abstract double primario();

    public abstract double secundario();

    public abstract double terciario();

}
