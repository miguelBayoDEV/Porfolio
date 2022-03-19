import java.lang.*;
import java.util.*;
public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int segundos=1;
		System.out.println("Cuantos segundos quieres esperar");
		segundos= entrada.nextInt();
		long miliseg= segundos*1000;
		try{
			Thread.sleep(miliseg);
		}catch ( InterruptedException error) {
			System.out.println("El programa no rula");
		}
		System.out.println("El programa ha finalizado.");

	}

}
