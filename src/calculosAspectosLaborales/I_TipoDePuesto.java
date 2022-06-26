package calculosAspectosLaborales;

import java.io.Serializable;

public interface I_TipoDePuesto extends Serializable{

    public abstract double versus(I_TipoDePuesto tipoDePuesto);

    public abstract double junior();

    public abstract double senior();

    public abstract double managment();
}
