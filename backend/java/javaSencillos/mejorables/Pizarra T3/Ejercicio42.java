import java.lang.*;
public class Ejercicio42 {

	public static void main(String[] args) {
		// Crear un programa que resuelva un c�lculo, lo redonde� y lo imprima en pantalla.
		double base = 0.38 * 4.93;
		double exponente = -0.36;
		double p = Math.pow(base, exponente);
		System.out.println("Resultado de la operaci�n: "+p);
		long redondeo = Math.round(p);
		// int r = (int) redondeo;
		System.out.println("Resultado de la operaci�n redondeado: "+redondeo);
	}

}
