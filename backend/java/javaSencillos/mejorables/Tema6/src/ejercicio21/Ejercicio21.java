package ejercicio21;

import java.util.*;

/*
*Haz un programa que pregunte al usuario un número N y a continuación, 
*le pida que introduzca por teclado N palabras. 
*Al terminar, el programa mostrará todas las palabras introducidas 
*con el siguiente formato: {palabra 1, palabra 2, palabra 3, palabra 4}.
*/

public class Ejercicio21 {

	public static void main(String[] args) {
		System.out.println("Dime un número");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		String[] palabras = new String[n];
		System.out.println("Introduce por teclado "+n+" palabras");
		for (int i = 0;i<n;i++) {
			palabras[i]= new Scanner(System.in).nextLine();
		}
		System.out.print("{");
		for (int i = 0;i<n;i++) {
			if(i!=palabras.length-1) {
				System.out.print(palabras[i]+", ");
				}else {
					System.out.print(palabras[i]);
				}
		}
		System.out.print("}");
	}

}
