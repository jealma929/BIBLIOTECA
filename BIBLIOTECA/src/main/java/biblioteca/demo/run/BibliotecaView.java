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

public class BibliotecaView {
	
	protected JFrame frmBiblioteca; // es un componente de la ventana, define el contenedor de la biblioteca
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table_2;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_22;
	private JTextField textField_23;
	private JScrollPane scrollPane_1;
	private JTextField textField_20;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_7;
	private JTextField textField_21;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_35;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTable table_1;
		
	public BibliotecaView() {		// inicializamos la biblioteca
		initialize ();
	}
	
	private void initialize() {
		
		frmBiblioteca = new JFrame();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmBiblioteca.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabbedPane.addTab("          Prestamo               ", null, panel_2, null);
		
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
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addGap(119)
					.addComponent(btnNewButton)
					.addGap(142)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
					.addComponent(btnBaja)
					.addGap(318))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_4_1_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(6))
						.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_2.createSequentialGroup()
										.addGap(30)
										.addComponent(rdbtnNewRadioButton)
										.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
										.addComponent(rdbtnNewRadioButton_1)
										.addGap(61))
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(132))
							.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_3)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
					.addGap(223))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(178, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(857, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel))
						.addComponent(btnBaja, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1)
						.addComponent(btnNewButton_4_1_2))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_3))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
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
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("         Inventario        ", null, panel, null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_3 = new JLabel("Prestamo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_18 = new JTextField();
		textField_18.setText("< Introduzca el ISBN del Libro >");
		textField_18.setColumns(10);
		
		JButton btnNewButton_4_3 = new JButton("OK");
		
		textField_19 = new JTextField();
		textField_19.setText("< Introduzca el Titulo del Libro >");
		textField_19.setColumns(10);
		
		JRadioButton rdbtnInfantil = new JRadioButton("Infantil");
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Adulto");
		
		textField_22 = new JTextField();
		textField_22.setText("< Introduzca el Autor del Libro >");
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("< Introduzca la fecha de Edicion del Libro >");
		textField_23.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(102)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(53)
							.addComponent(rdbtnInfantil, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(rdbtnNewRadioButton_1_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(105)
							.addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(22)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(40)
									.addComponent(rdbtnNewRadioButton_1_2)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnInfantil)
									.addGap(13)))
							.addGap(13)
							.addComponent(btnNewButton_4_3)
							.addGap(51))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(92)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(183)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("           Socios           ", null, panel_1, null);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 779, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 544, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JPanel panel_2_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2_1, null);
		panel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Prestamo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1_1 = new JLabel("Devolución");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_9 = new JTextField();
		textField_9.setText("< Fecha inico >");
		textField_9.setEnabled(false);
		textField_9.setDisabledTextColor(Color.BLACK);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setText("< Fecha  devolución >");
		textField_10.setEnabled(false);
		textField_10.setDisabledTextColor(Color.BLACK);
		textField_10.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("15 dias");
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("30 dias");
		
		textField_11 = new JTextField();
		textField_11.setText("< Introduzca el ISBN del libro >");
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setText("< Introduzca el Numero de socio >");
		textField_12.setColumns(10);
		
		JButton btnNewButton_4_2 = new JButton("OK");
		
		JButton btnNewButton_3_1 = new JButton("OK");
		
		textField_13 = new JTextField();
		textField_13.setText(" < Avisos >");
		textField_13.setSelectedTextColor(Color.BLACK);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_13.setEditable(false);
		textField_13.setDisabledTextColor(Color.BLACK);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("< Numero de socio >");
		textField_14.setEnabled(false);
		textField_14.setDisabledTextColor(Color.BLACK);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setText("< Introduzca el ISBN del libro >");
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setText("< Fecha Inico >");
		textField_16.setEnabled(false);
		textField_16.setDisabledTextColor(Color.BLACK);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setText("< Fecha devolución >");
		textField_17.setEnabled(false);
		textField_17.setDisabledTextColor(Color.BLACK);
		textField_17.setColumns(10);
		
		JButton btnNewButton_4_1_1 = new JButton("OK");
		GroupLayout gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 769, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(134)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1_1)
					.addGap(218))
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton_2)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(rdbtnNewRadioButton_1_1))
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_4_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_3_1, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
					.addGap(60)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_13)
						.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4_1_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1_1))
					.addGap(46)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3_1)
						.addComponent(btnNewButton_4_1_1))
					.addGap(18)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_2))
					.addGap(18)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_2)
						.addComponent(rdbtnNewRadioButton_1_1)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(280, Short.MAX_VALUE))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2_2, null);
		panel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton_1 = new JButton("ALTA ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("PRESTAMOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnBaja_1 = new JButton("BAJA");
		btnBaja_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_7 = new JTextField();
		textField_7.setText("< Introduzca el ISBN del libro >");
		textField_7.setColumns(10);
		
		JButton btnNewButton_4_1_2_1 = new JButton("OK");
		
		JButton btnNewButton_4_1_4 = new JButton("OK");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("15 dias");
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("30 dias");
		rdbtnNewRadioButton_1_3.setAlignmentY(0.0f);
		
		textField_21 = new JTextField();
		textField_21.setText("< Introduzca el Numero de socio >");
		textField_21.setColumns(10);
		
		JButton btnNewButton_4_1_3_1 = new JButton("OK");
		
		textField_24 = new JTextField();
		textField_24.setText("< Fecha inico >");
		textField_24.setEnabled(false);
		textField_24.setDisabledTextColor(Color.BLACK);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setText("< Fecha  devolución >");
		textField_25.setEnabled(false);
		textField_25.setDisabledTextColor(Color.BLACK);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setText("< Introduzca el ISBN del libro >");
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setText("< Numero de socio >");
		textField_27.setEnabled(false);
		textField_27.setDisabledTextColor(Color.BLACK);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setText(" < Avisos >");
		textField_28.setSelectedTextColor(Color.BLACK);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_28.setEditable(false);
		textField_28.setDisabledTextColor(Color.BLACK);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setText("< Fecha Inico >");
		textField_29.setEnabled(false);
		textField_29.setDisabledTextColor(Color.BLACK);
		textField_29.setColumns(10);
		
		textField_30 = new JTextField();
		textField_30.setText("< Fecha  devolución >");
		textField_30.setEnabled(false);
		textField_30.setDisabledTextColor(Color.BLACK);
		textField_30.setColumns(10);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		
		JLabel lblNewLabel_4_1 = new JLabel("Prestamos");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 769, Short.MAX_VALUE)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(119)
					.addComponent(btnNewButton_1)
					.addGap(142)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
					.addComponent(btnBaja_1)
					.addGap(318))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_4_1_2_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(70)
							.addComponent(btnNewButton_4_1_4, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
							.addGap(6))
						.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2_2.createSequentialGroup()
								.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel_2_2.createSequentialGroup()
										.addGap(30)
										.addComponent(rdbtnNewRadioButton_3)
										.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
										.addComponent(rdbtnNewRadioButton_1_3)
										.addGap(61))
									.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_3_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(132))
							.addGroup(gl_panel_2_2.createSequentialGroup()
								.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_26, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_27)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2_2.createSequentialGroup()
									.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))))
					.addGap(223))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(189, Short.MAX_VALUE))
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(868, Short.MAX_VALUE))
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 533, Short.MAX_VALUE)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_1))
						.addComponent(btnBaja_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_4)
						.addComponent(btnNewButton_4_1_2_1))
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_3_1))
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton_1_3)
						.addComponent(rdbtnNewRadioButton_3)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4_1)
					.addGap(28)
					.addComponent(scrollPane_1_1, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2_2.setLayout(gl_panel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2_3, null);
		panel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnNewButton_2 = new JButton("ALTA ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnBaja_2 = new JButton("BUSCAR");
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
		
		textField_35 = new JTextField();
		textField_35.setText("< Introduzca el ISBN del libro >");
		textField_35.setColumns(10);
		
		JScrollPane scrollPane_1_2 = new JScrollPane();
		
		textField_33 = new JTextField();
		textField_33.setText("< Introduzca el Autor >");
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setText("< Introduzca la Edicion >");
		textField_34.setColumns(10);
		
		JButton btnBaja_2_1 = new JButton("BAJA");
		btnBaja_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_panel_2_3 = new GroupLayout(panel_2_3);
		gl_panel_2_3.setHorizontalGroup(
			gl_panel_2_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addGap(122)
					.addComponent(btnNewButton_2)
					.addGap(141)
					.addComponent(lblInventario)
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(btnBaja_2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_3.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel_2_3.createSequentialGroup()
								.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_2_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
								.addGap(70)
								.addComponent(btnNewButton_4_1_5, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_2_3.createSequentialGroup()
								.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_4_1_3_2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_3.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_35, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
							.addGap(32))
						.addGroup(gl_panel_2_3.createSequentialGroup()
							.addGap(95)
							.addComponent(btnBaja_2_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addGap(83)
					.addComponent(rdbtnNewRadioButton_4)
					.addGap(43)
					.addComponent(rdbtnNewRadioButton_1_4)
					.addContainerGap(527, Short.MAX_VALUE))
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_1_2, GroupLayout.PREFERRED_SIZE, 749, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2_3.setVerticalGroup(
			gl_panel_2_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_3.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblInventario)
						.addComponent(btnBaja_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_5)
						.addComponent(btnNewButton_4_1_2_2)
						.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4_1_3_2))
					.addGap(18)
					.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_2_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_3.createSequentialGroup()
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_2_3.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton_4)
								.addComponent(rdbtnNewRadioButton_1_4)))
						.addComponent(btnBaja_2_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(scrollPane_1_2, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_1 = new JTable();
		scrollPane_1_2.setViewportView(table_1);
		panel_2_3.setLayout(gl_panel_2_3);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, panel_2, textField, textField_2, textField_3, rdbtnNewRadioButton, rdbtnNewRadioButton_1, textField_4, textField_5, textField_6, btnNewButton_4_1, textField_8, scrollPane_1, lblNewLabel_4, btnNewButton, btnBaja, lblNewLabel, textField_20, textField_1, btnNewButton_4_1_2, btnNewButton_4_1_3, table, textField_33, textField_34, btnBaja_2_1, table_1}));
		
	}
}
