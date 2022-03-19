package ej14;
import java.util.*;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Introducir goles del equipo Local:");
		int loc=s.nextInt();
		System.out.println("Introducir goles del equipo Visitante:");
		int vis=s.nextInt();
		
		if(loc>=0 && vis>=0){
			if(loc>vis) {
				System.out.println("Resultado: 1");
			}else if(vis>loc){
				System.out.println("Resultado: 2");
			}else {
				System.out.println("Resultado: X");
			}
		}else {
			System.out.println("Dato incorrecto");
		}
	}

}
