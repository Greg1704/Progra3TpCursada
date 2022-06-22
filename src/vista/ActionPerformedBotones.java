package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioIncorrectoException;
import usuariosDelSistema.*;

public class ActionPerformedBotones implements ActionListener {
		VentanaFinal v;
		Empleado empleado;
	
	public ActionPerformedBotones(VentanaFinal v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		
		if (e.getActionCommand().equals(IVista.confirmaCreacionAgencia)) { // ventana Agencia
			
			//chequear si ya existe la agencia o no
			
			v.textFieldCrearAgencia.setText("");
			v.setBotonConfirmarNombreAgencia(false);
			
		} else
			if (e.getActionCommand().equals(IVista.confirmaTipoTicket)) {
				//Ta jodido el asunto
				
				
				
			} else { // ventana Empleado
				
				
				if (e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
					
					try {
						empleado.Login(v.textFieldCreacionUsuario.getText(), v.textFieldCreacionUsuarioEmpleador.getText());
						//caso logueo exitoso, podemos tirar mensaje en pantalla o no AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
						JOptionPane.showMessageDialog(null, "Login Correcto");
						//Hacer lo que haya que hacer para que se desbloquee el resto de la ventana
					}catch (ContraseniaIncorrectaException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());

					}
					catch(UsuarioIncorrectoException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());

					}
					v.textFieldUsuario.setText("");
					v.textFieldContrasenia.setText("");
					v.btnConfirmarLogin.setEnabled(false);
						
					
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {
						
						// cuando se cree usuario, buscar en la lista si el usuario ya existe (s�lo buscar por campo de usuario estar�a bien). si no existe, hacer un new empleado
						
						Empleado empleado1 = new Empleado(v.textFieldCreacionUsuario.getText(), v.textFieldCreacionContrasenia.getText(), v.textFieldCreacionNyA.getText(), Integer.parseInt(v.textFieldDNI.getText()), 
								  Integer.parseInt(v.textFieldTelefono.getText()), Integer.parseInt(v.textFieldEdad.getText()), v.textFieldCiudad.getText());
						
						Sistema.getInstancia().agregaEmpleado(empleado1);
					
						v.textFieldCreacionUsuario.setText("");
						v.textFieldCreacionContrasenia.setText("");
						v.textFieldCreacionNyA.setText("");
						v.textFieldDNI.setText("");
						v.textFieldTelefono.setText("");
						v.textFieldEdad.setText("");
						v.textFieldCiudad.setText("");
						v.btnConfirmacionCreacionUsuario.setEnabled(false);
						
						
						
					} else
						if (e.getActionCommand().equals(IVista.confirmaCreacionTicket)) {
							v.comboBoxBolsaLocacion.setEnabled(false);
					}
			} 
	}
}
		
