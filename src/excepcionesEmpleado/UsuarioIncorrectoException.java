package excepcionesEmpleado;

public class UsuarioIncorrectoException extends LoginIncorrectoException
{

public UsuarioIncorrectoException(){ //vemos que le pasamos como parametro a la exception;
    super("Usuario no encontrado"); //string o algo para informar que paso
}


}