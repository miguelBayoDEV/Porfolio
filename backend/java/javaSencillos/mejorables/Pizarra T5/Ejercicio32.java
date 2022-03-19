import java.lang.*;
import java.util.*;
public class Ejercicio32 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int suma = 0;
		int n = 0;
		int i = 0;
		for(i=1;i<=10;i++) {
			if(n>=0&&n<=10) {
				System.out.println("Introduzca nota: ");
				n = s.nextInt();
				suma+=n;
			}else {
				System.out.println("Introduzca una nota entre 0-10: ");
				n = s.nextInt();
				suma+=n;
			}
		}
		double media = (1.0*suma)/i;
		System.out.println("La nota media es: "+(int) media);
	}

}
