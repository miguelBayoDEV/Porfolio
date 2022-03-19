package daw.persona;

public class DNI {
	
	//Propiedades de la clase.
	private int número;
	private char letra;
	
	//Constructores.
	public DNI(int n, char l) {
		número=n;
		letra=l;
	}
	
	public DNI(String dni) {
		número=Integer.parseInt(dni.substring(0, dni.length()-2));
		letra=dni.charAt(dni.length()-1);
	}
}
