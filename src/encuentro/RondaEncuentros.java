package encuentro;

import java.util.ArrayList;
import calculosAspectosLaborales.*;
import usuariosDelSistema.*;


public class RondaEncuentros {
	private ArrayList<Empleado> empleadosPretensos = Sistema.getInstancia().getEmpleadosPretensos();
	private ArrayList<Empleador> empleadores = Sistema.getInstancia().getEmpleadores();
	private UsuarioyPuntaje aux;
	private static double v1 = 60000;
	private static double v2 = 120000;
	

	public static double getV1() {
		return v1;
	}

	public  void setV1(double v1) {
		this.v1 = v1;
	}

	public static double getV2() {
		return v2;
	}

	public  void setV2(double v2) {
		this.v2 = v2;
	}

	public void enfrentamientoEmpleados() {
		double puntajeAux;

		for (Empleado empleado : empleadosPretensos) {
			if (empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo")) {
				empleado.setLista(new ListaAsignaciones());

				for (Empleador empleador : empleadores) {
					puntajeAux = 0;
					aux = new UsuarioyPuntaje(empleador);

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getPeso()
							* enfrentamientoCargaHoraria(
									empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getCargaHoraria(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
											.getCargaHoraria());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEdad().getPeso()
							* enfrentamientoEdad(empleado.getTicket().getFormularioDeBusqueda().getEdad().getEdad(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getEdad().getEdad());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados().getPeso()
							* enfrentamientoEstudiosCursados(
									empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados()
											.getEstudiosCursados(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
											.getEstudiosCursados());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia().getPeso()
							* enfrentamientoExpPrevia(
									empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia()
											.getExperienciaPrevia(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
											.getExperienciaPrevia());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getLocacion().getPeso()
							* enfrentamientoLocacion(
									empleado.getTicket().getFormularioDeBusqueda().getLocacion().getLocacion(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion()
											.getLocacion());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral().getPeso()
							* enfrentamientoTipoPuesto(
									empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral()
											.getTipoPuestoLaboral(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral()
											.getTipoPuestoLaboral());

					puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getPeso()
							* enfrentamientoRemuneracion(
									empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getMonto(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion()
											.getMonto());

					aux.setPuntaje(puntajeAux);

					empleado.getLista().agregaElemento(aux);
				}


			}
		}
	}

	public void enfrentamientoEmpleadores() {
		double puntajeAux;

		for (Empleador empleador : empleadores) {
			if (empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				empleador.setLista(new ListaAsignaciones());

				for (Empleado empleado : empleadosPretensos) {
					puntajeAux = 0;
					aux = new UsuarioyPuntaje(empleado);

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria().getPeso()
							* enfrentamientoCargaHoraria(
									empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getCargaHoraria(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria()
											.getCargaHoraria());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria().getPeso()
							* enfrentamientoEdad(empleado.getTicket().getFormularioDeBusqueda().getEdad().getEdad(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getEdad().getEdad());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
							.getPeso()
							* enfrentamientoEstudiosCursados(
									empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados()
											.getEstudiosCursados(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getEstudiosCursados()
											.getEstudiosCursados());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
							.getPeso()
							* enfrentamientoExpPrevia(
									empleado.getTicket().getFormularioDeBusqueda().getExperienciaPrevia()
											.getExperienciaPrevia(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getExperienciaPrevia()
											.getExperienciaPrevia());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion().getPeso()
							* enfrentamientoLocacion(
									empleado.getTicket().getFormularioDeBusqueda().getLocacion().getLocacion(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getLocacion()
											.getLocacion());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral().getPeso()
							* enfrentamientoTipoPuesto(
									empleado.getTicket().getFormularioDeBusqueda().getPuestoLaboral()
											.getTipoPuestoLaboral(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getPuestoLaboral()
											.getTipoPuestoLaboral());

					puntajeAux += empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion().getPeso()
							* enfrentamientoRemuneracion(
									empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getMonto(),
									empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion()
											.getMonto());

					aux.setPuntaje(puntajeAux);

					empleador.getLista().agregaElemento(aux);

				}
				empleador.getLista().getOrdenados().get(empleador.getLista().getOrdenados().size()-1).setPuntaje
						(empleador.getLista().getOrdenados().get(empleador.getLista().getOrdenados().size()-1).getPuntaje() - 5);
						//Resta 5 puntos por terminar ultimo en la lista

			}
		}

	}

	public double enfrentamientoCargaHoraria(String Empleado, String Empleador) {
		CargaHorariaFactory cargaHorariaFactory= new CargaHorariaFactory();
		I_CargaHoraria chEmpleado = cargaHorariaFactory.getCargaHoraria(Empleado);
		I_CargaHoraria chEmpleador = cargaHorariaFactory.getCargaHoraria(Empleador);
		return chEmpleador.versus(chEmpleado);
	}

	public double enfrentamientoEdad(int Empleado, int Empleador) {
		RangoEtarioFactory rangoEtarioFactory = new RangoEtarioFactory();
		I_RangoEtario eEmpleado = rangoEtarioFactory.getRangoEtario(Empleado);
		I_RangoEtario eEmpleador = rangoEtarioFactory.getRangoEtario(Empleador);
		return eEmpleador.versus(eEmpleado);
	}

	public double enfrentamientoEstudiosCursados(String Empleado, String Empleador) {
		EstudiosCursadosFactory estudiosCursadosFactory = new EstudiosCursadosFactory();
		I_EstudiosCursados ecEmpleado = estudiosCursadosFactory.getEstudiosCursados(Empleado);
		I_EstudiosCursados ecEmpleador = estudiosCursadosFactory.getEstudiosCursados(Empleador);
		return ecEmpleador.versus(ecEmpleado);
	}

	public double enfrentamientoExpPrevia(String Empleado, String Empleador) {
		ExperienciaPreviaFactory experienciaPreviaFactory = new ExperienciaPreviaFactory();
		I_ExperienciaPrevia expEmpleado = experienciaPreviaFactory.getExperienciaPrevia(Empleado);
		I_ExperienciaPrevia expEmpleador = experienciaPreviaFactory.getExperienciaPrevia(Empleador);
		return expEmpleador.versus(expEmpleado);
	}

	public double enfrentamientoLocacion(String Empleado, String Empleador) {
		LocacionFactory locacionFactory = new LocacionFactory();
		I_Locacion locEmpleado = locacionFactory.getLocacion(Empleado);
		I_Locacion locEmpleador = locacionFactory.getLocacion(Empleador);
		return locEmpleador.versus(locEmpleado);
	}

	public double enfrentamientoTipoPuesto(String Empleado, String Empleador) {
		TipoDePuestoFactory tipoDePuestoFactory = new TipoDePuestoFactory();
		I_TipoDePuesto tpEmpleado = tipoDePuestoFactory.getTipoDePuesto(Empleado);
		I_TipoDePuesto tpEmpleador = tipoDePuestoFactory.getTipoDePuesto(Empleador);
		return tpEmpleador.versus(tpEmpleado);
	}

	public double enfrentamientoRemuneracion(double Empleado, double Empleador) {
		RemuneracionFactory remuneracionFactory= new RemuneracionFactory();
		I_Remuneracion rEmpleado = remuneracionFactory.getRemuneracion(Empleado);
		I_Remuneracion rEmpleador = remuneracionFactory.getRemuneracion(Empleador);
		return rEmpleador.versus(rEmpleado);
	}

}
