package atributosFormularios;

public class Locacion {
	private String locacion;
	private int peso;
	
	public Locacion(String locacion,int peso) {
		this.locacion = locacion;
		this.peso = peso;
	}

	public String getLocacion() {
		return locacion;
	}

	public void setLocacion(String locacion) {
		this.locacion = locacion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	

}
