import java.lang.*;
public class Ejercicio34 {
	public static void main(String[] args){
		int alumnosTotal = 26;
		double aprobado = (alumnosTotal*66)/100;
		double suspenso = (alumnosTotal*19.5)/100;
		int alumnoAprobado = (int) aprobado;
		int alumnoSuspenso = (int) suspenso;
		int alumnoNo_presentado = alumnosTotal-(alumnoAprobado+alumnoSuspenso);
		System.out.println("Alumnos aprobados: "+alumnoAprobado);
		System.out.println("Alumnos suspensos: "+alumnoSuspenso);
		System.out.println("Alumnos no presentados: "+alumnoNo_presentado);
	}
}