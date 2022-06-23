package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.I_RangoEtario;
import calculosAspectosLaborales.RangoEtarioFactory;
import excepciones.AtributoInvalidoException;

public class Edad implements Serializable{
	private int edad;
	private int peso;
	private I_RangoEtario instanciaEdad;
	
	public Edad(int edad,int peso) throws AtributoInvalidoException {
		this.edad = edad;
		this.peso = peso;
		RangoEtarioFactory factory= new RangoEtarioFactory();
		instanciaEdad = factory.getRangoEtario(edad);
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public I_RangoEtario getInstanciaEdad() {
		return instanciaEdad;
	}
}

