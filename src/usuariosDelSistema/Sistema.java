package usuariosDelSistema;

import java.util.ArrayList;
import encuentro.RondaEncuentros;


/**
 * @author Grupo4
 *<br>
 *Clase que representa el <b> Sistema </b> con sus métodos principales para el correcto desempeño del programa
 *<br>
 *Tiene aplicado método Singleton definido en getInstancia(): no puede haber más de un <b> Sistema </b>.
 */


public class Sistema {
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private RondaEncuentros encuentros;

	public static Sistema getInstancia() {
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}
	
	
	/**
	 * el método <b> agregaEmpleado </b> agrega un empleado a la lista de empleados del <b> Sistema </b> <br>
	 * @param e: Empleado que será agregado a la lista de empleados del sistema <br>
	 * PreCond: Empleado debe ser distinto de null <br>
	 * PostCond: Se agrega empleado a la lista
	 *
	 */
	
	
	
	public void agregaEmpleado(Empleado e) {
		this.empleadosPretensos.add(e);
	}
	
	/**
	 * el método <b> sacaEmpleado </b> saca un empleado a la lista de empleados del <b> Sistema </b> <br>
	 * @param e: Empleado que será removido de la lista de empleados del sistema <br>
	 * PostCond: Se remueve empleado de la lista si el dato es válido
	 *
	 */
	
	public void sacaEmpleado(Empleado e) { // excepcion si el empleado es inválido , ya que remove() devuelve false si no se elimina nada
		this.empleadosPretensos.remove(e);
	}
	
	
	/**
	 * el método <b> agregaEmpleador </b> agrega un empleador a la lista de empleadores del <b> Sistema </b> <br>
	 * @param e: Empleador que será agregado a la lista de empleadores del sistema <br>
	 * PreCond: Empleador debe ser distinto de null
	 * PostCond: Se agrega empleador a la lista
	 *
	 */
	
	
	public void agregaEmpleador(Empleador e) {
		this.empleadores.add(e);
	}
	
	/**
	 * el método <b> sacaEmpleador </b> saca un empleado a la lista de empleados del <b> Sistema </b> <br>
	 * @param e: Empleador que será removido de la lista de empleadores del sistema <br>
	 * PostCond: Se remueve empleador de la lista si el dato es válido
	 *
	 */
	
	
	public void sacaEmpleador(Empleado e) {
		this.empleadores.remove(e);
	}
	
	public ArrayList<Empleado> getEmpleadosPretensos(){
		return this.empleadosPretensos;
	}
	
	public ArrayList<Empleador> getEmpleadores(){
		return this.empleadores;
	}
	
	/**
	 * el método <b> comisionEmpleadoPretenso </b> calcula la comisión del empleado dependiendo del cargo que éste posee <br>
	 * @param empleado: Empleado al que le será calculada la comisión <br>
	 * PreCond: Empleado debe ser distinto de null y válido <br>
	 * PostCond: Se retornará la comisión como un "double" 
	 *
	 */

	public double comisionEmpleadoPretenso(Empleado empleado) { // determino el porcentaje que le cobro de comision y
																// calculo el monto a cobrar
		String tpl = empleado.getEmpleadorSeleccionado().getTicketEmpleador().getFormularioDeBusqueda()
				.getPuestoLaboral().getTipoPuestoLaboral();// cambien esto hdps
		double porc;

		if (tpl.equalsIgnoreCase("Junior"))
			porc = 0.8;
		else if (tpl.equalsIgnoreCase("Senior"))
			porc = 0.9;
		else
			porc = 1;
		porc -= 0.01 * empleado.getPuntaje();
		return empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getMonto() * porc;
	}

	
	public void llamaRondaEncuentros() {
		encuentros = new RondaEncuentros();
		encuentros.enfrentamientoEmpleados();
		encuentros.enfrentamientoEmpleadores();
	}
	
	public void rondaDeElecciones() {
		ArrayList<Empleador> empleadoresElegidos = new ArrayList<Empleador>();
		
		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleador.rondaElecciones();
		}
		
		for (Empleado empleado : empleadosPretensos) {
			if(empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo")) {
				empleado.rondaElecciones();
				empleadoresElegidos.add(empleado.getEmpleadorSeleccionado());
			}
		}
		this.empleadoresNoSeleccionados(empleadoresElegidos);
	}

	/**
	 * PostCond: el empleador que no haya sido elegido por nadie pierde 20 puntos.
	 */
	
	public void empleadoresNoSeleccionados(ArrayList<Empleador> empleadoresElegidos){ 

		for(Empleador empleador : empleadores){
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")){
				if(!empleadoresElegidos.contains(empleador))
					empleador.setPuntaje(empleador.getPuntaje() - 20);
				//Resta 20 porque el empleador no es elegido por nadie
			}
		}
	}

	public void rondaDeContrataciones() {
		ArrayList<Empleado> aux;
		RubroFactory rubroFactory;
		RubroDecorator rubroEmpleador;
		double comision; 

		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				aux = empleador.getEmpleadosSeleccionados();
				
				for (int i = 0; i < empleador.getCantidadEmpleadosSeleccionados(); i++) {
					
					if (aux.get(i).getEmpleadorSeleccionado().getNombre().equalsIgnoreCase(empleador.getNombre())) {
						empleador.getTicketEmpleador().setCantEmpleados(empleador.getTicketEmpleador().getCantEmpleados() - 1);
						aux.get(i).getTicket().finaliza();
						aux.get(i).setPuntaje(aux.get(i).getPuntaje() + 10);
						//Calcular comision blablabla
					}
					
				}
				
				if (empleador.getTicketEmpleador().getCantEmpleados() == 0) {
					empleador.getTicketEmpleador().finaliza();
					empleador.setPuntaje(empleador.getPuntaje() + 50);//suma 50 por estado finalizado
					rubroFactory=new RubroFactory();
					rubroEmpleador = rubroFactory.getRubro(empleador.getRubro(),empleador);
					comision=empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion().getMonto()*rubroEmpleador.getComision();
					System.out.println(empleador.toString() + "comision = " + comision);
				}
				
			}
				
		}
		
	}
	
	/**
	 * En este método se aplica el patrón Template para invocar los métodos que corresponden a las interacciones entre empleados y empleadores, <br>
	 * desde la ronda de encuentros hasta la ronda de contrataciones.
	 * 
	 */

	public void busquedaLaboral(){
		this.llamaRondaEncuentros();
		this.rondaDeElecciones();
		this.rondaDeContrataciones();
	}
	
	
	
}

/*
	FALTA HACER EL SISTEMA DEL COBRO
	UNA VEZ DESPUES DE COBRAR HAY QUE SACAR LOS TICKETS DE FINALIZADO
 */
