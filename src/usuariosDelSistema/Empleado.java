package usuariosDelSistema;
import armaTickets.TicketEmpleado;

import java.util.ArrayList;

public class Empleado extends Usuario{
	private String nya; //Nombre y Apellido
	private int dni;
	private int telefono;
	private int edad;
	private String ciudad;
	TicketEmpleado ticket;


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
}
