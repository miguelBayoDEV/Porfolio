package tools;

public class ConversorArray {

	public static boolean comprobarArrayStringNullOrEmpty(String[] arrayString) {
		return (arrayString == null || arrayString.length == 0)? true : false;
	}
	
	public static int longitudString(String cadenaString) {
		return (cadenaString == null || cadenaString.isEmpty() || cadenaString.length() == 0)? 0 : cadenaString.length();
	}
	
	public static int[] conversorArrayStringToArrayIntLongitud(String[] arrayString) {
		int[] resultado = new int[arrayString.length];
		for(int i=0; i<arrayString.length; i++) {
			resultado[i] = ConversorArray.longitudString(arrayString[i]);
		}
		return resultado;
	}
	
}
