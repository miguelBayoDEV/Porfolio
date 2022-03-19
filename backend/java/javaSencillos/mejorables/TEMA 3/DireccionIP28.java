import java.net.*;
import java.util.*;
import java.io.*;
public class DireccionIP28 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un nombre de equipo:");
		Scanner e = new Scanner(System.in); //Introducimos el nombre del equipo
		String equipo = e.nextLine(); //Recojo la respuesta
		try {
			InetAddress IP = InetAddress.getByName(equipo); //Obtenemos un objeto que represente al equipo introducido
			String direccionIP = IP.getHostAddress(); // Nos devuelve la dirección IP
			System.out.println("La IP de "+equipo+ " es: "+direccionIP);
		} catch (UnknownHostException error) {
			System.out.println("No se puede obtener la dirección IP");
		}
	}

}
