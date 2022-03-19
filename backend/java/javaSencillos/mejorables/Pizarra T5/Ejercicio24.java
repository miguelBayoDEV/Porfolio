import java.lang.*;
import java.util.*;
public class Ejercicio24 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("Introduzca un número: ");
			n = s.nextInt();
		}catch(NumberFormatException error) {
			System.out.println("Número introducido incorrecto.");
		}
		for(int i=0;i<=10;i++) {
			int r = n*i;
			System.out.println(n+" X "+i+" = "+r);
		}
	}

}
