package daw.persona;
import java.util.*;
public class CuentaCorriente {
	
	//Ejercicio 7.
	private int número;
	private double saldo;
	
	//Constructores.
	public CuentaCorriente() {
		this(new Random().nextInt(1001), 0.0);
	}
	
	public CuentaCorriente(int número) {
		this(número, 0.0);
	}
	
	public CuentaCorriente(int número, double saldo) {
		this.número=número;
		this.saldo=saldo;
	}
	
	//Métodos.
	public void añadirDinero(int cantidad) {
		saldo=cantidad>0?saldo+cantidad:saldo;
	}
	
	/*
	public void retirarDinero(int cantidad) {
		saldo=cantidad>0&&saldo>=cantidad?saldo-cantidad:saldo;
	}
	*/
	
	//Tuve que crear este método de instancia de función para el ejercicio 12.
	public double getSaldo() {
		return saldo;
	}
	
	//Ejercicio 18 CheckedException.
	public void retirarDinero(int cantidad) throws Exception {
		if(cantidad>0&&cantidad<saldo) {
			saldo-=cantidad;
		}else {
			Exception error = new Exception("Supera el límite de retirada de dinero");
			throw error;
		}
	}
}
