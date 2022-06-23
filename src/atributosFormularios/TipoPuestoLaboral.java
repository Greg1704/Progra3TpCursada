package atributosFormularios;


import java.io.Serializable;

import calculosAspectosLaborales.I_TipoDePuesto;
import calculosAspectosLaborales.TipoDePuestoFactory;
import excepciones.AtributoInvalidoException;

public class TipoPuestoLaboral implements Serializable{
	private String tipoPuestoLaboral;
	private int peso;
	private I_TipoDePuesto instanciaLaboral;
	
	public TipoPuestoLaboral(String tipoPuestoLaboral,int peso) throws AtributoInvalidoException {
		this.tipoPuestoLaboral = tipoPuestoLaboral;
		this.peso = peso;
		TipoDePuestoFactory factory= new TipoDePuestoFactory();
		instanciaLaboral = factory.getTipoDePuesto(tipoPuestoLaboral);
	}

	public String getTipoPuestoLaboral() {
		return tipoPuestoLaboral;
	}

	public void setTipoPuestoLaboral(String tipoPuestoLaboral) {
		this.tipoPuestoLaboral = tipoPuestoLaboral;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public I_TipoDePuesto getInstanciaLaboral() {
		return instanciaLaboral;
	}
}
