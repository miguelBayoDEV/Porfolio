package Ejer24_TirarDado;

import java.util.Arrays;

import Utilis.Simulador;

public class FrecuenciaDado {

	private int[] frecuenciaDado = new int[6];

	public FrecuenciaDado() {
		super();
	}

	public int[] getFrecuenciaDado() {
		return frecuenciaDado;
	}

	public void setFrecuenciaDado(int[] frecuenciaDado) {
		this.frecuenciaDado = frecuenciaDado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FrecuenciaDado [frecuenciaDado=");
		builder.append(Arrays.toString(frecuenciaDado));
		builder.append("]");
		return builder.toString();
	}
	
	public void mostrarFrecuencia() {
		for(int i=0; i<frecuenciaDado.length; i++) {
			System.out.println("Dado " + (i+1) + " su frecuencia es: " + frecuenciaDado[i] + " veces tiradas.");
		}
	}
	
	public void numeroTiradas(int numeroTiradas) {
		int numeroDado = 1;
		for(int i=0; i<numeroTiradas; i++) {
			numeroDado = Simulador.numeroAleatorio(1, 6);
			frecuenciaDado[numeroDado - 1]++;
		}
	}
	
}
