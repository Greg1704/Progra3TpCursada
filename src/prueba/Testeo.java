package prueba;

import java.time.LocalDateTime;

import armaTickets.*;
import usuariosDelSistema.*;


public class Testeo {

	public static void main(String[] args) {
		
		Sistema agencia = Sistema.getInstancia();
		
		Empleado e1;
		TicketEmpleado t1;
		FormularioDeBusqueda f1;
		Empleado e2;
		TicketEmpleado t2;
		FormularioDeBusqueda f2;
		Empleado e3;
		TicketEmpleado t3;
		FormularioDeBusqueda f3;
		Empleado e4;
		TicketEmpleado t4;
		FormularioDeBusqueda f4;
		Empleado e5;
		TicketEmpleado t5;
		FormularioDeBusqueda f7;
		
		EmpleadorJuridico em1;
		TicketEmpleador te1;
		FormularioDeBusqueda f5;
		EmpleadorFisico em2;
		TicketEmpleador te2;
		FormularioDeBusqueda f6;
	
		f1 = new FormularioDeBusqueda("Home Office",1,45000,1,"Media",1,"Junior",1,25,1,"Media",1,"Secundario",1);
		t1 = new TicketEmpleado(LocalDateTime.now(),f1);
		e1 = new Empleado("Juanu","contrasenia","Juan pedro Garcia",43322122,22345654,25,"Mar del Plata",t1);		
		
		f2 = new FormularioDeBusqueda("Presencial",1,800000,1,"Completa",1,"Senior",1,40,1,"Media",1,"Secundario",1);
		t2 = new TicketEmpleado(LocalDateTime.now(),f2);
		e2 = new Empleado("LauraX","contrasenia123","Laura perez",34556543,223556677,40,"Mar del Plata",t2);
				
		f3 = new FormularioDeBusqueda("Presencial",1,130000,1,"Extendida",1,"Gerencial",1,32,1,"Mucha",1,"Terciario",1);
		t3 = new TicketEmpleado(LocalDateTime.now(),f3);
		e3 = new Empleado("Pedrito45","MamayPapa324","Pedro Fernandez",36789546,223456765,32,"La Plata",t3);
		
		f4 = new FormularioDeBusqueda("HomeOffice",1,45000,1,"Media",1,"Junior",1,23,1,"Poca",1,"Terciario",1);
		t4 = new TicketEmpleado(LocalDateTime.now(),f4);
		e4 = new Empleado("Carla32","Michifus","Carla Lopez",42654839,223567543,23,"CABA",t4);
		
		f7 = new FormularioDeBusqueda("Indiferente",1,45000,1,"Completa",1,"Senior",1,42,1,"Media",1,"Secundario",1);
		t5 = new TicketEmpleado(LocalDateTime.now(),f7);
		e5 = new Empleado("DarthVader78","YoSoyTuPadre","Cacho Enriquez",32456765,482565,42,"Mar Del Plata",t5);
		
		f5 = new FormularioDeBusqueda("Presencial",10,125000,1,"Extendida",5,"Gerencial",5,30,1,"Mucha",10,"Terciario",10);
		te1 = new TicketEmpleador(LocalDateTime.now(),f5,3);
		em1 = new EmpleadorJuridico("CocaCola Inc","PepsiNoExistis","Coca Cola Incorporation",te1);
		
		f6 = new FormularioDeBusqueda("Presencial",10,45000,10,"Completa",5,"Junior",5,25,3,"Poca",1,"Primario",1);
		te2 = new TicketEmpleador(LocalDateTime.now(),f6,1);
		em2 = new EmpleadorFisico("LaDespensaDelTioMario","RitaTeAmo","La despensa del tio Mario",te2);
		
		agencia.agregaEmpleado(e1);
		agencia.agregaEmpleado(e2);
		agencia.agregaEmpleado(e3);
		agencia.agregaEmpleado(e4);
		agencia.agregaEmpleado(e5);
		agencia.agregaEmpleador(em1);
		agencia.agregaEmpleador(em2);
		
		agencia.busquedaLaboral();
		
		
	}

}
