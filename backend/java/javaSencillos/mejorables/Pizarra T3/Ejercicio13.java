import java.lang.*;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// Crear un escáner que pregunte tu nombre y mostrar un texto con tu nombre.
		System.out.println("Escribe tu nombre por teclado: ");
		Scanner s = new Scanner(System.in);
		String devuelve = s.nextLine();
		System.out.println("Bienvenido al instituto, "+devuelve+".");
	}

}
