package tools;

public class Palindromo {

	public static boolean isPalindromo(String palabra) {
		boolean resultado = false;
		palabra = palabra.toLowerCase();
		String palabraInvertida = Palindromo.invertirPalabra(palabra);
		
		if(palabra.length() == palabraInvertida.length()) {
			if(palabra.equals(palabraInvertida)) {
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	public static String invertirPalabra(String palabra) {
		String palabraInvertida = "";
		palabra = palabra.toLowerCase();
		
		for(int i=palabra.length()-1; i>=0; i--) {
			palabraInvertida += palabra.charAt(i);
		}
		
		return palabraInvertida;
	}
	
}
