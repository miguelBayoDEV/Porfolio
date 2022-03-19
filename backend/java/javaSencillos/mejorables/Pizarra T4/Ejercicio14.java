import java.lang.*;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Resultado del partido de fútbol.");
		System.out.println("Goles del equipo local: ");
		int gl = s.nextInt();
		System.out.println("Goles del equipo visitante: ");
		int gv = s.nextInt();
		if(gl<0&&gv<0) {
			System.out.println("Dato incorrecto.");
		}else {
			if(gl>gv) {
				System.out.println("1");
			}else {
				if(gl==gv) {
					System.out.println("X");
				}else {
					if(gl<gv) {
						System.out.println("2");
					}
				}
			}
		}
	}

}
