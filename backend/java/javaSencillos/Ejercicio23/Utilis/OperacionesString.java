package Utilis;

public class OperacionesString {

	public static String puntoFinalString(String cadena) {
		cadena = cadena.substring(0, cadena.length() - 2);
		cadena += ".";
		return cadena;
	}
	
}
