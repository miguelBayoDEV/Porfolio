package Utilis;

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
	
	public static double leerNumeroDecimalDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static double leerNumeroDecimalDouble(String mensaje) {
		System.out.println(mensaje);
		return new Scanner(System.in).nextDouble();
	}
	
}
