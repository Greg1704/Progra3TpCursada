package estadoTicket;

import java.io.Serializable;

import excepciones.NoActivoException;

public interface I_EstadoTicket extends Serializable{
	
	public String activa();
	
	public String suspende();
	
	public String cancela();
	
	public String finaliza();
	
	public void esActivo() throws NoActivoException;

}
