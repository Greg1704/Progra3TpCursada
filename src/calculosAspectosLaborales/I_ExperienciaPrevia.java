package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_ExperienciaPrevia extends Serializable{

    public abstract double versus(I_ExperienciaPrevia exp);

    public abstract double nada();

    public abstract double media();

    public abstract double mucha();
}
