import java.lang.*;
public class Ejercicio36 {

	public static void main(String[] args) {
		// Crear un programa con las soluciones de una ecuación. Fórmula: x=(-b+-raízb^2-4*a*c)/2*a
		int a = 1;
		int b = -5;
		int c = 6;
		int b2 = (int) Math.pow(b, 2);
		int r1 = b2-(4*a*c);
		double r = Math.sqrt(r1);
		int d = 2*a;
		double s1 = (-b+r)/d;
		double s2 = (-b-r)/d;
		int sol1 = (int) s1;
		int sol2 = (int) s2;
		System.out.println("Las dos soluciones de esta ecuación son: ["+sol1+","+sol2+"]");
	}

}