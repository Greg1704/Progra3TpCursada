package encuentro;

import usuariosDelSistema.*;

public class UsuarioyPuntaje implements Comparable<UsuarioyPuntaje>{
	private Usuario usuario;
	private double puntaje;
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public double getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}


	public int compareTo(UsuarioyPuntaje o) { //puede haber error aca!!!!!
		if(o.getPuntaje() < puntaje) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
