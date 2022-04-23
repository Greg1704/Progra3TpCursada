package usuariosDelSistema;

public class ComercioInterior extends Comercio {

	public ComercioInterior(String usuario, String contrasenia, String nombre) {
		super(usuario, contrasenia, nombre);
	}

	@Override
	public double comisionAgencia(Empleador empleador) {
		if(empleador.getClass().getName().equals("EmpleadorFisico"))
			return 0.8;
		else
		if(empleador.getClass().getName().equals("EmpleadorJuridico"))
			return 1;
		else
			return 999999999; //Hay que tirar una excepcion
	}
}
