package prueba;

import usuariosDelSistema.*;


public class Testeo {

	public static void main(String[] args) {
		
		Sistema agencia = Sistema.getInstancia();
		
		Empleado e1;
		Empleado e2;
		Empleado e3;
		Empleado e4;
		Empleado e5;

		EmpleadorJuridico em1;
		EmpleadorFisico em2;

		e1 = new Empleado("Juanu","contrasenia","Juan pedro Garcia",43322122,22345654,25,"Mar del Plata");
		e1.crearTicket("HomeOffice",1,45000,1,"Completa",1,"Junior",1,25,1,"Media",1,"Secundario",1);

		e2 = new Empleado("LauraX","contrasenia123","Laura perez",34556543,223556677,40,"Mar del Plata");
		e2.crearTicket("Presencial",1,800000,1,"Completa",1,"Senior",1,40,1,"Media",1,"Secundario",1);

		e3 = new Empleado("Pedrito45","MamayPapa324","Pedro Fernandez",36789546,223456765,32,"La Plata");
		e3.crearTicket("Presencial",1,130000,1,"Extendida",1,"Managment",1,32,1,"Mucha",1,"Terciario",1);

		e4 = new Empleado("Carla32","Michifus","Carla Lopez",42654839,223567543,23,"CABA");
		e4.crearTicket("Presencial",1,45000,1,"Media",1,"Junior",1,25,1,"Media",1,"Secundario",1);

		e5 = new Empleado("DarthVader78","YoSoyTuPadre","Cacho Enriquez",32456765,482565,42,"Mar Del Plata");
		e5.crearTicket("Indistinto",1,45000,1,"Media",1,"Junior",1,25,1,"Media",1,"Secundario",1);

		em1 = new EmpleadorJuridico("CocaCola Inc","PepsiNoExistis","Coca Cola Incorporation","ComercioInternacional");
		em1.crearTicket("Presencial",10,125000,1,"Extendida",5,"Managment",5,30,1,"Mucha",10,"Terciario",10,3);

		em2 = new EmpleadorFisico("LaDespensaDelTioMario","RitaTeAmo","La despensa del tio Mario","ComercioLocal");
		em2.crearTicket("Presencial",10,45000,10,"Completa",5,"Junior",5,25,3,"Nada",1,"Primario",1,1);
		
		agencia.agregaEmpleado(e1);
		agencia.agregaEmpleado(e2);
		agencia.agregaEmpleado(e3);
		agencia.agregaEmpleado(e4);
		agencia.agregaEmpleado(e5);
		agencia.agregaEmpleador(em1);
		agencia.agregaEmpleador(em2);
		
		agencia.busquedaLaboral();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(e4.toString());
		System.out.println(e5.toString());
		System.out.println(em1.toString());
		System.out.println(em2.toString());
		
		System.out.println("***********************");
		
		e1.muestraUsuarios();
		System.out.println("***********************");
		e2.muestraUsuarios();
		System.out.println("***********************");
		e3.muestraUsuarios();
		System.out.println("***********************");
		e4.muestraUsuarios();
		System.out.println("***********************");
		e5.muestraUsuarios();
		System.out.println("***********************");
		em1.muestraUsuarios();
		System.out.println("***********************");
		em2.muestraUsuarios();
		
	}

}
