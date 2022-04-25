package usuariosDelSistema;

import java.util.ArrayList;
import armaTickets.*;

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


public void comisionEmpleadoPretenso(Empleado empleado){ //determino el porcentaje que le cobro de comision y calculo el monto a cobrar
 String tpl=empleado.getEmpleadorSeleccionado().getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral().getTipoPuestoLaboral();//cambien esto hdps
 double porc,comision;

 if(tpl.equals("Junior"))
   porc=0.8;
  else
   if(tpl.equals("Senior")) 
    porc=0.9;
    else
     porc=1;
  porc-=0.01*empleado.getPuntaje();
  comision=empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getMonto()*porc;  

}



  
}

/*

 */
