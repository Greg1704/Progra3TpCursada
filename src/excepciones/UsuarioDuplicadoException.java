package excepciones;

public class UsuarioDuplicadoException extends Exception {
	public UsuarioDuplicadoException(String mensaje) {
		super(mensaje);
	}
}
