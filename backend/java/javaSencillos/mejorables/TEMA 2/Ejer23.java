import java.lang.*;
public class Ejer23{
	public static void main(String[] args){
		int totalPreguntas=30; //Preguntas del examen
		int opcionesPorPreguntas=4; //Opciones por pregunta
		int acertadas=22; //Total acertadas del alumno
		int falladas=6; //Total falladas del alumno
		int noRespondidas=2; //Total no respondidas del alumno
		int preguntasPorFallo=3; //Cuantas preguntas se pueden fallar para que te reste 1 de puntuacion
		int total=acertadas-(falladas/preguntasPorFallo);
		double nota=total*10.0/totalPreguntas;
		
		System.out.println("El alumno tiene "+nota);
	}
}
	