package Tema5Ejercicio28;
import java.util.*;
public class Tema5Ejercicio28 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Introduce un numero: ");
		double numero=s.nextInt();
		
		for(double i=1;i<=numero;i++) {
			
			double cuenta=numero%i;
			
			if(cuenta==0) {
				System.out.println(i+" Es divisor");
			}

		}
		
	}
}
