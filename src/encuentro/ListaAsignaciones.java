package encuentro;

import java.util.*;

public class ListaAsignaciones {
	ArrayList <UsuarioyPuntaje>ordenados = new ArrayList<UsuarioyPuntaje>();
	private String fecha;
	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void agregaElemento(UsuarioyPuntaje u) {
		ordenados.add(u);
		Collections.sort(ordenados);
	}
	
	public void eliminaElemento(UsuarioyPuntaje u) {
		ordenados.remove(u);
		Collections.sort(ordenados);
	}

}
