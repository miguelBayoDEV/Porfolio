import java.lang.*;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// Preguntar cuantos segundos quiere esperar el usuario y monstrar un mensaje "Programa finalizado".
		Scanner s = new Scanner(System.in);
		System.out.println("¿Cuántos segundos quiere esperar? ");
		try {
			long seg = s.nextLong();
			// Un segundo son mil milisegundos.
			long ms = seg * 1000;
			Thread.sleep(ms);
			System.out.println("Programa finalizado.");
		}catch(InterruptedException error) {
			System.out.println("Interrupción.");
		}
	}

}
