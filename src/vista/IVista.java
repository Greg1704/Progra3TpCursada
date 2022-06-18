package vista;

public interface IVista {
	
	public void setControlador(Controlador c);
	public void addActionListener(ActionListener listener);
	static final String a�adeEmpleado = "Agregar nuevo empleado";
	static final String a�adeEmpleador = "Agregar nuevo empleador";
	static final String a�adeAgencia = "Agregar nueva agencia"; // esto es un singleton
	static final String eligeTicket = "Elegir ticket";
	static final String siguienteTicket = "Siguiente ticket";
}
