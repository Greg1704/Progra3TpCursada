package atributosFormularios;

public class Remuneracion {
	private double monto; // cambio de nombre para cambiar el nombre del get asi no se superpone con el get de la clase
	private int peso;
	
	public Remuneracion(double remuneracion,int peso) {
		this.monto = remuneracion;
		this.peso = peso;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double remuneracion) {
		this.monto = remuneracion;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
}
