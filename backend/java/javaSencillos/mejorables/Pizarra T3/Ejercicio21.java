import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class Ejercicio21 {

	public static void main(String[] args) {
		// Crear un programa que pregunte al usuario la ruta del archivo y dir� los bytes y megabytes que ocupa en disco duro.
		System.out.println("Introduzca la ruta del archivo: ");
		Scanner s = new Scanner(System.in);
		String ruta = s.nextLine();
		File f = new File(ruta);
		long tama�oBytes = f.length();
		System.out.println("El tama�o en bytes del archivo en el disco duro es: "+tama�oBytes);
		// Un byte son 1024 kilobytes y 1 kilobytes son 1024 megabytes.
		double tama�oMegabytes = (tama�oBytes*1.0) / (1024 * 1024);
		System.out.println("El tama�o en megabytes del archivo en el disco duro es: "+tama�oMegabytes);
	}

}
