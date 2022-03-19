package Limites_Ejer21;

import Utilis.OperacionesScanner;

public class OperacionesRangoNumeros {

	public static void cuboNumeroDentroRango(int limiteInferior, int limiteSuperior, int cantidadNumerosPedidos) {
		int numeroPedido;
		int cuboNumero;
		for(int i=0; i<cantidadNumerosPedidos; i++) {
			numeroPedido = OperacionesScanner.leerNumeroEnteroInt("Introduzca número entero aleatorio: ");
			if(numeroPedido < limiteInferior || numeroPedido > limiteSuperior) {
				System.out.println("Número fuera del rango.");
			}else {
				cuboNumero = (int) Math.pow(numeroPedido, 3);
				System.out.println("Número " + numeroPedido + " dentro del rango (" + limiteInferior + "," + limiteSuperior + ") y su cubo es: " + cuboNumero);
			}
		}
	}
	
}
