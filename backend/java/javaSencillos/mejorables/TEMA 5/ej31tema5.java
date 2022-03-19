package ej31tema5;
import java.awt.Graphics;
import java.io.IOException;

import gnu.jpdf.*;
public class ej31tema5 {

	public static void main(String[] args) {
		int cuenta=0;
		try {
		PDFJob pdf=new PDFJob("C:/texto/hola.pdf");
		for(int i=2;i<=10;i++) {
			
			Graphics pagina=pdf.getGraphics();
			for(int j=0;j<=10;j++) {
				cuenta=i*j;
				pagina.drawString(i+"*"+j+"="+cuenta, 2, j*15);
			}pagina.dispose();
		}pdf.end();
	}catch(IOException error){
		System.out.println("error");
		}
	}
}
