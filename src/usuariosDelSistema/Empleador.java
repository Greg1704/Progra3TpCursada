package usuariosDelSistema;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import armaTickets.TicketEmpleador;
import excepciones.*;
import ticketSimplificado.TicketSimplificado;

public abstract class Empleador extends Usuario implements EmpleadorComision, Observer {
	private String nombre;
	private TicketEmpleador ticketEmpleador;
	private ArrayList<Empleado> empleadosSeleccionados = new ArrayList<Empleado>();
	private int cantidadEmpleadosSeleccionados;
	private String rubro;
	private transient ArrayList<TicketSimplificado> observables=new ArrayList<TicketSimplificado>();
	private int cantObservados;
	private int contador = 0;
	private boolean yaEligioEmpleados;

	public Empleador(String usuario, String contrasenia, String nombre,String rubro) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.cantidadEmpleadosSeleccionados = 0;
		this.rubro = rubro;
		this.cantObservados=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TicketEmpleador getTicketEmpleador() {
		return ticketEmpleador;
	}

	public void setTicketEmpleador(TicketEmpleador ticketEmpleador) {
		this.ticketEmpleador = ticketEmpleador;
	}

	public void agregaEmpleado(Empleado e) {
		this.empleadosSeleccionados.add(e);
	}

	public void eliminaEmpleado(Empleado e) {
		this.empleadosSeleccionados.remove(e);
	}

	public int getCantidadEmpleadosSeleccionados() {
		return cantidadEmpleadosSeleccionados;
	}

	public void setCantidadEmpleadosSeleccionados(int cantidadEmpleadosSeleccionados) {
		this.cantidadEmpleadosSeleccionados = cantidadEmpleadosSeleccionados;
	}

	public ArrayList<Empleado> getEmpleadosSeleccionados() {
		return empleadosSeleccionados;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public boolean isYaEligioEmpleados() {
		return yaEligioEmpleados;
	}

	public void setYaEligioEmpleados(boolean yaEligioEmpleados) {
		this.yaEligioEmpleados = yaEligioEmpleados;
	}

	@Override
	public void ActivaTicket() {
		this.ticketEmpleador.activa();
	}

	@Override
	public void SuspendeTicket() {
		this.ticketEmpleador.suspende();
	}	
  
	@Override
	public void CancelaTicket() {
		this.ticketEmpleador.cancela();
		this.ticketEmpleador = null;
	}
	
	public void muestraUsuarios() {
		try {
			muestraEmpleados();
		}catch (ListaVaciaException e){
			System.out.println(e.getMessage());
		}
		
	}
	
	private void muestraEmpleados() throws ListaVaciaException{
		if(this.lista == null)
			throw new ListaVaciaException("Lista vacia, no hay empleados seleccionados");
		else {
			for (int i = 0; i < this.lista.getOrdenados().size() ; i++)
				System.out.println(this.lista.getOrdenados().get(i).getUsuario().getUsuario());
		}
		
	}
	

	/*public void rondaElecciones() {
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i = 0;

		super.getLista().getOrdenados().get(0).getUsuario().setPuntaje(super.getLista().getOrdenados().get(0).getUsuario().getPuntaje() + 5);
		//Suma 5 puntos por estar primero en la lista
		
		while(i < super.getLista().getOrdenados().size() && i < cuposTotal) {
			this.empleadosSeleccionados.add((Empleado) super.getLista().getOrdenados().get(i).getUsuario());
			i++;
		}
		
		this.cantidadEmpleadosSeleccionados = i;

	}*/
	
	public void rondaElecciones(ArrayList<Empleado> elegidos) {
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i = 0;

		super.getLista().getOrdenados().get(0).getUsuario().setPuntaje(super.getLista().getOrdenados().get(0).getUsuario().getPuntaje() + 5);
		//Suma 5 puntos por estar primero en la lista
		
		while(i < super.getLista().getOrdenados().size() && i < cuposTotal) {
			this.empleadosSeleccionados.add(elegidos.get(i));
			i++;
		}
		
		this.cantidadEmpleadosSeleccionados = i;

	}

	public void crearTicket(String locacion, int pesoLocacion, double remuneracion, int pesoRemuneracion, String cargaHoraria, int pesoCargaHoraria,
							String tipoPuestoLaboral, int pesoTipoPuestoLaboral, int edad, int pesoEdad, String experienciaPrevia, int pesoExperienciaPrevia,
							String estudiosCursados, int pesoEstudiosCursados, int cantEmpleados){
		try {
			ticketEmpleador=new TicketEmpleador(LocalDateTime.now(),locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
					tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
					estudiosCursados, pesoEstudiosCursados,cantEmpleados);
		} catch (FormularioInvalidoException e) {
			System.out.println(e.getMessage() + " del Empleador " + this.nombre);
		}
	}

	public void crearTicketSimplificado(String locacion,String tipoTrabajo){
		try {
			TicketSimplificado ticketSimplificado= new TicketSimplificado(locacion,tipoTrabajo,this);
			agregaObservable(ticketSimplificado);
			ticketSimplificado.addObserver(this);
			contador++;
			if (contador <= 2) { //PROBABLEMENTE ACA ESTA EL ERROR (this.observables.size()) ESTA ERA LA SENTENCIA QUE IBA EN EL IF
				BolsaTrabajo.getInstancia().agregaTicket(ticketSimplificado);// agrego ticket a la lista de bolsa de trabajo
				this.observables.add(ticketSimplificado); //agrego ticket a lista de tickets simp del empleador
			}			
		} catch (AtributoInvalidoException e) {
			System.out.println(e.getMessage()); //PODRIA COMENTARSE ESTO DICIENDO QUE NO SE PUEDEN CREAR MAS TICKETS SIMPLIFICADOS
		}

	}

	public void agregaObservable(TicketSimplificado ticketSimplificado){
		if(cantObservados<3) {
			this.observables.add(ticketSimplificado);
			this.cantObservados++;
		}else
			JOptionPane.showMessageDialog(null, "Ya hay 3 tickets simplificados creados, hasta que un empleado no se lleve alguno no puede crear nuevos");
	}

	private void quitaObservable(TicketSimplificado ticketSimplificado){
		this.observables.remove(ticketSimplificado);
		this.cantObservados--;
	}

	@Override
	public void update(Observable o, Object arg) { // aca va a entrar si se eligio un ticket
		//Se deberia ejecutar cuando el empleado se apropia del ticket
		//El Object seria el empleado, se usaria este update para hacer los cambios en el empleado y el empleador
		//Consultar con Grego o Manu
		
		this.quitaObservable((TicketSimplificado) o);
		
	}

	public ArrayList<TicketSimplificado> getObservables() {
		return observables;
	}

	@Override
	public String toString() {
		return "Empleador [nombre=" + nombre + ", rubro=" + rubro + "]";
	}


	
}
