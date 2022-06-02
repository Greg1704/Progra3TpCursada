package estadoTicket;

import armaTickets.TicketDeBusqueda;

public class Cancela implements I_EstadoTicket {
	private TicketDeBusqueda ticket;
	
	public Cancela(TicketDeBusqueda ticket) {
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
