package ejercicio3_t6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// Haz un programa que reciba un número como argumento de la línea de comandos. 
		
			try {
				String numero = args[0];
				
				int mes = Integer.parseInt(numero);
			
				if (mes>=1 && mes<=12) {
					
					List <String> dias = new ArrayList<>();
					

					int dia=1;
					
					DateTimeFormatter patron= DateTimeFormatter.ofPattern("dd/MM/YYYY");
					
					boolean repetir=true;
					
					LocalDate fecha= LocalDate.of(2019, mes, dia);
					int diam= fecha.lengthOfMonth();
					
					while(repetir) {
						
						if(diam>=1) {
							
							fecha= LocalDate.of(2019, mes, dia);
							
							String formato= fecha.format(patron);
							
							dias.add(formato);
							
							dia ++;
							diam--;	
							
						}else {
							repetir=false;
						}
						
					}
					
					for (int i =0; i<dias.size() ; i++) {
						
						System.out.println("Los dias son "+ dias.get(i));
					}
					
					
				}else {
					
					System.out.println("Debe introducir un numero entre 1 y 12");
				}
			}catch (ArrayIndexOutOfBoundsException error) {
				
				System.out.println("Debe introducir un numero entre 1 y 12");
			}

	}

}
