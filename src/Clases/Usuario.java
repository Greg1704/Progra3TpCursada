package Clases;

public abstract class Usuario {
    protected String usuario;
    protected String contrasenia;

    public void Login(String usuario,String contrasenia){
        LoginUsuario(usuario);
    }

    private void LoginUsuario(String usuario){
        if(this.usuario.equals(usuario)){
            System.out.println("Aun no esta hecho esto");//ERROR INEXISTENCIA DE USUARIO
        }
    }

    private void LoginContrasenia(String contrasenia){
        if(this.contrasenia.equals(contrasenia)){
            System.out.println("Aun no esta hecho esto");//ERROR CONTRASENIA INCORRECTA
        }
    }
}
