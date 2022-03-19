import java.lang.*;
public class Ejercicio18 {
	public static void main(String[] args){
		int tonelada1 = 3;
		int viajes1 = 15;
		/*
		int cantidadArena = tonelada1*viajes1;
		System.out.println(cantidadArena);
		La cantida de arena sería 45 toneladas.
		*/
		int tonelada2 = 5;
		int viajes2 = (tonelada1*viajes1)/tonelada2;
		System.out.println("Los viajes que necesitará un camión de 5 toneladas para llevar 45 toneladas de arena son: "+viajes2+" viajes.");
	}
}