package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionPerformedBotones implements ActionListener {
		VentanaFinal v;
	
	public ActionPerformedBotones(VentanaFinal v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		
		if (e.getActionCommand().equals(IVista.confirmaCreacionAgencia)) { // ventana Agencia
			System.out.println("Lo ejecuta bien");
			
			//chequear si ya existe la agencia o no
			
			v.textFieldCrearAgencia.setText("");
			v.setBotonConfirmarNombreAgencia(false);
		} else
			if (e.getActionCommand().equals(IVista.confirmaTicket)) {
				System.out.println("bien");
			} else // ventana Empleado
				if (e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
					v.textFieldUsuario.setText("");
					v.textFieldContrasenia.setText("");
					v.btnConfirmarLogin.setEnabled(false);
					//if logeo exitoso : JOptionPane.showMessageDialog(null, "No se q poner aca");
					
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {
						v.textFieldCreacionUsuario.setText("");
						v.textFieldCreacionContrasenia.setText("");
						v.textFieldCreacionNyA.setText("");
						v.textFieldDNI.setText("");
						v.textFieldTelefono.setText("");
						v.textFieldEdad.setText("");
						v.textFieldCiudad.setText("");
					} else
						if (e.getActionCommand().equals(IVista.confirmaCreacionTicket)) {
							v.comboBoxBolsaLocacion.setEnabled(false);
					}
	}
}
		
