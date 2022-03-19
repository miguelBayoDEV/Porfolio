import java.lang.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		List<LocalDate> mes = new ArrayList<>();
		DateTimeFormatter p= DateTimeFormatter.ofPattern("dd/MMMM/yyyy eeee");
		boolean repetir = true;
		while(repetir) {
			try {
				int n = Integer.parseInt(args[0]);
				if(n>0&&n<=12) {
					LocalDate f1 = LocalDate.of(2019, n, 1);
					int t = f1.lengthOfMonth();
					for(int i=1;i<=t;i++) {
						f1 = LocalDate.of(2019, n, i);
						mes.add(f1);
					}
					for(int i=0;i<mes.size();i++) {
						LocalDate f = mes.get(i);
						System.out.println(f.format(p));
					}
					System.out.println("Su tamaño de la lista es: "+mes.size());
					repetir = false;
				}else {
					System.out.println("Debes introducir un número del 1 al 12.");
					repetir = false;
				}
			}catch(NumberFormatException error) {
				System.out.println("Debes introducir un número del 1 al 12.");
				repetir = false;
			}
		}
			
	}

}
