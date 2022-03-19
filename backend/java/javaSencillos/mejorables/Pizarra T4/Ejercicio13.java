import java.lang.*;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca tres números enteros: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		if(n1>n2) {
			if(n1>n3) {
				System.out.println("El número mayor es "+n1);
			}else {
				System.out.println("El número mayor es "+n3);
			}
		}else {
			if(n2>n3) {
				System.out.println("El número mayor es "+n2);
			}else {
				System.out.println("El número mayor es "+n3);
			}
		}
	}

}
