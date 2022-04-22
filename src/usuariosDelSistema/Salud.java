package usuariosDelSistema;

public class Salud extends EmpleadorDecorator{

	public Salud(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}

}
