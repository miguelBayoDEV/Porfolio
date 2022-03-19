package ejercicio16;

import java.util.*;

/**
 * 
 * Haz un programa en el que haya una List<String> para guardar t�tulos de pel�culas y tambi�n haya un Map<String,String> 
 * en el que se va a asociar cada socio de un videoclub con la pel�cula que tiene prestada. El programa mostrar� este men�:
1. A�adir pel�cula
 Pregunta el nombre de una pel�cula y la a�ade a la lista de pel�culas.
2. A�adir socio
 Pregunta el nombre de un socio y a�ade al Map una entrada cuya clave es el nombre del socio y el valor asociado 
(pel�cula alquilada) es null.
3. Prestar pel�cula
 Pregunta el nombre de un socio. Si el socio ya tiene una pel�cula prestada, mostrar� el mensaje �El socio ya tiene una pel�cula�.
 En caso contrario, preguntar� el nombre de una pel�cula. 
Si la pel�cula no est� en la lista de pel�culas se mostrar� el mensaje �Pel�cula no disponible�.
 Si la pel�cula est� en la lista de pel�culas, se borrar� de esa lista y se registrar� en el Map asociada al socio.
4. Devolver pel�cula
 Se preguntar� el nombre de un socio y se mirar� si tiene una pel�cula prestada.
 En caso de no tener ninguna, se mostrar� �El socio no tiene ninguna pel�cula�
 En caso contrario, la pel�cula se a�adir� a la lista de pel�culas y en el Map se asociar� al socio el valor null.
5. Salir
 */


public class Ejercicio16 {

	public static void main(String[] args) {
		
		List<String> peliculas = new ArrayList<>();
		Map<String,String> socios = new TreeMap<>();
		int opcion=0;
		while(opcion!=5) {
			
			System.out.println("1) a�adir pel�cula");
			System.out.println("2) a�adir socio");
			System.out.println("3) prestar pel�cula");
			System.out.println("4) devolver pel�cula");
			System.out.println("5) salir");
			
			opcion = Integer.parseInt(new Scanner(System.in).nextLine());
			if(opcion==1) {
				System.out.println("Dime el nombre de la pel�cula: ");
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
					System.out.println("El socio ya tiene una pel�cula");
				}else {
					System.out.println("Dime el nombre de la pel�cula:");
					String peli =  new Scanner(System.in).nextLine();
					if(peliculas.contains(peli)==false) {
						System.out.println("la pel�cula no est� en la lista");
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
					System.out.println("El socio no tiene ninguna pel�cula prestada");
				}else {
					peliculas.add(socios.get(socio));
					socios.put(socio, null);
				}
			}
		}	
	}
}
