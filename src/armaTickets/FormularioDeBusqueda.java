package armaTickets;

import java.io.Serializable;

import atributosFormularios.*;
import excepciones.AtributoInvalidoException;
import excepciones.FormularioInvalidoException;


public class FormularioDeBusqueda implements Serializable{
	private Locacion locacion;
	private Remuneracion remuneracion;
	private CargaHoraria cargaHoraria;
	private TipoPuestoLaboral tipoPuestoLaboral;
	private Edad edad;
	private ExperienciaPrevia experienciaPrevia;
	private EstudiosCursados estudiosCursados;
	
	
	public FormularioDeBusqueda(String locacion,int pesoLocacion, double remuneracion, int pesoRemuneracion,String cargaHoraria,int pesoCargaHoraria, 
			String tipoPuestoLaboral,int pesoTipoPuestoLaboral, int edad,int pesoEdad, String experienciaPrevia,int pesoExperienciaPrevia,
			String estudiosCursados,int pesoEstudiosCursados) throws FormularioInvalidoException {
		try {
			this.locacion = new Locacion(locacion, pesoLocacion);
			this.remuneracion = new Remuneracion(remuneracion, pesoRemuneracion);
			this.cargaHoraria = new CargaHoraria(cargaHoraria, pesoCargaHoraria);
			this.tipoPuestoLaboral = new TipoPuestoLaboral(tipoPuestoLaboral, pesoTipoPuestoLaboral);
			this.edad = new Edad(edad, pesoEdad);
			this.experienciaPrevia = new ExperienciaPrevia(experienciaPrevia, pesoExperienciaPrevia);
			this.estudiosCursados = new EstudiosCursados(estudiosCursados, pesoEstudiosCursados);
		}catch(AtributoInvalidoException e){
			System.out.println(e.getMessage());
			throw new FormularioInvalidoException("Datos invalidos en el formulario");
		}
	}
	
	public TipoPuestoLaboral getPuestoLaboral(){ //Esto se cambia para evitar confusiones 
		return this.tipoPuestoLaboral;
	}
	
	public Remuneracion getRemuneracion(){
		return this.remuneracion;
	}

	public Locacion getLocacion() {
		return locacion;
	}

	public CargaHoraria getCargaHoraria() {
		return cargaHoraria;
	}

	public TipoPuestoLaboral getTipoPuestoLaboral() {
		return tipoPuestoLaboral;
	}

	public Edad getEdad() {
		return edad;
	}

	public ExperienciaPrevia getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public EstudiosCursados getEstudiosCursados() {
		return estudiosCursados;
	}
	
	
	
}
