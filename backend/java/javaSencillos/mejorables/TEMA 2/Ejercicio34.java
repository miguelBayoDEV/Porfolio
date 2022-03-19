import java.lang.*;
public class Ejercicio34{
	public static void main (String[] args) {
		double totalAlumnos=26;
		double alumnosSusprensos=19.5;
		double alumnosAprobados=66;
		
		double numeroA=(totalAlumnos*alumnosAprobados)/100;
		int numeroAprobados= (int)numeroA;
		
		double numeroS=(totalAlumnos*alumnosSusprensos)/100;
		int numeroSuspensos=(int)numeroS;
		//no presentados
		int resto=((int)totalAlumnos)-(numeroAprobados+numeroSuspensos);
		
		System.out.println("El numero de alumnos aprobados es: "+numeroAprobados);
		System.out.println("El numero de alumnos suspensos es: "+numeroSuspensos);
		System.out.println("El numero de alumnos no presentados es: "+resto);
	}
	
}