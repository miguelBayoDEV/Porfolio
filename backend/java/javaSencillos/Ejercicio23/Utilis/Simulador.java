package Utilis;

public class Simulador {

	public static int numeroAleatorio(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}
	
}
