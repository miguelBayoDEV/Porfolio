import java.lang.*;
public class Ejercicio35 {

	public static void main(String[] args) {
		// Cálculos:
		double a = Math.sqrt(150);
		System.out.println("Apartado a: "+a);
		// Me pedía realizar un casting con int.
		int b1 = (int) Math.pow(2, 9);
		double b2 = Math.log(6);
		double b = b1/b2;
		System.out.println("Apartado b: "+b);
		double c = Math.cos(0.16);
		System.out.println("Apartado c: "+c);
		double d1 = Math.toRadians(45);
		double d = Math.sin(d1);
		System.out.println("Apartado d: "+d);
	}

}
