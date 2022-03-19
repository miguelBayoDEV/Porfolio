import java.lang.*;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// Crear un programa que pregunte por teclado tu nombre, ponerlo en mayúscula y minúscula y también decir nº caracteres.
		System.out.println("Escribe tu nombre: ");
		Scanner s = new Scanner(System.in);
		String nombre = s.nextLine();
		String mayúscula = nombre.toUpperCase();
		System.out.println("Tu nombre en mayúscula: "+mayúscula);
		String minúscula = nombre.toLowerCase();
		System.out.println("Tu nombre en minúscula: "+minúscula);
		int númeroCaracteres = nombre.length();
		System.out.println("Total de caracteres de tu nombre: "+númeroCaracteres);
	}

}
