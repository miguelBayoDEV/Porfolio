import java.lang.*;
import java.util.Scanner;
import bpc.daw.objetos.*;
public class Ejercicio23 {

	public static void main(String[] args) {
		// Crear tarjeta de cr�dito, ingresar dinero y retirar dinero.
		TarjetaCredito tarjeta = new TarjetaCredito(1000,2222);
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca contrase�a para consultar trajeta de cr�dito: ");
		int contrase�a = s.nextInt();
		try {
			int saldo = tarjeta.getSaldo(contrase�a);
			System.out.println("El saldo de la tarjeta de cr�dito es: "+saldo+" euros.");
			System.out.println("Introduzca dinero a ingresar: ");
			int ingreso = s.nextInt();
			tarjeta.ingresarDinero(ingreso);
			saldo += ingreso;
			System.out.println("El ingreso es de: "+saldo+" euros.");
			System.out.println("Introduzca dinero a retirar: ");
			int retirar = s.nextInt();
			System.out.println("Introduzca contrase�a: ");
			contrase�a = s.nextInt();
			boolean sacar = tarjeta.sacarDinero(retirar,contrase�a);
			System.out.println("�Hay suficiente saldo en la tarjeta de cr�dito? "+sacar);
			System.out.println("Introduzca contrase�a para consultar trajeta de cr�dito: ");
			contrase�a = s.nextInt();
			saldo = tarjeta.getSaldo(contrase�a);
			System.out.println("El saldo de la tarjeta de cr�dito es: "+saldo+" euros.");
		}catch(java.lang.Exception error) {
			System.out.println("Contrase�a incorrecta.");
		}
	}

}
