package Tema5Ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas piezas se pueden cazar hoy");
		int tope = sc.nextInt();
		boolean repetir = true;
		int cazadas = 0;
		while(repetir) {
			System.out.println("Introduzca el numero de piezas cazadas");
			cazadas += sc.nextInt();
			System.out.println("Usted lleva cazadas "+cazadas+" de "+tope);
			if(cazadas>=tope) {
				repetir = false;
				System.out.println("El numero maximo de piezas a sido excedido");
				sc.nextLine();
			}
		}

		
		
	}

}
/*
Según el reglamento de la federación de caza, un cazador no puede cazar más
piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta
de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por
teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se
obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido
excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total
de piezas que se llevan hasta ese momento cazadas. Ejemplo:
*/
