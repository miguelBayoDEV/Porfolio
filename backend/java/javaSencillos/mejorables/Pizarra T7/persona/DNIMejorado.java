package daw.persona;

public class DNIMejorado {
	
	//Ejercicio 16.
	//Propiedades.
	private int n�mero;
	private char letra;
	
	//M�todo auxiliar.
	private char calcularLetra(int n) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
		int resto = n%23;
		char l_dni = letra[resto];
		return l_dni;
	}
	
	//Constructor.
	public DNIMejorado(int n) {
		n�mero=n;
		letra=calcularLetra(n);
	}
	
	//M�todos.
	public int getNumero() {
		return n�mero;
	}
	
	public char getLetra() {
		return letra;
	}
}
