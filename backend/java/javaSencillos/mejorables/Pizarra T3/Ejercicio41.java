import java.lang.*;
import java.text.*;
public class Ejercicio41 {

	public static void main(String[] args) {
		// Crear un programa que calcule pi de esta f�rmula: pi = 4*arc tg(1) y muestre el valor con 4 decimales.
		// Clase Math.
		double x = 1.0;
		double arc_tg = Math.atan(x);
		double pi = 4*arc_tg;
		// Clase NumberFormat.
		NumberFormat nf = NumberFormat.getInstance(); //Creo un objeto de la clase NumberFormat.
		nf.setMaximumFractionDigits(4); //Decimales m�ximos. Es igual con decimales m�nimos: nf.setMinimumFractionDigits(4);
		String d = nf.format(pi);
		System.out.println("El n�mero PI con cuatro decimales: "+d);
	}

}
