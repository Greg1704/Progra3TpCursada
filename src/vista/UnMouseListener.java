package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UnMouseListener implements MouseListener {
	ventanaEmpleado v;
	
	public UnMouseListener(ventanaEmpleado v) {
		this.v = v;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		boolean hab1 = v.botonSalud.isSelected() || v.botonComercioLocal.isSelected() || v.botonComercioInternacional.isSelected();
		boolean hab2 = v.botonJunior.isSelected() || v.botonSenior.isSelected() || v.botonManagement.isSelected();
		boolean hab3 = v.botonMenosV1.isSelected() || v.botonEntreV1yV2.isSelected() || v.botonMasV2.isSelected();
		boolean hab = hab1 && hab2 && hab3;
		v.setBotonConfirmarTipoTickets(hab);
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
