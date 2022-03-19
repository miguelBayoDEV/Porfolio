import java.lang.*;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contador = 0;
		int alumno = 1;
		boolean repetir = true;
		while(repetir) {
			System.out.println("Introduzca nota de alumno "+alumno+": ");
			int nota = s.nextInt();
			contador+= nota;
			alumno++;
			if(nota<0&&nota!=-1) {
				repetir = false;
				System.out.println("Nota incorrecta.");
			}else if(nota>10) {
				repetir = false;
				System.out.println("Nota incorrecta.");
			}else if(nota==-1) {
				double nota_media = (1.0*contador)/alumno;
				System.out.println("Nota media es: "+nota_media);
				int mayor = Math.max(nota, nota);
				System.out.println("Mayor nota: "+mayor);
				int menor = Math.min(nota, nota);
				System.out.println("Menor nota: "+menor);
				repetir = false;
			}
		}
	}

}
