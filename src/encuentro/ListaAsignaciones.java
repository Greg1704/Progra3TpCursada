package encuentro;

import java.util.*;
import java.io.Serializable;
import java.time.*;

/**
 * Contiene la lista donde se guardan las instancias de UsuarioyPuntaje junto con la fecha de creacion de la misma.
 * Cada usuario posee un objeto de estos.<br>
 *
 */
public class ListaAsignaciones implements Serializable{
	private ArrayList <UsuarioyPuntaje>ordenados = new ArrayList<UsuarioyPuntaje>();
	private LocalDateTime fecha;

	public ListaAsignaciones() {
		this.fecha = LocalDateTime.now(); 
	}
	
	public ArrayList<UsuarioyPuntaje> getOrdenados() {
		return ordenados;
	}

	public LocalDateTime  getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
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
