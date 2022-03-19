package t4ej20;

import java.util.*;
import java.time.*;
import gnu.jpdf.*;
import java.awt.*;
import java.io.*;
import java.text.*;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Hombre o Mujer");
		String sexo =s.nextLine();
		
		System.out.println("Año de nacimiento");
		int año=s.nextInt();
		LocalDate fecha=LocalDate.now();
		int edad=fecha.getYear()-año;
		
		System.out.println("Altura (m)");
		double altura=s.nextDouble();
		
		System.out.println("Peso (kg)");
		double peso=s.nextDouble();
	
		int c=sexo.equalsIgnoreCase("Hombre")?220:226;
		int frec= c-edad;
		
		double imc= peso/(altura*altura);
		
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		String imc2=nf.format(imc);
		
		String oms=null;
		if(imc<16) {
			oms="Infrapeso:delgadez severa";
		}else if(imc<17) {
			oms="Infrapeso:delgadez moderada";
		}else if(imc<18.5) {
			oms="Infrapeso:delgadez aceptable";
		}else if(imc<25) {
			oms="Peso normal";
		}else if(imc<30) {
			oms="Sobrepeso";
		}else if(imc<35) {
			oms="Sobrepeso:tipo I";
		}else if(imc<40) {
			oms="Sobrepeso:tipo II";
		}else {
			oms="Sobrepeso:tipo III";
		}
		
		try {
			PDFJob pdf=new PDFJob("Ejercicio20.pdf");
			Graphics g= pdf.getGraphics();
			g.drawString("Fecha de nacimiento: "+año,50,50);
			g.drawString("Edad: "+edad,50,60);
			g.drawString("Sexo: "+sexo,50,70);
			g.drawString("Altura: "+altura+"m",50,80);
			g.drawString("Peso: "+peso+"kg",50,90);
			g.drawString("Frecuencia cardiaca maxima: "+frec,50,100);
			g.drawString("Indice de masa corporal: "+imc2,50,110);
			g.drawString("Fecha de nacimiento: "+oms,50,120);
			g.dispose();
			pdf.end();
		}catch(IOException error) {
			System.out.println(error);
		}
	}

}
