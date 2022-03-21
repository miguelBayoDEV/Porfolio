package control;

import tools.OperacionesScanner;
import tools.Palindromo;

public class Test {

	public static void test() {
		String palabra = OperacionesScanner.leerDato("Introduzca palabra:");
		String palabraPalindromo = palabra;
		if(Palindromo.isPalindromo(palabraPalindromo)) {
			System.out.println("Palabra " + palabraPalindromo + " es palíndromo porque su palabra invertida es: " + Palindromo.invertirPalabra(palabraPalindromo));
		}else {
			System.out.println("Palabra " + palabraPalindromo + " no es palíndromo porque su palabra invertida es: " + Palindromo.invertirPalabra(palabraPalindromo));
		}
	}
}
