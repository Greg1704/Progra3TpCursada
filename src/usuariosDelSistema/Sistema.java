package usuariosDelSistema;

import java.util.ArrayList;
import encuentro.RondaEncuentros;

public class Sistema {
	private static Sistema instancia = null;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private RondaEncuentros encuentros;

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

	public void llamaRondaEncuentros() {
		encuentros = new RondaEncuentros();
		encuentros.enfrentamientoEmpleados();
		encuentros.enfrentamientoEmpleadores();
	}

	
	public void rondaDeElecciones() {
		ArrayList<Empleador> empleadoresElegidos = new ArrayList<Empleador>();
		
		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo"))
				empleador.rondaElecciones();
		}
		
		for (Empleado empleado : empleadosPretensos) {
			if(empleado.getTicket().getEstadoTicket().equalsIgnoreCase("Activo")) {
				empleado.rondaElecciones();
				empleadoresElegidos.add(empleado.getEmpleadorSeleccionado());
			}
		}
		this.empleadoresNoSeleccionados(empleadoresElegidos);
	}

	public void empleadoresNoSeleccionados(ArrayList<Empleador> empleadoresElegidos){

		for(Empleador empleador : empleadores){
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")){
				if(!empleadoresElegidos.contains(empleador))
					empleador.setPuntaje(empleador.getPuntaje() - 20);
				//Resta 20 porque el empleador no es elegido por nadie
			}
		}
	}



	public void rondaDeContrataciones() {
		ArrayList<Empleado> aux;
		RubroFactory rubroFactory;
		RubroDecorator rubroEmpleador;
		double comision; //La creo porque no se uqe hacer con la linea 106(Despues lo discutimos tomi, me lo cambias y te mato)

		for (Empleador empleador : empleadores) {
			if(empleador.getTicketEmpleador().getEstadoTicket().equalsIgnoreCase("Activo")) {
				aux = empleador.getEmpleadosSeleccionados();
				
				for (int i = 0; i < empleador.getCantidadEmpleadosSeleccionados(); i++) {
					
					if (aux.get(i).getEmpleadorSeleccionado().getNombre().equalsIgnoreCase(empleador.getNombre())) {
						empleador.getTicketEmpleador().setCantEmpleados(empleador.getTicketEmpleador().getCantEmpleados() - 1);
						aux.get(i).getTicket().finaliza();
						aux.get(i).setPuntaje(aux.get(i).getPuntaje() + 10);
						//Calcular comision blablabla
					}
					
				}
				
				if (empleador.getTicketEmpleador().getCantEmpleados() == 0) {
					empleador.getTicketEmpleador().finaliza();
					empleador.setPuntaje(empleador.getPuntaje() + 50);//suma 50 por estado finalizado
					rubroFactory=new RubroFactory();
					rubroEmpleador = rubroFactory.getRubro(empleador.getRubro(),empleador);
					comision=empleador.getTicketEmpleador().getFormularioDeBusqueda().getRemuneracion().getMonto()*rubroEmpleador.getComision();
					System.out.println(empleador.toString() + "comision = " + comision);
				}
				
			}
				
		}
		
	}


	public void busquedaLaboral(){
		this.llamaRondaEncuentros();
		this.rondaDeElecciones();
		this.rondaDeContrataciones();
	}
	
	
	
}

/*
	FALTA HACER EL SISTEMA DEL COBRO
	UNA VEZ DESPUES DE COBRAR HAY QUE SACAR LOS TICKETS DE FINALIZADO
 */
