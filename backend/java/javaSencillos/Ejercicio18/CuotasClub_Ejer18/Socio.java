package CuotasClub_Ejer18;

public class Socio {

	private String nombre;
	private String apellidos;
	private String dni;
	private String telefono;
	private int edad;
	private boolean mujer;
	private boolean padreSocio;
	
	
	public Socio() {
		super();
	}


	public Socio(String nombre, String apellidos, String dni, String telefono, int edad, boolean mujer,
			boolean padreSocio) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.telefono = telefono;
		this.edad = edad;
		this.mujer = mujer;
		this.padreSocio = padreSocio;
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


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isMujer() {
		return mujer;
	}


	public void setMujer(boolean mujer) {
		this.mujer = mujer;
	}


	public boolean isPadreSocio() {
		return padreSocio;
	}


	public void setPadreSocio(boolean padreSocio) {
		this.padreSocio = padreSocio;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", mujer=");
		builder.append(mujer);
		builder.append(", padreSocio=");
		builder.append(padreSocio);
		builder.append("]");
		return builder.toString();
	}
}
