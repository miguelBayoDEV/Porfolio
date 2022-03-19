import java.lang.*;
import java.util.*;
public class Ejercicio28 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int nu = s.nextInt();
		int n = Math.abs(nu);
		System.out.println("Los divisores de "+n+" son: ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
