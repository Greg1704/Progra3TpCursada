package usuariosDelSistema;

import encuentro.ListaAsignaciones;
import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioIncorrectoException;

public abstract class Usuario {
	protected String usuario;
	protected String contrasenia;
	protected int puntaje = 0;
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

	public abstract void Login(String usuario, String contrasenia);

}
