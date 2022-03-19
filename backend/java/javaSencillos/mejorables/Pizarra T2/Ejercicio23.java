import java.lang.*;
public class Ejercicio23 {
	public static void main(String[] args){
		int preguntasExamen = 30;
		int preguntasAlumno_bien = 22;
		int preguntasAlumno_mal = 6;
		int resta = 3;
		int puntosAlumno_restado = preguntasAlumno_mal/resta;
		int preguntasAlumno_sinContestar = 2;
		int nulo = preguntasAlumno_sinContestar - preguntasAlumno_sinContestar;
		double notaAlumno_finalPreguntas = preguntasAlumno_bien - puntosAlumno_restado + nulo;
		double notaAlumno_final = (notaAlumno_finalPreguntas/preguntasExamen)*10;
		System.out.println("La nota de un alumno que tiene 22 preguntas bien, 6 mal y 2 sin contestar es: "+notaAlumno_final+" puntos.");
	}
}