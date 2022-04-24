package atributosFormularios;

public class Remuneracion {
	private double remuneracion;
	private int peso;
	
	public Remuneracion(double remuneracion,int peso) {
		this.remuneracion = remuneracion;
		this.peso = peso;
	}

	public double getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
}
