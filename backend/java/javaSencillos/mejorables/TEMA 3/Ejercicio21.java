import java.io.File;
import java.util.Scanner;

/* Consulta el pdf de la librería “java io” y encuentra la clase File. 
 Realiza un programa que pregunte al usuario la ruta de un archivo. 
 El programa deberá decir cuántos bytes y cuántos megabytes ocupa en el disco duro.*/


public class Ejercicio21 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		
		String ruta = " ";
		double megabytes=0;
		long bytes = 0;
		
		
		System.out.println("Introduzca la ruta del archivo: ");
		ruta=teclado.nextLine();
		
		File archivo = new File(ruta);
		bytes=archivo.length();
		megabytes=bytes*1.0/(1024*1024);
		
		System.out.println("El archivo "+ruta+" tiene "+megabytes+"MB = "+bytes+"Bytes");
		
	}
}