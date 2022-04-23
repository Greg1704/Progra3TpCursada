package usuariosDelSistema;

public class EmpleadorFisico extends EmpleadorDecorator{


	public EmpleadorFisico(String usuario, String contrasenia, String nombre, Empleador empleador) {
		super(usuario, contrasenia, nombre, empleador);
	}

	public double comisionAgencia(Empleador empleador) {
		return empleador.comisionAgencia(this); //Faltaria multiplicarlo por sueldo ofrecido
	}
}
