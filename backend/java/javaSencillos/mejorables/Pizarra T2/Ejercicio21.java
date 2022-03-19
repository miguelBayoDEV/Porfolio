import java.lang.*;
public class Ejercicio21 {
	public static void main(String[] args){
		double puntosTeoría = 40/10;
		double puntosProblemas = 60/10;
		int número_pregunasTeoría = 8;
		int número_preguntasProblemas = 4;
		double valor_preguntaTeoría = puntosTeoría/número_pregunasTeoría;
		double valor_preguntaProblemas = puntosProblemas/número_preguntasProblemas;
		int preguntasTeoría_correctasAlumno = 6;
		int preguntasProblemas_correctasAlumno = 1;
		double notaAlumno_teoría = valor_preguntaTeoría*preguntasTeoría_correctasAlumno;
		double notaAlumno_problemas = valor_preguntaProblemas*preguntasProblemas_correctasAlumno;
		double notaAlumno_final = notaAlumno_teoría+notaAlumno_problemas;
		System.out.println("La nota final del alumno en este examen será: "+notaAlumno_final+" puntos.");
	}
}