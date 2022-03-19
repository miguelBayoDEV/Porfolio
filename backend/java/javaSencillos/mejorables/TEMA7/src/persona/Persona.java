package daw.persona;

import java.time.*;

import daw.CuentaCoriente.CuentaCorriente;
import daw.persona.*;

public class Persona {
	private String nombre;
	private DNI dni;
	protected double sueldo;
	private LocalDate fechaNacimiento;
	//Ejercicio 10
		private CuentaCorriente cuenta;
		
	
	public Persona(String n, DNI d, double s, LocalDate fn) {
		nombre = n;
		dni = d;
		sueldo = s;
		fechaNacimiento = fn;
		//Ejercicio 10
		cuenta=new CuentaCorriente();
	}
	
	public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
		this(n,new DNI(numDNI, letraDNI),s,fn);
		/*nombre = n;
		dni = new DNI(numDNI,letraDNI);
		sueldo = s;
		fechaNacimiento = fn;		*/
	}
	
	public Persona(String n, DNI d) {
		this(n,d,900,LocalDate.of((LocalDate.now().getYear())-20, 1, 1));
	}
	
	public Persona(String n, int numDNI, char letraDNI) {
		this(n,new DNI(numDNI, letraDNI),900,LocalDate.now().minusYears(20));
		/*nombre = n;
		dni = new DNI(numDNI,letraDNI);
		sueldo = 900;
		fechaNacimiento = LocalDate.of((LocalDate.now().getYear())-20, 1, 1);		*/
	}
	public void aumentarSueldo(int porcentaje) {
		int aumento=((int)sueldo*porcentaje)/100;
		sueldo=sueldo+aumento;
	}
	public void cobrarSueldo() {
		cuenta.añadirDinero((int)sueldo);
	}
	
public String getNombre() {
		
		return nombre;
		
	}
	
	public DNI getDNI() {
		
		return dni;
		
	}
	
	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public LocalDate getFechaNacimiento() {
		
		return fechaNacimiento;
		
	}
	
	public CuentaCorriente getCuentaCorriente() {
		
		return cuenta;
		
	}
	
	public boolean esMayorEdad() {
		
		
		boolean mayor = getEdad() >= 18?true:false;
		return mayor;
	}
	
	public boolean tieneDinero() {
		
		return cuenta.getSaldo() > 0?true:false;
		
	}
	
	public boolean esMileurista() {
		
		boolean comprobacion = sueldo < 1200?true:false;
		return comprobacion;
	}
	
	public int getEdad(){
		
		return LocalDate.now().getYear() - fechaNacimiento.getYear();
		
	}
}
