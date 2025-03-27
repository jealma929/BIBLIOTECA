package biblioteca.demo.run;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFormattedTextField;
import javax.swing.BorderFactory;
import java.time.*;
import javax.swing.JPasswordField;

/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class PrestamoView0 {

	private JFrame frmPrestamo;
	private JTextField iSBN;
	private JTextField numSocio;
	private JTextField fechaAlta;
	private JTextField fechaDevol;
	private JTextField txtAviso;
	private ButtonGroup grupoBoton_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					PrestamoView0 window = new PrestamoView0();
					window.frmPrestamo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrestamoView0() {	//inicia el programa con una ventana grafica
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	/**
	 * notas sobre bordes
	 * 
	 * JTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
	 * JTextField.setBorder(BorderFactory.createBevelBorder());
	 * JTextField.setBorder(BorderFactory.createLoweredBevelBorder());
	 * 
	 */
	private void initialize() {
		frmPrestamo = new JFrame();
		frmPrestamo.setResizable(false);
		frmPrestamo.setTitle("PRESTAMOS");
		frmPrestamo.setBounds(0, 0, 800, 602);
		frmPrestamo.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
				
		JPanel prestamo = new JPanel();
		
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JScrollPane scrollPane_1_2_2_1_2 = new JScrollPane();
		
		JLabel titulo = new JLabel("PRESTAMO");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		iSBN = new JTextField();
		iSBN.setBorder(BorderFactory.createLoweredBevelBorder());
		iSBN.setText("< Introduzca el ISBN del libro >");
		iSBN.setColumns(10);
		
		
		numSocio = new JTextField();
		numSocio.setBorder(BorderFactory.createLoweredBevelBorder());
		numSocio.setText("< Introduzca el Numero de socio >");
		numSocio.setColumns(10);
		
		fechaAlta = new JTextField();
		fechaAlta.setBorder(BorderFactory.createLoweredBevelBorder());
		fechaAlta.setEditable(false);
		fechaAlta.setColumns(10);
		
		JLabel tiempoPrestamo = new JLabel("Duración del Prestamo");
		
		fechaDevol = new JTextField();
		fechaDevol.setText("< Fecha Devolucion >");
		fechaDevol.setEditable(false);
		fechaDevol.setColumns(10);
		
		grupoBoton_1 = new ButtonGroup();
		
		JRadioButton rdbtn15 = new JRadioButton("30 Dias");
		rdbtn15.setAlignmentY(0.0f);
		grupoBoton_1.add(rdbtn15);
		
		JRadioButton rdbtn30 = new JRadioButton("15 Dias");
		rdbtn30.setSelected(true);
		grupoBoton_1.add(rdbtn30);
		
		JLabel busca = new JLabel("BUSQUEDA");
		busca.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel buscaInfo = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		buscaInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lbl02 = new JLabel("BAJA");
		lbl02.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel bajaInfo = new JLabel("Busque, seleccione y pulse BAJA");
		bajaInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lbl01 = new JLabel("ALTA");
		lbl01.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel altaInfo = new JLabel("Rellene todos los campos y pulse ALTA");
		altaInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtAviso = new JTextField();
		txtAviso.setForeground(Color.RED);
		txtAviso.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAviso.setEditable(false);
		txtAviso.setDisabledTextColor(Color.RED);
		txtAviso.setColumns(10);
		txtAviso.setCaretColor(Color.RED);
		
		JButton botonAlta = new JButton("ALTA");
		botonAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton botonBaja = new JButton("BAJA");
		botonBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton botonBuscar = new JButton("BUSCAR");
		botonBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		passwordField = new JPasswordField();
		
		GroupLayout gl_prestamo = new GroupLayout(prestamo);
		gl_prestamo.setHorizontalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1_2, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(288)
							.addComponent(titulo)
							.addContainerGap(381, Short.MAX_VALUE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
											.addComponent(iSBN, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
											.addComponent(numSocio))
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
												.addComponent(fechaAlta, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
												.addComponent(tiempoPrestamo))
											.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_prestamo.createSequentialGroup()
													.addGap(18)
													.addComponent(fechaDevol, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_prestamo.createSequentialGroup()
													.addGap(40)
													.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtn15)
														.addComponent(rdbtn30, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))))))
									.addGap(94))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(busca, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
									.addComponent(buscaInfo, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(lbl02)
									.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
									.addComponent(bajaInfo, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(lbl01, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addComponent(altaInfo, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtAviso, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
										.addGroup(gl_prestamo.createSequentialGroup()
											.addComponent(botonAlta, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(botonBaja, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(botonBuscar)
											.addGap(109)))))
							.addGap(25))))
		);
		gl_prestamo.setVerticalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(26)
							.addComponent(titulo)
							.addGap(18)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(iSBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl01)
								.addComponent(altaInfo))
							.addGap(14)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(numSocio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbl02)
								.addComponent(bajaInfo))
							.addGap(17)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(busca)
								.addComponent(buscaInfo))
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGap(57)
									.addComponent(txtAviso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(botonBuscar)
										.addComponent(botonBaja)
										.addComponent(botonAlta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(17)
											.addComponent(rdbtn15))
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(5)
											.addComponent(tiempoPrestamo)))
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(fechaAlta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(fechaDevol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(scrollPane_1_2_2_1_2, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(136)
							.addComponent(rdbtn30)))
					.addContainerGap())
		);
		prestamo.setLayout(gl_prestamo);
		GroupLayout groupLayout = new GroupLayout(frmPrestamo.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(prestamo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(prestamo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
		);
		frmPrestamo.getContentPane().setLayout(groupLayout);
		// Hacemos visible el frame
		frmPrestamo.setVisible(true);
	}
}
