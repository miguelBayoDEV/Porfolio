import java.lang.*;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		//Preguntar al usuario un n�mero que debe ser positivo y muestre si lo es la re�z cuadrada y su neperiano y si no lo es un mensaje.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un n�mero (los decimales van con coma): ");
		double n = s.nextDouble();
		if(n>0) {
			double r = Math.sqrt(n); //Ra�z cuadrada.
			System.out.println("La ra�z cuadrada del n�mero "+n+" es: "+r);
			double ne = Math.log(n); //Logaritmo neperiano.
			System.out.println("El logaritmo neperiano del n�mero "+n+" es: "+ne);
		}else {
			System.out.println("El n�mero introducido debe ser positivo.");
		}
	}

}
