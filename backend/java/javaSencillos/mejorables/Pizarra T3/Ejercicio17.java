import java.lang.*;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		// Comparar si la contrase�a que introduces coincide con la clave.
		String c = "01234567";
		int clave = Integer.parseInt(c);
		System.out.println("Escribir la contrase�a: ");
		Scanner s = new Scanner(System.in);
		String con = s.nextLine();
		// He tenido que hacer la contrase�a solo con n�meros porque == (signo de coincidencia) a veces no va con String.
		int contrase�a = Integer.parseInt(con);
		boolean coincidencia = (contrase�a == clave);
		System.out.println("�La variable "+clave+" coincide con la variable "+contrase�a+"? "+coincidencia);
	}
}
