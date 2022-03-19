package Ejercicio7_alternativo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7Aleatorio {

	public static void main(String[] args) {
		
		//"Escriba una frase" 
		
				Scanner s = new Scanner (System.in);
				System.out.println("Escribe una frase");
				String cadena = s.nextLine();
				
				//y nos muestre en una línea diferente cada palabra de la frase 
				
				boolean repetir = true;
				 
				//Cuando llegamos al espacio, se crea una nueva longitud, excluyendo a la palabra
				//que ya se ha imprimido
				
				int longitud =cadena.length();
				
				while (repetir) {
					
					String espacio = " ";
					int posEspacio = cadena.indexOf(espacio);
					
				//Si no encuentra el espacio, se devuelve -1 y termina el programa
					
					if (posEspacio == -1){
						repetir=false;
						System.out.println(cadena);
						System.out.println("Programa terminado");
					}else {
						
					String palabra=cadena.substring(0, posEspacio);
					System.out.println(palabra);
					
					longitud =cadena.length();
				    cadena = cadena.substring(posEspacio+1,longitud);
				    
					}
					
			}
				
	}

}
