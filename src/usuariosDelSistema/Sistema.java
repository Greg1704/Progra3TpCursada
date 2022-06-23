package usuariosDelSistema;

import java.io.Serializable;
import java.util.ArrayList;
import encuentro.RondaEncuentros;
import excepciones.ListaVaciaException;
import excepciones.NingunActivoException;
import ticketSimplificado.TicketSimplificado;

/**
 * @author Grupo4 <br>
 *         Clase que representa el <b> Sistema </b> con sus m�todos
 *         principales para el correcto desempe�o del programa <br>
 *         Tiene aplicado m�todo Singleton definido en getInstancia(): no
 *         puede haber m�s de un <b> Sistema </b>.
 */

public class Sistema implements Serializable{
	private String nombre;
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
	private RondaEncuentros encuentros;

	private Sistema(){
		this.nombre="La Agencia de Pedrito";
	}


	public static Sistema getInstancia() {
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}
	
	protected Sistema readResolve(){ //NO SE SI ESTA BIEN
        return this;
    }

	/**
	 * el m�todo <b> agregaEmpleado </b> agrega un empleado a la lista de
	 * empleados del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleado que ser� agregado a la lista de empleados del sistema
	 *           <br>
	 *           PreCond: Empleado debe ser distinto de null <br>
	 *           PostCond: Se agrega empleado a la lista
	 *
	 */

	public void agregaEmpleado(Empleado e) {
		this.empleadosPretensos.add(e);
	}

	/**
	 * el m�todo <b> sacaEmpleado </b> saca un empleado a la lista de empleados
	 * del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleado que ser� removido de la lista de empleados del sistema
	 *           <br>
	 *           PostCond: Se remueve empleado de la lista si el dato es v�lido
	 *
	 */

	public void sacaEmpleado(Empleado e) { // excepcion si el empleado es inv�lido , ya que remove() devuelve false si
											// no se elimina nada
		this.empleadosPretensos.remove(e);
	}

	public void agregaTicketSimplificado(TicketSimplificado t){
		this.bolsaDeTrabajo.add(t);
	}

	public void sacaTicketSimplificado(TicketSimplificado t){
		this.bolsaDeTrabajo.remove(t);
	}

	public ArrayList<TicketSimplificado> getBolsaDeTrabajo() {
		return bolsaDeTrabajo;
	}

	public void setBolsaDeTrabajo(ArrayList<TicketSimplificado> bolsaDeTrabajo) {
		this.bolsaDeTrabajo = bolsaDeTrabajo;
	}

	/**
	 * el m�todo <b> agregaEmpleador </b> agrega un empleador a la lista de
	 * empleadores del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleador que ser� agregado a la lista de empleadores del sistema
	 *           <br>
	 *           PreCond: Empleador debe ser distinto de null <br>
	 *           PostCond: Se agrega
	 *           empleador a la lista
	 *
	 */

	public void agregaEmpleador(Empleador e) {
		this.empleadores.add(e);
	}

	/**
	 * el m�todo <b> sacaEmpleador </b> saca un empleado a la lista de empleados
	 * del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleador que ser� removido de la lista de empleadores del
	 *           sistema <br>
	 *           PostCond: Se remueve empleador de la lista si el dato es v�lido
	 *
	 */

	public void sacaEmpleador(Empleador e) { 
		this.empleadores.remove(e);
	}

	public ArrayList<Empleado> getEmpleadosPretensos() {
		return this.empleadosPretensos;
	}

	public ArrayList<Empleador> getEmpleadores() {
		return this.empleadores;
	}

	/**
	 * el m�todo <b> comisionEmpleadoPretenso </b> calcula la comisi�n del
	 * empleado dependiendo del cargo que �ste posee <br>
	 * 
	 * @param empleado: Empleado al que le ser� calculada la comisi�n <br>
	 *                  PreCond: Empleado debe ser distinto de null y v�lido <br>
	 *                  PostCond: Se retornar� la comisi�n como un "double"
	 *
	 */

