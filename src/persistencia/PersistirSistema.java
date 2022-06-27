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
			devolverError("Esta pasando algo\n");
        } catch (ClassNotFoundException e){
        	devolverError("Esta pasando algo parte 2\n");
        }
		
	}
	
	public static void devolverError(String mensaje) {
		Controlador.getInstancia().mensajeErrores(mensaje);
	}
	
}
