import java.lang.*;
import bpc.daw.objetos.*;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		// Crear tarjeta de crédito con contraseña y saldo, quitarle dinero y monstrar información.
		TarjetaCredito tarjeta = new TarjetaCredito(5000,1111);
		System.out.println("Introduzca contraseña: ");
		Scanner s = new Scanner(System.in);
		int contraseña = s.nextInt();
		try {
			int saldo = tarjeta.getSaldo(contraseña);
			System.out.println("El saldo de la tarjeta de crédito es: "+saldo+" euros.");
			System.out.println("Introduzca dinero que quiere sacar: ");
			int sacarDinero = s.nextInt();
			System.out.println("Introduzca contraseña: ");
			contraseña = s.nextInt();
			boolean sacar = tarjeta.sacarDinero(sacarDinero,contraseña);
			System.out.println("¿Está todo correcto? "+sacar);
			saldo = tarjeta.getSaldo(contraseña);
			System.out.println("El saldo de la tarjeta de crédito es: "+saldo+" euros.");
		}catch(java.lang.Exception error) {
			System.out.println("La contraseña es incorrecta.");
		}
	}

}
