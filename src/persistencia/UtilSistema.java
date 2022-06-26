package persistencia;

import usuariosDelSistema.Sistema;

public class UtilSistema {
	
	public static SistemaDTO sistemaDTOfromSistema() {
		SistemaDTO copiaSist = new SistemaDTO();
		copiaSist.setNombre(Sistema.getInstancia().getNombre());
		copiaSist.setEncuentroHecho(Sistema.getInstancia().isEncuentroHecho());
		copiaSist.setEmpleadores(Sistema.getInstancia().getEmpleadores());
		copiaSist.setEmpleadosPretensos(Sistema.getInstancia().getEmpleadosPretensos());
		
		return copiaSist;	
	}
	
	public static void sistemafromSistemaDTO(SistemaDTO sist) {
		Sistema sistema = Sistema.getInstancia();
	
		sistema.setNombre(sist.getNombre());
		sistema.setEncuentroHecho(sist.isEncuentroHecho());
		sistema.setEmpleadosPretensos(sist.getEmpleadosPretensos());
		sistema.setEmpleadores(sist.getEmpleadores());
	}
	
}