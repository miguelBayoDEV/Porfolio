import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int edad= 0;
		final int MAYORIAEDAD=18;
		
		System.out.println("Introduce tu edad:");
		edad= entrada.nextInt();
		
		boolean mayor= edad>=MAYORIAEDAD;
		
		System.out.println("Si tienes "+edad+" años eres mayor de edad? "+mayor);
		

	}

}
