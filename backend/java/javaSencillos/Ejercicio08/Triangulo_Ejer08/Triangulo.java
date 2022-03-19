package Triangulo_Ejer08;

public class Triangulo {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo() {}

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	@Override
	public String toString() {
		return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
	}
	
	public double ladoMasLargo() {
		double ladoMayor = 0.0;
		
		if(this.ladoA > this.ladoC) {
			if(this.ladoA > this.ladoB) {
				ladoMayor = this.ladoA;
			}else if(this.ladoA == this.ladoB){
				System.out.println("Lado A y lado B miden iguales: " + this.ladoA);
				ladoMayor = this.ladoA;
			}else {
				ladoMayor = this.ladoB;
			}
		}else if(this.ladoA == this.ladoC){
			System.out.println("Lado A y lado C miden iguales: " + this.ladoA);
			ladoMayor = this.ladoA;
		}else {
			if(this.ladoC > this.ladoB) {
				ladoMayor = this.ladoC;
			}else if(this.ladoC == this.ladoB) {
				System.out.println("Lado C y lado B miden iguales: " + this.ladoB);
				ladoMayor = this.ladoB;
			}else {
				ladoMayor = this.ladoB;
			}
		}
		
		return ladoMayor;
	}
	
	public String ladoMasLargo(double ladoA, double ladoB, double ladoC) {
		String lado = "";
		double ladoMayor = 0.0;
		
		if(ladoA > ladoC) {
			if(ladoA > ladoB) {
				ladoMayor = ladoA;
				lado = "Lado A es mayor y mide: " + ladoMayor;
			}else if(ladoA == ladoB) {
				ladoMayor = ladoA;
				lado = "Lado A y lado B miden igual: " + ladoMayor;
			}else {
				ladoMayor = ladoB;
				lado = "Lado B es mayor y mide: " + ladoMayor;
			}
		}else if(ladoA == ladoC) {
			ladoMayor = ladoA;
			lado = "Lado A y lado C miden igual: " + ladoMayor;
		}else {
			if(ladoC > ladoB) {
				ladoMayor = ladoC;
				lado = "Lado C es mayor y mide: " + ladoMayor;
			}else if(ladoC == ladoB) {
				ladoMayor = ladoB;
				lado = "Lado C y lado B miden igual: " + ladoMayor;
			}else {
				ladoMayor = ladoB;
				lado = "Lado B es mayor y mide: " + ladoMayor;
			}
		}
		
		return lado;
	}
}
