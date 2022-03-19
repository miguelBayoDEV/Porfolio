package ejercicio5;
/*Ejercicio 5 : Realiza un programa que cree una lista y le a�ada 10 
 mu�ecos de Mario repartidos sobre la l�nea central de la pantalla. 
 A continuaci�n, todos los mu�ecos que ocupen una posici�n par de la 
 lista comenzar�n a andar hacia el punto de coordendas (0,0) y los que
 ocupen una posici�n impar se dirigir�n hacia el punto (1024,0).*/
import bpc.daw.mario.*;
import java.util.*;
public class ejercicio5 {

	public static void main(String[] args) {
		// Declaracion de objetos y variables:
		List<Mario> lista = new ArrayList<>();
		
		// rellenar la lista con mu�ecos
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
