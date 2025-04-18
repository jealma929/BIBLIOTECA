package biblioteca.demo.run;

import java.time.*;
import java.time.format.*;
import javax.swing.JFrame;

import java.util.ArrayList;
import java.util.List;
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

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class BibliotecaView {
	
	protected JFrame frmBiblioteca; // es un componente de la ventana, define el contenedor de la biblioteca
	private JTextField tFEdicion;
	private JTextField tFIsbn;
	private JTextField tFTitulo;
	private JTextField tFAutor;
	private JTextField tFAvisosI;
	private JTable tablaInventario;
	private JTextField tFNumS;
	private JTextField tFNombreS;
	private JTextField tFFechaNacimiento;
	private JTextField tFAvisosS;
	private JTable tablaSocios;
	private JTextField tFIsbnP;
	private JTextField tFNumSP;
	private JTextField tFFechaAlta;
	private JTextField tFAvisosP;
	private JTextField tFFechaDevolucion;
	private JTable tablaPrestamo;
	private ButtonGroup grupoBoton_1;
	private ButtonGroup grupoBoton_2;
	protected int duracion;
	private JTextArea tAMAS;
	private List<Object> datos;
	private DefaultTableModel modeloPrestamo;
	private DefaultTableModel modeloSocios;
	private DefaultTableModel modeloInventario;
	
	private BibliotecaController controller;
	private JCheckBox cBoxTrabajador;
	private JRadioButton rdbtnAdulto;
	private JPanel prestamo;
	

	//*********** Devuelve la fecha en formato dd/MM/yyyycon  con posible incremento
	public static String asignaFecha (int i) {
		LocalDate lD = LocalDate.now();
		lD = lD.plusDays (i);
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fecha = lD.format(dTF);
		return fecha;
	}
	//*********** Devuelve la fecha a un formato LocalDate 
	public static String fechaLD (String fecha) {
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dTFDT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate lD = LocalDate.parse(fecha,dTF);
		String slD = lD.format(dTFDT);
		return slD;
	}
	
	//***********Devuelve el formato inicial de los JTextArea
	public void  cambiaFoco2(JTextArea nombre, String comentario) {
/*		
		nombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String text =nombre.getText();
				if (text.equals(comentario)) {
					nombre.setText("");
				}	
			}
			@Override
			public void focusLost(FocusEvent e) {
				String text =nombre.getText();
				if (text.isEmpty()) {
					nombre.setText(comentario);
		}
	}); 	*/
	}	

	
	//*********** Devuelve el formato inicial a los JTextFile
	private void  cambiaFoco(JTextField nombre, String comentario) {
		/*
		nombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String text =nombre.getText();
				if (text.equals(comentario)) {
					nombre.setText("");
				}	
			}
			@Override
			public void focusLost(FocusEvent e) {
				String text =nombre.getText();
				if (text.isEmpty()) {
					nombre.setText(comentario);
			}
		}
	});		*/ 
	}
	
	
	//*********** Reinicia la tabla antes de una nueva busqueda************************************	
	public void borrarTabla(DefaultTableModel modelo) {
		int i;
	
		for (i=modelo.getRowCount()-1;i>=0;i--) {
			modelo.removeRow(i);
		}
			
	}
	
	//*********** Gestiona los datos antes de pasarlos a controller(prestamos)*******************
	private void cargarDatos() {
		// TODO Auto-generated method stub
	
		//this.datos = new ArrayList<Object>();
		
		this.datos.add(tFIsbnP.getText());
		this.datos.add(tFNumSP.getText());
				
		String fechaAlta = fechaLD(tFFechaAlta.getText());
		this.datos.add(fechaAlta);
		
		String fechaDevolucion= fechaLD(tFFechaDevolucion.getText());
		this.datos.add(fechaDevolucion);
// ****************prueba		
		int numero= Integer.parseInt(datos.get(0).toString());
		int numero2= Integer.parseInt(datos.get(1).toString());
		tFAvisosP.setText(fechaAlta+" "+fechaDevolucion+" "+numero+numero2);
		
		this.controller.guardaDatos(datos);
	}
	
	//*********** Gestiona los datos antes de pasarlos a controller(Inventario)*******************
	private void cargarDatosI() {
		// TODO Auto-generated method stub
		
		this.datos.add(tFIsbn.getText());
		this.datos.add(tFTitulo.getText());
		this.datos.add(tFAutor);
		this.datos.add(tFEdicion.getText());
		int categoria;
		if (rdbtnAdulto.isSelected()) {
			categoria=1;
		}else {
			categoria=0;
		}
	
		this.controller.guardaDatosI(datos);
	}
	
	//*********** Gestiona los datos antes de pasarlos a controller (Socios)
	private void cargarDatosS() {
		// TODO Auto-generated method stub
		
		this.datos.add(tFNumS.getText());
						
		String fechaNacimiento= fechaLD(tFFechaNacimiento.getText());
		this.datos.add(tFFechaNacimiento);
		
		this.datos.add(tFNombreS.getText());
		
		int check;
		if (cBoxTrabajador.isSelected()) {
			check=1;
		} else {
			check=0;
		}
		this.datos.add(check);
		this.datos.add(0);
		this.datos.add(tAMAS.getText());
		
		this.controller.guardaDatosS(datos);
	}
	
	
	
	public BibliotecaView(BibliotecaController controlador) {		// inicializamos la biblioteca
		initialize (controlador);
	}
	
/***********************************************   INICIALIZE **/
	
	private void initialize(BibliotecaController controlador) {
		
		this.datos = new ArrayList<Object>();
		
		frmBiblioteca = new JFrame();
		frmBiblioteca.setResizable(false);
		frmBiblioteca.setBackground(new Color(0, 0, 255));
		frmBiblioteca.setTitle("Gestion de BIBLIOTECA");
		frmBiblioteca.setBounds(0, 0, 815, 600);
		frmBiblioteca.setVisible(true);
		//ahora vinculamos la vista con el controlador que creo en el swingMain
		this.controller = controlador;
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFocusTraversalKeysEnabled(false);
		tabbedPane.setBorder(BorderFactory.createLoweredBevelBorder());

		
/************************************************   PRESTAMO comienza esta pestaña **/
		
		modeloPrestamo = new DefaultTableModel (new Object[][] {
				},
				new String[] {
					"ISBN Libro", "Numero de Socio", "Fecha de Prestamo", "Fecha de Devoluci\u00F3n"
				}
			);
		
		prestamo = new JPanel();
		prestamo.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		prestamo.setFocusTraversalKeysEnabled(false);
		prestamo.setBorder(BorderFactory.createRaisedBevelBorder());
		tabbedPane.addTab("            PRESTAMO         ", null, prestamo, null);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tabbedPane.setBorder(BorderFactory.createRaisedBevelBorder());
		prestamo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		
		tFIsbnP = new JTextField();
		tFIsbnP.setFocusTraversalKeysEnabled(false);
		tFIsbnP.setBorder(BorderFactory.createLoweredBevelBorder());
		tFIsbnP.setText("");
		//tFIsbnP.setText("< Introduzca el ISBN del libro >");
		tFIsbnP.setColumns(10);
		//cambiaFoco(tFIsbnP,"< Introduzca el ISBN del libro >");
		
		tFNumSP = new JTextField();
		tFNumSP.setFocusTraversalKeysEnabled(false);
		tFNumSP.setBorder(BorderFactory.createLoweredBevelBorder());
		tFNumSP.setText("");
		//tFNumSP.setText("< Introduzca el Numero de socio >");
		tFNumSP.setColumns(10);
		//cambiaFoco(tFNumSP,"< Introduzca el Numero de socio >");
		
		tFFechaAlta = new JTextField();
		tFFechaAlta.setFocusTraversalKeysEnabled(false);
		tFFechaAlta.setBorder(BorderFactory.createLoweredBevelBorder());
		tFFechaAlta.setFont(new Font("Tahoma", Font.BOLD, 11));
		tFFechaAlta.setText(asignaFecha (0));
		tFFechaAlta.setEditable(false);
		tFFechaAlta.setColumns(10);
		
		tFFechaDevolucion = new JTextField();
		tFFechaDevolucion.setFocusTraversalKeysEnabled(false);
		tFFechaDevolucion.setBorder(BorderFactory.createLoweredBevelBorder());
		tFFechaDevolucion.setFont(new Font("Tahoma", Font.BOLD, 11));
		tFFechaDevolucion.setEditable(false);
		tFFechaDevolucion.setColumns(10);
		
		JButton btnAltaP = new JButton("ALTA");
		btnAltaP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDatos();
			}
		});
		btnAltaP.setFocusTraversalKeysEnabled(false);
		btnAltaP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBajaP = new JButton("BAJA");
		btnBajaP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBajaP.setFocusTraversalKeysEnabled(false);
		btnBajaP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JCheckBox cBoxEscedidos = new JCheckBox("ESCEDIDOS");
		cBoxEscedidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		JButton btnBuscarP = new JButton("BUSCAR");
		btnBuscarP.setFocusTraversalKeysEnabled(false);
		btnBuscarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla(modeloPrestamo);
				
				int check;
				if (cBoxEscedidos.isSelected()) {
					check=1;
				} else {
					check=0;
				}
				String aviso="PRESTAMOS"+tFIsbnP.getText()+tFNumSP.getText()+check;
				avisoView (aviso,"prestamo");;
