import java.lang.*;
import java.util.*;
public class Ejercicio29_1 {

	public static void main(String[] args) {
		
		//Opción b:
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un número entero: ");
		int nu = (int) s.nextInt(); //Le pongo el casting por si el usuario introduce un double para que no se convierta en conversión implícita.
		int n = Math.abs(nu);
		int n_divisores =  0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				n_divisores++;
			}
		}
		if(n_divisores==0) {
			System.out.println("Número es primo.");
		}else {
			System.out.println("Número no es primo.");
		}
	}

}
