import java.lang.*;
import java.time.*;
public class Ejercicio44 {

	public static void main(String[] args) {
		// Crear programa que muestre el nombre del día de la semana del 28 febrero 2100.
		//Creo una constante de febrero. Esta sería otra forma: final Month FEBRERO = Month.FEBRUARY; LocalDate ld = LocalDate.of(2100, FEBRERO, 28);
		int febrero = 2;
		LocalDate ld = LocalDate.of(2100, febrero, 28);
		DayOfWeek d = ld.getDayOfWeek();
		String n = d.name();
		System.out.println("El nombre del día de la semana del 28 de febrero de 2100 es: "+n); //Domingo=SUNDAY.
	}

}