	public double comisionEmpleadoPretenso(Empleado empleado) { // determino el porcentaje que le cobro de comision y
																// calculo el monto a cobrar
		String tpl = empleado.getEmpleadorSeleccionado().getTicketEmpleador().getFormularioDeBusqueda()
				.getPuestoLaboral().getTipoPuestoLaboral();
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

	public void llamaRondaEncuentros() throws ListaVaciaException {
		encuentros = new RondaEncuentros();

		if (this.empleadores.size() == 0)
			throw new ListaVaciaException("No se encuentran empleadores en el sistema por el momento");
		else
			encuentros.enfrentamientoEmpleadores();

		if (this.empleadosPretensos.size() == 0)
			throw new ListaVaciaException("No se encuentran empleados pretensos en el sistema por el momento");
		else
			encuentros.enfrentamientoEmpleados();
	}

	/*public void rondaDeElecciones() {
		ArrayList<Empleador> empleadoresElegidos = new ArrayList<Empleador>();

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null
					&& empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleador.rondaElecciones();
		}

		for (Empleado empleado : empleadosPretensos) {
			if (empleado.getTicket() != null && empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo")) {
				empleado.rondaElecciones();
				empleadoresElegidos.add(empleado.getEmpleadorSeleccionado());
			}
		}
		this.empleadoresNoSeleccionados(empleadoresElegidos);
	} */

	/**
	 * PostCond: el empleador que no haya sido elegido por nadie pierde 20 puntos.
	 */

	public void empleadoresNoSeleccionados(ArrayList<Empleador> empleadoresElegidos) {

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null
					&& empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				if (!empleadoresElegidos.contains(empleador))
					empleador.setPuntaje(empleador.getPuntaje() - 20);
				// Resta 20 porque el empleador no es elegido por nadie
			}
		}
	}

	public void rondaDeContrataciones() {
		ArrayList<Empleado> aux;
		RubroFactory rubroFactory;
		RubroDecorator rubroEmpleador;
		double comision;

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null
					&& empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				aux = empleador.getEmpleadosSeleccionados();

				for (int i = 0; i < empleador.getCantidadEmpleadosSeleccionados(); i++) {

					if (aux.get(i).getEmpleadorSeleccionado().getNombre().equalsIgnoreCase(empleador.getNombre())) {
						empleador.getTicketEmpleador()
								.setCantEmpleados(empleador.getTicketEmpleador().getCantEmpleados() - 1);
						aux.get(i).getTicket().setResultado(true);
						aux.get(i).getTicket().finaliza();
						aux.get(i).setPuntaje(aux.get(i).getPuntaje() + 10);
						comision = this.comisionEmpleadoPretenso(aux.get(i));
						System.out.println("El empleado " + aux.get(i).getNya() + " fue contratado por la empresa " + empleador.getNombre());
						System.out.println("Comision para el empleado " + aux.get(i).getNya() + ": " + comision);
					}

				}

				if (empleador.getTicketEmpleador().getCantEmpleados() == 0) {
					empleador.getTicketEmpleador().finaliza();
					empleador.setPuntaje(empleador.getPuntaje() + 50); // suma 50 por estado finalizado
					rubroFactory = new RubroFactory();
					rubroEmpleador = rubroFactory.getRubro(empleador.getRubro(), empleador);
					comision = empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion().getMonto()
							* rubroEmpleador.getComision();
					System.out.println("Comision para el empleador " + empleador.getNombre() + ": " + comision);
				}

			}

		}

	}

	/**
	 * En este m�todo se aplica el patr�n Template para invocar los m�todos
	 * que corresponden a las interacciones entre empleados y empleadores, <br>
	 * desde la ronda de encuentros hasta la ronda de contrataciones.
	 * 
	 */

	public void busquedaLaboral() {
		try {
			verificaActivos();
			this.llamaRondaEncuentros();
			//this.rondaDeElecciones();
			//this.rondaDeContrataciones();
		} catch (NingunActivoException e) {
			System.out.println(e.getMessage());
		} catch (ListaVaciaException e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * Metodo que verifica si existe al menos un ticket que este en estado activo en cada una de las listas <br>
	 * @throws NingunActivoException : se lanza esta excepcion en caso que no haya usuarios activos en alguna de las listas  <br>
	 */
	private void verificaActivos() throws NingunActivoException {
		boolean empleadoActivo = false;
		boolean empleadorActivo = false;

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null
					&& empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleadorActivo = true;
		}

		for (Empleado empleado : empleadosPretensos) {
			if (empleado.getTicket() != null && empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleadoActivo = true;
		}

		if (!empleadoActivo)
			throw new NingunActivoException("No hay empleados con tickets activos");

		if (!empleadorActivo)
			throw new NingunActivoException("No hay empleadores con tickets activos");
	}


}


