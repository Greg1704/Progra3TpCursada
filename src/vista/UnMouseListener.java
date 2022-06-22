package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UnMouseListener implements MouseListener {
	NuevaVentanaFinal v;
	
	public UnMouseListener(NuevaVentanaFinal v) {
		this.v = v;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		//chequear tambien si la agencia se creo, si no, imposible hacer un tipo de ticket
		
		if ((v.rdbtnActivo.isSelected() && !v.rdbtnSuspendido.isSelected() && !v.rdbtnCancelar.isSelected()) || (!v.rdbtnActivo.isSelected() && v.rdbtnSuspendido.isSelected() && !v.rdbtnCancelar.isSelected())
			|| (!v.rdbtnActivo.isSelected() && !v.rdbtnSuspendido.isSelected() && v.rdbtnCancelar.isSelected())) {
			v.setCambiarEstadoTicketEmpleado(true);
		} else
			v.setCambiarEstadoTicketEmpleado(false);
		
		if ((v.rdbtnActivoEmpleador.isSelected() && !v.rdbtnSuspendidoEmpleador.isSelected() && !v.rdbtnCancelarEmpleador.isSelected()) || (!v.rdbtnActivoEmpleador.isSelected() && v.rdbtnSuspendidoEmpleador.isSelected() && !v.rdbtnCancelarEmpleador.isSelected())
				|| (!v.rdbtnActivoEmpleador.isSelected() && !v.rdbtnSuspendidoEmpleador.isSelected() && v.rdbtnCancelarEmpleador.isSelected())) {
				v.setCambiarEstadoTicketEmpleador(true);
			} else
				v.setCambiarEstadoTicketEmpleador(false);
		
		
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