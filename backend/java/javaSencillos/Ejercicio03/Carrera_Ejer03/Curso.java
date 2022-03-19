package Carrera_Ejer03;

public class Curso {

	private String tipoCurso;
	private Carrera carrera;
	
	
	public Curso(String tipoCurso, Carrera carrera) {
		this.tipoCurso = tipoCurso;
		this.carrera = carrera;
	}
	
	
	public String getNombre() {
		return tipoCurso;
	}
	public void setNombre(String tipoCurso) {
		this.tipoCurso = tipoCurso;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
	@Override
	public String toString() {
		return "Curso [tipoCurso=" + tipoCurso + "]";
	}
	
}
