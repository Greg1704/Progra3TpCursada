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

@SuppressWarnings("deprecation")
public class Empleado extends Usuario implements Observer,Runnable {
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
	private transient BolsaDeTrabajo bolsa = BolsaDeTrabajo.getInstancia();

	public Empleado(String usuario, String contrasenia, String nya, String dni, int telefono, int edad, String ciudad) {
		super(usuario, contrasenia);
		this.nya = nya;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.ciudad = ciudad;
		bolsa.addObserver(this);
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
		return "Empleado: Nombre y Apellido: " + nya + ticket + ". Puntaje: "+ getPuntaje();
	}

	@Override
	public void update(Observable o, Object arg) { // aca va a entrar si se eligio un ticket
		//Hacer que al emopleado le salte una ventana emergente para elegir si lo acepta o no
		//En el update de empleador se le suspende el Ticket normal(Consultar a grego o tomi)
		/*
			Muestra el ticket para que el empleado haga su eleccion
			Y modifica los boolean descartado y eleccion en curso
		* */

		this.bolsa.setEleccionEnCurso(false);
	}

	@Override
	public void run() {
		int j = 0;
		
		while(j <= this.pasadas && this.ticketSimpElegido == null) {
			BolsaTrabajo.getInstancia().sacarTicket(this);
			j++;
			Util.espera();
		}
		
	}
	
	public void eleccionTicketSimp(ArrayList tickets) { // esto es lo que va en BolsaTrabajo para ver si me quedo el ticket que esta en la lista o lo devuelvo
		double respuesta;
		TicketSimplificado t;
		int i;
		
		i = 0;
		
		while i <= 
		
		
		
		
			respuesta = this.locacionSimp.versus(t.getLocacionInterfaz());
		
			if (respuesta == 1) { // coinciden las locaciones tambien, procedemos a quedarnos con el ticket
				this.ticketSimpElegido = t;
				System.out.println(this.getNya()+" se queda con ticket");
				//return "El empleado "+this.getNya()+" reclamo el ticket de "+ +".";
			}else { //no coinciden las locaciones, debemos llamar al metodo devuelve ticket y continuar buscando
				System.out.println(this.getNya()+" devuelve ticket");
				BolsaTrabajo.getInstancia().devolverTicket(this,t);
				//return "El empleado "+this.getNya()+" quiso reclamar el ticket "++" pero no coincidian las locaciones.";
			}

	} //podemos hacerlo string y que despues de la llamada retorne el string que corresponda a la situacion


}
