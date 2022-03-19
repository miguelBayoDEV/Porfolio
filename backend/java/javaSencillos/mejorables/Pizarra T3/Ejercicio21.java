import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		// Crear un programa que pregunte al usuario la ruta del archivo y dirá los bytes y megabytes que ocupa en disco duro.
		System.out.println("Introduzca la ruta del archivo: ");
		Scanner s = new Scanner(System.in);
		String ruta = s.nextLine();
		File f = new File(ruta);
		long tamañoBytes = f.length();
		System.out.println("El tamaño en bytes del archivo en el disco duro es: "+tamañoBytes);
		// Un byte son 1024 kilobytes y 1 kilobytes son 1024 megabytes.
		double tamañoMegabytes = (tamañoBytes*1.0) / (1024 * 1024);
		System.out.println("El tamaño en megabytes del archivo en el disco duro es: "+tamañoMegabytes);
	}

}
