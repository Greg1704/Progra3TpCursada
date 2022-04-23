package usuariosDelSistema;

public class ComercioExterior extends Comercio {

	public ComercioExterior(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}

	@Override
	public double comisionAgencia(Empleador empleador) {
		if(empleador.getClass().getName().equals("EmpleadorFisico"))
			return 0.7;
		else
		if(empleador.getClass().getName().equals("EmpleadorJuridico"))
			return 0.9;
		else
			return 999999999; //Hay que tirar una excepcion
	}
}
