package daw.persona;

public class DNI {
	
	//Propiedades de la clase.
	private int n�mero;
	private char letra;
	
	//Constructores.
	public DNI(int n, char l) {
		n�mero=n;
		letra=l;
	}
	
	public DNI(String dni) {
		n�mero=Integer.parseInt(dni.substring(0, dni.length()-2));
		letra=dni.charAt(dni.length()-1);
	}
}
