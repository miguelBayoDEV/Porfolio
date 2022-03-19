package daw.persona;

public class DNIMejorado {
	
	//Ejercicio 16.
	//Propiedades.
	private int número;
	private char letra;
	
	//Método auxiliar.
	private char calcularLetra(int n) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
		int resto = n%23;
		char l_dni = letra[resto];
		return l_dni;
	}
	
	//Constructor.
	public DNIMejorado(int n) {
		número=n;
		letra=calcularLetra(n);
	}
	
	//Métodos.
	public int getNumero() {
		return número;
	}
	
	public char getLetra() {
		return letra;
	}
}
