package excepcionesEmpleado;

public class ErrorUsuario extends ErrorLogin
{

public ErrorUsuario(String Msj){ //vemos que le pasamos como parametro a la exception;
    super(Msj); //string o algo para informar que paso
}


}