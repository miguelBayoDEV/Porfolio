import java.lang.*;
import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		// Crear programa que pregunte dos frases y que el segundo se incluya en el primero.
		System.out.println("Introduzca el texto 1: ");
		Scanner s1 = new Scanner(System.in);
		String frase1 = s1.nextLine();
		System.out.println("Introduzca el texto 2: ");
		Scanner s2 = new Scanner(System.in);
		String frase2 = s2.nextLine();
		int total1 = frase1.length();
		int total2 = frase2.length();
		int total1a = total1 - total2;
		String fraseCorta = frase1.substring(total1a,total1);
		boolean coincidir = frase2.equals(fraseCorta);
		System.out.println("¿El texto 2 está incluido en el texto 1? "+coincidir);
	}

}
