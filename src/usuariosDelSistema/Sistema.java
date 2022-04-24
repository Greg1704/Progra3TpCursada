package usuariosDelSistema;

import java.util.ArrayList;

public class Sistema {
    private static Sistema instancia=null;
    private ArrayList<Empleado> EmpleadosPretensos=new ArrayList<Empleado>();
    private ArrayList<Empleador> Empleadores = new ArrayList<Empleador>();


    private Sistema(){
     System.out.println("Faltan cosas");
    }

    public static Sistema getInstancia(){
        if(instancia == null)
            instancia=new Sistema();
        return instancia;
    }
    
    public void agregarEmpleado(Empleado empleado){this.EmpleadosPretensos.add(empleado);}

    public void eliminarEmpleado(Empleado empleado){this.EmpleadosPretensos.remove(empleado);}

    public ArrayList<Empleado> getEmpleadosPretensos(){return this.EmpleadosPretensos;}

    public void agregarEmpleador(Empleador empleador){this.Empleadores.add(empleador);}

    public void eliminarEmpleador(Empleador empleador){this.Empleadores.remove(empleador);}

    public ArrayList<Empleador> getEmpleadores(){return this.Empleadores;}



}

/*

 */
