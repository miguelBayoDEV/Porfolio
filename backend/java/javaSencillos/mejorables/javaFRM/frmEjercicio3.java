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

public class frmEjercicio3 extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JLabel lblEtiqueta;
	private JButton btnAccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio3 frame = new frmEjercicio3();
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
	public frmEjercicio3() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblEtiqueta = new JLabel("La etiqueta est\u00E1 visible.");
		
		btnAccion = new JButton("Ocultar");
		btnAccion.addActionListener(this);
		btnAccion.addMouseListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(btnAccion))
						.addComponent(lblEtiqueta))
					.addContainerGap(300, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(lblEtiqueta)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAccion)
					.addContainerGap(183, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == btnAccion) {
			do_btnAccion_mouseClicked(arg0);
		}
	}
	public void mouseEntered(MouseEvent arg0) {
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	protected void do_btnAccion_mouseClicked(MouseEvent arg0) {
	}
		
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAccion) {
			do_btnAccion_actionPerformed(arg0);
		}
	}
	protected void do_btnAccion_actionPerformed(ActionEvent arg0) {
		boolean v = lblEtiqueta.isVisible();
		if(v) {
			lblEtiqueta.setVisible(false);
			String mostrar = "Mostrar";
			btnAccion.setText(mostrar);
		}else {
			lblEtiqueta.setVisible(true);
			String visible = lblEtiqueta.getText();
			lblEtiqueta.setText(visible);
			String ocultar = "Ocultar";
			btnAccion.setText(ocultar); 
		}
	}
}
