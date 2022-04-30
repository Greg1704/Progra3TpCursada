package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public class EmpleadorJuridico extends Empleador{

	public EmpleadorJuridico(String usuario, String contrasenia, String nombre, TicketEmpleador ticketEmpleador,
			String rubro) {
		super(usuario, contrasenia, nombre, ticketEmpleador, rubro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getComision() {
		return 0.5;
	}
}
