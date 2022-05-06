package usuariosDelSistema;

import armaTickets.TicketEmpleador;

public class EmpleadorFisico extends Empleador{
	
	/**
	 * @author Grupo4 <br>
	 * PostCond: Se crea un empleador de tipo físico. 
	 */
	

	public EmpleadorFisico(String usuario, String contrasenia, String nombre,
			String rubro) {
		super(usuario, contrasenia, nombre, rubro);
	}

	@Override
	public double getComision() {
		return 0.3;
	}
}
