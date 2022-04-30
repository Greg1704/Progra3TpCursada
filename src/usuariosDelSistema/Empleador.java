package usuariosDelSistema;

import java.util.ArrayList;

import armaTickets.TicketEmpleador;

public abstract class Empleador extends Usuario implements EmpleadorComision {
	private String nombre;
	private TicketEmpleador ticketEmpleador;
	private ArrayList<Empleado> empleadosSeleccionados = new ArrayList<Empleado>();
	private int cantidadEmpleadosSeleccionados;
	private String rubro;

	public Empleador(String usuario, String contrasenia, String nombre,TicketEmpleador ticketEmpleador,String rubro) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.cantidadEmpleadosSeleccionados = 0;
		this.ticketEmpleador = ticketEmpleador;
		this.rubro = rubro;
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
	
	
	/**
	 * PostCond: Se crea un empleador de tipo jur�dico. 
	 */
	

	public void rondaElecciones() { // hacer excepcion (try catch), tirar excepci�n en el get()
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i = 0;
		
		super.getLista().getOrdenados().get(0).setPuntaje(super.getLista().getOrdenados().get(0).getPuntaje() + 5);
		//Suma 5 puntos por estar primero en la lista
		
		while(i < super.getLista().getOrdenados().size() && i < cuposTotal) {
			this.empleadosSeleccionados.add((Empleado) super.getLista().getOrdenados().get(i).getUsuario());
			i++;
		}
		
		this.cantidadEmpleadosSeleccionados = i;

	}

	@Override
	public String toString() {
		return "Empleador [nombre=" + nombre + ", ticketEmpleador=" + ticketEmpleador + ", cantEmpleadosSeleccionados="
				+ cantidadEmpleadosSeleccionados+ "]";
	}

	

}
