package Ejercicio1;
import java.time.*;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.AbstractListModel;

public class frmEjercicio1 extends JFrame implements WindowListener, ActionListener {

	private JPanel contentPane;
	private JList<ZoneId> lstZonas;
	private JButton btnMostrarHora;
	private JLabel lblZonaHoraria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio1 frame = new frmEjercicio1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmEjercicio1() {
		initComponents();
	}
	private void initComponents() {
		addWindowListener(this);
		setTitle("Reloj Mundial (c) 2020 Miguel Bayo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lstZonas = new JList<ZoneId>();
		lstZonas.setName("");
		
		btnMostrarHora = new JButton("Mostrar hora");
		btnMostrarHora.setBackground(Color.GRAY);
		btnMostrarHora.setIcon(new ImageIcon("C:\\Users\\AlumnoSMR\\Downloads\\Time-Machine-icon.png"));
		btnMostrarHora.addActionListener(this);
		btnMostrarHora.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		
		lblZonaHoraria = new JLabel("Zona horaria:");
		lblZonaHoraria.setIcon(new ImageIcon("C:\\Users\\AlumnoSMR\\Downloads\\earth-icon.png"));
		lblZonaHoraria.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnMostrarHora, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lstZonas, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
							.addGap(33))
						.addComponent(lblZonaHoraria))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addComponent(lblZonaHoraria)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lstZonas, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(btnMostrarHora, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(13))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void windowActivated(WindowEvent arg0) {
	}
	public void windowClosed(WindowEvent arg0) {
	}
	public void windowClosing(WindowEvent arg0) {
	}
	public void windowDeactivated(WindowEvent arg0) {
	}
	public void windowDeiconified(WindowEvent arg0) {
	}
	public void windowIconified(WindowEvent arg0) {
	}
	public void windowOpened(WindowEvent arg0) {
		if (arg0.getSource() == this) {
			do_this_windowOpened(arg0);
		}
	}
	protected void do_this_windowOpened(WindowEvent arg0) {
		//Mostrar zonas de los países del mundo.
		Set<String> zo = ZoneId.getAvailableZoneIds();
		Set<ZoneId> zonas = new HashSet<>();
		//Set<ZoneId> zonaa = new LinkedHashSet<>();
		//Set<ZoneId> zonas = new TreeSet<>();
		
		//Pasar de set al set treeset.
		for(String z:zo) {
			zonas.add(ZoneId.of(z));
		}
		DefaultListModel<ZoneId> lista_horaria = new DefaultListModel<>();
		for(ZoneId z:zonas) {
			lista_horaria.addElement(z);;
		}
		lstZonas.setModel(lista_horaria);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnMostrarHora) {
			do_btnMostrarHora_actionPerformed(arg0);
		}
	}
	protected void do_btnMostrarHora_actionPerformed(ActionEvent arg0) {
		//Mostrar mensaje de hora del país seleccionado.
		DefaultListModel<ZoneId> lista_horaria = new DefaultListModel<>();
		ZoneId zona = lstZonas.getSelectedValue();
		if(lista_horaria.contains(zona)) {
			int zo = lista_horaria.indexOf(lstZonas.getSelectedValue());
			ZoneId zone = lista_horaria.get(zo);
			JOptionPane.showInternalMessageDialog(this, "La hora actual en la zona "+lstZonas.getSelectedValue()+" es: "+ZonedDateTime.now(zone),"Hora en zona horaria: "+lstZonas.getSelectedValue(),JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
