import java.lang.*;
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] args) {
		//Preguntar un número aleatorio y mostrar si está el número comprendido en dicho rango.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		double n = s.nextDouble();
		int a = 10;
		int b = 56;
		if(n>=a && n<b) {
			System.out.println("El número está dentro del rango.");
		}else {
			System.out.println("El número está fuera del rango.");
		}
	}
}
