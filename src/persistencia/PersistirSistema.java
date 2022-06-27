package persistencia;

import java.io.IOException;
import java.io.Serializable;

import controlador.Controlador;
import usuariosDelSistema.Sistema;

public class PersistirSistema {
	
	public static void EscrituraSistema() {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		try {
			persistencia.abrirOutput("Agencia.bin");
			SistemaDTO sistema = UtilSistema.sistemaDTOfromSistema();			
			persistencia.escribir(sistema);
			persistencia.cerrarOutput();
			devolverError("Agencia guardada en Sistema\n");
		}catch(IOException e) {
			devolverError("Se guardo mal\n");
		}
		
	}
	
	
	public static void LecturaSistema() {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		try {
			persistencia.abrirInput("Agencia.bin");
			SistemaDTO sistdto = (SistemaDTO) persistencia.leer();
			UtilSistema.sistemafromSistemaDTO(sistdto);			
			persistencia.cerrarInput();
			
			devolverError("Agencia recuperada en Sistema\n");
		}catch (IOException e){
			devolverError("No se pudo recuperar la ventana\n");
        } catch (ClassNotFoundException e){
        	devolverError("No se pudo recuperar la ventana\n");
        }
		
	}
	
	public static void devolverError(String mensaje) {
		Controlador.getInstancia().mensajeErrores(mensaje);
	}
	
}
