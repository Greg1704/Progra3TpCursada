package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_Remuneracion extends Serializable{

    public abstract double versus(I_Remuneracion remuneracion);

    public abstract double menorV1();

    public abstract double entreV1yV2();

    public abstract double mayorV2();
}
