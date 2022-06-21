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
	private JPanel panelTipoDePuesto;
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
	private JTextField textField;
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
	private JPanel panelLoginCreacion;
	private JPanel panelLogin;
	private JPanel panelUsuario;
	private JLabel lblUsuario;
	private JTextField textField_1;
	private JPanel panelContrasenia;
	private JLabel lblContrasenia;
	private JTextField textField_2;
	private JPanel panelConfirmarLogin;
	private JButton btnConfirmarLogin;
	private JPanel panelCreacionEmpleado;
	private JPanel panelCreacionUsuario;
	private JLabel lblCreacionUsuario;
	private JTextField textField_3;
	private JPanel panelCreacionContrasenia;
	private JLabel lblCreacionContrasenia;
	private JTextField textField_4;
	private JPanel panelCreacionNyA;
	private JLabel lblCreacionNyA;
	private JTextField textField_5;
	private JPanel panelDNI;
	private JLabel lblDNI;
	private JTextField textField_6;
	private JPanel panelTelefono;
	private JLabel lblTelefono;
	private JTextField textField_7;
	private JPanel panelEdad;
	private JLabel lblEdad;
	private JTextField textField_8;
	private JPanel panelCiudad;
	private JLabel lblCiudad;
	private JTextField textField_9;
	private JPanel panelConfirmacionCreacionUsuario;
	private JButton btnConfirmacionCreacionUsuario;
	private JPanel panelTicket;
	private JPanel panelCreacionTicket;
	private JPanel panelLocacion;
	private JComboBox comboBoxLocacion;
	private JTextField textField_10;
	private JLabel labelPesoLocacion;
	private JPanel panelRemuneracion;
	private JComboBox comboBoxRemuneracion;
	private JTextField textField_11;
	private JLabel labelPesoRemuneracion;
	private JPanel panelCargaHoraria;
	private JComboBox comboBoxCargaHoraria;
	private JTextField textField_12;
	private JLabel labelPesoCargaHoraria;
	private JPanel panelTipoDePuesto_1;
	private JComboBox comboBoxTipoDePuesto;
	private JTextField textField_13;
	private JLabel labelPesoTipoDePuesto;
	private JPanel panelRangoEtario;
	private JComboBox comboBoxRangoEtario;
	private JTextField textField_14;
	private JLabel labelPesoRangoEtario;
	private JPanel panelExperienciaPrevia;
	private JComboBox comboBoxExperienciaPrevia;
	private JTextField textField_15;
	private JLabel labelPesoExperienciaPrevia;
	private JPanel panelEstudiosCursados;
	private JComboBox comboBoxEstudiosCursados;
	private JTextField textField_16;
	private JLabel labelPesoEstudiosCursados;
	private JPanel panelConfirmacionCreacionTicket;
	private JButton btnConfirmacionCreacionTicket;
	private JList list;
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
		this.tabbedPane.addTab("New tab", null, this.panelAgencia, null);
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
		
		this.panelTipoDePuesto = new JPanel();
		this.panelTipoDePuesto.setBorder(new TitledBorder(null, "Tipos de puesto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelDatosTickets.add(this.panelTipoDePuesto);
		this.panelTipoDePuesto.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonJunior = new JRadioButton("Junior");
		this.panelTipoDePuesto.add(this.botonJunior);
		
		this.botonSenior = new JRadioButton("Senior");
		this.panelTipoDePuesto.add(this.botonSenior);
		
		this.botonManagement = new JRadioButton("Management");
		this.panelTipoDePuesto.add(this.botonManagement);
		
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
		
		this.textField = new JTextField();
		this.textField.setColumns(10);
		this.panel_1.add(this.textField);
		
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
		this.tabbedPane.addTab("New tab", null, this.panelEmpleado, null);
		this.panelEmpleado.setLayout(new BorderLayout(0, 0));
		
		this.panelGeneralEmpleado = new JPanel();
		this.panelEmpleado.add(this.panelGeneralEmpleado, BorderLayout.CENTER);
		this.panelGeneralEmpleado.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelLoginCreacion = new JPanel();
		this.panelLoginCreacion.setLayout(null);
		this.panelGeneralEmpleado.add(this.panelLoginCreacion);
		
		this.panelLogin = new JPanel();
		this.panelLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelLogin.setBounds(10, 11, 389, 202);
		this.panelLoginCreacion.add(this.panelLogin);
		this.panelLogin.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panelUsuario = new JPanel();
		this.panelUsuario.setLayout(null);
		this.panelLogin.add(this.panelUsuario);
		
		this.lblUsuario = new JLabel("Usuario:");
		this.lblUsuario.setBounds(70, 22, 46, 14);
		this.panelUsuario.add(this.lblUsuario);
		
		this.textField_1 = new JTextField();
		this.textField_1.setColumns(10);
		this.textField_1.setBounds(172, 19, 176, 20);
		this.panelUsuario.add(this.textField_1);
		
		this.panelContrasenia = new JPanel();
		this.panelContrasenia.setLayout(null);
		this.panelLogin.add(this.panelContrasenia);
		
		this.lblContrasenia = new JLabel("Contraseña:");
		this.lblContrasenia.setBounds(61, 22, 60, 14);
		this.panelContrasenia.add(this.lblContrasenia);
		
		this.textField_2 = new JTextField();
		this.textField_2.setColumns(10);
		this.textField_2.setBounds(172, 19, 176, 20);
		this.panelContrasenia.add(this.textField_2);
		
		this.panelConfirmarLogin = new JPanel();
		this.panelConfirmarLogin.setLayout(null);
		this.panelLogin.add(this.panelConfirmarLogin);
		
		this.btnConfirmarLogin = new JButton("Confirmar");
		this.btnConfirmarLogin.setBounds(135, 26, 89, 23);
		this.panelConfirmarLogin.add(this.btnConfirmarLogin);
		
		this.panelCreacionEmpleado = new JPanel();
		this.panelCreacionEmpleado.setBorder(new TitledBorder(null, "Crear Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionEmpleado.setBounds(10, 214, 389, 448);
		this.panelLoginCreacion.add(this.panelCreacionEmpleado);
		this.panelCreacionEmpleado.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelCreacionUsuario = new JPanel();
		this.panelCreacionUsuario.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionUsuario);
		
		this.lblCreacionUsuario = new JLabel("Usuario:");
		this.lblCreacionUsuario.setBounds(70, 22, 46, 14);
		this.panelCreacionUsuario.add(this.lblCreacionUsuario);
		
		this.textField_3 = new JTextField();
		this.textField_3.setColumns(10);
		this.textField_3.setBounds(172, 19, 176, 20);
		this.panelCreacionUsuario.add(this.textField_3);
		
		this.panelCreacionContrasenia = new JPanel();
		this.panelCreacionContrasenia.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionContrasenia);
		
		this.lblCreacionContrasenia = new JLabel("Contraseña:");
		this.lblCreacionContrasenia.setBounds(61, 22, 60, 14);
		this.panelCreacionContrasenia.add(this.lblCreacionContrasenia);
		
		this.textField_4 = new JTextField();
		this.textField_4.setColumns(10);
		this.textField_4.setBounds(172, 19, 176, 20);
		this.panelCreacionContrasenia.add(this.textField_4);
		
		this.panelCreacionNyA = new JPanel();
		this.panelCreacionNyA.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCreacionNyA);
		
		this.lblCreacionNyA = new JLabel("Nombre y Apellido:");
		this.lblCreacionNyA.setBounds(47, 22, 95, 14);
		this.panelCreacionNyA.add(this.lblCreacionNyA);
		
		this.textField_5 = new JTextField();
		this.textField_5.setColumns(10);
		this.textField_5.setBounds(172, 19, 176, 20);
		this.panelCreacionNyA.add(this.textField_5);
		
		this.panelDNI = new JPanel();
		this.panelDNI.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelDNI);
		
		this.lblDNI = new JLabel("DNI:");
		this.lblDNI.setBounds(82, 22, 39, 14);
		this.panelDNI.add(this.lblDNI);
		
		this.textField_6 = new JTextField();
		this.textField_6.setColumns(10);
		this.textField_6.setBounds(172, 19, 176, 20);
		this.panelDNI.add(this.textField_6);
		
		this.panelTelefono = new JPanel();
		this.panelTelefono.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelTelefono);
		
		this.lblTelefono = new JLabel("Telefono:");
		this.lblTelefono.setBounds(69, 22, 52, 14);
		this.panelTelefono.add(this.lblTelefono);
		
		this.textField_7 = new JTextField();
		this.textField_7.setColumns(10);
		this.textField_7.setBounds(172, 19, 176, 20);
		this.panelTelefono.add(this.textField_7);
		
		this.panelEdad = new JPanel();
		this.panelEdad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelEdad);
		
		this.lblEdad = new JLabel("Edad:");
		this.lblEdad.setBounds(81, 22, 40, 14);
		this.panelEdad.add(this.lblEdad);
		
		this.textField_8 = new JTextField();
		this.textField_8.setColumns(10);
		this.textField_8.setBounds(172, 19, 176, 20);
		this.panelEdad.add(this.textField_8);
		
		this.panelCiudad = new JPanel();
		this.panelCiudad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCiudad);
		
		this.lblCiudad = new JLabel("Ciudad:");
		this.lblCiudad.setBounds(76, 22, 45, 14);
		this.panelCiudad.add(this.lblCiudad);
		
		this.textField_9 = new JTextField();
		this.textField_9.setColumns(10);
		this.textField_9.setBounds(172, 19, 176, 20);
		this.panelCiudad.add(this.textField_9);
		
		this.panelConfirmacionCreacionUsuario = new JPanel();
		this.panelCreacionEmpleado.add(this.panelConfirmacionCreacionUsuario);
		
		this.btnConfirmacionCreacionUsuario = new JButton("Confirmar");
		this.panelConfirmacionCreacionUsuario.add(this.btnConfirmacionCreacionUsuario);
		
		this.panelTicket = new JPanel();
		this.panelTicket.setLayout(null);
		this.panelGeneralEmpleado.add(this.panelTicket);
		
		this.panelCreacionTicket = new JPanel();
		this.panelCreacionTicket.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.setBounds(10, 11, 389, 591);
		this.panelTicket.add(this.panelCreacionTicket);
		this.panelCreacionTicket.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setLayout(null);
		this.panelLocacion.setBorder(new TitledBorder(null, "Locaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.add(this.panelLocacion);
		
		this.comboBoxLocacion = new JComboBox();
		this.comboBoxLocacion.setBounds(23, 26, 167, 22);
		this.panelLocacion.add(this.comboBoxLocacion);
		
		this.textField_10 = new JTextField();
		this.textField_10.setColumns(10);
		this.textField_10.setBounds(314, 27, 35, 20);
		this.panelLocacion.add(this.textField_10);
		
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
		
		this.textField_11 = new JTextField();
		this.textField_11.setColumns(10);
		this.textField_11.setBounds(314, 27, 35, 20);
		this.panelRemuneracion.add(this.textField_11);
		
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
		
		this.textField_12 = new JTextField();
		this.textField_12.setColumns(10);
		this.textField_12.setBounds(314, 27, 35, 20);
		this.panelCargaHoraria.add(this.textField_12);
		
		this.labelPesoCargaHoraria = new JLabel("Ponderación:");
		this.labelPesoCargaHoraria.setBounds(241, 30, 63, 14);
		this.panelCargaHoraria.add(this.labelPesoCargaHoraria);
		
		this.panelTipoDePuesto_1 = new JPanel();
		this.panelTipoDePuesto_1.setLayout(null);
		this.panelTipoDePuesto_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tipo de Puesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelTipoDePuesto_1);
		
		this.comboBoxTipoDePuesto = new JComboBox();
		this.comboBoxTipoDePuesto.setBounds(23, 26, 167, 22);
		this.panelTipoDePuesto_1.add(this.comboBoxTipoDePuesto);
		
		this.textField_13 = new JTextField();
		this.textField_13.setColumns(10);
		this.textField_13.setBounds(314, 27, 35, 20);
		this.panelTipoDePuesto_1.add(this.textField_13);
		
		this.labelPesoTipoDePuesto = new JLabel("Ponderación:");
		this.labelPesoTipoDePuesto.setBounds(241, 30, 63, 14);
		this.panelTipoDePuesto_1.add(this.labelPesoTipoDePuesto);
		
		this.panelRangoEtario = new JPanel();
		this.panelRangoEtario.setLayout(null);
		this.panelRangoEtario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Rango Etario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelRangoEtario);
		
		this.comboBoxRangoEtario = new JComboBox();
		this.comboBoxRangoEtario.setBounds(23, 26, 167, 22);
		this.panelRangoEtario.add(this.comboBoxRangoEtario);
		
		this.textField_14 = new JTextField();
		this.textField_14.setColumns(10);
		this.textField_14.setBounds(314, 27, 35, 20);
		this.panelRangoEtario.add(this.textField_14);
		
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
		
		this.textField_15 = new JTextField();
		this.textField_15.setColumns(10);
		this.textField_15.setBounds(314, 27, 35, 20);
		this.panelExperienciaPrevia.add(this.textField_15);
		
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
		
		this.textField_16 = new JTextField();
		this.textField_16.setColumns(10);
		this.textField_16.setBounds(314, 27, 35, 20);
		this.panelEstudiosCursados.add(this.textField_16);
		
		this.labelPesoEstudiosCursados = new JLabel("Ponderación:");
		this.labelPesoEstudiosCursados.setBounds(241, 30, 63, 14);
		this.panelEstudiosCursados.add(this.labelPesoEstudiosCursados);
		
		this.panelConfirmacionCreacionTicket = new JPanel();
		this.panelCreacionTicket.add(this.panelConfirmacionCreacionTicket);
		
		this.btnConfirmacionCreacionTicket = new JButton("Confirmar");
		this.panelConfirmacionCreacionTicket.add(this.btnConfirmacionCreacionTicket);
		
		this.list = new JList();
		this.list.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.list.setBounds(10, 605, 389, 57);
		this.panelTicket.add(this.list);
		
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
		this.btnInicioBolsa.setBounds(162, 286, 89, 23);
		this.panelBolsaTrabajo.add(this.btnInicioBolsa);
		
		this.panelEmpleador = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panelEmpleador, null);
	}

}
