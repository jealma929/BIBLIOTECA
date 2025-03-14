package biblioteca.demo.run;

import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
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
import javax.swing.JTable;
import javax.swing.JFormattedTextField;


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
	private JTextField txtAviso;
	private ButtonGroup bG_1;
	private JTable tablaInventario;

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
		inventario.setVisible(false);
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
		
		JLabel lblBuscar = new JLabel("BUSQUEDA");
		lblBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoBuscar = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		lblInfoBuscar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		
		JLabel lblBaja = new JLabel("BAJA");
		lblBaja.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoBaja = new JLabel("Busque, seleccione y pulse BAJA");
		lblInfoBaja.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblAlta = new JLabel("ALTA");
		lblAlta.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoAlta = new JLabel("Rellene todos los campos y pulse ALTA");
		lblInfoAlta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_5_4_2_1 = new JLabel("");
		
		JButton btnAlta = new JButton("ALTA");
		btnAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja = new JButton("BAJA");
		btnBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblModificar = new JLabel("MODIFICAR");
		lblModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblInfoModificar = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		lblInfoModificar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtAviso = new JTextField();
		txtAviso.setForeground(Color.RED);
		txtAviso.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtAviso.setEditable(false);
		txtAviso.setDisabledTextColor(Color.RED);
		txtAviso.setColumns(10);
		txtAviso.setCaretColor(Color.RED);
		
		bG_1 = new ButtonGroup();
		
		JRadioButton rdbtnInfantil = new JRadioButton("Infantil");
		bG_1.add(rdbtnInfantil);
		
		JRadioButton rdbtnAdulto = new JRadioButton("Adulto");
		rdbtnAdulto.setSelected(true);
		rdbtnAdulto.setAlignmentY(0.0f);
		bG_1.add(rdbtnAdulto);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollInventario = new JScrollPane();
		
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
									.addComponent(lblBuscar, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
									.addComponent(lblInfoBuscar, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblBaja)
									.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
									.addComponent(lblInfoBaja, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblAlta, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
									.addComponent(lblInfoAlta, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
								.addGroup(gl_inventario.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(btnAlta, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBuscar)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnModificar))
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(lblModificar, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
											.addComponent(lblInfoModificar, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
										.addComponent(txtAviso, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))))
							.addGap(26))
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(63)
							.addComponent(rdbtnInfantil)
							.addGap(70)
							.addComponent(rdbtnAdulto)))
					.addContainerGap())
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(332)
					.addComponent(lblInventario, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
					.addGap(354))
				.addGroup(gl_inventario.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollInventario, GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
					.addGap(16))
		);
		gl_inventario.setVerticalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(26)
					.addComponent(lblInventario)
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(iSBN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAlta)
						.addComponent(lblInfoAlta))
					.addGap(14)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(titulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBaja)
						.addComponent(lblInfoBaja))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1)
					.addGap(11)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBuscar)
						.addComponent(lblInfoBuscar))
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(edicion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModificar)
						.addComponent(lblInfoModificar))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInfantil)
								.addComponent(rdbtnAdulto))
							.addGap(44))
						.addGroup(gl_inventario.createSequentialGroup()
							.addComponent(txtAviso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnModificar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscar)
								.addComponent(btnBaja)
								.addComponent(btnAlta, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollInventario, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tablaInventario = new JTable();
		scrollInventario.setViewportView(tablaInventario);
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
