import java.lang.*;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		//Pregunta un String y n�mero mostrando el car�cter de la longitud del String.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un texto: ");
		String t = s.nextLine();
		int l = t.length()-1;
		System.out.println("Introduzca un n�mero sin decimales: ");
		int n = s.nextInt();
		if(n>=0 && n<l) {
			char c = t.charAt(n);
			System.out.println("El car�cter seg�n el n�mero introducido ser�: "+c);
		}else {
			System.out.println("Debe introducir un n�mero entre 0 y "+l+".");
		}
	}

}
