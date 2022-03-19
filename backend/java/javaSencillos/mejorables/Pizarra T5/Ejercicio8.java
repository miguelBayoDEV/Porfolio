import java.lang.*;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s = 1.0;
		double a = 1.0;
		System.out.println("Introduzca un número positivo: ");
		double n = sc.nextDouble();
		boolean repetir = true;
		while(repetir) {
			s = (1.0/2)*(a+n/a);
			double absoluto = s-a;
			int valor_absoluto = Math.abs((int)absoluto);
			if(valor_absoluto<0.000001) {
				System.out.println("La raíz cuadrada es: "+s);
				repetir = false;
			}else {
				a=s;
				s= (1.0/2)*(a+n/a);
				absoluto = s-a;
				valor_absoluto = Math.abs((int)absoluto);
				if(valor_absoluto<0.000001) {
					System.out.println("La raíz cuadrada es: "+s);
					repetir = false;
				}
			}
		}
	}
}
