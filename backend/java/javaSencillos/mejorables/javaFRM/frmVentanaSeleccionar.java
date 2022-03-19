package Ejercicios_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class frmVentanaSeleccionar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblRuta;
	private JTextField txtRuta;
	private JButton btnSeleccionar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVentanaSeleccionar frame = new frmVentanaSeleccionar();
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
	public frmVentanaSeleccionar() {
		initComponents();
	}
	private void initComponents() {
		setTitle("VentanaSeleccionar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblRuta = new JLabel("Ruta");
		
		txtRuta = new JTextField();
		txtRuta.setColumns(10);
		
		btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblRuta)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtRuta, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSeleccionar)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRuta)
						.addComponent(txtRuta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSeleccionar))
					.addContainerGap(217, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnSeleccionar) {
			do_btnSeleccionar_actionPerformed(arg0);
		}
	}
	protected void do_btnSeleccionar_actionPerformed(ActionEvent arg0) {
		JFileChooser b = new JFileChooser();
		b.showOpenDialog(this);
		File f = b.getSelectedFile();
		if(f==null) {
			JOptionPane.showMessageDialog(this,"No hay nada seleccionado.","Error", JOptionPane.ERROR_MESSAGE);
		}else {
			txtRuta.setText(f.toString());
		}
	}
}
