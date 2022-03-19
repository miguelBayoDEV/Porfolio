package NotasCursoJava_Ejer09;

public class Nota {

	private AsignaturaJava asignatura;
	private double calificacion;
	
	
	public Nota(AsignaturaJava asignatura, double calificacion) {
		super();
		this.asignatura = asignatura;
		this.calificacion = calificacion;
	}


	public AsignaturaJava getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(AsignaturaJava asignatura) {
		this.asignatura = asignatura;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}


	@Override
	public String toString() {
		return "Nota [asignatura=" + asignatura + ", calificacion=" + calificacion + "]";
	}
	
}
