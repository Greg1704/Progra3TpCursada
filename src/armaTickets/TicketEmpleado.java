package armaTickets;

import excepciones.FormularioInvalidoException;
import excepciones.NoActivoException;

import java.time.LocalDateTime;

public class TicketEmpleado extends TicketDeBusqueda {
	private boolean resultado;

	public TicketEmpleado(LocalDateTime fechaAlta, String locacion,int pesoLocacion, double remuneracion, int pesoRemuneracion,String cargaHoraria,int pesoCargaHoraria,
						  String tipoPuestoLaboral,int pesoTipoPuestoLaboral, int edad,int pesoEdad, String experienciaPrevia,int pesoExperienciaPrevia,
						  String estudiosCursados,int pesoEstudiosCursados) throws FormularioInvalidoException {
		super(fechaAlta, locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
				tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
				estudiosCursados, pesoEstudiosCursados);
		this.resultado = false;
	}

	public boolean isResultado() {
		return resultado;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public void esActivo() throws NoActivoException {
		this.estado.esActivo();
	}


}
