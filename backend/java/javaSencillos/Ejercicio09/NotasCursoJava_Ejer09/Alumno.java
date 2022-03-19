package NotasCursoJava_Ejer09;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String dni;
	private String email;
	private List<Nota> notas;
	
	
	public Alumno(String nombre, String apellidos, String dni, String email) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.notas = new ArrayList<>();
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public List<Nota> getNotas() {
		return notas;
	}


	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	public void addNota(Nota nota) {
		this.notas.add(nota);
	}


	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", email=" + email
				+ ", notas=" + notas + "]";
	}
	
}
