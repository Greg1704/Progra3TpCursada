package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;

public class VentanaFinal extends JFrame implements KeyListener, MouseListener, ItemListener, ActionListener, ListSelectionListener, IVista{

	protected JPanel contentPane;
	protected JTabbedPane tabbedPane;
	protected JPanel panelAgencia;
	protected JPanel panelEmpleado;
	protected JPanel panelEmpleador;
	protected JPanel PanelGeneralAgencia;
	protected JPanel PanelFuncionalidades;
	protected JPanel panelDatosTickets;
	protected JPanel panelTiposTrabajo;
	protected JRadioButton botonSalud;
	protected JRadioButton botonComercioLocal;
	protected JRadioButton botonComercioInternacional;
	protected JPanel panelTipoDePuestoAgencia;
	protected JRadioButton botonJunior;
	protected JRadioButton botonSenior;
	protected JRadioButton botonManagement;
	protected JPanel panelRangoLaboral;
	protected JRadioButton botonMenosV1;
	protected JRadioButton botonEntreV1yV2;
	protected JRadioButton botonMasV2;
	protected JPanel panelConfirmacion;
	protected JButton botonConfirmarTiposTickets;
	protected JPanel panelCreacionAgencia;
	protected JPanel panelNombreAgencia;
	protected JPanel panel;
	protected JLabel labelNombreAgencia;
	protected JPanel panel_1;
	protected JTextField textFieldCrearAgencia;
	protected JPanel panelConfirmarNombreAgencia;
	protected JButton botonConfirmarNombreAgencia;
	protected JPanel panelRondaEncCont;
	protected JPanel panel_2;
	protected JPanel panel_3;
	protected JButton botonRondaEncuentro;
	protected JPanel panel_4;
	protected JButton botonRondaContraciones;
	protected JPanel panel_5;
	protected JList listComisiones;
	protected JPanel PanelListas;
	protected JList listEmpleados;
	protected JList listTicketEmpleados;
	protected JList listEmpleadores;
	protected JList listTicketEmpleadores;
	protected JPanel panelGeneralEmpleado;
	protected JPanel panelLoginCreacionEmpleado;
	protected JPanel panelLogin;
	protected JPanel panelUsuario;
	protected JLabel lblUsuario;
	protected JTextField textFieldUsuario;
	protected JPanel panelContrasenia;
	protected JLabel lblContrasenia;
	protected JTextField textFieldContrasenia;
	protected JPanel panelConfirmarLogin;
	protected JButton btnConfirmarLogin;
	protected JPanel panelCreacionEmpleado;
	protected JPanel panelCreacionUsuario;
	protected JLabel lblCreacionUsuario;
	protected JTextField textFieldCreacionUsuario;
	protected JPanel panelCreacionContrasenia;
	protected JLabel lblCreacionContrasenia;
	protected JTextField textFieldCreacionContrasenia;
	protected JPanel panelCreacionNyA;
	protected JLabel lblCreacionNyA;
	protected JTextField textFieldCreacionNyA;
	protected JPanel panelDNI;
	protected JLabel lblDNI;
	protected JTextField textFieldDNI;
	protected JPanel panelTelefono;
	protected JLabel lblTelefono;
	protected JTextField textFieldTelefono;
	protected JPanel panelEdad;
	protected JLabel lblEdad;
	protected JTextField textFieldEdad;
	protected JPanel panelCiudad;
	protected JLabel lblCiudad;
	protected JTextField textFieldCiudad;
	protected JPanel panelConfirmacionCreacionUsuario;
	protected JButton btnConfirmacionCreacionUsuario;
	protected JPanel panelTicket;
	protected JPanel panelCreacionTicket;
	protected JPanel panelLocacion;
	protected JComboBox comboBoxLocacion;
	protected JTextField textFieldPesoLocacion;
	protected JLabel labelPesoLocacion;
	protected JPanel panelRemuneracion;
	protected JComboBox comboBoxRemuneracion;
	protected JTextField textFieldPesoRemuneracion;
	protected JLabel labelPesoRemuneracion;
	protected JPanel panelCargaHoraria;
	protected JComboBox comboBoxCargaHoraria;
	protected JTextField textFieldPesoCargaHoraria;
	protected JLabel labelPesoCargaHoraria;
	protected JPanel panelTipoDePuesto;
	protected JComboBox comboBoxTipoDePuesto;
	protected JTextField textFieldPesoTipoDePuesto;
	protected JLabel labelPesoTipoDePuesto;
	protected JPanel panelRangoEtario;
	protected JComboBox comboBoxRangoEtario;
	protected JLabel labelPesoRangoEtario;
	protected JPanel panelExperienciaPrevia;
	protected JComboBox comboBoxExperienciaPrevia;
	protected JLabel labelPesoExperienciaPrevia;
	protected JPanel panelEstudiosCursados;
	protected JComboBox comboBoxEstudiosCursados;
	protected JLabel labelPesoEstudiosCursados;
	protected JPanel panelConfirmacionCreacionTicket;
	protected JButton btnConfirmacionCreacionTicket;
	protected JList listTicketActual;
	protected JPanel panelEleccionYBolsa;
	protected JPanel panelRondaElecciones;
	protected JList listRondaEleccionesEmpleado;
	protected JButton btnConfirmacionEleccionEmpleado;
	protected JPanel panelBolsaTrabajo;
	protected JPanel panelEmpleadoRequisitosBolsa;
	protected JComboBox comboBoxBolsaTipoTrabajo;
	protected JComboBox comboBoxBolsaLocacion;
	protected JLabel lblBolsaTipoTrabajo;
	protected JLabel lblBolsaLocacion;
	protected JPanel panelPantallaBolsa;
	protected JList listTicketSimpActual;
	protected JButton btnBolsaAceptar;
	protected JButton btnBolsaRechazar;
	protected JButton btnInicioBolsa;
	protected JPanel panelGeneralEmpleador;
	protected JPanel panelLoginCreacionEmpleador;
	protected JPanel panelLoginEmpleador;
	protected JPanel panelUsuarioEmpleador;
	protected JLabel lblUsuarioEmpleador;
	protected JTextField textFieldUsuarioEmpleador;
	protected JPanel panelContraseniaEmpleador;
	protected JLabel lblContraseniaEmpleador;
	protected JTextField textFieldContraseniaEmpleador;
	protected JPanel panelConfirmarLoginEmpleador;
	protected JButton btnConfirmarLoginEmpleador;
	protected JPanel panelCreacionEmpleador;
	protected JPanel panelCreacionUsuarioEmpleador;
	protected JLabel lblCreacionUsuarioEmpleador;
	protected JTextField textFieldCreacionUsuarioEmpleador;
	protected JPanel panelCreacionContraseniaEmpleador;
	protected JLabel lblCreacionContraseniaEmpleador;
	protected JTextField textFieldCreacionContraseniaEmpleador;
	protected JPanel panelCreacionNombreEmpleador;
	protected JLabel lblCreacionNombreEmpleador;
	protected JTextField textFieldCreacionNombreEmpleador;
	protected JPanel panelTipoPersonaEmpleador;
	protected JLabel lblTipoPersonaEmpleador;
	protected JPanel panelRubroEmpleador;
	protected JLabel lblRubroEmpleador;
	protected JPanel panelConfirmacionCreacionUsuario_1;
	protected JButton btnConfirmacionCreacionUsuario_1;
	protected JComboBox comboBoxTipoPersonaEmpleador;
	protected JComboBox comboBoxRubroEmpleador;
	protected JPanel panelTicketEmpleador;
	protected JPanel panelCreacionTicketEmpleador;
	protected JPanel panelLocacionEmpleador;
	protected JComboBox comboBoxLocacionEmpleador;
	protected JTextField textFieldPesoLocacionEmpleador;
	protected JLabel labelPesoLocacionEmpleador;
	protected JPanel panelRemuneracionEmpleador;
	protected JComboBox comboBoxRemuneracionEmpleador;
	protected JTextField textFieldPesoRemuneracionEmpleador;
	protected JLabel labelPesoRemuneracionEmpleador;
	protected JPanel panelCargaHorariaEmpleador;
	protected JComboBox comboBoxCargaHorariaEmpleador;
	protected JTextField textFieldPesoCargaHorariaEmpleador;
	protected JLabel labelPesoCargaHorariaEmpleador;
	protected JPanel panelTipoDePuestoEmpleador;
	protected JComboBox comboBoxTipoDePuestoEmpleador;
	protected JTextField textFieldPesoTipoDePuestoEmpleador;
	protected JLabel labelPesoTipoDePuestoEmpleador;
	protected JPanel panelRangoEtarioEmpleador;
	protected JComboBox comboBoxRangoEtarioEmpleador;
	protected JTextField textFieldPesoRangoEtarioEmpleador;
	protected JLabel labelPesoRangoEtarioEmpleador;
	protected JPanel panelExperienciaPreviaEmpleador;
	protected JComboBox comboBoxExperienciaPreviaEmpleador;
	protected JTextField textFieldPesoExpPreviaEmpleador;
	protected JLabel labelPesoExpPreviaEmpleador;
	protected JPanel panelEstudiosCursadosEmpleador;
	protected JComboBox comboBoxEstudiosCursadosEmpleador;
	protected JTextField textFieldPesoEstudiosCursadosEmpleador;
	protected JLabel labelPesoEstudiosCursadosEmpleador;
	protected JPanel panelConfirmacionCreacionTicketEmpleador;
	protected JButton btnConfirmacionCreacionTicket_1;
	protected JList listTicketActualEmpleador;
	protected JPanel panelRondaDeEleccionEmpleador;
	protected JPanel panelRondaEleccionesEmpleador;
	protected JList listRondaEleccionesEmpleador;
	protected JButton btnConfirmacionEleccionEmpleador;
	protected JPanel panelTicketSimplificado;
	protected JPanel panelEmpleadorRequisitosTicketSimp;
	protected JComboBox comboBoxBolsaTipoTrabajo_1;
	protected JComboBox comboBoxBolsaLocacion_1;
	protected JLabel lblBolsaTipoTrabajo_1;
	protected JLabel lblBolsaLocacion_1;
	protected JButton btnCrearTicketSimplificado;
	protected JPanel panel_6;
	protected JRadioButton rdbtnActivo;
	protected JRadioButton rdbtnSuspendido;
	protected JRadioButton rdbtnCancelar;
	protected JButton btnCambiarEstado;
	protected JPanel panelEstadoTicketEmpleador;
	protected JRadioButton rdbtnActivoEmpleador;
	protected JRadioButton rdbtnSuspendidoEmpleador;
	protected JRadioButton rdbtnCancelarEmpleador;
	protected JButton btnCambiarEstadoEmpleador;
	protected JList listTicketSimplificadosEmpleador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFinal frame = new VentanaFinal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 722);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.contentPane.add(this.tabbedPane, BorderLayout.CENTER);
		
		this.panelAgencia = new JPanel();
		this.tabbedPane.addTab("Agencia", null, this.panelAgencia, null);
		this.panelAgencia.setLayout(new BorderLayout(0, 0));
		
		this.PanelGeneralAgencia = new JPanel();
		this.panelAgencia.add(this.PanelGeneralAgencia, BorderLayout.CENTER);
		this.PanelGeneralAgencia.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.PanelFuncionalidades = new JPanel();
		this.PanelFuncionalidades.setBorder(new CompoundBorder());
		this.PanelGeneralAgencia.add(this.PanelFuncionalidades);
		this.PanelFuncionalidades.setLayout(new GridLayout(4, 0, 0, 0));
		
		this.panelDatosTickets = new JPanel();
		this.panelDatosTickets.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.PanelFuncionalidades.add(this.panelDatosTickets);
		this.panelDatosTickets.setLayout(new GridLayout(4, 0, 0, 0));
		
		this.panelTiposTrabajo = new JPanel();
		this.panelTiposTrabajo.setBorder(new TitledBorder(null, "Tipos de Trabajo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelDatosTickets.add(this.panelTiposTrabajo);
		this.panelTiposTrabajo.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonSalud = new JRadioButton("Salud");
		this.panelTiposTrabajo.add(this.botonSalud);
		
		this.botonComercioLocal = new JRadioButton("Comercio Local");
		this.panelTiposTrabajo.add(this.botonComercioLocal);
		
		this.botonComercioInternacional = new JRadioButton("Comercio Int.");
		this.panelTiposTrabajo.add(this.botonComercioInternacional);
		
		this.panelTipoDePuestoAgencia = new JPanel();
		this.panelTipoDePuestoAgencia.setBorder(new TitledBorder(null, "Tipos de puesto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelDatosTickets.add(this.panelTipoDePuestoAgencia);
		this.panelTipoDePuestoAgencia.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonJunior = new JRadioButton("Junior");
		this.panelTipoDePuestoAgencia.add(this.botonJunior);
		
		this.botonSenior = new JRadioButton("Senior");
		this.panelTipoDePuestoAgencia.add(this.botonSenior);
		
		this.botonManagement = new JRadioButton("Management");
		this.panelTipoDePuestoAgencia.add(this.botonManagement);
		
		this.panelRangoLaboral = new JPanel();
		this.panelRangoLaboral.setBorder(new TitledBorder(null, "Rango Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelDatosTickets.add(this.panelRangoLaboral);
		this.panelRangoLaboral.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonMenosV1 = new JRadioButton("Menor a 60 mil");
		this.panelRangoLaboral.add(this.botonMenosV1);
		
		this.botonEntreV1yV2 = new JRadioButton("Entre 60 mil y 120 mil");
		this.panelRangoLaboral.add(this.botonEntreV1yV2);
		
		this.botonMasV2 = new JRadioButton("Mas de 120 mil");
		this.panelRangoLaboral.add(this.botonMasV2);
		
		this.panelConfirmacion = new JPanel();
		this.panelDatosTickets.add(this.panelConfirmacion);
		
		this.botonConfirmarTiposTickets = new JButton("Confirmar");
		this.botonConfirmarTiposTickets.setEnabled(false);
		this.panelConfirmacion.add(this.botonConfirmarTiposTickets);
		
		this.panelCreacionAgencia = new JPanel();
		this.panelCreacionAgencia.setBorder(new TitledBorder(null, "Crear Agencia", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.panelCreacionAgencia);
		this.panelCreacionAgencia.setLayout(new GridLayout(2, 1, 0, 0));
		
		this.panelNombreAgencia = new JPanel();
		this.panelNombreAgencia.setBorder(null);
		this.panelCreacionAgencia.add(this.panelNombreAgencia);
		this.panelNombreAgencia.setLayout(new GridLayout(1, 2, 0, 0));
		
		this.panel = new JPanel();
		this.panelNombreAgencia.add(this.panel);
		
		this.labelNombreAgencia = new JLabel("Nombre de agencia");
		this.panel.add(this.labelNombreAgencia);
		
		this.panel_1 = new JPanel();
		this.panelNombreAgencia.add(this.panel_1);
		
		this.textFieldCrearAgencia = new JTextField();
		this.textFieldCrearAgencia.setColumns(10);
		this.panel_1.add(this.textFieldCrearAgencia);
		
		this.panelConfirmarNombreAgencia = new JPanel();
		this.panelCreacionAgencia.add(this.panelConfirmarNombreAgencia);
		
		this.botonConfirmarNombreAgencia = new JButton("Confirmar");
		this.botonConfirmarNombreAgencia.setEnabled(false);
		this.panelConfirmarNombreAgencia.add(this.botonConfirmarNombreAgencia);
		
		this.panelRondaEncCont = new JPanel();
		this.panelRondaEncCont.setBorder(new TitledBorder(null, "Busqueda Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.panelRondaEncCont);
		this.panelRondaEncCont.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panelRondaEncCont.add(this.panel_2);
		
		this.panel_3 = new JPanel();
		this.panelRondaEncCont.add(this.panel_3);
		this.panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonRondaEncuentro = new JButton("Ronda de Encuentros");
		this.botonRondaEncuentro.setEnabled(false);
		this.panel_3.add(this.botonRondaEncuentro);
		
		this.panel_4 = new JPanel();
		this.panel_3.add(this.panel_4);
		
		this.botonRondaContraciones = new JButton("Ronda de Contrataciones");
		this.botonRondaContraciones.setEnabled(false);
		this.panel_3.add(this.botonRondaContraciones);
		
		this.panel_5 = new JPanel();
		this.panelRondaEncCont.add(this.panel_5);
		
		this.listComisiones = new JList();
		this.listComisiones.setBorder(new TitledBorder(null, "Comisiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.listComisiones);
		
		this.PanelListas = new JPanel();
		this.PanelListas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.PanelGeneralAgencia.add(this.PanelListas);
		this.PanelListas.setLayout(new GridLayout(4, 0, 0, 0));
		
		this.listEmpleados = new JList();
		this.listEmpleados.setBorder(new TitledBorder(null, "Lista Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelListas.add(this.listEmpleados);
		
		this.listTicketEmpleados = new JList();
		this.listTicketEmpleados.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Solicitudes de Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.PanelListas.add(this.listTicketEmpleados);
		
		this.listEmpleadores = new JList();
		this.listEmpleadores.setBorder(new TitledBorder(null, "Lista Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelListas.add(this.listEmpleadores);
		
		this.listTicketEmpleadores = new JList();
		this.listTicketEmpleadores.setBorder(new TitledBorder(null, "Solicitudes de Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelListas.add(this.listTicketEmpleadores);
		
		this.panelEmpleado = new JPanel();
		this.tabbedPane.addTab("Empleado", null, this.panelEmpleado, null);
		this.panelEmpleado.setLayout(new BorderLayout(0, 0));
		
		this.panelGeneralEmpleado = new JPanel();
		this.panelEmpleado.add(this.panelGeneralEmpleado, BorderLayout.CENTER);
		this.panelGeneralEmpleado.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelLoginCreacionEmpleado = new JPanel();
		this.panelLoginCreacionEmpleado.setLayout(null);
		this.panelGeneralEmpleado.add(this.panelLoginCreacionEmpleado);
		
		this.panelLogin = new JPanel();
		this.panelLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelLogin.setBounds(10, 11, 389, 202);
		this.panelLoginCreacionEmpleado.add(this.panelLogin);
		this.panelLogin.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panelUsuario = new JPanel();
		this.panelUsuario.setLayout(null);
		this.panelLogin.add(this.panelUsuario);
		
		this.lblUsuario = new JLabel("Usuario:");
		this.lblUsuario.setBounds(70, 22, 46, 14);
		this.panelUsuario.add(this.lblUsuario);
		
		this.textFieldUsuario = new JTextField();
		this.textFieldUsuario.setColumns(10);
		this.textFieldUsuario.setBounds(172, 19, 176, 20);
		this.panelUsuario.add(this.textFieldUsuario);
		
		this.panelContrasenia = new JPanel();
		this.panelContrasenia.setLayout(null);
		this.panelLogin.add(this.panelContrasenia);
		
		this.lblContrasenia = new JLabel("Contraseña:");
		this.lblContrasenia.setBounds(61, 22, 60, 14);
		this.panelContrasenia.add(this.lblContrasenia);
		
		this.textFieldContrasenia = new JTextField();
		this.textFieldContrasenia.setColumns(10);
		this.textFieldContrasenia.setBounds(172, 19, 176, 20);
		this.panelContrasenia.add(this.textFieldContrasenia);
		
		this.panelConfirmarLogin = new JPanel();
		this.panelConfirmarLogin.setLayout(null);
		this.panelLogin.add(this.panelConfirmarLogin);
		
		this.btnConfirmarLogin = new JButton("Confirmar");
		this.btnConfirmarLogin.setBounds(135, 26, 89, 23);
		this.panelConfirmarLogin.add(this.btnConfirmarLogin);
		
		this.panelCreacionEmpleado = new JPanel();
		this.panelCreacionEmpleado.setBorder(new TitledBorder(null, "Crear Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionEmpleado.setBounds(10, 214, 389, 431);
		this.panelLoginCreacionEmpleado.add(this.panelCreacionEmpleado);
		this.panelCreacionEmpleado.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelCreacionUsuario = new JPanel();
		this.panelCreacionUsuario.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionUsuario);
		
		this.lblCreacionUsuario = new JLabel("Usuario:");
		this.lblCreacionUsuario.setBounds(70, 22, 46, 14);
		this.panelCreacionUsuario.add(this.lblCreacionUsuario);
		
		this.textFieldCreacionUsuario = new JTextField();
		this.textFieldCreacionUsuario.setColumns(10);
		this.textFieldCreacionUsuario.setBounds(172, 19, 176, 20);
		this.panelCreacionUsuario.add(this.textFieldCreacionUsuario);
		
		this.panelCreacionContrasenia = new JPanel();
		this.panelCreacionContrasenia.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionContrasenia);
		
		this.lblCreacionContrasenia = new JLabel("Contraseña:");
		this.lblCreacionContrasenia.setBounds(61, 22, 60, 14);
		this.panelCreacionContrasenia.add(this.lblCreacionContrasenia);
		
		this.textFieldCreacionContrasenia = new JTextField();
		this.textFieldCreacionContrasenia.setColumns(10);
		this.textFieldCreacionContrasenia.setBounds(172, 19, 176, 20);
		this.panelCreacionContrasenia.add(this.textFieldCreacionContrasenia);
		
		this.panelCreacionNyA = new JPanel();
		this.panelCreacionNyA.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionNyA);
		
		this.lblCreacionNyA = new JLabel("Nombre y Apellido:");
		this.lblCreacionNyA.setBounds(47, 22, 95, 14);
		this.panelCreacionNyA.add(this.lblCreacionNyA);
		
		this.textFieldCreacionNyA = new JTextField();
		this.textFieldCreacionNyA.setColumns(10);
		this.textFieldCreacionNyA.setBounds(172, 19, 176, 20);
		this.panelCreacionNyA.add(this.textFieldCreacionNyA);
		
		this.panelDNI = new JPanel();
		this.panelDNI.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelDNI);
		
		this.lblDNI = new JLabel("DNI:");
		this.lblDNI.setBounds(82, 22, 39, 14);
		this.panelDNI.add(this.lblDNI);
		
		this.textFieldDNI = new JTextField();
		this.textFieldDNI.setColumns(10);
		this.textFieldDNI.setBounds(172, 19, 176, 20);
		this.panelDNI.add(this.textFieldDNI);
		
		this.panelTelefono = new JPanel();
		this.panelTelefono.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelTelefono);
		
		this.lblTelefono = new JLabel("Telefono:");
		this.lblTelefono.setBounds(69, 22, 52, 14);
		this.panelTelefono.add(this.lblTelefono);
		
		this.textFieldTelefono = new JTextField();
		this.textFieldTelefono.setColumns(10);
		this.textFieldTelefono.setBounds(172, 19, 176, 20);
		this.panelTelefono.add(this.textFieldTelefono);
		
		this.panelEdad = new JPanel();
		this.panelEdad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelEdad);
		
		this.lblEdad = new JLabel("Edad:");
		this.lblEdad.setBounds(81, 22, 40, 14);
		this.panelEdad.add(this.lblEdad);
		
		this.textFieldEdad = new JTextField();
		this.textFieldEdad.setColumns(10);
		this.textFieldEdad.setBounds(172, 19, 176, 20);
		this.panelEdad.add(this.textFieldEdad);
		
		this.panelCiudad = new JPanel();
		this.panelCiudad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCiudad);
		
		this.lblCiudad = new JLabel("Ciudad:");
		this.lblCiudad.setBounds(76, 22, 45, 14);
		this.panelCiudad.add(this.lblCiudad);
		
		this.textFieldCiudad = new JTextField();
		this.textFieldCiudad.setColumns(10);
		this.textFieldCiudad.setBounds(172, 19, 176, 20);
		this.panelCiudad.add(this.textFieldCiudad);
		
		this.panelConfirmacionCreacionUsuario = new JPanel();
		this.panelCreacionEmpleado.add(this.panelConfirmacionCreacionUsuario);
		
		this.btnConfirmacionCreacionUsuario = new JButton("Confirmar");
		this.panelConfirmacionCreacionUsuario.add(this.btnConfirmacionCreacionUsuario);
		
		this.panelTicket = new JPanel();
		this.panelTicket.setLayout(null);
		this.panelGeneralEmpleado.add(this.panelTicket);
		
		this.panelCreacionTicket = new JPanel();
		this.panelCreacionTicket.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.setBounds(10, 11, 389, 495);
		this.panelTicket.add(this.panelCreacionTicket);
		this.panelCreacionTicket.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setLayout(null);
		this.panelLocacion.setBorder(new TitledBorder(null, "Locacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.add(this.panelLocacion);
		
		this.comboBoxLocacion = new JComboBox();
		this.comboBoxLocacion.setBounds(23, 26, 167, 22);
		this.panelLocacion.add(this.comboBoxLocacion);
		
		this.textFieldPesoLocacion = new JTextField();
		this.textFieldPesoLocacion.setColumns(10);
		this.textFieldPesoLocacion.setBounds(314, 27, 35, 20);
		this.panelLocacion.add(this.textFieldPesoLocacion);
		
		this.labelPesoLocacion = new JLabel("Ponderacion:");
		this.labelPesoLocacion.setBounds(241, 30, 63, 14);
		this.panelLocacion.add(this.labelPesoLocacion);
		
		this.panelRemuneracion = new JPanel();
		this.panelRemuneracion.setLayout(null);
		this.panelRemuneracion.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Remuneraci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelRemuneracion);
		
		this.comboBoxRemuneracion = new JComboBox();
		this.comboBoxRemuneracion.setBounds(23, 26, 167, 22);
		this.panelRemuneracion.add(this.comboBoxRemuneracion);
		
		this.textFieldPesoRemuneracion = new JTextField();
		this.textFieldPesoRemuneracion.setColumns(10);
		this.textFieldPesoRemuneracion.setBounds(314, 27, 35, 20);
		this.panelRemuneracion.add(this.textFieldPesoRemuneracion);
		
		this.labelPesoRemuneracion = new JLabel("Ponderacion:");
		this.labelPesoRemuneracion.setBounds(241, 30, 63, 14);
		this.panelRemuneracion.add(this.labelPesoRemuneracion);
		
		this.panelCargaHoraria = new JPanel();
		this.panelCargaHoraria.setLayout(null);
		this.panelCargaHoraria.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Carga Horaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelCargaHoraria);
		
		this.comboBoxCargaHoraria = new JComboBox();
		this.comboBoxCargaHoraria.setBounds(23, 26, 167, 22);
		this.panelCargaHoraria.add(this.comboBoxCargaHoraria);
		
		this.textFieldPesoCargaHoraria = new JTextField();
		this.textFieldPesoCargaHoraria.setColumns(10);
		this.textFieldPesoCargaHoraria.setBounds(314, 27, 35, 20);
		this.panelCargaHoraria.add(this.textFieldPesoCargaHoraria);
		
		this.labelPesoCargaHoraria = new JLabel("Ponderacion:");
		this.labelPesoCargaHoraria.setBounds(241, 30, 63, 14);
		this.panelCargaHoraria.add(this.labelPesoCargaHoraria);
		
		this.panelTipoDePuesto = new JPanel();
		this.panelTipoDePuesto.setLayout(null);
		this.panelTipoDePuesto.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de Puesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelTipoDePuesto);
		
		this.comboBoxTipoDePuesto = new JComboBox();
		this.comboBoxTipoDePuesto.setBounds(23, 26, 167, 22);
		this.panelTipoDePuesto.add(this.comboBoxTipoDePuesto);
		
		this.textFieldPesoTipoDePuesto = new JTextField();
		this.textFieldPesoTipoDePuesto.setColumns(10);
		this.textFieldPesoTipoDePuesto.setBounds(314, 27, 35, 20);
		this.panelTipoDePuesto.add(this.textFieldPesoTipoDePuesto);
		
		this.labelPesoTipoDePuesto = new JLabel("Ponderacion:");
		this.labelPesoTipoDePuesto.setBounds(241, 30, 63, 14);
		this.panelTipoDePuesto.add(this.labelPesoTipoDePuesto);
		
		this.panelRangoEtario = new JPanel();
		this.panelRangoEtario.setLayout(null);
		this.panelRangoEtario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rango Etario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelRangoEtario);
		
		this.comboBoxRangoEtario = new JComboBox();
		this.comboBoxRangoEtario.setBounds(23, 26, 167, 22);
		this.panelRangoEtario.add(this.comboBoxRangoEtario);
		
		this.labelPesoRangoEtario = new JLabel("Ponderacion: 1");
		this.labelPesoRangoEtario.setBounds(241, 30, 90, 14);
		this.panelRangoEtario.add(this.labelPesoRangoEtario);
		
		this.panelExperienciaPrevia = new JPanel();
		this.panelExperienciaPrevia.setLayout(null);
		this.panelExperienciaPrevia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Experiencia Previa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelExperienciaPrevia);
		
		this.comboBoxExperienciaPrevia = new JComboBox();
		this.comboBoxExperienciaPrevia.setBounds(23, 26, 167, 22);
		this.panelExperienciaPrevia.add(this.comboBoxExperienciaPrevia);
		
		this.labelPesoExperienciaPrevia = new JLabel("Ponderacion: 1");
		this.labelPesoExperienciaPrevia.setBounds(241, 30, 90, 14);
		this.panelExperienciaPrevia.add(this.labelPesoExperienciaPrevia);
		
		this.panelEstudiosCursados = new JPanel();
		this.panelEstudiosCursados.setLayout(null);
		this.panelEstudiosCursados.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Estudios Cursados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelEstudiosCursados);
		
		this.comboBoxEstudiosCursados = new JComboBox();
		this.comboBoxEstudiosCursados.setBounds(23, 26, 167, 22);
		this.panelEstudiosCursados.add(this.comboBoxEstudiosCursados);
		
		this.labelPesoEstudiosCursados = new JLabel("Ponderacion: 1");
		this.labelPesoEstudiosCursados.setBounds(241, 30, 90, 14);
		this.panelEstudiosCursados.add(this.labelPesoEstudiosCursados);
		
		this.panelConfirmacionCreacionTicket = new JPanel();
		this.panelCreacionTicket.add(this.panelConfirmacionCreacionTicket);
		this.panelConfirmacionCreacionTicket.setLayout(null);
		
		this.btnConfirmacionCreacionTicket = new JButton("Confirmar");
		this.btnConfirmacionCreacionTicket.setBounds(150, 25, 79, 23);
		this.panelConfirmacionCreacionTicket.add(this.btnConfirmacionCreacionTicket);
		
		this.listTicketActual = new JList();
		this.listTicketActual.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketActual.setBounds(10, 577, 389, 57);
		this.panelTicket.add(this.listTicketActual);
		
		this.panel_6 = new JPanel();
		this.panel_6.setBorder(new TitledBorder(null, "Estado del Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_6.setBounds(10, 512, 387, 57);
		this.panelTicket.add(this.panel_6);
		this.panel_6.setLayout(null);
		
		this.rdbtnActivo = new JRadioButton("Activar");
		this.rdbtnActivo.setBounds(6, 27, 63, 23);
		this.panel_6.add(this.rdbtnActivo);
		
		this.rdbtnSuspendido = new JRadioButton("Suspender");
		this.rdbtnSuspendido.setBounds(71, 27, 85, 23);
		this.panel_6.add(this.rdbtnSuspendido);
		
		this.rdbtnCancelar = new JRadioButton("Cancelar");
		this.rdbtnCancelar.setBounds(158, 27, 85, 23);
		this.panel_6.add(this.rdbtnCancelar);
		
		this.btnCambiarEstado = new JButton("Cambiar");
		this.btnCambiarEstado.setBounds(249, 27, 89, 23);
		this.panel_6.add(this.btnCambiarEstado);
		
		this.panelEleccionYBolsa = new JPanel();
		this.panelEleccionYBolsa.setBorder(new TitledBorder(null, "Ronda de Eleccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelGeneralEmpleado.add(this.panelEleccionYBolsa);
		this.panelEleccionYBolsa.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panelRondaElecciones = new JPanel();
		this.panelRondaElecciones.setLayout(null);
		this.panelEleccionYBolsa.add(this.panelRondaElecciones);
		
		this.listRondaEleccionesEmpleado = new JList();
		this.listRondaEleccionesEmpleado.setBorder(new TitledBorder(null, "Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listRondaEleccionesEmpleado.setBounds(10, 11, 377, 233);
		this.panelRondaElecciones.add(this.listRondaEleccionesEmpleado);
		
		this.btnConfirmacionEleccionEmpleado = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleado.setBounds(162, 277, 89, 23);
		this.panelRondaElecciones.add(this.btnConfirmacionEleccionEmpleado);
		
		this.panelBolsaTrabajo = new JPanel();
		this.panelBolsaTrabajo.setLayout(null);
		this.panelBolsaTrabajo.setBorder(new TitledBorder(null, "Bolsa de Trabajo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEleccionYBolsa.add(this.panelBolsaTrabajo);
		
		this.panelEmpleadoRequisitosBolsa = new JPanel();
		this.panelEmpleadoRequisitosBolsa.setLayout(null);
		this.panelEmpleadoRequisitosBolsa.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleadoRequisitosBolsa.setBounds(21, 23, 366, 59);
		this.panelBolsaTrabajo.add(this.panelEmpleadoRequisitosBolsa);
		
		this.comboBoxBolsaTipoTrabajo = new JComboBox();
		this.comboBoxBolsaTipoTrabajo.setBounds(23, 26, 138, 22);
		this.panelEmpleadoRequisitosBolsa.add(this.comboBoxBolsaTipoTrabajo);
		
		this.comboBoxBolsaLocacion = new JComboBox();
		this.comboBoxBolsaLocacion.setBounds(195, 26, 138, 22);
		this.panelEmpleadoRequisitosBolsa.add(this.comboBoxBolsaLocacion);
		
		this.lblBolsaTipoTrabajo = new JLabel("Tipo de trabajo");
		this.lblBolsaTipoTrabajo.setBounds(53, 11, 81, 14);
		this.panelEmpleadoRequisitosBolsa.add(this.lblBolsaTipoTrabajo);
		
		this.lblBolsaLocacion = new JLabel("Locacion:");
		this.lblBolsaLocacion.setBounds(247, 11, 58, 14);
		this.panelEmpleadoRequisitosBolsa.add(this.lblBolsaLocacion);
		
		this.panelPantallaBolsa = new JPanel();
		this.panelPantallaBolsa.setLayout(null);
		this.panelPantallaBolsa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Eleccion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPantallaBolsa.setBounds(21, 93, 366, 182);
		this.panelBolsaTrabajo.add(this.panelPantallaBolsa);
		
		this.listTicketSimpActual = new JList();
		this.listTicketSimpActual.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.listTicketSimpActual.setBounds(10, 21, 346, 81);
		this.panelPantallaBolsa.add(this.listTicketSimpActual);
		
		this.btnBolsaAceptar = new JButton("Aceptar");
		this.btnBolsaAceptar.setBounds(43, 125, 89, 23);
		this.panelPantallaBolsa.add(this.btnBolsaAceptar);
		
		this.btnBolsaRechazar = new JButton("Rechazar");
		this.btnBolsaRechazar.setBounds(241, 125, 89, 23);
		this.panelPantallaBolsa.add(this.btnBolsaRechazar);
		
		this.btnInicioBolsa = new JButton("Arrancar");
		this.btnInicioBolsa.setBounds(162, 277, 89, 23);
		this.panelBolsaTrabajo.add(this.btnInicioBolsa);
		
		this.panelEmpleador = new JPanel();
		this.tabbedPane.addTab("Empleador", null, this.panelEmpleador, null);
		this.panelEmpleador.setLayout(new BorderLayout(0, 0));
		
		this.panelGeneralEmpleador = new JPanel();
		this.panelEmpleador.add(this.panelGeneralEmpleador, BorderLayout.CENTER);
		this.panelGeneralEmpleador.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelLoginCreacionEmpleador = new JPanel();
		this.panelLoginCreacionEmpleador.setLayout(null);
		this.panelGeneralEmpleador.add(this.panelLoginCreacionEmpleador);
		
		this.panelLoginEmpleador = new JPanel();
		this.panelLoginEmpleador.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelLoginEmpleador.setBounds(10, 11, 389, 202);
		this.panelLoginCreacionEmpleador.add(this.panelLoginEmpleador);
		this.panelLoginEmpleador.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panelUsuarioEmpleador = new JPanel();
		this.panelUsuarioEmpleador.setLayout(null);
		this.panelLoginEmpleador.add(this.panelUsuarioEmpleador);
		
		this.lblUsuarioEmpleador = new JLabel("Usuario:");
		this.lblUsuarioEmpleador.setBounds(70, 22, 46, 14);
		this.panelUsuarioEmpleador.add(this.lblUsuarioEmpleador);
		
		this.textFieldUsuarioEmpleador = new JTextField();
		this.textFieldUsuarioEmpleador.setColumns(10);
		this.textFieldUsuarioEmpleador.setBounds(172, 19, 176, 20);
		this.panelUsuarioEmpleador.add(this.textFieldUsuarioEmpleador);
		
		this.panelContraseniaEmpleador = new JPanel();
		this.panelContraseniaEmpleador.setLayout(null);
		this.panelLoginEmpleador.add(this.panelContraseniaEmpleador);
		
		this.lblContraseniaEmpleador = new JLabel("Contraseña:");
		this.lblContraseniaEmpleador.setBounds(61, 22, 60, 14);
		this.panelContraseniaEmpleador.add(this.lblContraseniaEmpleador);
		
		this.textFieldContraseniaEmpleador = new JTextField();
		this.textFieldContraseniaEmpleador.setColumns(10);
		this.textFieldContraseniaEmpleador.setBounds(172, 19, 176, 20);
		this.panelContraseniaEmpleador.add(this.textFieldContraseniaEmpleador);
		
		this.panelConfirmarLoginEmpleador = new JPanel();
		this.panelConfirmarLoginEmpleador.setLayout(null);
		this.panelLoginEmpleador.add(this.panelConfirmarLoginEmpleador);
		
		this.btnConfirmarLoginEmpleador = new JButton("Confirmar");
		this.btnConfirmarLoginEmpleador.setBounds(135, 26, 89, 23);
		this.panelConfirmarLoginEmpleador.add(this.btnConfirmarLoginEmpleador);
		
		this.panelCreacionEmpleador = new JPanel();
		this.panelCreacionEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Crear Empleador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionEmpleador.setBounds(10, 214, 389, 348);
		this.panelLoginCreacionEmpleador.add(this.panelCreacionEmpleador);
		this.panelCreacionEmpleador.setLayout(new GridLayout(6, 0, 0, 0));
		
		this.panelCreacionUsuarioEmpleador = new JPanel();
		this.panelCreacionUsuarioEmpleador.setLayout(null);
		this.panelCreacionEmpleador.add(this.panelCreacionUsuarioEmpleador);
		
		this.lblCreacionUsuarioEmpleador = new JLabel("Usuario:");
		this.lblCreacionUsuarioEmpleador.setBounds(70, 22, 46, 14);
		this.panelCreacionUsuarioEmpleador.add(this.lblCreacionUsuarioEmpleador);
		
		this.textFieldCreacionUsuarioEmpleador = new JTextField();
		this.textFieldCreacionUsuarioEmpleador.setColumns(10);
		this.textFieldCreacionUsuarioEmpleador.setBounds(172, 19, 176, 20);
		this.panelCreacionUsuarioEmpleador.add(this.textFieldCreacionUsuarioEmpleador);
		
		this.panelCreacionContraseniaEmpleador = new JPanel();
		this.panelCreacionContraseniaEmpleador.setLayout(null);
		this.panelCreacionEmpleador.add(this.panelCreacionContraseniaEmpleador);
		
		this.lblCreacionContraseniaEmpleador = new JLabel("Contraseña:");
		this.lblCreacionContraseniaEmpleador.setBounds(61, 22, 60, 14);
		this.panelCreacionContraseniaEmpleador.add(this.lblCreacionContraseniaEmpleador);
		
		this.textFieldCreacionContraseniaEmpleador = new JTextField();
		this.textFieldCreacionContraseniaEmpleador.setColumns(10);
		this.textFieldCreacionContraseniaEmpleador.setBounds(172, 19, 176, 20);
		this.panelCreacionContraseniaEmpleador.add(this.textFieldCreacionContraseniaEmpleador);
		
		this.panelCreacionNombreEmpleador = new JPanel();
		this.panelCreacionNombreEmpleador.setLayout(null);
		this.panelCreacionEmpleador.add(this.panelCreacionNombreEmpleador);
		
		this.lblCreacionNombreEmpleador = new JLabel("Nombre:");
		this.lblCreacionNombreEmpleador.setBounds(74, 22, 68, 14);
		this.panelCreacionNombreEmpleador.add(this.lblCreacionNombreEmpleador);
		
		this.textFieldCreacionNombreEmpleador = new JTextField();
		this.textFieldCreacionNombreEmpleador.setColumns(10);
		this.textFieldCreacionNombreEmpleador.setBounds(172, 19, 176, 20);
		this.panelCreacionNombreEmpleador.add(this.textFieldCreacionNombreEmpleador);
		
		this.panelTipoPersonaEmpleador = new JPanel();
		this.panelTipoPersonaEmpleador.setLayout(null);
		this.panelCreacionEmpleador.add(this.panelTipoPersonaEmpleador);
		
		this.lblTipoPersonaEmpleador = new JLabel("Tipo persona:");
		this.lblTipoPersonaEmpleador.setBounds(55, 22, 76, 14);
		this.panelTipoPersonaEmpleador.add(this.lblTipoPersonaEmpleador);
		
		this.comboBoxTipoPersonaEmpleador = new JComboBox();
		this.comboBoxTipoPersonaEmpleador.setBounds(172, 18, 176, 22);
		this.panelTipoPersonaEmpleador.add(this.comboBoxTipoPersonaEmpleador);
		
		this.panelRubroEmpleador = new JPanel();
		this.panelRubroEmpleador.setLayout(null);
		this.panelCreacionEmpleador.add(this.panelRubroEmpleador);
		
		this.lblRubroEmpleador = new JLabel("Rubro:");
		this.lblRubroEmpleador.setBounds(77, 22, 44, 14);
		this.panelRubroEmpleador.add(this.lblRubroEmpleador);
		
		this.comboBoxRubroEmpleador = new JComboBox();
		this.comboBoxRubroEmpleador.setBounds(171, 18, 176, 22);
		this.panelRubroEmpleador.add(this.comboBoxRubroEmpleador);
		
		this.panelConfirmacionCreacionUsuario_1 = new JPanel();
		this.panelCreacionEmpleador.add(this.panelConfirmacionCreacionUsuario_1);
		
		this.btnConfirmacionCreacionUsuario_1 = new JButton("Confirmar");
		this.panelConfirmacionCreacionUsuario_1.add(this.btnConfirmacionCreacionUsuario_1);
		
		this.panelEstadoTicketEmpleador = new JPanel();
		this.panelEstadoTicketEmpleador.setLayout(null);
		this.panelEstadoTicketEmpleador.setBorder(new TitledBorder(null, "Estado del Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEstadoTicketEmpleador.setBounds(12, 573, 387, 57);
		this.panelLoginCreacionEmpleador.add(this.panelEstadoTicketEmpleador);
		
		this.rdbtnActivoEmpleador = new JRadioButton("Activar");
		this.rdbtnActivoEmpleador.setBounds(6, 27, 63, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnActivoEmpleador);
		
		this.rdbtnSuspendidoEmpleador = new JRadioButton("Suspender");
		this.rdbtnSuspendidoEmpleador.setBounds(71, 27, 85, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnSuspendidoEmpleador);
		
		this.rdbtnCancelarEmpleador = new JRadioButton("Cancelar");
		this.rdbtnCancelarEmpleador.setBounds(158, 27, 85, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnCancelarEmpleador);
		
		this.btnCambiarEstadoEmpleador = new JButton("Cambiar");
		this.btnCambiarEstadoEmpleador.setBounds(249, 27, 89, 23);
		this.panelEstadoTicketEmpleador.add(this.btnCambiarEstadoEmpleador);
		
		this.panelTicketEmpleador = new JPanel();
		this.panelGeneralEmpleador.add(this.panelTicketEmpleador);
		this.panelTicketEmpleador.setLayout(null);
		
		this.panelCreacionTicketEmpleador = new JPanel();
		this.panelCreacionTicketEmpleador.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicketEmpleador.setBounds(10, 11, 389, 556);
		this.panelTicketEmpleador.add(this.panelCreacionTicketEmpleador);
		this.panelCreacionTicketEmpleador.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacionEmpleador = new JPanel();
		this.panelLocacionEmpleador.setLayout(null);
		this.panelLocacionEmpleador.setBorder(new TitledBorder(null, "Locacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicketEmpleador.add(this.panelLocacionEmpleador);
		
		this.comboBoxLocacionEmpleador = new JComboBox();
		this.comboBoxLocacionEmpleador.setBounds(23, 26, 167, 22);
		this.panelLocacionEmpleador.add(this.comboBoxLocacionEmpleador);
		
		this.textFieldPesoLocacionEmpleador = new JTextField();
		this.textFieldPesoLocacionEmpleador.setColumns(10);
		this.textFieldPesoLocacionEmpleador.setBounds(314, 27, 35, 20);
		this.panelLocacionEmpleador.add(this.textFieldPesoLocacionEmpleador);
		
		this.labelPesoLocacionEmpleador = new JLabel("Ponderacion:");
		this.labelPesoLocacionEmpleador.setBounds(241, 30, 63, 14);
		this.panelLocacionEmpleador.add(this.labelPesoLocacionEmpleador);
		
		this.panelRemuneracionEmpleador = new JPanel();
		this.panelRemuneracionEmpleador.setLayout(null);
		this.panelRemuneracionEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Remuneraci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelRemuneracionEmpleador);
		
		this.comboBoxRemuneracionEmpleador = new JComboBox();
		this.comboBoxRemuneracionEmpleador.setBounds(23, 26, 167, 22);
		this.panelRemuneracionEmpleador.add(this.comboBoxRemuneracionEmpleador);
		
		this.textFieldPesoRemuneracionEmpleador = new JTextField();
		this.textFieldPesoRemuneracionEmpleador.setColumns(10);
		this.textFieldPesoRemuneracionEmpleador.setBounds(314, 27, 35, 20);
		this.panelRemuneracionEmpleador.add(this.textFieldPesoRemuneracionEmpleador);
		
		this.labelPesoRemuneracionEmpleador = new JLabel("Ponderacion:");
		this.labelPesoRemuneracionEmpleador.setBounds(241, 30, 63, 14);
		this.panelRemuneracionEmpleador.add(this.labelPesoRemuneracionEmpleador);
		
		this.panelCargaHorariaEmpleador = new JPanel();
		this.panelCargaHorariaEmpleador.setLayout(null);
		this.panelCargaHorariaEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Carga Horaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelCargaHorariaEmpleador);
		
		this.comboBoxCargaHorariaEmpleador = new JComboBox();
		this.comboBoxCargaHorariaEmpleador.setBounds(23, 26, 167, 22);
		this.panelCargaHorariaEmpleador.add(this.comboBoxCargaHorariaEmpleador);
		
		this.textFieldPesoCargaHorariaEmpleador = new JTextField();
		this.textFieldPesoCargaHorariaEmpleador.setColumns(10);
		this.textFieldPesoCargaHorariaEmpleador.setBounds(314, 27, 35, 20);
		this.panelCargaHorariaEmpleador.add(this.textFieldPesoCargaHorariaEmpleador);
		
		this.labelPesoCargaHorariaEmpleador = new JLabel("Ponderacion:");
		this.labelPesoCargaHorariaEmpleador.setBounds(241, 30, 63, 14);
		this.panelCargaHorariaEmpleador.add(this.labelPesoCargaHorariaEmpleador);
		
		this.panelTipoDePuestoEmpleador = new JPanel();
		this.panelTipoDePuestoEmpleador.setLayout(null);
		this.panelTipoDePuestoEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de Puesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelTipoDePuestoEmpleador);
		
		this.comboBoxTipoDePuestoEmpleador = new JComboBox();
		this.comboBoxTipoDePuestoEmpleador.setBounds(23, 26, 167, 22);
		this.panelTipoDePuestoEmpleador.add(this.comboBoxTipoDePuestoEmpleador);
		
		this.textFieldPesoTipoDePuestoEmpleador = new JTextField();
		this.textFieldPesoTipoDePuestoEmpleador.setColumns(10);
		this.textFieldPesoTipoDePuestoEmpleador.setBounds(314, 27, 35, 20);
		this.panelTipoDePuestoEmpleador.add(this.textFieldPesoTipoDePuestoEmpleador);
		
		this.labelPesoTipoDePuestoEmpleador = new JLabel("Ponderacion:");
		this.labelPesoTipoDePuestoEmpleador.setBounds(241, 30, 63, 14);
		this.panelTipoDePuestoEmpleador.add(this.labelPesoTipoDePuestoEmpleador);
		
		this.panelRangoEtarioEmpleador = new JPanel();
		this.panelRangoEtarioEmpleador.setLayout(null);
		this.panelRangoEtarioEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rango Etario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelRangoEtarioEmpleador);
		
		this.comboBoxRangoEtarioEmpleador = new JComboBox();
		this.comboBoxRangoEtarioEmpleador.setBounds(23, 26, 167, 22);
		this.panelRangoEtarioEmpleador.add(this.comboBoxRangoEtarioEmpleador);
		
		this.textFieldPesoRangoEtarioEmpleador = new JTextField();
		this.textFieldPesoRangoEtarioEmpleador.setColumns(10);
		this.textFieldPesoRangoEtarioEmpleador.setBounds(314, 27, 35, 20);
		this.panelRangoEtarioEmpleador.add(this.textFieldPesoRangoEtarioEmpleador);
		
		this.labelPesoRangoEtarioEmpleador = new JLabel("Ponderacion:");
		this.labelPesoRangoEtarioEmpleador.setBounds(241, 30, 63, 14);
		this.panelRangoEtarioEmpleador.add(this.labelPesoRangoEtarioEmpleador);
		
		this.panelExperienciaPreviaEmpleador = new JPanel();
		this.panelExperienciaPreviaEmpleador.setLayout(null);
		this.panelExperienciaPreviaEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Experiencia Previa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelExperienciaPreviaEmpleador);
		
		this.comboBoxExperienciaPreviaEmpleador = new JComboBox();
		this.comboBoxExperienciaPreviaEmpleador.setBounds(23, 26, 167, 22);
		this.panelExperienciaPreviaEmpleador.add(this.comboBoxExperienciaPreviaEmpleador);
		
		this.textFieldPesoExpPreviaEmpleador = new JTextField();
		this.textFieldPesoExpPreviaEmpleador.setColumns(10);
		this.textFieldPesoExpPreviaEmpleador.setBounds(314, 27, 35, 20);
		this.panelExperienciaPreviaEmpleador.add(this.textFieldPesoExpPreviaEmpleador);
		
		this.labelPesoExpPreviaEmpleador = new JLabel("Ponderacion:");
		this.labelPesoExpPreviaEmpleador.setBounds(241, 30, 63, 14);
		this.panelExperienciaPreviaEmpleador.add(this.labelPesoExpPreviaEmpleador);
		
		this.panelEstudiosCursadosEmpleador = new JPanel();
		this.panelEstudiosCursadosEmpleador.setLayout(null);
		this.panelEstudiosCursadosEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Estudios Cursados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelEstudiosCursadosEmpleador);
		
		this.comboBoxEstudiosCursadosEmpleador = new JComboBox();
		this.comboBoxEstudiosCursadosEmpleador.setBounds(24, 26, 167, 22);
		this.panelEstudiosCursadosEmpleador.add(this.comboBoxEstudiosCursadosEmpleador);
		
		this.textFieldPesoEstudiosCursadosEmpleador = new JTextField();
		this.textFieldPesoEstudiosCursadosEmpleador.setColumns(10);
		this.textFieldPesoEstudiosCursadosEmpleador.setBounds(314, 27, 35, 20);
		this.panelEstudiosCursadosEmpleador.add(this.textFieldPesoEstudiosCursadosEmpleador);
		
		this.labelPesoEstudiosCursadosEmpleador = new JLabel("Ponderacion:");
		this.labelPesoEstudiosCursadosEmpleador.setBounds(241, 30, 63, 14);
		this.panelEstudiosCursadosEmpleador.add(this.labelPesoEstudiosCursadosEmpleador);
		
		this.panelConfirmacionCreacionTicketEmpleador = new JPanel();
		this.panelCreacionTicketEmpleador.add(this.panelConfirmacionCreacionTicketEmpleador);
		
		this.btnConfirmacionCreacionTicket_1 = new JButton("Confirmar");
		this.panelConfirmacionCreacionTicketEmpleador.add(this.btnConfirmacionCreacionTicket_1);
		
		this.listTicketActualEmpleador = new JList();
		this.listTicketActualEmpleador.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketActualEmpleador.setBounds(10, 577, 389, 57);
		this.panelTicketEmpleador.add(this.listTicketActualEmpleador);
		
		this.panelRondaDeEleccionEmpleador = new JPanel();
		this.panelGeneralEmpleador.add(this.panelRondaDeEleccionEmpleador);
		this.panelRondaDeEleccionEmpleador.setLayout(null);
		
		this.panelRondaEleccionesEmpleador = new JPanel();
		this.panelRondaEleccionesEmpleador.setBorder(new TitledBorder(null, "Ronda de Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelRondaEleccionesEmpleador.setLayout(null);
		this.panelRondaEleccionesEmpleador.setBounds(10, 11, 395, 311);
		this.panelRondaDeEleccionEmpleador.add(this.panelRondaEleccionesEmpleador);
		
		this.listRondaEleccionesEmpleador = new JList();
		this.listRondaEleccionesEmpleador.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listRondaEleccionesEmpleador.setBounds(10, 23, 377, 221);
		this.panelRondaEleccionesEmpleador.add(this.listRondaEleccionesEmpleador);
		
		this.btnConfirmacionEleccionEmpleador = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleador.setBounds(162, 277, 89, 23);
		this.panelRondaEleccionesEmpleador.add(this.btnConfirmacionEleccionEmpleador);
		
		this.panelTicketSimplificado = new JPanel();
		this.panelTicketSimplificado.setBorder(new TitledBorder(null, "Crear Ticket Simplificado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelTicketSimplificado.setBounds(10, 332, 387, 165);
		this.panelRondaDeEleccionEmpleador.add(this.panelTicketSimplificado);
		this.panelTicketSimplificado.setLayout(null);
		
		this.panelEmpleadorRequisitosTicketSimp = new JPanel();
		this.panelEmpleadorRequisitosTicketSimp.setLayout(null);
		this.panelEmpleadorRequisitosTicketSimp.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleadorRequisitosTicketSimp.setBounds(10, 23, 366, 75);
		this.panelTicketSimplificado.add(this.panelEmpleadorRequisitosTicketSimp);
		
		this.comboBoxBolsaTipoTrabajo_1 = new JComboBox();
		this.comboBoxBolsaTipoTrabajo_1.setBounds(23, 26, 138, 22);
		this.panelEmpleadorRequisitosTicketSimp.add(this.comboBoxBolsaTipoTrabajo_1);
		
		this.comboBoxBolsaLocacion_1 = new JComboBox();
		this.comboBoxBolsaLocacion_1.setBounds(195, 26, 138, 22);
		this.panelEmpleadorRequisitosTicketSimp.add(this.comboBoxBolsaLocacion_1);
		
		this.lblBolsaTipoTrabajo_1 = new JLabel("Tipo de trabajo");
		this.lblBolsaTipoTrabajo_1.setBounds(53, 11, 81, 14);
		this.panelEmpleadorRequisitosTicketSimp.add(this.lblBolsaTipoTrabajo_1);
		
		this.lblBolsaLocacion_1 = new JLabel("Locación:");
		this.lblBolsaLocacion_1.setBounds(247, 11, 58, 14);
		this.panelEmpleadorRequisitosTicketSimp.add(this.lblBolsaLocacion_1);
		
		this.btnCrearTicketSimplificado = new JButton("Crear");
		this.btnCrearTicketSimplificado.setBounds(147, 109, 89, 23);
		this.panelTicketSimplificado.add(this.btnCrearTicketSimplificado);
		
		this.listTicketSimplificadosEmpleador = new JList();
		this.listTicketSimplificadosEmpleador.setBorder(new TitledBorder(null, "Tickets Simplificados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketSimplificadosEmpleador.setBounds(10, 510, 387, 124);
		this.panelRondaDeEleccionEmpleador.add(this.listTicketSimplificadosEmpleador);
		
		
		// ventana Agencia
		
	    this.textFieldCrearAgencia.addKeyListener(new UnKeyListener(this));

	       this.botonSalud.addMouseListener(new UnMouseListener(this));
	       this.botonComercioLocal.addMouseListener(new UnMouseListener(this));
	       this.botonComercioInternacional.addMouseListener(new UnMouseListener(this));
	       
	       this.botonJunior.addMouseListener(new UnMouseListener(this));
	       this.botonSenior.addMouseListener(new UnMouseListener(this));
	       this.botonManagement.addMouseListener(new UnMouseListener(this));
	       
	       this.botonMenosV1.addMouseListener(new UnMouseListener(this));
	       this.botonEntreV1yV2.addMouseListener(new UnMouseListener(this));
	       this.botonMasV2.addMouseListener(new UnMouseListener(this));
	       
	       this.botonConfirmarNombreAgencia.setActionCommand(confirmaCreacionAgencia);
	       this.botonConfirmarTiposTickets.setActionCommand(confirmaTipoTicket);
	       
	       this.botonConfirmarNombreAgencia.addActionListener(new ActionPerformedBotones(this));
	       this.botonConfirmarTiposTickets.addActionListener(new ActionPerformedBotones(this));
	       
	       /* if (hayRondaContrataciones) {
	       		this.botonRondaContrataciones.setEnabled(true);
	       	  else
	       	  	this.botonRondaContrataciones.setEnabled(false); //(esto viene por default en realidad pero no est� de m�s)
	       	  if (hayRondaContrataciones & hayRondaEncuentro) {
	       		this.botonRondaEncuentro.setEnabled(true);
	       	  else
	       	  	this.botonRondaEncuentro.setEnabled(false); //(esto viene por default en realidad pero no est� de m�s)
	       
	       */
	       
	       // ventana Empleado
	       
	    // Seteo de los botones en false para que aparezcan en gris
			
			this.btnConfirmarLogin.setEnabled(false);
			this.btnConfirmacionCreacionUsuario.setEnabled(false);
			this.btnConfirmacionCreacionTicket.setEnabled(false);
			this.btnCambiarEstado.setEnabled(false);
			this.btnConfirmacionEleccionEmpleado.setEnabled(false);
			this.btnBolsaAceptar.setEnabled(false);
			this.btnBolsaRechazar.setEnabled(false);
			this.btnInicioBolsa.setEnabled(false);
			
			// Funcionalidad de los botones
			
			this.btnConfirmarLogin.setActionCommand(confirmaLoginUsuario);
			this.btnConfirmacionCreacionUsuario.setActionCommand(confirmaCreacionUsuario);
			this.btnConfirmacionCreacionTicket.setActionCommand(confirmaCreacionTicket);
			this.btnConfirmacionEleccionEmpleado.setActionCommand(confirmaEleccionEmpleado);
			this.btnBolsaAceptar.setActionCommand(confirmaAceptacionTicket);
			this.btnBolsaRechazar.setActionCommand(confirmaRechazoTicket);
			this.btnInicioBolsa.setActionCommand(confirmaArranqueBDT);
			
			this.btnConfirmarLogin.addActionListener(new ActionPerformedBotones(this));
			this.btnConfirmacionCreacionUsuario.addActionListener(new ActionPerformedBotones(this));
			this.btnConfirmacionCreacionTicket.addActionListener(new ActionPerformedBotones(this));
			this.btnConfirmacionEleccionEmpleado.addActionListener(new ActionPerformedBotones(this));
			this.btnBolsaAceptar.addActionListener(new ActionPerformedBotones(this));
			this.btnBolsaRechazar.addActionListener(new ActionPerformedBotones(this));
			this.btnInicioBolsa.addActionListener(new ActionPerformedBotones(this));
			
			// Asigno a los textfield para que escuchen el texto ingresado por teclado (LOGIN)
			
			this.textFieldUsuario.addKeyListener(new UnKeyListener(this));
			this.textFieldContrasenia.addKeyListener(new UnKeyListener(this));
			
			
			//  Asigno a los textfield para que escuchen el texto ingresado por teclado (CREACION DE TECLADO)
			
			this.textFieldCreacionUsuario.addKeyListener(new UnKeyListener(this));
			this.textFieldCreacionContrasenia.addKeyListener(new UnKeyListener(this));
			this.textFieldCreacionNyA.addKeyListener(new UnKeyListener(this));
			this.textFieldDNI.addKeyListener(new UnKeyListener(this));
			this.textFieldTelefono.addKeyListener(new UnKeyListener(this));
			this.textFieldEdad.addKeyListener(new UnKeyListener(this));
			this.textFieldCiudad.addKeyListener(new UnKeyListener(this));
			
			this.textFieldPesoCargaHoraria.addKeyListener(new UnKeyListener(this));
			this.textFieldPesoLocacion.addKeyListener(new UnKeyListener(this));
			this.textFieldPesoRemuneracion.addKeyListener(new UnKeyListener(this));
			this.textFieldPesoTipoDePuesto.addKeyListener(new UnKeyListener(this));
			
			this.rdbtnActivo.addMouseListener(new UnMouseListener(this));
			this.rdbtnSuspendido.addMouseListener(new UnMouseListener(this));
			this.rdbtnCancelar.addMouseListener(new UnMouseListener(this));
			
			
			// ventana Empleador
			
			this.btnConfirmarLoginEmpleador.setEnabled(false);
			this.btnConfirmacionCreacionUsuario_1.setEnabled(false);
			this.btnConfirmacionCreacionTicket_1.setEnabled(false);
			this.btnCambiarEstadoEmpleador.setEnabled(false);
			this.btnConfirmacionEleccionEmpleador.setEnabled(false);
			this.btnCrearTicketSimplificado.setEnabled(false);
			this.btnInicioBolsa.setEnabled(false);
			
			this.btnConfirmarLoginEmpleador.setActionCommand(confirmarLoginEmpleador);
			this.btnConfirmacionCreacionUsuario_1.setActionCommand(confirmacionCreacionUsuario_1);
			this.btnConfirmacionCreacionTicket_1.setActionCommand(confirmacionCreacionTicket_1);
			this.btnCambiarEstadoEmpleador.setActionCommand(confirmaCambiorEstadoEmpleador);
			this.btnConfirmacionEleccionEmpleador.setActionCommand(confirmacionEleccionEmpleador);
			this.btnCrearTicketSimplificado.setActionCommand(confirmaCracionTicketSimplificado);
			
			this.rdbtnActivoEmpleador.addMouseListener(new UnMouseListener(this));
			this.rdbtnCancelarEmpleador.addMouseListener(new UnMouseListener(this));
			this.rdbtnSuspendidoEmpleador.addMouseListener(new UnMouseListener(this));
			
			this.textFieldUsuarioEmpleador.addKeyListener(new UnKeyListener(this));
			this.textFieldContraseniaEmpleador.addKeyListener(new UnKeyListener(this));
			
			
			this.textFieldCreacionUsuarioEmpleador.addKeyListener(new UnKeyListener(this));
			this.textFieldCreacionContraseniaEmpleador.addKeyListener(new UnKeyListener(this));
			this.textFieldCreacionNombreEmpleador.addKeyListener(new UnKeyListener(this));
			
			
		}
	       		
		public void setBotonConfirmarNombreAgencia(boolean hab) {
	        this.botonConfirmarNombreAgencia.setEnabled(hab);
	    }

		public void setBotonConfirmarTipoTickets(boolean hab) {
			this.botonConfirmarTiposTickets.setEnabled(hab);
		}
		
		public void setBotonConfirmarLogin(boolean hab) {
			this.btnConfirmarLogin.setEnabled(hab);
		}
		
		public void setBotonConfirmacionCreacionUsuario(boolean hab) {
			this.btnConfirmacionCreacionUsuario.setEnabled(hab);
	}
		
		public void setBotonConfirmarCreacionTicket(boolean hab1, boolean hab2) {
			boolean hab = hab1 && hab2;
			this.btnConfirmacionCreacionTicket.setEnabled(hab);
		}
		
		public void setCambiarEstadoTicketEmpleado(boolean hab) {
			this.btnCambiarEstado.setEnabled(hab);
		}
		
		public void setBotonConfirmarLoginEmpleador(boolean hab) {
			this.btnConfirmarLoginEmpleador.setEnabled(hab);
		}
		
		public void setCambiarEstadoTicketEmpleador(boolean hab) {
			this.btnCambiarEstadoEmpleador.setEnabled(hab);
		}
		
		public void setBotonConfirmacionEleccionEmpleado(boolean hab) {
			this.btnConfirmacionEleccionEmpleado.setEnabled(hab);
		}
		
		public void setBotonConfirmacionEleccionEmpleador(boolean hab) {
			this.btnConfirmacionEleccionEmpleador.setEnabled(hab);
		
		}
		
		public void setBotonAceptarYRechazarTicketSimplificado(boolean hab, boolean hab2) {
			boolean habFinal = hab && hab2;
			this.btnBolsaAceptar.setEnabled(habFinal);
			this.btnBolsaRechazar.setEnabled(habFinal); // seteo los dos botones de una porque esto es solo para verificar si seleccione el ticket simplificado
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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

		@Override
		public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
}
