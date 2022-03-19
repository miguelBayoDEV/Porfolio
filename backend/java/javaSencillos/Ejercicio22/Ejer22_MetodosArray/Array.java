package Ejer22_MetodosArray;

import Utilis.OperacionesScanner;

public class Array {

	public static void imprimirArrayInt(int[] arrayInt) {
		String cadenaResultado = "[";
		for(int item: arrayInt) {
			cadenaResultado += item + ", ";
		}
		cadenaResultado = cadenaResultado.substring(0, cadenaResultado.length() - 2);
		cadenaResultado += "]";
		System.out.println("Array imprimido: " + cadenaResultado);
	}
	
	public static int[] crearArrays() {
		int sizeArray = OperacionesScanner.leerNumeroEnteroInt("Introduzca tamaño del array: ");
		return rellenarArray(new int[sizeArray]);
	}
	
	public static int[] crearArrays(int sizeArray) {
		return rellenarArray(new int[sizeArray]);
	}
	
	public static int[] rellenarArray(int[] arrayInt) {
		for(int i=0; i<arrayInt.length; i++) {
			arrayInt[i] = OperacionesScanner.leerNumeroEnteroInt("Introduzca número entero: ");
		}
		return arrayInt;
	}
	
	public static int sumaIntArray(int[] arrayInt) {
		int suma = 0;
		for(int item: arrayInt) {
			suma += item;
		}
		return suma;
	}
	
	public static int[] arrayInvertido(int[] arrayInt) {
		int[] nuevoArray = new int[arrayInt.length];
		int contador = 0;
		for(int i=arrayInt.length - 1; i >= 0; i--) {
			nuevoArray[contador++] = arrayInt[i];
		}
		return nuevoArray;
	}
	
}
