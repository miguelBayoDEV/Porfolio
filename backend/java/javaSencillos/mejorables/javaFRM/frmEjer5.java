package Entornos_T5_05;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class frmEjercicio5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtEscribeUnNumero;
	private JLabel lblNmeroDelJugador;
	private JTextField txtJugador;
	private JLabel lblPuntos;
	private JTextField txtPuntos;
	private JLabel lblNmeroAleatorio;
	private JTextField txtOrdenador;
	private JButton cmdJugador;
	private JLabel lblResultadoDeLa;
	private JTextField txtResultado;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtEscribeUnNumero = new JTextField();
		txtEscribeUnNumero.setEditable(false);
		txtEscribeUnNumero.setText("Escribe un numero de 0 al 10. Si lo aciertas ganas 10 puntos");
		txtEscribeUnNumero.setColumns(10);
		
		lblNmeroDelJugador = new JLabel("Número del jugador");
		
		txtJugador = new JTextField();
		txtJugador.setColumns(10);
		
		lblPuntos = new JLabel("Puntos");
		
		txtPuntos = new JTextField();
		txtPuntos.setText("0");
		txtPuntos.setEditable(false);
		txtPuntos.setColumns(10);
		
		lblNmeroAleatorio = new JLabel("Número Aleatorio");
		
		txtOrdenador = new JTextField();
		txtOrdenador.setEditable(false);
		txtOrdenador.setColumns(10);
		
		cmdJugador = new JButton("Jugar");
		cmdJugador.addActionListener(this);
		
		lblResultadoDeLa = new JLabel("Resultado de la Ronda");
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		
		separator = new JSeparator();
		
		separator_1 = new JSeparator();
		
		separator_2 = new JSeparator();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(89)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNmeroDelJugador)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtJugador, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNmeroAleatorio)
									.addGap(18)
									.addComponent(txtOrdenador)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPuntos)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPuntos, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
								.addComponent(cmdJugador, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
							.addGap(23)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtEscribeUnNumero, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
					.addGap(3))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
					.addGap(47))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(59, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResultadoDeLa)
					.addGap(18)
					.addComponent(txtResultado, GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
					.addGap(23))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addComponent(txtEscribeUnNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroDelJugador)
						.addComponent(txtJugador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPuntos)
						.addComponent(txtPuntos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroAleatorio)
						.addComponent(txtOrdenador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmdJugador))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResultadoDeLa)
						.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(63))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmdJugador) {
			do_cmdJugador_actionPerformed(e);
		}
	}
	protected void do_cmdJugador_actionPerformed(ActionEvent e) {
		//Decimos que nos devuelva lo que hay escrito en el texto del jugador
		
		String texto = txtJugador.getText();
		
		//Damos la condicion de que si no esta entre 0 y 10 o no se pone nada, que salga numero incorrecto
		
		try {
			
			int numero = Integer.parseInt(texto);
			int suma = 0;
			
			//si esta en el rango generamos los numeros aleatorios
			
			if (numero>=0 && numero<=10 ) {
				
				Random aleatorio = new Random ();
				int i = aleatorio.nextInt(11);
				txtOrdenador.setText(i+"");
				
			//si gana el jugador	
				
				if (i==numero) {
					
					txtResultado.setText("Gana el Jugador");
					suma = Integer.parseInt(txtPuntos.getText());
					suma = suma+10;
					txtPuntos.setText(suma + "");
					
			//Si gana el ordenador		
					
				}else {
					
					txtResultado.setText("Gana el Ordenador");
					suma = Integer.parseInt(txtPuntos.getText());
					suma = suma+0;
					txtPuntos.setText(suma + "");
				}
				
			//Si el numero no es correcto	
				
			}else {
				
				txtOrdenador.setText("Numero incorrecto");
				suma = Integer.parseInt(txtPuntos.getText());
				
				if (suma>0) {
					
					suma=suma-5;
					txtPuntos.setText(suma + "");
					
				}else {
					
					txtPuntos.setText("0");
				}
			}
			
		}catch (NumberFormatException error) {
			
			txtOrdenador.setText("Numero incorrecto");
		}
		
	}
}
