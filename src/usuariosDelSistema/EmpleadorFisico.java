package usuariosDelSistema;

public class EmpleadorFisico extends Empleador{

	public EmpleadorFisico(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}


	@Override
	public double getComision() {
		return 0.3;
	}
}
