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
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;
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
		
		textField_1 = new JTextField();
		textField_1.setText("< Introduzca el ISBN del libro >");
		textField_1.setColumns(10);
		
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
		
		textField_7 = new JTextField();
		textField_7.setDisabledTextColor(Color.BLACK);
		textField_7.setEnabled(false);
		textField_7.setText("< Fecha devolución >");
		textField_7.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Prestamo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("Devolución");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton_3 = new JButton("OK");
		
		JButton btnNewButton_4 = new JButton("OK");
		
		JButton btnNewButton_4_1 = new JButton("OK");
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setSelectedTextColor(Color.BLACK);
		textField_8.setDisabledTextColor(Color.BLACK);
		textField_8.setText(" < Avisos >");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_8.setColumns(10);
		
		table = new JTable();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(134)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(218))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(47)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(rdbtnNewRadioButton_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
					.addGap(60)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_8)
						.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addGap(54))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(120)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(567, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1))
					.addGap(46)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_4_1))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_4))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_1)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(94)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(186, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("           Socios           ", null, panel_1, null);
		
		JPanel panel_2_1 = new JPanel();
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
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 769, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 533, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(gl_panel_1);
		
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
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(gl_panel.createSequentialGroup()
										.addComponent(rdbtnInfantil, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(rdbtnNewRadioButton_1_2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_23, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(91)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(62)
							.addComponent(btnNewButton_4_3, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnInfantil)
						.addComponent(rdbtnNewRadioButton_1_2))
					.addGap(28)
					.addComponent(btnNewButton_4_3)
					.addContainerGap(45, Short.MAX_VALUE))
		);
		
		table_2 = new JTable();
		scrollPane.setViewportView(table_2);
		panel.setLayout(gl_panel);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, panel_2, textField, textField_1, textField_2, textField_3, rdbtnNewRadioButton, rdbtnNewRadioButton_1, textField_4, textField_5, textField_6, textField_7, lblNewLabel, lblNewLabel_1, btnNewButton_3, btnNewButton_4, btnNewButton_4_1, textField_8, table, panel_2_1, lblNewLabel_2, lblNewLabel_1_1, textField_9, textField_10, rdbtnNewRadioButton_2, rdbtnNewRadioButton_1_1, textField_11, textField_12, btnNewButton_4_2, btnNewButton_3_1, textField_13, textField_14, textField_15, textField_16, textField_17, btnNewButton_4_1_1, scrollPane, table_2, lblNewLabel_3, textField_18, btnNewButton_4_3, textField_19, rdbtnInfantil, rdbtnNewRadioButton_1_2, textField_22, textField_23}));
		
	}
}
