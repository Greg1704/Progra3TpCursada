package usuariosDelSistema;

import java.util.ArrayList;

import controlador.Controlador;
import encuentro.RondaEncuentros;
import excepciones.ContraseniaIncorrectaException;
import excepciones.ListaVaciaException;
import excepciones.NingunActivoException;
import excepciones.NoActivoException;
import excepciones.UsuarioDuplicadoException;
import excepciones.UsuarioIncorrectoException;
import ticketSimplificado.TicketSimplificado;

/**
 * @author Grupo4 <br>
 *         Clase que representa el <b> Sistema </b> con sus metodos
 *         principales para el correcto desempenio del programa <br>
 *         Tiene aplicado metodo Singleton definido en getInstancia(): no
 *         puede haber mas de un <b> Sistema </b>.
 */

public class Sistema{
	private String nombre;
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private ArrayList<TicketSimplificado> bolsaDeTrabajo = new ArrayList<TicketSimplificado>();
	private RondaEncuentros encuentros;
	private boolean encuentroHecho;

	private Sistema(){	
	}


	public static Sistema getInstancia() {
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}

	/**
	 * el metodo <b> agregaEmpleado </b> agrega un empleado a la lista de
	 * empleados del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleado que seria agregado a la lista de empleados del sistema
	 *           <br>
	 *           PreCond: Empleado debe ser distinto de null <br>
	 *           PostCond: Se agrega empleado a la lista
	 * @throws UsuarioDuplicadoException 
	 *
	 */

	public void agregaEmpleado(Empleado e) throws UsuarioDuplicadoException {
		int j,i=0;
		
		j = this.empleadosPretensos.size();
		
		while(i < j && !(this.empleadosPretensos.get(i).getUsuario().equalsIgnoreCase(e.getUsuario()))) {
			i++;
		}
		
		if (i < j) {
			throw new UsuarioDuplicadoException("Error: el empleado ya existe en el sistema");
		}else {
			this.empleadosPretensos.add(e);
		}
	}

	/**
	 * el metodo <b> sacaEmpleado </b> saca un empleado a la lista de empleados
	 * del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleado que sera removido de la lista de empleados del sistema
	 *           <br>
	 *           PostCond: Se remueve empleado de la lista si el dato es v�lido
	 *
	 */

	public void sacaEmpleado(Empleado e) { // excepcion si el empleado es invalido , ya que remove() devuelve false si
											// no se elimina nada
		this.empleadosPretensos.remove(e);
	}

	/**
	 * el metodo <b> agregaEmpleador </b> agrega un empleador a la lista de
	 * empleadores del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleador que sera agregado a la lista de empleadores del sistema
	 *           <br>
	 *           PreCond: Empleador debe ser distinto de null <br>
	 *           PostCond: Se agrega
	 *           empleador a la lista
	 *
	 */

	public void agregaEmpleador(Empleador e) throws UsuarioDuplicadoException{
		int j,i=0;
		
		j = this.empleadores.size();
		
		while(i < j && !(this.empleadores.get(i).getUsuario().equalsIgnoreCase(e.getUsuario()))) {
			i++;
		}
		
		if (i < j) {
			throw new UsuarioDuplicadoException("Error: el empleador ya existe en el sistema");
		}else {
			this.empleadores.add(e);
		}
		
	}

