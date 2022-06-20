package vista;

import java.awt.event.ActionListener;

public interface IVista {
	
	//public void setControlador(Controlador c);
	public void addActionListener(ActionListener listener);
	static final String aniadeEmpleado = "Agregar nuevo empleado";
	static final String aniadeEmpleador = "Agregar nuevo empleador";
	static final String aniadeAgencia = "Agregar nueva agencia"; // esto es un singleton
	static final String eligeTicket = "Elegir ticket";
	static final String siguienteTicket = "Siguiente ticket";
}
