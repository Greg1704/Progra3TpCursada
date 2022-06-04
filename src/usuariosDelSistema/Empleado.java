package usuariosDelSistema;

import armaTickets.TicketEmpleado;
import excepciones.ContraseniaIncorrectaException;
import excepciones.FormularioInvalidoException;
import excepciones.ListaVaciaException;
import excepciones.LoginIncorrectoException;
import excepciones.UsuarioIncorrectoException;
import ticketSimplificado.TicketSimplificado;

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
	private TicketSimplificado ticketSimpElegido = null;
	private int pasadas=10;

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
	
	public void Login(String usuario, String contrasenia){

		try {
			buscaEmpleado(usuario,contrasenia);
			System.out.println("Login completado.");
		}catch (ContraseniaIncorrectaException e) {
			System.out.println(e.getMessage());
		}
		catch(UsuarioIncorrectoException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Empleado buscaEmpleado(String usuario, String contrasenia)throws UsuarioIncorrectoException,ContraseniaIncorrectaException {
		int i = 0;
		
		while (i < Sistema.getInstancia().getEmpleadosPretensos().size()) {
			if (Sistema.getInstancia().getEmpleadosPretensos().get(i).usuario.compareTo(usuario) == 0) {
				if(Sistema.getInstancia().getEmpleadosPretensos().get(i).contrasenia.compareTo(contrasenia) == 0)
					return Sistema.getInstancia().getEmpleadosPretensos().get(i);
				else
					throw new ContraseniaIncorrectaException();
			}
			i++;		
		}
		throw new UsuarioIncorrectoException();
		
	}
	
	
	public void rondaElecciones(){
		
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
			System.out.println(e.getMessage());
		}
		
	}
	
	private void muestraEmpleadores() throws ListaVaciaException{	
		if(this.lista == null)
			throw new ListaVaciaException("Lista vacia, no hay empleadores seleccionados");
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
		return "Empleado: Nombre y Apellido: " + nya + ticket + ". Puntaje: "+ getPuntaje();
	}


	@Override
	public void run() {
		if(this.pasadas!=0 && ticketSimpElegido==null){
			//Lo llevamos al recurso compartido para que eliga
		}
	}
}
