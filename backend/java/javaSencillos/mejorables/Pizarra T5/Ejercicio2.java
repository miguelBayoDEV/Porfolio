import java.lang.*;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("Números enteros aleatorios: ");
		boolean repetir = true;
		while(repetir) {
			int n = r.nextInt(11);
			System.out.println(n);
			if(n==10) {
				repetir = false;
			}
		}
	}

}
