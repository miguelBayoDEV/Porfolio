import java.util.Scanner;

import bpc.daw.objetos.*;

public class Ejercicio23 {

	public static void main(String[] args) {
		
			int contraseña = 2222;
			int dinero = 1000;
			
			System.out.println("Introduzca su contraseña");
			//PEDIMOS CONTRASEÑA POR TECLADO
			Scanner s = new Scanner (System.in);
			String contraseñaTeclado = s.nextLine();
			int contraseñaTeclado2 = Integer.parseInt(contraseñaTeclado);
			//CREAMOS LA TARJETA
			
			TarjetaCredito tarjeta = new TarjetaCredito (dinero,contraseñaTeclado2);
			//ES NECESARIO CREAR UN TRY PARA COMPROBAR QUE LA CONTRASEÑA SEA LA MISMA
			
			try {
				int saldo = tarjeta.getSaldo(contraseña);
				System.out.println("Tiene en su cuenta "+ saldo+"€");
				System.out.println("Va a ingresar 100€");
				
				tarjeta.ingresarDinero(100);
				int saldo2= tarjeta.getSaldo(contraseña);
				System.out.println("Su saldo es ahora de "+ saldo2 + "€");
				
				System.out.println("Quiere retirar 2800€");
				boolean retirada = tarjeta.sacarDinero(2800, contraseña);
				int saldo3=tarjeta.getSaldo(contraseña);
				System.out.println("¿Puede retirar ese dinero de la cuenta?"+retirada);
				System.out.println("Su saldo es ahora de "+ saldo3 +"€");
				
			}catch (java.lang.Exception error) {
				System.out.println("Contraseña Incorrecta");
			}
					
	}
}
