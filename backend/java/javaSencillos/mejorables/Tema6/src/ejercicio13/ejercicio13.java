package ejercicio13;
import java.util.*;
/*Ejercicio 13 : Crea una lista con 50 números enteros rellenados
  aleatoriamente. El programa usará la clase Collections para ordenarla
  de menor a mayor y luego la mostrará por pantalla.*/
public class ejercicio13 {

	public static void main(String[] args) {
		// Declaracion de variables:
		Random aleatorio = new Random();
		List<Integer> lista = new ArrayList<>();
		
		
		for(int i=0; i<50; i++) {
			lista.add( aleatorio.nextInt(101) );
		}
		
		System.out.println(lista);
		
		Collections.sort(lista);
		System.out.println(lista.toString());
		
		
	}

}
