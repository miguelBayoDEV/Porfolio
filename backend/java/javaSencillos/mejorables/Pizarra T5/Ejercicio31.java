import java.awt.Desktop;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.lang.*;
import gnu.jpdf.*;
public class Ejercicio31 {

	public static void main(String[] args) {
		
		PDFJob pdf = null;
		try {
			pdf = new PDFJob("Tablas de multiplicar del 1 al 10.pdf");
			for(int i=1;i<=10;i++) {

				Graphics g = pdf.getGraphics();
				for(int j=1;j<=10;j++) {
					g.drawString(i+" X "+j+" = "+(i*j), 0, 20*j);
				}
				g.dispose();
			}
			pdf.end();
		}catch(IOException error) {
			System.out.println(error.getMessage());
			
		}
			
		try {
			Desktop d = Desktop.getDesktop();
			File f = new File("Tablas de multiplicar del 1 al 10.pdf");
			d.open(f);
		}catch(IOException error) {
			System.out.println(error.getMessage());
		}
	}

}
