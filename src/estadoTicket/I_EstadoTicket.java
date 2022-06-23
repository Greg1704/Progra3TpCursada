package estadoTicket;

import java.io.Serializable;

public interface I_EstadoTicket extends Serializable{
	
	public String activa();
	
	public String suspende();
	
	public String cancela();
	
	public String finaliza();

}
