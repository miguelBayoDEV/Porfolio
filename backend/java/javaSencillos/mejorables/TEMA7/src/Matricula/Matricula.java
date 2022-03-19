package Matricula;

public class Matricula {

	private static int siguienteNumeroMatricula;
	
	private int numeroMatricula;
	private String nombreAlumno;
	private String nombreAsignatura;
	
	// bloque inicializador estático
	static {
		
		Matricula.siguienteNumeroMatricula = 1;
		
	}
	
	
	public Matricula(String nombreAlumno, String nombreAsignatura) {
		
		this.nombreAlumno=nombreAlumno;
		this.nombreAsignatura=nombreAsignatura;
		this.numeroMatricula=siguienteNumeroMatricula;
		
		Matricula.siguienteNumeroMatricula++;
		
	}
	
	public String getNombreAlumno() {
		
		return nombreAlumno;
		
	}
	
	public String getNombreAsignatura() {
		
		return nombreAsignatura;
		
	}
	
	public int getNumeroMatricula() {
		
		return numeroMatricula;
		
	}
	
}
