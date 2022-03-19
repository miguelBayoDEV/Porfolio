package ejercicio16;

import java.util.*;

/**
 * 
 * Haz un programa en el que haya una List<String> para guardar títulos de películas y también haya un Map<String,String> 
 * en el que se va a asociar cada socio de un videoclub con la película que tiene prestada. El programa mostrará este menú:
1. Añadir película
 Pregunta el nombre de una película y la añade a la lista de películas.
2. Añadir socio
 Pregunta el nombre de un socio y añade al Map una entrada cuya clave es el nombre del socio y el valor asociado 
(película alquilada) es null.
3. Prestar película
 Pregunta el nombre de un socio. Si el socio ya tiene una película prestada, mostrará el mensaje “El socio ya tiene una película”.
 En caso contrario, preguntará el nombre de una película. 
Si la película no está en la lista de películas se mostrará el mensaje “Película no disponible”.
 Si la película está en la lista de películas, se borrará de esa lista y se registrará en el Map asociada al socio.
4. Devolver película
 Se preguntará el nombre de un socio y se mirará si tiene una película prestada.
 En caso de no tener ninguna, se mostrará “El socio no tiene ninguna película”
 En caso contrario, la película se añadirá a la lista de películas y en el Map se asociará al socio el valor null.
5. Salir
 */


public class Ejercicio16 {

	public static void main(String[] args) {
		
		List<String> peliculas = new ArrayList<>();
		Map<String,String> socios = new TreeMap<>();
		int opcion=0;
		while(opcion!=5) {
			
			System.out.println("1) añadir película");
			System.out.println("2) añadir socio");
			System.out.println("3) prestar película");
			System.out.println("4) devolver película");
			System.out.println("5) salir");
			
			opcion = Integer.parseInt(new Scanner(System.in).nextLine());
			if(opcion==1) {
				System.out.println("Dime el nombre de la película: ");
				peliculas.add(new Scanner(System.in).nextLine());
			}
			if(opcion==2) {
				System.out.println("Dime el nombre del socio ");
				String socio1= new Scanner(System.in).nextLine();
				socios.put(socio1, null);
			}
			if(opcion==3) {
				System.out.println("Dime el nombre del socio");
				String socio = new Scanner(System.in).nextLine();
				if(socios.get(socio)!=null) {
					System.out.println("El socio ya tiene una película");
				}else {
					System.out.println("Dime el nombre de la película:");
					String peli =  new Scanner(System.in).nextLine();
					if(peliculas.contains(peli)==false) {
						System.out.println("la película no está en la lista");
					}else {
						peliculas.remove(peli);
						socios.put(socio, peli);
					}
				}
			}
			if(opcion==4) {
				System.out.println("Dime el nombre del socio ");
				String socio = new Scanner(System.in).nextLine();
				if(socios.get(socio)==null) {
					System.out.println("El socio no tiene ninguna película prestada");
				}else {
					peliculas.add(socios.get(socio));
					socios.put(socio, null);
				}
			}
		}	
	}
}
