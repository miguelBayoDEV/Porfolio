import java.lang.*;
import java.util.*;
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double sum = 0.0;
		boolean repetir = true;
		int i = 1;
		for(i=1;i<=10&&repetir;i++ ) {
			System.out.println("Introduzca nota del examen "+i+": ");
			double n = s.nextDouble();
			if(n>=5) {
				sum +=n;
				int media = (int) sum/(i);
				System.out.println("Nota media de la asignatura es: "+media);
			}else {
				System.out.println("Está suspenso.");
				repetir = false;
			}
		}
	}

}
