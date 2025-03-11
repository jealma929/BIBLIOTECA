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

public class BibliotecaView {
	
	protected JFrame frmBiblioteca; // es un componente de la ventana, define el contenedor de la biblioteca
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JScrollPane scrollPane_1;
	private JTextField textField_20;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTable table_1;
	private JTextField textField_35;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_36;
		
	public BibliotecaView() {		// inicializamos la biblioteca
		initialize ();
	}
	
	private void initialize() {
		
		frmBiblioteca = new JFrame();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmBiblioteca.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel prestamo = new JPanel();
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabbedPane.addTab("            Prestamo               ", null, prestamo, null);
		
		textField = new JTextField();
		textField.setText("< Introduzca el ISBN del libro >");
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("< Introduzca el Numero de socio >");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setDisabledTextColor(Color.BLACK);
		textField_3.setEnabled(false);
		textField_3.setText("< Numero de socio >");
		textField_3.setColumns(10);
		
	
		JRadioButton rdbtnNewRadioButton = new JRadioButton("15 dias");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("30 dias");
		rdbtnNewRadioButton_1.setAlignmentY(Component.TOP_ALIGNMENT);
		
		textField_4 = new JTextField();
		textField_4.setDisabledTextColor(Color.BLACK);
		textField_4.setEnabled(false);
		textField_4.setText("< Fecha inico >");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setDisabledTextColor(Color.BLACK);
		textField_5.setText("< Fecha  devolución >");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setDisabledTextColor(Color.BLACK);
		textField_6.setEnabled(false);
		textField_6.setText("< Fecha Inico >");
		textField_6.setColumns(10);
		
		JButton btnNewButton_4_1 = new JButton("OK");
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setSelectedTextColor(Color.BLACK);
		textField_8.setDisabledTextColor(Color.BLACK);
		textField_8.setText(" < Avisos >");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		
		scrollPane_1 = new JScrollPane();
		
		JLabel lblNewLabel_4 = new JLabel("Prestamos");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("ALTA ");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBaja = new JButton("BAJA");
		btnBaja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel = new JLabel("PRESTAMOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField_20 = new JTextField();
		textField_20.setText("< Fecha  devolución >");
		textField_20.setEnabled(false);
		textField_20.setDisabledTextColor(Color.BLACK);
		textField_20.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("< Introduzca el ISBN del libro >");
		textField_1.setColumns(10);
		
		JButton btnNewButton_4_1_2 = new JButton("OK");
		
		JButton btnNewButton_4_1_3 = new JButton("OK");
		GroupLayout gl_prestamo = new GroupLayout(prestamo);
		gl_prestamo.setHorizontalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_prestamo.createSequentialGroup()
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
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(132))
							.addGroup(gl_prestamo.createSequentialGroup()
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_3)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
					.addGap(223))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(178, Short.MAX_VALUE))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(857, Short.MAX_VALUE))
		);
		gl_prestamo.setVerticalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
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
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1)
						.addComponent(btnNewButton_4_1_2))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_3))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4)
					.addGap(28)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		prestamo.setLayout(gl_prestamo);
		
		JPanel Inventario = new JPanel();
		tabbedPane.addTab("            Inventario             ", null, Inventario, null);
		Inventario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton_2 = new JButton("ALTA ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnBaja_2 = new JButton("BUSCAR");
		btnBaja_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBaja_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_31 = new JTextField();
		textField_31.setText("< Introduzca el ISBN del libro >");
		textField_31.setColumns(10);
		
		JButton btnNewButton_4_1_2_2 = new JButton("OK");
		
		JButton btnNewButton_4_1_5 = new JButton("OK");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Infantil");
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("Adulto");
		rdbtnNewRadioButton_1_4.setAlignmentY(0.0f);
		
		textField_32 = new JTextField();
		textField_32.setText("< Introduzca el Titulo >");
		textField_32.setColumns(10);
		
		JButton btnNewButton_4_1_3_2 = new JButton("OK");
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		
		textField_33 = new JTextField();
		textField_33.setText("< Introduzca el Autor >");
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setText("< Introduzca la Edicion >");
		textField_34.setColumns(10);
		
		JButton btnBaja_2_1 = new JButton("BAJA");
		btnBaja_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_4_1_5_1 = new JButton("OK");
		
		JLabel lblNewLabel_5 = new JLabel("ALTA");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_2 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JLabel lblNewLabel_5_4 = new JLabel("");
		
		JLabel lblNewLabel_5_5 = new JLabel("BAJA");
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField_35 = new JTextField(); // Cuando se pulse baja por primera vez nos preguntara si estamos seguros
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		GroupLayout gl_Inventario = new GroupLayout(Inventario);
		gl_Inventario.setHorizontalGroup(
			gl_Inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Inventario.createSequentialGroup()
					.addGap(330)
					.addComponent(lblInventario)
					.addContainerGap(343, Short.MAX_VALUE))
				.addGroup(gl_Inventario.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_Inventario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Inventario.createSequentialGroup()
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_4_1_5_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Inventario.createSequentialGroup()
							.addGroup(gl_Inventario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Inventario.createSequentialGroup()
									.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_4_1_2_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Inventario.createSequentialGroup()
									.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_4_1_3_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Inventario.createSequentialGroup()
									.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_4_1_5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
							.addGap(78)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_Inventario.createSequentialGroup()
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_5_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Inventario.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_Inventario.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Inventario.createSequentialGroup()
											.addComponent(lblNewLabel_5_5, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNewLabel_5_2, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
										.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_Inventario.createSequentialGroup()
											.addComponent(btnNewButton_2)
											.addGap(26)
											.addComponent(btnBaja_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
											.addComponent(btnBaja_2_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
											.addGap(22)))))))
					.addGap(94))
				.addGroup(gl_Inventario.createSequentialGroup()
					.addGap(83)
					.addComponent(rdbtnNewRadioButton_4)
					.addGap(43)
					.addComponent(rdbtnNewRadioButton_1_4)
					.addContainerGap(585, Short.MAX_VALUE))
				.addGroup(gl_Inventario.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		gl_Inventario.setVerticalGroup(
			gl_Inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Inventario.createSequentialGroup()
					.addGap(44)
					.addComponent(lblInventario)
					.addGap(26)
					.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_2_2)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_5_1))
					.addGroup(gl_Inventario.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_Inventario.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_3_2))
							.addGap(18)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_5))
							.addGap(18)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_5_1))
							.addGap(18)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton_4)
								.addComponent(rdbtnNewRadioButton_1_4))
							.addGap(18))
						.addGroup(gl_Inventario.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_5_4)
							.addGap(11)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5_2)
								.addComponent(lblNewLabel_5_5))
							.addGap(18)
							.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_Inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addGap(41)))
					.addGap(28)
					.addComponent(scrollPane_1_2, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_1 = new JTable();
		scrollPane_1_2.setViewportView(table_1);
		Inventario.setLayout(gl_Inventario);
		
		JPanel socio = new JPanel();
		tabbedPane.addTab("             Socios             ", null, socio, null);
		socio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnBaja_2_2 = new JButton("BUSCAR");
		btnBaja_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblInventario_1 = new JLabel("INVENTARIO");
		lblInventario_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnBaja_2_1_1 = new JButton("BAJA");
		btnBaja_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_19 = new JTextField();
		textField_19.setText("< Introduzca el Numero de socio >");
		textField_19.setColumns(10);
		
		JButton btnNewButton_4_1_2_2_1 = new JButton("OK");
		
		textField_22 = new JTextField();
		textField_22.setText("< Introduzca Nombre completo  >");
		textField_22.setColumns(10);
		
		JButton btnNewButton_4_1_3_2_1 = new JButton("OK");
		
		textField_23 = new JTextField();
		textField_23.setText("< introduzca fecha de nacimiento >");
		textField_23.setColumns(10);
		
		JButton btnNewButton_4_1_5_2 = new JButton("OK");
		
		JLabel lblNewLabel_5_3 = new JLabel("ALTA");
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Rellene todos los campos y pulse ALTA");
		
		JLabel lblNewLabel_5_4_1 = new JLabel("");
		
		JLabel lblNewLabel_5_5_1 = new JLabel("BAJA");
		lblNewLabel_5_5_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Busque, seleccione y pulse BAJA");
		
		JButton btnNewButton_2_1 = new JButton("ALTA ");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		
		JScrollPane scrollPane_1_2_1 = new JScrollPane();
		
		JTextArea textArea = new JTextArea();
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Trabajador");
		GroupLayout gl_socio = new GroupLayout(socio);
		gl_socio.setHorizontalGroup(
			gl_socio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socio.createSequentialGroup()
					.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socio.createSequentialGroup()
							.addGap(330)
							.addComponent(lblInventario_1))
						.addGroup(gl_socio.createSequentialGroup()
							.addGap(47)
							.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socio.createSequentialGroup()
									.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_4_1_2_2_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socio.createSequentialGroup()
									.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_4_1_3_2_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socio.createSequentialGroup()
									.addGroup(gl_socio.createParallelGroup(Alignment.TRAILING)
										.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
										.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox)
										.addComponent(btnNewButton_4_1_5_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))))
							.addGap(55)
							.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socio.createSequentialGroup()
									.addComponent(btnNewButton_2_1)
									.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_socio.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_5_4_1, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_socio.createSequentialGroup()
											.addGap(29)
											.addComponent(btnBaja_2_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
											.addGap(31)
											.addComponent(btnBaja_2_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))))
								.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_socio.createSequentialGroup()
									.addComponent(lblNewLabel_5_3, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_5_1_1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socio.createSequentialGroup()
									.addComponent(lblNewLabel_5_5_1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_5_2_1, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_socio.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane_1_2_1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_socio.setVerticalGroup(
			gl_socio.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socio.createSequentialGroup()
					.addGap(44)
					.addComponent(lblInventario_1)
					.addGap(26)
					.addGroup(gl_socio.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_2_2_1)
						.addComponent(lblNewLabel_5_3)
						.addComponent(lblNewLabel_5_1_1))
					.addGroup(gl_socio.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_socio.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_socio.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_3_2_1))
							.addGap(18)
							.addGroup(gl_socio.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_4_1_5_2))
							.addGap(18)
							.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_socio.createSequentialGroup()
							.addGroup(gl_socio.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socio.createSequentialGroup()
									.addGap(6)
									.addComponent(lblNewLabel_5_4_1))
								.addGroup(gl_socio.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_socio.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_5_5_1)
										.addComponent(lblNewLabel_5_2_1))))
							.addGap(18)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(gl_socio.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_1_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addGap(23)))
					.addGap(39)
					.addComponent(scrollPane_1_2_1, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		socio.setLayout(gl_socio);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, prestamo, textField, textField_2, textField_3, rdbtnNewRadioButton, rdbtnNewRadioButton_1, textField_4, textField_5, textField_6, btnNewButton_4_1, textField_8, scrollPane_1, lblNewLabel_4, btnNewButton, btnBaja, lblNewLabel, textField_20, textField_1, btnNewButton_4_1_2, btnNewButton_4_1_3, table, textField_33, textField_34, btnBaja_2_1, table_1, btnNewButton_4_1_5_1, lblNewLabel_5, lblNewLabel_5_1, lblNewLabel_5_2, lblNewLabel_5_4, lblNewLabel_5_5, textField_35, socio, btnBaja_2_2, lblInventario_1, btnBaja_2_1_1, textField_19, btnNewButton_4_1_2_2_1, textField_22, btnNewButton_4_1_3_2_1, textField_23, btnNewButton_4_1_5_2, lblNewLabel_5_3, lblNewLabel_5_1_1, lblNewLabel_5_4_1, lblNewLabel_5_5_1, lblNewLabel_5_2_1, btnNewButton_2_1, textField_36, scrollPane_1_2_1, textArea, chckbxNewCheckBox}));
		
	}
}
