package Ejercicios_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEjercicio2 extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JLabel lblEtiqueta1;
	private JLabel lblEtiqueta2;
	private JButton btnIntercambiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio2 frame = new frmEjercicio2();
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
	public frmEjercicio2() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblEtiqueta1 = new JLabel("Mensaje 1.");
		
		lblEtiqueta2 = new JLabel("Mensaje 2.");
		
		btnIntercambiar = new JButton("Intercambiar.");
		btnIntercambiar.addActionListener(this);
		btnIntercambiar.addMouseListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(lblEtiqueta1)
							.addGap(43)
							.addComponent(lblEtiqueta2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(60)
							.addComponent(btnIntercambiar)))
					.addContainerGap(248, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEtiqueta1)
						.addComponent(lblEtiqueta2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnIntercambiar)
					.addContainerGap(176, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnIntercambiar) {
			do_btnIntercambiar_actionPerformed(arg0);
		}
	}
	protected void do_btnIntercambiar_actionPerformed(ActionEvent arg0) {

		String e1 = lblEtiqueta1.getText();
		String e2 = lblEtiqueta2.getText();
		lblEtiqueta1.setText(e2);
		lblEtiqueta2.setText(e1);
	}
}
