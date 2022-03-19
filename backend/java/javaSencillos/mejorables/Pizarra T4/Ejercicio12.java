import java.lang.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Creo scanner.
		System.out.println("Introduzca una fecha (ej:julio/07/1997): ");
		String f = s.nextLine(); //Introduzco fecha.
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
		LocalDate fecha = LocalDate.parse(f, formato);
		LocalDate hoy = LocalDate.now();
		//String formato_hoy = hoy.format(formato);
		boolean condición = fecha.isBefore(hoy);
		if(condición) {
			System.out.println("La fecha introducida es anterior a la fecha de hoy.");
		}else {
			System.out.println("La fecha introducida es igual o posterior a la fecha de hoy.");
		}
	}

}
