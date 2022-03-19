import java.util.Scanner;
import java.net.*;

public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una direcion IP");
		String ip = sc.nextLine();
		System.out.println("Dime un timeout");
		int tiempo = sc.nextInt();
		try {
			
			InetAddress equipo=InetAddress.getByName(ip);
			System.out.println("Haciendo ping a "+ip+"...");
			boolean posible_ping=equipo.isReachable(tiempo);
			

			System.out.println(posible_ping);
			
		}catch(Exception e){
			System.out.println("UnknownHostException ");
		}

	}

}
/*Consulta el pdf de la librer�a �java net� y busca la clase InetAddress. 
 * Realiza un programa que pregunte por teclado al usuario una direcci�n IP y un n�mero llamado timeout.
 *  El ordenador nos indicar� si puede hacer ping a la IP indicada, esperando el tiempo que dice
 *  la variable timeout. */
 