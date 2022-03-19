package daw.comparable;
import java.util.*;

public class Ejercicio37 {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona("Elv"));
		lista.add(new Persona("Mir"));
		lista.add(new Persona("Sa"));
		lista.add(new Persona("Melo"));
		lista.add(new Persona("Jen"));
		lista.add(new Persona("Pil"));
		lista.add(new Persona("Jul"));
		lista.add(new Persona("Alm"));
		lista.add(new Persona("Clo"));
		lista.add(new Persona("Silv"));
		Collections.sort(lista);;
		
		for(Persona p:lista) {
			System.out.println("Nombre: "+p.getNombre()+"--> Altura: "+p.getAltura());
		}
		//System.out.println("Lista ordenada de menor a mayor: "+lista.toString());
	}

}
