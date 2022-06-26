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
			JOptionPane.showMessageDialog(null, "Agencia guardada en Sistema");
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Se guardo mal");
		}
		
	}
	
	
	public static void LecturaSistema() {
		IPersistencia<Serializable> persistencia = new PersistenciaBIN();
		
		try {
			persistencia.abrirInput("Agencia.bin");
			SistemaDTO sistdto = (SistemaDTO) persistencia.leer();
			UtilSistema.sistemafromSistemaDTO(sistdto);			
			persistencia.cerrarInput();
			
			JOptionPane.showMessageDialog(null, "Agencia recuperada en Sistema");
		}catch (IOException e){
			JOptionPane.showMessageDialog(null, "Esta pasando algo");
        } catch (ClassNotFoundException e){
        	JOptionPane.showMessageDialog(null, "Esta pasando algo parte 2");
        }
		
	}
	
}
