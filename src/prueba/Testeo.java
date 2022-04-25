package prueba;

import java.time.LocalDateTime;

import armaTickets.*;
import usuariosDelSistema.*;

public class Testeo {

	public static void main(String[] args) {
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
		
		Empleador em1;
		TicketEmpleador te1;
		FormularioDeBusqueda f5;
		Empleador em2;
		TicketEmpleador te2;
		FormularioDeBusqueda f6;

		e1 = new Empleado("Juan","contrasenia","Juan pedro Garcia",43322122,22345654,25,"Mar del Plata");
		f1 = new FormularioDeBusqueda("Home Office",1,45000,1,"Media",1,"Junior",1,25,1,"Media",1,"Secundarios",1);
		t1 = new TicketEmpleado(LocalDateTime.now(),f1);
		
		e2 = new Empleado("Laura","contrasenia123","Laura perez",34556543,223556677,40,"Mar del Plata");
		f2 = new FormularioDeBusqueda("Presencial",1,800000,1,"Completa",1,"Senior",1,40,1,"Media",1,"Secundarios",1);
		t2 = new TicketEmpleado(LocalDateTime.now(),f2);
		
		
	}

}
