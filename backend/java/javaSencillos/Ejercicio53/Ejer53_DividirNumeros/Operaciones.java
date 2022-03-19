package Ejer53_DividirNumeros;

import Utilis.OperacionesScanner;

public class Operaciones {

	public static void dividir() {
		int[] numeros = OperacionesScanner.peticionNumerosDivision();

		try {
			double division = numeros[0] / numeros[1];
			System.out.println("Resultado de la división " + numeros[0] + " / " + numeros[1] + " es: " + division);
		}catch(ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}
