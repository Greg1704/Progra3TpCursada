package vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DosKeyListener implements KeyListener{
		VentanaRealEmpleado v;
		
		public DosKeyListener (VentanaRealEmpleado v) {
			this.v = v;
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			boolean hab1 = !(v.textFieldUsuario.getText().isEmpty() || v.textFieldContrasenia.getText().isEmpty());
			v.setBotonConfirmarLogin(hab1);
			
			boolean hab2 = !(v.textFieldCreacionUsuario.getText().isEmpty() || v.textFieldCreacionContrasenia.getText().isEmpty() || v.textFieldCreacionNyA.getText().isEmpty() || v.textFieldDNI.getText()
					.isEmpty() || v.textFieldTelefono.getText().isEmpty() || v.textFieldEdad.getText().isEmpty() || v.textFieldCiudad.getText().isEmpty());
			v.setBotonConfirmacionCreacionUsuario(hab2);
			
		}
		
		
	
}
