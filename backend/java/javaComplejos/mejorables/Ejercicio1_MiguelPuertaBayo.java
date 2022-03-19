import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio1_MiguelPuertaBayo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca día: ");
		int dia = s.nextInt();
		System.out.println("Introduzca mes: ");
		int mes = s.nextInt();
		System.out.println("Introduzca año: ");
		int año = s.nextInt();
		int año1 = 0;
		//Apartado a.
		LocalDate fecha = LocalDate.of(año, mes, dia);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String f = fecha.format(formato);
		//Creo otros objetos de la clase LocalDate.
		LocalDate fecha1 = LocalDate.of(año, 9, 15);
		
		if(fecha.isAfter(fecha1)||fecha.equals(fecha1)) {
			año1 = año+1;
			String recorte = Integer.toString(año1);
			String re = recorte.substring(2, recorte.length());
			System.out.println("Fecha "+f+" corresponde al curso "+año+"/"+re);
		}else {
			año1 = año-1;
			String recorte = Integer.toString(año1);
			String re = recorte.substring(2, recorte.length());
			System.out.println("Fecha "+f+" corresponde al curso "+año1+"/"+año);
		}
		
		//Apartado b.
		if(fecha.isAfter(LocalDate.of(año, 9, 14))) {
			System.out.println("Primer Trimestre.");
		}else if(fecha.isAfter(LocalDate.of(año, 1, 7))) {
			System.out.println("Segundo Trimestre.");
		}else if(fecha.isAfter(LocalDate.of(año, 3, 19))) {
			System.out.println("Tercer Trimestre.");
		}else if(fecha.isBefore(LocalDate.of(año, 6, 30))) {
			System.out.println("Verano.");
		}
		
	}

}
