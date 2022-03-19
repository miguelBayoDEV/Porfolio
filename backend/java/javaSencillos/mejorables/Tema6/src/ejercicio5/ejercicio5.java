package ejercicio5;
/*Ejercicio 5 : Realiza un programa que cree una lista y le añada 10 
 muñecos de Mario repartidos sobre la línea central de la pantalla. 
 A continuación, todos los muñecos que ocupen una posición par de la 
 lista comenzarán a andar hacia el punto de coordendas (0,0) y los que
 ocupen una posición impar se dirigirán hacia el punto (1024,0).*/
import bpc.daw.mario.*;
import java.util.*;
public class ejercicio5 {

	public static void main(String[] args) {
		// Declaracion de objetos y variables:
		List<Mario> lista = new ArrayList<>();
		
		// rellenar la lista con muñecos
		for(int i=1; i<=10; i++) {
			lista.add(new Mario(i*100, 300));
		}
		
		
		// recorrer la lista		
		for(int i=0; i<10; i++) {
			if(i%2==0) {
				lista.get(i).andarHacia(0, 0);
			}else {
				lista.get(i).andarHacia(0, 1024);
			}
		}
		
		
		
	}

}
