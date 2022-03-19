package Rectangulo_Ejer07;

public class Rectangulo {

	private double base;
	private double altura;
	
	
	public Rectangulo() {}


	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public double areaRectangulo() {
		return this.base * this.altura;
	}
	
	// Sobreescribir método con los parámetros de entradas del teclado
	public double areaRectangulo(double base, double altura) {
		return base * altura;
	}
}
