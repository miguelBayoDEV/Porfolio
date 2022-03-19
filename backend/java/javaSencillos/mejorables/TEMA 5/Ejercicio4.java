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
Seg�n el reglamento de la federaci�n de caza, un cazador no puede cazar m�s
piezas de las que se permiten en un d�a. Queremos hacer un programa que nos lleve la cuenta
de piezas cazadas e indique cuando se ha excedido el l�mite. Para ello primero se leer� por
teclado el l�mite del d�a y a continuaci�n los valores de las piezas cazadas en el orden que se
obtienen. El programa imprimir� un mensaje en el momento en que el l�mite haya sido
excedido. Despu�s de que cada pieza ha sido registrada, el programa mostrar� el n�mero total
de piezas que se llevan hasta ese momento cazadas. Ejemplo:
*/
