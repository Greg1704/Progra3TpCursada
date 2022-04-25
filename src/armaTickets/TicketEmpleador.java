package armaTickets;

public class TicketEmpleador extends TicketDeBusqueda {
	private int cantEmpleados;
	private int empleadosObtenidos = 0;
	//hay que agregar tambien un arraylist con los nombres y puntajes de cada empleado que puede quedar
	
	
	public TicketEmpleador(String fechaAlta, FormularioDeBusqueda formulario,int cantEmpleados) {
		super(fechaAlta, formulario);
		this.cantEmpleados = cantEmpleados;
	}
	
	
}
