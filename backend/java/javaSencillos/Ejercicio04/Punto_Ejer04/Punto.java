package Punto_Ejer04;

public class Punto {

	private int coordenadaX;
	private int coordenadaY;
	
	
	public int getCoordenadaX() {
		return coordenadaX;
	}
	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	public int getCoordenadaY() {
		return coordenadaY;
	}
	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	
	@Override
	public String toString() {
		return "Punto [coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + "]";
	}
	
	public double distanciaPuntos(Punto punto) {
		double distancia;
		
		distancia = Math.sqrt((punto.getCoordenadaX()-this.getCoordenadaX())*(punto.getCoordenadaX()-this.getCoordenadaX())+(punto.getCoordenadaY()-this.getCoordenadaY())*(punto.getCoordenadaY()-this.getCoordenadaY()));
		
		return distancia;
	}
	
	public double distanciaOrigen(Punto punto) {
		double distancia;
		
		distancia = Math.sqrt((punto.getCoordenadaX()-0)*(punto.getCoordenadaX()-0)+(punto.getCoordenadaY()-0)*(punto.getCoordenadaY()-0));
		
		return distancia;
	}
}
