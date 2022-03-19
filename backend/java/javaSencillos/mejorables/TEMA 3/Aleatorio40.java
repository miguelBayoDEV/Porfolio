import java.util.*;

public class Aleatorio40 {

	public static void main(String[] args) {
		
		//Lo hacemos con Random
		Random generador = new Random(); //Creamos un generador de n�meros
		int A = 29;
		int B = 65;
		int numeroAleatorioR = A+generador.nextInt(B-A);
		System.out.println("El n�mero aleatorio generado por Random es: "+numeroAleatorioR);
		
		//Lo hacemos con Math
		double numeroAleatorioM = A+(B-A)*Math.random();
		System.out.println("El n�mero aleatorio generado por Math es: "+numeroAleatorioM);
	}

}
