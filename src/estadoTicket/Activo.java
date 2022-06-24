package estadoTicket;

import armaTickets.TicketDeBusqueda;

public class Activo implements I_EstadoTicket {
	private TicketDeBusqueda ticket;
	

	public Activo(TicketDeBusqueda ticket) {
		this.ticket = ticket;
	}

	@Override
	public String activa() {
		return "El Ticket ya esta activo.";
	}

	@Override
	public String suspende() {
		this.ticket.setEstado(new Suspende(ticket));
		return "Ticket suspendido.";
	}

	@Override
	public String cancela() {
		this.ticket.setEstado(new Cancela(ticket));
		return "Ticket cancelado.";
	}

	@Override
	public String finaliza() {
		this.ticket.setEstado(new Finaliza(ticket));
		return "Ticket finalizado.";
	}

	@Override
	public void esActivo() {}


}
