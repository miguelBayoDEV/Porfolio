import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca número del mes (entre 1 y 12): ");
		int mes = s.nextInt();
		System.out.println("Introduzca año: ");
		int año = s.nextInt();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy eeee");
		int día = 0;
		boolean repetir = true;
		while(repetir) {
			día++;
			LocalDate ld = LocalDate.of(año, mes, día);
			String fecha = ld.format(formato);
			System.out.println(fecha);
			boolean con = (día==28||día==29&&mes==2)||(día==30&&mes==4||mes==6||mes==9||mes==11)||(día==31&&mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12);
			if(con) {
				repetir = false;
			}
		}
		
	}

}
