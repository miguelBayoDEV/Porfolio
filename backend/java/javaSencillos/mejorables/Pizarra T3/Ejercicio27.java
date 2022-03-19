import java.lang.*;
import java.util.Scanner;
import java.net.*;
import java.io.*;
public class Ejercicio27 {

	public static void main(String[] args) {
		// Programa que pregunte al usuario la dirección de IP y timeout; el ordenador indicará si puede hacerse ping a la IP esperando el timeout.
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba una dirección IP: ");
		String ip = s.nextLine();
		System.out.println("Escriba el tiempo de timeout (en milisegundos): ");
		try {
			long time = s.nextLong();
			Thread.sleep(time);
			int timeout = (int) time;
			InetAddress ping = InetAddress.getByName(ip);
			boolean proceso = ping.isReachable(timeout);
			System.out.println("Haciendo ping a "+ip+"... "+proceso);
		}catch(UnknownHostException error) {
			System.out.println("Host desconocido.");
		}catch(IOException error) {
			System.out.println("Error de IO.");
		}
	}

}
