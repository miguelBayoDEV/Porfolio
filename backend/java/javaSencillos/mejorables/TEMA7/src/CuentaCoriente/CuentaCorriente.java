package daw.CuentaCoriente;

import java.util.Random;

public class CuentaCorriente {
	private int numero;
	private double saldo;
	
	public CuentaCorriente() {
		this((int)Math.random()*1001,0.0);
		
		//this(new Random().nextInt(1001),0.0);
	}
	public CuentaCorriente(int numero) {
		this(numero,0);
	}
	public CuentaCorriente(int numero, double saldo) {
		this.numero=numero;
		this.saldo=saldo;
	}
	public void añadirDinero(int cantidad){
		saldo+=cantidad;
	}
	/*public void retirarDinero(int cantidad){
		saldo-=cantidad;
	} 
	*/
	public void retirarDinero(int cantidad) throws Exception {
		
		if(cantidad <= getSaldo()) {
			saldo = saldo - cantidad;
		}else {
			
			throw new Exception ("Saldo insuficiente");
			
		}
	}
	public double getSaldo() {
		
		return saldo;
		
	}
}
