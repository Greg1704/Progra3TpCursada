package persistencia;

import java.io.IOException;
import java.io.Serializable;

import usuariosDelSistema.Sistema;

public class PersistirSistema {
	
	public static void EscrituraSistema() {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		try {
			persistencia.abrirOutput("Agencia.bin");
			SistemaDTO sistema = UtilSistema.sistemaDTOfromSistema();
			
			persistencia.escribir(sistema);
			System.out.println("Se grabo bien");
			persistencia.cerrarOutput();
			
		}catch(IOException e) {
			//DEBERIAMOS PONER UN CARTELITO QUE AVISE SI NO SE PUDO HACER
		}
		
	}
	
	
	public static void LecturaSistema() {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		try {
			persistencia.abrirInput("Sistema.bin");
			SistemaDTO sistdto = (SistemaDTO) persistencia.leer();
			UtilSistema.sistemafromSistemaDTO(sistdto);
			
			System.out.println("Se recupero sistema");
			persistencia.cerrarInput();
			System.out.println("Termino con exito");
			
		}catch (IOException e){
			
        } catch (ClassNotFoundException e){
        	
        }
		
	}
	
}
