package persistencia;

import usuariosDelSistema.Sistema;

public class UtilSistema {
	
	public static SistemaDTO sistemaDTOfromSistema() {
		SistemaDTO copiaSist = new SistemaDTO();
		copiaSist.setNombre(Sistema.getInstancia().getNombre());
		copiaSist.setEmpleadores(Sistema.getInstancia().getEmpleadores());
		copiaSist.setEmpleadosPretensos(Sistema.getInstancia().getEmpleadosPretensos());
		
		return copiaSist;	
	}
	
	public static void sistemafromSistemaDTO(SistemaDTO sist) {
		Sistema.getInstancia().setNombre(sist.getNombre());
		Sistema.getInstancia().setEmpleadosPretensos(sist.getEmpleadosPretensos());
		Sistema.getInstancia().setEmpleadores(sist.getEmpleadores());
	}
	
}