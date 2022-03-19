package NotasCursoJava_Ejer09;

public class AsignaturaJava {

	private String nombre;
	private int codigo;
	private Profesor profesor;
	
	public AsignaturaJava(String nombre, int codigo, Profesor profesor) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.profesor = profesor;
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

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + ", profesor=" + profesor
				+ "]";
	}
	
}
