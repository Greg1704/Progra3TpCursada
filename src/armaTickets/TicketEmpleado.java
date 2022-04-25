package armaTickets;

public class TicketEmpleado extends TicketDeBusqueda {
	private boolean resultado;

	public TicketEmpleado(String fechaAlta, FormularioDeBusqueda formulario) {
		super(fechaAlta, formulario);
		this.resultado = false;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	
}
