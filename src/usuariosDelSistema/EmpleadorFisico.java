package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public class EmpleadorFisico extends Empleador{

	public EmpleadorFisico(String usuario, String contrasenia, String nombre, TicketEmpleador ticketEmpleador,
			String rubro) {
		super(usuario, contrasenia, nombre, ticketEmpleador, rubro);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getComision() {
		return 0.3;
	}
}
