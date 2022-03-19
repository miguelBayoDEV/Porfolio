package Ejer32;
import java.lang.*;
import java.util.*;
public class Ejercicio32 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int suma = 0;
		int n = 0;
		int total = 10;
		for(int i=1;i<=10;i++) {
			System.out.println("Introduzca nota: ");
			n = s.nextInt();
			if(n>=0&&n<=10) {
				suma+=n;
			}else {
				boolean repetir = true;
				while((n<0||n>10)&&repetir) {
						
					System.out.println("Introduzca una nota entre 0-10: ");
					n = s.nextInt();
					
					if(n>=0&&n<=10) {
						suma+=n;
						repetir = false;
					}
				}
			}
				
		}
		double media = (1.0*suma)/total;
		System.out.println("La nota media es: "+(int) media);
	}

}
