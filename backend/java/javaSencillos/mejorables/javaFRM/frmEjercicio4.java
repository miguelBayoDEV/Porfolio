package Ejercicios_Ventanas;

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
		
		btnBotonA = new JButton("Bot\u00F3n A");
		btnBotonA.addActionListener(this);
		
		btnBotonB = new JButton("Bot\u00F3n B");
		btnBotonB.addActionListener(this);
		btnBotonB.setEnabled(false); //He modificado esto para que salga BotonB desactivado.
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addComponent(btnBotonA)
					.addGap(99)
					.addComponent(btnBotonB)
					.addContainerGap(105, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBotonA)
						.addComponent(btnBotonB))
					.addContainerGap(113, Short.MAX_VALUE))
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
	protected void do_btnBotonB_actionPerformed(ActionEvent arg0) {
		boolean h = btnBotonB.isEnabled();
		if(h) {
			btnBotonB.setEnabled(false);
			btnBotonA.setEnabled(true);
		}
	}
	protected void do_btnBotonA_actionPerformed(ActionEvent arg0) {
		boolean h = btnBotonA.isEnabled();
		if(h) {
			btnBotonA.setEnabled(false);
			btnBotonB.setEnabled(true);
		}
	}
}
