package Ejercicios_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class frmEjercicio5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblEtiqueta;
	private JSeparator separator;
	private JLabel lblN_Jugador;
	private JTextField txtJugador;
	private JLabel lblPuntos;
	private JTextField txtPuntos;
	private JLabel lblN_Aleatorio;
	private JTextField txtOrdenador;
	private JButton btnJugar;
	private JSeparator separator_1;
	private JLabel lblResultado;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio5 frame = new frmEjercicio5();
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
	public frmEjercicio5() {
		initComponents();
	}
	private void initComponents() {
		setTitle("Ejercicio5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblEtiqueta = new JLabel("Escribe un n\u00FAmero del 0 al 10. Si lo aciertas ganas 10 puntos.");
		
		separator = new JSeparator();
		
		lblN_Jugador = new JLabel("N\u00FAmero del jugador:");
		
		txtJugador = new JTextField();
		txtJugador.setColumns(10);
		
		lblPuntos = new JLabel("Puntos:");
		
		txtPuntos = new JTextField();
		txtPuntos.setColumns(10);
		txtPuntos.setEditable(false); //He puesto este cuadro de texto de solo lectura.
		txtPuntos.setText("0"); //He puesto un 0 para que salga al principio de la partida.
		
		lblN_Aleatorio = new JLabel("N\u00FAmero aleatorio:");
		
		txtOrdenador = new JTextField();
		txtOrdenador.setColumns(10);
		txtOrdenador.setEditable(false); //He puesto este cuadro de texto de solo lectura.
		
		btnJugar = new JButton("Jugar");
		btnJugar.addActionListener(this);
		
		separator_1 = new JSeparator();
		
		lblResultado = new JLabel("Resultado de la ronda:");
		
		txtResultado = new JTextField();
		txtResultado.setColumns(10);
		txtResultado.setEditable(false); //He puesto este cuadro de texto de solo lectura.
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblN_Aleatorio)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(separator_1, Alignment.LEADING)
						.addComponent(separator, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblN_Jugador)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtOrdenador, Alignment.LEADING)
								.addComponent(txtJugador, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPuntos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPuntos, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnJugar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addContainerGap(1, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblResultado)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
					.addGap(162))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(lblEtiqueta, GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
					.addGap(163))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(4)
					.addComponent(lblEtiqueta)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblN_Jugador)
						.addComponent(txtJugador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPuntos)
						.addComponent(txtPuntos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblN_Aleatorio)
						.addComponent(txtOrdenador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnJugar))
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblResultado)
						.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnJugar) {
			do_btnJugar_actionPerformed(arg0);
		}
	}
	protected void do_btnJugar_actionPerformed(ActionEvent arg0) {
		String r = txtJugador.getText();
		int re = 0;
		int re1 = 0;
		try {
			re = Integer.parseInt(r);
			re1 = Integer.parseInt(txtPuntos.getText());
			if(re>0&&re<=10) {
				Random ran = new Random();
				int na = 1+ran.nextInt(11-1);
				txtOrdenador.setText(Integer.toString(na));
				if(re==na) {
					txtResultado.setText("Gana el jugador");
					re1 +=10;
					txtPuntos.setText(Integer.toString(re1));
				}else {
					txtResultado.setText("Gana el ordenador");
				}
			}else {
				txtResultado.setText("Número incorrecto.");
				if(re1<=0) {
					re1 = 0;
				}else {
					re1 -=5;
					txtPuntos.setText(Integer.toString(re1));
				}
			}
		}catch(NumberFormatException error) {
			txtResultado.setText("Número incorrecto porque es una letra.");
			String sol = txtPuntos.getText();
			int sol1 = Integer.parseInt(sol);
			if(sol1!=0) {
				sol1-=5;
			}else {
				sol1=0;
			}
			txtPuntos.setText(Integer.toString(sol1));
		}
			
	}
}
