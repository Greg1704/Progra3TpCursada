package encuentro;

import java.io.Serializable;

import usuariosDelSistema.*;

/**
 * Es una clase que contiene un empleado y un puntaje, el cual fue asignado en base a los cruces que se dan en la ronda de encuentros.<br>
 *
 */
public class UsuarioyPuntaje implements Comparable<UsuarioyPuntaje>,Serializable{
	private Usuario usuario;
	private double puntaje;
	
	/**
	 * @author Grupo4 <br>
	 * PreCond: <b> usuario </b> debe ser un usuario valido <br>
	 */
	
	public UsuarioyPuntaje(Usuario usuario) {
		this.usuario = usuario;
		this.puntaje = 0;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public double getPuntaje() {
		return puntaje;
	}


	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}


	
	public int compareTo(UsuarioyPuntaje o) { 
		if(o.getPuntaje() < puntaje) {
			return 1;
		}
		else 
			return -1;
	}

	@Override
	public String toString() {
		return "Usuario: "+ usuario + " puntaje: " + puntaje;
	}
	
	

}
