package daw.fracciones;

public class Fraccion {
	private int numerador;
	private int denominador;
	
	public Fraccion(int numerador, int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public double getValorReal() {
		return numerador/(denominador*1.0);
	}
	
	public Fraccion getInversa() {
		return new Fraccion(denominador,numerador);
	}
	
	public static Fraccion sumar(Fraccion a, Fraccion b) {
		int num=(a.getNumerador()*b.getDenominador())+(b.getNumerador()*a.getDenominador());
		int den= a.getDenominador()*b.getDenominador();
		return new Fraccion(num,den);
	}
	
	public static Fraccion multiplicar(Fraccion a, Fraccion b) {
		return new Fraccion((a.getNumerador()*b.getNumerador()),(a.getDenominador()*b.getDenominador()));
	}
	
	public static Fraccion dividir(Fraccion a,Fraccion b) {
		b=b.getInversa();
		return Fraccion.multiplicar(a, b);
		//return new Fraccion((a.getNumerador()*b.getDenominador()),(b.getNumerador()*a.getDenominador()));
	}

}
