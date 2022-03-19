package Carrera_Ejer03;

public class Asignatura {

	private String nombre;
	private int codigoNumerico;
	private Curso curso;
	
	
	public Asignatura(String nombre, int codigoNumerico, Curso curso) {
		this.nombre = nombre;
		this.codigoNumerico = codigoNumerico;
		this.curso = curso;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigoNumerico() {
		return codigoNumerico;
	}
	public void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigoNumerico=" + codigoNumerico + ", curso=" + curso +  ", carrera=" + curso.getCarrera() + "]";
	}
	
}
