package Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//  Realiza un programa que pregunte un número comprendido entre 10 y 56
		
		System.out.println("Introduce un número entre 10 y 56");
		
		Scanner s = new Scanner (System.in);
		int numero = s.nextInt();
		
		//Si el número está en dicho rango,mostrará un mensaje de que es correcto 
		
		if (numero>=10 && numero<=56) {
			
			System.out.println("El número es correcto");
			
		//en caso contrario, se indicará que no lo es.
			
		}else {
			
			System.out.println("El número NO es correcto");
		}

	}

}