import net.miginfocom.swing.MigLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.TextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.Button;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class bibliotecaGui {
	
	protected JFrame frmSooper;
	
	public bibliotecaGui() {
		initialize();
	}
	
	private void initialize() {
		
		//inicializacion y parámetros del frame. Codigo auto-generado desde el WinBuilder
		frmSooper = new JFrame();
		frmSooper.setBackground(new Color(240, 240, 240));
		frmSooper.setFont(null);
		frmSooper.setForeground(new Color(240, 240, 240));
		frmSooper.setTitle("BIBLIOTECA");
		frmSooper.setBounds(0, 0, 496, 496);
		frmSooper.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 480, 457);
		frmSooper.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("        Inventario        ", null, tabbedPane_1, null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("          Socios          ", null, tabbedPane_2, null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("        Prestamos        ", null, tabbedPane_3, null);
	
	}
	public JTabbedPane getTabbedPane_4() {
		return tabbedPane_4;
	}
}
