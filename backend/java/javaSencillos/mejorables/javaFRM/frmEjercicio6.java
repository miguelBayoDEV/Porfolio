package Ejercicios_Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class frmEjercicio6 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblRuta;
	private JTextField txtRuta;
	private JButton btnAbrir;
	private JTextArea txtTexto;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEjercicio6 frame = new frmEjercicio6();
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
	public frmEjercicio6() {
		initComponents();
	}
	private void initComponents() {
		setTitle("Ejercicio6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblRuta = new JLabel("Ruta:");
		
		txtRuta = new JTextField();
		txtRuta.setColumns(10);
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(this);
		
		txtTexto = new JTextArea();
		txtTexto.setBackground(SystemColor.controlHighlight);
		txtTexto.setForeground(new Color(0, 0, 0));
		txtTexto.setWrapStyleWord(true);
		txtTexto.setLineWrap(true);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGuardar))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtTexto)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblRuta)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtRuta, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnAbrir))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRuta)
						.addComponent(txtRuta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAbrir))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTexto, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnGuardar))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAbrir) {
			do_btnAbrir_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnGuardar) {
			do_btnGuardar_actionPerformed(arg0);
		}
	}
	protected void do_btnGuardar_actionPerformed(ActionEvent arg0) {
		
		String ruta1 = txtRuta.getText();
		PrintWriter txt = null;
		try {
			txt = new PrintWriter(ruta1);
		}catch(FileNotFoundException error) {
			txtTexto.setText("Archivo de texto no encontrado.");
		}
		String ruta = "";
		boolean repetir = true;
		while(repetir) {
			ruta = txtTexto.getText();
			txt.println(ruta);
			if(!ruta.equals("")) {
				repetir = false;
				txt.flush();
				txt.close();
			}
			
		}
		
	}
	protected void do_btnAbrir_actionPerformed(ActionEvent arg0) {
		
		String ruta = txtRuta.getText();
		try {
			FileInputStream f = new FileInputStream(ruta);
			InputStreamReader lector = new InputStreamReader(f);
			BufferedReader leer = new BufferedReader(lector);
			boolean repetir = true;
			while(repetir) {
				String línea = leer.readLine();
				if(línea==null) {
					repetir = false;
					leer.close();
					lector.close();
					f.close();
				}else {
					txtTexto.append(línea+"\n");
				}
			}
		}catch(IOException error) {
			txtTexto.setText("Error.");
		}
	}
}
