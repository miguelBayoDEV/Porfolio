import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Ejercicio24 {

	public static void main(String[] args) {
		// Preguntar dos frases por teclado al usuario y crear un archivo con esas dos frases.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca primera frase: ");
		String frase1 = s.nextLine();
		System.out.println("Introduzca segunda frase: ");
		String frase2 = s.nextLine();
		try {
			PrintWriter archivo = new PrintWriter("d:/frases.txt");
			archivo.println(frase1);
			archivo.println(frase2);
			archivo.close();
		}catch(FileNotFoundException error) {
			System.out.println("Archivo no encontrado.");
		}
		
	}

}
