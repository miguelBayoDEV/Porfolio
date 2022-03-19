import java.lang.*;
public class Ejercicio17 {
	public static void main(String[] args){
		// Sueldo fijo del universitario.
		int suledoMensual = 200;
		int alumnos = 30;
		// Sueldo mensual del universitario.
		int sueldoMensual1 = 15*alumnos;
		// Sueldo total al mes del universitario.
		int sueldoTotal_mensual = suledoMensual+sueldoMensual1;
		System.out.println("El estudiante que da clases particulares gana "+sueldoTotal_mensual+" euros al mes.");
		// 	Pago de cada alumno a la academia.
		int pago_cadaAlumno = 100;
		// Ganancia por pago alumnos de academia.
		int pagoAlumno_academia = pago_cadaAlumno*alumnos;
		// Ganancia final de la academia quitando el sueldo del universitario.
		int gananciaAcademia = pagoAlumno_academia-sueldoTotal_mensual;
		System.out.println("La academia ganará: "+gananciaAcademia+" euros al mes.");
	}
}