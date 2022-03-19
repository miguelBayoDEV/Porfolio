package Ejercicio3Tema6;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		int argumentos = args.length;
		
		try {
			
			if (argumentos!=0) {
				List<String> fechas = new ArrayList<>();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				
				for (int i=0; i<argumentos;i++) {
					LocalDate diaMes = LocalDate.of(2019, 12, Integer.parseInt(args[i]));
					String fechasFormato = diaMes.format(formato);
					fechas.add(fechasFormato);
				}
				
				int tamaño = fechas.size();
				System.out.println("El tamaño de la lista es de: "+tamaño+ " fechas");
				Iterator<String> lista = fechas.iterator();
				System.out.println("Las fechas que contiene la lista son:");
				
				while (lista.hasNext()) {
					System.out.println(lista.next());
				}
				
			}else if (argumentos==0) {
				System.out.println("Debe introducir un número entre 1 y 12");
			}
			
		} catch(NumberFormatException error) {
			System.out.println("Debe introducir un número entre 1 y 12");
		}

	}

}
