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


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class InventarioView {

	private JFrame frmInventario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				try {
					InventarioView window = new InventarioView();
					window.frmInventario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InventarioView() {	//inicia el programa con una ventana grafica
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInventario = new JFrame();
		frmInventario.setTitle("INVENTARIO");
		frmInventario.setBounds(0, 0, 287, 185);
		frmInventario.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JPanel prestamo = new JPanel();
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton = new JButton("ALTA ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("PRESTAMOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnBaja = new JButton("BAJA");
		btnBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField = new JTextField();
		textField.setText("< Introduzca el ISBN del libro >");
		textField.setColumns(10);
		
		JButton btnNewButton_4_1_2 = new JButton("OK");
		
		JButton btnNewButton_4_1 = new JButton("OK");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("15 dias");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("30 dias");
		rdbtnNewRadioButton_1.setAlignmentY(0.0f);
		
		textField_1 = new JTextField();
		textField_1.setText("< Introduzca el Numero de socio >");
		textField_1.setColumns(10);
		
		JButton btnNewButton_4_1_3 = new JButton("OK");
		
		textField_2 = new JTextField();
		textField_2.setText("< Fecha inico >");
		textField_2.setEnabled(false);
		textField_2.setDisabledTextColor(Color.BLACK);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("< Fecha  devolución >");
		textField_3.setEnabled(false);
		textField_3.setDisabledTextColor(Color.BLACK);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("< Introduzca el ISBN del libro >");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("< Numero de socio >");
		textField_5.setEnabled(false);
		textField_5.setDisabledTextColor(Color.BLACK);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText(" < Avisos >");
		textField_6.setSelectedTextColor(Color.BLACK);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setEditable(false);
		textField_6.setDisabledTextColor(Color.BLACK);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setText("< Fecha Inico >");
		textField_7.setEnabled(false);
		textField_7.setDisabledTextColor(Color.BLACK);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setText("< Fecha  devolución >");
		textField_8.setEnabled(false);
		textField_8.setDisabledTextColor(Color.BLACK);
		textField_8.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel_4 = new JLabel("Prestamos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_prestamo = new GroupLayout(prestamo);
		gl_prestamo.setHorizontalGroup(
			gl_prestamo.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 769, Short.MAX_VALUE)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(119)
					.addComponent(btnNewButton)
					.addGap(142)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
					.addComponent(btnBaja)
					.addGap(318))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_4_1_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(6))
						.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_prestamo.createSequentialGroup()
								.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_prestamo.createSequentialGroup()
										.addGap(30)
										.addComponent(rdbtnNewRadioButton)
										.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
										.addComponent(rdbtnNewRadioButton_1)
										.addGap(61))
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(132))
							.addGroup(gl_prestamo.createSequentialGroup()
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_5)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
					.addGap(223))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(189, Short.MAX_VALUE))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(868, Short.MAX_VALUE))
		);
		gl_prestamo.setVerticalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel))
						.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1)
						.addComponent(btnNewButton_4_1_2))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_3))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4)
					.addGap(28)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		prestamo.setLayout(gl_prestamo);
		GroupLayout groupLayout = new GroupLayout(frmInventario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(prestamo, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(prestamo, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		frmInventario.getContentPane().setLayout(groupLayout);
	}
}
