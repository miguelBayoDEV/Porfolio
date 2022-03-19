package ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe pesetas: ");
		double pesetas = teclado.nextDouble();
		double valorP = 166.386;
		
		if (pesetas>0) {
			double cuenta = pesetas/valorP; 
			System.out.println(cuenta+" €");
			
		}
		
	}
}