/*AVISO*/		//tFAvisosP.setText(String.valueOf(check)+ "PRESTAMOS "+tFIsbnP.getText()+ tFNumSP.getText());
				controller.BuscarPrestamo("PRESTAMO",tFIsbnP.getText(),tFNumSP.getText(),check);
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
		tFAvisosP.setFocusTraversalKeysEnabled(false);
		tFAvisosP.setBorder(BorderFactory.createLoweredBevelBorder());
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
				if (rdbtn15.isSelected()) {
					duracion = 15;
					tFFechaDevolucion.setText(asignaFecha (duracion));
				}
			}
		});
		rdbtn15.setSelected(true);
		grupoBoton_1.add(rdbtn15);		
		
		JRadioButton rdbtn30 = new JRadioButton("30 Dias");
		rdbtn30.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (rdbtn30.isSelected()) {
					duracion = 30;
					tFFechaDevolucion.setText(asignaFecha (duracion));
				}
			}
		});
		rdbtn30.setAlignmentY(0.0f);
		grupoBoton_1.add(rdbtn30);
									
		JLabel lblPrestamo = new JLabel("PRESTAMO");
		lblPrestamo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollPrestamo = new JScrollPane();
		//scrollPrestamo.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		scrollPrestamo.setBorder(BorderFactory.createLoweredBevelBorder());
		
		
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
								.addGroup(Alignment.LEADING, gl_prestamo.createSequentialGroup()
									.addComponent(btnAltaP, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(btnBajaP, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(btnBuscarP, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(cBoxEscedidos, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
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
										.addComponent(btnBajaP)
										.addComponent(cBoxEscedidos)))
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
							.addGap(17)
							.addComponent(scrollPrestamo, GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
						.addGroup(gl_prestamo.createSequentialGroup()
							.addGap(136)
							.addComponent(rdbtn15)))
					.addContainerGap())
		);
		
		tablaPrestamo = new JTable();
		tablaPrestamo.setFocusTraversalKeysEnabled(false);
		tablaPrestamo.setCellSelectionEnabled(true);
		tablaPrestamo.setModel(modeloPrestamo);
				
		tablaPrestamo.getColumnModel().getColumn(1).setPreferredWidth(100);
		tablaPrestamo.getColumnModel().getColumn(2).setPreferredWidth(102);
		tablaPrestamo.getColumnModel().getColumn(3).setPreferredWidth(115);
		scrollPrestamo.setViewportView(tablaPrestamo);
		prestamo.setLayout(gl_prestamo);
		
		
/********************** SOCIOS comienza el panel de socios **/
		
		modeloSocios = new DefaultTableModel(new Object[][] {
				},
				new String[] {
					"Num. Socio", "Nombre", "F. Nacimiento", "Trabajador", "Mas Info ..."
				}
		);
		
		JPanel socios = new JPanel();
		socios.setFocusTraversalKeysEnabled(false);
		socios.setBorder(BorderFactory.createRaisedBevelBorder());
		tabbedPane.addTab("            SOCIOS            ", null, socios, null);
		socios.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		tFNumS = new JTextField();
		tFNumS.setFocusTraversalKeysEnabled(false);
		tFNumS.setBorder(BorderFactory.createLoweredBevelBorder());
		tFNumS.setText("< Introduzca el Numero de socio  >");
		tFNumS.setColumns(10);
		cambiaFoco(tFNumS,"< Introduzca el Numero de socio  >");
		/**
		tFNumS.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				tFNumS.setText("");
			}
			@Override
			public void focusLost(FocusEvent e) {
				String text = tFNumS.getText();
				if (text.isEmpty()) {
					tFNumS.setText("< Introduzca el Numero de socio  >");
				}
			}
		});
		**/
		tFNombreS = new JTextField();
		tFNombreS.setFocusTraversalKeysEnabled(false);
		tFNombreS.setBorder(BorderFactory.createLoweredBevelBorder());
		tFNombreS.setText("< Introduzca el Nombre completo >");
		tFNombreS.setColumns(10); 	
		cambiaFoco(tFNombreS,"< Introduzca el Nombre completo >");
				
		tFFechaNacimiento = new JTextField();
		tFFechaNacimiento.setFocusTraversalKeysEnabled(false);
		tFFechaNacimiento.setBorder(BorderFactory.createLoweredBevelBorder());
		tFFechaNacimiento.setText("< F. de nacimiento >");
		tFFechaNacimiento.setColumns(10);
		cambiaFoco(tFFechaNacimiento,"< F. de nacimiento >");
		/**
		tFFechaNacimiento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				tFFechaNacimiento.setText("");
			}
		});
		**/
		//******************** asigna un documentlistener
        tFFechaNacimiento.getDocument().addDocumentListener(new DocumentListener() {

			@Override
            public void insertUpdate(DocumentEvent e) {
                validateDate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateDate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateDate();
            }
           
            // **************** valida los datos con el formato
            private void validateDate() {
        
                try {
                	LocalDate.parse(tFFechaNacimiento.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                	tFAvisosS.setText("Fecha válida --> " + tFFechaNacimiento.getText());
                } catch (DateTimeParseException e) {
                    tFAvisosS.setText("Fecha no válida. Formato fecha : dd/mm/aaaa");
                }
            }
            
        });
        
		
		JButton btnAltaS = new JButton("ALTA");
		btnAltaS.setFocusTraversalKeysEnabled(false);
		btnAltaS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDatosS();		
			}
		});
		btnAltaS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBajaS = new JButton("BAJA");
		btnBajaS.setFocusTraversalKeysEnabled(false);
		btnBajaS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBuscarS = new JButton("BUSCAR");
		btnBuscarS.setFocusTraversalKeysEnabled(false);
		btnBuscarS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla(modeloSocios);
				int check;
				if (cBoxTrabajador.isSelected()) {
					check=1;
				} else {
					check=0;
				}
				
