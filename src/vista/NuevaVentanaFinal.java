package vista;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import armaTickets.TicketEmpleado;
import armaTickets.TicketEmpleador;
import controlador.Controlador;
import encuentro.ListaAsignaciones;
import encuentro.UsuarioyPuntaje;
import ticketSimplificado.TicketSimplificado;
import usuariosDelSistema.Empleado;
import usuariosDelSistema.Empleador;
import usuariosDelSistema.Sistema;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class NuevaVentanaFinal extends JFrame implements KeyListener, MouseListener, ItemListener, ActionListener, ListSelectionListener, IVista { 
	
	Controlador c;
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
	private JButton btnRondaContraciones;
	private JPanel panel_5;
	private JTextArea textAreaComisiones;
	private JPanel PanelListas;
	private JList listEmpleados;
	private JList listEmpleadores;
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
	private JTextArea textAreaContrataciones;
	private final ButtonGroup buttonGroupEstados = new ButtonGroup();
	private final ButtonGroup buttonGroupEstadosEmpleador = new ButtonGroup();
	private JPanel panelCantEmpleadosBuscados;
	private JTextField textFieldCantEmpleadosBuscados;
	private JPanel panel_7;
	private JPanel panel_8;
	private JButton btnBolsaDeTrabajo;
	private JPanel panel_4;
	private JPanel panelBolsaDeTrabajo;
	private JPanel panelGeneralBolsaDeTrabajo;
	private JList listTicketsSimplificados;
	private JScrollPane scrollPaneEmpleados;
	private JScrollPane scrollPaneEmpleadores;
	private JScrollPane scrollPaneTicketsSimplificados;
	private JTextArea textAreaSimulacionThreads;
	private JScrollPane scrollPaneSimulacionThreads;
	private JTextArea textAreaContratacionesBolsaTrabajo;
	private JScrollPane scrollPaneContratacionesBolsaTrabajo;
	private JScrollPane scrollPaneContrataciones;
	private JScrollPane scrollPaneComisiones;
	private JList listTicketSimpObtenido;
	private JScrollPane scrollPaneTicketActual;
	private JScrollPane scrollPaneRondaEleccionEmpleado;
	private JScrollPane scrollPaneTicketSimpObtenido;
	private JScrollPane scrollPaneTicketActualEmpleador;
	private JScrollPane scrollPaneRondaEleccionesEmpleador;
	private JScrollPane scrollPaneTicketsSimplificadosEmpleador;
	private JButton btnConfirmarRequisitosBolsa;
	private DefaultListModel<Empleado> modelListaEmpleados; //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	private DefaultListModel<Empleador> modelListaEmpleadores;
	private DefaultListModel<TicketEmpleado> modelTicketActualEmpleado;
	private DefaultListModel<TicketEmpleador> modelTicketActualEmpleador;
	private DefaultListModel<TicketSimplificado> modelListTicketsSimpEmpleador;
	private DefaultListModel<UsuarioyPuntaje> modelListRondaEleccionesEmpleado;
	private DefaultListModel<UsuarioyPuntaje> modelListRondaEleccionesEmpleador;
	private DefaultListModel<TicketSimplificado> modelListBolsaTicketsSimp;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public NuevaVentanaFinal() {
		
		this.setVisible(true);
		
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
				new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Funcionalidades de la Agencia", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.PanelFuncionalidades.add(this.panelRondaEncCont);
		this.panelRondaEncCont.setLayout(new GridLayout(3, 1, 0, 0));

		this.panel_2 = new JPanel();
		this.panelRondaEncCont.add(this.panel_2);

		this.panel_3 = new JPanel();
		this.panelRondaEncCont.add(this.panel_3);
		this.panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panel_7 = new JPanel();
		this.panel_3.add(this.panel_7);

		this.btnRondaEncuentro = new JButton("Ronda de Encuentros");
		this.panel_7.add(this.btnRondaEncuentro);
		this.btnRondaEncuentro.setEnabled(false);
		
		this.panel_8 = new JPanel();
		this.panel_3.add(this.panel_8);

		this.btnRondaContraciones = new JButton("Ronda de Contrataciones");
		this.panel_8.add(this.btnRondaContraciones);
		this.btnRondaContraciones.setEnabled(false);
		
		this.panel_4 = new JPanel();
		this.panel_3.add(this.panel_4);
		
		this.btnBolsaDeTrabajo = new JButton("Bolsa de Trabajo");
		this.panel_4.add(this.btnBolsaDeTrabajo);

		this.panel_5 = new JPanel();
		this.panelRondaEncCont.add(this.panel_5);
		
		this.scrollPaneContrataciones = new JScrollPane();
		this.PanelFuncionalidades.add(this.scrollPaneContrataciones);

		this.textAreaContrataciones = new JTextArea();
		this.scrollPaneContrataciones.setViewportView(this.textAreaContrataciones);
		this.textAreaContrataciones.setBorder(
				new TitledBorder(null, "Contrataciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		this.scrollPaneComisiones = new JScrollPane();
		this.PanelFuncionalidades.add(this.scrollPaneComisiones);

		this.textAreaComisiones = new JTextArea();
		this.scrollPaneComisiones.setViewportView(this.textAreaComisiones);
		this.textAreaComisiones
				.setBorder(new TitledBorder(null, "Comisiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		this.PanelListas = new JPanel();
		this.PanelListas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.PanelGeneralAgencia.add(this.PanelListas);
		this.PanelListas.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.scrollPaneEmpleados = new JScrollPane();
		this.PanelListas.add(this.scrollPaneEmpleados);

		this.listEmpleados = new JList();
		this.scrollPaneEmpleados.setViewportView(this.listEmpleados);
		this.listEmpleados.setBorder(
				new TitledBorder(null, "Lista Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.modelListaEmpleados = new DefaultListModel<Empleado>();
		this.listEmpleados.setModel(modelListaEmpleados);
		listEmpleados.setName("listEmpleados");
		listEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		this.scrollPaneEmpleadores = new JScrollPane();
		this.PanelListas.add(this.scrollPaneEmpleadores);

		this.listEmpleadores = new JList();
		this.scrollPaneEmpleadores.setViewportView(this.listEmpleadores);
		this.listEmpleadores.setBorder(
				new TitledBorder(null, "Lista Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		//Seteo lista
		this.modelListaEmpleadores = new DefaultListModel<Empleador>();
		this.listEmpleadores.setModel(modelListaEmpleadores);
		listEmpleadores.setName("listEmpleadores");
		listEmpleadores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
		this.panelCreacionTicket.setBounds(10, 11, 389, 463);
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
		
		this.scrollPaneTicketActual = new JScrollPane();
		this.scrollPaneTicketActual.setBounds(10, 553, 389, 81);
		this.panelTicket.add(this.scrollPaneTicketActual);

		this.listTicketActual = new JList();
		this.scrollPaneTicketActual.setViewportView(this.listTicketActual);
		this.listTicketActual.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ticket de Busqueda Actual", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.modelTicketActualEmpleado=new DefaultListModel<TicketEmpleado>();
		this.listTicketActual.setModel(modelTicketActualEmpleado);
		
		
		this.panel_6 = new JPanel();
		this.panel_6.setBorder(
				new TitledBorder(null, "Estado del Ticket", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_6.setBounds(10, 485, 387, 57);
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
		this.panelEleccionYBolsa.setLayout(null);

		this.panelRondaElecciones = new JPanel();
		this.panelRondaElecciones.setBounds(6, 16, 395, 394);
		this.panelRondaElecciones.setLayout(null);
		this.panelEleccionYBolsa.add(this.panelRondaElecciones);
		
		this.scrollPaneRondaEleccionEmpleado = new JScrollPane();
		this.scrollPaneRondaEleccionEmpleado.setBounds(10, 11, 377, 321);
		this.panelRondaElecciones.add(this.scrollPaneRondaEleccionEmpleado);

		this.listRondaEleccionesEmpleado = new JList();
		this.scrollPaneRondaEleccionEmpleado.setViewportView(this.listRondaEleccionesEmpleado);
		this.listRondaEleccionesEmpleado
				.setBorder(new TitledBorder(null, "Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		this.modelListRondaEleccionesEmpleado=new DefaultListModel<UsuarioyPuntaje>();
		this.listRondaEleccionesEmpleado.setModel(modelListRondaEleccionesEmpleado);
		this.btnConfirmacionEleccionEmpleado = new JButton("Confirmar");
		this.btnConfirmacionEleccionEmpleado.setBounds(162, 360, 89, 23);
		this.panelRondaElecciones.add(this.btnConfirmacionEleccionEmpleado);

		this.panelBolsaTrabajo = new JPanel();
		this.panelBolsaTrabajo.setBounds(6, 414, 395, 224);
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
		this.comboBoxTipoPersonaEmpleador.setModel(new DefaultComboBoxModel(new String[] {"Fisico","Juridico"}));
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
		this.panelCreacionTicketEmpleador.setBounds(10, 11, 389, 531);
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
		
		this.scrollPaneTicketActualEmpleador = new JScrollPane();
		this.scrollPaneTicketActualEmpleador.setBounds(10, 545, 389, 89);
		this.panelTicketEmpleador.add(this.scrollPaneTicketActualEmpleador);

		this.listTicketActualEmpleador = new JList();
		this.scrollPaneTicketActualEmpleador.setViewportView(this.listTicketActualEmpleador);
		this.listTicketActualEmpleador
				.setBorder(new TitledBorder(null, "Ticket Actual", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.modelTicketActualEmpleador=new DefaultListModel<TicketEmpleador>();
		this.listTicketActualEmpleador.setModel(modelTicketActualEmpleador);
		this.panelRondaDeEleccionEmpleador = new JPanel();
		this.panelGeneralEmpleador.add(this.panelRondaDeEleccionEmpleador);
		this.panelRondaDeEleccionEmpleador.setLayout(null);

		this.panelRondaEleccionesEmpleador = new JPanel();
		this.panelRondaEleccionesEmpleador.setBorder(
				new TitledBorder(null, "Ronda de Elecci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelRondaEleccionesEmpleador.setLayout(null);
		this.panelRondaEleccionesEmpleador.setBounds(10, 11, 395, 311);
		this.panelRondaDeEleccionEmpleador.add(this.panelRondaEleccionesEmpleador);
		
		this.scrollPaneRondaEleccionesEmpleador = new JScrollPane();
		this.scrollPaneRondaEleccionesEmpleador.setBounds(10, 23, 377, 221);
		this.panelRondaEleccionesEmpleador.add(this.scrollPaneRondaEleccionesEmpleador);

		this.listRondaEleccionesEmpleador = new JList();
		this.scrollPaneRondaEleccionesEmpleador.setViewportView(this.listRondaEleccionesEmpleador);
		this.listRondaEleccionesEmpleador.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Empleados",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		this.modelListRondaEleccionesEmpleador=new DefaultListModel<UsuarioyPuntaje>();
		this.listRondaEleccionesEmpleador.setModel(modelListRondaEleccionesEmpleador);
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
		
		this.scrollPaneTicketsSimplificadosEmpleador = new JScrollPane();
		this.scrollPaneTicketsSimplificadosEmpleador.setBounds(10, 510, 387, 124);
		this.panelRondaDeEleccionEmpleador.add(this.scrollPaneTicketsSimplificadosEmpleador);

		this.listTicketSimplificadosEmpleador = new JList();
		this.scrollPaneTicketsSimplificadosEmpleador.setViewportView(this.listTicketSimplificadosEmpleador);
		this.listTicketSimplificadosEmpleador.setBorder(
		new TitledBorder(null, "Tickets Simplificados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.modelListTicketsSimpEmpleador=new DefaultListModel<TicketSimplificado>();
		this.listTicketSimplificadosEmpleador.setModel(modelListTicketsSimpEmpleador);
		
		this.scrollPaneTicketSimpObtenido = new JScrollPane();
		this.scrollPaneTicketSimpObtenido.setBounds(21, 119, 364, 94);
		this.panelBolsaTrabajo.add(this.scrollPaneTicketSimpObtenido);
		
		this.listTicketSimpObtenido = new JList();
		this.scrollPaneTicketSimpObtenido.setViewportView(this.listTicketSimpObtenido);
		this.listTicketSimpObtenido.setBorder(new TitledBorder(null, "Ticket Simplificado Obtenido", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		this.btnConfirmarRequisitosBolsa = new JButton("Confirmar");
		this.btnConfirmarRequisitosBolsa.setBounds(162, 85, 89, 23);
		this.panelBolsaTrabajo.add(this.btnConfirmarRequisitosBolsa);
		
		this.panelBolsaDeTrabajo = new JPanel();
		this.tabbedPane.addTab("Bolsa de trabajo", null, this.panelBolsaDeTrabajo, null);
		this.panelBolsaDeTrabajo.setLayout(new BorderLayout(0, 0));
		
		this.panelGeneralBolsaDeTrabajo = new JPanel();
		this.panelBolsaDeTrabajo.add(this.panelGeneralBolsaDeTrabajo, BorderLayout.CENTER);
		this.panelGeneralBolsaDeTrabajo.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.scrollPaneTicketsSimplificados = new JScrollPane();
		this.scrollPaneTicketsSimplificados.setViewportBorder(new TitledBorder(null, "Lista Tickets Simplificados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelGeneralBolsaDeTrabajo.add(this.scrollPaneTicketsSimplificados);
		
		this.listTicketsSimplificados = new JList();
		this.scrollPaneTicketsSimplificados.setViewportView(this.listTicketsSimplificados);
		this.modelListBolsaTicketsSimp=new DefaultListModel<TicketSimplificado>();
		this.listTicketsSimplificados.setModel(modelListBolsaTicketsSimp);
		
		this.scrollPaneSimulacionThreads = new JScrollPane();
		this.scrollPaneSimulacionThreads.setViewportBorder(new TitledBorder(null, "Simulaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelGeneralBolsaDeTrabajo.add(this.scrollPaneSimulacionThreads);
		
		this.textAreaSimulacionThreads = new JTextArea();
		this.scrollPaneSimulacionThreads.setViewportView(this.textAreaSimulacionThreads);
		
		this.scrollPaneContratacionesBolsaTrabajo = new JScrollPane();
		this.scrollPaneContratacionesBolsaTrabajo.setViewportBorder(new TitledBorder(null, "Contrataciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelGeneralBolsaDeTrabajo.add(this.scrollPaneContratacionesBolsaTrabajo);
		
		this.textAreaContratacionesBolsaTrabajo = new JTextArea();
		this.scrollPaneContratacionesBolsaTrabajo.setViewportView(this.textAreaContratacionesBolsaTrabajo);
		this.textAreaContratacionesBolsaTrabajo.setColumns(10);

	}
	
	public void seteoTodoPorDefault() {
		// ventana Agencia

				this.textFieldCrearAgencia.addKeyListener(this);

				this.btnConfirmarNombreAgencia.setActionCommand(confirmaCreacionAgencia);
				this.btnRondaEncuentro.setActionCommand(arrancaRondaDeEncuentro);
				this.btnRondaContraciones.setActionCommand(arrancaRondaDeContrataciones);
				this.btnBolsaDeTrabajo.setActionCommand(arrancaRondaDeContrataciones);

				this.btnConfirmarNombreAgencia.addActionListener(c);
				this.btnRondaEncuentro.addActionListener(c);
				this.btnRondaContraciones.addActionListener(c);
				this.btnConfirmarNombreAgencia.addMouseListener(this);
				this.btnRondaEncuentro.addMouseListener(this);
				this.btnRondaContraciones.addMouseListener(this);
				setBtnBolsaDeTrabajo(false);
				setBtnRondaContraciones(false);
				setBtnRondaEncuentro(false);

				// ventana Empleado

				// Seteo de los botones en false para que aparezcan en gris

				this.btnConfirmarLogin.setEnabled(false);
				this.btnConfirmacionCreacionUsuario.setEnabled(false);
				this.btnConfirmacionCreacionTicket.setEnabled(false);
				this.btnConfirmacionEleccionEmpleado.setEnabled(false);
				setCambiarEstadoTicketEmpleado(false); // los setters se hicieron desp
				
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
				
				// seteo listas
				
				listRondaEleccionesEmpleado.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
				// Funcionalidad de los botones

				this.btnConfirmarLogin.setActionCommand(confirmaLoginUsuario);
				this.btnConfirmacionCreacionUsuario.setActionCommand(confirmaCreacionUsuario);
				this.btnConfirmacionCreacionTicket.setActionCommand(confirmaCreacionTicket);
				this.btnConfirmacionEleccionEmpleado.setActionCommand(confirmaEleccionEmpleado);
				this.btnCambiarEstado.setActionCommand(confirmaEstadoTicket);

				this.btnConfirmarLogin.addActionListener(c);
				this.btnConfirmacionCreacionUsuario.addActionListener(c);
				this.btnConfirmacionCreacionTicket.addActionListener(c);
				this.btnConfirmacionEleccionEmpleado.addActionListener(c);
				this.btnCambiarEstado.addActionListener(c);
				
				this.btnConfirmarLogin.addMouseListener(this);
				this.btnConfirmacionCreacionUsuario.addMouseListener(this);
				this.btnConfirmacionCreacionTicket.addMouseListener(this);
				this.btnConfirmacionEleccionEmpleado.addMouseListener(this);

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
				this.btnCrearTicketSimplificado.setEnabled(true);
				setCambiarEstadoTicketEmpleador(false); // setters se hicieron despues
				
				// Seteo ComboBox
				
				comboBoxRubroEmpleador.addItem("Salud");
				comboBoxRubroEmpleador.addItem("ComercioLocal");
				comboBoxRubroEmpleador.addItem("ComercioInternacional");
				
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
				
				// seteo listas
				
				listRondaEleccionesEmpleador.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

				//

				this.btnConfirmarLoginEmpleador.setActionCommand(confirmarLoginEmpleador);
				this.btnConfirmacionCreacionUsuarioEmpleador.setActionCommand(confirmacionCreacionUsuarioEmpleador);
				this.btnConfirmacionCreacionTicketEmpleador.setActionCommand(confirmacionCreacionTicketEmpleador);
				this.btnCambiarEstadoEmpleador.setActionCommand(confirmaCambioEstadoEmpleador);
				this.btnConfirmacionEleccionEmpleador.setActionCommand(confirmacionEleccionEmpleador);
				this.btnCrearTicketSimplificado.setActionCommand(confirmaCracionTicketSimplificado);
				
				
				
				this.btnConfirmarLoginEmpleador.addActionListener(c); 
				this.btnConfirmacionCreacionUsuarioEmpleador.addActionListener(c);
				this.btnConfirmacionCreacionTicketEmpleador.addActionListener(c);
				this.btnConfirmacionEleccionEmpleador.addActionListener(c);
				this.btnCrearTicketSimplificado.addActionListener(c);
				this.btnCambiarEstadoEmpleador.addActionListener(c);
				
				this.btnConfirmarLoginEmpleador.addMouseListener(this);
				this.btnConfirmacionCreacionUsuarioEmpleador.addMouseListener(this);
				this.btnConfirmacionCreacionTicketEmpleador.addMouseListener(this);
				this.btnConfirmacionEleccionEmpleador.addMouseListener(this);
				this.btnCrearTicketSimplificado.addMouseListener(this);

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
				this.textFieldCantEmpleadosBuscados.addKeyListener(this);
				
				EmpleadoLogeado(false);
				EmpleadorLogeado(false);
			}
	
	public void setControlador(Controlador c) {
		this.c = c;
		seteoTodoPorDefault();
	}

	public void setBtnBolsaDeTrabajo(boolean hab) {
		this.btnBolsaDeTrabajo.setEnabled(hab);
	}

	public String getTextFieldCrearAgencia() {
		return textFieldCrearAgencia.getText();
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

	public int getTextFieldCreacionTelefono() {
		return Integer.parseInt((String)textFieldCreacionTelefono.getText());
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

	public TicketEmpleado getListTicketActual() {
		return (TicketEmpleado)listTicketActual.getSelectedValue();
	}

	public Empleador getListRondaEleccionesEmpleado() { 
		return (Empleador) this.modelListRondaEleccionesEmpleado.get(this.listRondaEleccionesEmpleado.getSelectedIndex()).getUsuario();
	}
	
	public void setListEmpleados(JList listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	public void setListEmpleadores(JList listEmpleadores) {
		this.listEmpleadores = listEmpleadores;
	}

/*	public void setListTicketActual(TicketEmpleado ticket) {
		this.listTicketActual.add(ticket); //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
	}
	*/

	public void setListRondaEleccionesEmpleado(JList listRondaEleccionesEmpleado) {
		this.listRondaEleccionesEmpleado = listRondaEleccionesEmpleado;
	}

	public void setListTicketActualEmpleador(JList listTicketActualEmpleador) {
		this.listTicketActualEmpleador = listTicketActualEmpleador;
	}

	public void setListRondaEleccionesEmpleador(JList listRondaEleccionesEmpleador) {
		this.listRondaEleccionesEmpleador = listRondaEleccionesEmpleador;
	}

	public void setListTicketSimplificadosEmpleador(JList listTicketSimplificadosEmpleador) {
		this.listTicketSimplificadosEmpleador = listTicketSimplificadosEmpleador;
	}

	public void setListTicketsSimplificados(JList listTicketsSimplificados) {
		this.listTicketsSimplificados = listTicketsSimplificados;
	}

	public void setListTicketSimpObtenido(JList listTicketSimpObtenido) {
		this.listTicketSimpObtenido = listTicketSimpObtenido;
	}

	public String getComboBoxBolsaTipoTrabajo() {
		return (String) comboBoxBolsaTipoTrabajo.getSelectedItem();
	}

	public String getComboBoxBolsaLocacion() {
		return (String) comboBoxBolsaLocacion.getSelectedItem();
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

	/*public String getListTicketActualEmpleador() {
		return listTicketActualEmpleador;
	}
	*/

	public ArrayList<Empleado> getListRondaEleccionesEmpleador() {
		int[] aux = this.listRondaEleccionesEmpleador.getSelectedIndices();
		ArrayList<Empleado> arrayAux=new ArrayList<Empleado>();
		for(int i=0;i<aux.length;i++) {
			arrayAux.add((Empleado) this.modelListRondaEleccionesEmpleador.get(aux[i]).getUsuario());
		}
		return arrayAux;
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

	public TicketSimplificado getListTicketSimplificadosEmpleador() {
		return (TicketSimplificado)listTicketSimplificadosEmpleador.getSelectedValue();
	}

	public int getTextFieldCantEmpleadosBuscados() {
		return Integer.parseInt((String) textFieldCantEmpleadosBuscados.getText());
	}

	
	public void setBtnRondaEncuentro(boolean hab) {
		this.btnRondaEncuentro.setEnabled(hab);
	}

	public void setBtnRondaContraciones(boolean hab) {
		this.btnRondaContraciones.setEnabled(hab);
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
		this.comboBoxBolsaLocacionEmpleador.setSelectedIndex(0);;
	}

	public void setTextFieldCantEmpleadosBuscados(String textFieldCantEmpleadosBuscados) {
		this.textFieldCantEmpleadosBuscados.setText(textFieldCantEmpleadosBuscados);
	}

	public void setBtnConfirmarRequisitosBolsa(boolean hab) {
		this.btnConfirmarRequisitosBolsa.setEnabled(hab);
	}

	public void setBtnCrearTicketSimplificado(boolean hab) {
		this.btnCrearTicketSimplificado.setEnabled(hab);
	}
	
	public void AdminLogueado(boolean hab) {
			listEmpleados.setEnabled(hab);
			listEmpleados.setEnabled(hab);
			textAreaContrataciones.setEnabled(hab);
			textAreaComisiones.setEnabled(hab);
			setBtnBolsaDeTrabajo(true);
			setBtnRondaEncuentro(true);
			if (hab) {
				textFieldCrearAgencia.setText(c.nombreSistema());
				textFieldCrearAgencia.setEnabled(false);
			}
	}

	public void EmpleadoLogeado(boolean hab) { // // si es true, va a prender o apagar todo. 
			textFieldRemuneracion.setEnabled(hab);
			textFieldPesoLocacion.setEnabled(hab);
			textFieldPesoRemuneracion.setEnabled(hab);
			textFieldPesoCargaHoraria.setEnabled(hab);
			textFieldPesoTipoDePuesto.setEnabled(hab);
			comboBoxLocacion.setEnabled(hab);
			comboBoxTipoDePuesto.setEnabled(hab);
			comboBoxCargaHoraria.setEnabled(hab);
			comboBoxEstudiosCursados.setEnabled(hab);
			comboBoxExperienciaPrevia.setEnabled(hab);
			comboBoxBolsaLocacion.setEnabled(hab);
			comboBoxBolsaTipoTrabajo.setEnabled(hab);
			setBtnConfirmarRequisitosBolsa(hab);
			listRondaEleccionesEmpleado.setEnabled(hab);
			setTextFieldPesoCargaHoraria("");
			setTextFieldPesoLocacion("");
			setTextFieldPesoRemuneracion("");
			setTextFieldPesoTipoDePuesto("");
			setTextFieldRemuneracion("");
			
			listTicketActual.setEnabled(hab);
			listTicketSimpObtenido.setEnabled(hab);
			
			//Funcion de controlador que me traiga Ticket Actual, Lista Ronda Encuentros, Ticket simp obtenido
			if (hab) {
				ActualizarListaTicketActualEmpleado();
				if(c.checkRondaEncuentroHecha())
					ActualizarListaRondaEleccionesEmpleado();
				if (c.empleadoYaEligio()) { // el else viene por defecto
					setBtnConfirmacionEleccionEmpleado(false);
					listRondaEleccionesEmpleado.setEnabled(false);
				}
			}
	}
	
	public void EmpleadorLogeado(boolean hab) { // si es true, va a prender o apagar todo
			textFieldRemuneracionEmpleador.setEnabled(hab);
			textFieldPesoLocacionEmpleador.setEnabled(hab);
			textFieldPesoRemuneracionEmpleador.setEnabled(hab);
			textFieldPesoCargaHorariaEmpleador.setEnabled(hab);
			textFieldPesoTipoDePuestoEmpleador.setEnabled(hab);
			textFieldPesoRangoEtarioEmpleador.setEnabled(hab);
			textFieldPesoExpPreviaEmpleador.setEnabled(hab);
			textFieldPesoEstudiosCursadosEmpleador.setEnabled(hab);
			textFieldCantEmpleadosBuscados.setEnabled(hab);
			comboBoxLocacionEmpleador.setEnabled(hab);
			comboBoxRangoEtarioEmpleador.setEnabled(hab);
			comboBoxTipoDePuestoEmpleador.setEnabled(hab);
			comboBoxCargaHorariaEmpleador.setEnabled(hab);
			comboBoxEstudiosCursadosEmpleador.setEnabled(hab);
			comboBoxExperienciaPreviaEmpleador.setEnabled(hab);
			comboBoxBolsaLocacionEmpleador.setEnabled(hab);
			comboBoxBolsaTipoTrabajoEmpleador.setEnabled(hab);
			setBtnCrearTicketSimplificado(hab);
			listRondaEleccionesEmpleador.setEnabled(hab);
			setTextFieldPesoCargaHorariaEmpleador("");
			setTextFieldPesoEstudiosCursadosEmpleador("");
			setTextFieldPesoExpPreviaEmpleador("");
			setTextFieldPesoLocacionEmpleador("");
			setTextFieldPesoRangoEtarioEmpleador("");
			setTextFieldPesoRemuneracionEmpleador("");
			setTextFieldPesoTipoDePuestoEmpleador("");
			setTextFieldRemuneracionEmpleador("");
			setTextFieldCantEmpleadosBuscados("");
			
			listTicketActualEmpleador.setEnabled(hab);
			listTicketSimplificadosEmpleador.setEnabled(hab);
			
			if (hab) {
				if(c.checkRondaEncuentroHecha())
					ActualizarListaRondaEleccionesEmpleador();
				if (c.empleadorYaEligio()) {
					setBtnConfirmacionEleccionEmpleador(false);
					listRondaEleccionesEmpleador.setEnabled(false);
				}
				ActualizarListaTicketActualEmpleador();
				ActualizarListaTicketSimpEmpleadores();
			}
	}
	
	
	public void ActualizarListaEmpleados() {
		this.modelListaEmpleados.clear();
		ArrayList<Empleado> it=c.RecuperaListaEmpleados();
		for(int i=0;i<it.size();i++) {
			this.modelListaEmpleados.addElement(it.get(i));
		}
	}
	
	public void ActualizarListaEmpleadores() {
		this.modelListaEmpleadores.clear();
		ArrayList<Empleador> it=c.RecuperaListaEmpleadores();
		for(int i=0;i<it.size();i++) {
			this.modelListaEmpleadores.addElement(it.get(i));
		}
	}
	
	public void ActualizarListaTicketActualEmpleado() {
		this.modelTicketActualEmpleado.clear();
		this.modelTicketActualEmpleado.addElement(c.RecuperaTicketEmpleado());
		setCambiarEstadoTicketEmpleado(true);
	}
	
	public void ActualizarListaTicketActualEmpleador() {
		this.modelTicketActualEmpleador.clear();
		this.modelTicketActualEmpleador.addElement(c.RecuperaTicketEmpleador());
		setCambiarEstadoTicketEmpleador(true);
	}
	
	
	public void ActualizarListaTicketSimpEmpleadores() {
		this.modelListTicketsSimpEmpleador.clear();
		ArrayList<TicketSimplificado> it=c.RecuperaListaTicketSimplificadosEmpleadores();
		for(int i=0;i<it.size();i++) {
			this.modelListTicketsSimpEmpleador.addElement(it.get(i));
		}
	}
	
	public void ActualizarListaRondaEleccionesEmpleado() {  
		this.modelListRondaEleccionesEmpleado.clear();
		ListaAsignaciones it=c.RecuperaListaAsignacionEmpleado();
		for(int i=0;i<it.getOrdenados().size();i++) {
			this.modelListRondaEleccionesEmpleado.addElement(it.getOrdenados().get(i));
		}
		setBtnConfirmacionEleccionEmpleado(true);
	}
	
	public void ActualizarListaRondaEleccionesEmpleador() {  
		this.modelListRondaEleccionesEmpleador.clear();
		ListaAsignaciones it=c.RecuperaListaAsignacionEmpleador();
		for(int i=0;i<it.getOrdenados().size();i++) {
			this.modelListRondaEleccionesEmpleador.addElement(it.getOrdenados().get(i));
		}
		setBtnConfirmacionEleccionEmpleador(true);
	}
	
	public void ActualizarBolsaTicketsSimp() {  //NO MUESTRA EN PANTALLAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		this.modelListBolsaTicketsSimp.clear();
		ArrayList<TicketSimplificado> it=c.RecuperaListaBolsaTicketSimp();
		for(int i=0;i<it.size();i++) {
			this.modelListBolsaTicketsSimp.addElement(it.get(i));
		}
	}
	
	public void habilitaRondaDeContrataciones() {
		setBtnRondaContraciones(true);
	}
	
	public void ActualizarTextAreaComisiones(String mensaje) {  
		textAreaComisiones.append(mensaje); 
	}
	
	public void ActualizarTextAreaContrataciones(String mensaje) {  
		textAreaContrataciones.append(mensaje); 
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

		if (e.getSource() == textFieldCrearAgencia) {
			
			boolean hab = !(textFieldCrearAgencia.getText().isEmpty());
			setBtnConfirmarNombreAgencia(hab);
			
			} else 
				
				if (e.getSource()==textFieldUsuario || e.getSource()==textFieldContrasenia) {
					
					boolean hab1 = !(textFieldUsuario.getText().isEmpty() || textFieldContrasenia.getText().isEmpty()) && c.ExisteAgencia();
					setBtnConfirmarLogin(hab1);
				
				} else 
					if (e.getSource() == textFieldCreacionUsuario || e.getSource() == textFieldCreacionContrasenia || e.getSource() == textFieldCreacionNyA || e.getSource() == textFieldCreacionDNI 
						|| e.getSource() == textFieldCreacionTelefono || e.getSource() == textFieldCreacionEdad || e.getSource() == textFieldCreacionCiudad) {
					
						boolean hab2 = !(textFieldCreacionUsuario.getText().isEmpty()
								|| textFieldCreacionContrasenia.getText().isEmpty() || textFieldCreacionNyA.getText().isEmpty()
								|| textFieldCreacionDNI.getText().isEmpty() || textFieldCreacionTelefono.getText().isEmpty()
								|| textFieldCreacionEdad.getText().isEmpty() || textFieldCreacionCiudad.getText().isEmpty()) && c.ExisteAgencia();
						setBtnConfirmacionCreacionUsuario(hab2);
			
					} else 
						if (e.getSource() == textFieldPesoCargaHoraria || e.getSource() == textFieldPesoLocacion || e.getSource() == textFieldPesoRemuneracion || e.getSource() == textFieldPesoTipoDePuesto || 
						e.getSource() == textFieldRemuneracion) {

							boolean hab3 = !(textFieldPesoCargaHoraria.getText().isEmpty() || textFieldPesoLocacion.getText().isEmpty()
								|| textFieldPesoRemuneracion.getText().isEmpty() || textFieldPesoTipoDePuesto.getText().isEmpty() || textFieldRemuneracion.getText().isEmpty());
							setBtnConfirmarCreacionTicket(hab3);
						} else 
							if (e.getSource() == textFieldUsuarioEmpleador || e.getSource() == textFieldContraseniaEmpleador) {
					
								boolean hab4 = !(textFieldUsuarioEmpleador.getText().isEmpty()
										|| textFieldContraseniaEmpleador.getText().isEmpty()) && c.ExisteAgencia();
								setBtnConfirmarLoginEmpleador(hab4);
							} else
								if (e.getSource() == textFieldRemuneracion || e.getSource() == textFieldPesoCargaHoraria || e.getSource() == textFieldPesoLocacion || e.getSource() == textFieldPesoTipoDePuesto ||
								e.getSource() == textFieldPesoRemuneracion) {
			
									boolean hab5 = !(textFieldRemuneracion.getText().isEmpty() || textFieldPesoCargaHoraria.getText().isEmpty() || textFieldPesoLocacion.getText().isEmpty() || textFieldPesoTipoDePuesto.getText().isEmpty()
											|| textFieldPesoRemuneracion.getText().isEmpty());
									setBtnConfirmarCreacionTicket(hab5);
								} else
									if (e.getSource() == textFieldRemuneracionEmpleador || e.getSource() == textFieldPesoCargaHorariaEmpleador || e.getSource() == textFieldPesoEstudiosCursadosEmpleador
										|| e.getSource() == textFieldPesoExpPreviaEmpleador || e.getSource() == textFieldPesoLocacionEmpleador || e.getSource() == textFieldPesoRangoEtarioEmpleador
										|| e.getSource() == textFieldPesoRemuneracionEmpleador || e.getSource() == textFieldPesoTipoDePuestoEmpleador || e.getSource() == textFieldCantEmpleadosBuscados) {
			
										boolean hab6 = !(textFieldRemuneracionEmpleador.getText().isEmpty() || textFieldPesoCargaHorariaEmpleador.getText().isEmpty() || textFieldPesoEstudiosCursadosEmpleador.getText().isEmpty() 
												|| textFieldPesoExpPreviaEmpleador.getText().isEmpty() || textFieldPesoLocacionEmpleador.getText().isEmpty() || textFieldPesoRangoEtarioEmpleador.getText().isEmpty() || textFieldPesoRemuneracionEmpleador.getText().isEmpty() || 
												textFieldPesoTipoDePuestoEmpleador.getText().isEmpty() || textFieldCantEmpleadosBuscados.getText().isEmpty());
										setBtnConfirmarCreacionTicketEmpleador(hab6);
									} else
										if (e.getSource() == textFieldCreacionUsuarioEmpleador || e.getSource() == textFieldCreacionContraseniaEmpleador || e.getSource() == textFieldCreacionNombreEmpleador) {
			
											boolean hab7 = !(textFieldCreacionUsuarioEmpleador.getText().isEmpty() || textFieldCreacionContraseniaEmpleador.getText().isEmpty() || textFieldCreacionNombreEmpleador.getText().isEmpty()) && c.ExisteAgencia();
											setBtnConfirmacionCreacionUsuarioEmpleador(hab7);
										}
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
		if (e.getSource()==btnConfirmarNombreAgencia && btnConfirmarNombreAgencia.isEnabled()) {
			setTextFieldCrearAgencia("");
			setBtnConfirmarNombreAgencia(false);
		} else
			if (e.getSource()==btnConfirmarLogin && btnConfirmarLogin.isEnabled()) {
				setTextFieldUsuario("");
				setTextFieldContrasenia("");
				setBtnConfirmarLogin(false);
			} else
				if (e.getSource()==btnConfirmacionCreacionUsuario && btnConfirmacionCreacionUsuario.isEnabled()) {
					setTextFieldCreacionUsuario("");
					setTextFieldCreacionContrasenia("");
					setTextFieldCreacionNyA("");
					setTextFieldCreacionDNI("");
					setTextFieldCreacionTelefono("");
					setTextFieldCreacionEdad("");
					setTextFieldCreacionCiudad("");
					setBtnConfirmacionCreacionUsuario(false); 
				} else
					if (e.getSource()==btnConfirmacionCreacionTicket && btnConfirmacionCreacionTicket.isEnabled()) {
						setTextFieldPesoCargaHoraria("");
						setTextFieldPesoLocacion("");
						setTextFieldPesoRemuneracion("");
						setTextFieldPesoTipoDePuesto("");
						setTextFieldRemuneracion("");
						setComboBoxCargaHoraria();
						setComboBoxLocacion();
						setComboBoxEstudiosCursados();
						setComboBoxExperienciaPrevia();
						setComboBoxTipoDePuesto();
						setBtnConfirmarCreacionTicket(false);
					} else
						if (e.getSource() == btnConfirmacionEleccionEmpleado && btnConfirmacionEleccionEmpleado.isEnabled()) {
							setBtnConfirmacionEleccionEmpleado(false);
							listRondaEleccionesEmpleado.setEnabled(false);
						} else
							if (e.getSource()==btnConfirmarLoginEmpleador && btnConfirmarLoginEmpleador.isEnabled()) {
								setTextFieldUsuarioEmpleador("");
								setTextFieldContraseniaEmpleador("");
								setBtnConfirmarLoginEmpleador(false);
							} else
								if (e.getSource()==btnConfirmacionCreacionUsuarioEmpleador && btnConfirmacionCreacionUsuarioEmpleador.isEnabled()) {
									setTextFieldCreacionUsuarioEmpleador("");
									setTextFieldCreacionContraseniaEmpleador("");
									setTextFieldCreacionNombreEmpleador("");
									setComboBoxTipoPersonaEmpleador();
									setComboBoxRubroEmpleador();
									setBtnConfirmacionCreacionUsuarioEmpleador(false);
								} else
									if (e.getSource()==btnConfirmacionCreacionTicketEmpleador && btnConfirmacionCreacionTicketEmpleador.isEnabled()) {
										setTextFieldPesoCargaHorariaEmpleador("");
										setTextFieldPesoEstudiosCursadosEmpleador("");
										setTextFieldPesoExpPreviaEmpleador("");
										setTextFieldPesoLocacionEmpleador("");
										setTextFieldPesoRangoEtarioEmpleador("");
										setTextFieldPesoRemuneracionEmpleador("");
										setTextFieldPesoTipoDePuestoEmpleador("");
										setTextFieldRemuneracionEmpleador("");
										setTextFieldCantEmpleadosBuscados("");
										setComboBoxLocacionEmpleador();
										setComboBoxCargaHorariaEmpleador();
										setComboBoxTipoDePuestoEmpleador();
										setComboBoxEstudiosCursadosEmpleador();
										setComboBoxExperienciaPreviaEmpleador();
										setComboBoxRangoEtarioEmpleador();
										setBtnConfirmarCreacionTicketEmpleador(false);
									} else
										if (e.getSource()==btnCrearTicketSimplificado && btnCrearTicketSimplificado.isEnabled()) {
											setComboBoxBolsaTipoTrabajoEmpleador();
											setComboBoxBolsaLocacionEmpleador();
										} else
											if (e.getSource() == btnConfirmacionEleccionEmpleador && btnConfirmacionEleccionEmpleador.isEnabled()) {
												setBtnConfirmacionEleccionEmpleador(false);
												listRondaEleccionesEmpleador.setEnabled(false);
											}
											if (e.getSource() == btnRondaEncuentro && btnRondaEncuentro.isEnabled()) {
												setBtnRondaEncuentro(false);
												setBtnRondaContraciones(true);
											} else
												if (e.getSource() == btnRondaContraciones && btnRondaContraciones.isEnabled()) {
													setBtnRondaContraciones(false);
													setBtnRondaEncuentro(true);				
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
		
		if (e.getSource()==listRondaEleccionesEmpleado) {
		boolean hab = !(listRondaEleccionesEmpleado.isSelectionEmpty());
		setBtnConfirmacionEleccionEmpleado(hab);
		} else 
			if (e.getSource()==listRondaEleccionesEmpleador) {
				boolean hab2 = !listRondaEleccionesEmpleador.isSelectionEmpty();
				setBtnConfirmacionEleccionEmpleador(hab2);
			}
	}
}
