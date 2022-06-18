package usuariosDelSistema;

import ticketSimplificado.TicketSimplificado;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class BolsaDeTrabajo extends Observable{
	
	boolean descartado=false, eleccionEnCurso=true, threadEnSistema=false;
    TicketSimplificado t;
	private static BolsaDeTrabajo instancia = null;

    private BolsaDeTrabajo() {
    	
    }
    
    public static BolsaDeTrabajo getInstancia() {
		if (instancia == null)
			instancia = new BolsaDeTrabajo();
		return instancia;
	}

    public synchronized void eleccionTicketSimplificado(TicketSimplificado t){
    	while (threadEnSistema) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	threadEnSistema = true;
    	this.t = t;
    	setChanged();
    	notifyObservers(); // se avisa a empleado / ventana q entró un thread a sistema para mostrar
    	while (eleccionEnCurso) { // se muestra en ventana. el controlador modificará eleccionEnCurso
    		this.t.getLocacion();
    	}
    	while (descartado) { // que espere eternamente hasta que cambie el empleado. el empleado rechazó este ticket
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
    	} // si descartado == false ; entonces, fue elegido.
    	notifyAll();
    	setChanged();
    	notifyObservers();
    }
    
    private void setEleccionEnCurso(boolean e) {
    	this.eleccionEnCurso = e;
    }
    
    private void setDescartado(boolean d) {
    	this.descartado = d;
    }

}