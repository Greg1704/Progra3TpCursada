package vista;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UnListSelectionListener implements ListSelectionListener {
		VentanaFinal v;
	
	public UnListSelectionListener(VentanaFinal v) {
		this.v = v;
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		boolean hab = !(v.listRondaEleccionesEmpleado.isSelectionEmpty());
			v.setBotonConfirmacionEleccionEmpleado(hab);
			
	/*	boolean hab1 = !(v.listTicketSimpActual.isSelectionEmpty());
			v.setBotonAceptarYRechazarTicketSimplificado(hab);
			*/
		boolean hab2 = !(v.listRondaEleccionesEmpleador.isSelectionEmpty());
			v.setBotonConfirmacionEleccionEmpleador(hab2);
	}

}
