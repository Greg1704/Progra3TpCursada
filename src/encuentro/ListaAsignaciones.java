package encuentro;

import java.util.*;

import java.time.*;

public class ListaAsignaciones {
	private ArrayList <UsuarioyPuntaje>ordenados = new ArrayList<UsuarioyPuntaje>();
	private LocalDateTime fecha;

	public ListaAsignaciones() {
		this.fecha = LocalDateTime.now(); //PUEDE FALLAR
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
