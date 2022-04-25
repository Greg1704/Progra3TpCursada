package armaTickets;

import java.time.LocalDateTime;

public class TicketEmpleado extends TicketDeBusqueda {
	private boolean resultado;

	public TicketEmpleado(LocalDateTime fechaAlta, FormularioDeBusqueda formulario) {
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
