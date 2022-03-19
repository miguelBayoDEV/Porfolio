import java.lang.*;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean repetir = true;
		while(repetir) {
			String pregunta = "¿Eres mayor de edad (si/no)? ";
			System.out.println(pregunta);
			String respuesta = s.nextLine();
			if(respuesta.equalsIgnoreCase("si")) {
				System.out.println("El usuario es mayor de edad.");
				repetir = false;
			}else if(respuesta.equalsIgnoreCase("no")) {
				System.out.println("El usuario es menor de edad.");
				repetir = false;
			}else {
				System.out.println("No te entiendo.");
			}
		}
	}

}
