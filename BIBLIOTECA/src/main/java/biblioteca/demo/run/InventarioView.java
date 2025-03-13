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


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class InventarioView {

	private JFrame frmInventario;
	private JTextField iSBN;
	private JTextField titulo;
	private JTextField autor;
	private JTextField edicion;
	private JTextField textField_4;
	private ButtonGroup bG_1;

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
		frmInventario.setResizable(false);
		frmInventario.setVisible(true);
		frmInventario.setTitle("INVENTARIO");
		frmInventario.setBounds(0, 0, 805, 600);
		frmInventario.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		JPanel inventario = new JPanel();
		inventario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		iSBN = new JTextField();
		iSBN.setText("< Introduzca el ISBN del libro >");
		iSBN.setColumns(10);
		
		titulo = new JTextField();
		titulo.setText("< Introduzca el Titulo >");
		titulo.setColumns(10);
		
		autor = new JTextField();
		autor.setText("< Introduzca el Autor >");
		autor.setColumns(10);
		
		edicion = new JTextField();
		edicion.setText("< Introduzca la Edicion >");
		edicion.setColumns(10);
		
		JLabel lblNewLabel_5_5_2_1 = new JLabel("BUSQUEDA");
		lblNewLabel_5_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2_2_1 = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		
		JLabel lblNewLabel_5_5_2_1_1 = new JLabel("BAJA");
		lblNewLabel_5_5_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JLabel lblNewLabel_5_6_1 = new JLabel("ALTA");
		lblNewLabel_5_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_2_1 = new JLabel("");
		
		JButton btnBaja_2_1_2_1_1 = new JButton("ALTA");
		btnBaja_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1 = new JButton("BAJA");
		btnBaja_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1 = new JButton("BUSCAR");
		btnBaja_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_1 = new JButton("MODIFICAR");
		btnBaja_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_5_2_1_4 = new JLabel("MODIFICAR");
		lblNewLabel_5_5_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_3 = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.RED);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_4.setEditable(false);
		textField_4.setDisabledTextColor(Color.RED);
		textField_4.setColumns(10);
		textField_4.setCaretColor(Color.RED);
		
		bG_1 = new ButtonGroup();
		
		JRadioButton rdbtnInfantil = new JRadioButton("Infantil");
		bG_1.add(rdbtnInfantil);
		
		JRadioButton rdbtnAdulto = new JRadioButton("Adulto");
		rdbtnAdulto.setSelected(true);
		rdbtnAdulto.setAlignmentY(0.0f);
		bG_1.add(rdbtnAdulto);
		
		JLabel lblInventario_2_1 = new JLabel("INVENTARIO");
		lblInventario_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollPane_1_2_2_1 = new JScrollPane();
		GroupLayout gl_inventario = new GroupLayout(inventario);
		gl_inventario.setHorizontalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(iSBN, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(titulo)
								.addComponent(autor)
								.addComponent(edicion))
							.addGap(94)
							.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_2_2_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_1)
									.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_6_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
								.addGroup(gl_inventario.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(btnBaja_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_1_2_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_1))
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(lblNewLabel_5_5_2_1_4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
											.addComponent(lblNewLabel_5_1_2_1_1_3, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))))
							.addGap(26))
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(63)
							.addComponent(rdbtnInfantil)
							.addGap(70)
							.addComponent(rdbtnAdulto)))
					.addContainerGap())
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(332)
					.addComponent(lblInventario_2_1, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
					.addGap(354))
				.addGroup(gl_inventario.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
					.addGap(16))
		);
		gl_inventario.setVerticalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(26)
					.addComponent(lblInventario_2_1)
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(iSBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_6_1)
						.addComponent(lblNewLabel_5_1_2_1))
					.addGap(14)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_1)
						.addComponent(lblNewLabel_5_1_2_1_1))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1)
					.addGap(11)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1)
						.addComponent(lblNewLabel_5_2_2_1))
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(edicion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_4)
						.addComponent(lblNewLabel_5_1_2_1_1_3))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInfantil)
								.addComponent(rdbtnAdulto))
							.addGap(44))
						.addGroup(gl_inventario.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBaja_2_3_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_3_1)
								.addComponent(btnBaja_2_1_2_1)
								.addComponent(btnBaja_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollPane_1_2_2_1, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addContainerGap())
		);
		inventario.setLayout(gl_inventario);
		GroupLayout groupLayout = new GroupLayout(frmInventario.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(inventario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(inventario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
		);
		frmInventario.getContentPane().setLayout(groupLayout);
	}
}
