package armaTickets;

import java.time.LocalDateTime;

public abstract class TicketDeBusqueda implements EstadoTicketDeBusqueda{
	private LocalDateTime fechaAlta;
	private String estadoTicket;
	private FormularioDeBusqueda formulario;
	
	public TicketDeBusqueda(LocalDateTime fechaAlta, FormularioDeBusqueda formulario) {
		super();
		this.fechaAlta = fechaAlta;
		this.estadoTicket = "Activo";
		this.formulario = formulario;
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

	
}
