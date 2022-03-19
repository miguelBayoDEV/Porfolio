import java.awt.Graphics;
import java.io.IOException;
import bpc.daw.consola.*;
import gnu.jpdf.*;
public class ej8dificil {

	public static void main(String[] args) {
		Consola c=new Consola("Hola",1000,1000);
		CapaTexto tx=c.getCapaTexto();
		Teclado te=c.getTeclado();
		try {
			PDFJob pdf=new PDFJob("C:/texto/hola.pdf");
			Graphics letra=pdf.getGraphics();
			tx.print(4,0,"Introduce tu Nombre: ");
			String uno=te.leerCadenaCaracteres();
			letra.drawString(uno,10,10);
			tx.print("Introduce tu Dirección: ");
			String dos=te.leerCadenaCaracteres();
			letra.drawString(dos,10,30);
			tx.print("Introduce tu Telefono: ");
			String tres=te.leerCadenaCaracteres();
			letra.drawString(tres,10,50);
			tx.print("Introduce tu Edad: ");
			String cuatro=te.leerCadenaCaracteres();
			letra.drawString(cuatro,10,70);
			letra.dispose();
			pdf.end();
		}catch(IOException error){
			System.out.print("Introduce una ruta valida");
		}
	}

}
