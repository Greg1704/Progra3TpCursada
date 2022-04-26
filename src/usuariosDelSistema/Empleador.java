package usuariosDelSistema;

import java.util.ArrayList;

import armaTickets.TicketEmpleador;

public abstract class Empleador extends Usuario implements EmpleadorComision {
	protected String nombre;
	TicketEmpleador ticketEmpleador;
	ArrayList<Empleado> empleadosSeleccionados = new ArrayList<Empleado>();
	int cantidadEmpleadosSeleccionados;

	public Empleador(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.cantidadEmpleadosSeleccionados = 0;
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


	public void rondaElecciones() {//MISMA EXCEPCION QUE EN EMPLEADOS POR SI LA LISTA LLEGA NULL
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i = 0;
		
		//aca va la excepcion en caso de ser null la lista ordenados
		
		while(i < super.getLista().getOrdenados().size() && i < cuposTotal) {
			this.empleadosSeleccionados.add((Empleado) super.getLista().getOrdenados().get(i).getUsuario());
			i++;
		}
		

	}

}
