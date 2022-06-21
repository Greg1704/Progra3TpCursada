package vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UnKeyListener implements KeyListener{
		VentanaRealEmpleado v;
		
		public UnKeyListener (VentanaRealEmpleado v) {
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
			boolean hab = !(v.textFieldCrearAgencia.getText().isEmpty());
			v.setBotonConfirmarNombreAgencia(hab);
			
		}
		
		
	
}
