import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Ejercicio1_MiguelPuertaBayo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca d�a: ");
		int dia = s.nextInt();
		System.out.println("Introduzca mes: ");
		int mes = s.nextInt();
		System.out.println("Introduzca a�o: ");
		int a�o = s.nextInt();
		int a�o1 = 0;
		//Apartado a.
		LocalDate fecha = LocalDate.of(a�o, mes, dia);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String f = fecha.format(formato);
		//Creo otros objetos de la clase LocalDate.
		LocalDate fecha1 = LocalDate.of(a�o, 9, 15);
		
		if(fecha.isAfter(fecha1)||fecha.equals(fecha1)) {
			a�o1 = a�o+1;
			String recorte = Integer.toString(a�o1);
			String re = recorte.substring(2, recorte.length());
			System.out.println("Fecha "+f+" corresponde al curso "+a�o+"/"+re);
		}else {
			a�o1 = a�o-1;
			String recorte = Integer.toString(a�o1);
			String re = recorte.substring(2, recorte.length());
			System.out.println("Fecha "+f+" corresponde al curso "+a�o1+"/"+a�o);
		}
		
		//Apartado b.
		if(fecha.isAfter(LocalDate.of(a�o, 9, 14))) {
			System.out.println("Primer Trimestre.");
		}else if(fecha.isAfter(LocalDate.of(a�o, 1, 7))) {
			System.out.println("Segundo Trimestre.");
		}else if(fecha.isAfter(LocalDate.of(a�o, 3, 19))) {
			System.out.println("Tercer Trimestre.");
		}else if(fecha.isBefore(LocalDate.of(a�o, 6, 30))) {
			System.out.println("Verano.");
		}
		
	}

}
