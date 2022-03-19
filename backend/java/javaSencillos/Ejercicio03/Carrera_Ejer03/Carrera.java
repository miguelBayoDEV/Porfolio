package Carrera_Ejer03;

public class Carrera {

	private String nombre;
	private int codigo;
	
	
	public Carrera(String nombre, int codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigoCarrera() {
		return codigo;
	}
	public void setCodigoCarrera(int codigo) {
		this.codigo = codigo;
	}
	
	
	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", codigoCarrera=" + codigo + "]";
	}
	
}
