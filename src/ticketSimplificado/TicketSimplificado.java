package ticketSimplificado;

import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import excepciones.AtributoInvalidoException;
import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;
import usuariosDelSistema.I_TipoTrabajo;
import usuariosDelSistema.TipoTrabajoFactory;

import java.util.Observable;

public class TicketSimplificado extends Observable implements Runnable{
//habria que agregar 2 strings: rubro, y locacion. Con eso aplicar los decorator y agregarle las funcionalidades
//a su vez hay que aplicar metodo run, para asi correrlo como un thread, podemos extender de clase thread o implementar
//la interfaz runneable.
//o puede ser un recurso compartido por el que compiten los thread que resultan ser los empleados
//hay que aplicar a su vez observer observador
   private I_Locacion locacion;
   private I_TipoTrabajo tipoTrabajo;
   private boolean contratado;
   private Empleado empleadoContratado;

   public TicketSimplificado(String locacion, String tipoTrabajo, Empleador empleador) throws AtributoInvalidoException {
      LocacionFactory locacionFactory=new LocacionFactory();
      this.locacion=locacionFactory.getLocacion(locacion);
      TipoTrabajoFactory tipoTrabajoFactory=new TipoTrabajoFactory();
      this.tipoTrabajo=tipoTrabajoFactory.getTipoTrabajo(tipoTrabajo,empleador);
      this.contratado=false;
   }

   @Override
   public void run() {
      while(this.contratado==false){
         //Entra al metodo, y cuando sale, puede o no estar contratado
         //Ya que puede entrar al recurso compartido, pero ser rechazado por el empleado
      }
      setChanged();
      notifyObservers(empleadoContratado);
   }

   //Revisar si hay que agregar algun error a tipoTrabajoFactory
   //Revisar como relacionar las clases Salud, ComercioLocal, y ComercioInternacional con los empleados
}
