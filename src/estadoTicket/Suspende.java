package estadoTicket;

import armaTickets.TicketDeBusqueda;
import excepciones.NoActivoException;

public class Suspende implements I_EstadoTicket {
	private TicketDeBusqueda ticket;

	public Suspende(TicketDeBusqueda ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public String activa() {
		this.ticket.setEstado(new Activo(ticket));
		return "Ticket activado nuevamente.";
	}

	@Override
	public String suspende() {
		return "El ticket ya se encuentra suspendido.";
	}

	@Override
	public String cancela() {
		this.ticket.setEstado(new Cancela(ticket));
		return "Ticket cancelado.";
	}

	@Override
	public String finaliza() {//no podria llegar nunca a esta instancia de todas formas
		return "No es posible, el ticket se encuentra finalizado";
	}

	@Override
	public void esActivo() throws NoActivoException {
		throw new NoActivoException();
	}
}
