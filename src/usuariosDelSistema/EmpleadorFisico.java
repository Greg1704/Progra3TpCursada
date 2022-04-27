package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public class EmpleadorFisico extends Empleador{

	public EmpleadorFisico(String usuario, String contrasenia, String nombre,TicketEmpleador ticketEmpleador) {
		super(usuario, contrasenia, nombre,ticketEmpleador);
	}


	@Override
	public double getComision() {
		return 0.3;
	}
}
