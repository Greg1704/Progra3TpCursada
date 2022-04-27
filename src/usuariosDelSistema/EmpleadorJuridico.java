package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public class EmpleadorJuridico extends Empleador{

	public EmpleadorJuridico(String usuario, String contrasenia, String nombre,TicketEmpleador ticketEmpleador) {
		super(usuario, contrasenia, nombre,ticketEmpleador);
	}

	@Override
	public double getComision() {
		return 0.5;
	}
}
