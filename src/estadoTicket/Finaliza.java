package estadoTicket;

import armaTickets.TicketDeBusqueda;
import excepciones.NoActivoException;

public class Finaliza implements I_EstadoTicket {
	private TicketDeBusqueda ticket;

	public Finaliza(TicketDeBusqueda ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String activa() {
		return "El ticket ya fue finalizado.";
	}

	@Override
	public String suspende() {
		return "El ticket ya fue finalizado.";
	}

	@Override
	public String cancela() {
		return "El ticket ya fue finalizado.";
	}

	@Override
	public String finaliza() {
		return "El ticket se encuentra finalizado.";
	}

	@Override
	public void esActivo() throws NoActivoException {
		throw new NoActivoException();
	}
	
}
