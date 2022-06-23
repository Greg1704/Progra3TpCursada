package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.I_Remuneracion;
import calculosAspectosLaborales.RemuneracionFactory;
import excepciones.AtributoInvalidoException;

public class Remuneracion implements Serializable{
	private double monto; // cambio de nombre para cambiar el nombre del get asi no se superpone con el get de la clase
	private int peso;
	private I_Remuneracion instanciaRemuneracion;
	
	public Remuneracion(double remuneracion,int peso) throws AtributoInvalidoException {
		this.monto = remuneracion;
		this.peso = peso;
		RemuneracionFactory factory= new RemuneracionFactory();
		instanciaRemuneracion= factory.getRemuneracion(remuneracion);
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

	public I_Remuneracion getInstanciaRemuneracion() {
		return instanciaRemuneracion;
	}
}
