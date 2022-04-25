package encuentro;

import java.util.ArrayList;

import atributosFormularios.*;
import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;
import calculosAspectosLaborales.*;


public class RondaEncuentros {
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	private UsuarioyPuntaje aux;
	private double v1 = 60000;
	private double v2 = 120000;
	private double puntajeAux;
	
	public RondaEncuentros(ArrayList<Empleado> empleadosPretensos, ArrayList<Empleador> empleadores) {
		super();
		this.empleadosPretensos = empleadosPretensos;
		this.empleadores = empleadores;
	}
	

	public double getV1() {
		return v1;
	}

	public void setV1(double v1) {
		this.v1 = v1;
	}

	public double getV2() {
		return v2;
	}

	public void setV2(double v2) {
		this.v2 = v2;
	}


	public void enfrentamientoEmpleados() {
		
		for (Empleado empleado : empleadosPretensos) {
			
			puntajeAux = 0;
			empleado.setLista(new ListaAsignaciones());
			
			for (Empleador empleador : empleadores) {
				aux = new UsuarioyPuntaje(empleador);		
				
				puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getPeso() *
						enfrentamientoCargaHoraria(empleado.getTicket().getFormularioDeBusqueda().getCargaHoraria().getCargaHoraria(),empleador.getTicketEmpleador().getFormularioDeBusqueda().getCargaHoraria().getCargaHoraria());
				
				puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEdad().getPeso() *
						enfrentamientoEdad(empleado.getTicket().getFormularioDeBusqueda().getEdad().getEdad(),empleador.getTicketEmpleador().getFormularioDeBusqueda().getEdad().getEdad());

				puntajeAux += empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados().getPeso() *
						enfrentamientoEstudiosCursados(empleado.getTicket().getFormularioDeBusqueda().getEstudiosCursados().);
				
				empleado.getLista().agregaElemento(aux);
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double enfrentamientoCargaHoraria(String Empleado,String Empleador) {
		I_CargaHoraria chEmpleado;
		I_CargaHoraria chEmpleador;
		
		if (Empleado.equalsIgnoreCase("Media")) 
			chEmpleado = (Media)new Media();
		else {
			if (Empleado.equalsIgnoreCase("Completa"))
				chEmpleado = (Completa)new Completa();
			else
				chEmpleado = (Extendida)new Extendida();
		}
			
		if (Empleador.equalsIgnoreCase("Media")) 
			chEmpleador = (Media)new Media();
		else {
			if (Empleador.equalsIgnoreCase("Completa"))
				chEmpleador = (Completa)new Completa();
			else
				chEmpleador = (Extendida)new Extendida();
		}
		
		return chEmpleador.versus(chEmpleado);
	}
	
	public double enfrentamientoEdad(int Empleado,int Empleador) {
		I_RangoEtario eEmpleado;
		I_RangoEtario eEmpleador;
		
		if (Empleado<40) 
			eEmpleado = (Menos40)new Menos40();
		else {
			if (Empleado > 50) 
				eEmpleado = (Mas50)new Mas50();
			else
				eEmpleado = (Entre40y50)new Entre40y50();
		}
		
		if (Empleador<40) 
			eEmpleador = (Menos40)new Menos40();
		else {
			if (Empleador > 50) 
				eEmpleador = (Mas50)new Mas50();
			else
				eEmpleador = (Entre40y50)new Entre40y50();
		}
		
		return eEmpleador.versus(eEmpleado);
	}
	
	public double enfrentamientoEstudiosCursados(String Empleado,String Empleador) {
		I_EstudiosCursados ecEmpleado;
		I_EstudiosCursados ecEmpleador;
		
		if (Empleado.equalsIgnoreCase("Primario")) 
			ecEmpleado = (Primario)new Primario();
		else {
			if (Empleado.equalsIgnoreCase("Secundario"))
				ecEmpleado = (Secundario)new Secundario();
			else
				ecEmpleado = (Terciario)new Terciario();
		}
			
		if (Empleador.equalsIgnoreCase("Primario")) 
			ecEmpleador = (Primario)new Primario();
		else {
			if (Empleador.equalsIgnoreCase("Secundario"))
				ecEmpleador = (Secundario)new Secundario();
			else
				ecEmpleador = (Terciario)new Terciario();
		}
		
		return ecEmpleador.versus(ecEmpleado);
	}
	
	public double enfrentamientoExpPrevia(String Empleado,String Empleador) {
		I_ExperienciaPrevia expEmpleado;
		I_ExperienciaPrevia expEmpleador;
		
		if (Empleado.equalsIgnoreCase("Nada")) 
			expEmpleado = (Nada)new Nada();
		else {
			if (Empleado.equalsIgnoreCase("Media"))
				expEmpleado = (ExpPreviaMedia)new ExpPreviaMedia();
			else
				expEmpleado = (Mucha)new Mucha();
		}
			
		if (Empleador.equalsIgnoreCase("Nada")) 
			expEmpleador = (Nada)new Nada();
		else {
			if (Empleador.equalsIgnoreCase("Media"))
				expEmpleador = (ExpPreviaMedia)new ExpPreviaMedia();
			else
				expEmpleador = (Mucha)new Mucha();
		}
		
		return expEmpleador.versus(expEmpleado);
	}
	

	public double enfrentamientoLocacion(String Empleado,String Empleador) {
		I_Locacion locEmpleado;
		I_Locacion locEmpleador;
	
		if (Empleado.equalsIgnoreCase("HomeOffice")) 
			locEmpleado = (HomeOffice)new HomeOffice();
		else {
			if (Empleado.equalsIgnoreCase("Presencial"))
				locEmpleado = (Presencial)new Presencial();
			else
				locEmpleado = (Indistinto)new Indistinto();
		}
		
		if (Empleador.equalsIgnoreCase("HomeOffice")) 
			locEmpleador = (HomeOffice)new HomeOffice();
		else {
			if (Empleador.equalsIgnoreCase("Presencial"))
				locEmpleador = (Presencial)new Presencial();
			else
				locEmpleador = (Indistinto)new Indistinto();
		}
	
		return locEmpleador.versus(locEmpleado);
	}
	
	public double enfrentamientoTipoPuesto(String Empleado,String Empleador) {
		I_TipoDePuesto tpEmpleado;
		I_TipoDePuesto tpEmpleador;
	
		if (Empleado.equalsIgnoreCase("Junior")) 
			tpEmpleado = (Junior)new Junior();
		else {
			if (Empleado.equalsIgnoreCase("Senior"))
				tpEmpleado = (Senior)new Senior();
			else
				tpEmpleado = (Managment)new Managment();
		}
		
		if (Empleador.equalsIgnoreCase("Junior")) 
			tpEmpleador = (Junior)new Junior();
		else {
			if (Empleador.equalsIgnoreCase("Senior"))
				tpEmpleador = (Senior)new Senior();
			else
				tpEmpleador = (Managment)new Managment();
		}
	
		return tpEmpleador.versus(tpEmpleado);
	}
	
	public double enfrentamientoRemuneracion(double Empleado,double Empleador) {
		I_Remuneracion rEmpleado;
		I_Remuneracion rEmpleador;
		
		if (Empleado<v1) 
			rEmpleado = (MenorV1)new MenorV1();
		else {
			if (Empleado > v2) 
				rEmpleado = (MayorV2)new MayorV2();
			else
				rEmpleado = (EntreV1yV2)new EntreV1yV2();
		}
		
		if (Empleador<v1) 
			rEmpleador = (MenorV1)new MenorV1();
		else {
			if (Empleador > v2) 
				rEmpleador = (MayorV2)new MayorV2();
			else
				rEmpleador = (EntreV1yV2)new EntreV1yV2();
		}
		
		return rEmpleador.versus(rEmpleado);
	}

}

	