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
		int j;
		
		j = this.tickets.size();
		if(j == 0) {
			this.tickets.add(0,t);
		}else {
			this.tickets.add(j-1,t);
		}
		
		
	}
	
	
	public TicketSimplificado tomaTicket(int i) {
		TicketSimplificado tomado;
		tomado = this.tickets.get(i);
		this.tickets.remove(i);
		return tomado;	
	}

	public void setUsaLista(boolean usaLista) {
		this.usaLista = usaLista;
	}

	
	public synchronized TicketSimplificado sacarTicket(Empleado empleado) {
		
        while (this.usaLista == true) {
            try {
                wait();
            }catch(InterruptedException e) {}
        }
        
        this.usaLista = true;
        //System.out.println(this.tickets.size()); ESTO ES PARA VER CUANTOS TICKETS HABIA EN LA BOLSA
        
        if (this.tickets.size() != 0) {
	        
        	i = 0;		
        	while (i < tickets.size() &&  this.tickets.get(i).getTipoDeTrabajo().equalsIgnoreCase(empleado.getTipoTrabajoSimp())){
        		i++;
        	} 
        
        	if (i < tickets.size()) {
        		this.usaLista = false;
        		notifyAll();		
        		return this.tomaTicket(i);
        	}
        	else {
        		this.usaLista = false;
        		notifyAll();
        		return null;
        	}
        }
        else {
        	this.usaLista = false;
    		notifyAll();
    		return null;
        }

    }	
	
	
	public synchronized void devolverTicket(Empleado empleado,TicketSimplificado t) {
		while (this.usaLista == true) {
			try {	
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
