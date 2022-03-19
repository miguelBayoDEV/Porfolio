/*Ejercicio 23: Realiza un programa en el que haya una variable 
 llamada "contraseña" iniciada con el valor que tú quieras. 
 A continuación el programa pedirá al usuario que introduzca la 
 contraseña. El usuario solo tiene 5 intentos para ponerla bien.
 En caso de que el usuario la acierte, el programa dirá 
 "Acceso permitido". Si se agotan los intentos, se mostrará 
 "Acceso denegado". En todo momento el programa mostrará el 
 número de intentos restantes.*/
package Ejercicio23;
import java.util.*;
public class Ejercicio23 {

	public static void main(String[] args) {
		// Declaracion de variables:
		Scanner teclado = new Scanner(System.in);
		String contraseña="hlanz";
		String leida="";
		int intentos=5;
		boolean seguir=true;
		boolean correcta=false;
		
		while(seguir) {
			System.out.println("Introduzca la contraseña (Intentos: "+intentos+"):");
			leida=teclado.nextLine();
			intentos--;
			
			if(leida.equalsIgnoreCase(contraseña)) {
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
			System.out.println("Contraseña correcta. Acceso Permitido.");
		}else {
			System.out.println("Acceso restringido.");
		}
	}

}
