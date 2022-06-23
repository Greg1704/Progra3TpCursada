package atributosFormularios;

import java.io.Serializable;

import calculosAspectosLaborales.CargaHorariaFactory;
import calculosAspectosLaborales.I_CargaHoraria;
import excepciones.AtributoInvalidoException;

public class CargaHoraria implements Serializable{
	private String cargaHoraria;
	private int peso;
	private I_CargaHoraria instanciaHorario;
	
	public CargaHoraria(String cargaHoraria,int peso) throws AtributoInvalidoException {
		this.cargaHoraria = cargaHoraria;
		this.peso = peso;
		CargaHorariaFactory factory = new CargaHorariaFactory();
		instanciaHorario = factory.getCargaHoraria(cargaHoraria);
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public I_CargaHoraria getInstanciaHorario() {
		return instanciaHorario;
	}
}
