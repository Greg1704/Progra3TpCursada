package usuariosDelSistema;

public class EmpleadorJuridico extends Empleador{

	public EmpleadorJuridico(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}

	@Override
	public double getComision() {
		return 0.5;
	}
}
