package Ejercicio26;

import java.util.stream.IntStream;

public class Ejercicio26 {

	public static void main(String[] args) {
	
		
		
		double suma = 0;
		for (double i=5;i<=13;i++) {
		
			suma += Math.pow(i,2);
			System.out.println(suma);
		
		}
		System.out.println("Resultado: "+suma);
		
	}

}
