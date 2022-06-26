package usuariosDelSistema;

import armaTickets.TicketEmpleado;
import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import excepciones.AtributoInvalidoException;
import excepciones.ContraseniaIncorrectaException;
import excepciones.FormularioInvalidoException;
import excepciones.ListaVaciaException;
import excepciones.LoginIncorrectoException;
import excepciones.UsuarioIncorrectoException;
import ticketSimplificado.TicketSimplificado;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Empleado extends Usuario implements Runnable {
	private String nya; //Nombre y Apellido
	private String dni;
	private int telefono;
	private int edad;
	private String ciudad;
	private I_Locacion locacionSimp;
	private String tipoTrabajoSimp;
	private TicketEmpleado ticket;
	private Empleador empleadorSeleccionado;
	private transient TicketSimplificado ticketSimpElegido = null;
	private int pasadas=10;
	private boolean yaEligioEmpleador;

	public Empleado(String usuario, String contrasenia, String nya, String dni, int telefono, int edad, String ciudad) {
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
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

	public TicketSimplificado getTicketSimpElegido() {
		return ticketSimpElegido;
	}

	public void setTicketSimpElegido(TicketSimplificado ticketSimpElegido) {
		this.ticketSimpElegido = ticketSimpElegido;
	}

	public int getPasadas() {
		return pasadas;
	}

	public void setPasadas(int pasadas) {
		this.pasadas = pasadas;
	}
	
	public I_Locacion getLocacionSimp() {
		return locacionSimp;
	}

	public void setLocacionSimp(String locacionSimp)  {
		LocacionFactory locacionFactory=new LocacionFactory();
	    try {
			this.locacionSimp=locacionFactory.getLocacion(locacionSimp);
		} catch (AtributoInvalidoException e) {
			e.printStackTrace();
		}
	}//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

	public String getTipoTrabajoSimp() {
		return tipoTrabajoSimp;
	}

	public void setTipoTrabajoSimp(String tipoTrabajoSimp) {
		this.tipoTrabajoSimp = tipoTrabajoSimp;
	}
	
	
	public void rondaElecciones(Empleador elegido){  //Puede ser que este medio al dope AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		
		this.empleadorSeleccionado = elegido;
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
		return "Nombre y apellido: " + nya + ", DNI: " + dni + ", telefono: " + telefono + ", edad: " + edad + ", ciudad: "
				+ ciudad;
	}

	@Override
	public void run() {
		int j = 1;
		
		while(j <= this.pasadas && this.ticketSimpElegido == null) {
			this.eleccionTicketSimp();
			j++;
			Util.espera();
		}
		
	}
	
	public void eleccionTicketSimp() { // esto es lo que va en BolsaTrabajo para ver si me quedo el ticket que esta en la lista o lo devuelvo
		double respuesta;
		TicketSimplificado t;
	
		t = BolsaTrabajo.getInstancia().sacarTicket(this);
		
		if (t != null) {
			respuesta = this.locacionSimp.versus(t.getLocacionInterfaz());
			
			if (respuesta == 1) { // coinciden las locaciones tambien, procedemos a quedarnos con el ticket
				this.ticketSimpElegido = t;
				t.setEmpleadoContratado(this);
				System.out.println(this.getNya()+" se queda con ticket AAAAAAAAAAAAAAAAAAAA");	
				
			}else { //no coinciden las locaciones, debemos llamar al metodo devuelve ticket y continuar buscando
				System.out.println(this.getNya()+" no encontro ticketBBBBBBBBBBBBBBBB");
				BolsaTrabajo.getInstancia().devolverTicket(this,t);	
			}
		}
		else {
			System.out.println(this.nya +" no encontro tickets en la bolsa");
		}

	} //podemos hacerlo string y que despues de la llamada retorne el string que corresponda a la situacion


}
