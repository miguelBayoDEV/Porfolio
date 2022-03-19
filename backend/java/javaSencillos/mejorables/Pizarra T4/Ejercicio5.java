import java.lang.*;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Crear una contraseña y preguntarle por teclado al usuario diciendo si es correcta o no.
		String contraseña = "ASDF-678";
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca contraseña: ");
		String c = s.nextLine();
		if(c.equals(contraseña)) {
			System.out.println("Contraseña correcta.");
		}else {
			System.out.println("Contraseña incorrecta.");
		}
	}

}
