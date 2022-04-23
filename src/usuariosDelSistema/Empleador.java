package usuariosDelSistema;

public abstract class Empleador extends Usuario{
    protected String nombre;

	public Empleador(String usuario, String contrasenia,String nombre) {
		super(usuario, contrasenia);
		this.nombre = nombre;
	}
	
	public void mandaInfoTicket ()

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract double comisionAgencia(Empleador empleador);
}
