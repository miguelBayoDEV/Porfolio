package Ejercicio_20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// Realiza un programa que reciba números enteros por la línea de comandos 
		
		int nArg = args.length;
		
		//Suma todos. Si algún argumento no es un número, el programa lo ignorará y no lo sumará.
		
		int numero=0;
		int suma = 0;
		
		for (int i = 0; i<nArg;i++)
			
		try {
			
			numero = Integer.parseInt(args [i]);
			suma +=numero;
			System.out.println("Es el numero : "+numero);
			
		}catch (NumberFormatException error) {
			
			System.out.println("No es un numero es la palabra: "+args [i]);
		}
		
		System.out.println("La suma de los numero es: "+suma);

	}

}
