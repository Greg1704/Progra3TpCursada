package usuariosDelSistema;

public abstract class Comercio extends EmpleadorDecorator{

	public Comercio(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}
	
}
