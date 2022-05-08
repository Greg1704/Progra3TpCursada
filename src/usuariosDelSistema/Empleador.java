package usuariosDelSistema;

import java.time.LocalDateTime;
import java.util.ArrayList;

import armaTickets.TicketEmpleador;
import excepciones.ContraseniaIncorrectaException;
import excepciones.FormularioInvalidoException;
import excepciones.ListaVaciaException;
import excepciones.UsuarioIncorrectoException;

public abstract class Empleador extends Usuario implements EmpleadorComision {
	private String nombre;
	private TicketEmpleador ticketEmpleador;
	private ArrayList<Empleado> empleadosSeleccionados = new ArrayList<Empleado>();
	private int cantidadEmpleadosSeleccionados;
	private String rubro;

	public Empleador(String usuario, String contrasenia, String nombre,String rubro) {
		super(usuario, contrasenia);
		this.nombre = nombre;
		this.cantidadEmpleadosSeleccionados = 0;
		this.rubro = rubro;
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

	@Override
	public void ActivaTicket() {
		this.ticketEmpleador.activa();
	}

	@Override
	public void SuspendeTicket() {
		this.ticketEmpleador.suspende();
	}
	
	public void Login(String usuario, String contrasenia){

		try {
			buscaEmpleador(usuario,contrasenia);
			System.out.println("Login completado.");
		}catch (ContraseniaIncorrectaException e) {
			System.out.println(e.getMessage());
		}
		catch(UsuarioIncorrectoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Empleador buscaEmpleador(String usuario, String contrasenia)throws UsuarioIncorrectoException,ContraseniaIncorrectaException {
		int i = 0;
		
		while (i < Sistema.getInstancia().getEmpleadores().size()) {
			if (Sistema.getInstancia().getEmpleadores().get(i).usuario.compareTo(usuario) == 0) {
				if(Sistema.getInstancia().getEmpleadores().get(i).contrasenia.compareTo(contrasenia) == 0)
					return Sistema.getInstancia().getEmpleadores().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;		
		}
		throw new UsuarioIncorrectoException();
		
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
	

	public void rondaElecciones() {
		int cuposTotal = this.ticketEmpleador.getCantEmpleados();
		int i = 0;

		super.getLista().getOrdenados().get(0).getUsuario().setPuntaje(super.getLista().getOrdenados().get(0).getUsuario().getPuntaje() + 5);
		//Suma 5 puntos por estar primero en la lista
		
		while(i < super.getLista().getOrdenados().size() && i < cuposTotal) {
			this.empleadosSeleccionados.add((Empleado) super.getLista().getOrdenados().get(i).getUsuario());
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

	@Override
	public String toString() {
		return "Empleador: Nombre=" + nombre + ticketEmpleador + ". Cantidad de empleados seleccionados:"
				+ cantidadEmpleadosSeleccionados;
	}

	

}
