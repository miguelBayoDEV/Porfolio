import java.lang.*;
public class Ejercicio45 {
	public static void main(String[] args){
		String núm = args[0];
		String númPremiado = args[1];
		int número = Integer.parseInt(núm);
		int númeroPremiado = Integer.parseInt(númPremiado);
		// Número coincide con número premiado.
		boolean coincidir = número==númeroPremiado;
		System.out.println("¿"+número+" coincide con número premiado: "+númPremiado+"? "+coincidir);
		// Si el número tiene reintegra seguirá estas condiciones. 
		int nPremiado = númeroPremiado%10;
		int númer = número%10;
		int número1 = número/10000;
		int númeroPremiado1 = númeroPremiado/10000;/*
		System.out.println(nPremiado);
		System.out.println(númer);
		*/
		boolean coincidencia2 = número1==númer;
		/*
		System.out.println(número1);
		System.out.println(númeroPremiado1);
		*/
		boolean coincidencia1 = númeroPremiado1==nPremiado;
		boolean resultado = coincidencia1&&coincidencia2;
		System.out.println("¿Este número "+número+" tiene reintegro? "+resultado);
	}
}