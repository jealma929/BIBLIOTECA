package biblioteca.demo.run;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import biblioteca.demo.run.*;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTable;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SociosView {

	private JFrame frmSocios;
	private JTextField txtNumSocio;
	private JTextField txtNombreS;
	private JTextField txtFecha;
	private JTextField txtAviso;
	private JTable tablaSocios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					SociosView window = new SociosView();
					window.frmSocios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SociosView() {	//inicia el programa con una ventana grafica
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocios = new JFrame();
		frmSocios.setTitle("SOCIOS");
		frmSocios.setBounds(0, 0, 815, 601);
		frmSocios.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JPanel socios = new JPanel();
		socios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JScrollPane scrollSocios = new JScrollPane();
		
		JLabel lblSocio = new JLabel("SOCIOS");
		lblSocio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextArea txtMasInfo = new JTextArea();
		txtMasInfo.setText("< Mas informacion >");
		txtMasInfo.setPreferredSize(new Dimension(288, 100));
		txtMasInfo.setMaximumSize(new Dimension(288, 100));
		txtMasInfo.setLineWrap(true);
		txtMasInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtNumSocio = new JTextField();
		txtNumSocio.setText("< Introduzca el Numero de socio  >");
		txtNumSocio.setColumns(10);
		
		txtNombreS = new JTextField();
		txtNombreS.setText("< Introduzca el Nombre completo >");
		txtNombreS.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setText("< Fecha de nacimiento >");
		txtFecha.setColumns(10);
		
		JCheckBox chckbxTrabajador = new JCheckBox("Trabajador");
				
		JLabel lblBaja = new JLabel("BAJA");
		lblBaja.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoBaja = new JLabel("Busque, seleccione y pulse BAJA");
		lblInfoBaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblAlta = new JLabel("ALTA");
		lblAlta.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoAlta = new JLabel("Rellene todos los campos y pulse ALTA");
		lblInfoAlta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnAlta = new JButton("ALTA");
		btnAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja = new JButton("BAJA");
		btnBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtAviso = new JTextField();
		txtAviso.setForeground(Color.RED);
		txtAviso.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAviso.setEditable(false);
		txtAviso.setDisabledTextColor(Color.RED);
		txtAviso.setColumns(10);
		txtAviso.setCaretColor(Color.RED);
		
		JLabel lblBuscar = new JLabel("BUSQUEDA");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoModif = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		lblInfoModif.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInfoBuscar = new JLabel("Rellene cualqueir campo y pulse BUSCAR");
		lblInfoBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblModificar = new JLabel("MODIFICAR");
		lblModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_socios = new GroupLayout(socios);
		gl_socios.setHorizontalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollSocios, GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(348)
					.addComponent(lblSocio, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(385, Short.MAX_VALUE))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addComponent(txtMasInfo, GroupLayout.PREFERRED_SIZE, 292, Short.MAX_VALUE)
						.addComponent(txtNumSocio, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(txtNombreS, 288, 292, Short.MAX_VALUE)
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(chckbxTrabajador, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
					.addGap(94)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblBaja)
									.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
									.addComponent(lblInfoBaja, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblAlta, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addComponent(lblInfoAlta, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_socios.createSequentialGroup()
											.addComponent(btnAlta, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBuscar)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnModificar))
										.addComponent(txtAviso, Alignment.LEADING, 330, 330, 330)))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblBuscar, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
									.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
										.addComponent(lblInfoModif, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInfoBuscar, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
							.addGap(25))
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(lblModificar, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_socios.setVerticalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(26)
					.addComponent(lblSocio)
					.addGap(18)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumSocio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAlta)
						.addComponent(lblInfoAlta))
					.addGap(14)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNombreS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBaja)
						.addComponent(lblInfoBaja))
					.addGap(17)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBuscar)
						.addComponent(lblInfoBuscar))
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(57)
							.addComponent(txtAviso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar)
								.addComponent(btnBaja)
								.addComponent(btnAlta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblModificar)
									.addComponent(lblInfoModif))
								.addComponent(txtMasInfo, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
							.addGap(2)))
					.addGap(18)
					.addComponent(scrollSocios, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(120)
					.addComponent(chckbxTrabajador, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addGap(390))
		);
		
		tablaSocios = new JTable();
		scrollSocios.setViewportView(tablaSocios);
		socios.setLayout(gl_socios);
		GroupLayout groupLayout = new GroupLayout(frmSocios.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(socios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(socios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
		);
		frmSocios.getContentPane().setLayout(groupLayout);
		// Hacemos visible el frame
		frmSocios.setVisible(true);
	}
}
