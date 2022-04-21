package usuariosDelSistema;

public abstract class Usuario {
    protected String usuario;
    protected String contrasenia;
    protected int puntaje;

    public Usuario(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.puntaje = 0;
    }

    public void Login(String usuario, String contrasenia){
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
