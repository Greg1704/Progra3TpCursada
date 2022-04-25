package usuariosDelSistema;

import java.util.ArrayList;
import armaTickets.*;

public class Sistema {
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();

	private Sistema() {
		System.out.println("Faltan cosas");
	}

	public static Sistema getInstancia() {
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}

	
	
	

	public double comisionEmpleadoPretenso(Empleado empleado) { // determino el porcentaje que le cobro de comision y
																// calculo el monto a cobrar
		String tpl = empleado.getEmpleadorSeleccionado().getTicketEmpleador().getFormularioDeBusqueda()
				.getPuestoLaboral().getTipoPuestoLaboral();// cambien esto hdps
		double porc;

		if (tpl.equalsIgnoreCase("Junior"))
			porc = 0.8;
		else if (tpl.equalsIgnoreCase("Senior"))
			porc = 0.9;
		else
			porc = 1;
		porc -= 0.01 * empleado.getPuntaje();
		return empleado.getTicket().getFormularioDeBusqueda().getRemuneracion().getMonto() * porc;

	}

}

/*

 */
