package ej3;
import java.util.*;
public class ej3 {

	public static void main(String[] args) {

		//Se pregunta un número al usuario
		System.out.println("Introduce un número");
		Scanner s = new Scanner(System.in);
		double numero = s.nextDouble();
		
		//Si es positivo, se muestra su raíz cuadrada y su logatirmo neperiano
		//En caso contrario, se muestra por pantalla "el número introducido debe ser positivo"
		
		if(numero>=0) {
			double raiz = Math.sqrt(numero);
			double nep = Math.log(numero);
			System.out.println("La raíz cuadrada de "+numero+" es "+raiz+" y el logaritmo neperiano es "+nep);
		}else {
			System.out.println("El número introducido debe ser positivo");
		}
	
	}

}
