package usuariosDelSistema;

public abstract class Usuario {
    private String usuario;
    private String contrasenia;
    private int puntaje = 0;

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
		this.puntaje = puntaje;
	}

    public void Login(String usuario, String contrasenia) throws ErrorContrasenia,ErrorUsuario{
      Usuario user;
      int i;
      ArrayList<Usuario> users=this.getInstancia().getUsuarios;//A chequear esta linea xd//
      i=users.indexOf(this.usuario.equals(usuario));
       if(i>0){ //si existe el usuario...compruebo la contraseña//
         Usuario=users.get(i);
         if(Usuario.contrasenia.equals(contrasenia))
            System.out.println("login realizado"); //Hay que ver que hacemos aca//
         else
          throw new ErrorContrasenia(); 
       }   
      else 
        throw new ErrorUsuario();         
     }   
     try {

         //posibles cosas que desp veremos supongo//
         
     } 
     catch (ErrorContrasenia e) {
      System.out.println("Contraseña incorrecta")  
     }
     
     catch(ErrorUsuario){
        System.out.println("Nombre de usuario no encontrado, desea crear un nuevo usuario?");
     }
     

	/*
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
    */
}
