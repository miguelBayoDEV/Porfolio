import java.lang.*;
import java.util.*;
public class Ejercicio29_1 {

	public static void main(String[] args) {
		
		//Opci�n b:
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca un n�mero entero: ");
		int nu = (int) s.nextInt(); //Le pongo el casting por si el usuario introduce un double para que no se convierta en conversi�n impl�cita.
		int n = Math.abs(nu);
		int n_divisores =  0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				n_divisores++;
			}
		}
		if(n_divisores==0) {
			System.out.println("N�mero es primo.");
		}else {
			System.out.println("N�mero no es primo.");
		}
	}

}
