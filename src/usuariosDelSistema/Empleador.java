package usuariosDelSistema;

public abstract class Empleador extends Usuario{
    protected String nombre;
    protected int puntos;

	public Empleador(String usuario, String contrasenia,String nombre) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.puntos=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
}
