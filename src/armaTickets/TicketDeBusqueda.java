package armaTickets;

import excepciones.AtributoInvalidoException;
import excepciones.FormularioInvalidoException;

import java.time.LocalDateTime;

public abstract class TicketDeBusqueda implements EstadoTicketDeBusqueda{
	private LocalDateTime fechaAlta;
	private String estadoTicket;
	private FormularioDeBusqueda formulario;
	
	public TicketDeBusqueda(LocalDateTime fechaAlta,String locacion,int pesoLocacion, double remuneracion, int pesoRemuneracion,String cargaHoraria,int pesoCargaHoraria,
							String tipoPuestoLaboral,int pesoTipoPuestoLaboral, int edad,int pesoEdad, String experienciaPrevia,int pesoExperienciaPrevia,
							String estudiosCursados,int pesoEstudiosCursados) throws FormularioInvalidoException {
		super();
		this.fechaAlta = fechaAlta;
		this.estadoTicket = "Activo";
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

	@Override
	public void activa() {
		this.estadoTicket = "Activado";
	}
	
	@Override
	public void suspende() {
		this.estadoTicket = "Suspendido";
	}

	@Override
	public void cancela() {
		this.estadoTicket = "Cancelado";
	}

	@Override
	public void finaliza() {
		this.estadoTicket = "Finalizado";
	}

	public FormularioDeBusqueda getFormularioDeBusqueda(){
		return this.formulario;
	}

	@Override
	public String toString() {
		return "TicketDeBusqueda [estadoTicket=" + estadoTicket + "]";
	}

	
}
