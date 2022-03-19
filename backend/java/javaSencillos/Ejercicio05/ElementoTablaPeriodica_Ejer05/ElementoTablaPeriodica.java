package ElementoTablaPeriodica_Ejer05;

public class ElementoTablaPeriodica {

	private String nombre;
	private String simbolo;
	private int numero;
	private static int contadorInstancias;
	
	
	public ElementoTablaPeriodica(String nombre, String simbolo, int numero) {
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.numero = numero;
		contadorInstancias++;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSimbolo() {
		return simbolo;
	}


	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "ElementoTablaPeriodica [nombre=" + nombre + ", simbolo=" + simbolo + ", numero=" + numero + "]";
	}
	
	public static int numeroDeElementos() {
		return contadorInstancias;
	}
}
