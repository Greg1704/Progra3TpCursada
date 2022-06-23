package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import excepciones.AtributoInvalidoException;

public class Locacion implements Serializable{
	private String locacion;
	private int peso;
	private I_Locacion instanciaLocacion;
	
	public Locacion(String locacion,int peso) throws AtributoInvalidoException {
		this.locacion = locacion;
		this.peso = peso;
		LocacionFactory factory=new LocacionFactory();
		instanciaLocacion = factory.getLocacion(locacion);
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

	public I_Locacion getInstanciaLocacion() {
		return instanciaLocacion;
	}
}
