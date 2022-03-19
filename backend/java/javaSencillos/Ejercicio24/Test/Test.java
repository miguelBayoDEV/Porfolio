package Test;

import java.util.List;

import Ejer22_MetodosArray.Array;
import Ejer23_OperacionesNumeros.Calculo;
import Ejer24_TirarDado.FrecuenciaDado;
import Utilis.OperacionesScanner;

public class Test {

	public static void test22() {
		int[] arrayInt = {2,3,4,5,6,7,10};
		Array.imprimirArrayInt(arrayInt);
		
		int[] arrayInt1 = Array.crearArrays();
		int[] arrayInt2 = Array.crearArrays(arrayInt.length);
		Array.imprimirArrayInt(arrayInt1);
		Array.imprimirArrayInt(arrayInt2);
		
		System.out.println("Suma array es: " + Array.sumaIntArray(arrayInt));
		System.out.println("Suma array es: " + Array.sumaIntArray(arrayInt1));
		System.out.println("Suma array es: " + Array.sumaIntArray(arrayInt2));
		
		int[] arrayIntReves = Array.arrayInvertido(arrayInt);
		int[] arrayInt1Reves = Array.arrayInvertido(arrayInt1);
		int[] arrayInt2Reves = Array.arrayInvertido(arrayInt2);
		Array.imprimirArrayInt(arrayIntReves);
		Array.imprimirArrayInt(arrayInt1Reves);
		Array.imprimirArrayInt(arrayInt2Reves);
	}
	
	public static void test23() {
		List<Integer> listaNumeros = OperacionesScanner.peticionNumerosHastaPoner0();
		System.out.println(Calculo.mostrarNumeros(listaNumeros));
		System.out.println("Media aritmética: " + Calculo.mediaAritmetica(listaNumeros));
		System.out.println("Número máximo: " + Calculo.numeroMaximo(listaNumeros));
		System.out.println("Número mínimo: " + Calculo.numeroMinimo(listaNumeros));
		System.out.println(Calculo.numeroMasVecesAparece(listaNumeros));
	}
	
	public static void test24() {
		FrecuenciaDado frecuenciaDado = new FrecuenciaDado();
		frecuenciaDado.numeroTiradas(100);
		frecuenciaDado.mostrarFrecuencia();
	}
	
}
