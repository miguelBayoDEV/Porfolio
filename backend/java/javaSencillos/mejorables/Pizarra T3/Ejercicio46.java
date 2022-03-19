import java.lang.*;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
public class Ejercicio46 {

	public static void main(String[] args) {
		// Crear un programa que pregunte la ruta del archivo y lo abrirá con un programa.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca ruta del archivo: ");
		String ruta = s.nextLine();
		File f = new File(ruta);
		Desktop d = Desktop.getDesktop();
		try {
			d.open(f);
		}catch(IOException error) {
			System.out.println("No se puede abrir el archivo.");
		}
	}

}
