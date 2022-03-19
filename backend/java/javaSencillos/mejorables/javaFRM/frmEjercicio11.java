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

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEjercicio11 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblConversor_Monedas;
	private JSeparator separator;
	private JLabel lblEuros;
	private JTextField txtEuros;
	private JButton btnConvertir;
	private JRadioButton optDolares;
	private JRadioButton optLibras;
	private JRadioButton optYens;
	private JRadioButton optPesetas;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio11 frame = new frmEjercicio11();
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
	public frmEjercicio11() {
		initComponents();
	}
	private void initComponents() {
		setTitle("Ejercicio11");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblConversor_Monedas = new JLabel("Conversor de monedas");
		lblConversor_Monedas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		separator = new JSeparator();
		
		lblEuros = new JLabel("Seleccione la cantidad en euros:");
		lblEuros.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtEuros = new JTextField();
		txtEuros.setColumns(10);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(this);
		
		optDolares = new JRadioButton("Convertir a d\u00F3lares");
		buttonGroup.add(optDolares);
		
		optLibras = new JRadioButton("Convertir a libras");
		buttonGroup.add(optLibras);
		
		optYens = new JRadioButton("Convertir a yens");
		buttonGroup.add(optYens);
		
		optPesetas = new JRadioButton("Convertir a pesetas");
		buttonGroup.add(optPesetas);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(optLibras)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(optDolares)
									.addContainerGap())
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(separator, GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblEuros)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtEuros, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(btnConvertir)))
										.addContainerGap())
									.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
										.addComponent(lblConversor_Monedas, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
										.addGap(49))))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(optPesetas)
									.addComponent(optYens))
								.addContainerGap()))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConversor_Monedas, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEuros)
						.addComponent(txtEuros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConvertir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(optDolares)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(optLibras)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(optYens)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(optPesetas)
					.addContainerGap(65, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnConvertir) {
			do_btnConvertir_actionPerformed(arg0);
		}
	}
	protected void do_btnConvertir_actionPerformed(ActionEvent arg0) {
		
		String euros = "";
		Double conversion = 0.00;
		if(optDolares.isSelected()) {
			euros = txtEuros.getText();
			try {
				conversion = Double.parseDouble(euros);
				JOptionPane.showMessageDialog(this,"Conversión a dólares son: "+conversion*1.10,"Dólares",JOptionPane.INFORMATION_MESSAGE);
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(this,"Número incorrecto.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}else if(optLibras.isSelected()) {
			euros = txtEuros.getText();
			try {
				conversion = Double.parseDouble(euros);
				JOptionPane.showMessageDialog(this,"Conversión a libras son: "+conversion*0.85,"Libras",JOptionPane.INFORMATION_MESSAGE);
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(this,"Número incorrecto.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}else if(optYens.isSelected()) {
			euros = txtEuros.getText();
			try {
				conversion = Double.parseDouble(euros);
				JOptionPane.showMessageDialog(this,"Conversión a yens son: "+conversion*120.55,"Yens",JOptionPane.INFORMATION_MESSAGE);
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(this,"Número incorrecto.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}else if(optPesetas.isSelected()) {
			euros = txtEuros.getText();
			try {
				conversion = Double.parseDouble(euros);
				JOptionPane.showMessageDialog(this,"Conversión a pesetas son: "+conversion*166.386,"Pesetas",JOptionPane.INFORMATION_MESSAGE);
			}catch(NumberFormatException error) {
				JOptionPane.showMessageDialog(this,"Número incorrecto.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}else {
			JOptionPane.showMessageDialog(this,"Debes elegir una moneda.","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}
