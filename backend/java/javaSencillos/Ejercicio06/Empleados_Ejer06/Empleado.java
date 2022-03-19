package Empleados_Ejer06;

public class Empleado {

	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String mail;
	private boolean director;
	
	
	public Empleado(String nombre, String apellido, String direccion, String dni, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.mail = mail;
		this.director = false;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public boolean isDirector() {
		return director;
	}


	public void setDirector(boolean director) {
		this.director = director;
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", dni=" + dni
				+ ", mail=" + mail + ", director=" + director + "]";
	}
	
}
