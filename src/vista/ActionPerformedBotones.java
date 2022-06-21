package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

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
			if (e.getActionCommand().equals(IVista.confirmaTicket)) {
				
				
				
				
			} else // ventana Empleado
				
				
				if (e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
					
					
					v.textFieldUsuario.setText("");
					v.textFieldContrasenia.setText("");
					v.btnConfirmarLogin.setEnabled(false);
					//if logeo exitoso : JOptionPane.showMessageDialog(null, "No se q poner aca");
					
					
					
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {
						
						// cuando se cree usuario, buscar en la lista si el usuario ya existe (sólo buscar por campo de usuario estaría bien). si no existe, hacer un new empleado
						
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
		
