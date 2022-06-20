package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class ventanaEmpleado extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel PanelGeneral;
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
	private JPanel panel_3;
	private JLabel labelNombreAgencia;
	private JPanel panel_4;
	private JTextField textField;
	private JPanel panelConfirmarNombreAgencia;
	private JButton botonConfirmarNombreAgencia;
	private JPanel panelRondaEncCont;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton botonRondaEncuentro;
	private JPanel panel_7;
	private JButton botonRondaContraciones;
	private JPanel panel_8;
	private JList listComisiones;
	private JPanel PanelListas;
	private JList listEmpleados;
	private JList listTicketEmpleados;
	private JList listEmpleadores;
	private JList listTicketEmpleadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaEmpleado frame = new ventanaEmpleado();
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
	public ventanaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1283, 798);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(this.contentPane);
		
		this.tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		this.contentPane.add(this.tabbedPane, BorderLayout.CENTER);
		
		this.panel = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel, null);
		this.panel.setLayout(new BorderLayout(0, 0));
		
		this.PanelGeneral = new JPanel();
		this.panel.add(this.PanelGeneral, BorderLayout.CENTER);
		this.PanelGeneral.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.PanelFuncionalidades = new JPanel();
		this.PanelFuncionalidades.setBorder(new CompoundBorder());
		this.PanelGeneral.add(this.PanelFuncionalidades);
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
		
		this.panel_3 = new JPanel();
		this.panelNombreAgencia.add(this.panel_3);
		
		this.labelNombreAgencia = new JLabel("Nombre de agencia");
		this.panel_3.add(this.labelNombreAgencia);
		
		this.panel_4 = new JPanel();
		this.panelNombreAgencia.add(this.panel_4);
		
		this.textField = new JTextField();
		this.textField.setColumns(10);
		this.panel_4.add(this.textField);
		
		this.panelConfirmarNombreAgencia = new JPanel();
		this.panelCreacionAgencia.add(this.panelConfirmarNombreAgencia);
		
		this.botonConfirmarNombreAgencia = new JButton("Confirmar");
		this.botonConfirmarNombreAgencia.setEnabled(false);
		this.panelConfirmarNombreAgencia.add(this.botonConfirmarNombreAgencia);
		
		this.panelRondaEncCont = new JPanel();
		this.panelRondaEncCont.setBorder(new TitledBorder(null, "Busqueda Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.panelRondaEncCont);
		this.panelRondaEncCont.setLayout(new GridLayout(3, 1, 0, 0));
		
		this.panel_5 = new JPanel();
		this.panelRondaEncCont.add(this.panel_5);
		
		this.panel_6 = new JPanel();
		this.panelRondaEncCont.add(this.panel_6);
		this.panel_6.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonRondaEncuentro = new JButton("Ronda de Encuentros");
		this.botonRondaEncuentro.setEnabled(false);
		this.panel_6.add(this.botonRondaEncuentro);
		
		this.panel_7 = new JPanel();
		this.panel_6.add(this.panel_7);
		
		this.botonRondaContraciones = new JButton("Ronda de Contrataciones");
		this.botonRondaContraciones.setEnabled(false);
		this.panel_6.add(this.botonRondaContraciones);
		
		this.panel_8 = new JPanel();
		this.panelRondaEncCont.add(this.panel_8);
		
		this.listComisiones = new JList();
		this.listComisiones.setBorder(new TitledBorder(null, "Comisiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.PanelFuncionalidades.add(this.listComisiones);
		
		this.PanelListas = new JPanel();
		this.PanelListas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.PanelGeneral.add(this.PanelListas);
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
		
		this.panel_1 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_1, null);
		
		this.panel_2 = new JPanel();
		this.tabbedPane.addTab("New tab", null, this.panel_2, null);
	}

}
