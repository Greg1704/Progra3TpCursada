package excepciones;

public class UsuarioIncorrectoException extends LoginIncorrectoException
{

public UsuarioIncorrectoException(){ //vemos que le pasamos como parametro a la exception;
    super("Usuario no encontrado");
}


}