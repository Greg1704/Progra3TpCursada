package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioIncorrectoException;
import usuariosDelSistema.*;

public class ActionPerformedBotones implements ActionListener {
		NuevaVentanaFinal v;
		Empleado empleado;
	
	public ActionPerformedBotones(NuevaVentanaFinal v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		
		if (e.getActionCommand().equals(IVista.confirmaCreacionAgencia)) { // ventana Agencia
			
			//chequear si ya existe la agencia o no
			
			v.setTextFieldCrearAgencia("");
			v.setBotonConfirmarNombreAgencia(false);
			
		} else
			if (e.getActionCommand().equals(IVista.confirmaTipoTicket)) {
				//Ta jodido el asunto
				
				
				
			} else { // ventana Empleado
				
				
				if (e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
					
					try {
						empleado.Login(v.getTextFieldCreacionUsuario(), v.getTextFieldCreacionUsuarioEmpleador());
						//caso logueo exitoso, podemos tirar mensaje en pantalla o no AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
						JOptionPane.showMessageDialog(null, "Login Correcto");
						//Hacer lo que haya que hacer para que se desbloquee el resto de la ventana
					}catch (ContraseniaIncorrectaException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());

					}
					catch(UsuarioIncorrectoException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());

					}
					v.setTextFieldCreacionUsuario("");
					v.setTextFieldCreacionContrasenia("");
					v.setBotonConfirmarLogin(false);
						
					
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {
						
						// cuando se cree usuario, buscar en la lista si el usuario ya existe (s�lo buscar por campo de usuario estar�a bien). si no existe, hacer un new empleado
						
						Empleado empleado1 = new Empleado(v.getTextFieldCreacionUsuario(), v.getTextFieldCreacionContrasenia(), v.getTextFieldCreacionNyA(), Integer.parseInt(v.getTextFieldCreacionDNI()), 
								  Integer.parseInt(v.getTextFieldCreacionTelefono()), Integer.parseInt(v.getTextFieldCreacionEdad()), v.getTextFieldCreacionCiudad());
						
						Sistema.getInstancia().agregaEmpleado(empleado1);
					
						v.setTextFieldCreacionUsuario("");
						v.setTextFieldCreacionContrasenia("");
						v.setTextFieldCreacionNyA("");
						v.setTextFieldCreacionDNI("");
						v.setTextFieldCreacionTelefono("");
						v.setTextFieldCreacionEdad("");
						v.setTextFieldCreacionCiudad("");
						v.setBotonConfirmacionCreacionUsuario(false);
						
					} else
						if (e.getActionCommand().equals(IVista.confirmaCreacionTicket)) {
							String comboBoxOpcion =  v.getComboBoxLocacion();
							
							comboBoxOpcion = v.getComboBoxBolsaTipoTrabajo();
							
							comboBoxOpcion = v.getComboBoxCargaHoraria();
							
							comboBoxOpcion = v.getComboBoxEstudiosCursados();
							
							comboBoxOpcion = v.getComboBoxExperienciaPrevia();
							
							//comboBoxOpcion = v.getComboBoxRangoEtario();
							
							//comboBoxOpcion = v.getComboBoxRemuneracion();
							//crear el ticket LocalDateTime.now()
							
							empleado.crearTicket(comboBoxOpcion, 0, 0, 0, comboBoxOpcion, 0, comboBoxOpcion, 0, 0, 0, comboBoxOpcion, 0, comboBoxOpcion, 0);
							
					}
			} 
	}
}
		
