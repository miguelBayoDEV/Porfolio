package Ejer38_EstructuraEstudianteProfesor;

import java.time.LocalDate;

public class Estudiante implements Persona {

	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;
	private String direccion;
	private String email;
	private String numeroTelefono;
	
	
	public Estudiante() {
		super();
	}


	public Estudiante(String nombre, String apellidos, String dni, LocalDate fechaNacimiento, String direccion,
			String email, String numeroTelefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.email = email;
		this.numeroTelefono = numeroTelefono;
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


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", numeroTelefono=");
		builder.append(numeroTelefono);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public String datosPersonales() {
		return toString();
	}
	
	
}
