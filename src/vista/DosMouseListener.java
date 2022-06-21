package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class DosMouseListener implements MouseListener {
	VentanaRealEmpleado v;
	
	public DosMouseListener(VentanaRealEmpleado v) {
		this.v = v;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		boolean hab = v.btnConfirmarLogin.isSelected();
		if (hab) {
			JOptionPane.showMessageDialog(null, "te equivocaste facha");
			System.out.println("Se acciono el boton");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
