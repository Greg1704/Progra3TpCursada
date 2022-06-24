package persistencia;

import java.io.Serializable;
import java.util.ArrayList;

import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;

public class SistemaDTO implements Serializable{
	
	private String nombre;
	private ArrayList<Empleado> empleadosPretensos = new ArrayList<Empleado>();
	private ArrayList<Empleador> empleadores = new ArrayList<Empleador>();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Empleado> getEmpleadosPretensos() {
		return empleadosPretensos;
	}
	public void setEmpleadosPretensos(ArrayList<Empleado> empleadosPretensos) {
		this.empleadosPretensos = empleadosPretensos;
	}
	public ArrayList<Empleador> getEmpleadores() {
		return empleadores;
	}
	public void setEmpleadores(ArrayList<Empleador> empleadores) {
		this.empleadores = empleadores;
	}

	
}
