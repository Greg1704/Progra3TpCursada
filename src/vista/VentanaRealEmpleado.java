package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.border.LineBorder;

public class VentanaRealEmpleado extends JFrame implements MouseListener, KeyListener, ItemListener, ActionListener{

	protected JPanel contentPane;
	protected JPanel panelEmpleado;
	protected JPanel panelLoginCreacion;
	protected JPanel panelTicket;
	protected JPanel panelEleccionYBolsa;
	protected JPanel panelLogin;
	protected JPanel panelUsuario;
	protected JPanel panelContrasenia;
	protected JPanel panelConfirmarLogin;
	protected JLabel lblUsuario;
	protected JTextField textFieldUsuario;
	protected JLabel lblContrasenia;
	protected JTextField textFieldContrasenia;
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
	protected JTextField textFieldPesoRangoEtario;
	protected JLabel labelPesoRangoEtario;
	protected JPanel panelExperienciaPrevia;
	protected JComboBox comboBoxExperienciaPrevia;
	protected JTextField textFieldPesoExperienciaPrevia;
	protected JLabel labelPesoExperienciaPrevia;
	protected JPanel panelEstudiosCursados;
	protected JComboBox comboBoxEstudiosCursados;
	protected JTextField textFieldPesoEstudiosCursados;
	protected JLabel labelPesoEstudiosCursados;
	protected JPanel panelConfirmacionCreacionTicket;
	protected JButton btnConfirmacionCreacionTicket;
	protected JPanel panelRondaElecciones;
	protected JPanel panelBolsaTrabajo;
	protected JList listRondaEleccionesEmpleado;
	protected JButton btnConfirmacionEleccionEmpleado;
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
	protected JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRealEmpleado frame = new VentanaRealEmpleado();
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
	public VentanaRealEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 722);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.panelEmpleado = new JPanel();
		this.contentPane.add(this.panelEmpleado, BorderLayout.CENTER);
		this.panelEmpleado.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panelLoginCreacion = new JPanel();
		this.panelEmpleado.add(this.panelLoginCreacion);
		this.panelLoginCreacion.setLayout(null);
		
		this.panelLogin = new JPanel();
		this.panelLogin.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelLogin.setBounds(10, 11, 389, 202);
		this.panelLoginCreacion.add(this.panelLogin);
		this.panelLogin.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panelUsuario = new JPanel();
		this.panelLogin.add(this.panelUsuario);
		this.panelUsuario.setLayout(null);
		
		this.lblUsuario = new JLabel("Usuario:");
		this.lblUsuario.setBounds(70, 22, 46, 14);
		this.panelUsuario.add(this.lblUsuario);
		
		this.textFieldUsuario = new JTextField();
		this.textFieldUsuario.setBounds(172, 19, 176, 20);
		this.panelUsuario.add(this.textFieldUsuario);
		this.textFieldUsuario.setColumns(10);
		
		this.panelContrasenia = new JPanel();
		this.panelLogin.add(this.panelContrasenia);
		this.panelContrasenia.setLayout(null);
		
		this.lblContrasenia = new JLabel("Contraseña:");
		this.lblContrasenia.setBounds(61, 22, 60, 14);
		this.panelContrasenia.add(this.lblContrasenia);
		
		this.textFieldContrasenia = new JTextField();
		this.textFieldContrasenia.setColumns(10);
		this.textFieldContrasenia.setBounds(172, 19, 176, 20);
		this.panelContrasenia.add(this.textFieldContrasenia);
		
		this.panelConfirmarLogin = new JPanel();
		this.panelLogin.add(this.panelConfirmarLogin);
		this.panelConfirmarLogin.setLayout(null);
		
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
		this.panelEmpleado.add(this.panelTicket);
		this.panelTicket.setLayout(null);
		
		this.panelCreacionTicket = new JPanel();
		this.panelCreacionTicket.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.setBounds(10, 11, 389, 591);
		this.panelTicket.add(this.panelCreacionTicket);
		this.panelCreacionTicket.setLayout(new GridLayout(8, 0, 0, 0));
		
		this.panelLocacion = new JPanel();
		this.panelLocacion.setBorder(new TitledBorder(null, "Locaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.add(this.panelLocacion);
		this.panelLocacion.setLayout(null);
		
		this.comboBoxLocacion = new JComboBox();
		this.comboBoxLocacion.setBounds(23, 26, 167, 22);
		this.panelLocacion.add(this.comboBoxLocacion);
		
		this.textFieldPesoLocacion = new JTextField();
		this.textFieldPesoLocacion.setBounds(314, 27, 35, 20);
		this.panelLocacion.add(this.textFieldPesoLocacion);
		this.textFieldPesoLocacion.setColumns(10);
		
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
		
		this.list = new JList();
		this.list.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.list.setBounds(10, 605, 389, 57);
		this.panelTicket.add(this.list);
		
		this.panelEleccionYBolsa = new JPanel();
		this.panelEleccionYBolsa.setBorder(new TitledBorder(null, "Ronda de Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleado.add(this.panelEleccionYBolsa);
		this.panelEleccionYBolsa.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panelRondaElecciones = new JPanel();
		this.panelEleccionYBolsa.add(this.panelRondaElecciones);
		this.panelRondaElecciones.setLayout(null);
		
		this.listRondaEleccionesEmpleado = new JList();
		this.listRondaEleccionesEmpleado.setBorder(new TitledBorder(null, "Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listRondaEleccionesEmpleado.setBounds(10, 11, 377, 233);
		this.panelRondaElecciones.add(this.listRondaEleccionesEmpleado);
		
		this.btnConfirmacionEleccionEmpleado = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleado.setBounds(162, 277, 89, 23);
		this.panelRondaElecciones.add(this.btnConfirmacionEleccionEmpleado);
		
		this.panelBolsaTrabajo = new JPanel();
		this.panelBolsaTrabajo.setBorder(new TitledBorder(null, "Bolsa de Trabajo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEleccionYBolsa.add(this.panelBolsaTrabajo);
		this.panelBolsaTrabajo.setLayout(null);
		
		this.panelEmpleadoRequisitosBolsa = new JPanel();
		this.panelEmpleadoRequisitosBolsa.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleadoRequisitosBolsa.setBounds(21, 23, 366, 59);
		this.panelBolsaTrabajo.add(this.panelEmpleadoRequisitosBolsa);
		this.panelEmpleadoRequisitosBolsa.setLayout(null);
		
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
		this.panelPantallaBolsa.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelPantallaBolsa.setBounds(21, 93, 366, 182);
		this.panelBolsaTrabajo.add(this.panelPantallaBolsa);
		this.panelPantallaBolsa.setLayout(null);
		
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
		
		
		
		
		// Seteo de los botones en false para que aparezcan en gris
		
		this.btnConfirmarLogin.setEnabled(false);
		this.btnConfirmacionCreacionUsuario.setEnabled(false);
		this.btnConfirmacionCreacionTicket.setEnabled(false);
		this.btnConfirmacionEleccionEmpleado.setEnabled(false);
		this.btnBolsaAceptar.setEnabled(false);
		this.btnBolsaRechazar.setEnabled(false);
		this.btnInicioBolsa.setEnabled(false);
		
		// Funcionalidad de los botones
		
		this.btnConfirmarLogin.addActionListener(new ActionEmpleadoLogin(this));
		this.btnConfirmacionCreacionUsuario.setEnabled(false);
		this.btnConfirmacionCreacionTicket.setEnabled(false);
		this.btnConfirmacionEleccionEmpleado.setEnabled(false);
		this.btnBolsaAceptar.setEnabled(false);
		this.btnBolsaRechazar.setEnabled(false);
		this.btnInicioBolsa.setEnabled(false);
		
		// Asigno a los textfield para que escuchen el texto ingresado por teclado (LOGIN)
		
		this.textFieldUsuario.addKeyListener(new DosKeyListener(this));
		this.textFieldContrasenia.addKeyListener(new DosKeyListener(this));
		
		
		//  Asigno a los textfield para que escuchen el texto ingresado por teclado (CREACION DE TECLADO)
		
		this.textFieldCreacionUsuario.addKeyListener(new DosKeyListener(this));
		this.textFieldCreacionContrasenia.addKeyListener(new DosKeyListener(this));
		this.textFieldCreacionNyA.addKeyListener(new DosKeyListener(this));
		this.textFieldDNI.addKeyListener(new DosKeyListener(this));
		this.textFieldTelefono.addKeyListener(new DosKeyListener(this));
		this.textFieldEdad.addKeyListener(new DosKeyListener(this));
		this.textFieldCiudad.addKeyListener(new DosKeyListener(this));
		
		// Asigno a 
		
		this.textFieldPesoCargaHoraria.addKeyListener(new DosKeyListener(this));
		this.textFieldPesoEstudiosCursados.addKeyListener(new DosKeyListener(this));
		this.textFieldPesoExperienciaPrevia.addKeyListener(new UnKeyListener(this));
		this.textFieldPesoLocacion.addKeyListener(new UnKeyListener(this));
		this.textFieldPesoRangoEtario.addKeyListener(new UnKeyListener(this));
		this.textFieldPesoRemuneracion.addKeyListener(new UnKeyListener(this));
		this.textFieldPesoTipoDePuesto.addKeyListener(new UnKeyListener(this));
		
		this.btnConfirmarLogin.addMouseListener(new DosMouseListener(this));
		this.btnConfirmacionCreacionUsuario.addMouseListener(new DosMouseListener(this));
		this.btnConfirmacionCreacionTicket.addMouseListener(new DosMouseListener(this));
		this.btnConfirmacionEleccionEmpleado.addMouseListener(new DosMouseListener(this));
		this.btnBolsaAceptar.addMouseListener(new DosMouseListener(this));
		this.btnBolsaRechazar.addMouseListener(new DosMouseListener(this));
		this.btnInicioBolsa.addMouseListener(new DosMouseListener(this));
		
		
	}
		public void setBotonConfirmarLogin(boolean hab) {
			this.btnConfirmarLogin.setEnabled(hab);
		}
		
		public void setBotonConfirmacionCreacionUsuario(boolean hab) {
			this.btnConfirmacionCreacionUsuario.setEnabled(hab);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
