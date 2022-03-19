package entornos.Tema3.frmEjercicio2; 

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class frmEjercicio2 extends JFrame implements MouseListener {

	private JPanel contentPane;
	private JLabel lblEtiqueta1;
	private JLabel lblEtiqueta2;
	private JButton cmdIntercambiar;

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
		
		lblEtiqueta1 = new JLabel("Etiqueta1");
		
		lblEtiqueta2 = new JLabel("Etiqueta2");
		
		cmdIntercambiar = new JButton("Intercambiar");
		cmdIntercambiar.addMouseListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblEtiqueta1)
					.addPreferredGap(ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
					.addComponent(lblEtiqueta2)
					.addGap(84))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(151)
					.addComponent(cmdIntercambiar)
					.addContainerGap(184, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEtiqueta1)
						.addComponent(lblEtiqueta2))
					.addGap(58)
					.addComponent(cmdIntercambiar)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void mouseClicked(MouseEvent e) {
		String etiqueta1 = lblEtiqueta1.getText();
		String etiqueta2 = lblEtiqueta2.getText();
		lblEtiqueta1.setText(etiqueta2);
		lblEtiqueta2.setText(etiqueta1);
		
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}
