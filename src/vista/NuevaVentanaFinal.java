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

import usuariosDelSistema.Empleador;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;

public class NuevaVentanaFinal extends JFrame implements KeyListener, MouseListener, ItemListener, ActionListener, ListSelectionListener, IVista { 
	
	
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panelAgencia;
	private JPanel panelEmpleado;
	private JPanel panelEmpleador;
	private JPanel PanelGeneralAgencia;
	private JPanel PanelFuncionalidades;
	private JPanel panelCreacionAgencia;
	private JPanel panelNombreAgencia;
	private JPanel panel;
	private JLabel labelNombreAgencia;
	private JPanel panel_1;
	private JTextField textFieldCrearAgencia;
	private JPanel panelConfirmarNombreAgencia;
	private JButton btnConfirmarNombreAgencia;
	private JPanel panelRondaEncCont;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnRondaEncuentro;
	private JPanel panel_4;
	private JButton btnRondaContraciones;
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
	private JTextField textFieldCreacionDNI;
	private JPanel panelTelefono;
	private JLabel lblTelefono;
	private JTextField textFieldCreacionTelefono;
	private JPanel panelEdad;
	private JLabel lblEdad;
	private JTextField textFieldCreacionEdad;
	private JPanel panelCiudad;
	private JLabel lblCiudad;
	private JTextField textFieldCreacionCiudad;
	private JPanel panelConfirmacionCreacionUsuario;
	private JButton btnConfirmacionCreacionUsuario;
	private JPanel panelTicket;
	private JPanel panelCreacionTicket;
	private JPanel panelLocacion;
	private JComboBox comboBoxLocacion;
	private JTextField textFieldPesoLocacion;
	private JLabel labelPesoLocacion;
	private JPanel panelRemuneracion;
	private JTextField textFieldRemuneracion;
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
	private JPanel panelExperienciaPrevia;
	private JComboBox comboBoxExperienciaPrevia;
	private JLabel labelPesoExperienciaPrevia;
	private JPanel panelEstudiosCursados;
	private JComboBox comboBoxEstudiosCursados;
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
	private JTextField textFieldContraseniaEmpleador;
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
	private JButton btnConfirmacionCreacionUsuarioEmpleador;
	private JComboBox comboBoxTipoPersonaEmpleador;
	private JComboBox comboBoxRubroEmpleador;
	private JPanel panelTicketEmpleador;
	private JPanel panelCreacionTicketEmpleador;
	private JPanel panelLocacionEmpleador;
	private JComboBox comboBoxLocacionEmpleador;
	private JTextField textFieldPesoLocacionEmpleador;
	private JLabel labelPesoLocacionEmpleador;
	private JPanel panelRemuneracionEmpleador;
	private JTextField textFieldRemuneracionEmpleador;
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
	private JButton btnConfirmacionCreacionTicketEmpleador;
	private JList listTicketActualEmpleador;
	private JPanel panelRondaDeEleccionEmpleador;
	private JPanel panelRondaEleccionesEmpleador;
	private JList listRondaEleccionesEmpleador;
	private JButton btnConfirmacionEleccionEmpleador;
	private JPanel panelTicketSimplificado;
	private JPanel panelEmpleadorRequisitosTicketSimp;
	private JComboBox comboBoxBolsaTipoTrabajoEmpleador;
	private JComboBox comboBoxBolsaLocacionEmpleador;
	private JLabel lblBolsaTipoTrabajo_1;
	private JLabel lblBolsaLocacion_1;
	private JButton btnCrearTicketSimplificado;
	private JPanel panel_6;
	private JRadioButton rdbtnActivo;
	private JRadioButton rdbtnSuspendido;
	private JRadioButton rdbtnCancelar;
	private JButton btnCambiarEstado;
	private JPanel panelEstadoTicketEmpleador;
	private JRadioButton rdbtnActivoEmpleador;
	private JRadioButton rdbtnSuspendidoEmpleador;
	private JRadioButton rdbtnCancelarEmpleador;
	private JButton btnCambiarEstadoEmpleador;
	private JList listTicketSimplificadosEmpleador;
	private JList listContrataciones;
	private final ButtonGroup buttonGroupEstados = new ButtonGroup();
	private final ButtonGroup buttonGroupEstadosEmpleador = new ButtonGroup();
	private JPanel panelCantEmpleadosBuscados;
	private JTextField textFieldCantEmpleadosBuscados;
	private JList listTicketSimpObtenido;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NuevaVentanaFinal frame = new NuevaVentanaFinal();
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
	public NuevaVentanaFinal() {
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

		this.panelCreacionAgencia = new JPanel();
		this.panelCreacionAgencia
				.setBorder(new TitledBorder(null, "Crear Agencia", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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

		this.btnConfirmarNombreAgencia = new JButton("Confirmar");
		this.btnConfirmarNombreAgencia.setEnabled(false);
		this.panelConfirmarNombreAgencia.add(this.btnConfirmarNombreAgencia);

		this.panelRondaEncCont = new JPanel();
		this.panelRondaEncCont.setBorder(
				new TitledBorder(null, "Busqueda Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.panelRondaEncCont);
		this.panelRondaEncCont.setLayout(new GridLayout(3, 1, 0, 0));

		this.panel_2 = new JPanel();
		this.panelRondaEncCont.add(this.panel_2);

		this.panel_3 = new JPanel();
		this.panelRondaEncCont.add(this.panel_3);
		this.panel_3.setLayout(new GridLayout(0, 3, 0, 0));

		this.btnRondaEncuentro = new JButton("Ronda de Encuentros");
		this.btnRondaEncuentro.setEnabled(false);
		this.panel_3.add(this.btnRondaEncuentro);

		this.panel_4 = new JPanel();
		this.panel_3.add(this.panel_4);

		this.btnRondaContraciones = new JButton("Ronda de Contrataciones");
		this.btnRondaContraciones.setEnabled(false);
		this.panel_3.add(this.btnRondaContraciones);

		this.panel_5 = new JPanel();
		this.panelRondaEncCont.add(this.panel_5);

		this.listContrataciones = new JList();
		this.listContrataciones.setBorder(
				new TitledBorder(null, "Contrataciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.listContrataciones);

		this.listComisiones = new JList();
		this.listComisiones
				.setBorder(new TitledBorder(null, "Comisiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.listComisiones);

		this.PanelListas = new JPanel();
		this.PanelListas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.PanelGeneralAgencia.add(this.PanelListas);
		this.PanelListas.setLayout(new GridLayout(4, 0, 0, 0));

		this.listEmpleados = new JList();
		this.listEmpleados.setBorder(
				new TitledBorder(null, "Lista Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelListas.add(this.listEmpleados);

		this.listTicketEmpleados = new JList();
		this.listTicketEmpleados.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Solicitudes de Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.PanelListas.add(this.listTicketEmpleados);

		this.listEmpleadores = new JList();
		this.listEmpleadores.setBorder(
				new TitledBorder(null, "Lista Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelListas.add(this.listEmpleadores);

		this.listTicketEmpleadores = new JList();
		this.listTicketEmpleadores.setBorder(new TitledBorder(null, "Solicitudes de Empleadores", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
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
		this.panelCreacionEmpleado.setBorder(
				new TitledBorder(null, "Crear Empleado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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

		this.textFieldCreacionDNI = new JTextField();
		this.textFieldCreacionDNI.setColumns(10);
		this.textFieldCreacionDNI.setBounds(172, 19, 176, 20);
		this.panelDNI.add(this.textFieldCreacionDNI);

		this.panelTelefono = new JPanel();
		this.panelTelefono.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelTelefono);

		this.lblTelefono = new JLabel("Telefono:");
		this.lblTelefono.setBounds(69, 22, 52, 14);
		this.panelTelefono.add(this.lblTelefono);

		this.textFieldCreacionTelefono = new JTextField();
		this.textFieldCreacionTelefono.setColumns(10);
		this.textFieldCreacionTelefono.setBounds(172, 19, 176, 20);
		this.panelTelefono.add(this.textFieldCreacionTelefono);

		this.panelEdad = new JPanel();
		this.panelEdad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelEdad);

		this.lblEdad = new JLabel("Edad:");
		this.lblEdad.setBounds(81, 22, 40, 14);
		this.panelEdad.add(this.lblEdad);

		this.textFieldCreacionEdad = new JTextField();
		this.textFieldCreacionEdad.setColumns(10);
		this.textFieldCreacionEdad.setBounds(172, 19, 176, 20);
		this.panelEdad.add(this.textFieldCreacionEdad);

		this.panelCiudad = new JPanel();
		this.panelCiudad.setLayout(null);
		this.panelCreacionEmpleado.add(this.panelCiudad);

		this.lblCiudad = new JLabel("Ciudad:");
		this.lblCiudad.setBounds(76, 22, 45, 14);
		this.panelCiudad.add(this.lblCiudad);

		this.textFieldCreacionCiudad = new JTextField();
		this.textFieldCreacionCiudad.setColumns(10);
		this.textFieldCreacionCiudad.setBounds(172, 19, 176, 20);
		this.panelCiudad.add(this.textFieldCreacionCiudad);

		this.panelConfirmacionCreacionUsuario = new JPanel();
		this.panelCreacionEmpleado.add(this.panelConfirmacionCreacionUsuario);

		this.btnConfirmacionCreacionUsuario = new JButton("Confirmar");
		this.panelConfirmacionCreacionUsuario.add(this.btnConfirmacionCreacionUsuario);

		this.panelTicket = new JPanel();
		this.panelTicket.setLayout(null);
		this.panelGeneralEmpleado.add(this.panelTicket);

		this.panelCreacionTicket = new JPanel();
		this.panelCreacionTicket
				.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicket.setBounds(10, 11, 389, 450);
		this.panelTicket.add(this.panelCreacionTicket);
		this.panelCreacionTicket.setLayout(new GridLayout(7, 0, 0, 0));

		this.panelLocacion = new JPanel();
		this.panelLocacion.setLayout(null);
		this.panelLocacion
				.setBorder(new TitledBorder(null, "Locacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		this.panelRemuneracion.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Remuneraci\u00F3n Minima Buscada", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelRemuneracion);

		this.textFieldRemuneracion = new JTextField();
		this.textFieldRemuneracion.setBounds(23, 26, 167, 22);
		this.panelRemuneracion.add(this.textFieldRemuneracion);

		this.textFieldPesoRemuneracion = new JTextField();
		this.textFieldPesoRemuneracion.setColumns(10);
		this.textFieldPesoRemuneracion.setBounds(314, 27, 35, 20);
		this.panelRemuneracion.add(this.textFieldPesoRemuneracion);

		this.labelPesoRemuneracion = new JLabel("Ponderacion:");
		this.labelPesoRemuneracion.setBounds(241, 30, 63, 14);
		this.panelRemuneracion.add(this.labelPesoRemuneracion);

		this.panelCargaHoraria = new JPanel();
		this.panelCargaHoraria.setLayout(null);
		this.panelCargaHoraria.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Carga Horaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelTipoDePuesto.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tipo de Puesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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

		this.panelExperienciaPrevia = new JPanel();
		this.panelExperienciaPrevia.setLayout(null);
		this.panelExperienciaPrevia.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Experiencia Previa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicket.add(this.panelExperienciaPrevia);

		this.comboBoxExperienciaPrevia = new JComboBox();
		this.comboBoxExperienciaPrevia.setBounds(23, 26, 167, 22);
		this.panelExperienciaPrevia.add(this.comboBoxExperienciaPrevia);

		this.labelPesoExperienciaPrevia = new JLabel("Ponderacion: 1");
		this.labelPesoExperienciaPrevia.setBounds(241, 30, 90, 14);
		this.panelExperienciaPrevia.add(this.labelPesoExperienciaPrevia);

		this.panelEstudiosCursados = new JPanel();
		this.panelEstudiosCursados.setLayout(null);
		this.panelEstudiosCursados.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Estudios Cursados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.listTicketActual.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ticket de Busqueda Actual", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listTicketActual.setBounds(10, 524, 389, 57);
		this.panelTicket.add(this.listTicketActual);

		this.panel_6 = new JPanel();
		this.panel_6.setBorder(
				new TitledBorder(null, "Estado del Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_6.setBounds(10, 463, 387, 57);
		this.panelTicket.add(this.panel_6);
		this.panel_6.setLayout(null);

		this.rdbtnActivo = new JRadioButton("Activar");
		this.rdbtnActivo.setSelected(true);
		buttonGroupEstados.add(this.rdbtnActivo);
		this.rdbtnActivo.setBounds(6, 27, 63, 23);
		this.panel_6.add(this.rdbtnActivo);

		this.rdbtnSuspendido = new JRadioButton("Suspender");
		buttonGroupEstados.add(this.rdbtnSuspendido);
		this.rdbtnSuspendido.setBounds(71, 27, 85, 23);
		this.panel_6.add(this.rdbtnSuspendido);

		this.rdbtnCancelar = new JRadioButton("Cancelar");
		buttonGroupEstados.add(this.rdbtnCancelar);
		this.rdbtnCancelar.setBounds(158, 27, 85, 23);
		this.panel_6.add(this.rdbtnCancelar);

		this.btnCambiarEstado = new JButton("Cambiar");
		this.btnCambiarEstado.setBounds(249, 27, 89, 23);
		this.panel_6.add(this.btnCambiarEstado);

		this.panelEleccionYBolsa = new JPanel();
		this.panelEleccionYBolsa.setBorder(
				new TitledBorder(null, "Ronda de Eleccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelGeneralEmpleado.add(this.panelEleccionYBolsa);
		this.panelEleccionYBolsa.setLayout(new GridLayout(2, 0, 0, 0));

		this.panelRondaElecciones = new JPanel();
		this.panelRondaElecciones.setLayout(null);
		this.panelEleccionYBolsa.add(this.panelRondaElecciones);

		this.listRondaEleccionesEmpleado = new JList();
		this.listRondaEleccionesEmpleado
				.setBorder(new TitledBorder(null, "Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listRondaEleccionesEmpleado.setBounds(10, 11, 377, 233);
		this.panelRondaElecciones.add(this.listRondaEleccionesEmpleado);

		this.btnConfirmacionEleccionEmpleado = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleado.setBounds(162, 277, 89, 23);
		this.panelRondaElecciones.add(this.btnConfirmacionEleccionEmpleado);

		this.panelBolsaTrabajo = new JPanel();
		this.panelBolsaTrabajo.setLayout(null);
		this.panelBolsaTrabajo.setBorder(
				new TitledBorder(null, "Bolsa de Trabajo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEleccionYBolsa.add(this.panelBolsaTrabajo);

		this.panelEmpleadoRequisitosBolsa = new JPanel();
		this.panelEmpleadoRequisitosBolsa.setLayout(null);
		this.panelEmpleadoRequisitosBolsa
				.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		this.panelPantallaBolsa.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Eleccion",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelLoginEmpleador
				.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		this.panelCreacionEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Crear Empleador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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

		this.btnConfirmacionCreacionUsuarioEmpleador = new JButton("Confirmar");
		this.panelConfirmacionCreacionUsuario_1.add(this.btnConfirmacionCreacionUsuarioEmpleador);

		this.panelEstadoTicketEmpleador = new JPanel();
		this.panelEstadoTicketEmpleador.setLayout(null);
		this.panelEstadoTicketEmpleador.setBorder(
				new TitledBorder(null, "Estado del Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEstadoTicketEmpleador.setBounds(12, 573, 387, 57);
		this.panelLoginCreacionEmpleador.add(this.panelEstadoTicketEmpleador);

		this.rdbtnActivoEmpleador = new JRadioButton("Activar");
		this.rdbtnActivoEmpleador.setSelected(true);
		buttonGroupEstadosEmpleador.add(this.rdbtnActivoEmpleador);
		this.rdbtnActivoEmpleador.setBounds(6, 27, 63, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnActivoEmpleador);

		this.rdbtnSuspendidoEmpleador = new JRadioButton("Suspender");
		buttonGroupEstadosEmpleador.add(this.rdbtnSuspendidoEmpleador);
		this.rdbtnSuspendidoEmpleador.setBounds(71, 27, 85, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnSuspendidoEmpleador);

		this.rdbtnCancelarEmpleador = new JRadioButton("Cancelar");
		buttonGroupEstadosEmpleador.add(this.rdbtnCancelarEmpleador);
		this.rdbtnCancelarEmpleador.setBounds(158, 27, 85, 23);
		this.panelEstadoTicketEmpleador.add(this.rdbtnCancelarEmpleador);

		this.btnCambiarEstadoEmpleador = new JButton("Cambiar");
		this.btnCambiarEstadoEmpleador.setBounds(249, 27, 89, 23);
		this.panelEstadoTicketEmpleador.add(this.btnCambiarEstadoEmpleador);

		this.panelTicketEmpleador = new JPanel();
		this.panelGeneralEmpleador.add(this.panelTicketEmpleador);
		this.panelTicketEmpleador.setLayout(null);

		this.panelCreacionTicketEmpleador = new JPanel();
		this.panelCreacionTicketEmpleador
				.setBorder(new TitledBorder(null, "Crear Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicketEmpleador.setBounds(10, 11, 389, 556);
		this.panelTicketEmpleador.add(this.panelCreacionTicketEmpleador);
		this.panelCreacionTicketEmpleador.setLayout(new GridLayout(9, 0, 0, 0));

		this.panelLocacionEmpleador = new JPanel();
		this.panelLocacionEmpleador.setLayout(null);
		this.panelLocacionEmpleador
				.setBorder(new TitledBorder(null, "Locacion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
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
		this.panelRemuneracionEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Remuneraci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.panelCreacionTicketEmpleador.add(this.panelRemuneracionEmpleador);

		this.textFieldRemuneracionEmpleador = new JTextField();
		this.textFieldRemuneracionEmpleador.setBounds(23, 26, 167, 22);
		this.panelRemuneracionEmpleador.add(this.textFieldRemuneracionEmpleador);

		this.textFieldPesoRemuneracionEmpleador = new JTextField();
		this.textFieldPesoRemuneracionEmpleador.setColumns(10);
		this.textFieldPesoRemuneracionEmpleador.setBounds(314, 27, 35, 20);
		this.panelRemuneracionEmpleador.add(this.textFieldPesoRemuneracionEmpleador);

		this.labelPesoRemuneracionEmpleador = new JLabel("Ponderacion:");
		this.labelPesoRemuneracionEmpleador.setBounds(241, 30, 63, 14);
		this.panelRemuneracionEmpleador.add(this.labelPesoRemuneracionEmpleador);

		this.panelCargaHorariaEmpleador = new JPanel();
		this.panelCargaHorariaEmpleador.setLayout(null);
		this.panelCargaHorariaEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Carga Horaria", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelTipoDePuestoEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Tipo de Puesto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelRangoEtarioEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Rango Etario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelExperienciaPreviaEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Experiencia Previa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		this.panelEstudiosCursadosEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Estudios Cursados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
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
		
		this.panelCantEmpleadosBuscados = new JPanel();
		this.panelCantEmpleadosBuscados.setBorder(new TitledBorder(null, "Cantidad de Empleados Buscados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCreacionTicketEmpleador.add(this.panelCantEmpleadosBuscados);
		this.panelCantEmpleadosBuscados.setLayout(null);
		
		this.textFieldCantEmpleadosBuscados = new JTextField();
		this.textFieldCantEmpleadosBuscados.setColumns(10);
		this.textFieldCantEmpleadosBuscados.setBounds(163, 28, 48, 20);
		this.panelCantEmpleadosBuscados.add(this.textFieldCantEmpleadosBuscados);

		this.panelConfirmacionCreacionTicketEmpleador = new JPanel();
		this.panelCreacionTicketEmpleador.add(this.panelConfirmacionCreacionTicketEmpleador);

		this.btnConfirmacionCreacionTicketEmpleador = new JButton("Confirmar");
		this.panelConfirmacionCreacionTicketEmpleador.add(this.btnConfirmacionCreacionTicketEmpleador);

		this.listTicketActualEmpleador = new JList();
		this.listTicketActualEmpleador
				.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketActualEmpleador.setBounds(10, 577, 389, 57);
		this.panelTicketEmpleador.add(this.listTicketActualEmpleador);

		this.panelRondaDeEleccionEmpleador = new JPanel();
		this.panelGeneralEmpleador.add(this.panelRondaDeEleccionEmpleador);
		this.panelRondaDeEleccionEmpleador.setLayout(null);

		this.panelRondaEleccionesEmpleador = new JPanel();
		this.panelRondaEleccionesEmpleador.setBorder(
				new TitledBorder(null, "Ronda de Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelRondaEleccionesEmpleador.setLayout(null);
		this.panelRondaEleccionesEmpleador.setBounds(10, 11, 395, 311);
		this.panelRondaDeEleccionEmpleador.add(this.panelRondaEleccionesEmpleador);

		this.listRondaEleccionesEmpleador = new JList();
		this.listRondaEleccionesEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleados",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listRondaEleccionesEmpleador.setBounds(10, 23, 377, 221);
		this.panelRondaEleccionesEmpleador.add(this.listRondaEleccionesEmpleador);

		this.btnConfirmacionEleccionEmpleador = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleador.setBounds(162, 277, 89, 23);
		this.panelRondaEleccionesEmpleador.add(this.btnConfirmacionEleccionEmpleador);

		this.panelTicketSimplificado = new JPanel();
		this.panelTicketSimplificado.setBorder(new TitledBorder(null, "Crear Ticket Simplificado", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		this.panelTicketSimplificado.setBounds(10, 332, 387, 165);
		this.panelRondaDeEleccionEmpleador.add(this.panelTicketSimplificado);
		this.panelTicketSimplificado.setLayout(null);

		this.panelEmpleadorRequisitosTicketSimp = new JPanel();
		this.panelEmpleadorRequisitosTicketSimp.setLayout(null);
		this.panelEmpleadorRequisitosTicketSimp
				.setBorder(new TitledBorder(null, "Requisitos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelEmpleadorRequisitosTicketSimp.setBounds(10, 23, 366, 75);
		this.panelTicketSimplificado.add(this.panelEmpleadorRequisitosTicketSimp);

		this.comboBoxBolsaTipoTrabajoEmpleador = new JComboBox();
		this.comboBoxBolsaTipoTrabajoEmpleador.setBounds(23, 26, 138, 22);
		this.panelEmpleadorRequisitosTicketSimp.add(this.comboBoxBolsaTipoTrabajoEmpleador);

		this.comboBoxBolsaLocacionEmpleador = new JComboBox();
		this.comboBoxBolsaLocacionEmpleador.setBounds(195, 26, 138, 22);
		this.panelEmpleadorRequisitosTicketSimp.add(this.comboBoxBolsaLocacionEmpleador);

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
		this.listTicketSimplificadosEmpleador.setBorder(
				new TitledBorder(null, "Tickets Simplificados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.listTicketSimplificadosEmpleador.setBounds(10, 510, 387, 124);
		this.panelRondaDeEleccionEmpleador.add(this.listTicketSimplificadosEmpleador);

		// ventana Agencia

		this.textFieldCrearAgencia.addKeyListener(this);

		this.btnConfirmarNombreAgencia.setActionCommand(confirmaCreacionAgencia);

		this.btnConfirmarNombreAgencia.addActionListener(new ActionPerformedBotones(this));
		this.btnConfirmarNombreAgencia.addMouseListener(this);

		/*
		 * if (hayRondaContrataciones) { this.botonRondaContrataciones.setEnabled(true);
		 * else this.botonRondaContrataciones.setEnabled(false); //(esto viene por
		 * default en realidad pero no est� de m�s) if (hayRondaContrataciones &
		 * hayRondaEncuentro) { this.botonRondaEncuentro.setEnabled(true); else
		 * this.botonRondaEncuentro.setEnabled(false); //(esto viene por default en
		 * realidad pero no est� de m�s)
		 * 
		 */

		// ventana Empleado

		// Seteo de los botones en false para que aparezcan en gris

		this.btnConfirmarLogin.setEnabled(false);
		this.btnConfirmacionCreacionUsuario.setEnabled(false);
		this.btnConfirmacionCreacionTicket.setEnabled(false);
		this.btnConfirmacionEleccionEmpleado.setEnabled(false);
		this.btnBolsaAceptar.setEnabled(false);
		this.btnBolsaRechazar.setEnabled(false);
		this.btnInicioBolsa.setEnabled(false);
		
		// Seteo comboBox
		
		comboBoxLocacion.addItem("HomeOffice");
		comboBoxLocacion.addItem("Presencial");
		comboBoxLocacion.addItem("Indistinto");
		
		comboBoxCargaHoraria.addItem("Media");
		comboBoxCargaHoraria.addItem("Completa");
		comboBoxCargaHoraria.addItem("Extendida");
		
		comboBoxTipoDePuesto.addItem("Junior");
		comboBoxTipoDePuesto.addItem("Senior");
		comboBoxTipoDePuesto.addItem("Managment");
		
		comboBoxExperienciaPrevia.addItem("Nada");
		comboBoxExperienciaPrevia.addItem("Media");
		comboBoxExperienciaPrevia.addItem("Mucha");
		
		comboBoxEstudiosCursados.addItem("Primario");
		comboBoxEstudiosCursados.addItem("Secundario");
		comboBoxEstudiosCursados.addItem("Terciario");
		
		comboBoxBolsaTipoTrabajo.addItem("Salud");
		comboBoxBolsaTipoTrabajo.addItem("Comercio Local");
		comboBoxBolsaTipoTrabajo.addItem("Comercio Internacional");
		
		comboBoxBolsaLocacion.addItem("HomeOffice");
		comboBoxBolsaLocacion.addItem("Presencial");
		comboBoxBolsaLocacion.addItem("Indistinto");
		
		// Funcionalidad de los botones

		this.btnConfirmarLogin.setActionCommand(confirmaLoginUsuario);
		this.btnConfirmacionCreacionUsuario.setActionCommand(confirmaCreacionUsuario);
		this.btnConfirmacionCreacionTicket.setActionCommand(confirmaCreacionTicket);
		
		this.listTicketSimpObtenido = new JList();
		this.listTicketSimpObtenido.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ticket Simplificado Obtenido", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.listTicketSimpObtenido.setBounds(10, 588, 389, 57);
		this.panelTicket.add(this.listTicketSimpObtenido);
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
		
		this.btnConfirmarLogin.addMouseListener(this);
		this.btnConfirmacionCreacionUsuario.addMouseListener(this);
		this.btnConfirmacionCreacionTicket.addMouseListener(this);
		this.btnConfirmacionEleccionEmpleado.addMouseListener(this);
		this.btnBolsaAceptar.addMouseListener(this);
		this.btnBolsaRechazar.addMouseListener(this);
		this.btnInicioBolsa.addMouseListener(this);

		// Asigno a los textfield para que escuchen el texto ingresado por teclado
		// (LOGIN)

		this.textFieldUsuario.addKeyListener(this);
		this.textFieldContrasenia.addKeyListener(this);

		// Asigno a los textfield para que escuchen el texto ingresado por teclado
		// (CREACION DE TECLADO)

		this.textFieldCreacionUsuario.addKeyListener(this);
		this.textFieldCreacionContrasenia.addKeyListener(this);
		this.textFieldCreacionNyA.addKeyListener(this);
		this.textFieldCreacionDNI.addKeyListener(this);
		this.textFieldCreacionTelefono.addKeyListener(this);
		this.textFieldCreacionEdad.addKeyListener(this);
		this.textFieldCreacionCiudad.addKeyListener(this);

		this.textFieldPesoCargaHoraria.addKeyListener(this);
		this.textFieldPesoLocacion.addKeyListener(this);
		this.textFieldPesoRemuneracion.addKeyListener(this);
		this.textFieldPesoTipoDePuesto.addKeyListener(this);

		this.rdbtnActivo.addMouseListener(this);
		this.rdbtnSuspendido.addMouseListener(this);
		this.rdbtnCancelar.addMouseListener(this);

		// ventana Empleador

		this.btnConfirmarLoginEmpleador.setEnabled(false);
		this.btnConfirmacionCreacionUsuarioEmpleador.setEnabled(false);
		this.btnConfirmacionCreacionTicketEmpleador.setEnabled(false);
		this.btnConfirmacionEleccionEmpleador.setEnabled(false);
		this.btnCrearTicketSimplificado.setEnabled(false); // (hasta q se loguee por lo menos)
		this.btnInicioBolsa.setEnabled(false);
		
		// Seteo ComboBox
		
		comboBoxRubroEmpleador.addItem("Salud");
		comboBoxRubroEmpleador.addItem("ComercioLocal");
		comboBoxRubroEmpleador.addItem("ComercioInternacional");
		
		comboBoxTipoPersonaEmpleador.addItem("F�sico");
		comboBoxTipoPersonaEmpleador.addItem("Jur�dico");
		
		comboBoxLocacionEmpleador.addItem("HomeOffice");
		comboBoxLocacionEmpleador.addItem("Presencial");
		comboBoxLocacionEmpleador.addItem("Indistinto");
		
		comboBoxCargaHorariaEmpleador.addItem("Media");
		comboBoxCargaHorariaEmpleador.addItem("Completa");
		comboBoxCargaHorariaEmpleador.addItem("Extendida");
		
		comboBoxTipoDePuestoEmpleador.addItem("Junior");
		comboBoxTipoDePuestoEmpleador.addItem("Senior");
		comboBoxTipoDePuestoEmpleador.addItem("Managment");
		
		comboBoxBolsaTipoTrabajoEmpleador.addItem("Salud");
		comboBoxBolsaTipoTrabajoEmpleador.addItem("Comercio Local");
		comboBoxBolsaTipoTrabajoEmpleador.addItem("Comercio Internacional");
		
		comboBoxBolsaLocacionEmpleador.addItem("HomeOffice");
		comboBoxBolsaLocacionEmpleador.addItem("Presencial");
		comboBoxBolsaLocacionEmpleador.addItem("Indistinto");
		
		comboBoxExperienciaPreviaEmpleador.addItem("Nada");
		comboBoxExperienciaPreviaEmpleador.addItem("Media");
		comboBoxExperienciaPreviaEmpleador.addItem("Mucha");
		
		comboBoxEstudiosCursadosEmpleador.addItem("Primario");
		comboBoxEstudiosCursadosEmpleador.addItem("Secundario");
		comboBoxEstudiosCursadosEmpleador.addItem("Terciario");
		
		comboBoxRangoEtarioEmpleador.addItem("Menos de 40");
		comboBoxRangoEtarioEmpleador.addItem("Entre 40 y 50");
		comboBoxRangoEtarioEmpleador.addItem("Mas de 50");
		
		
		
		
		//

		this.btnConfirmarLoginEmpleador.setActionCommand(confirmarLoginEmpleador);
		this.btnConfirmacionCreacionUsuarioEmpleador.setActionCommand(confirmacionCreacionUsuario_1);
		this.btnConfirmacionCreacionTicketEmpleador.setActionCommand(confirmacionCreacionTicket_1);
		this.btnCambiarEstadoEmpleador.setActionCommand(confirmaCambiorEstadoEmpleador);
		this.btnConfirmacionEleccionEmpleador.setActionCommand(confirmacionEleccionEmpleador);
		this.btnCrearTicketSimplificado.setActionCommand(confirmaCracionTicketSimplificado);
		
		this.btnConfirmarLoginEmpleador.addActionListener(new ActionPerformedBotones(this));
		this.btnConfirmacionCreacionUsuarioEmpleador.addActionListener(new ActionPerformedBotones(this));
		this.btnConfirmacionCreacionTicketEmpleador.addActionListener(new ActionPerformedBotones(this));
		this.btnConfirmacionEleccionEmpleador.addActionListener(new ActionPerformedBotones(this));
		this.btnCrearTicketSimplificado.addActionListener(new ActionPerformedBotones(this));
		this.btnInicioBolsa.addActionListener(new ActionPerformedBotones(this));
		
		this.btnConfirmarLoginEmpleador.addMouseListener(this);
		this.btnConfirmacionCreacionUsuarioEmpleador.addMouseListener(this);
		this.btnConfirmacionCreacionTicketEmpleador.addMouseListener(this);
		this.btnConfirmacionEleccionEmpleador.addMouseListener(this);
		this.btnCrearTicketSimplificado.addMouseListener(this);
		this.btnInicioBolsa.addMouseListener(this);

		this.rdbtnActivoEmpleador.addMouseListener(this);
		this.rdbtnCancelarEmpleador.addMouseListener(this);
		this.rdbtnSuspendidoEmpleador.addMouseListener(this);

		this.textFieldUsuarioEmpleador.addKeyListener(this);
		this.textFieldContraseniaEmpleador.addKeyListener(this);

		this.textFieldCreacionUsuarioEmpleador.addKeyListener(this);
		this.textFieldCreacionContraseniaEmpleador.addKeyListener(this);
		this.textFieldCreacionNombreEmpleador.addKeyListener(this);
		
		this.textFieldPesoCargaHorariaEmpleador.addKeyListener(this);
		this.textFieldPesoEstudiosCursadosEmpleador.addKeyListener(this);
		this.textFieldPesoExpPreviaEmpleador.addKeyListener(this);
		this.textFieldPesoLocacionEmpleador.addKeyListener(this);
		this.textFieldPesoRangoEtarioEmpleador.addKeyListener(this);
		this.textFieldPesoRemuneracionEmpleador.addKeyListener(this);
		this.textFieldPesoTipoDePuestoEmpleador.addKeyListener(this);
		this.textFieldRemuneracionEmpleador.addKeyListener(this);
		

	}

	public String getTextFieldCrearAgencia() {
		return textFieldCrearAgencia.getText();
	}

	public String getListComisiones() {
		return listComisiones;
	}

	public String getListEmpleados() {
		return listEmpleados.getSe;
	}

	public String getListTicketEmpleados() {
		return listTicketEmpleados;
	}

	public String getListEmpleadores() {
		return listEmpleadores;
	}

	public String getListTicketEmpleadores() {
		return listTicketEmpleadores;
	}

	public String getTextFieldUsuario() {
		return textFieldUsuario.getText();
	}

	public String getTextFieldContrasenia() {
		return textFieldContrasenia.getText();
	}

	public String getTextFieldCreacionUsuario() {
		return textFieldCreacionUsuario.getText();
	}

	public String getTextFieldCreacionContrasenia() {
		return textFieldCreacionContrasenia.getText();
	}

	public String getTextFieldCreacionNyA() {
		return textFieldCreacionNyA.getText();
	}

	public String getTextFieldCreacionDNI() {
		return textFieldCreacionDNI.getText();
	}

	public String getTextFieldCreacionTelefono() {
		return textFieldCreacionTelefono.getText();
	}

	public int getTextFieldCreacionEdad() {
		return Integer.parseInt((String) textFieldCreacionEdad.getText());
	}

	public String getTextFieldCreacionCiudad() {
		return textFieldCreacionCiudad.getText();
	}

	public String getComboBoxLocacion() {
		return (String) comboBoxLocacion.getSelectedItem();
	}

	public int getTextFieldPesoLocacion() {
		return Integer.parseInt((String) textFieldPesoLocacion.getText());
	}

	public int getTextFieldRemuneracion() {
		return Integer.parseInt((String) textFieldRemuneracion.getText());
	}

	public int getTextFieldPesoRemuneracion() {
		return Integer.parseInt((String) textFieldPesoRemuneracion.getText());
	}

	public String getComboBoxCargaHoraria() {
		return (String) comboBoxCargaHoraria.getSelectedItem();
	}

	public int getTextFieldPesoCargaHoraria() {
		return Integer.parseInt((String) textFieldPesoCargaHoraria.getText());
	}

	public String getComboBoxTipoDePuesto() {
		return (String) comboBoxTipoDePuesto.getSelectedItem();
	}

	public int getTextFieldPesoTipoDePuesto() {
		return Integer.parseInt((String) textFieldPesoTipoDePuesto.getText());
	}

	public String getComboBoxExperienciaPrevia() {
		return (String) comboBoxExperienciaPrevia.getSelectedItem();
	}

	public String getComboBoxEstudiosCursados() {
		return (String) comboBoxEstudiosCursados.getSelectedItem();
	}

	public String getListTicketActual() {
		return listTicketActual;
	}

	public Empleador getListRondaEleccionesEmpleado() { // public Empleador
		return (Empleador)listRondaEleccionesEmpleado.getSelectedValue();
	}

	public String getComboBoxBolsaTipoTrabajo() {
		return (String) comboBoxBolsaTipoTrabajo.getSelectedItem();
	}

	public String getComboBoxBolsaLocacion() {
		return (String) comboBoxBolsaLocacion.getSelectedItem();
	}

	public String getListTicketSimpActual() {
		return listTicketSimpActual;
	}

	public String getTextFieldUsuarioEmpleador() {
		return textFieldUsuarioEmpleador.getText();
	}

	public String getTextFieldContraseniaEmpleador() {
		return textFieldContraseniaEmpleador.getText();
	}

	public String getTextFieldCreacionUsuarioEmpleador() {
		return textFieldCreacionUsuarioEmpleador.getText();
	}

	public String getTextFieldCreacionContraseniaEmpleador() {
		return textFieldCreacionContraseniaEmpleador.getText();
	}

	public String getTextFieldCreacionNombreEmpleador() {
		return textFieldCreacionNombreEmpleador.getText();
	}

	public String getComboBoxTipoPersonaEmpleador() {
		return (String) comboBoxTipoPersonaEmpleador.getSelectedItem();
	}

	public String getComboBoxRubroEmpleador() {
		return (String) comboBoxRubroEmpleador.getSelectedItem();
	}

	public String getComboBoxLocacionEmpleador() {
		return (String) comboBoxLocacionEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoLocacionEmpleador() {
		return Integer.parseInt((String) textFieldPesoLocacionEmpleador.getText());
	}

	public int getTextFieldRemuneracionEmpleador() {
		return Integer.parseInt((String) textFieldRemuneracionEmpleador.getText());
	}

	public int getTextFieldPesoRemuneracionEmpleador() {
		return Integer.parseInt((String) textFieldPesoRemuneracionEmpleador.getText());
	}

	public String getComboBoxCargaHorariaEmpleador() {
		return (String) comboBoxCargaHorariaEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoCargaHorariaEmpleador() {
		return Integer.parseInt((String) textFieldPesoCargaHorariaEmpleador.getText());
	}

	public String getComboBoxTipoDePuestoEmpleador() {
		return (String) comboBoxTipoDePuestoEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoTipoDePuestoEmpleador() {
		return Integer.parseInt((String) textFieldPesoTipoDePuestoEmpleador.getText());
	}

	public String getComboBoxRangoEtarioEmpleador() {
		return (String) comboBoxRangoEtarioEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoRangoEtarioEmpleador() {
		return Integer.parseInt((String) textFieldPesoRangoEtarioEmpleador.getText());
	}

	public String getComboBoxExperienciaPreviaEmpleador() {
		return (String) comboBoxExperienciaPreviaEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoExpPreviaEmpleador() {
		return Integer.parseInt((String) textFieldPesoExpPreviaEmpleador.getText());
	}

	public String getComboBoxEstudiosCursadosEmpleador() {
		return (String) comboBoxEstudiosCursadosEmpleador.getSelectedItem();
	}

	public int getTextFieldPesoEstudiosCursadosEmpleador() {
		return Integer.parseInt((String) textFieldPesoEstudiosCursadosEmpleador.getText());
	}

	public String getListTicketActualEmpleador() {
		return listTicketActualEmpleador;
	}

	public String getListRondaEleccionesEmpleador() {
		return listRondaEleccionesEmpleador;
	}

	public String getComboBoxBolsaTipoTrabajoEmpleador() {
		return (String) comboBoxBolsaTipoTrabajoEmpleador.getSelectedItem();
	}

	public String getComboBoxBolsaLocacionEmpleador() {
		return (String) comboBoxBolsaLocacionEmpleador.getSelectedItem();
	}

	public boolean getRdbtnActivo() {
		return rdbtnActivo.isSelected();
	}

	public boolean getRdbtnSuspendido() {
		return rdbtnSuspendido.isSelected();
	}

	public boolean getRdbtnCancelar() {
		return rdbtnCancelar.isSelected();
	}

	public boolean getRdbtnActivoEmpleador() {
		return rdbtnActivoEmpleador.isSelected();
	}

	public boolean getRdbtnSuspendidoEmpleador() {
		return rdbtnSuspendidoEmpleador.isSelected();
	}

	public boolean getRdbtnCancelarEmpleador() {
		return rdbtnCancelarEmpleador.isSelected();
	}

	public String getListTicketSimplificadosEmpleador() {
		return listTicketSimplificadosEmpleador;
	}

	public String getListContrataciones() {
		return listContrataciones;
	}

	public void setBtnConfirmarNombreAgencia(boolean hab) {
		this.btnConfirmarNombreAgencia.setEnabled(hab);
	}

	public void setBtnConfirmarLogin(boolean hab) {
		this.btnConfirmarLogin.setEnabled(hab);
	}

	public void setBtnConfirmacionCreacionUsuario(boolean hab) {
		this.btnConfirmacionCreacionUsuario.setEnabled(hab);
	}

	public void setBtnConfirmarCreacionTicket(boolean hab) {
		this.btnConfirmacionCreacionTicket.setEnabled(hab);
	}
	
	public void setBtnConfirmarCreacionTicketEmpleador(boolean hab) {
		this.btnConfirmacionCreacionTicketEmpleador.setEnabled(hab);
	}

	public void setCambiarEstadoTicketEmpleado(boolean hab) {
		this.btnCambiarEstado.setEnabled(hab);
	}

	public void setBtnConfirmarLoginEmpleador(boolean hab) {
		this.btnConfirmarLoginEmpleador.setEnabled(hab);
	}

	public void setBtnConfirmacionCreacionUsuarioEmpleador(boolean hab) {
		this.btnConfirmacionCreacionUsuarioEmpleador.setEnabled(hab);
	}

	public void setCambiarEstadoTicketEmpleador(boolean hab) {
		this.btnCambiarEstadoEmpleador.setEnabled(hab);
	}

	public void setBtnConfirmacionEleccionEmpleado(boolean hab) {
		this.btnConfirmacionEleccionEmpleado.setEnabled(hab);
	}

	public void setBtnConfirmacionEleccionEmpleador(boolean hab) {
		this.btnConfirmacionEleccionEmpleador.setEnabled(hab);

	}
	

	public void setTextFieldCrearAgencia(String textFieldCrearAgencia) {
		this.textFieldCrearAgencia.setText(textFieldCrearAgencia);
	}

	public void setTextFieldUsuario(String textFieldUsuario) {
		this.textFieldUsuario.setText(textFieldUsuario);
	}

	public void setTextFieldContrasenia(String textFieldContrasenia) {
		this.textFieldContrasenia.setText(textFieldContrasenia);
	}

	public void setTextFieldPesoLocacion(String textFieldPesoLocacion) {
		this.textFieldPesoLocacion.setText(textFieldPesoLocacion);
	}

	public void setTextFieldRemuneracion(String textFieldRemuneracion) {
		this.textFieldRemuneracion.setText(textFieldRemuneracion);
	}

	public void setTextFieldPesoRemuneracion(String textFieldPesoRemuneracion) {
		this.textFieldPesoRemuneracion.setText(textFieldPesoRemuneracion);
	}

	public void setTextFieldPesoCargaHoraria(String textFieldPesoCargaHoraria) {
		this.textFieldPesoCargaHoraria.setText(textFieldPesoCargaHoraria);
	}

	public void setTextFieldPesoTipoDePuesto(String textFieldPesoTipoDePuesto) {
		this.textFieldPesoTipoDePuesto.setText(textFieldPesoTipoDePuesto);
	}

	public void setTextFieldUsuarioEmpleador(String textFieldUsuarioEmpleador) {
		this.textFieldUsuarioEmpleador.setText(textFieldUsuarioEmpleador);
	}

	public void setTextFieldContraseniaEmpleador(String textFieldContraseniaEmpleador) {
		this.textFieldContraseniaEmpleador.setText(textFieldContraseniaEmpleador);
	}

	public void setTextFieldCreacionUsuarioEmpleador(String textFieldCreacionUsuarioEmpleador) {
		this.textFieldCreacionUsuarioEmpleador.setText(textFieldCreacionUsuarioEmpleador);
	}

	public void setTextFieldCreacionContraseniaEmpleador(String textFieldCreacionContraseniaEmpleador) {
		this.textFieldCreacionContraseniaEmpleador.setText(textFieldCreacionContraseniaEmpleador);
	}

	public void setTextFieldCreacionNombreEmpleador(String textFieldCreacionNombreEmpleador) {
		this.textFieldCreacionNombreEmpleador.setText(textFieldCreacionNombreEmpleador);
	}

	public void setTextFieldPesoLocacionEmpleador(String textFieldPesoLocacionEmpleador) {
		this.textFieldPesoLocacionEmpleador.setText(textFieldPesoLocacionEmpleador);
	}

	public void setTextFieldRemuneracionEmpleador(String textFieldRemuneracionEmpleador) {
		this.textFieldRemuneracionEmpleador.setText(textFieldRemuneracionEmpleador);
	}

	public void setTextFieldPesoRemuneracionEmpleador(String textFieldPesoRemuneracionEmpleador) {
		this.textFieldPesoRemuneracionEmpleador.setText(textFieldPesoRemuneracionEmpleador);
	}

	public void setTextFieldPesoCargaHorariaEmpleador(String textFieldPesoCargaHorariaEmpleador) {
		this.textFieldPesoCargaHorariaEmpleador.setText(textFieldPesoCargaHorariaEmpleador);
	}

	public void setTextFieldPesoTipoDePuestoEmpleador(String textFieldPesoTipoDePuestoEmpleador) {
		this.textFieldPesoTipoDePuestoEmpleador.setText(textFieldPesoTipoDePuestoEmpleador);
	}

	public void setTextFieldPesoRangoEtarioEmpleador(String textFieldPesoRangoEtarioEmpleador) {
		this.textFieldPesoRangoEtarioEmpleador.setText(textFieldPesoRangoEtarioEmpleador);
	}

	public void setTextFieldPesoExpPreviaEmpleador(String textFieldPesoExpPreviaEmpleador) {
		this.textFieldPesoExpPreviaEmpleador.setText(textFieldPesoExpPreviaEmpleador);
	}

	public void setTextFieldPesoEstudiosCursadosEmpleador(String textFieldPesoEstudiosCursadosEmpleador) {
		this.textFieldPesoEstudiosCursadosEmpleador.setText(textFieldPesoEstudiosCursadosEmpleador);
	}

	public void setTextFieldCreacionUsuario(String textFieldCreacionUsuario) {
		this.textFieldCreacionUsuario.setText(textFieldCreacionUsuario);
	}

	public void setTextFieldCreacionContrasenia(String textFieldCreacionContrasenia) {
		this.textFieldCreacionContrasenia.setText(textFieldCreacionContrasenia);
	}

	public void setTextFieldCreacionNyA(String textFieldCreacionNyA) {
		this.textFieldCreacionNyA.setText(textFieldCreacionNyA);
	}

	public void setTextFieldCreacionDNI(String textFieldCreacionDNI) {
		this.textFieldCreacionDNI.setText(textFieldCreacionDNI);
	}

	public void setTextFieldCreacionTelefono(String textFieldCreacionTelefono) {
		this.textFieldCreacionTelefono.setText(textFieldCreacionTelefono);
	}

	public void setTextFieldCreacionEdad(String textFieldCreacionEdad) {
		this.textFieldCreacionEdad.setText(textFieldCreacionEdad);
	}

	public void setTextFieldCreacionCiudad(String textFieldCreacionCiudad) {
		this.textFieldCreacionCiudad.setText(textFieldCreacionCiudad);
	}

	public void setBtnAceptarYRechazarTicketSimplificado(boolean hab, boolean hab2) {
		boolean habFinal = hab && hab2;
		this.btnBolsaAceptar.setEnabled(habFinal);
		this.btnBolsaRechazar.setEnabled(habFinal); // seteo los dos botones de una porque esto es solo para verificar
													// si seleccione el ticket simplificado
	}
	public void setBtnArrancarBolsa(boolean hab) {
		
	}
	
	public void setComboBoxLocacion() {
		this.comboBoxLocacion.setSelectedIndex(0);
	}

	public void setComboBoxCargaHoraria() {
		this.comboBoxCargaHoraria.setSelectedIndex(0);
	}

	public void setComboBoxTipoDePuesto() {
		this.comboBoxTipoDePuesto.setSelectedIndex(0);
	}

	public void setComboBoxExperienciaPrevia() {
		this.comboBoxExperienciaPrevia.setSelectedIndex(0);
	}

	public void setComboBoxEstudiosCursados() {
		this.comboBoxEstudiosCursados.setSelectedIndex(0);
	}

	public void setComboBoxBolsaTipoTrabajo() {
		this.comboBoxBolsaTipoTrabajo.setSelectedIndex(0);
	}

	public void setComboBoxBolsaLocacion() {
		this.comboBoxBolsaLocacion.setSelectedIndex(0);
	}

	public void setComboBoxTipoPersonaEmpleador() {
		this.comboBoxTipoPersonaEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxRubroEmpleador() {
		this.comboBoxRubroEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxLocacionEmpleador() {
		this.comboBoxLocacionEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxCargaHorariaEmpleador() {
		this.comboBoxCargaHorariaEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxTipoDePuestoEmpleador() {
		this.comboBoxTipoDePuestoEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxRangoEtarioEmpleador() {
		this.comboBoxRangoEtarioEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxExperienciaPreviaEmpleador() {
		this.comboBoxExperienciaPreviaEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxEstudiosCursadosEmpleador() {
		this.comboBoxEstudiosCursadosEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxBolsaTipoTrabajoEmpleador() {
		this.comboBoxBolsaTipoTrabajoEmpleador.setSelectedIndex(0);
	}

	public void setComboBoxBolsaLocacionEmpleador() {
		this.comboBoxBolsaLocacionEmpleador.setSelectedIndex(0);
	}
	
	
	//pensamiento propio: desde ventana mandamos el empleador que seleccionamos al controlador, y este "une" al empleado con su empleador
	//En este caso el getter de la lista estaria al pedo capaz, salvo que se use para otra cosa
	
	
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

		boolean hab = !(textFieldCrearAgencia.getText().isEmpty());
		setBtnConfirmarNombreAgencia(hab);

		boolean hab1 = !(textFieldUsuario.getText().isEmpty() || textFieldContrasenia.getText().isEmpty());
		setBtnConfirmarLogin(hab1);

		boolean hab2 = !(textFieldCreacionUsuario.getText().isEmpty()
				|| textFieldCreacionContrasenia.getText().isEmpty() || textFieldCreacionNyA.getText().isEmpty()
				|| textFieldCreacionDNI.getText().isEmpty() || textFieldCreacionTelefono.getText().isEmpty()
				|| textFieldCreacionEdad.getText().isEmpty() || textFieldCreacionCiudad.getText().isEmpty());
		setBtnConfirmacionCreacionUsuario(hab2);

		boolean hab3 = !(textFieldPesoCargaHoraria.getText().isEmpty() || textFieldPesoLocacion.getText().isEmpty()
				|| textFieldPesoRemuneracion.getText().isEmpty() || textFieldPesoTipoDePuesto.getText().isEmpty());

		// ac� viene una referencia del modelo que dice si el usuario est� logueado,
		// entonces har�a un AND con hab3 para asi se

		boolean hab4 = !(textFieldUsuarioEmpleador.getText().isEmpty()
				|| textFieldContraseniaEmpleador.getText().isEmpty());
		setBtnConfirmarLoginEmpleador(hab4);
		
		boolean hab5 = !(textFieldRemuneracion.getText().isEmpty() || textFieldPesoCargaHoraria.getText().isEmpty() || textFieldPesoLocacion.getText().isEmpty() || textFieldPesoTipoDePuesto.getText().isEmpty()
				|| textFieldPesoRemuneracion.getText().isEmpty());
		setBtnConfirmarCreacionTicket(hab5);
		
		boolean hab6 = !(textFieldRemuneracionEmpleador.getText().isEmpty() || textFieldPesoCargaHorariaEmpleador.getText().isEmpty() || textFieldPesoEstudiosCursadosEmpleador.getText().isEmpty() 
				|| textFieldPesoExpPreviaEmpleador.getText().isEmpty() || textFieldPesoLocacionEmpleador.getText().isEmpty() || textFieldPesoRangoEtarioEmpleador.getText().isEmpty() || textFieldPesoRemuneracionEmpleador.getText().isEmpty() || 
				textFieldPesoTipoDePuestoEmpleador.getText().isEmpty());
		setBtnConfirmarCreacionTicketEmpleador(hab6);
		
		boolean hab7 = !(textFieldCreacionUsuarioEmpleador.getText().isEmpty() || textFieldCreacionContraseniaEmpleador.getText().isEmpty() || textFieldCreacionNombreEmpleador.getText().isEmpty());
		setBtnConfirmacionCreacionUsuarioEmpleador(hab7);
	
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) { // comboBox
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==btnConfirmarNombreAgencia) {
			setTextFieldCrearAgencia("");
			setBtnConfirmarNombreAgencia(false);
		} else
			if (e.getSource()==btnConfirmarLogin) {
				setTextFieldUsuario("");
				setTextFieldContrasenia("");
				setBtnConfirmarLogin(false);
			} else
				if (e.getSource()==btnConfirmacionCreacionUsuario) {
					setTextFieldCreacionUsuario("");
					setTextFieldCreacionContrasenia("");
					setTextFieldCreacionNyA("");
					setTextFieldCreacionDNI("");
					setTextFieldCreacionTelefono("");
					setTextFieldCreacionEdad("");
					setTextFieldCreacionCiudad("");
					setBtnConfirmacionCreacionUsuario(false); 
				} else
					if (e.getSource()==btnConfirmacionCreacionTicket) {
						setTextFieldPesoCargaHoraria("");
						setTextFieldPesoLocacion("");
						setTextFieldPesoRemuneracion("");
						setTextFieldPesoTipoDePuesto("");
						setTextFieldRemuneracion("");
						setBtnConfirmarCreacionTicket(false);
					} else
						if (e.getSource()==btnConfirmarLoginEmpleador) {
							setTextFieldUsuarioEmpleador("");
							setTextFieldContraseniaEmpleador("");
							setBtnConfirmarLoginEmpleador(false);
						} else
							if (e.getSource()==btnConfirmacionCreacionUsuarioEmpleador) {
								setTextFieldCreacionUsuarioEmpleador("");
								setTextFieldCreacionContraseniaEmpleador("");
								setTextFieldCreacionNombreEmpleador("");
								setBtnConfirmacionCreacionUsuarioEmpleador(false);
							} else
								if (e.getSource()==btnConfirmacionCreacionTicketEmpleador) {
									setTextFieldPesoCargaHorariaEmpleador("");
									setTextFieldPesoEstudiosCursadosEmpleador("");
									setTextFieldPesoExpPreviaEmpleador("");
									setTextFieldPesoLocacionEmpleador("");
									setTextFieldPesoRangoEtarioEmpleador("");
									setTextFieldPesoRemuneracionEmpleador("");
									setTextFieldPesoTipoDePuestoEmpleador("");
									setTextFieldRemuneracionEmpleador("");
									setBtnConfirmarCreacionTicketEmpleador(false);
								}
					
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
	public void valueChanged(ListSelectionEvent e) { // listas
		boolean hab = !(listRondaEleccionesEmpleado.isSelectionEmpty());
		setBtnConfirmacionEleccionEmpleado(hab);

		/*
		 * boolean hab1 = !(listTicketSimpActual.isSelectionEmpty());
		 * setBotonAceptarYRechazarTicketSimplificado(hab);
		 */
		boolean hab2 = !listRondaEleccionesEmpleador.isSelectionEmpty();
		setBtnConfirmacionEleccionEmpleador(hab2);

	}
}
