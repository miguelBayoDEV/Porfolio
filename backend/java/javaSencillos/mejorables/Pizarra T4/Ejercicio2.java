import java.lang.*;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		//Preguntar al usuario por teclado cantidad de petetas para convertir en euros.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca una cantidad en pesetas (los decimales con coma): ");
		double p = s.nextDouble();
		if(p>0) {
			double resultado = (p*1.0)/166.386;
			System.out.println("La cantidad en pesetas "+p+" son: "+resultado+" euros.");
		}
	}

}
