package armaTickets;

import excepciones.AtributoInvalidoException;
import excepciones.FormularioInvalidoException;

import java.io.Serializable;
import java.time.LocalDateTime;

import estadoTicket.Activo;
import estadoTicket.I_EstadoTicket;

public abstract class TicketDeBusqueda implements Serializable{
	private LocalDateTime fechaAlta;
	private String estadoTicket;
	private FormularioDeBusqueda formulario;
	private I_EstadoTicket estado;
	
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

	public String getEstadoTicket() {
		return estadoTicket;
	}

	public void setEstadoTicket(String estadoTicket) {
		this.estadoTicket = estadoTicket;
	}


	public FormularioDeBusqueda getFormularioDeBusqueda(){
		return this.formulario;
	}

	@Override
	public String toString() {
		return ". Estado de Ticket: " + estadoTicket;
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

	
}
