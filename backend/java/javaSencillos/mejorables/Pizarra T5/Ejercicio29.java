import java.lang.*;
import java.util.*;
public class Ejercicio29 {

	public static void main(String[] args) {
		
		//Opción a:
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número entero del 2 para delante: ");
		int nu = (int) s.nextInt(); //Le pongo el casting por si el usuario introduce un double para que no se convierta en conversión implícita.
		int n = Math.abs(nu);
		boolean repetir = true;
		for(int i=2;i<n&&repetir;i++) {
			if(n%i==0) {
				System.out.println("Número no es primo.");
				repetir = false;
			}
		}
		System.out.println("Es un número primo.");
	}

}
