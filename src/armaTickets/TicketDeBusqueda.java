package armaTickets;

import excepciones.AtributoInvalidoException;
import excepciones.FormularioInvalidoException;
import excepciones.NoActivoException;

import java.io.Serializable;
import java.time.LocalDateTime;

import estadoTicket.Activo;
import estadoTicket.I_EstadoTicket;

/**
 * Clase abstracta que corresponde a los tickets de los usuarios, de ella se extienden el ticket de busqueda del 
 * empleado y del empleador.<br>
 *
 */
public abstract class TicketDeBusqueda implements I_EstadoTicket{
	private LocalDateTime fechaAlta;
	private FormularioDeBusqueda formulario;
	protected I_EstadoTicket estado;
	
	public TicketDeBusqueda(LocalDateTime fechaAlta,String locacion,int pesoLocacion, double remuneracion, int pesoRemuneracion,String cargaHoraria,int pesoCargaHoraria,
							String tipoPuestoLaboral,int pesoTipoPuestoLaboral, int edad,int pesoEdad, String experienciaPrevia,int pesoExperienciaPrevia,
							String estudiosCursados,int pesoEstudiosCursados) throws FormularioInvalidoException {
		super();
		this.fechaAlta = fechaAlta;
		this.estado = new Activo(this);
		this.formulario = new FormularioDeBusqueda(locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
			 tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
			 estudiosCursados, pesoEstudiosCursados);

	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public FormularioDeBusqueda getFormularioDeBusqueda(){
		return this.formulario;
	}
	
	public I_EstadoTicket getEstado() {
		return estado;
	}

	public void setEstado(I_EstadoTicket estado) {
		this.estado = estado;
	}
	
	public String activa() {
		return this.estado.activa();
	}
	
	public String suspende() {
		return this.estado.suspende();
	}

	public String cancela() {
		return this.estado.cancela();
	}

	public String finaliza() {
		return this.estado.finaliza();
	}
	
	public abstract void esActivo() throws NoActivoException;

	@Override
	public String toString() {
		return "Ticket de busqueda: fecha de alta: " + fechaAlta + ", formulario: " + formulario.toString() + ", Estado: "
				+ getEstado();
	}

	
	
}
