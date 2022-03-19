package Ejercicios_adicionales;
import java.lang.*;
import java.io.*;
import bpc.daw.consola.*;
import java.awt.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		//Pregantar por teclado y generar un pdf.
		Consola c = new Consola();
		Teclado t = c.getTeclado();
		CapaTexto ct = c.getCapaTexto();
		ct.println("Nombre: ");
		String n = t.leerCadenaCaracteres();
		ct.println("Dirección: ");
		String d = t.leerCadenaCaracteres();
		ct.println("Teléfono: ");
		String tel = t.leerCadenaCaracteres();
		ct.println("Edad: ");
		String e = t.leerCadenaCaracteres();
		try {
			PrintWriter pw = new PrintWriter("datos.pdf");
			pw.println(n);
			pw.println(d);
			pw.println(tel);
			pw.println(e);
			pw.close();
			Desktop dt = Desktop.getDesktop();
			File f = new File("datos.pdf");
			dt.open(f);
		}catch(FileNotFoundException error) {
			ct.println(error.getMessage());
		}catch(IOException error) {
			ct.println("Error IO.");
		}
	}

}
