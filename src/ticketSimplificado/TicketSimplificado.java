package ticketSimplificado;

import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import excepciones.AtributoInvalidoException;
import usuariosDelSistema.*;

import javax.swing.JFrame;

import java.util.Observable;

/**
 * Ticket utilizado en la bolsa de Trabajo, son creados por los empleadores y guardados en la clase "BolsaTrabajo".<br>
 *
 */
@SuppressWarnings("deprecation")


public class TicketSimplificado extends Observable{
   private I_Locacion locacion;
   private String tipoTrabajo;
   private boolean contratado;
   private Empleado empleadoContratado;

   public TicketSimplificado(String locacion, String tipoTrabajo, Empleador empleador) throws AtributoInvalidoException {
      LocacionFactory locacionFactory=new LocacionFactory();
      this.locacion=locacionFactory.getLocacion(locacion);
      this.tipoTrabajo=tipoTrabajo;
      this.contratado=false;
   }

   public void setEmpleadoContratado(Empleado empleadoContratado) {
      this.empleadoContratado = empleadoContratado;
      this.contratado = true;
      setChanged();
      notifyObservers(empleadoContratado);
   }

   @SuppressWarnings("deprecation")
  
   public String getLocacion() {
		return locacion.toString();
	}

   public String getTipoDeTrabajo() {
	   return this.tipoTrabajo;
   }
   
   public I_Locacion getLocacionInterfaz() {
		return locacion;
	}

   @Override
   public String toString() {
	   return "TicketSimplificado: Locacion: " + locacion.toString() + ", Tipo de trabajo: " + tipoTrabajo;
}
   
}


