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
        
        if(this.tickets.size() != 0) {

        	i=0;

        	while((i<tickets.size()) && !(tickets.get(i).getTipoDeTrabajo().equalsIgnoreCase((empleado.getTipoTrabajoSimp())))) {//creo que este getTicketSimp esta mal
        		i++;                                                                                                                    //deberiamos hacer un get del ticket que quiere tambien
        	}

        	if(i<tickets.size() && tickets.get(i).getTipoDeTrabajo().equalsIgnoreCase((empleado.getTipoTrabajoSimp()))) { //Si hay un ticket que me sirve
        		this.usaLista = false;
        		notifyAll();
        		empleado.eleccionTicketSimp(this.tomaTicket(i));
        	}
        	
		}
        
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
	
	
}
