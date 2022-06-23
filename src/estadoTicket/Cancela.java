package estadoTicket;

import java.io.Serializable;

import armaTickets.TicketDeBusqueda;
import excepciones.NoActivoException;

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
		return "El ticket ya se encuentra finalizado.";
	}

	@Override
	public String finaliza() {
		return "El ticket se encuentra cancelado.";
	}

	@Override
	public void esActivo() throws NoActivoException {
		throw new NoActivoException();
	}

}
