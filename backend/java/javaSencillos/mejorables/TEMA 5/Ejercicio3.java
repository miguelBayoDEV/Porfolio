package t5_e3;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Preguntamos al usuario "¿Eres mayor de edad (si/no)?".
		
		Scanner s = new Scanner (System.in);
		 
		boolean repetir = true;
		
		//Creamos la estructura iterativa
		
		while (repetir) {
			
			System.out.println("¿Eres mayor de edad (si/no)?");
			String respuesta = s.nextLine();
			
			//Si el usuario escribe "Si"
			
			if (respuesta.equalsIgnoreCase("si")) {
				System.out.println("El usuario es mayor de edad");
				repetir=false;
				
			// Si el usuario escribe "No"
				
			}else  if (respuesta.equalsIgnoreCase("no")){
				System.out.println("El usuario no es mayor de edad");
				repetir=false;
				
			// Si el usuario escribe cualquier otra cosa
				
			}else {
				
				System.out.println("No te entiendo");
			}

		}
	}

}
