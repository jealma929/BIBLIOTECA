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


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SociosView {

	private JFrame frmSocios;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		frmSocios.setBounds(0, 0, 800, 600);
		frmSocios.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JPanel socios = new JPanel();
		socios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JScrollPane scrollPane_1_2_2_1_1 = new JScrollPane();
		
		JLabel lblInventario_2_1_1 = new JLabel("SOCIOS");
		lblInventario_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("< Mas informacion >");
		textArea_1.setPreferredSize(new Dimension(288, 100));
		textArea_1.setMaximumSize(new Dimension(288, 100));
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField = new JTextField();
		textField.setText("< Introduzca el Numero de socio  >");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("< Introduzca el Nombre completo >");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("< Fecha de nacimiento >");
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Trabajador");
		
		JLabel lblNewLabel_5_5_2_1_1_1 = new JLabel("BAJA");
		lblNewLabel_5_5_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_1 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JLabel lblNewLabel_5_6_1_1 = new JLabel("ALTA");
		lblNewLabel_5_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_2 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_2_1_1 = new JLabel("");
		
		JButton btnBaja_2_1_2_1_1_1 = new JButton("ALTA");
		btnBaja_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1_2 = new JButton("BAJA");
		btnBaja_2_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_2 = new JButton("BUSCAR");
		btnBaja_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_1_1 = new JButton("MODIFICAR");
		btnBaja_2_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.RED);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_3.setEditable(false);
		textField_3.setDisabledTextColor(Color.RED);
		textField_3.setColumns(10);
		textField_3.setCaretColor(Color.RED);
		
		JLabel lblNewLabel_5_5_2_1_2 = new JLabel("BUSQUEDA");
		lblNewLabel_5_5_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_3_1 = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		
		JLabel lblNewLabel_5_2_2_1_1 = new JLabel("Rellene cualqueir campo y pulse BUSCAR");
		
		JLabel lblNewLabel_5_5_2_1_2_1 = new JLabel("MODIFICAR");
		lblNewLabel_5_5_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_socios = new GroupLayout(socios);
		gl_socios.setHorizontalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(348)
					.addComponent(lblInventario_2_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(375, Short.MAX_VALUE))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 292, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
						.addComponent(textField_1, 288, 292, Short.MAX_VALUE)
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
					.addGap(94)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_1_1)
									.addPreferredGap(ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_6_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1_1, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
								.addGroup(gl_socios.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_socios.createSequentialGroup()
											.addComponent(btnBaja_2_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_1_2_1_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_1_1))
										.addComponent(textField_3, Alignment.LEADING, 330, 330, 330)))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
									.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_5_1_2_1_1_3_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5_2_2_1_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
							.addGap(25))
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(lblNewLabel_5_5_2_1_2_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_socios.setVerticalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(26)
					.addComponent(lblInventario_2_1_1)
					.addGap(18)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_6_1_1)
						.addComponent(lblNewLabel_5_1_2_1_2))
					.addGap(14)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_1_1)
						.addComponent(lblNewLabel_5_1_2_1_1_1))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1_1)
					.addGap(11)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_2)
						.addComponent(lblNewLabel_5_2_2_1_1))
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(57)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBaja_2_3_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_3_1_2)
								.addComponent(btnBaja_2_1_2_1_2)
								.addComponent(btnBaja_2_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_5_5_2_1_2_1)
									.addComponent(lblNewLabel_5_1_2_1_1_3_1))
								.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
							.addGap(2)))
					.addGap(18)
					.addComponent(scrollPane_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(120)
					.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
					.addGap(390))
		);
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
