import java.lang.*;
public class Ejercicio52 {
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int f = 6;
		double divisor = (a*d) - (b*c);
		double dividendo1 = (e*d) - (b*f);
		double dividendo2 = (a*f) - (e*c);
		double x = dividendo1/divisor;
		double y = dividendo2/divisor;
		System.out.println("La x valdr�: "+x);
		System.out.println("La y valdr�: "+y);
		double ecuaci�n1 = (a*x)+(b*y);
		boolean ecuaci�na = ecuaci�n1==e;
		double ecuaci�n2 = (c*x)+(d*y);
		boolean ecuaci�nb = ecuaci�n2==f;
		System.out.println("a*x+b*y=e,�es igual a "+e+"? "+ecuaci�na);
		System.out.println("c*x+d*y=f,�es igual a "+f+"? "+ecuaci�nb);
	}
}