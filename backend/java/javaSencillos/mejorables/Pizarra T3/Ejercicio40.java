import java.lang.*;
import java.util.Random;
public class Ejercicio40 {

	public static void main(String[] args) {
		// Crear un programa que genere un n�mero aleatorio entre 29 y 65 y lo muestre en pantalla.
		Random r = new Random();
		// Crear n�mero aleatorio. int a = 29; int b = 65; int na = a+r.nextInt(b-a); System.out.println("N�mero aleatorio entre "+a+" y "+b+" es: "+na);
		double a = 29.0;
		double b = 65.0;
		double n = a+(b-a)*Math.random();
		// si se quiere en n�mero entero int na = (int) n;
		System.out.println("N�mero aleatorio entre "+a+" y "+b+" es: "+na); // De esta forma es m�s completa y precisa que la otra.
	}

}
