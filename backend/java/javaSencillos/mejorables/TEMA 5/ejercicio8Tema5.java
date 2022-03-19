package ejercicio8Tema5;
import java.util.*;
public class ejercicio8Tema5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double s = 1;
		double a = 1;
		double absolutoResta = 1;
		double limite = 0.000001;
		System.out.println("Introduce un número para hallar su raíz cuadrada.");
		double n=scan.nextDouble();
		while (absolutoResta>=limite) {
			s=((a+(n/a))/2);
			absolutoResta = Math.abs(s-a);
			if (absolutoResta>=limite) {
				a=s;
			}
		}
		System.out.println("La raíz de "+n+ " es "+s);

	}

}
