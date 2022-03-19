import java.lang.*;
public class Ejercicio11 {
	public static void main(String[] args){
		// Valor en euros que vamos a pasar a otras monedas.
		int euros = 197;
		// Las siguientes 4 variables son las conversiones de otras monedas.
		final double dolares = 1.42;
		final double libras = 87.13/100;
		final double yens = 113.86;
		final double pesetas = 166.386;
		// Operaciones con 197 euros para pasar a las otras monedas.
		double eurosDolares = euros * dolares;
		double eurosLibras = euros * libras;
		double eurosYens = euros * 	yens;
		double eurosPesetas = euros * pesetas;
		System.out.println("Pasar 197 euros a dolares son: "+eurosDolares+".");
		System.out.println("Pasar 197 euros a libras son: "+eurosLibras+".");
		System.out.println("Pasar 197 euros a yens son: "+eurosYens+".");
		System.out.println("Pasar 197 euros a pesetas son: "+eurosPesetas+".");
	}
}