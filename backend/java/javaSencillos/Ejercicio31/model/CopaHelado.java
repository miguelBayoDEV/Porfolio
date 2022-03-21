package model;

public enum CopaHelado {
	MINI(2, 1.5),
	SUPER(3, 2.7),
	MEGA(5, 3.9);

	private final int bolas;
	private double precio;

	private CopaHelado(int bolas, double precio) {
		this.bolas = bolas;
		this.precio = precio;
	}

	public int getBolas() {
		return bolas;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
