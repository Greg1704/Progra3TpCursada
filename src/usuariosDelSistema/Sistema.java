package usuariosDelSistema;

import java.util.ArrayList;
import encuentro.RondaEncuentros;

public class Sistema {
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private RondaEncuentros encuentros;
	
	private Sistema() {
		System.out.println("Faltan cosas");
	}

	public static Sistema getInstancia() {
		if (instancia == null)
			instancia = new Sistema();
		return instancia;
	}

	public void agregaEmpleado(Empleado e) {
		this.empleadosPretensos.add(e);
	}
	
	public void sacaEmpleado(Empleado e) {
		this.empleadosPretensos.remove(e);
	}
	
	public void agregaEmpleador(Empleador e) {
		this.empleadores.add(e);
	}
	
	public void sacaEmpleador(Empleado e) {
		this.empleadores.remove(e);
	}
	
	public ArrayList<Empleado> getEmpleadosPretensos(){
		return this.empleadosPretensos;
	}
	
	public ArrayList<Empleador> getEmpleadores(){
		return this.empleadores;
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

	private void llamaRondaEncuentros() {
		encuentros = new RondaEncuentros();
		encuentros.enfrentamientoEmpleados();
		encuentros.enfrentamientoEmpleadores();
	}

	
	private void rondaDeElecciones() {
		
		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleador.rondaElecciones();
		}
		
		for (Empleado empleado : empleadosPretensos) {
			if(empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleado.rondaElecciones();
		}
	}
	
	private void rondaDeContrataciones() {
		ArrayList<Empleado> aux;

		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				aux = empleador.getEmpleadosSeleccionados();
				
				for (int i = 0; i < empleador.getCantidadEmpleadosSeleccionados(); i++) {
					
					if (aux.get(i).getEmpleadorSeleccionado().getNombre().equalsIgnoreCase(empleador.getNombre())) {
						empleador.getTicketEmpleador().setCantEmpleados(empleador.getTicketEmpleador().getCantEmpleados() - 1);
						aux.get(i).getTicket().finaliza();
					}
					
				}
				
				if (empleador.getTicketEmpleador().getCantEmpleados() == 0)
					empleador.getTicketEmpleador().finaliza();
				
				
				
				
			}
				
		}
		
	}
	
	
	
	
}

/*
	FALTA HACER EL SISTEMA DEL COBRO
 */
