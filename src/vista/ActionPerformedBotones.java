package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioIncorrectoException;
import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;
import usuariosDelSistema.Sistema;

public class ActionPerformedBotones implements ActionListener {
		NuevaVentanaFinal v;
		Empleado empleado;
		Empleador empleador;
	
	public ActionPerformedBotones(NuevaVentanaFinal v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		
		if (e.getActionCommand().equals(IVista.confirmaCreacionAgencia)) { // ventana Agencia
			
			//chequear si ya existe la agencia o no
			
			v.setTextFieldCrearAgencia("");
			v.setBtnConfirmarNombreAgencia(false);
			
		} else
			if (e.getActionCommand().equals(IVista.confirmaTipoTicket)) {
				//Ta jodido el asunto
				
				
				//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA FALTA HACER LO DE RONDA ENCUENTRO Y RONDA CONTRATACIONES
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

						
					
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
						
						// cuando se cree usuario, buscar en la lista si el usuario ya existe (s�lo buscar por campo de usuario estar�a bien). si no existe, hacer un new empleado
						
						Empleado empleado1 = new Empleado(v.getTextFieldCreacionUsuario(), v.getTextFieldCreacionContrasenia(), v.getTextFieldCreacionNyA(), v.getTextFieldCreacionDNI(), 
								  Integer.parseInt(v.getTextFieldCreacionTelefono()), v.getTextFieldCreacionEdad(), v.getTextFieldCreacionCiudad());
						//Cambiar getTextFieldCreacionTelefono() a Integer
						
						Sistema.getInstancia().agregaEmpleado(empleado1);
					 
						
					} else
						if (e.getActionCommand().equals(IVista.confirmaCreacionTicket)) { //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
							
							empleado.crearTicket( v.getComboBoxLocacion(), v.getTextFieldPesoLocacion(), v.getTextFieldRemuneracion(), v.getTextFieldPesoRemuneracion(), 
									v.getComboBoxCargaHoraria(), v.getTextFieldPesoCargaHoraria(), v.getComboBoxTipoDePuesto(),v.getTextFieldPesoTipoDePuesto() , v.getTextFieldCreacionEdad(), 1, 
									v.getComboBoxExperienciaPrevia(), 1, v.getComboBoxEstudiosCursados(), 1);
							
					}else
						if(e.getActionCommand().equals(IVista.confirmaEstadoTicket)) {
							if(v.getRdbtnActivo()) 
								JOptionPane.showMessageDialog(null,empleado.getTicket().activa());
							else if(v.getRdbtnSuspendido())
								JOptionPane.showMessageDialog(null,empleado.getTicket().suspende());
							else if(v.getRdbtnCancelar()) 
								JOptionPane.showMessageDialog(null,empleado.getTicket().cancela());
							
							//Creo que nada mas
						}else
							if(e.getActionCommand().equals(IVista.confirmaEleccionEmpleado)) {
								empleado.rondaElecciones(v.getListRondaEleccionesEmpleado());
							}
			} 
	}

    
     void seleccionarEmpleados(Empleador e) {
     for (Empleado empleado: this.v.getListRondaEleccionesEmpleador()) { //hago un foreach de los que se selecciona con el mouse y los agrego a la lista
    	e.getEmpleadosSeleccionados().add(empleado); 
	}
    	
    }
    			
}

