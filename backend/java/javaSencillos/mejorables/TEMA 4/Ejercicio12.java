package Ejercicio12;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un dia");
		int dia = s.nextInt();
		System.out.println("Introduce un mes");
		int mes = s.nextInt();
		System.out.println("Introduce un año");
		int año = s.nextInt();
		
		LocalDate fecha = LocalDate.of(año, mes, dia);
		String fech1 = fecha.format(DateTimeFormatter.ofPattern("MM/dd/yy"));
		
		LocalDate hoy = LocalDate.now();
		String hoy1 = hoy.format(DateTimeFormatter.ofPattern("MM/dd/yy"));
				
		if(fecha.isBefore(hoy)) {
			System.out.println("La fecha introducida es anterior a la fecha de hoy");
		}else {
			System.out.println("La fecha introducida es igual o posterior a la fecha de hoy");
		}
		
	}

}
