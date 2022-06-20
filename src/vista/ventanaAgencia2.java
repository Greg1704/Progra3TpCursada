package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class ventanaAgencia2 extends JFrame implements KeyListener, MouseListener{

	private JPanel contentPane;
	private JTextField textFieldCrearAgencia;
	private JButton botonConfirmarNombreAgencia;
	private JButton botonConfirmarTiposTickets;
	private JButton botonRondaEncuentro;
	private JButton botonRondaContraciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaAgencia2 frame = new ventanaAgencia2();
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
	public ventanaAgencia2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1103, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel PanelGeneral = new JPanel();
		contentPane.add(PanelGeneral, BorderLayout.CENTER);
		PanelGeneral.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel PanelFuncionalidades = new JPanel();
		PanelFuncionalidades.setBorder(new CompoundBorder());
		PanelGeneral.add(PanelFuncionalidades);
		PanelFuncionalidades.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panelDatosTickets = new JPanel();
		panelDatosTickets.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		PanelFuncionalidades.add(panelDatosTickets);
		panelDatosTickets.setLayout(new GridLayout(4, 0, 0, 0));
		
		JPanel panelTiposTrabajo = new JPanel();
		panelTiposTrabajo.setBorder(new TitledBorder(null, "Tipos de Trabajo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatosTickets.add(panelTiposTrabajo);
		panelTiposTrabajo.setLayout(new GridLayout(0, 3, 0, 0));
		
		JRadioButton botonSalud = new JRadioButton("Salud");
		panelTiposTrabajo.add(botonSalud);
		
		JRadioButton botonComercioLocal = new JRadioButton("Comercio Local");
		panelTiposTrabajo.add(botonComercioLocal);
		
		JRadioButton botonComercioInternacional = new JRadioButton("Comercio Int.");
		panelTiposTrabajo.add(botonComercioInternacional);
		
		JPanel panelTipoDePuesto = new JPanel();
		panelTipoDePuesto.setBorder(new TitledBorder(null, "Tipos de puesto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatosTickets.add(panelTipoDePuesto);
		panelTipoDePuesto.setLayout(new GridLayout(0, 3, 0, 0));
		
		JRadioButton botonJunior = new JRadioButton("Junior");
		panelTipoDePuesto.add(botonJunior);
		
		JRadioButton botonSenior = new JRadioButton("Senior");
		panelTipoDePuesto.add(botonSenior);
		
		JRadioButton botonManagement = new JRadioButton("Management");
		panelTipoDePuesto.add(botonManagement);
		
		JPanel panelRangoLaboral = new JPanel();
		panelRangoLaboral.setBorder(new TitledBorder(null, "Rango Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDatosTickets.add(panelRangoLaboral);
		panelRangoLaboral.setLayout(new GridLayout(0, 3, 0, 0));
		
		JRadioButton botonMenosV1 = new JRadioButton("Menor a 60 mil");
		panelRangoLaboral.add(botonMenosV1);
		
		JRadioButton botonEntreV1yV2 = new JRadioButton("Entre 60 mil y 120 mil");
		panelRangoLaboral.add(botonEntreV1yV2);
		
		JRadioButton botonMasV2 = new JRadioButton("Mas de 120 mil");
		panelRangoLaboral.add(botonMasV2);
		
		JPanel panelConfirmacion = new JPanel();
		panelDatosTickets.add(panelConfirmacion);
		
		this.botonConfirmarTiposTickets = new JButton("Confirmar");
		panelConfirmacion.add(this.botonConfirmarTiposTickets);
		
		JPanel panelCreacionAgencia = new JPanel();
		panelCreacionAgencia.setBorder(new TitledBorder(null, "Crear Agencia", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelFuncionalidades.add(panelCreacionAgencia);
		panelCreacionAgencia.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panelNombreAgencia = new JPanel();
		panelNombreAgencia.setBorder(null);
		panelCreacionAgencia.add(panelNombreAgencia);
		panelNombreAgencia.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panelNombreAgencia.add(panel_4);
		
		JLabel labelNombreAgencia = new JLabel("Nombre de agencia");
		panel_4.add(labelNombreAgencia);
		
		JPanel panel_6 = new JPanel();
		panelNombreAgencia.add(panel_6);
		
		textFieldCrearAgencia = new JTextField();
		panel_6.add(textFieldCrearAgencia);
		textFieldCrearAgencia.setColumns(10);
			
		
		JPanel panelConfirmarNombreAgencia = new JPanel();
		panelCreacionAgencia.add(panelConfirmarNombreAgencia);
		
		this.botonConfirmarNombreAgencia = new JButton("Confirmar");
		panelConfirmarNombreAgencia.add(this.botonConfirmarNombreAgencia);
		
		JPanel panelRondaEncCont = new JPanel();
		panelRondaEncCont.setBorder(new TitledBorder(null, "Busqueda Laboral", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelFuncionalidades.add(panelRondaEncCont);
		panelRondaEncCont.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panelRondaEncCont.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panelRondaEncCont.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.botonRondaEncuentro = new JButton("Ronda de Encuentros");
		panel_2.add(this.botonRondaEncuentro);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		
		this.botonRondaContraciones = new JButton("Ronda de Contrataciones");
		panel_2.add(this.botonRondaContraciones);
		
		JPanel panel = new JPanel();
		panelRondaEncCont.add(panel);
		
		JList listComisiones = new JList();
		listComisiones.setBorder(new TitledBorder(null, "Comisiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelFuncionalidades.add(listComisiones);
		
		JPanel PanelListas = new JPanel();
		PanelListas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		PanelGeneral.add(PanelListas);
		PanelListas.setLayout(new GridLayout(4, 0, 0, 0));
		
		JList listEmpleados = new JList();
		listEmpleados.setBorder(new TitledBorder(null, "Lista Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelListas.add(listEmpleados);
		
		JList listTicketEmpleados = new JList();
		listTicketEmpleados.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Solicitudes de Empleados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		PanelListas.add(listTicketEmpleados);
		
		JList listEmpleadores = new JList();
		listEmpleadores.setBorder(new TitledBorder(null, "Lista Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelListas.add(listEmpleadores);
		
		JList listTicketEmpleadores = new JList();
		listTicketEmpleadores.setBorder(new TitledBorder(null, "Solicitudes de Empleadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelListas.add(listTicketEmpleadores);
		
		
		this.textFieldCrearAgencia.addKeyListener(this);
		
		
		this.botonConfirmarNombreAgencia.setEnabled(false);
		this.botonConfirmarTiposTickets.setEnabled(false);
		this.botonRondaEncuentro.setEnabled(false);
		this.botonRondaContraciones.setEnabled(false);
		
		//KeyListener eventoTeclado = new KeyListener(); 
	}

	@Override
	public void keyTyped(KeyEvent e) {
		boolean hab1 = this.textFieldCrearAgencia.getText().isEmpty();
		this.botonConfirmarNombreAgencia.setEnabled(hab1);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//boolean habBotonConfirmarTipoTicket = 
		
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

}
