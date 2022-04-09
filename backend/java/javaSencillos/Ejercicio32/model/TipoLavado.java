package model;

public enum TipoLavado {
	BASICO(3, 12.25),
	NORMAL(5, 17.75),
	SUPER(7, 23.95);

	private final int tiempo;
	private double precio;

	private TipoLavado(int tiempo, double precio) {
		this.tiempo = tiempo;
		this.precio = precio;
	}

	// En principio como el tiempo es una constante no se creará el método set
	public int getTiempo() {
		return tiempo;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
