package daw.comparable;
import java.util.*;

public class Persona implements Comparable<Persona> {
	
	//Ejercicio 36.
	private String nombre;
	private double altura;
	
	public Persona(String nombre) {
		this.nombre=nombre;
		altura=1.50+(2.10-1.50)*Math.random();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public int compareTo(Persona objeto) {
		altura-=objeto.getAltura();
		return (int) altura;
	}
}
