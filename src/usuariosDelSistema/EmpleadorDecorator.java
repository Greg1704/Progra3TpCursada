package usuariosDelSistema;

public abstract class EmpleadorDecorator extends Empleador{

	Empleador empleador;

	public EmpleadorDecorator(String usuario, String contrasenia, String nombre, Empleador empleador) {
		super(usuario, contrasenia, nombre);
		this.empleador = empleador;
	}

	public Empleador getEmpleador() {
		return empleador;
	}

	public void setEmpleador(Empleador empleador) {
		this.empleador = empleador;
	}
}
