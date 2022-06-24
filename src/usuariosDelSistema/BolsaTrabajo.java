package usuariosDelSistema;

import java.util.ArrayList;

import ticketSimplificado.TicketSimplificado;

public class BolsaTrabajo {

	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();
	private static BolsaTrabajo instancia = null;

    private BolsaTrabajo() {}
    
    public static BolsaTrabajo getInstancia() {
		if (instancia == null)
			instancia = new BolsaTrabajo();
		return instancia;
	}
	
	
	public void agregaTicket(TicketSimplificado t) {
		this.tickets.add(t);
	}
	
	
	public void eliminaTicket(TicketSimplificado t,int i) {
		this.tickets.remove(i);	
	}
	
	
	public synchronized void sacarTicket() {
		while () {
			try {
				
				
				
			}catch(InterrumptedException e) {}
			
				
			
		}
		
	
	}
	
	
	public synchronized void devolverTicket() {
		while () {
			try {
				
				
				
			}catch(InterrumptedException e) {}
			
		}
	}
	
	
}
