package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ActionEmpleadoLogin implements ActionListener {
		VentanaRealEmpleado v;
	
	public ActionEmpleadoLogin(VentanaRealEmpleado v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		JOptionPane.showMessageDialog(null, "No se q poner aca");
		System.out.println("Se apretó!");
		v.textFieldUsuario.setText("");
		v.textFieldContrasenia.setText("");
		v.btnConfirmarLogin.setEnabled(false);
	}

}
