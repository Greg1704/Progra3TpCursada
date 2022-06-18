package usuariosDelSistema;

import ticketSimplificado.TicketSimplificado;

import java.util.ArrayList;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class BolsaDeTrabajo extends Observable{
	
	private boolean descartado=false, eleccionEnCurso=true, threadEnSistema=true; //Lo cambie a true porque sino nunca entra al while(Grego)
    private TicketSimplificado t;
	private static BolsaDeTrabajo instancia = null;

    private BolsaDeTrabajo() {
    	
    }
    
    public static BolsaDeTrabajo getInstancia() {
		if (instancia == null)
			instancia = new BolsaDeTrabajo();
		return instancia;
	}


	/*COSAS QUE FALTAN: -APLICARLO A VENTANA
						-HACER CASO EN EL QUE YA NO HAYA TICKETS PARA VER
						-VER SI EL WHILE DE eleccionEnCurso sirve(Ya que en realidad el thread iria al update del Empleado)
	* */
    public synchronized void eleccionTicketSimplificado(TicketSimplificado t){
    	while (threadEnSistema) { //SE DEBERIA VOLVER FALSE Y DESPERTAR A LOS THREADS CUANDO UN EMPLEADO LLAMA A LA BOLSA
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
    	notifyObservers(this.t); // se avisa a empleado / ventana q entr� un thread a sistema para mostrar
		this.eleccionEnCurso=true;
    	while (this.eleccionEnCurso) { // se muestra en ventana. el controlador modificar� eleccionEnCurso
    		this.t.getLocacion(); //Porque esta esto aca mate? No me acuerdo yo(Grego)
    	} //DUDA DE SI REALMENTE SIRVE EN EL TEMA DE LOS THREADS O NO
		if(this.descartado) //SE DETERMINA EN EL UPDATE DE EMPLEADO
    		while (this.descartado) { // que espere eternamente hasta que cambie el empleado. el empleado rechaz� este ticket
    			try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			} 
    	}else{
			notifyAll();
			this.descartado=false; //Para que todos los threads descartados se liberen y vuelvan al primer while
		}
    /*	setChanged();
    	notifyObservers();
    	//Lo comente porque no tendria sentido que llame al update del empleado en este punto
     */
    }
    
    public void setEleccionEnCurso(boolean e) { //Perdon mate por gritarte que los hagas privado :D
    	this.eleccionEnCurso = e;
    }
    
    public void setDescartado(boolean d) { //Perdon mate por gritarte que los hagas privado :D
    	this.descartado = d;
    }



}