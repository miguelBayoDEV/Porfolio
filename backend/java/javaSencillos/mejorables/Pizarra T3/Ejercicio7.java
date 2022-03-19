import bpc.daw.objetos.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// Muestra un depósito de agua y % ocupación si tiene 15 litros de 50 litros.
		DepositoAgua agua = new DepositoAgua(15,50);
		int re1 = agua.getCantidadActual();
		int re2 = agua.getCapacidadMaxima();
		double r1 = re1;
		double r2 = re2;
		double rF = (r1/r2)*100;
		int rFinal = (int) rF;
		agua.dibujar();
		System.out.println("El % de ocupación del depósito es: "+rFinal);
	}

}
