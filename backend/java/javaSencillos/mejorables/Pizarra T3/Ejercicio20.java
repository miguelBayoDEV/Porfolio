import java.lang.*;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// Preguntar al usuario el correo por teclado y descomponerlo en nombre+"@"dominio.
		System.out.println("¿Cuál es tu correo electrónico? ");
		Scanner s = new Scanner(System.in);
		String correo = s.nextLine();
		String arroba = "@";
		int total = correo.length();
		int a = correo.indexOf(arroba);
		int b = correo.lastIndexOf(arroba);
		int posición_cero = total-total;
		b++;
		String nombre = correo.substring(posición_cero, a);
		String dominio = correo.substring(b, total);
		System.out.println("Tu nombre de usuario es: "+nombre);
		System.out.println("Tu dominio es: "+dominio);
	}

}
