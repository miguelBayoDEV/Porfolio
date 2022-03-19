import java.lang.*;
import java.util.Scanner;
public class Ejercicio19 {

	public static void main(String[] args) {
		// Crear un programa que pregunte el nombre y el dominio y cree una variable correo.
		System.out.println("¿Cuál es tu nombre? ");
		Scanner s1 = new Scanner(System.in);
		String nombre = s1.nextLine();
		System.out.println("¿Cuál es tu dominio? ");
		Scanner s2 = new Scanner(System.in);
		String dominio = s2.nextLine();
		String correo = nombre+dominio;
		System.out.println("Tu correo es: "+correo);
	}

}
