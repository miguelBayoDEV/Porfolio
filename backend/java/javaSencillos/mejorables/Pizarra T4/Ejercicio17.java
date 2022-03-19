import java.lang.*;
import java.util.Scanner;
public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nota númerica: ");
		double nota = s.nextDouble();
		if(nota<5) {
			System.out.println("Suspenso.");
		}else if(nota>=5&&nota<6) {
			System.out.println("Sufuciente.");
		}else if(nota>=6&&nota<7) {
			System.out.println("Bien.");
		}else if(nota>=7&&nota<9) {
			System.out.println("Notable.");
		}else if(nota>=9&&nota<10) {
			System.out.println("Sobresaliente.");
		}else if(nota==10) {
			System.out.println("Matricula.");
		}else {
			System.out.println("Nota superior a 10 no existe.");
		}
	}
}
