package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;

public class IntentoDeVentana74 extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelAgencia;
	private JPanel panelEmpleado;
	private JPanel panelEmpleador;
	private JPanel PanelGeneralAgencia;
	private JPanel PanelFuncionalidades;
	private JPanel panelDatosTickets;
	private JPanel panelTiposTrabajo;
	private JRadioButton botonSalud;
	private JRadioButton botonComercioLocal;
	private JRadioButton botonComercioInternacional;
	private JPanel panelTipoDePuestoAgencia;
	private JRadioButton botonJunior;
	private JRadioButton botonSenior;
	private JRadioButton botonManagement;
	private JPanel panelRangoLaboral;
	private JRadioButton botonMenosV1;
	private JRadioButton botonEntreV1yV2;
	private JRadioButton botonMasV2;
	private JPanel panelConfirmacion;
	private JButton botonConfirmarTiposTickets;
	private JPanel panelCreacionAgencia;
	private JPanel panelNombreAgencia;
	private JPanel panel;
	private JLabel labelNombreAgencia;
	private JPanel panel_1;
	private JTextField textFieldCrearAgencia;
	private JPanel panelConfirmarNombreAgencia;
	private JButton botonConfirmarNombreAgencia;
	private JPanel panelRondaEncCont;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton botonRondaEncuentro;
	private JPanel panel_4;
	private JButton botonRondaContraciones;
	private JPanel panel_5;
	private JList listComisiones;
	private JPanel PanelListas;
	private JList listEmpleados;
	private JList listTicketEmpleados;
	private JList listEmpleadores;
	private JList listTicketEmpleadores;
	private JPanel panelGeneralEmpleado;
	private JPanel panelLoginCreacionEmpleado;
	private JPanel panelLogin;
	private JPanel panelUsuario;
	private JLabel lblUsuario;
	private JTextField textFieldUsuario;
	private JPanel panelContrasenia;
	private JLabel lblContrasenia;
	private JTextField textFieldContrasenia;
	private JPanel panelConfirmarLogin;
	private JButton btnConfirmarLogin;
	private JPanel panelCreacionEmpleado;
	private JPanel panelCreacionUsuario;
	private JLabel lblCreacionUsuario;
	private JTextField textFieldCreacionUsuario;
	private JPanel panelCreacionContrasenia;
	private JLabel lblCreacionContrasenia;
	private JTextField textFieldCreacionContrasenia;
	private JPanel panelCreacionNyA;
	private JLabel lblCreacionNyA;
	private JTextField textFieldCreacionNyA;
	private JPanel panelDNI;
	private JLabel lblDNI;
	private JTextField textFieldDNI;
	private JPanel panelTelefono;
	private JLabel lblTelefono;
	private JTextField textFieldTelefono;
	private JPanel panelEdad;
	private JLabel lblEdad;
	private JTextField textFieldEdad;
	private JPanel panelCiudad;
	private JLabel lblCiudad;
	private JTextField textFieldCiudad;
	private JPanel panelConfirmacionCreacionUsuario;
	private JButton btnConfirmacionCreacionUsuario;
	private JPanel panelTicket;
	private JPanel panelCreacionTicket;
	private JPanel panelLocacion;
	private JComboBox comboBoxLocacion;
	private JTextField textFieldPesoLocacion;
	private JLabel labelPesoLocacion;
	private JPanel panelRemuneracion;
	private JComboBox comboBoxRemuneracion;
	private JTextField textFieldPesoRemuneracion;
	private JLabel labelPesoRemuneracion;
	private JPanel panelCargaHoraria;
	private JComboBox comboBoxCargaHoraria;
	private JTextField textFieldPesoCargaHoraria;
	private JLabel labelPesoCargaHoraria;
	private JPanel panelTipoDePuesto;
	private JComboBox comboBoxTipoDePuesto;
	private JTextField textFieldPesoTipoDePuesto;
	private JLabel labelPesoTipoDePuesto;
	private JPanel panelRangoEtario;
	private JComboBox comboBoxRangoEtario;
	private JTextField textFieldPesoRangoEtario;
	private JLabel labelPesoRangoEtario;
	private JPanel panelExperienciaPrevia;
	private JComboBox comboBoxExperienciaPrevia;
	private JTextField textFieldPesoExperienciaPrevia;
	private JLabel labelPesoExperienciaPrevia;
	private JPanel panelEstudiosCursados;
	private JComboBox comboBoxEstudiosCursados;
	private JTextField textFieldPesoEstudiosCursados;
	private JLabel labelPesoEstudiosCursados;
	private JPanel panelConfirmacionCreacionTicket;
	private JButton btnConfirmacionCreacionTicket;
	private JList listTicketActual;
	private JPanel panelEleccionYBolsa;
	private JPanel panelRondaElecciones;
	private JList listRondaEleccionesEmpleado;
	private JButton btnConfirmacionEleccionEmpleado;
	private JPanel panelBolsaTrabajo;
	private JPanel panelEmpleadoRequisitosBolsa;
	private JComboBox comboBoxBolsaTipoTrabajo;
	private JComboBox comboBoxBolsaLocacion;
	private JLabel lblBolsaTipoTrabajo;
	private JLabel lblBolsaLocacion;
	private JPanel panelPantallaBolsa;
	private JList listTicketSimpActual;
	private JButton btnBolsaAceptar;
	private JButton btnBolsaRechazar;
	private JButton btnInicioBolsa;
	private JPanel panelGeneralEmpleador;
	private JPanel panelLoginCreacionEmpleador;
	private JPanel panelLoginEmpleador;
	private JPanel panelUsuarioEmpleador;
	private JLabel lblUsuarioEmpleador;
	private JTextField textFieldUsuarioEmpleador;
	private JPanel panelContraseniaEmpleador;
	private JLabel lblContraseniaEmpleador;
	private JTextField textFieldEmpleador;
	private JPanel panelConfirmarLoginEmpleador;
	private JButton btnConfirmarLoginEmpleador;
	private JPanel panelCreacionEmpleador;
	private JPanel panelCreacionUsuarioEmpleador;
	private JLabel lblCreacionUsuarioEmpleador;
	private JTextField textFieldCreacionUsuarioEmpleador;
	private JPanel panelCreacionContraseniaEmpleador;
	private JLabel lblCreacionContraseniaEmpleador;
	private JTextField textFieldCreacionContraseniaEmpleador;
	private JPanel panelCreacionNombreEmpleador;
	private JLabel lblCreacionNombreEmpleador;
	private JTextField textFieldCreacionNombreEmpleador;
	private JPanel panelTipoPersonaEmpleador;
	private JLabel lblTipoPersonaEmpleador;
	private JPanel panelRubroEmpleador;
	private JLabel lblRubroEmpleador;
	private JPanel panelConfirmacionCreacionUsuario_1;
	private JButton btnConfirmacionCreacionUsuario_1;
	private JComboBox comboBoxTipoPersonaEmpleador;
	private JComboBox comboBoxRubroEmpleador;
	private JPanel panelTicketEmpleador;
	private JPanel panelCreacionTicketEmpleador;
	private JPanel panelLocacionEmpleador;
	private JComboBox comboBoxLocacionEmpleador;
	private JTextField textFieldPesoLocacionEmpleador;
	private JLabel labelPesoLocacionEmpleador;
	private JPanel panelRemuneracionEmpleador;
	private JComboBox comboBoxRemuneracionEmpleador;
	private JTextField textFieldPesoRemuneracionEmpleador;
	private JLabel labelPesoRemuneracionEmpleador;
	private JPanel panelCargaHorariaEmpleador;
	private JComboBox comboBoxCargaHorariaEmpleador;
	private JTextField textFieldPesoCargaHorariaEmpleador;
	private JLabel labelPesoCargaHorariaEmpleador;
	private JPanel panelTipoDePuestoEmpleador;
	private JComboBox comboBoxTipoDePuestoEmpleador;
	private JTextField textFieldPesoTipoDePuestoEmpleador;
	private JLabel labelPesoTipoDePuestoEmpleador;
	private JPanel panelRangoEtarioEmpleador;
	private JComboBox comboBoxRangoEtarioEmpleador;
	private JTextField textFieldPesoRangoEtarioEmpleador;
	private JLabel labelPesoRangoEtarioEmpleador;
	private JPanel panelExperienciaPreviaEmpleador;
	private JComboBox comboBoxExperienciaPreviaEmpleador;
	private JTextField textFieldPesoExpPreviaEmpleador;
	private JLabel labelPesoExpPreviaEmpleador;
	private JPanel panelEstudiosCursadosEmpleador;
	private JComboBox comboBoxEstudiosCursadosEmpleador;
	private JTextField textFieldPesoEstudiosCursadosEmpleador;
	private JLabel labelPesoEstudiosCursadosEmpleador;
	private JPanel panelConfirmacionCreacionTicketEmpleador;
	private JButton btnConfirmacionCreacionTicket_1;
	private JList listTicketActualEmpleador;
	private JPanel panelRondaDeEleccionEmpleador;
	private JPanel panelRondaEleccionesEmpleador;
	private JList listRondaEleccionesEmpleador;
	private JButton btnConfirmacionEleccionEmpleador;
	private JPanel panel_7;
	private JPanel panelEmpleadorRequisitosTicketSimp;
	private JComboBox comboBoxBolsaTipoTrabajo_1;
	private JComboBox comboBoxBolsaLocacion_1;
	private JLabel lblBolsaTipoTrabajo_1;
	private JLabel lblBolsaLocacion_1;
	private JButton btnCrearTicketSimplificado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntentoDeVentana74 frame = new IntentoDeVentana74();
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
	public IntentoDeVentana74() {
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
		this.panelCreacionEmpleado.setBounds(10, 214, 389, 448);
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
		this.panelCreacionTicket.setBounds(10, 11, 389, 556);
		this.panelTicket.add(this.panelCreacionTicket);
		this.panelCreacionTicket.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setLayout(null);
		this.panelLocacion.setBorder(new TitledBorder(null, "Locaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.add(this.panelLocacion);
		
		this.comboBoxLocacion = new JComboBox();
		this.comboBoxLocacion.setBounds(23, 26, 167, 22);
		this.panelLocacion.add(this.comboBoxLocacion);
		
		this.textFieldPesoLocacion = new JTextField();
		this.textFieldPesoLocacion.setColumns(10);
		this.textFieldPesoLocacion.setBounds(314, 27, 35, 20);
		this.panelLocacion.add(this.textFieldPesoLocacion);
		
		this.labelPesoLocacion = new JLabel("Ponderación:");
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
		
		this.labelPesoRemuneracion = new JLabel("Ponderación:");
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
		
		this.labelPesoCargaHoraria = new JLabel("Ponderación:");
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
		
		this.labelPesoTipoDePuesto = new JLabel("Ponderación:");
		this.labelPesoTipoDePuesto.setBounds(241, 30, 63, 14);
		this.panelTipoDePuesto.add(this.labelPesoTipoDePuesto);
		
		this.panelRangoEtario = new JPanel();
		this.panelRangoEtario.setLayout(null);
		this.panelRangoEtario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rango Etario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelRangoEtario);
		
		this.comboBoxRangoEtario = new JComboBox();
		this.comboBoxRangoEtario.setBounds(23, 26, 167, 22);
		this.panelRangoEtario.add(this.comboBoxRangoEtario);
		
		this.textFieldPesoRangoEtario = new JTextField();
		this.textFieldPesoRangoEtario.setColumns(10);
		this.textFieldPesoRangoEtario.setBounds(314, 27, 35, 20);
		this.panelRangoEtario.add(this.textFieldPesoRangoEtario);
		
		this.labelPesoRangoEtario = new JLabel("Ponderación:");
		this.labelPesoRangoEtario.setBounds(241, 30, 63, 14);
		this.panelRangoEtario.add(this.labelPesoRangoEtario);
		
		this.panelExperienciaPrevia = new JPanel();
		this.panelExperienciaPrevia.setLayout(null);
		this.panelExperienciaPrevia.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Experiencia Previa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelExperienciaPrevia);
		
		this.comboBoxExperienciaPrevia = new JComboBox();
		this.comboBoxExperienciaPrevia.setBounds(23, 26, 167, 22);
		this.panelExperienciaPrevia.add(this.comboBoxExperienciaPrevia);
		
		this.textFieldPesoExperienciaPrevia = new JTextField();
		this.textFieldPesoExperienciaPrevia.setColumns(10);
		this.textFieldPesoExperienciaPrevia.setBounds(314, 27, 35, 20);
		this.panelExperienciaPrevia.add(this.textFieldPesoExperienciaPrevia);
		
		this.labelPesoExperienciaPrevia = new JLabel("Ponderación:");
		this.labelPesoExperienciaPrevia.setBounds(241, 30, 63, 14);
		this.panelExperienciaPrevia.add(this.labelPesoExperienciaPrevia);
		
		this.panelEstudiosCursados = new JPanel();
		this.panelEstudiosCursados.setLayout(null);
		this.panelEstudiosCursados.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Estudios Cursados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelEstudiosCursados);
		
		this.comboBoxEstudiosCursados = new JComboBox();
		this.comboBoxEstudiosCursados.setBounds(23, 26, 167, 22);
		this.panelEstudiosCursados.add(this.comboBoxEstudiosCursados);
		
		this.textFieldPesoEstudiosCursados = new JTextField();
		this.textFieldPesoEstudiosCursados.setColumns(10);
		this.textFieldPesoEstudiosCursados.setBounds(314, 27, 35, 20);
		this.panelEstudiosCursados.add(this.textFieldPesoEstudiosCursados);
		
		this.labelPesoEstudiosCursados = new JLabel("Ponderación:");
		this.labelPesoEstudiosCursados.setBounds(241, 30, 63, 14);
		this.panelEstudiosCursados.add(this.labelPesoEstudiosCursados);
		
		this.panelConfirmacionCreacionTicket = new JPanel();
		this.panelCreacionTicket.add(this.panelConfirmacionCreacionTicket);
		
		this.btnConfirmacionCreacionTicket = new JButton("Confirmar");
		this.panelConfirmacionCreacionTicket.add(this.btnConfirmacionCreacionTicket);
		
		this.listTicketActual = new JList();
		this.listTicketActual.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketActual.setBounds(10, 578, 389, 57);
		this.panelTicket.add(this.listTicketActual);
		
		this.panelEleccionYBolsa = new JPanel();
		this.panelEleccionYBolsa.setBorder(new TitledBorder(null, "Ronda de Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		
		this.lblBolsaLocacion = new JLabel("Locación:");
		this.lblBolsaLocacion.setBounds(247, 11, 58, 14);
		this.panelEmpleadoRequisitosBolsa.add(this.lblBolsaLocacion);
		
		this.panelPantallaBolsa = new JPanel();
		this.panelPantallaBolsa.setLayout(null);
		this.panelPantallaBolsa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		this.textFieldEmpleador = new JTextField();
		this.textFieldEmpleador.setColumns(10);
		this.textFieldEmpleador.setBounds(172, 19, 176, 20);
		this.panelContraseniaEmpleador.add(this.textFieldEmpleador);
		
		this.panelConfirmarLoginEmpleador = new JPanel();
		this.panelConfirmarLoginEmpleador.setLayout(null);
		this.panelLoginEmpleador.add(this.panelConfirmarLoginEmpleador);
		
		this.btnConfirmarLoginEmpleador = new JButton("Confirmar");
		this.btnConfirmarLoginEmpleador.setBounds(135, 26, 89, 23);
		this.panelConfirmarLoginEmpleador.add(this.btnConfirmarLoginEmpleador);
		
		this.panelCreacionEmpleador = new JPanel();
		this.panelCreacionEmpleador.setBorder(new TitledBorder(null, "Crear Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionEmpleador.setBounds(10, 214, 389, 448);
		this.panelLoginCreacionEmpleador.add(this.panelCreacionEmpleador);
		this.panelCreacionEmpleador.setLayout(new GridLayout(8, 0, 0, 0));
		
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
		this.panelLocacionEmpleador.setBorder(new TitledBorder(null, "Locaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicketEmpleador.add(this.panelLocacionEmpleador);
		
		this.comboBoxLocacionEmpleador = new JComboBox();
		this.comboBoxLocacionEmpleador.setBounds(23, 26, 167, 22);
		this.panelLocacionEmpleador.add(this.comboBoxLocacionEmpleador);
		
		this.textFieldPesoLocacionEmpleador = new JTextField();
		this.textFieldPesoLocacionEmpleador.setColumns(10);
		this.textFieldPesoLocacionEmpleador.setBounds(314, 27, 35, 20);
		this.panelLocacionEmpleador.add(this.textFieldPesoLocacionEmpleador);
		
		this.labelPesoLocacionEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoRemuneracionEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoCargaHorariaEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoTipoDePuestoEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoRangoEtarioEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoExpPreviaEmpleador = new JLabel("Ponderación:");
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
		
		this.labelPesoEstudiosCursadosEmpleador = new JLabel("Ponderación:");
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
		
		this.panel_7 = new JPanel();
		this.panel_7.setBorder(new TitledBorder(null, "Crear Ticket Simplificado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_7.setBounds(10, 332, 387, 165);
		this.panelRondaDeEleccionEmpleador.add(this.panel_7);
		this.panel_7.setLayout(null);
		
		this.panelEmpleadorRequisitosTicketSimp = new JPanel();
		this.panelEmpleadorRequisitosTicketSimp.setLayout(null);
		this.panelEmpleadorRequisitosTicketSimp.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleadorRequisitosTicketSimp.setBounds(10, 23, 366, 75);
		this.panel_7.add(this.panelEmpleadorRequisitosTicketSimp);
		
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
		this.panel_7.add(this.btnCrearTicketSimplificado);
	}

}
