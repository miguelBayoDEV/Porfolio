import java.lang.*;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// Crear un programa que pregunte por teclado tu nombre, ponerlo en may�scula y min�scula y tambi�n decir n� caracteres.
		System.out.println("Escribe tu nombre: ");
		Scanner s = new Scanner(System.in);
		String nombre = s.nextLine();
		String may�scula = nombre.toUpperCase();
		System.out.println("Tu nombre en may�scula: "+may�scula);
		String min�scula = nombre.toLowerCase();
		System.out.println("Tu nombre en min�scula: "+min�scula);
		int n�meroCaracteres = nombre.length();
		System.out.println("Total de caracteres de tu nombre: "+n�meroCaracteres);
	}

}
