import java.lang.*;
import java.util.Scanner;
public class Ejercicio38 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Creo un objeto de la clase Scanner.
		System.out.println("Introduzca un n�mero (int)");
		int n = s.nextInt();
		String nb = Integer.toBinaryString(n);
		String nh = Integer.toHexString(n);
		System.out.println("N�mero convertido en binario: "+nb);
		System.out.println("N�mero convertido en hexadecimal: "+nh);
	}

}
