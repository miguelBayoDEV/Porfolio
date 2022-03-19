import java.lang.*;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Pregunta un String y número mostrando el carácter de la longitud del String.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un texto: ");
		String t = s.nextLine();
		int l = t.length()-1;
		System.out.println("Introduzca un número sin decimales: ");
		int n = s.nextInt();
		if(n>=0 && n<l) {
			char c = t.charAt(n);
			System.out.println("El carácter según el número introducido será: "+c);
		}else {
			System.out.println("Debe introducir un número entre 0 y "+l+".");
		}
	}

}
