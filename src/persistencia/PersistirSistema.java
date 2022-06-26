package persistencia;

import java.io.IOException;
import java.io.Serializable;

import javax.swing.JOptionPane;

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
			JOptionPane.showMessageDialog(null, "Se guardo mal");
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
			JOptionPane.showMessageDialog(null, "Esta pasando algo");
        } catch (ClassNotFoundException e){
        	JOptionPane.showMessageDialog(null, "Esta pasando algo parte 2");
        }
		
	}
	
}
