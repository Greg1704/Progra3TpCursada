package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import armaTickets.TicketEmpleado;
import armaTickets.TicketEmpleador;
import encuentro.ListaAsignaciones;
import excepciones.AtributoInvalidoException;
import excepciones.ContraseniaIncorrectaException;
import excepciones.UsuarioIncorrectoException;
import ticketSimplificado.TicketSimplificado;
import usuariosDelSistema.BolsaTrabajo;
import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;
import usuariosDelSistema.EmpleadorFisico;
import usuariosDelSistema.EmpleadorJuridico;
import usuariosDelSistema.Sistema;
import vista.IVista;
import vista.NuevaVentanaFinal;

public class Controlador implements ActionListener {
		NuevaVentanaFinal v;
		Empleado empleado;
		Empleador empleador;
		Sistema sistema=null;
		BolsaTrabajo bolsa=BolsaTrabajo.getInstancia();
		private static Controlador instancia = null;
	
	private Controlador() {
		this.v = new NuevaVentanaFinal();
		this.v.setControlador(this);
	}
	
	public static Controlador getInstancia() {
		if (instancia == null)
			instancia = new Controlador();
		return instancia;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// aca se cruzan los datos con los datos del sistema para ver si el logeo esta bien o no, e iria con un if
		
		if (e.getActionCommand().equals(IVista.confirmaCreacionAgencia)) { // ventana Agencia
			if (sistema!=null) {
				JOptionPane.showMessageDialog(null, "La agencia ya existe");
			} else  {
				// crear la agencia	
				sistema = Sistema.getInstancia();
				sistema.setNombre(v.getTextFieldCrearAgencia());
				v.AdminLogueado(true);
			}
			v.setTextFieldCrearAgencia("");
			v.setBtnConfirmarNombreAgencia(false);
		} else
			if (e.getActionCommand().equals(IVista.arrrancaRondaDeEncuentro)) { //HACER PARTE VENTANA
				sistema.busquedaLaboral();
				if(empleado != null)
					v.ActualizarListaRondaEleccionesEmpleado();
				if(empleador != null)
					v.ActualizarListaRondaEleccionesEmpleador();
				
		}else
			if(e.getActionCommand().equals(IVista.arrrancaRondaDeContrataciones)) { //HACER PARTE VENTANA
				sistema.rondaDeContrataciones();
				
		}else
			if(e.getActionCommand().equals(IVista.arrrancaRondaDeContrataciones)){  //ESTO TIENE QUE SER CAMBIADO POR BOLSA DU TRBAJO AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
					v.ActualizarBolsaTicketsSimp();
					for(int i=0;i<sistema.getEmpleadosPretensos().size();i++) {
						new Thread(sistema.getEmpleadosPretensos().get(i)).start();
					}
			}else { // VENTANA EMPLEADO
				
				
				if (e.getActionCommand().equals(IVista.confirmaLoginUsuario)) {
					try {
						
						empleado=sistema.LoginEmpleado(v.getTextFieldUsuario(), v.getTextFieldContrasenia());  //Falta alguna referencia a la que apunte la variable empleado
						JOptionPane.showMessageDialog(null, "Login Correcto");
						v.EmpleadoLogeado(true);
					}catch (ContraseniaIncorrectaException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
						v.EmpleadoLogeado(false);
					}
					catch(UsuarioIncorrectoException ex) {
						JOptionPane.showMessageDialog(null, ex.getMessage());
						v.EmpleadoLogeado(false);
					}

				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionUsuario)) {//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
						
						// cuando se cree usuario, buscar en la lista si el usuario ya existe (s�lo buscar por campo de usuario estar�a bien). si no existe, hacer un new empleado
						
						Empleado empleado1 = new Empleado(v.getTextFieldCreacionUsuario(), v.getTextFieldCreacionContrasenia(), v.getTextFieldCreacionNyA(), v.getTextFieldCreacionDNI(), 
								  v.getTextFieldCreacionTelefono(), v.getTextFieldCreacionEdad(), v.getTextFieldCreacionCiudad());
						//Cambiar getTextFieldCreacionTelefono() a Integer
						
						sistema.agregaEmpleado(empleado1);
						v.ActualizarListaEmpleados();
					 
						
				} else
					if (e.getActionCommand().equals(IVista.confirmaCreacionTicket)) { //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
							
						empleado.crearTicket( v.getComboBoxLocacion(), v.getTextFieldPesoLocacion(), v.getTextFieldRemuneracion(), v.getTextFieldPesoRemuneracion(), 
							v.getComboBoxCargaHoraria(), v.getTextFieldPesoCargaHoraria(), v.getComboBoxTipoDePuesto(),v.getTextFieldPesoTipoDePuesto() , empleado.getEdad(), 1, 
							v.getComboBoxExperienciaPrevia(), 1, v.getComboBoxEstudiosCursados(), 1);
							
						v.ActualizarListaTicketActualEmpleado();
				}else
					if(e.getActionCommand().equals(IVista.confirmaEstadoTicket)) {
						System.out.println("entra aca");
						if(v.getRdbtnActivo()) {
							JOptionPane.showMessageDialog(null,empleado.getTicket().activa());
							v.ActualizarListaTicketActualEmpleado();
						}
						else if(v.getRdbtnSuspendido()) {
							JOptionPane.showMessageDialog(null,empleado.getTicket().suspende());
							v.ActualizarListaTicketActualEmpleado();
						}
						else if(v.getRdbtnCancelar())  {
							JOptionPane.showMessageDialog(null,empleado.getTicket().cancela());
							v.ActualizarListaTicketActualEmpleado();
						}
							
						//Creo que nada mas
				}else
					if(e.getActionCommand().equals(IVista.confirmaEleccionEmpleado)) {
						empleado.rondaElecciones(v.getListRondaEleccionesEmpleado());						
					}else    // VENTANA EMPLEADOR
						if(e.getActionCommand().equals(IVista.confirmarLoginEmpleador)) {
							try {
								empleador=sistema.LoginEmpleador(v.getTextFieldUsuarioEmpleador(), v.getTextFieldContraseniaEmpleador()); //Falta alguna referencia a la que apunte la variable empleado
								JOptionPane.showMessageDialog(null, "Login Correcto");
								v.EmpleadorLogeado(true);
							}
							catch (ContraseniaIncorrectaException ex) {
								JOptionPane.showMessageDialog(null, ex.getMessage());
								v.EmpleadorLogeado(false);
							}
							catch(UsuarioIncorrectoException ex) {
								JOptionPane.showMessageDialog(null, ex.getMessage());
								v.EmpleadorLogeado(false);
							}
					}else
						if(e.getActionCommand().equals(IVista.confirmacionCreacionUsuarioEmpleador)) {
							Empleador empleador1;
							if(v.getComboBoxTipoPersonaEmpleador().equals("Fisico")) {
								empleador1 = new EmpleadorFisico(v.getTextFieldCreacionUsuarioEmpleador(),v.getTextFieldCreacionContraseniaEmpleador(),v.getTextFieldCreacionNombreEmpleador(),v.getComboBoxRubroEmpleador());
							}else {
								empleador1 = new EmpleadorJuridico(v.getTextFieldCreacionUsuarioEmpleador(),v.getTextFieldCreacionContraseniaEmpleador(),v.getTextFieldCreacionNombreEmpleador(),v.getComboBoxRubroEmpleador());
							} 
							sistema.agregaEmpleador(empleador1);
							v.ActualizarListaEmpleadores();
					}else
						if(e.getActionCommand().equals(IVista.confirmacionCreacionTicketEmpleador)) {
							String aux = v.getComboBoxRangoEtarioEmpleador();
							int auxNumerico=0;
							switch(aux) {  						//Switch hecho para adaptar la decisión del empleador sobre el Rango etario a un valor numerico para que luego se cree la instancia correctamente
								case "Menos de 40": auxNumerico=39;
								case "Entre 40 y 50": auxNumerico=45;
								case "Mas de 50": auxNumerico= 51;
							}
							
							empleador.crearTicket(v.getComboBoxLocacionEmpleador(), v.getTextFieldPesoLocacionEmpleador(), v.getTextFieldRemuneracionEmpleador(), v.getTextFieldPesoRemuneracionEmpleador(), 
									v.getComboBoxCargaHorariaEmpleador(), v.getTextFieldPesoCargaHorariaEmpleador(), v.getComboBoxTipoDePuestoEmpleador(), v.getTextFieldPesoTipoDePuestoEmpleador(),
									auxNumerico, v.getTextFieldPesoRangoEtarioEmpleador(), v.getComboBoxExperienciaPrevia(), v.getTextFieldPesoExpPreviaEmpleador(), v.getComboBoxEstudiosCursadosEmpleador(),
									v.getTextFieldPesoEstudiosCursadosEmpleador(), v.getTextFieldCantEmpleadosBuscados());
							
							v.ActualizarListaTicketActualEmpleador();
					}else
						if(e.getActionCommand().equals(IVista.confirmaCambioEstadoEmpleador)) {
							if(v.getRdbtnActivo()) {
								JOptionPane.showMessageDialog(null,empleador.getTicketEmpleador().activa());
								v.ActualizarListaTicketActualEmpleador();
							}
							else if(v.getRdbtnSuspendido()) {
								JOptionPane.showMessageDialog(null,empleador.getTicketEmpleador().suspende());
								v.ActualizarListaTicketActualEmpleador();
							}
							else if(v.getRdbtnCancelar()) {
								JOptionPane.showMessageDialog(null,empleador.getTicketEmpleador().cancela());
								v.ActualizarListaTicketActualEmpleador();
							}
					}else
						if(e.getActionCommand().equals(IVista.confirmacionEleccionEmpleador)) {
							empleador.rondaElecciones(v.getListRondaEleccionesEmpleador());
					}else
						if(e.getActionCommand().equals(IVista.confirmaCracionTicketSimplificado)) {
							try {
								empleador.agregaObservable(new TicketSimplificado(v.getComboBoxBolsaLocacionEmpleador(),v.getComboBoxBolsaTipoTrabajoEmpleador(),empleador));
								v.ActualizarListaTicketSimpEmpleadores();
								v.ActualizarBolsaTicketsSimp();
								//No se si deberiamos hacer algo para que se muestre en la ventana AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
							} catch (AtributoInvalidoException e1) {
								//No va a pasar nada, ya que no puede tirar error realmente si lo creamos desde aca xd AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
							}
						}
			} 
	}
	
	public boolean checkRondaEncuentroHecha() {
		return sistema.isEncuentroHecho();
	}
	
	public boolean ExisteAgencia() {
		return (sistema != null); 
	}
	
	public ArrayList<Empleado> RecuperaListaEmpleados() {
		return sistema.getEmpleadosPretensos();
	}
	
	public ArrayList<Empleador>RecuperaListaEmpleadores(){
		return sistema.getEmpleadores();
	}

    public TicketEmpleado RecuperaTicketEmpleado() {
    	return empleado.getTicket();
    }
    
    public TicketEmpleador RecuperaTicketEmpleador() {
    	return empleador.getTicketEmpleador();
    }
    
    public ArrayList<TicketSimplificado> RecuperaListaTicketSimplificadosEmpleadores(){
    	return empleador.getObservables();
    }
    
    public ListaAsignaciones RecuperaListaAsignacionEmpleado(){
    	return empleado.getLista();
    }
    
    public ListaAsignaciones RecuperaListaAsignacionEmpleador(){
    	return empleador.getLista();
    }
    
    public ArrayList<TicketSimplificado> RecuperaListaBolsaTicketSimp(){
    	return bolsa.getTickets();
    }

    public String nombreSistema() {
    	return sistema.getNombre();
    }
    
    public void agregarTextoComisiones(String mensaje) {
    	v.ActualizarTextAreaComisiones(mensaje);
    }
    
    public void agregarTextoContrataciones(String mensaje) {
    	v.ActualizarTextAreaContrataciones(mensaje);
    }

}
    			


