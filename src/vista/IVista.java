package vista;

public interface IVista {
	
	public void setControlador(Controlador c);
	public void addActionListener(ActionListener listener);
	static final String añadeEmpleado = "Agregar nuevo empleado";
	static final String añadeEmpleador = "Agregar nuevo empleador";
	static final String añadeAgencia = "Agregar nueva agencia"; // esto es un singleton
	static final String eligeTicket = "Elegir ticket";
	static final String siguienteTicket = "Siguiente ticket";
}
