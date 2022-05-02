package usuariosDelSistema;

import encuentro.ListaAsignaciones;

public abstract class Usuario {
	private String usuario;
	private String contrasenia;
	private int puntaje = 0;
	protected ListaAsignaciones lista;

	public Usuario(String usuario, String contrasenia) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		if (puntaje > 0)
			this.puntaje = puntaje;
		else
			this.puntaje = 0;
	}

	public ListaAsignaciones getLista() {
		return lista;
	}

	public void setLista(ListaAsignaciones lista) {
		this.lista = lista;
	}

	public abstract void rondaElecciones();

	public abstract void muestraUsuarios();

	@Override
	public String toString() {
		return usuario;
	}

	public abstract void ActivaTicket();

	public abstract void SuspendeTicket();

	public abstract void CancelaTicket();

	/*
	 * public void Login(String usuario, String contrasenia) throws
	 * ErrorContrasenia, ErrorUsuario { Usuario user; int i; ArrayList<Usuario>
	 * users = this.Sis.getInstancia().getUsuarios();// A chequear esta linea xd// i
	 * = users.indexOf(this.usuario.equals(usuario)); if (i > 0) { // si existe el
	 * usuario...compruebo la contraseña// user = users.get(i); if
	 * (user.contrasenia.equals(contrasenia)) System.out.println("login realizado");
	 * // Hay que ver que hacemos aca// else throw new ErrorContrasenia(); } else
	 * throw new ErrorUsuario(); }
	 */

}
