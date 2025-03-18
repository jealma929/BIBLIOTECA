package biblioteca.demo.run;

import java.time.*;
import java.time.format.*;
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
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

public class BibliotecaView {
	
	protected JFrame frmBiblioteca; // es un componente de la ventana, define el contenedor de la biblioteca
	private JTextField tfEdicion;
	private JTextField tFIsbn;
	private JTextField tFTitulo;
	private JTextField tFAutor;
	private JTextField tFAvisosI;
	private JTable tablaInventario;
	private JTextField tFNumS;
	private JTextField tFNombreS;
	private JTextField tFFechaNacimiento;
	private JTextField tfAvisosS;
	private JTable tablaSocios;
	private JTextField tFIsbnP;
	private JTextField tFNumSP;
	private JTextField tFFechaAlta;
	private JTextField tFAvisosP;
	private JTextField tFFechaDevolucion;
	private JTable tablaPrestamo;
	
	private ButtonGroup grupoBoton_1;
	private ButtonGroup grupoBoton_2;
	
	//*********** Devuelve la fecha con incremento
	public static String asignaFecha (int i) {
		LocalDate lD = LocalDate.now();
		lD = lD.plusDays (i);
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = lD.format(dTF);
		return fecha;
	}
	
	//*********** 

	
	
	
		
	public BibliotecaView() {		// inicializamos la biblioteca
		initialize ();
	}
	
