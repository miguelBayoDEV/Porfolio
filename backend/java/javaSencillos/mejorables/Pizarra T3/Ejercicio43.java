import java.lang.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio43 {

	public static void main(String[] args) {
		// Crear un programa que muestre fecha actual por pantalla en dos formatos.
		LocalDate ld = LocalDate.now(); //Fecha actual.
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		String s1 = ld.format(f1);
		String s2 = ld.format(f2);
		System.out.println("Primer formato de la fecha actual es así: "+s1);
		System.out.println("Segundo formato de la fecha actual es así: "+s2);
	}

}
