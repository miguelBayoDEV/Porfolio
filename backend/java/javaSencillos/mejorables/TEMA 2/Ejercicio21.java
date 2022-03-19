import java.lang.*;
public class Ejercicio21{
	public static void main(String[]args){
		// datos
		double problemasBien=1;
		double teoriaBien=6;
		double totalProblemas=6;
		double totalTeoria=4;
		double numeroProblemas=4;
		double numeroTeoria=8;
		// cálculos
		double unaTeoria=totalTeoria/numeroTeoria;
		double unProblema=totalProblemas/numeroProblemas;
		double totalAlumno=teoriaBien*unaTeoria+problemasBien*unProblema;
		// presentación
		System.out.println("La nota del alumno será un: "+totalAlumno);
	}
}