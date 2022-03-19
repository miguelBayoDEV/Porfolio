import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio43 {

	public static void main(String[] args) {
		
		LocalDate l =LocalDate.now();
		
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String barra = l.format(fecha);
		
		System.out.println(barra);
		
		DateTimeFormatter fecha2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String guion = l.format(fecha2);
		System.out.println(guion);
		
		
	}

}
