import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio25 {

	public static void main(String[] args) {
		// Abrir archivo creado anteriormente y monstrar sus dos frases.
		try {
			File archivo = new File("d:/frases.txt");
			Scanner s = new Scanner(archivo);
			String f1 = s.nextLine();
			System.out.println("Primera frase del archivo: "+f1);
			String f2 = s.nextLine();
			System.out.println("Segunda frase del archivo: "+f2);
		}catch(FileNotFoundException error) {
			System.out.println("Archivo no encontrado.");
		}
	}

}
