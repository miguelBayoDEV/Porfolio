package model;

public enum RecipienteHelado {
	CUCURUCHO(0.1),
	TARRINA(0.25),
	BARQUILLO(0.5);
	
	private double precio;
	private RecipienteHelado(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
