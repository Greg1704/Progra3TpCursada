package armaTickets;

import java.time.LocalDateTime;

public class TicketEmpleador extends TicketDeBusqueda {
	private int cantEmpleados;
	private int empleadosObtenidos = 0;
	
	
	
	public TicketEmpleador(LocalDateTime fechaAlta, FormularioDeBusqueda formulario,int cantEmpleados) {
		super(fechaAlta, formulario);
		this.cantEmpleados = cantEmpleados;
	}


	public int getCantEmpleados() {
		return cantEmpleados;
	}


	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}


	public int getEmpleadosObtenidos() {
		return empleadosObtenidos;
	}


	public void setEmpleadosObtenidos(int empleadosObtenidos) {
		this.empleadosObtenidos = empleadosObtenidos;
	}
	
	
}
