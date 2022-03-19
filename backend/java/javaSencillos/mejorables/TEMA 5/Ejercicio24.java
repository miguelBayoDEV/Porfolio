package ejer24;
import java.util.Scanner;
public class Ejercicio242 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número entero");
		int numero = s.nextInt();
		
		
		
		for(int i=0;i<=10;i++) {
			int multiplicar = i*numero;
			System.out.println(numero+"x"+i+"="+multiplicar);
			
		}

	}

}
