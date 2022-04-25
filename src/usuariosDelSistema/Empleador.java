package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public abstract class Empleador extends Usuario implements EmpleadorComision{
    protected String nombre;
	TicketEmpleador ticketEmpleador;

	public Empleador(String usuario, String contrasenia,String nombre) {
		super(usuario, contrasenia);
		this.nombre = nombre;
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
    
	 

}
