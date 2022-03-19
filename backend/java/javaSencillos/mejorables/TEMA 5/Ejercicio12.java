package t5Ejercicio12;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el numero de un mes: ");
		int mes= entrada.nextInt();
		System.out.println("Introduce un año: ");
		int año= entrada.nextInt();
		int dia=1;
		boolean repetir=true;
		
	
		DateTimeFormatter patron= DateTimeFormatter.ofPattern("dd/MM/YYYY eeee");
		
		LocalDate fecha= LocalDate.of(año, mes, dia);
		int diam= fecha.lengthOfMonth();
		
		
		while(repetir) {
			if(diam>=1) {
				
				fecha= LocalDate.of(año, mes, dia);
				String formato= fecha.format(patron);
				
				System.out.println(formato);
				dia ++;
				diam--;
			}else {
				repetir=false;
			}
			
		}
		
		

	}

}
