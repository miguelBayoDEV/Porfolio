import java.lang.*;
import java.util.*;
import java.time.*;
public class Ejercicio45 {

	public static void main(String[] args) {
		//Crear un programa que realice una pause de un n�mero aleatorio.
		Random r = new Random();
		int na = r.nextInt(10); //No he usado la formula de random porque como el n�mero aleatorio est� comprendido entre 0 y 10 basta con poner solo el tope.
		long ms = na*1000;
		Instant i0 = Instant.now();
		try {
			Thread.sleep(ms);
		}catch(InterruptedException error) {
			System.out.println("Programa interrumpido.");
		}
		//Crear un objeto Instant antes pause y despu�s de pausa y con objeto Duration mostrar los segundos de la pausa.
		Instant i1 = Instant.now();
		Duration d = Duration.between(i0, i1);
		long t_seg = d.getSeconds(); //M�todo que obtiene los segundos de la pause (si quisieras otras magnitudes se realizan m�todos de funci�n distintos y sus respectivas conversiones).
		System.out.println("�Cu�ntos segundos a durado la pausa? "+t_seg);
	}

}
