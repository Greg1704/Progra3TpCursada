package usuariosDelSistema;

import java.util.ArrayList;

import ticketSimplificado.TicketSimplificado;

public class BolsaTrabajo {

	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();
	
	public void agregaTicket(TicketSimplificado t) {
		this.tickets.add(t);
	}
	
	public void eliminaTicket(TicketSimplificado t) {
		
			
	}
	
	
	public synchronized void sacarTicket() {
		
	}
	
	
	public synchronized void devolverTicket() {
		
	}
	
	
}
