package excepcionesEmpleado;

public class ErrorUsuario extends ErrorLogin
{

public ErrorUsuario(){ //vemos que le pasamos como parametro a la exception;
    super("Usuario no encontrado"); //string o algo para informar que paso
}


}