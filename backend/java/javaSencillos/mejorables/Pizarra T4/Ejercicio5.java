import java.lang.*;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		//Crear una contrase�a y preguntarle por teclado al usuario diciendo si es correcta o no.
		String contrase�a = "ASDF-678";
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca contrase�a: ");
		String c = s.nextLine();
		if(c.equals(contrase�a)) {
			System.out.println("Contrase�a correcta.");
		}else {
			System.out.println("Contrase�a incorrecta.");
		}
	}

}
