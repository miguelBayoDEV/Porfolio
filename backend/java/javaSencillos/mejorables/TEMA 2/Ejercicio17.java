import java.lang.*;

public class Ejercicio17{
	public static void main(String[] args){
		int sueldo = 200;
		int sueldoPorAlumno = 15;
		int alumnos =30;
		int mensualidadAcademia=100;
		
		int sueldoProfesor=(sueldoPorAlumno*alumnos)+sueldo;
		int ganaciasAcademia=(mensualidadAcademia*alumnos)-sueldoProfesor;
		
		System.out.println("El profesor gana unos "+sueldoProfesor+" Y la academia esta ingresando "+ganaciasAcademia+" mensuales");
		
		
	}
}