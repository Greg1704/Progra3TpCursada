package usuariosDelSistema;

import armaTickets.TicketEmpleador;


public class EmpleadorJuridico extends Empleador{
	
	/**
	 * @author Grupo4 <br>
	 * PostCond: Se crea un empleador de tipo juridico. 
	 */
	
	
	public EmpleadorJuridico(String usuario, String contrasenia, String nombre,
			String rubro) {
		super(usuario, contrasenia, nombre,rubro);
	}

	@Override
	public double getComision() {
		return 0.5;
	}
}
