package LoteriaPromitiva_Ejer16;

import java.util.Arrays;

import Utilis.Simulador;

public class Apuesta {
	
	private int[] numerosApuesta = new int[6];

	public Apuesta() {
		super();
	}

	public int[] getNumerosApuesta() {
		return numerosApuesta;
	}

	public void setNumerosApuesta(int[] numerosApuesta) {
		this.numerosApuesta = numerosApuesta;
	}

	@Override
	public String toString() {
		return "Apuesta [numerosApuesta=" + Arrays.toString(numerosApuesta) + "]";
	}
	
	public void rellenarApuesta() {
		int[] resultado = new int[6];
		for(int i=0; i<6; i++) {
			int numeroAleatorio = Simulador.numeroAleatorio(1, 49);
			
			boolean comprobacion = false;
			while(comprobacion == false) {
				comprobacion = valorNoRepetido(numeroAleatorio, resultado);
				if (comprobacion) {
					resultado[i] = numeroAleatorio;
				}else {
					numeroAleatorio = Simulador.numeroAleatorio(1, 49) ;
				}
			}
				
		}
		
		this.numerosApuesta = resultado;
	}
	
	private boolean valorNoRepetido(int valor, int[] arrayComprobar) {
		boolean resultadoNoRepetido = true;
		
		for(int i=0; i<arrayComprobar.length; i++) {
			if(valor == arrayComprobar[i]) {
				resultadoNoRepetido = false;
			}
		}
		
		return resultadoNoRepetido;
	}
	
	public String imprimirApuesta() {
		String resultadoApuesta = "";
		for(int item: numerosApuesta) {
			resultadoApuesta += item + " ";
		}
		return resultadoApuesta;
	}
	
}
