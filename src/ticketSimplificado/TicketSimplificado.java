package ticketSimplificado;

import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import excepciones.AtributoInvalidoException;
import usuariosDelSistema.*;

import javax.swing.JFrame;

import java.io.Serializable;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class TicketSimplificado extends Observable{
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

   public void setEmpleadoContratado(Empleado empleadoContratado) {
      this.empleadoContratado = empleadoContratado;
   }

   @SuppressWarnings("deprecation")
  
   public String getLocacion() {
		return locacion.toString();
	}

   public String getTipoDeTrabajo() {
	   return this.tipoTrabajo.getRubro();
   }
   
   public I_Locacion getLocacionInterfaz() {
		return locacion;
	}
   
   //Revisar si hay que agregar algun error a tipoTrabajoFactory
   //Revisar como relacionar las clases Salud, ComercioLocal, y ComercioInternacional con los empleados
}


