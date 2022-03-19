import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca n�mero del mes (entre 1 y 12): ");
		int mes = s.nextInt();
		System.out.println("Introduzca a�o: ");
		int a�o = s.nextInt();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy eeee");
		int d�a = 0;
		boolean repetir = true;
		while(repetir) {
			d�a++;
			LocalDate ld = LocalDate.of(a�o, mes, d�a);
			String fecha = ld.format(formato);
			System.out.println(fecha);
			boolean con = (d�a==28||d�a==29&&mes==2)||(d�a==30&&mes==4||mes==6||mes==9||mes==11)||(d�a==31&&mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12);
			if(con) {
				repetir = false;
			}
		}
		
	}

}
