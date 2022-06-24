package armaTickets;

import excepciones.FormularioInvalidoException;
import excepciones.NoActivoException;

import java.time.LocalDateTime;

public class TicketEmpleador extends TicketDeBusqueda{
	private int cantEmpleados;
	private int empleadosObtenidos = 0;
	
	public TicketEmpleador(LocalDateTime fechaAlta,String locacion,int pesoLocacion, double remuneracion, int pesoRemuneracion,String cargaHoraria,int pesoCargaHoraria,
						   String tipoPuestoLaboral,int pesoTipoPuestoLaboral, int edad,int pesoEdad, String experienciaPrevia,int pesoExperienciaPrevia,
						   String estudiosCursados,int pesoEstudiosCursados,int cantEmpleados) throws FormularioInvalidoException {
		super(fechaAlta,locacion, pesoLocacion,  remuneracion,  pesoRemuneracion, cargaHoraria, pesoCargaHoraria,
				tipoPuestoLaboral, pesoTipoPuestoLaboral,  edad, pesoEdad,  experienciaPrevia, pesoExperienciaPrevia,
				estudiosCursados, pesoEstudiosCursados);
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

	@Override
	public void esActivo() throws NoActivoException {
		this.estado.esActivo();
	}

}
