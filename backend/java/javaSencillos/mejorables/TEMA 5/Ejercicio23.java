/*Ejercicio 23: Realiza un programa en el que haya una variable 
 llamada "contrase�a" iniciada con el valor que t� quieras. 
 A continuaci�n el programa pedir� al usuario que introduzca la 
 contrase�a. El usuario solo tiene 5 intentos para ponerla bien.
 En caso de que el usuario la acierte, el programa dir� 
 "Acceso permitido". Si se agotan los intentos, se mostrar� 
 "Acceso denegado". En todo momento el programa mostrar� el 
 n�mero de intentos restantes.*/
package Ejercicio23;
import java.util.*;
public class Ejercicio23 {

	public static void main(String[] args) {
		// Declaracion de variables:
		Scanner teclado = new Scanner(System.in);
		String contrase�a="hlanz";
		String leida="";
		int intentos=5;
		boolean seguir=true;
		boolean correcta=false;
		
		while(seguir) {
			System.out.println("Introduzca la contrase�a (Intentos: "+intentos+"):");
			leida=teclado.nextLine();
			intentos--;
			
			if(leida.equalsIgnoreCase(contrase�a)) {
				seguir=false;
				correcta=true;
			}else {
				System.out.println("Error.");
			} 
				
			if(intentos==0) {
				seguir=false;
			}
		}
		
		if(correcta) {
			System.out.println("Contrase�a correcta. Acceso Permitido.");
		}else {
			System.out.println("Acceso restringido.");
		}
	}

}
