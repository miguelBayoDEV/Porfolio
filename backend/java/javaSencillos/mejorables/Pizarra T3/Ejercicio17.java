import java.lang.*;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		// Comparar si la contraseña que introduces coincide con la clave.
		String c = "01234567";
		int clave = Integer.parseInt(c);
		System.out.println("Escribir la contraseña: ");
		Scanner s = new Scanner(System.in);
		String con = s.nextLine();
		// He tenido que hacer la contraseña solo con números porque == (signo de coincidencia) a veces no va con String.
		int contraseña = Integer.parseInt(con);
		boolean coincidencia = (contraseña == clave);
		System.out.println("¿La variable "+clave+" coincide con la variable "+contraseña+"? "+coincidencia);
	}
}
