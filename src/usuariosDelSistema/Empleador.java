package usuariosDelSistema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


import armaTickets.TicketEmpleador;
import controlador.Controlador;
import excepciones.*;
import ticketSimplificado.TicketSimplificado;

public abstract class Empleador extends Usuario implements EmpleadorComision, Observer {
	private String nombre;
	private TicketEmpleador ticketEmpleador;
	private ArrayList<Empleado> empleadosSeleccionados = new ArrayList<Empleado>();
	private int cantidadEmpleadosSeleccionados;
	private String rubro;
	private transient ArrayList<TicketSimplificado> observables=null;
	private transient int cantObservados;
	private boolean yaEligioEmpleados;

	public Empleador(String usuario, String contrasenia, String nombre,String rubro) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.cantidadEmpleadosSeleccionados = 0;
		this.rubro = rubro;
		this.cantObservados=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TicketEmpleador getTicketEmpleador() {
		return ticketEmpleador;
	}

	public void setTicketEmpleador(TicketEmpleador ticketEmpleador) {
		this.ticketEmpleador = ticketEmpleador;
	}

	public void agregaEmpleado(Empleado e) {
		this.empleadosSeleccionados.add(e);
	}

	public void eliminaEmpleado(Empleado e) {
		this.empleadosSeleccionados.remove(e);
	}

	public int getCantidadEmpleadosSeleccionados() {
		return cantidadEmpleadosSeleccionados;
	}

	public void setCantidadEmpleadosSeleccionados(int cantidadEmpleadosSeleccionados) {
		this.cantidadEmpleadosSeleccionados = cantidadEmpleadosSeleccionados;
	}

	public ArrayList<Empleado> getEmpleadosSeleccionados() {
		return empleadosSeleccionados;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public boolean isYaEligioEmpleados() {
		return yaEligioEmpleados;
	}

	public void setYaEligioEmpleados(boolean yaEligioEmpleados) {
		this.yaEligioEmpleados = yaEligioEmpleados;
	}

	@Override
	public void ActivaTicket() {
		this.ticketEmpleador.activa();
	}

	@Override
	public void SuspendeTicket() {
		this.ticketEmpleador.suspende();
	}	
  
	@Override
	public void CancelaTicket() {
		this.ticketEmpleador.cancela();
		this.ticketEmpleador = null;
	}
	
	public void muestraUsuarios() {
		try {
			muestraEmpleados();
		}catch (ListaVaciaException e){
			devolverError(e.getMessage());
		}
		
	}
	
	private void muestraEmpleados() throws ListaVaciaException{
		if(this.lista == null)
			throw new ListaVaciaException("Lista vacia, no hay empleados seleccionados");
		else {
			for (int i = 0; i < this.lista.getOrdenados().size() ; i++)
				devolverError(this.lista.getOrdenados().get(i).getUsuario().getUsuario());
		}
		
	}
	
	
	/**
	 * Este metodo se utiliza para seleccionar los empleados que seran elegidos en la ronda de elecciones
	 * @param elegidos: Es una lista de empledos que se eligen en la ronda de elecciones <br>
	 */
	public void rondaElecciones(ArrayList<Empleado> elegidos) {
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i=0;
		super.getLista().getOrdenados().get(0).getUsuario().setPuntaje(super.getLista().getOrdenados().get(0).getUsuario().getPuntaje() + 5);
		//Suma 5 puntos por estar primero en la lista
		while(i<cuposTotal && i<elegidos.size()) {
			this.empleadosSeleccionados.add(elegidos.get(i));
			i++;
		}
		this.cantidadEmpleadosSeleccionados=i;
		this.setYaEligioEmpleados(true);
	}

	
	public void crearTicket(String locacion, int pesoLocacion, double remuneracion, int pesoRemuneracion, String cargaHoraria, int pesoCargaHoraria,
							String tipoPuestoLaboral, int pesoTipoPuestoLaboral, int edad, int pesoEdad, String experienciaPrevia, int pesoExperienciaPrevia,
							String estudiosCursados, int pesoEstudiosCursados, int cantEmpleados){
		try {
			ticketEmpleador=new TicketEmpleador(LocalDateTime.now(),locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
					tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
					estudiosCursados, pesoEstudiosCursados,cantEmpleados);
		} catch (FormularioInvalidoException e) {
			devolverError(e.getMessage() + " del Empleador " + this.nombre + "\n");
		}
	}

	/**
	 * Crea ticket simplificado y lo ingresa en Observados si no supera el maximo permitido, ingresandolo en la bolsa si esto sucede.<br>
	 * @param locacion: Es la locacion que ofrece el empleador.
	 * @param tipoTrabajo: El tipo de trabajo ofrecido por el empleador.
	 */
	public void crearTicketSimplificado(String locacion,String tipoTrabajo){
		try {
			if(this.observables==null) 
				this.observables=new ArrayList<TicketSimplificado>();
			TicketSimplificado ticketSimplificado= new TicketSimplificado(locacion,tipoTrabajo,this);
			ticketSimplificado.addObserver(this);
			if (this.cantObservados < 3) { 
				this.observables.add(ticketSimplificado);
				this.cantObservados++;
				BolsaTrabajo.getInstancia().agregaTicket(ticketSimplificado);// agrego ticket a la lista de bolsa de trabajo
			}else
				devolverError( "Ya hay 3 tickets simplificados creados, hasta que un empleado no se lleve alguno no puede crear nuevos\n");			
		} catch (AtributoInvalidoException e) {
			devolverError(e.getMessage()); 
		}

	}


	private void quitaObservable(TicketSimplificado ticketSimplificado){
		this.observables.remove(ticketSimplificado);
		this.cantObservados--;
	}

	@Override
	public void update(Observable o, Object arg) { // aca va a entrar si un empleado eligio un ticket simplificado
		TicketSimplificado ticket= (TicketSimplificado) o;
		Empleado empleado = (Empleado) arg;
		mensajeContratacionBolsa(empleado.getNya() + " fue contratado por " + this.getNombre() + "\n");
		this.quitaObservable((TicketSimplificado) o);
		
	}

	public ArrayList<TicketSimplificado> getObservables() {
		return observables;
	}
	
	public void mensajeContratacionBolsa(String mensaje) {
		Controlador.getInstancia().agregarTextoBolsaContratacion(mensaje);
	}
	
	public void devolverError(String mensaje) {
		Controlador.getInstancia().mensajeErrores(mensaje);
	}

	@Override
	public String toString() {
		return "Empleador: "+ "Usuario: " + this.getUsuario() +", nombre: " + nombre + ", rubro: " + rubro;
	}

}
