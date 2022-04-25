package armaTickets;

public abstract class TicketDeBusqueda implements EstadoTicketDeBusqueda{
	private String fechaAlta;
	private String estadoTicket;
	private FormularioDeBusqueda formulario;
	
	public TicketDeBusqueda(String fechaAlta, FormularioDeBusqueda formulario) {
		super();
		this.fechaAlta = fechaAlta;
		this.estadoTicket = "Activo";
		this.formulario = formulario;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public String getEstadoTicket() {
		return estadoTicket;
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
		return this.FormularioDeBusqueda;
	}

	
}
