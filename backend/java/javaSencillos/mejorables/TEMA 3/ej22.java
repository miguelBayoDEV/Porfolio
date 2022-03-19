package ej22;
import bpc.daw.objetos.*;
public class ej22 {

	public static void main(String[] args) {

		//Se crea una tarjeta de cr�dito con contrase�a 1111 y saldo 5000
		TarjetaCredito tarjeta = new TarjetaCredito(5000, 1111);
		
		//Se muestra por pantalla la informaci�n de la cuenta
		try{
			int saldo = tarjeta.getSaldo(1111);
			System.out.println("El saldo de la tarjeta es "+saldo);
		}catch (java.lang.Exception error){
			System.out.println("Excepci�n producida por contrase�a err�nea al consultar el saldo de la tarjeta");
		}
		
		//Se sacan 2000 y se muestra por pantalla
		try {
			boolean sacar = tarjeta.sacarDinero(2000, 1111);
			int saldo = tarjeta.getSaldo(1111);
			System.out.println("El saldo actual de la tarjeta es "+saldo);
		}catch (java.lang.Exception error){
			System.out.println("Excepci�n producida por contrase�a err�nea al sacar dinero");
		}
		
	}

}
