package vista;

import java.awt.event.ActionListener;

public interface IVista {
	
	//ventana arranca directamente desde main de ventana
	
	// botones de ventana agencia
	
	static final String confirmaTicket = "Confirmar tipos de tickets";
	static final String confirmaCreacionAgencia = "Confirmar creacion de agencia";
	
	// botones de ventana empleado
	
	static final String confirmaLoginUsuario = "Confirma login de usuario";
	static final String confirmaCreacionUsuario = "Confirma creacion de usuario";
	static final String confirmaCreacionTicket = "Confirma creacion de ticket";
	static final String confirmaEstadoTicket = "Confirma estado de ticket";
	static final String confirmaEleccionEmpleado = "Confirma eleccion del empleado";
	static final String confirmaAceptacionTicket = "Confirma aceptacion de un TS";
	static final String confirmaRechazoTicket = "Confirma rechazo de un TS";
	static final String confirmaArranqueBDT = "Confirma arranque de BDT";
	
	// botones de ventana empleador
	
	static final String confirmarLoginEmpleador = "confirma login de empleador";
	static final String confirmacionCreacionUsuario_1 = "confirma creacion de empleador";
	static final String confirmacionCreacionTicket_1 = "confirma creacion de ticket de empleador";
	static final String confirmaCambiorEstadoEmpleador = "Confirma cambio de estado de ticket de empleador";
	static final String confirmacionEleccionEmpleador = "Confirma eleccion del empleador";
	static final String confirmaCracionTicketSimplificado = "Confirma la creacion de un TS";
	
}
