package Ejer23_OperacionesNumeros;

import java.util.List;

import Utilis.OperacionesString;

public class Calculo {
	
	public static String mostrarNumeros(List<Integer> listaNumeros) {
		String aux_listaNumeros = "Lista de números: ";
		
		// Al ser una clase wrapper Integer se puede convertir a int
		for(int item:listaNumeros) {
			aux_listaNumeros += item + ", ";
		}
		return OperacionesString.puntoFinalString(aux_listaNumeros);
	}
	
	public static double mediaAritmetica(List<Integer> listaNumeros) {
		double media = 0.0;
		for(int item:listaNumeros) {
			media += item;
		}
		media /= (listaNumeros.size() * 1.0);
		return media;
	}
	
	public static int numeroMaximo(List<Integer> listaNumeros) {
		int max = listaNumeros.get(0);
		for(int item:listaNumeros) {
			if(item > max) max = item;
		}
		return max;
	}
	
	public static int numeroMinimo(List<Integer> listaNumeros) {
		int min = listaNumeros.get(0);
		for(int item:listaNumeros) {
			if(item < min) min = item;
		}
		return min;
	}
	
	public static String numeroMasVecesAparece(List<Integer> listaNumeros) {
		String resultado = "El número que se repite más veces es: ";
		int contador = 1;
		int maxContador = 1;
		int mayorNumero = listaNumeros.get(0);
		int numeroNuevo = listaNumeros.get(0);
		for(int i=0; i<listaNumeros.size(); i++) {
			if(listaNumeros.get(i) == numeroNuevo) {
				contador++;
			}else {
				if(contador > maxContador) {
					mayorNumero = listaNumeros.get(i);
					maxContador = contador;
				}
				numeroNuevo = listaNumeros.get(i);
				contador = 1;
			}
		}
		resultado += mayorNumero + " - número de veces: " + maxContador;
		return resultado;
	}
	
}
