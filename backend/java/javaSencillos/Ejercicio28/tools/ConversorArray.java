package tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
	
	
	// Ejercicio 28
	public static String[] conversorArrayToArrayOrdenado(String[] arrayString) {
		List<String> arrayOrdenado = conversorArrayToListCollection(arrayString);
		Collections.sort(arrayOrdenado);
		String[] resultado = new String[arrayOrdenado.size()-1];
		resultado = arrayOrdenado.toArray(resultado);
		return resultado;
	}
	
	public static List<String> conversorArrayToListCollection(String[] arrayString) {
		List<String> lista = new ArrayList<>();
		
		for(String item: arrayString) {
			lista.add(item);
		}
		
		return lista;
	}
	
	public static void imprimirArray(String[] arrayString) {
		String resultado = "Resultado: ";
		for(int i=0; i<arrayString.length; i++) {
			if(i == arrayString.length-1) {
				resultado += arrayString[i] + ".";
			}else {
				resultado += arrayString[i] + ", ";
			}
		}
		System.out.println(resultado);
	}
	
}
