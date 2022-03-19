package NotasCursoJava_Ejer09;

import java.util.ArrayList;
import java.util.List;

public class CursoJava {

	private String nombre;
	private int codigo;
	private List<AsignaturaJava> asignaturas;
	private List<Alumno> alumnos;
	
	
	public CursoJava(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.asignaturas = new ArrayList<>();
		this.alumnos = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public List<AsignaturaJava> getAsignaturas() {
		return asignaturas;
	}


	public void setAsignaturas(List<AsignaturaJava> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void addAsignatura(AsignaturaJava asignatura) {
		this.asignaturas.add(asignatura);
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}


	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", codigo=" + codigo + ", asignaturas=" + asignaturas + ", alumnos=" + alumnos + "]";
	}
	
}
