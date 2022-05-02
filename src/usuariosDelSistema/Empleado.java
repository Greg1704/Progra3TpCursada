package usuariosDelSistema;

import armaTickets.TicketEmpleado;
import excepciones.FormularioInvalidoException;
import excepciones.ListaVaciaException;

import java.time.LocalDateTime;
import java.util.ArrayList.*;

public class Empleado extends Usuario{
	private String nya; //Nombre y Apellido
	private int dni;
	private int telefono;
	private int edad;
	private String ciudad;
	private TicketEmpleado ticket;
	private Empleador empleadorSeleccionado;


	public Empleado(String usuario, String contrasenia, String nya, int dni, int telefono, int edad, String ciudad) {
		super(usuario, contrasenia);
		this.nya = nya;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.ciudad = ciudad;
	}

	public void setTicket(TicketEmpleado ticket) {
		this.ticket = ticket;
	}
	
	public TicketEmpleado getTicket() {
		return ticket;
	}

	public String getNya() {
		return nya;
	}

	public void setNya(String nya) {
		this.nya = nya;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Empleador getEmpleadorSeleccionado() {
		return empleadorSeleccionado;
	}

	public void setEmpleadorSeleccionado(Empleador empleadorSeleccionado) {
		this.empleadorSeleccionado = empleadorSeleccionado;
	}
	
	public void rondaElecciones(){ //OTRA EXCEPCION EN CASO QUE SEA NULL Y SE HAGA GET();
		
		this.empleadorSeleccionado = (Empleador) super.getLista().getOrdenados().get(0).getUsuario();
		this.empleadorSeleccionado.setPuntaje(getPuntaje() + 10); //Suma 10 puntos por estar primero en la lista
		
	}

	@Override
	public void ActivaTicket() {
		this.ticket.activa();
	}

	@Override
	public void SuspendeTicket() {
		this.ticket.suspende();
	}

	@Override
	public void CancelaTicket() {
		this.ticket.cancela();
		this.ticket = null;
		this.setPuntaje(this.getPuntaje() - 1);
		//Se le resta un punto al Empleado por cancelar el ticket
	}

	
	public void muestraUsuarios() {
		try {
			muestraEmpleadores();
		}catch (ListaVaciaException e){
			System.out.println("Lista vacia, no hay empleadores seleccionados");
		}
		
	}
	
	private void muestraEmpleadores() throws ListaVaciaException{	
		if(this.lista == null)
			throw new ListaVaciaException();
		else {
			for (int i = 0; i < this.lista.getOrdenados().size() ; i++)
				System.out.println(this.lista.getOrdenados().get(i).getUsuario().getUsuario());
		}
		
	}
	
	
	
	public void crearTicket(String locacion, int pesoLocacion, double remuneracion, int pesoRemuneracion, String cargaHoraria, int pesoCargaHoraria,
							String tipoPuestoLaboral, int pesoTipoPuestoLaboral, int edad, int pesoEdad, String experienciaPrevia, int pesoExperienciaPrevia,
							String estudiosCursados, int pesoEstudiosCursados){
		try {
			ticket = new TicketEmpleado(LocalDateTime.now(), locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
					tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
					estudiosCursados, pesoEstudiosCursados);
		} catch (FormularioInvalidoException e) {
			System.out.println(e.getMessage() + " del Empleado " + this.nya);
		}
	}

	@Override
	public String toString() {
		return "Empleado [nya=" + nya + ", ticket=" + ticket + ", puntaje= "+ getPuntaje() + "]";
	}

	
	

}
