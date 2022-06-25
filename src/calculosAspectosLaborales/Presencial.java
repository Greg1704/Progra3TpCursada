package calculosAspectosLaborales;

public class Presencial implements I_Locacion {
    @Override
    public double versus(I_Locacion locacion) {
        return locacion.presencial();
    }

    @Override
    public double homeOffice() {
        return -1;
    }

    @Override
    public double presencial() {
        return 1;
    }

    @Override
    public double indistinto() {
        return -1;
    }

	@Override
	public String toString() {
		return "Presencial";
	}
    
}
