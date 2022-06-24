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
	
	
	public void eliminaTicket(TicketSimplificado t,int i) {
		this.tickets.remove(i);	
	}
	
	
	public synchronized void sacarTicket(Empleado empleado) {
		while (this.usaLista == true) {
			try {		
				wait();	
			}catch(InterruptedException e) {}			
		}
		
		this.usaLista = true;
		i=0;
		while(i<tickets.size()) //Falta condicion: Ver como comparar rubro de ticket simplificado con el del empleado
		// funcion para analizar si el ticket corresponde, esta funcion deberia estar en empleado, de donde son los threads
		notifyAll();
		this.usaLista = false;
		
	}
	
	
	public synchronized void devolverTicket(Empleado empleado) {
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
