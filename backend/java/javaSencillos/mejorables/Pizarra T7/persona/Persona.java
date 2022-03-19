package daw.persona;
import java.time.LocalDate;

public class Persona {
	
	//Propiedades de la clase.
	private String nombre;
	private DNI dni;
	protected double sueldo;
	private LocalDate fechaNacimiento;
	//Ejercicio10 propiedad nueva.
	private CuentaCorriente cuenta;
	
	//Constructores.
	public Persona(String n, DNI d, double s, LocalDate fn) {
		nombre=n;
		dni=d;
		sueldo=s;
		fechaNacimiento=fn;
		cuenta=new CuentaCorriente();
	}
	
	public Persona(String n, int numDNI, char letraDNI, double s, LocalDate fn) {
		this(n, new DNI(numDNI, letraDNI), s, fn);
	}
	
	public Persona(String n, DNI d) {
		this(n, d, 900, LocalDate.of(2000, 1, 17));
	}
	
	public Persona(String n, int numDNI, char letraDNI) {
		this(n, new DNI(numDNI, letraDNI), 900, LocalDate.of(2000, 1, 17));
	}
	
	//Ejercicio 10 métodos.
	public void aumentarSueldo(int porcentaje) {
		if(porcentaje>0) {
			int aumento=((int) sueldo*porcentaje)/100;
			sueldo+=aumento;
		}
	}
	
	public void cobrarSueldo() {
		cuenta.añadirDinero((int) sueldo);
	}
	
	//Ejercicio 12 métodos.
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
		boolean mayorEdad = true;
		LocalDate fecha_actual = LocalDate.now();
		int año_actual = fecha_actual.getYear();
		if((año_actual-fechaNacimiento.getYear())<=18) {
			mayorEdad=false;
		}
		return mayorEdad;
	}
	
	public boolean tieneDinero() {
		boolean dineroPositivo=true;
		if(cuenta.getSaldo()<=0) {
			dineroPositivo=false;
		}
		return dineroPositivo;
	}
	
	public boolean isMileurista() {
		boolean mileurista=true;
		if(sueldo>=1200) {
			mileurista=false;
		}
		return mileurista;
	}
}
