package Ejercicio22;
import java.util.*;
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double nota = 5;
		double media = 0;
		double notasTotales = 0;
		
		for (int i=1;i<=10&&nota>=5;i++) {	
			System.out.println("Introduce la nota del examen:");
			nota = s.nextDouble();
			if (nota>=5) {
				notasTotales+=nota;
				media=notasTotales/i;
				System.out.println("La media es: "+media);
			} else {
				System.out.println("El alumno está suspenso");
			}
		}
	}

}
