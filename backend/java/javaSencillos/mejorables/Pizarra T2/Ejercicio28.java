import java.lang.*;
public class Ejercicio28 {
	public static void main(String[] args){
		int notaFinal_alumno = 7;
		final int APROBAR = 5;
		// Comprobar si está aprobado o suspenso mediante el tipo boolean. Una constante es en mayúscula todo.
		boolean aprobado = notaFinal_alumno>=APROBAR;
		System.out.println("¿El alumno está aprobado? "+aprobado);
		/*
		boolean suspenso = notaFinal_alumno<=APROBAR;
		System.out.println("¿El alumno está suspenso? "+suspenso);
		*/
	}
}