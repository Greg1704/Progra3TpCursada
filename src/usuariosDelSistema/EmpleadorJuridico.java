package usuariosDelSistema;

import armaTickets.TicketEmpleador;


public class EmpleadorJuridico extends Empleador{
	
	/**
	 * @author Grupo4 <br>
	 * PostCond: Se crea un empleador de tipo jurídico. 
	 */
	
	
	public EmpleadorJuridico(String usuario, String contrasenia, String nombre, TicketEmpleador ticketEmpleador,
			String rubro) {
		super(usuario, contrasenia, nombre, ticketEmpleador, rubro);
	}

	@Override
	public double getComision() {
		return 0.5;
	}
}