	/**
	 * El metodo <b> sacaEmpleador </b> saca un empleado a la lista de empleados
	 * del <b> Sistema </b> <br>
	 * 
	 * @param e: Empleador que sera removido de la lista de empleadores del
	 *           sistema <br>
	 *           PostCond: Se remueve empleador de la lista si el dato es valido
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
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public RondaEncuentros getEncuentros() {
		return encuentros;
	}


	public void setEncuentros(RondaEncuentros encuentros) {
		this.encuentros = encuentros;
	}


	public void setEmpleadosPretensos(ArrayList<Empleado> empleadosPretensos) {
		this.empleadosPretensos = empleadosPretensos;
	}


	public void setEmpleadores(ArrayList<Empleador> empleadores) {
		this.empleadores = empleadores;
	}

	
	
	
	/**
	 * El metodo <b> comisionEmpleadoPretenso </b> calcula la comision del
	 * empleado dependiendo del cargo que este posee <br>
	 * 
	 * @param empleado: Empleado al que le sera calculada la comision <br>
	 *                  PreCond: Empleado debe ser distinto de null y valido <br>
	 *                  PostCond: Se retornara la comision como un "double"
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


	public void empleadoresNoSeleccionados(ArrayList<Empleador> empleadoresElegidos) {

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null){
				
				try {
				empleador.getTicketEmpleador().esActivo();
				
				if (!empleadoresElegidos.contains(empleador))
					empleador.setPuntaje(empleador.getPuntaje() - 20);
				// Resta 20 porque el empleador no es elegido por nadie
				
				}catch (NoActivoException e) {}
				
			}
		}
	}

	public void rondaDeContrataciones() {
		ArrayList<Empleado> aux;
		RubroFactory rubroFactory;
		RubroDecorator rubroEmpleador;
		double comision;

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador() != null) {
				
				try {
				empleador.getTicketEmpleador().esActivo();
				aux = empleador.getEmpleadosSeleccionados();
				for (int i = 0; i < empleador.getCantidadEmpleadosSeleccionados(); i++) {
					if (aux.get(i).getEmpleadorSeleccionado().getNombre().equalsIgnoreCase(empleador.getNombre())) {
						empleador.getTicketEmpleador()
								.setCantEmpleados(empleador.getTicketEmpleador().getCantEmpleados() - 1);
						aux.get(i).getTicket().setResultado(true);
						aux.get(i).getTicket().finaliza();
						aux.get(i).setPuntaje(aux.get(i).getPuntaje() + 10);
						comision = this.comisionEmpleadoPretenso(aux.get(i));
						//System.out.println("El empleado " + aux.get(i).getNya() + " fue contratado por la empresa " + empleador.getNombre());
						//System.out.println("Comision para el empleado " + aux.get(i).getNya() + ": " + comision);
						mandarTextoContrataciones("El empleado " + aux.get(i).getNya() + " fue contratado por la empresa " + empleador.getNombre() + "\n");
						mandarTextoComisiones("Comision para el empleado " + aux.get(i).getNya() + ": " + comision + "\n");
					}

				}

				if (empleador.getTicketEmpleador().getCantEmpleados() == 0) {
					empleador.getTicketEmpleador().finaliza();
					empleador.setPuntaje(empleador.getPuntaje() + 50); // suma 50 por estado finalizado
					rubroFactory = new RubroFactory();
					rubroEmpleador = rubroFactory.getRubro(empleador.getRubro(), empleador);
					comision = empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion().getMonto()
							* rubroEmpleador.getComision();
					//System.out.println("Comision para el empleador " + empleador.getNombre() + ": " + comision);
					mandarTextoComisiones("Comision para el empleador " + empleador.getNombre() + ": " + comision + "\n");
				}
					
				
				}catch(NoActivoException e) {
					devolverError("Hubo problemas en la ronda de contratacion");
				}
					
			}

		}
		this.encuentroHecho=false;
		vaciarListasAsignaciones();
	}
	
	public void vaciarListasAsignaciones() {
		for(Empleado empleado : this.empleadosPretensos) {
			empleado.getLista().getOrdenados().clear();
		}
		for(Empleador empleador : this.empleadores) {
			empleador.getLista().getOrdenados().clear();
		}
	}


	public void busquedaLaboral() throws NingunActivoException,ListaVaciaException {
			verificaActivos();
			this.llamaRondaEncuentros();
			this.encuentroHecho=true;
		 
	}

	/**
	 * Metodo que verifica si existe al menos un ticket que este en estado activo en cada una de las listas <br>
	 * @throws NingunActivoException : se lanza esta excepcion en caso que no haya usuarios activos en alguna de las listas  <br>
	 */
	private void verificaActivos() throws NingunActivoException {
		boolean empleadoActivo = false;
		boolean empleadorActivo = false;

		for (Empleador empleador : empleadores) {		
			try {
				if (empleador.getTicketEmpleador() != null) {
					empleador.getTicketEmpleador().esActivo();
					empleadorActivo = true;
				}
			}catch(NoActivoException e) {}			
		}

		for (Empleado empleado : empleadosPretensos) {
			
			try {
				if (empleado.getTicket() != null) {
					empleado.getTicket().esActivo();
					empleadoActivo = true;
				}
			}catch(NoActivoException e) {}			
			
		}

		if (!empleadoActivo)
			throw new NingunActivoException("No hay empleados con tickets activos");

		if (!empleadorActivo)
			throw new NingunActivoException("No hay empleadores con tickets activos");
	}

	
	
	public Empleado LoginEmpleado(String usuario, String contrasenia) throws UsuarioIncorrectoException,ContraseniaIncorrectaException {
		
		return buscaEmpleado(usuario,contrasenia);
		
	}
	
	public Empleado buscaEmpleado(String usuario, String contrasenia)throws UsuarioIncorrectoException,ContraseniaIncorrectaException {
		int i = 0;
		
		while (i < empleadosPretensos.size()) {
			if (Sistema.getInstancia().getEmpleadosPretensos().get(i).usuario.compareTo(usuario) == 0) {
				if(Sistema.getInstancia().getEmpleadosPretensos().get(i).contrasenia.compareTo(contrasenia) == 0)
					return Sistema.getInstancia().getEmpleadosPretensos().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;		
		}
		throw new UsuarioIncorrectoException();
		
	}
	
	public Empleador LoginEmpleador(String usuario, String contrasenia) throws UsuarioIncorrectoException,ContraseniaIncorrectaException{

		return buscaEmpleador(usuario,contrasenia);

}

	public Empleador buscaEmpleador(String usuario, String contrasenia)throws UsuarioIncorrectoException,ContraseniaIncorrectaException {
		int i = 0;
	
		while (i < empleadores.size()) {
			if (Sistema.getInstancia().getEmpleadores().get(i).usuario.compareTo(usuario) == 0) {
				if(Sistema.getInstancia().getEmpleadores().get(i).contrasenia.compareTo(contrasenia) == 0)
					return Sistema.getInstancia().getEmpleadores().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;		
		}
		throw new UsuarioIncorrectoException();
	
	}


	public boolean isEncuentroHecho() {
		return encuentroHecho;
	}


	public void setEncuentroHecho(boolean encuentroHecho) {
		this.encuentroHecho = encuentroHecho;
	}
	
	
	public void mandarTextoContrataciones(String mensaje) {
		Controlador.getInstancia().agregarTextoContrataciones(mensaje);
	}
	
	public void mandarTextoComisiones(String mensaje) {
		Controlador.getInstancia().agregarTextoComisiones(mensaje);
	}
	
	public void devolverError(String mensaje) {
		Controlador.getInstancia().mensajeErrores(mensaje);
	}
	
}