	private void initialize() {
		
		frmBiblioteca = new JFrame();
		frmBiblioteca.setResizable(false);
		frmBiblioteca.setBackground(new Color(0, 0, 255));
		frmBiblioteca.setTitle("Gestion de BIBLIOTECA");
		frmBiblioteca.setBounds(0, 0, 815, 600);
		frmBiblioteca.setVisible(true);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		// PRESTAMO comienza esta pestaña
		
		JPanel prestamo = new JPanel();
		tabbedPane.addTab("            PRESTAMO         ", null, prestamo, null);
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tFIsbnP = new JTextField();
		tFIsbnP.setText("< Introduzca el ISBN del libro >");
		tFIsbnP.setColumns(10);
		
		tFNumSP = new JTextField();
		tFNumSP.setText("< Introduzca el Numero de socio >");
		tFNumSP.setColumns(10);
		
		tFFechaAlta = new JTextField();
		tFFechaAlta.setFont(new Font("Tahoma", Font.BOLD, 11));
		tFFechaAlta.setText(asignaFecha (0));
		tFFechaAlta.setEditable(false);
		tFFechaAlta.setColumns(10);
		
		JButton btnAltaP = new JButton("ALTA");
		btnAltaP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBajaP = new JButton("BAJA");
		btnBajaP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscarP = new JButton("BUSCAR");
		btnBuscarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblBuscarP = new JLabel("BUSQUEDA");
		lblBuscarP.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBuscarP = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		lblComBuscarP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblBajaP = new JLabel("BAJA");
		lblBajaP.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBajaP = new JLabel("Busque, seleccione y pulse BAJA");
		lblComBajaP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblAltaP = new JLabel("ALTA");
		lblAltaP.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComAltaP = new JLabel("Rellene todos los campos y pulse ALTA");
		lblComAltaP.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tFAvisosP = new JTextField();
		tFAvisosP.setForeground(Color.RED);
		tFAvisosP.setFont(new Font("Tahoma", Font.BOLD, 14));
		tFAvisosP.setEditable(false);
		tFAvisosP.setDisabledTextColor(Color.RED);
		tFAvisosP.setColumns(10);
		tFAvisosP.setCaretColor(Color.RED);
		
		grupoBoton_1 = new ButtonGroup();
		
		JRadioButton rdbtn15 = new JRadioButton("15 Dias");
		rdbtn15.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		rdbtn15.setSelected(true);
		grupoBoton_1.add(rdbtn15);
		
		JRadioButton rdbtn30 = new JRadioButton("30 Dias");
		rdbtn30.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			}
		});
		rdbtn30.setAlignmentY(0.0f);
		grupoBoton_1.add(rdbtn30);
		
		int duracion = 15;
		
		JLabel lblPrestamo = new JLabel("PRESTAMO");
		lblPrestamo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollPrestamo = new JScrollPane();
		
		tFFechaDevolucion = new JTextField();
		tFFechaDevolucion.setFont(new Font("Tahoma", Font.BOLD, 11));
		tFFechaDevolucion.setText(asignaFecha (duracion));
		tFFechaDevolucion.setEditable(false);
		tFFechaDevolucion.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duración del Prestamo");
		
		JLabel lblFechaAlta = new JLabel("Fecha de Alta");
		
		JLabel lblFechaDevolucion = new JLabel("Fecha de Devolución");
		GroupLayout gl_prestamo = new GroupLayout(prestamo);
		gl_prestamo.setHorizontalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPrestamo, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(330)
					.addComponent(lblPrestamo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(381))
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING, false)
									.addComponent(tFIsbnP, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
									.addComponent(tFNumSP))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addComponent(tFFechaAlta, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDuracion))
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(40)
											.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtn30)
												.addComponent(rdbtn15, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(18)
											.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
												.addComponent(lblFechaDevolucion, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
												.addComponent(tFFechaDevolucion, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))))))
							.addGap(65))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblFechaAlta, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblBuscarP, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
							.addComponent(lblComBuscarP, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblBajaP)
							.addPreferredGap(ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
							.addComponent(lblComBajaP, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addComponent(lblAltaP, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
							.addComponent(lblComAltaP, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.TRAILING)
								.addComponent(tFAvisosP, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addComponent(btnAltaP, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(btnBajaP, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(btnBuscarP, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)))))
					.addGap(25))
		);
		gl_prestamo.setVerticalGroup(
			gl_prestamo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_prestamo.createSequentialGroup()
					.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(26)
							.addComponent(lblPrestamo)
							.addGap(18)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(tFIsbnP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAltaP)
								.addComponent(lblComAltaP))
							.addGap(14)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(tFNumSP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBajaP)
								.addComponent(lblComBajaP))
							.addGap(17)
							.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBuscarP)
								.addComponent(lblComBuscarP))
							.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGap(57)
									.addComponent(tFAvisosP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAltaP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnBuscarP)
										.addComponent(btnBajaP)))
								.addGroup(gl_prestamo.createSequentialGroup()
									.addGroup(gl_prestamo.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(17)
											.addComponent(rdbtn30))
										.addGroup(gl_prestamo.createSequentialGroup()
											.addGap(5)
											.addComponent(lblDuracion)))
									.addGap(18)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(tFFechaAlta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(tFFechaDevolucion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_prestamo.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFechaAlta)
										.addComponent(lblFechaDevolucion))))
							.addGap(18)
							.addComponent(scrollPrestamo, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(136)
							.addComponent(rdbtn15)))
					.addContainerGap())
		);
		
		tablaPrestamo = new JTable();
		tablaPrestamo.setCellSelectionEnabled(true);
		tablaPrestamo.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN Libro", "Numero de Socio", "Fecha de Prestamo", "Fecha de Devoluci\u00F3n"
			}
		));
		tablaPrestamo.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaPrestamo.getColumnModel().getColumn(2).setPreferredWidth(102);
		tablaPrestamo.getColumnModel().getColumn(3).setPreferredWidth(115);
		scrollPrestamo.setViewportView(tablaPrestamo);
		prestamo.setLayout(gl_prestamo);
		
		// SOCIOS comienza el panel de socios
		
		JPanel socios = new JPanel();
		tabbedPane.addTab("            SOCIOS            ", null, socios, null);
		socios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tFNumS = new JTextField();
		tFNumS.setText("< Introduzca el Numero de socio  >");
		tFNumS.setColumns(10);
		
		tFNombreS = new JTextField();
		tFNombreS.setText("< Introduzca el Nombre completo >");
		tFNombreS.setColumns(10);
		
		tFFechaNacimiento = new JTextField();
		tFFechaNacimiento.setText("< Fecha de nacimiento >");
		tFFechaNacimiento.setColumns(10);
		
		JButton btnAltaS = new JButton("ALTA");
		btnAltaS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAltaS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBajaS = new JButton("BAJA");
		btnBajaS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscarS = new JButton("BUSCAR");
		btnBuscarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuscarS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnModS = new JButton("MODIFICAR");
		btnModS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblBuscarS = new JLabel("BUSQUEDA");
		lblBuscarS.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBuscarS = new JLabel("Rellene cualqueir campo y pulse BUSCAR");
		lblComBuscarS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblBajaS = new JLabel("BAJA");
		lblBajaS.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBajaS = new JLabel("Busque, seleccione y pulse BAJA");
		lblComBajaS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblAltaS = new JLabel("ALTA");
		lblAltaS.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComAltaS = new JLabel("Rellene todos los campos y pulse ALTA");
		lblComAltaS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tfAvisosS = new JTextField();
		tfAvisosS.setForeground(Color.RED);
		tfAvisosS.setFont(new Font("Tahoma", Font.BOLD, 14));
		tfAvisosS.setEditable(false);
		tfAvisosS.setDisabledTextColor(Color.RED);
		tfAvisosS.setColumns(10);
		tfAvisosS.setCaretColor(Color.RED);
		
		JLabel lblSocios = new JLabel("SOCIOS");
		lblSocios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollSocios = new JScrollPane();
		
		JCheckBox cBoxTrabajador = new JCheckBox("Trabajador");
		
		JTextArea tAMAS = new JTextArea();
		tAMAS.setLineWrap(true);
		tAMAS.setPreferredSize(new Dimension(288, 100));
		tAMAS.setMaximumSize(new Dimension(288, 100));
		tAMAS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tAMAS.setText("< Mas informacion >");
		
		JLabel lblModS = new JLabel("MODIFICAR");
		lblModS.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComModS = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		lblComModS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		GroupLayout gl_socios = new GroupLayout(socios);
		gl_socios.setHorizontalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollSocios, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(338)
					.addComponent(lblSocios, GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
					.addGap(389))
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addComponent(tAMAS, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(tFNumS, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(tFNombreS, 288, 289, Short.MAX_VALUE)
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(tFFechaNacimiento, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(57)
							.addComponent(cBoxTrabajador, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
					.addGap(75)
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblBajaS)
									.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
									.addComponent(lblComBajaS, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblAltaS, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
									.addComponent(lblComAltaS, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_socios.createSequentialGroup()
									.addComponent(lblBuscarS, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
									.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
										.addComponent(lblComModS, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblComBuscarS, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_socios.createSequentialGroup()
									.addGap(0)
									.addGroup(gl_socios.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(tfAvisosS)
										.addGroup(gl_socios.createSequentialGroup()
											.addComponent(btnAltaS, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnBajaS, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnBuscarS, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnModS, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))))
							.addGap(40))
						.addGroup(gl_socios.createSequentialGroup()
							.addComponent(lblModS, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_socios.setVerticalGroup(
			gl_socios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(26)
					.addComponent(lblSocios)
					.addGap(18)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFNumS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAltaS)
						.addComponent(lblComAltaS))
					.addGap(14)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFNombreS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBajaS)
						.addComponent(lblComBajaS))
					.addGap(17)
					.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFFechaNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBuscarS)
						.addComponent(lblComBuscarS))
					.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(63)
							.addComponent(tfAvisosS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnModS, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscarS)
								.addComponent(btnBajaS)
								.addComponent(btnAltaS, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_socios.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_socios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_socios.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblModS)
									.addComponent(lblComModS))
								.addComponent(tAMAS, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
							.addGap(2)))
					.addGap(18)
					.addComponent(scrollSocios, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_socios.createSequentialGroup()
					.addGap(126)
					.addComponent(cBoxTrabajador, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
					.addGap(374))
		);
		
		tablaSocios = new JTable();
		tablaSocios.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero de Socio", "Nombre", "Fecha Nacimiento", "Trabajador", "Mas Info ..."
			}
		));
		tablaSocios.getColumnModel().getColumn(0).setPreferredWidth(95);
		tablaSocios.getColumnModel().getColumn(1).setPreferredWidth(240);
		tablaSocios.getColumnModel().getColumn(2).setPreferredWidth(95);
		tablaSocios.getColumnModel().getColumn(3).setPreferredWidth(65);
		tablaSocios.getColumnModel().getColumn(4).setPreferredWidth(300);
		scrollSocios.setViewportView(tablaSocios);
		socios.setLayout(gl_socios);
		GroupLayout groupLayout = new GroupLayout(frmBiblioteca.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(1)
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 796, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(tabbedPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
		);
		
		// INVENTARIO comienza el panel inventario
		
		JPanel inventario = new JPanel();
		tabbedPane.addTab("           INVENTARIO          ", null, inventario, null);
		inventario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		tfEdicion = new JTextField();
		tfEdicion.setText("< Introduzca la Edicion >");
		tfEdicion.setColumns(10);
		
		tFIsbn = new JTextField();
		tFIsbn.setText("< Introduzca el ISBN del libro >");
		tFIsbn.setColumns(10);
		
		tFTitulo = new JTextField();
		tFTitulo.setText("< Introduzca el Titulo >");
		tFTitulo.setColumns(10);
		
		tFAutor = new JTextField();
		tFAutor.setText("< Introduzca el Autor >");
		tFAutor.setColumns(10);
		
		JLabel lblAltaI = new JLabel("ALTA");
		lblAltaI.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComAltaI = new JLabel("Rellene todos los campos y pulse ALTA");
		lblComAltaI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblNewLabel_5_4_2_1 = new JLabel("");
		
		JLabel lblBuscarI = new JLabel("BUSQUEDA");
		lblBuscarI.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBuscarI = new JLabel("Rellene cualquier campo y pulse BUSCAR");
		lblComBuscarI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tFAvisosI = new JTextField();
		tFAvisosI.setForeground(Color.RED);
		tFAvisosI.setCaretColor(Color.RED);
		tFAvisosI.setDisabledTextColor(Color.RED);
		tFAvisosI.setFont(new Font("Tahoma", Font.BOLD, 14));
		tFAvisosI.setEditable(false);
		tFAvisosI.setColumns(10);
		
		JButton btnBaja_2_3_1 = new JButton("BUSCAR");
		btnBaja_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscarI = new JButton("BAJA");
		btnBuscarI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		grupoBoton_2 = new ButtonGroup();
		
		JRadioButton rdbtnInfantil = new JRadioButton("Infantil");
		grupoBoton_2.add(rdbtnInfantil);
		
		JRadioButton rdbtnAdulto = new JRadioButton("Adulto");
		rdbtnAdulto.setSelected(true);
		rdbtnAdulto.setAlignmentY(0.0f);
		grupoBoton_2.add(rdbtnAdulto);
		
		JScrollPane scrollInventario = new JScrollPane();
		
		JLabel lblBajaI = new JLabel("BAJA");
		lblBajaI.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBajaI = new JLabel("Busque, seleccione y pulse BAJA");
		lblComBajaI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnModI = new JButton("MODIFICAR");
		btnModI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAltaI = new JButton("ALTA");
		btnAltaI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblModI = new JLabel("MODIFICAR");
		lblModI.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComModI = new JLabel("Busque, cambie campos y pulse MODIFICAR");
		lblComModI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		GroupLayout gl_inventario = new GroupLayout(inventario);
		gl_inventario.setHorizontalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_inventario.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tFIsbn, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
								.addComponent(tFTitulo)
								.addComponent(tFAutor)
								.addComponent(tfEdicion))
							.addGap(75)
							.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblBuscarI, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
									.addComponent(lblComBuscarI, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblBajaI)
									.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
									.addComponent(lblComBajaI, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_inventario.createSequentialGroup()
									.addComponent(lblAltaI, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
									.addComponent(lblComAltaI, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_5_4_2_1, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
								.addGroup(gl_inventario.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(btnAltaI, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnBuscarI, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnBaja_2_3_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnModI, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_inventario.createSequentialGroup()
											.addComponent(lblModI, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
											.addComponent(lblComModI, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
										.addComponent(tFAvisosI, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))))
							.addGap(40))
						.addGroup(gl_inventario.createSequentialGroup()
							.addGap(63)
							.addComponent(rdbtnInfantil)
							.addGap(70)
							.addComponent(rdbtnAdulto)))
					.addContainerGap())
				.addGroup(gl_inventario.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollInventario, GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
					.addGap(16))
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(318)
					.addComponent(lblInventario)
					.addContainerGap(379, Short.MAX_VALUE))
		);
		gl_inventario.setVerticalGroup(
			gl_inventario.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inventario.createSequentialGroup()
					.addGap(26)
					.addComponent(lblInventario)
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFIsbn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAltaI)
						.addComponent(lblComAltaI))
					.addGap(14)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBajaI)
						.addComponent(lblComBajaI))
					.addGap(6)
					.addComponent(lblNewLabel_5_4_2_1)
					.addGap(11)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(tFAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBuscarI)
						.addComponent(lblComBuscarI))
					.addGap(18)
					.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfEdicion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblModI)
						.addComponent(lblComModI))
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addGroup(gl_inventario.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_inventario.createSequentialGroup()
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnInfantil)
								.addComponent(rdbtnAdulto))
							.addGap(44))
						.addGroup(gl_inventario.createSequentialGroup()
							.addComponent(tFAvisosI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_inventario.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnModI, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBaja_2_3_1)
								.addComponent(btnBuscarI)
								.addComponent(btnAltaI, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollInventario, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tablaInventario = new JTable();
		tablaInventario.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "Titulo", "Autor", "Edicion", "Categoria"
			}
		));
		tablaInventario.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablaInventario.getColumnModel().getColumn(1).setPreferredWidth(261);
		tablaInventario.getColumnModel().getColumn(2).setPreferredWidth(250);
		tablaInventario.getColumnModel().getColumn(4).setPreferredWidth(65);
		scrollInventario.setViewportView(tablaInventario);
		inventario.setLayout(gl_inventario);
		frmBiblioteca.getContentPane().setLayout(groupLayout);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, inventario, lblInventario, tfEdicion, tFIsbn, tFTitulo, tFAutor, lblAltaI, lblComAltaI, lblNewLabel_5_4_2_1, lblBuscarI, lblComBuscarI, tFAvisosI, btnBaja_2_3_1, btnBuscarI, rdbtnInfantil, rdbtnAdulto, scrollInventario, lblBajaI, lblComBajaI, btnModI, btnAltaI, tablaInventario, prestamo, tFIsbnP, tFNumSP, tFFechaAlta, btnAltaP, btnBajaP, btnBuscarP, lblBuscarP, lblComBuscarP, lblBajaP, lblComBajaP, lblAltaP, lblComAltaP, tFAvisosP, rdbtn15, rdbtn30, lblPrestamo, scrollPrestamo, lblModI, lblComModI, tFFechaDevolucion, lblDuracion, tablaPrestamo, lblFechaAlta, lblFechaDevolucion}));
	}
}
