import java.lang.*;
import java.util.Scanner;
import java.net.*;
public class Ejercicio28 {
	public static void main(String[] args) {
		// Crear un programa que pregunte por nombre de la red y nos muestre su dirección IP.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un nombre de equipo: ");
		String nombre = s.nextLine();
		try {
			InetAddress host = InetAddress.getByName(nombre);
			String ip = host.getHostAddress();
			Thread.sleep(3000);
			System.out.println("La IP de "+nombre+" es: "+ip);
		}catch(UnknownHostException error) {
			System.out.println("Host desconocido.");
		}
	}
}
