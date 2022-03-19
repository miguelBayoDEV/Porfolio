package Ventana_Calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmCalculadora extends JFrame implements MouseListener, ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmGuardar;
	private JMenuItem mntmSalir;
	private JMenuItem mntmAcercaDe;
	private JRadioButton optn�mero1;
	private JRadioButton optn�mero2;
	private JLabel lblResultado;
	private JTextField txtn�mero1;
	private JTextField txtn�mero2;
	private JTextField txtresultado;
	private JButton btnSumar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnmenos;
	private JButton btnC;
	private JLabel lblOperaciones;
	private JTextArea txthistorial_operaciones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCalculadora frame = new frmCalculadora();
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
	public frmCalculadora() {
		initComponents();
	}
	private void initComponents() {
		setForeground(Color.WHITE);
		setTitle("Super Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 431);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(this);
		mnArchivo.add(mntmAbrir);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(this);
		mnArchivo.add(mntmGuardar);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.addActionListener(this);
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		optn�mero1 = new JRadioButton("N\u00FAmero 1:");
		optn�mero1.setSelected(true);
		optn�mero1.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(optn�mero1);
		
		optn�mero2 = new JRadioButton("N\u00FAmero 2:");
		optn�mero2.setBackground(Color.LIGHT_GRAY);
		buttonGroup.add(optn�mero2);
		
		lblResultado = new JLabel("Resultado:");
		
		txtn�mero1 = new JTextField();
		txtn�mero1.setText("0");
		txtn�mero1.setBackground(Color.LIGHT_GRAY);
		txtn�mero1.setEditable(false);
		txtn�mero1.setColumns(10);
		
		txtn�mero2 = new JTextField();
		txtn�mero2.setText("0");
		txtn�mero2.setEditable(false);
		txtn�mero2.setBackground(Color.LIGHT_GRAY);
		txtn�mero2.setColumns(10);
		
		txtresultado = new JTextField();
		txtresultado.setText("0");
		txtresultado.setEditable(false);
		txtresultado.setBackground(Color.LIGHT_GRAY);
		txtresultado.setColumns(10);
		
		btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(this);
		btnSumar.setBackground(Color.LIGHT_GRAY);
		
		btn1 = new JButton("1");
		btn1.addMouseListener(this);
		btn1.setBackground(Color.LIGHT_GRAY);
		
		btn2 = new JButton("2");
		btn2.addMouseListener(this);
		btn2.setBackground(Color.LIGHT_GRAY);
		
		btn3 = new JButton("3");
		btn3.addMouseListener(this);
		btn3.setBackground(Color.LIGHT_GRAY);
		
		btn4 = new JButton("4");
		btn4.addMouseListener(this);
		btn4.setBackground(Color.LIGHT_GRAY);
		
		btn5 = new JButton("5");
		btn5.addMouseListener(this);
		btn5.setBackground(Color.LIGHT_GRAY);
		
		btn6 = new JButton("6");
		btn6.addMouseListener(this);
		btn6.setBackground(Color.LIGHT_GRAY);
		
		btn7 = new JButton("7");
		btn7.addMouseListener(this);
		btn7.setBackground(Color.LIGHT_GRAY);
		
		btn8 = new JButton("8");
		btn8.addMouseListener(this);
		btn8.setBackground(Color.LIGHT_GRAY);
		
		btn9 = new JButton("9");
		btn9.addMouseListener(this);
		btn9.setBackground(Color.LIGHT_GRAY);
		
		btn0 = new JButton("0");
		btn0.addMouseListener(this);
		btn0.setBackground(Color.LIGHT_GRAY);
		
		btnmenos = new JButton("-");
		btnmenos.addActionListener(this);
		btnmenos.setBackground(Color.LIGHT_GRAY);
		
		btnC = new JButton("C");
		btnC.addActionListener(this);
		btnC.setBackground(Color.LIGHT_GRAY);
		
		lblOperaciones = new JLabel("Historial de operaciones");
		
		txthistorial_operaciones = new JTextArea();
		txthistorial_operaciones.setWrapStyleWord(true);
		txthistorial_operaciones.setLineWrap(true);
		txthistorial_operaciones.setEditable(false);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(optn�mero1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtn�mero1, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(optn�mero2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtn�mero2, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(lblResultado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtresultado, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(btn4)
										.addComponent(btn1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn3)
											.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
											.addComponent(btnSumar, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn5)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn6))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn0)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnmenos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btn7)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btn8)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btn9)
										.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)))))
						.addComponent(lblOperaciones)
						.addComponent(txthistorial_operaciones))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(optn�mero1)
						.addComponent(txtn�mero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(optn�mero2)
						.addComponent(txtn�mero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblResultado)
						.addComponent(txtresultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSumar)
						.addComponent(btn1)
						.addComponent(btn2)
						.addComponent(btn3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn4)
						.addComponent(btn5)
						.addComponent(btn6))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn7)
						.addComponent(btn8)
						.addComponent(btn9))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btn0)
						.addComponent(btnmenos)
						.addComponent(btnC))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblOperaciones)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txthistorial_operaciones, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void mouseClicked(MouseEvent arg0) {
		if (arg0.getSource() == btn1) {
			do_btn1_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn7) {
			do_btn7_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn3) {
			do_btn3_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn6) {
			do_btn6_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn0) {
			do_btn0_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn8) {
			do_btn8_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn5) {
			do_btn5_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn4) {
			do_btn4_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn2) {
			do_btn2_mouseClicked(arg0);
		}
		if (arg0.getSource() == btn9) {
			do_btn9_mouseClicked(arg0);
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
	protected void do_btn9_mouseClicked(MouseEvent arg0) {
		
		if(optn�mero1.isSelected()) {
			String nu = btn9.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn9.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn2_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn2.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn2.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn4_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn4.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn4.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn5_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn5.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn5.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn8_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn8.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn8.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn0_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn0.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn0.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn6_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn6.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn6.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn3_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn3.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn3.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn7_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn7.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn7.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	protected void do_btn1_mouseClicked(MouseEvent arg0) {
		if(optn�mero1.isSelected()) {
			String nu = btn1.getText();
			String n = "";
			if(txtn�mero1.getText().equals("0")) {
				txtn�mero1.setText("");
			}else {
				n = txtn�mero1.getText();
			}
			txtn�mero1.setText(n+nu);
		}else if(optn�mero2.isSelected()) {
			String nu = btn1.getText();
			String n = "";
			if(txtn�mero2.getText().equals("0")) {
				txtn�mero2.setText("");
			}else {
				n = txtn�mero2.getText();
			}
			txtn�mero2.setText(n+nu);
		}
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmAcercaDe) {
			do_mntmAcercaDe_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmAbrir) {
			do_mntmAbrir_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmGuardar) {
			do_mntmGuardar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnSumar) {
			do_btnSumar_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnmenos) {
			do_btnmenos_actionPerformed(arg0);
		}
		if (arg0.getSource() == btnC) {
			do_btnC_actionPerformed(arg0);
		}
	}
	protected void do_btnC_actionPerformed(ActionEvent arg0) {
		if(optn�mero1.isSelected()) {
			txtn�mero1.setText("0");
		}else if(optn�mero2.isSelected()) {
			txtn�mero2.setText("0");
		}
	}
	protected void do_btnmenos_actionPerformed(ActionEvent arg0) {
		if(optn�mero1.isSelected()) {
			String n = btnmenos.getText();
			String nu = txtn�mero1.getText();
			if(n.equals("-")) {
				txtn�mero1.setText(n+nu);
				btnmenos.setText("+");
			}else if(n.equals("+")) {
				String recorte = nu.substring(1);
				txtn�mero1.setText(recorte);
				btnmenos.setText("-");
			}
		}else if(optn�mero2.isSelected()) {
			String n = btnmenos.getText();
			String nu = txtn�mero2.getText();
			if(n.equals("-")) {
				txtn�mero2.setText(n+nu);
				btnmenos.setText("+");
			}else if(n.equals("+")) {
				String recorte = nu.substring(1);
				txtn�mero2.setText(recorte);
				btnmenos.setText("-");
			}
		}
	}
	protected void do_btnSumar_actionPerformed(ActionEvent arg0) {
		String n1 = txtn�mero1.getText();
		String n2 = txtn�mero2.getText();
		if(n1.equals("-"+n1)) {
			n1 = "("+txtn�mero1.getText()+")";
		}else {
			n1 = txtn�mero1.getText();
		}
		if(n2.equals("-"+n2)) {
			n2 = "("+txtn�mero2.getText()+")";
		}else {
			n2 = txtn�mero2.getText();
		}
		int resul = Integer.parseInt(n1) + Integer.parseInt(n2);
		txtresultado.setText(Integer.toString(resul));
		LocalDateTime fecha = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String f = fecha.format(formato);
		String resultado = txtresultado.getText();
		String separador = "==>";
		txthistorial_operaciones.append(f+separador+n1+" + "+n2+" = "+resultado+"\n");
	}
	protected void do_mntmGuardar_actionPerformed(ActionEvent arg0) {
		JFileChooser pesta�a = new JFileChooser();
		int pes = pesta�a.showSaveDialog(this);
		File f = pesta�a.getSelectedFile();
		PrintWriter txt = null;
		try {
			txt = new PrintWriter(f);
		}catch(FileNotFoundException error) {
			JOptionPane.showMessageDialog(this, "No se encuentra el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		txt.println("N�mero 1: "+txtn�mero1.getText());
		txt.println("N�mero 2: "+txtn�mero2.getText());
		txt.println("Resultado: "+txtresultado.getText());
		txt.close();
	}
	protected void do_mntmAbrir_actionPerformed(ActionEvent arg0) {
		JFileChooser pesta�a = new JFileChooser();
		int pes = pesta�a.showOpenDialog(this);
		File f = pesta�a.getSelectedFile();
		try {
			FileInputStream file = new FileInputStream(f);
			InputStreamReader leer = new InputStreamReader(file);
			BufferedReader lector = new BufferedReader(leer);
			txthistorial_operaciones.setText("");
			String pa = "";
			boolean repetir = true;
			while(repetir) {
				pa = lector.readLine();
				if(pa.equals(null)) {
					repetir = false;
					lector.close();
					leer.close();
					file.close();
				}else {
					txthistorial_operaciones.append(pa+"\n");
				}
			}
		}catch(FileNotFoundException error) {
			JOptionPane.showMessageDialog(this, "No se encuentra el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
		}catch(IOException error) {
			JOptionPane.showMessageDialog(this, "Error.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	protected void do_mntmSalir_actionPerformed(ActionEvent arg0) {
		this.dispose();
	}
	protected void do_mntmAcercaDe_actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(this, "Miguel �ngel Puerta Bayo", "Nombre y apellidos.", JOptionPane.INFORMATION_MESSAGE);
	}
}
