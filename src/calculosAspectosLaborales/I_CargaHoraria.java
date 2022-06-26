package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_CargaHoraria extends Serializable{

    public abstract double versus(I_CargaHoraria cargaHoraria);

    public abstract double media();

    public abstract double completa();

    public abstract double extendida();
}
