package usuariosDelSistema;

public class EmpleadorJuridico extends EmpleadorDecorator{


	public EmpleadorJuridico(String usuario, String contrasenia, String nombre, Empleador empleador) {
		super(usuario, contrasenia, nombre, empleador);
	}

	@Override
	public double comisionAgencia(Empleador empleador) {
		return empleador.comisionAgencia(this); //Faltaria multiplicarlo por sueldo ofrecido
	}
}
