import java.lang.*;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Preguntar al usuario un número que debe ser positivo y muestre si lo es la reíz cuadrada y su neperiano y si no lo es un mensaje.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número (los decimales van con coma): ");
		double n = s.nextDouble();
		if(n>0) {
			double r = Math.sqrt(n); //Raíz cuadrada.
			System.out.println("La raíz cuadrada del número "+n+" es: "+r);
			double ne = Math.log(n); //Logaritmo neperiano.
			System.out.println("El logaritmo neperiano del número "+n+" es: "+ne);
		}else {
			System.out.println("El número introducido debe ser positivo.");
		}
	}

}
