package usuariosDelSistema;

import java.util.ArrayList;

public class Sistema {
    private static Sistema instancia=null;
    private ArrayList<Usuario> usuarios=new ArrayList<Usuario>();


    private Sistema(){
     System.out.println("Faltan cosas");
    }

    public static Sistema getInstancia(){
        if(instancia == null)
            instancia=new Sistema();
        return instancia;
    }
    
   public void agregarUsuario(Usuario user){
       this.usuarios.add(user);
   }
   
   public void eliminarUsuario(Usuario user){
      this.usuarios.remove(user);
  }

   public ArrayList<Usuario> getUsuarios(){
      return usuarios;
  }

}

/*

 */
