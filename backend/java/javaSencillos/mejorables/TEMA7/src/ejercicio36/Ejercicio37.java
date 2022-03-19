package ejercicio36;

import java.util.*;

/*	
	Haz un programa que cree una lista de 10 objetos Persona del 
	ejercicio anterior y utilice el método Collections.sort para ordenarla
	(es posible hacerlo porque el método Collections.sort funciona 
	cuando sus objetos implementan Comparable).
	Al final, el programa hará un recorrido y mostrará 
	los nombres de las personas y sus alturas.
*/

public class Ejercicio37 {

	public static void main(String[] args) {
		List<Persona> listaPersonas= new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			listaPersonas.add(new Persona("Persona "+i));
		}
		
		Collections.sort(listaPersonas);
		for(Persona p : listaPersonas) {
			System.out.println(p.getNombre()+" "+p.getAltura());
	
		}
	}

}
