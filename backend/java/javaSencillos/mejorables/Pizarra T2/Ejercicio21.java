import java.lang.*;
public class Ejercicio21 {
	public static void main(String[] args){
		double puntosTeor�a = 40/10;
		double puntosProblemas = 60/10;
		int n�mero_pregunasTeor�a = 8;
		int n�mero_preguntasProblemas = 4;
		double valor_preguntaTeor�a = puntosTeor�a/n�mero_pregunasTeor�a;
		double valor_preguntaProblemas = puntosProblemas/n�mero_preguntasProblemas;
		int preguntasTeor�a_correctasAlumno = 6;
		int preguntasProblemas_correctasAlumno = 1;
		double notaAlumno_teor�a = valor_preguntaTeor�a*preguntasTeor�a_correctasAlumno;
		double notaAlumno_problemas = valor_preguntaProblemas*preguntasProblemas_correctasAlumno;
		double notaAlumno_final = notaAlumno_teor�a+notaAlumno_problemas;
		System.out.println("La nota final del alumno en este examen ser�: "+notaAlumno_final+" puntos.");
	}
}