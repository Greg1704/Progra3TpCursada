package usuariosDelSistema;

import armaTickets.TicketEmpleado;
import java.util.ArrayList.*;

public class Empleado extends Usuario{
	private String nya; //Nombre y Apellido
	private int dni;
	private int telefono;
	private int edad;
	private String ciudad;
	private TicketEmpleado ticket;
	private Empleador empleadorSeleccionado;


	public Empleado(String usuario, String contrasenia, String nya, int dni, int telefono, int edad, String ciudad) {
		super(usuario, contrasenia);
		this.nya = nya;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public void setTicket(TicketEmpleado ticket) {
		this.ticket = ticket;
	}
	
	public TicketEmpleado getTicket() {
		return ticket;
	}

	public String getNya() {
		return nya;
	}

	public void setNya(String nya) {
		this.nya = nya;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Empleador getEmpleadorSeleccionado() {
		return empleadorSeleccionado;
	}

	public void setEmpleadorSeleccionado(Empleador empleadorSeleccionado) {
		this.empleadorSeleccionado = empleadorSeleccionado;
	}
	
	public void rondaElecciones(){ //OTRA EXCEPCION EN CASO QUE ORDENADOS SEA NULL
		
		this.empleadorSeleccionado = (Empleador) super.getLista().getOrdenados().get(0).getUsuario();
		
	}


}
