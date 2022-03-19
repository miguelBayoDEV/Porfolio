import java.lang.*;
import java.text.NumberFormat;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.*;
import gnu.jpdf.*;
import java.awt.*;
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String año = "Año de nacimiento: ";
		System.out.println(año);
		int año1 = s.nextInt();
		String sexo = "¿Eres hombre o mujer? ";
		System.out.println(sexo);
		Scanner s1 = new Scanner(System.in);
		String sex = s1.nextLine();
		String sexo1 = sex.equalsIgnoreCase("hombre")?"Hombre.":"Mujer.";
		String altura = "Introduzca altura (en metros con decimales): ";
		System.out.println(altura);
		double altura1 = s.nextDouble();
		String peso = "Introduzca peso (en kg con decimales): ";
		System.out.println(peso);
		double peso1 = s.nextDouble();
		String fcm = "Frecuencia cardiaca máxima: ";
		int edad = 2019-año1; //Diferencia de años del actual con el proporcionado para lograr edad.
		int resta1 = 0;
		if(sexo1.equalsIgnoreCase(sexo1)) {
			resta1 = 220-edad;
		}else if(sexo1.equalsIgnoreCase(sexo1)) {
			resta1 = 226-edad;
		}
		String i = "Índice de masa corporal (IMC): ";
		double imc = Math.pow((peso1/altura1), 2)*100; //IMC.
		String oms = "Estado según OMS: ";
		String estado = null;
		if(imc<16.00) {
			estado = "Infrapeso: delgadez severa.";
		}else if(imc>=16.00&&imc<=16.99) {
			estado = "Infrapeso: delgadez moderada.";
		}else if(imc>=17.00&&imc<=18.49) {
			estado = "Infrapeso: deslgadez aceptable.";
		}else if(imc>=18.50&&imc<=24.99) {
			estado = "Peso normal.";
		}else if(imc>=25.00&&imc<=29.99) {
			estado = "Sobrepeso.";
		}else if(imc>=30.00&&imc<=34.99) {
			estado = "Sobrepeso: tipo I.";
		}else if(imc>=35.00&&imc<=40.00) {
			estado = "Sobrepeso: tipo II.";
		}else if(imc>40.00) {
			estado = "Sobrepeso: tipo III.";	
		}
		try {
			PDFJob pdf = new PDFJob("cuerpo.pdf");
			Graphics g = pdf.getGraphics();
			g.drawString(año+año1, 0, 20);
			g.drawString(sexo+sexo1, 0, 30);
			g.drawString(altura+altura1, 0, 40);
			g.drawString(peso+peso1, 0, 50);
			g.drawString(fcm+resta1, 0, 60);
			g.drawString(i+imc, 0, 70);
			g.drawString(oms+estado, 0, 80);
			g.dispose();
			pdf.end();
			Desktop d = Desktop.getDesktop();
			File f = new File("cuerpo.pdf");
			d.open(f);
		}catch(IOException error) {
			System.out.println("Error IO.");
		}
		
	}

}
