package estadoTicket;

import armaTickets.TicketDeBusqueda;

public class Cancela implements I_EstadoTicket {
	private TicketDeBusqueda ticket;
	
	public Cancela(TicketDeBusqueda ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String activa() {
		return "El ticket se encuentra cancelado.";
	}

	@Override
	public String suspende() {
		return "El ticket se encuentra cancelado.";
	}

	@Override
	public String cancela() {
		return "El ticket ya se encuentra cancelado.";
	}

	@Override
	public String finaliza() {
		return "El ticket se encuentra finalizado.";
	}

}
