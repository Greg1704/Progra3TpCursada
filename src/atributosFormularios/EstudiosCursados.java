package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.EstudiosCursadosFactory;
import calculosAspectosLaborales.I_EstudiosCursados;
import excepciones.AtributoInvalidoException;

public class EstudiosCursados implements Serializable{
	private I_EstudiosCursados instanciaEstudios;
	private String estudiosCursados;
	private int peso;
	
	public EstudiosCursados(String estudiosCursados,int peso) throws AtributoInvalidoException {
		this.estudiosCursados = estudiosCursados;
		this.peso = peso;
		EstudiosCursadosFactory factory=new EstudiosCursadosFactory();
		this.instanciaEstudios= factory.getEstudiosCursados(estudiosCursados);
	}

	public String getEstudiosCursados() {
		return estudiosCursados;
	}

	public void setEstudiosCursados(String estudiosCursados) {
		this.estudiosCursados = estudiosCursados;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public I_EstudiosCursados getInstanciaEstudios() {
		return instanciaEstudios;
	}
}
