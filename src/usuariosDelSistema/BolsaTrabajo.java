package usuariosDelSistema;

import java.util.ArrayList;

import ticketSimplificado.TicketSimplificado;

public class BolsaTrabajo {

	private ArrayList<TicketSimplificado> tickets = new ArrayList<TicketSimplificado>();
	private static BolsaTrabajo instancia = null;
	private boolean usaLista = false;
	private int i;

    private BolsaTrabajo() {}
    
    public static BolsaTrabajo getInstancia() {
		if (instancia == null)
			instancia = new BolsaTrabajo();
		return instancia;
	}
	
	
	public void agregaTicket(TicketSimplificado t) {
		this.tickets.add(t);
	}
	
	
	public TicketSimplificado tomaTicket(int i) {
		return this.tickets.remove(i);	
	}
	
	
	public synchronized void sacarTicket(Empleado empleado) {
		while (this.usaLista == true) {
			try {		
				wait();	
			}catch(InterruptedException e) {}			
		}		
		//this.usaLista = true;
		
		i=0;
		
		while((i<tickets.size()) && !(tickets.get(i).getTipoDeTrabajo().equalsIgnoreCase((empleado.getTipoTrabajoSimp())))) {//creo que este getTicketSimp esta mal
			i++;																													//deberiamos hacer un get del ticket que quiere tambien
		} 																		
	
		if(i<tickets.size() && tickets.get(i).getTipoDeTrabajo().equalsIgnoreCase((empleado.getTipoTrabajoSimp()))) { //Si hay un ticket que me sirve
			empleado.eleccionTicketSimp(this.tomaTicket(i));
		}
																											
		this.usaLista = false;																				
		notifyAll();
		}	
	
	
	
	public synchronized void devolverTicket(Empleado empleado,TicketSimplificado t) {
		while (this.usaLista == true) {
			try {
				
				wait();
				
			}catch(InterruptedException e) {}
			
		}
		
		this.usaLista = true;
		// aca se deberia agregar el ticket nuevamentw pq no sirvio
		notifyAll();
		this.usaLista = false;
	}
	
	
}
