import java.lang.*;
import java.util.Scanner;
import bpc.daw.objetos.*;
public class Ejercicio23 {

	public static void main(String[] args) {
		// Crear tarjeta de crédito, ingresar dinero y retirar dinero.
		TarjetaCredito tarjeta = new TarjetaCredito(1000,2222);
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca contraseña para consultar trajeta de crédito: ");
		int contraseña = s.nextInt();
		try {
			int saldo = tarjeta.getSaldo(contraseña);
			System.out.println("El saldo de la tarjeta de crédito es: "+saldo+" euros.");
			System.out.println("Introduzca dinero a ingresar: ");
			int ingreso = s.nextInt();
			tarjeta.ingresarDinero(ingreso);
			saldo += ingreso;
			System.out.println("El ingreso es de: "+saldo+" euros.");
			System.out.println("Introduzca dinero a retirar: ");
			int retirar = s.nextInt();
			System.out.println("Introduzca contraseña: ");
			contraseña = s.nextInt();
			boolean sacar = tarjeta.sacarDinero(retirar,contraseña);
			System.out.println("¿Hay suficiente saldo en la tarjeta de crédito? "+sacar);
			System.out.println("Introduzca contraseña para consultar trajeta de crédito: ");
			contraseña = s.nextInt();
			saldo = tarjeta.getSaldo(contraseña);
			System.out.println("El saldo de la tarjeta de crédito es: "+saldo+" euros.");
		}catch(java.lang.Exception error) {
			System.out.println("Contraseña incorrecta.");
		}
	}

}
