import java.lang.*;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		//Preguntar un n�mero aleatorio y mostrar si est� el n�mero comprendido en dicho rango.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un n�mero: ");
		double n = s.nextDouble();
		int a = 10;
		int b = 56;
		if(n>=a && n<b) {
			System.out.println("El n�mero est� dentro del rango.");
		}else {
			System.out.println("El n�mero est� fuera del rango.");
		}
	}
}
