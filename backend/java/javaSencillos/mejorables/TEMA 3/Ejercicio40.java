import java.lang.*;
import java.util.*;
public class Ejercicio40 {

	public static void main(String[] args) {
		//  Realiza un programa que genere un número aleatorio comprendido entre 29 y 65 y lo muestre por pantalla. 
		// Hay dos formas posibles de hacerlo: con la clase Math y con la clase Random de la “Librería Estándar de Java”. 
		// Mira las dos y haz la que te resulte más fácil. 
		
		Random randomizador= new Random();
		int aleatorio= 29 + randomizador.nextInt(65-29);
		System.out.println("El numero aleatorio es: "+aleatorio);
		
		double aleatorio2 =29+(65-29)* Math.random();
		
		System.out.println("El rsultado aleatorio es: "+aleatorio2);
		
		// Con la clase Random me resulta mas facil aunque algo menos eficiente en la memoria.
		
		
		

	}

}
