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
	
	
	
	
	public void setUsaLista(boolean usaLista) {
		this.usaLista = usaLista;
	}

	public synchronized void sacarTicket(Empleado empleado) {
		
        while (this.usaLista == true) {
            try {
                System.out.println(empleado.getNya()+"espera");
                wait();
            }catch(InterruptedException e) {}
        }
        
        this.usaLista = true;
              
        empleado.eleccionTicketSimp(this.tickets);
      	this.usaLista = false;
		notifyAll();
		
		
    }	
	
	
	public synchronized void devolverTicket(Empleado empleado,TicketSimplificado t) {
		while (this.usaLista == true) {
			try {	
				System.out.println(empleado.getNya()+" espera2");
				wait();
			}catch(InterruptedException e) {}
			
		}
		
		this.usaLista = true;
		this.agregaTicket(t);
		this.usaLista = false;
		notifyAll();
	}

	public ArrayList<TicketSimplificado> getTickets() {
		return tickets;
	}
	
	
	
	
}
