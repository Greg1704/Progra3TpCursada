package vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class UnKeyListener implements KeyListener{
		NuevaVentanaFinal v;
		
		public UnKeyListener (NuevaVentanaFinal v) {
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
			
			boolean hab1 = !(v.textFieldUsuario.getText().isEmpty() || v.textFieldContrasenia.getText().isEmpty());
			v.setBotonConfirmarLogin(hab1);
			
			boolean hab2 = !(v.textFieldCreacionUsuario.getText().isEmpty() || v.textFieldCreacionContrasenia.getText().isEmpty() || v.textFieldCreacionNyA.getText().isEmpty() || v.textFieldDNI.getText()
					.isEmpty() || v.textFieldTelefono.getText().isEmpty() || v.textFieldEdad.getText().isEmpty() || v.textFieldCiudad.getText().isEmpty());
			v.setBotonConfirmacionCreacionUsuario(hab2);
			
			boolean hab3 = !(v.textFieldPesoCargaHoraria.getText().isEmpty() || v.textFieldPesoLocacion.getText().isEmpty() || v.textFieldPesoRemuneracion.getText().isEmpty() || v.textFieldPesoTipoDePuesto.getText().isEmpty());
			
			// ac� viene una referencia del modelo que dice si el usuario est� logueado, entonces har�a un AND con hab3 para asi se 
			
			boolean hab4 = !(v.textFieldUsuarioEmpleador.getText().isEmpty() || v.textFieldContraseniaEmpleador.getText().isEmpty());
			v.setBotonConfirmarLoginEmpleador(hab4);
			
			
 		}
		
		
	
}
