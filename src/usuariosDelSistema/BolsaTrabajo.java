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
		while (this.usaLista == true && empleado.getPasadas()>0) {
			try {		
				empleado.setPasadas(empleado.getPasadas()-1);
				wait();	
			}catch(InterruptedException e) {}			
		}
		
		this.usaLista = true;
		i=0;
	while((i<tickets.size())&&!(tickets.get(i).getTipoDeTrabajo().equals(empleado.getTicketSimpElegido().getTipoDeTrabajo()))) {//creo que este getTicketSimp esta mal
		i++;																													//deberiamos hacer un get del ticket que quiere tambien
	} //Volvimos a progra 2 chicos																								  consultar con creadores de tickets :D		
	
	if(i<tickets.size()&&tickets.get(i).getTipoDeTrabajo().equals(empleado.getTicketSimpElegido().getTipoDeTrabajo())) { //Si hay un ticket que me sirve
	// funcion para analizar si el ticket corresponde, esta funcion deberia estar en empleado, de donde son los threads
	
	}
																											
																										  

		this.usaLista = false;																				
		notifyAll();
//		this.usaLista = false; Opinion, DesertiManuel42782400 , hijo de Adrian: Esto va arriba porq en todos los ejs es asi :)
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
