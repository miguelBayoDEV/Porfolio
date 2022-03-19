package daw.DNIMejorado;

public class DNIMejorado {
	
	private int numero;
	private char letra;
	
	
	public DNIMejorado(int n) {
		numero=n;
		letra=calcularLetra(n);
	}
	public int getNumero() {
		return numero;
	}
	public char getLetra() {
		return letra;
	}
	private char calcularLetra(int n) {
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int posicion=n%23;
		char l=letra[posicion];
		return l;
	}
}
