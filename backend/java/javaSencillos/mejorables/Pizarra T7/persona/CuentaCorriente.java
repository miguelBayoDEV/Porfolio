package daw.persona;
import java.util.*;
public class CuentaCorriente {
	
	//Ejercicio 7.
	private int n�mero;
	private double saldo;
	
	//Constructores.
	public CuentaCorriente() {
		this(new Random().nextInt(1001), 0.0);
	}
	
	public CuentaCorriente(int n�mero) {
		this(n�mero, 0.0);
	}
	
	public CuentaCorriente(int n�mero, double saldo) {
		this.n�mero=n�mero;
		this.saldo=saldo;
	}
	
	//M�todos.
	public void a�adirDinero(int cantidad) {
		saldo=cantidad>0?saldo+cantidad:saldo;
	}
	
	/*
	public void retirarDinero(int cantidad) {
		saldo=cantidad>0&&saldo>=cantidad?saldo-cantidad:saldo;
	}
	*/
	
	//Tuve que crear este m�todo de instancia de funci�n para el ejercicio 12.
	public double getSaldo() {
		return saldo;
	}
	
	//Ejercicio 18 CheckedException.
	public void retirarDinero(int cantidad) throws Exception {
		if(cantidad>0&&cantidad<saldo) {
			saldo-=cantidad;
		}else {
			Exception error = new Exception("Supera el l�mite de retirada de dinero");
			throw error;
		}
	}
}
