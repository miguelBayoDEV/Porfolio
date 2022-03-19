package daw.ejer5;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import daw.persona.*;

public class Oficina {
	
	//Propiedades de la clase.
	private String nombre;
	private ArrayList<Persona> trabajadores;
	
	//Constructores.
	public Oficina(String nombre) {
		this(nombre,7);
	}
	
	public Oficina(String nombre, int tipo) {
		this.nombre=nombre;
		//Le doy una capacidad inicial de 0 a la lista que creo: trabajadores=new ArrayList<Persona>(0);
		trabajadores=new ArrayList<>();
		if(tipo>0&&tipo<=3) {
			trabajadores.add(new Persona("Antonio Pérez Pérez", new DNI("11111111H"), 900, LocalDate.of(2000, 2, 28)));
			if(tipo>1) {
				trabajadores.add(new Persona("Antonio Pérez Pérez", new DNI("11111111H"), 900, LocalDate.of(2000, 2, 28)));
				trabajadores.add(new Persona("Luis López López", new DNI("22222222J"), 1000, LocalDate.of(1995, 9, 10)));
				if(tipo==3) {
					trabajadores.add(new Persona("Ana Díaz Díaz", new DNI("33333333P"), 1200, LocalDate.of(1985, 5, 21)));
				}
			}
		}		
	}
	
	public Oficina() {
		this("Industrias DAW",3);
	}
	
	//Ejercicio 11 métodos.
	public void añadirEmpleado(Persona p) {
		trabajadores.add(p);
	}
	
	public void añadirEmpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac) {
		trabajadores.add(new Persona(nombre, new DNI(DNI), sueldo, fechaNac));
	}
	
	//Ejercicio 14 métodos.
	public int getTotalEmpleados() {
		int n_trabajadores=trabajadores.size();
		return n_trabajadores;
	}
	
	public int getTotalEmpleadosMileuristas() {
		int contador=0;
		for(int i=0;i<trabajadores.size();i++) {
			if(trabajadores.get(i).isMileurista()) {
				contador++;
			}
		}
		return contador;
	}
	
	public List<Persona> getMileuristas() {
		List<Persona> listaMileuristas = new ArrayList<>();
		for(int i=0;i<trabajadores.size();i++) {
			if(trabajadores.get(i).isMileurista()) {
				listaMileuristas.add(trabajadores.get(i));
			}
		}
		return listaMileuristas;
	}
	
	public boolean trabaja(Persona p) {
		boolean trabaja=false;
		boolean repetir=true;
		for(int i=0;i<trabajadores.size()&&repetir;i++) {
			if(trabajadores.get(i).equals(p)) {
				trabaja=true;
				repetir=false;
			}
		}
		return trabaja;
	}
	
	public void pagarEmpleados() {
		for(int i=0;i<trabajadores.size();i++) {
			CuentaCorriente cuenta=trabajadores.get(i).getCuentaCorriente();
			cuenta.añadirDinero((int) trabajadores.get(i).getSueldo());
		}
	}
	
	public void mostrarInformeEmpleados() {
		for(int i=0;i<trabajadores.size();i++) {
			System.out.println("Nombre: "+trabajadores.get(i).getNombre()+"Sueldo: "+trabajadores.get(i).getSueldo()+"¿Es mileurista?: "+trabajadores.get(i).isMileurista());
		}
	}
	
	//Ejercicio 17 CheckedException.
	public double getSueldoMedio() throws Exception {
		double suma=0;
		double media=0;
		if(trabajadores.size()!=0) {
			for(int i=0;i<trabajadores.size();i++) {
				suma+=trabajadores.get(i).getSueldo();
			}
			media=suma/trabajadores.size();
		}else {
			Exception e = new Exception("No hay empleados.");
			throw e;
		}
		return media;
	}
}
