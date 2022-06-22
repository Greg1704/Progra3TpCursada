package vista;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UnItemListener implements ItemListener{
		VentanaFinal v;
		boolean hab;
		
		public UnItemListener() {
			
		}

		@Override
		public void itemStateChanged(ItemEvent e) {

			v.comboBoxBolsaLocacion.is
			
			String s1 = (String) v.comboBoxBolsaLocacion.getSelectedItem();
			String s2 = (String) v.comboBoxBolsaTipoTrabajo.getSelectedItem();
			String s3 = (String) v.comboBoxCargaHoraria.getSelectedItem();
			String s4 = (String) v.comboBoxEstudiosCursados.getSelectedItem();
			String s5 = (String) v.comboBoxExperienciaPrevia.getSelectedItem();
			String s6 = (String) v.comboBoxRangoEtario.getSelectedItem();
			String s7 = (String) v.comboBoxTipoDePuesto.getSelectedItem();
			
			if (s1.length()>1 && s2.length()>1 && s3.length()>1 && s4.length()>1 && s5.length()>1 && s6.length()>1 && s7.length()>1) {
				hab = true;
			} else
			    hab = false;
			v.setBotonConfirmarCreacionTicket(hab, hab);
		}
		

}
