package Factorial_Ejer17;

public class OperacionNumero {

	public static void factorial(int numero) {
		int factorial = 1;
		
		for(int i=1; i<=numero; i++) {
			factorial *= i;
		}
		
		System.out.println("Factorial número " + numero + " es: " + factorial);
	}
	
}