/*AVISO*/		tFAvisosS.setText(String.valueOf(check));
				controller.BuscarPrestamo("SOCIOS",tFIsbnP.getText(), tFNumSP.getText(),check);
			}
		});
		btnBuscarS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnModS = new JButton("MODIFICAR");
		btnModS.setFocusTraversalKeysEnabled(false);
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
		
		tFAvisosS = new JTextField();
		tFAvisosS.setFocusTraversalKeysEnabled(false);
		tFAvisosS.setBorder(BorderFactory.createLoweredBevelBorder());
		tFAvisosS.setForeground(Color.RED);
		tFAvisosS.setFont(new Font("Tahoma", Font.BOLD, 14));
		tFAvisosS.setEditable(false);
		tFAvisosS.setDisabledTextColor(Color.RED);
		tFAvisosS.setColumns(10);
		tFAvisosS.setCaretColor(Color.RED);
		
		JLabel lblSocios = new JLabel("SOCIOS");
		lblSocios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JScrollPane scrollSocios = new JScrollPane();
		//scrollSocios.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollSocios.setFocusTraversalKeysEnabled(false);
		scrollSocios.setBorder(BorderFactory.createLoweredBevelBorder());
		
		cBoxTrabajador = new JCheckBox("Trabajador");
		
		tAMAS = new JTextArea();
		tAMAS.setFocusTraversalKeysEnabled(false);
		tAMAS.setBorder(BorderFactory.createLoweredBevelBorder());
		tAMAS.setLineWrap(true);
		tAMAS.setPreferredSize(new Dimension(288, 100));
		tAMAS.setMaximumSize(new Dimension(288, 100));
		tAMAS.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tAMAS.setText("< Mas informacion >");
		cambiaFoco2(tAMAS,"< Mas informacion >");
		
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
										.addComponent(tFAvisosS)
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
							.addComponent(tFAvisosS, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
		tablaSocios.setModel(modeloSocios);
		tablaSocios.getColumnModel().getColumn(0).setPreferredWidth(95);
		tablaSocios.getColumnModel().getColumn(1).setPreferredWidth(240);
		tablaSocios.getColumnModel().getColumn(2).setPreferredWidth(95);
		tablaSocios.getColumnModel().getColumn(3).setPreferredWidth(69);
		tablaSocios.getColumnModel().getColumn(4).setPreferredWidth(295);
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
		
		
		/** INVENTARIO comienza el panel inventario **/
		
		modeloInventario = new DefaultTableModel( new Object[][] {
				},
				new String[] {
					"ISBN", "Titulo", "Autor", "Edicion", "Categoria"
				}
			);
		
		
		
		JPanel inventario = new JPanel();
		inventario.setFocusTraversalKeysEnabled(false);
		inventario.setBorder(BorderFactory.createRaisedBevelBorder());
		tabbedPane.addTab("           INVENTARIO          ", null, inventario, null);
		inventario.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		tFEdicion = new JTextField();
		tFEdicion.setFocusTraversalKeysEnabled(false);
		tFEdicion.setBorder(BorderFactory.createLoweredBevelBorder());
		tFEdicion.setText("< Introduzca la Edicion >");
		tFEdicion.setColumns(10);
		cambiaFoco(tFEdicion,"< Introduzca la Edicion >");
		
		tFIsbn = new JTextField();
		tFIsbn.setFocusTraversalKeysEnabled(false);
		tFIsbn.setBorder(BorderFactory.createLoweredBevelBorder());
		tFIsbn.setText("< Introduzca el ISBN del libro >");
		tFIsbn.setColumns(10);
		cambiaFoco(tFIsbn,"< Introduzca el ISBN del libro >");
		
		tFTitulo = new JTextField();
		tFTitulo.setBorder(BorderFactory.createLoweredBevelBorder());
		tFTitulo.setText("< Introduzca el Titulo >");
		tFTitulo.setColumns(10);
		cambiaFoco(tFTitulo,"< Introduzca el Titulo >");
		
		tFAutor = new JTextField();
		tFAutor.setFocusTraversalKeysEnabled(false);
		tFAutor.setBorder(BorderFactory.createLoweredBevelBorder());
		tFAutor.setText("< Introduzca el Autor >");
		tFAutor.setColumns(10);
		cambiaFoco(tFAutor,"< Introduzca el Autor >");

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
		tFAvisosI.setFocusTraversalKeysEnabled(false);
		tFAvisosI.setBorder(BorderFactory.createLoweredBevelBorder());
		tFAvisosI.setForeground(Color.RED);
		tFAvisosI.setCaretColor(Color.RED);
		tFAvisosI.setDisabledTextColor(Color.RED);
		tFAvisosI.setFont(new Font("Tahoma", Font.BOLD, 14));
		tFAvisosI.setEditable(false);
		tFAvisosI.setColumns(10);
		
		JButton btnBuscarI = new JButton("BUSCAR");
		btnBuscarI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTabla(modeloInventario);
				controller.BuscarInventario(tFTitulo.getText());
			}
		});
		btnBuscarI.setFocusTraversalKeysEnabled(false);
		btnBuscarI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnBajaI = new JButton("BAJA");
		btnBajaI.setFocusTraversalKeysEnabled(false);
		btnBajaI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		grupoBoton_2 = new ButtonGroup();
		
		JRadioButton rdbtnInfantil = new JRadioButton("Infantil");
		grupoBoton_2.add(rdbtnInfantil);
				
		JRadioButton rdbtnAdulto = new JRadioButton("Adulto");
		rdbtnAdulto.setSelected(true);
		rdbtnAdulto.setAlignmentY(0.0f);
		grupoBoton_2.add(rdbtnAdulto);
		
		JScrollPane scrollInventario = new JScrollPane();
		//scrollInventario.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollInventario.setFocusTraversalKeysEnabled(false);
		scrollInventario.setBorder(BorderFactory.createLoweredBevelBorder());
		
		JLabel lblBajaI = new JLabel("BAJA");
		lblBajaI.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblComBajaI = new JLabel("Busque, seleccione y pulse BAJA");
		lblComBajaI.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnModI = new JButton("MODIFICAR");
		btnModI.setFocusTraversalKeysEnabled(false);
		btnModI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnAltaI = new JButton("ALTA");
		btnAltaI.setFocusTraversalKeysEnabled(false);
		btnAltaI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAltaI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarDatosI();		
			}
		});
		
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
								.addComponent(tFEdicion))
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
											.addComponent(btnBajaI, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(btnBuscarI, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
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
						.addComponent(tFEdicion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
								.addComponent(btnBuscarI)
								.addComponent(btnBajaI)
								.addComponent(btnAltaI, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollInventario, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tablaInventario = new JTable();
		tablaInventario.setModel(modeloInventario);
		tablaInventario.getColumnModel().getColumn(0).setPreferredWidth(100);
		tablaInventario.getColumnModel().getColumn(1).setPreferredWidth(261);
		tablaInventario.getColumnModel().getColumn(2).setPreferredWidth(250);
		tablaInventario.getColumnModel().getColumn(4).setPreferredWidth(65);
		scrollInventario.setViewportView(tablaInventario);
		inventario.setLayout(gl_inventario);
		frmBiblioteca.getContentPane().setLayout(groupLayout);
		frmBiblioteca.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tabbedPane, inventario, lblInventario, tFEdicion, tFIsbn, tFTitulo, tFAutor, lblAltaI, lblComAltaI, lblNewLabel_5_4_2_1, lblBuscarI, lblComBuscarI, tFAvisosI, btnBuscarI, btnBajaI, rdbtnInfantil, rdbtnAdulto, scrollInventario, lblBajaI, lblComBajaI, btnModI, btnAltaI, tablaInventario, prestamo, tFIsbnP, tFNumSP, tFFechaAlta, btnAltaP, btnBajaP, btnBuscarP, lblBuscarP, lblComBuscarP, lblBajaP, lblComBajaP, lblAltaP, lblComAltaP, tFAvisosP, rdbtn15, rdbtn30, lblPrestamo, scrollPrestamo, lblModI, lblComModI, tFFechaDevolucion, lblDuracion, tablaPrestamo, lblFechaAlta, lblFechaDevolucion, cBoxEscedidos}));
	}

	protected void cargarbusqueda() {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return this.frmBiblioteca;
	}

	public void rellenatablaPrestamo(Object[] rowPrestamo) {
		// TODO Auto-generated method stub
		
		this.modeloPrestamo.addRow(rowPrestamo);
		
		this.tablaPrestamo.setModel(modeloPrestamo);
		
	}

	public void rellenatablaSocio(Object[] rowSocio) {
		// TODO Auto-generated method stub
		
		this.modeloSocios.addRow(rowSocio);
		this.tablaSocios.setModel(modeloSocios);
		
	}
	
	public void rellenatablaInventario(Object[] rowInventario) {
		// TODO Auto-generated method stub
		this.modeloInventario.addRow(rowInventario);
		this.tablaInventario.setModel(modeloInventario);
	
	}
	public void avisoView(String s, String tabla) {
		// TODO Auto-generated method stub
		if (tabla=="prestamo") {
			tFAvisosP.setText(s);
		} else if (tabla=="socio"){
			tFAvisosS.setText(s);
			} else {
				tFAvisosI.setText(s);
			}		
	}
}
