package usuariosDelSistema;

public abstract class Empleador extends Usuario implements EmpleadorComision{
    protected String nombre;

	public Empleador(String usuario, String contrasenia,String nombre) {
		super(usuario, contrasenia);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
