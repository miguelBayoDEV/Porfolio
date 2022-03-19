package Utilis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesScanner {

	public static String leerDato() {
		return new Scanner(System.in).nextLine();
	}
	
	public static String leerDato(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextLine();
	}
	
	public static int leerNumeroEnteroInt() {
		return new Scanner(System.in).nextInt();
	}
	
	public static int leerNumeroEnteroInt(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextInt();
	}
	
	public static List<Integer> peticionNumerosHastaPoner0() {
		List<Integer> listaNumeros = new ArrayList<>();
		int numero;
		 do {
			numero = leerNumeroEnteroInt("Introduzca número entero:");
			if(numero != 0) {
				listaNumeros.add(numero);
			}
		} while(numero != 0);
		return listaNumeros;
	}
	
	public static int[] peticionNumerosDivision() {
		int[] resultado = new int[2];
		resultado[0] = leerNumeroEnteroInt("Introduzca numerador: ");
		resultado[1] = leerNumeroEnteroInt("Introduzca denominador: ");
		return resultado;
	}
	
	public static double leerNumeroDecimalDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double leerNumeroDecimalDouble(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}
	
}
