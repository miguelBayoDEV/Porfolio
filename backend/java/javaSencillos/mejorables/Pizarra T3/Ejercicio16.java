import java.lang.*;
import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// Crear programa que pregunte una frase y se muestre la letra de la mitad de la frase.
		System.out.println("Introduzca la frase: ");
		Scanner s = new Scanner(System.in);
		String frase = s.nextLine();
		int total = frase.length();
		int mitad = total/2;
		char carácter = frase.charAt(mitad);
		System.out.println("El carácter de la mitad de la frase "+frase+" es: "+carácter);
	}

}
