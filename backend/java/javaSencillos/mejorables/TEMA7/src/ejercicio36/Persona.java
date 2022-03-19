/*Ejercicio 4 : Añade al paquete daw.persona del ejercicio 1 la siguiente 
 clase, que representa una Persona, que tiene un DNI:
	Persona
	- String nombre
	- DNI dni
	# double sueldo
	- LocalDate fechaNacimiento
	+ Persona(String n, DNI d, double s, LocalDate fn)
	+ Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn)
	+ Persona(String n, DNI d)
	+ Persona(String n, int numDNI, char letraDNI)
* El primer constructor crea una persona a partir de su nombre, DNI, sueldo 
  y fecha de nacimiento pasadas como parámetros.
* El segundo constructor crea una persona a partir de su nombre, número, 
  letra de DNI, sueldo y fecha de nacimiento pasada como parámetro
* El tercer constructor crea una persona cuyo nombre y DNI se pasan como 
  parámetro, gana 900 euros y ha nacido hace 20 años.
* El cuarto constructor crea una persona cuyo nombre, número y letra de DNI
  se pasan como parámetro, gana 900 euros y ha nacido hace 20 años.*/
package ejercicio36;
import java.time.LocalDate;
import java.util.Random;

import daw.CuentaCoriente.CuentaCorriente;
import daw.persona.DNI;

public class Persona implements Comparable<Persona>{

	/*Ejercicio 4*/
	
/*_______________________________________________________________________*/
	private String nombre;
	private DNI dni;
	protected double sueldo;
	private LocalDate fechaNacimiento;
	//E10
	private CuentaCorriente cuenta;
	//E26
	private double altura;
/*_______________________________________________________________________*/
	
	
	public Persona(String n, DNI d, double s, LocalDate fn) {
		nombre = n;
		dni = d;
		sueldo = s;
		fechaNacimiento = fn;
		cuenta = new CuentaCorriente();
		altura= new Random().nextInt(60)/100.0 + 1.5;
	}
	
	public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
		this(n, new DNI(numDNI, letraDNI), s, fn);
	}
	
	public Persona(String n, DNI d) {
		this(n, d, 900, LocalDate.of(LocalDate.now().getYear()-20, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()));
	}
	
	public Persona(String n, int numDNI, char letraDNI) {
		this(n, new DNI(numDNI, letraDNI));
	}
	
	public Persona(String nombre) {
		this(nombre, new DNI(new Random().nextInt(100000000), '-'));
	}
	
	/*Ejercicio 10*/
	
	public void aumentarSaldo(int porcentaje) {
		sueldo *= (porcentaje/100);
	}
	
	public void cobrarSueldo() {
		cuenta.añadirDinero((int) sueldo);
	}
	
	/*Ejercicio 12*/
	
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
		boolean mayorEdad=LocalDate.of(LocalDate.now().getYear()-18, LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth()).isAfter(fechaNacimiento);		
		return mayorEdad;
	}

	public boolean tieneDinero() {
		boolean positivo=(cuenta.getSaldo()>0)?true:false;
		return positivo;
	}
	
	public boolean esMileurista() {
		boolean mileurista=(sueldo>1200)?true:false;
		return mileurista;
	}
	
	/*Ejercicio 36*/
	
	public double getAltura() {
		return altura;
	}
	
	public int compareTo(Persona p) {
		
		return (int) ((this.altura - p.altura)*100);
	}
	
}
