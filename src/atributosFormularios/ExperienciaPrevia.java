package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.ExperienciaPreviaFactory;
import calculosAspectosLaborales.I_ExperienciaPrevia;
import excepciones.AtributoInvalidoException;

public class ExperienciaPrevia implements Serializable{
	private String experienciaPrevia;
	private int peso;
	private I_ExperienciaPrevia instanciaExperiencia;
	
	public ExperienciaPrevia(String experienciaPrevia,int peso) throws AtributoInvalidoException {
		this.experienciaPrevia = experienciaPrevia;
		this.peso = peso;
		ExperienciaPreviaFactory factory = new ExperienciaPreviaFactory();
		instanciaExperiencia = factory.getExperienciaPrevia(experienciaPrevia);
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public I_ExperienciaPrevia getInstanciaExperiencia() {
		return instanciaExperiencia;
	}
}
