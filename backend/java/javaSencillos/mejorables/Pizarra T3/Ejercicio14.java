import java.lang.*;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// Crear un programa que te pregunte tu edad por teclado y diga si eres mayor de edad.
		System.out.println("Escribe tu edad: ");
		Scanner s = new Scanner(System.in);
		String teclado = s.nextLine();
		int edad = Integer.parseInt(teclado);
		boolean resultado = edad>=18;
		System.out.println("¿Eres mayor de edad? "+resultado);
	}

}
