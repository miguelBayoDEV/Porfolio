import java.lang.*;
import bpc.daw.objetos.*;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		// Crear tarjeta de cr�dito con contrase�a y saldo, quitarle dinero y monstrar informaci�n.
		TarjetaCredito tarjeta = new TarjetaCredito(5000,1111);
		System.out.println("Introduzca contrase�a: ");
		Scanner s = new Scanner(System.in);
		int contrase�a = s.nextInt();
		try {
			int saldo = tarjeta.getSaldo(contrase�a);
			System.out.println("El saldo de la tarjeta de cr�dito es: "+saldo+" euros.");
			System.out.println("Introduzca dinero que quiere sacar: ");
			int sacarDinero = s.nextInt();
			System.out.println("Introduzca contrase�a: ");
			contrase�a = s.nextInt();
			boolean sacar = tarjeta.sacarDinero(sacarDinero,contrase�a);
			System.out.println("�Est� todo correcto? "+sacar);
			saldo = tarjeta.getSaldo(contrase�a);
			System.out.println("El saldo de la tarjeta de cr�dito es: "+saldo+" euros.");
		}catch(java.lang.Exception error) {
			System.out.println("La contrase�a es incorrecta.");
		}
	}

}
