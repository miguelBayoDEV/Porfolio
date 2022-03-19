package entornos.Tema3.frmEjercicio4;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEjercicio4 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnBotonA;
	private JButton btnBotonB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio4 frame = new frmEjercicio4();
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
	public frmEjercicio4() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnBotonA = new JButton("Boton A");
		btnBotonA.addActionListener(this);
		
		btnBotonB = new JButton("Boton B");
		btnBotonB.addActionListener(this);
		btnBotonB.setEnabled(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(155)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnBotonB)
						.addComponent(btnBotonA))
					.addContainerGap(190, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(45)
					.addComponent(btnBotonA)
					.addGap(71)
					.addComponent(btnBotonB)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnBotonB) {
			do_btnBotonB_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnBotonA) {
			do_btnBotonA_actionPerformed(arg0);
		}
	}
	protected void do_btnBotonA_actionPerformed(ActionEvent arg0) {
		
		//pregunto si el boton A esta activado
		if (btnBotonA.isEnabled()) {
			
			//desactivo el boton A
			btnBotonA.setEnabled(false);
			//activo el boton B
			btnBotonB.setEnabled(true);
			
		}

	}
	protected void do_btnBotonB_actionPerformed(ActionEvent arg0) {
		
		//pregunto si el boton B esta activado
		if (btnBotonB.isEnabled()) {
			
			//activo el boton A
			btnBotonA.setEnabled(true);
			//desactivo el boton B
			btnBotonB.setEnabled(false);
		}
	}
}
