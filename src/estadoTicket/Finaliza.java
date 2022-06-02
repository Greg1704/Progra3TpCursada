package estadoTicket;

import armaTickets.TicketDeBusqueda;

public class Finaliza implements I_EstadoTicket {
	private TicketDeBusqueda ticket;

	public Finaliza(TicketDeBusqueda ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String activa() {
		// TODO Auto-generated method stub
	}

	@Override
	public String suspende() {
		// TODO Auto-generated method stub

	}

	@Override
	public String cancela() {
		// TODO Auto-generated method stub

	}

	@Override
	public String finaliza() {
		// TODO Auto-generated method stub

	}
	
}
