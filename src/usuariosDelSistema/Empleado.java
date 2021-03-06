package usuariosDelSistema;

import armaTickets.TicketEmpleado;
import calculosAspectosLaborales.I_Locacion;
import calculosAspectosLaborales.LocacionFactory;
import controlador.Controlador;
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


/**
 *Es la clase de empleados, que seran los objetos que se contrataran a durante los procesos de seleccion propuestos por la Agencia
 *
 */
public class Empleado extends Usuario implements Runnable {
	private String nya; //Nombre y Apellido
	private String dni;
	private String telefono;
	private int edad;
	private String ciudad;
	private I_Locacion locacionSimp;
	private String tipoTrabajoSimp;
	private TicketEmpleado ticket;
	private Empleador empleadorSeleccionado;
	private transient TicketSimplificado ticketSimpElegido = null;
	private int pasadas=10;
	private boolean yaEligioEmpleador;

	public Empleado(String usuario, String contrasenia, String nya, String dni, String telefono, int edad, String ciudad) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
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
	}

	public String getTipoTrabajoSimp() {
		return tipoTrabajoSimp;
	}

	public void setTipoTrabajoSimp(String tipoTrabajoSimp) {
		this.tipoTrabajoSimp = tipoTrabajoSimp;
	}
	
	public boolean isYaEligioEmpleador() {
		return yaEligioEmpleador;
	}

	public void setYaEligioEmpleador(boolean yaEligioEmpleador) {
		this.yaEligioEmpleador = yaEligioEmpleador;
	}

	public void rondaElecciones(Empleador elegido){  //Puede ser que este medio al dope AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		
		this.empleadorSeleccionado = elegido;
		this.empleadorSeleccionado.setPuntaje(getPuntaje() + 10); //Suma 10 puntos por estar primero en la lista
		this.setYaEligioEmpleador(true);
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
			devolverError(e.getMessage());
		}
		
	}
	
	private void muestraEmpleadores() throws ListaVaciaException{	
		if(this.lista == null)
			throw new ListaVaciaException("Lista vacia, no hay empleadores seleccionados");
		else {
			for (int i = 0; i < this.lista.getOrdenados().size() ; i++)
				devolverError(this.lista.getOrdenados().get(i).getUsuario().getUsuario() + "\n");
		}
		
	}
	
	/**
	 * Es el constructor de ticket del empleado.<br>
	 * PreCond: no debe mandarse ningun valor negativo y en el caso de las ponderaciones, ademas deben ser numeros enteros. <br>
	 * 
	 */

	public void crearTicket(String locacion, int pesoLocacion, double remuneracion, int pesoRemuneracion, String cargaHoraria, int pesoCargaHoraria,
							String tipoPuestoLaboral, int pesoTipoPuestoLaboral, int edad, int pesoEdad, String experienciaPrevia, int pesoExperienciaPrevia,
							String estudiosCursados, int pesoEstudiosCursados){
		try {
			ticket = new TicketEmpleado(LocalDateTime.now(), locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
					tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
					estudiosCursados, pesoEstudiosCursados);
		} catch (FormularioInvalidoException e) {
			devolverError(e.getMessage());
		}
	}


	@Override
	public String toString() {
		return "Usuario: " + this.getUsuario() + ", Nombre y apellido: " + nya + ", DNI: " + dni + ", telefono: " + telefono + ", edad: " + edad + ", ciudad: "
				+ ciudad + " Locacion " + this.locacionSimp.toString() + " Rubro " + this.tipoTrabajoSimp;
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
	
	
	/**
	 * Metodo que hace el llamado con los thread a la bolsa de trabajo.
	 * 
	 */
	
	public void eleccionTicketSimp() { 
		double respuesta;
		TicketSimplificado t;
	
		t = BolsaTrabajo.getInstancia().sacarTicket(this);
		
		if (t != null) {
			respuesta = this.locacionSimp.versus(t.getLocacionInterfaz());
			
			if (respuesta == 1) { // coinciden las locaciones tambien, procedemos a quedarnos con el ticket
				this.ticketSimpElegido = t;
				t.setEmpleadoContratado(this);	
				mandaStringBolsa(this.getNya()+" se queda con el ticket \n");
				
			}else { //no coinciden las locaciones, debemos llamar al metodo devuelve ticket y continuar buscando
				mandaStringBolsa(this.getNya()+" devuelve ticket ya que no coincide la locacion\n");
				BolsaTrabajo.getInstancia().devolverTicket(this,t);	
			}
		}
		else {
			mandaStringBolsa(this.nya +" no encontro tickets en la bolsa\n");
		}

	}

	public void mandaStringBolsa(String mensaje) {
		Controlador.getInstancia().agregarTextoBolsaSimulacion(mensaje);
	}
	
	public void devolverError(String mensaje) {
		Controlador.getInstancia().mensajeErrores(mensaje);
	}
}
