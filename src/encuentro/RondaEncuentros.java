package encuentro;

import java.util.ArrayList;
import calculosAspectosLaborales.*;
import excepciones.NoActivoException;
import usuariosDelSistema.*;

public class RondaEncuentros{
	private ArrayList<Empleado> empleadosPretensos = Sistema.getInstancia().getEmpleadosPretensos();
	private ArrayList<Empleador> empleadores = Sistema.getInstancia().getEmpleadores();
	private UsuarioyPuntaje aux;
	private static double v1 = 60000;
	private static double v2 = 120000;

	public static double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public static double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}

	/**
	 * @author Grupo4 <br>
	 *         El m�todo calcula el puntaje de todos los empleadores en cuesti�n
	 *         de cada empleado <br>
	 *         PostCond: debe devolver una lista ordenada de empleadores para cada
	 *         empleado � una vac�a.
	 */

	public void enfrentamientoEmpleados() {
		double puntajeAux;

		for (Empleado empleado : empleadosPretensos) {
			if (empleado.getTicket()!=null) {
				
				try {
					empleado.getTicket().esActivo();
					empleado.setLista(new ListaAsignaciones());
					
					for (Empleador empleador : empleadores) {
						puntajeAux = 0;
						aux = new UsuarioyPuntaje(empleador);

						if (empleador.getTicketEmpleador()!=null) {
							
							try{ 
							empleador.getTicketEmpleador().esActivo();
							
							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getPeso()
									* enfrentamientoCargaHoraria(
											empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria()
													.getInstanciaHorario(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
													.getInstanciaHorario());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEdad().getPeso()
									* enfrentamientoEdad(
											empleado.getTicket().getFormularioDeBusqueda().getEdad().getInstanciaEdad(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getEdad()
													.getInstanciaEdad());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados().getPeso()
									* enfrentamientoEstudiosCursados(
											empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados()
													.getInstanciaEstudios(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
													.getInstanciaEstudios());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia().getPeso()
									* enfrentamientoExpPrevia(
											empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia()
													.getInstanciaExperiencia(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
													.getInstanciaExperiencia());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getLocacion().getPeso()
									* enfrentamientoLocacion(
											empleado.getTicket().getFormularioDeBusqueda().getLocacion()
													.getInstanciaLocacion(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion()
													.getInstanciaLocacion());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral().getPeso()
									* enfrentamientoTipoPuesto(
											empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral()
													.getInstanciaLaboral(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral()
													.getInstanciaLaboral());

							puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getPeso()
									* enfrentamientoRemuneracion(
											empleado.getTicket().getFormularioDeBusqueda().getRemuneracion()
													.getInstanciaRemuneracion(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion()
													.getInstanciaRemuneracion());

							aux.setPuntaje(puntajeAux);

							empleado.getLista().agregaElemento(aux);		
							}catch(NoActivoException e) {}
											
									
						}
					}
					empleado.setYaEligioEmpleador(false);
				}catch(NoActivoException e) {}

			}
		}
	}

	/**
	 * @author Grupo4 <br>
	 *         El m�todo calcula el puntaje de todos los empleadores en cuesti�n
	 *         de cada empleado <br>
	 *         PostCond: debe devolver una lista ordenada de empleados para cada
	 *         empleador � una vac�a, y, adem�s, le resta en la plataforma al
	 *         empleado que sale <br>
	 *         �ltimo en la lista, 5 puntos.
	 */

	public void enfrentamientoEmpleadores() {
		double puntajeAux;

		for (Empleador empleador : empleadores) {
			
			if (empleador.getTicketEmpleador()!=null) {
				
				try {
					empleador.getTicketEmpleador().esActivo();
					empleador.setLista(new ListaAsignaciones());

					for (Empleado empleado : empleadosPretensos) {
						puntajeAux = 0;
						aux = new UsuarioyPuntaje(empleado);

						if (empleado.getTicket()!=null) {
							
							try {
							empleado.getTicket().esActivo();
							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
									.getPeso()
									* enfrentamientoCargaHoraria(
											empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria()
													.getInstanciaHorario(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
													.getInstanciaHorario());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
									.getPeso()
									* enfrentamientoEdad(
											empleado.getTicket().getFormularioDeBusqueda().getEdad().getInstanciaEdad(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getEdad()
													.getInstanciaEdad());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
									.getPeso()
									* enfrentamientoEstudiosCursados(
											empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados()
													.getInstanciaEstudios(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
													.getInstanciaEstudios());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
									.getPeso()
									* enfrentamientoExpPrevia(
											empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia()
													.getInstanciaExperiencia(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
													.getInstanciaExperiencia());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion().getPeso()
									* enfrentamientoLocacion(
											empleado.getTicket().getFormularioDeBusqueda().getLocacion()
													.getInstanciaLocacion(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion()
													.getInstanciaLocacion());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral()
									.getPeso()
									* enfrentamientoTipoPuesto(
											empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral()
													.getInstanciaLaboral(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral()
													.getInstanciaLaboral());

							puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion()
									.getPeso()
									* enfrentamientoRemuneracion(
											empleado.getTicket().getFormularioDeBusqueda().getRemuneracion()
													.getInstanciaRemuneracion(),
											empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion()
													.getInstanciaRemuneracion());

							aux.setPuntaje(puntajeAux);

							empleador.getLista().agregaElemento(aux);

							}catch(NoActivoException e) {}
								
						}
		
					}
	
					empleador.getLista().getOrdenados().get(empleador.getLista().getOrdenados().size() - 1)
							.getUsuario().setPuntaje(empleador.getLista().getOrdenados()
									.get(empleador.getLista().getOrdenados().size() - 1).getUsuario().getPuntaje() - 5);
					// Resta 5 puntos por terminar ultimo en la lista
				
					empleador.setYaEligioEmpleados(false);
				} catch (NoActivoException e) {}
				
			}
		}

	}

	/**
	 * @author Grupo4 <br>
	 *         Se crea una instancia de Factory para luego con esa instancia
	 *         identificar los Strings de Empleado y Empleador con sus <br>
	 *         respectivas cargas horarias, as�, creando instancias de estas, para
	 *         luego, aplicar Double Dispatch.
	 */

	private double enfrentamientoCargaHoraria(I_CargaHoraria chEmpleado, I_CargaHoraria chEmpleador) {
		return chEmpleador.versus(chEmpleado);
	}

	private double enfrentamientoEdad(I_RangoEtario eEmpleado, I_RangoEtario eEmpleador) {

		return eEmpleador.versus(eEmpleado);
	}

	private double enfrentamientoEstudiosCursados(I_EstudiosCursados ecEmpleado, I_EstudiosCursados ecEmpleador) {
		return ecEmpleador.versus(ecEmpleado);
	}

	private double enfrentamientoExpPrevia(I_ExperienciaPrevia expEmpleado, I_ExperienciaPrevia expEmpleador) {
		return expEmpleador.versus(expEmpleado);
	}

	private double enfrentamientoLocacion(I_Locacion locEmpleado, I_Locacion locEmpleador) {
		return locEmpleador.versus(locEmpleado);
	}

	private double enfrentamientoTipoPuesto(I_TipoDePuesto tpEmpleado, I_TipoDePuesto tpEmpleador) {
		return tpEmpleador.versus(tpEmpleado);
	}

	private double enfrentamientoRemuneracion(I_Remuneracion rEmpleado, I_Remuneracion rEmpleador) {
		return rEmpleador.versus(rEmpleado);
	}

}
