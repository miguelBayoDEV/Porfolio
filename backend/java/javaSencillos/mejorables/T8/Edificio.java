package daw.edificios;

public class Edificio {
	private String direccion;
	private int numeroPlantas;
	
	public Edificio(String d, int np) {
		direccion=d;
		if(np<0) {
			throw new IllegalArgumentException("Número de plantas no es positivo.");
		}
		numeroPlantas=np;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public int getNumeroPlantas() {
		return numeroPlantas;
	}
}
