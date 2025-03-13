package biblioteca.demo.run;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.UIManager;

public class BibliotecaView {
	
	protected JFrame frmBiblioteca; // es un componente de la ventana, define el contenedor de la biblioteca
	private JTextField textField_18;
	private JTextField textField_21;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTable table_2;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_31;
	private JTable table_1;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_32;
	private JTextField textField;
	private JTable table;
		
	public BibliotecaView() {		// inicializamos la biblioteca
		initialize ();
	}
	
	private void initialize() {
		
		frmBiblioteca = new JFrame();
		frmBiblioteca.setResizable(false);
		frmBiblioteca.setBackground(new Color(0, 0, 255));
		frmBiblioteca.setTitle("Gestion de BIBLIOTECA");
		frmBiblioteca.setBounds(0, 0, 800, 600);
		frmBiblioteca.setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel prestamo = new JPanel();
		tabbedPane.addTab("            PRESTAMO         ", null, prestamo, null);
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_19 = new JTextField();
		textField_19.setText("< Introduzca el ISBN del libro >");
		textField_19.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setText("< Introduzca el Numero de socio >");
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setText("< Fecha Alta >");
		textField_23.setColumns(10);
		
		JButton btnBaja_2_1_2_1_1_2 = new JButton("ALTA");
		btnBaja_2_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1_3 = new JButton("BAJA");
		btnBaja_2_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_3 = new JButton("BUSCAR");
		btnBaja_2_3_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_5_2_1_3 = new JLabel("BUSQUEDA");
		lblNewLabel_5_5_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2_2_1_2 = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		
		JLabel lblNewLabel_5_5_2_1_1_2 = new JLabel("BAJA");
		lblNewLabel_5_5_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_2 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JLabel lblNewLabel_5_6_1_2 = new JLabel("ALTA");
		lblNewLabel_5_6_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_3 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_2_1_2 = new JLabel("");
		
		textField_32 = new JTextField();
		textField_32.setForeground(Color.RED);
		textField_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_32.setEditable(false);
		textField_32.setDisabledTextColor(Color.RED);
		textField_32.setColumns(10);
		textField_32.setCaretColor(Color.RED);
		
		JRadioButton rdbtnNewRadioButton_4_1_1_1 = new JRadioButton("15 Dias");
		
		JRadioButton rdbtnNewRadioButton_1_4_1_1_1 = new JRadioButton("30 Dias");
		rdbtnNewRadioButton_1_4_1_1_1.setAlignmentY(0.0f);
		
		JLabel lblInventario_2_1_2 = new JLabel("PRESTAMO");
		lblInventario_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollPane_1_2_2_1_2 = new JScrollPane();
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("< Fecha Devolucion >");
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Duración del Prestamo");
		GroupLayout gl_prestamo = new GroupLayout(prestamo);
		gl_prestamo.setHorizontalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1_2, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(332)
					.addComponent(lblInventario_2_1_2)
					.addContainerGap(367, Short.MAX_VALUE))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
							.addComponent(textField_22))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGap(40)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnNewRadioButton_1_4_1_1_1)
										.addComponent(rdbtnNewRadioButton_4_1_1_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addGap(94)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblNewLabel_5_5_2_1_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5_2_2_1_2, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblNewLabel_5_5_2_1_1_2)
							.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblNewLabel_5_6_1_2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
							.addComponent(lblNewLabel_5_1_2_1_3, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5_4_2_1_2, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_32, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(btnBaja_2_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBaja_2_1_2_1_3, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnBaja_2_3_1_3)
									.addGap(109)))))
					.addGap(25))
		);
		gl_prestamo.setVerticalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(26)
							.addComponent(lblInventario_2_1_2)
							.addGap(18)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_6_1_2)
								.addComponent(lblNewLabel_5_1_2_1_3))
							.addGap(14)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_5_5_2_1_1_2)
								.addComponent(lblNewLabel_5_1_2_1_1_2))
							.addGap(6)
							.addComponent(lblNewLabel_5_4_2_1_2)
							.addGap(11)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_5_2_1_3)
								.addComponent(lblNewLabel_5_2_2_1_2))
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGap(57)
									.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnBaja_2_3_1_3)
										.addComponent(btnBaja_2_1_2_1_3)
										.addComponent(btnBaja_2_1_2_1_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(17)
											.addComponent(rdbtnNewRadioButton_1_4_1_1_1))
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(5)
											.addComponent(lblNewLabel)))
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addComponent(scrollPane_1_2_2_1_2, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(136)
							.addComponent(rdbtnNewRadioButton_4_1_1_1)))
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane_1_2_2_1_2.setViewportView(table);
		prestamo.setLayout(gl_prestamo);
		
		JPanel socios = new JPanel();
		tabbedPane.addTab("            SOCIOS            ", null, socios, null);
		socios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		textField_27 = new JTextField();
		textField_27.setText("< Introduzca el Numero de socio  >");
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setText("< Introduzca el Nombre completo >");
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setText("< Fecha de nacimiento >");
		textField_29.setColumns(10);
		
		JButton btnBaja_2_1_2_1_1_1 = new JButton("ALTA");
		btnBaja_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1_2 = new JButton("BAJA");
		btnBaja_2_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_2 = new JButton("BUSCAR");
		btnBaja_2_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_3_1_1_1 = new JButton("MODIFICAR");
		btnBaja_2_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_5_2_1_2 = new JLabel("BUSQUEDA");
		lblNewLabel_5_5_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2_2_1_1 = new JLabel("Rellene cualqueir campo y pulse BUSCAR");
		
		JLabel lblNewLabel_5_5_2_1_1_1 = new JLabel("BAJA");
		lblNewLabel_5_5_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_1 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JLabel lblNewLabel_5_6_1_1 = new JLabel("ALTA");
		lblNewLabel_5_6_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_2 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_2_1_1 = new JLabel("");
		
		textField_31 = new JTextField();
		textField_31.setForeground(Color.RED);
		textField_31.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_31.setEditable(false);
		textField_31.setDisabledTextColor(Color.RED);
		textField_31.setColumns(10);
		textField_31.setCaretColor(Color.RED);
		
		JLabel lblInventario_2_1_1 = new JLabel("SOCIOS");
		lblInventario_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollPane_1_2_2_1_1 = new JScrollPane();
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Trabajador");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setPreferredSize(new Dimension(288, 100));
		textArea_1.setMaximumSize(new Dimension(288, 100));
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textArea_1.setText("< Mas informacion >");
		
		JLabel lblNewLabel_5_5_2_1_2_1 = new JLabel("MODIFICAR");
		lblNewLabel_5_5_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_3_1 = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		GroupLayout gl_socios = new GroupLayout(socios);
		gl_socios.setHorizontalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(348)
					.addComponent(lblInventario_2_1_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(367, Short.MAX_VALUE))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
						.addComponent(textField_27, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
						.addComponent(textField_28, 288, 288, Short.MAX_VALUE)
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
					.addGap(94)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_1_1)
									.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_6_1_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_2, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1_1, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
								.addGroup(gl_socios.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_socios.createSequentialGroup()
											.addComponent(btnBaja_2_1_2_1_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_1_2_1_2, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_1_1))
										.addComponent(textField_31, Alignment.LEADING, 330, 330, 330)))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
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
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_6_1_1)
						.addComponent(lblNewLabel_5_1_2_1_2))
					.addGap(14)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_1_1)
						.addComponent(lblNewLabel_5_1_2_1_1_1))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1_1)
					.addGap(11)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_2)
						.addComponent(lblNewLabel_5_2_2_1_1))
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(57)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
								.addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
							.addGap(2)))
					.addGap(18)
					.addComponent(scrollPane_1_2_2_1_1, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(136)
					.addComponent(chckbxNewCheckBox_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(374))
		);
		
		table_1 = new JTable();
		scrollPane_1_2_2_1_1.setViewportView(table_1);
		socios.setLayout(gl_socios);
		GroupLayout groupLayout = new GroupLayout(frmBiblioteca.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(3)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 777, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
		);
		
		JPanel inventario = new JPanel();
		tabbedPane.addTab("           INVENTARIO          ", null, inventario, null);
		inventario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInventario_2_1 = new JLabel("INVENTARIO");
		lblInventario_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_18 = new JTextField();
		textField_18.setText("< Introduzca la Edicion >");
		textField_18.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setText("< Introduzca el ISBN del libro >");
		textField_21.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setText("< Introduzca el Titulo >");
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setText("< Introduzca el Autor >");
		textField_25.setColumns(10);
		
		JLabel lblNewLabel_5_6_1 = new JLabel("ALTA");
		lblNewLabel_5_6_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_2_1 = new JLabel("");
		
		JLabel lblNewLabel_5_5_2_1 = new JLabel("BUSQUEDA");
		lblNewLabel_5_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2_2_1 = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		
		textField_26 = new JTextField();
		textField_26.setForeground(Color.RED);
		textField_26.setCaretColor(Color.RED);
		textField_26.setDisabledTextColor(Color.RED);
		textField_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField_26.setEditable(false);
		textField_26.setColumns(10);
		
		JButton btnBaja_2_3_1 = new JButton("BUSCAR");
		btnBaja_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1 = new JButton("BAJA");
		btnBaja_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JRadioButton rdbtnNewRadioButton_4_1_1 = new JRadioButton("Infantil");
		
		JRadioButton rdbtnNewRadioButton_1_4_1_1 = new JRadioButton("Adulto");
		rdbtnNewRadioButton_1_4_1_1.setAlignmentY(0.0f);
		
		JScrollPane scrollPane_1_2_2_1 = new JScrollPane();
		
		JLabel lblNewLabel_5_5_2_1_1 = new JLabel("BAJA");
		lblNewLabel_5_5_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JButton btnBaja_2_3_1_1 = new JButton("MODIFICAR");
		btnBaja_2_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja_2_1_2_1_1 = new JButton("ALTA");
		btnBaja_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5_5_2_1_4 = new JLabel("MODIFICAR");
		lblNewLabel_5_5_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_2_1_1_3 = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		GroupLayout gl_inventario = new GroupLayout(inventario);
		gl_inventario.setHorizontalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_21, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(textField_24)
								.addComponent(textField_25)
								.addComponent(textField_18))
							.addGap(94)
							.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_2_2_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_2_1_1)
									.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5_6_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5_1_2_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
								.addGroup(gl_inventario.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(btnBaja_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_1_2_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnBaja_2_3_1_1))
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(lblNewLabel_5_5_2_1_4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
											.addComponent(lblNewLabel_5_1_2_1_1_3, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_26, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))))
							.addGap(26))
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(63)
							.addComponent(rdbtnNewRadioButton_4_1_1)
							.addGap(70)
							.addComponent(rdbtnNewRadioButton_1_4_1_1)))
					.addContainerGap())
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(332)
					.addComponent(lblInventario_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(354))
				.addGroup(gl_inventario.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2_2_1, GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
					.addGap(16))
		);
		gl_inventario.setVerticalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(26)
					.addComponent(lblInventario_2_1)
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_6_1)
						.addComponent(lblNewLabel_5_1_2_1))
					.addGap(14)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_1)
						.addComponent(lblNewLabel_5_1_2_1_1))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1)
					.addGap(11)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1)
						.addComponent(lblNewLabel_5_2_2_1))
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5_5_2_1_4)
						.addComponent(lblNewLabel_5_1_2_1_1_3))
					.addPreferredGap(ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
					.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton_4_1_1)
								.addComponent(rdbtnNewRadioButton_1_4_1_1))
							.addGap(44))
						.addGroup(gl_inventario.createSequentialGroup()
							.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBaja_2_3_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_3_1)
								.addComponent(btnBaja_2_1_2_1)
								.addComponent(btnBaja_2_1_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollPane_1_2_2_1, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table_2 = new JTable();
		scrollPane_1_2_2_1.setViewportView(table_2);
		inventario.setLayout(gl_inventario);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, inventario, lblInventario_2_1, textField_18, textField_21, textField_24, textField_25, lblNewLabel_5_6_1, lblNewLabel_5_1_2_1, lblNewLabel_5_4_2_1, lblNewLabel_5_5_2_1, lblNewLabel_5_2_2_1, textField_26, btnBaja_2_3_1, btnBaja_2_1_2_1, rdbtnNewRadioButton_4_1_1, rdbtnNewRadioButton_1_4_1_1, scrollPane_1_2_2_1, lblNewLabel_5_5_2_1_1, lblNewLabel_5_1_2_1_1, btnBaja_2_3_1_1, btnBaja_2_1_2_1_1, table_2, prestamo, textField_19, textField_22, textField_23, btnBaja_2_1_2_1_1_2, btnBaja_2_1_2_1_3, btnBaja_2_3_1_3, lblNewLabel_5_5_2_1_3, lblNewLabel_5_2_2_1_2, lblNewLabel_5_5_2_1_1_2, lblNewLabel_5_1_2_1_1_2, lblNewLabel_5_6_1_2, lblNewLabel_5_1_2_1_3, lblNewLabel_5_4_2_1_2, textField_32, rdbtnNewRadioButton_4_1_1_1, rdbtnNewRadioButton_1_4_1_1_1, lblInventario_2_1_2, scrollPane_1_2_2_1_2, lblNewLabel_5_5_2_1_4, lblNewLabel_5_1_2_1_1_3, textField, lblNewLabel, table}));
		frmBiblioteca.getContentPane().setLayout(groupLayout);
	}
}
