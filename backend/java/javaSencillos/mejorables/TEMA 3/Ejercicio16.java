/*Ejercicio 16 : Consulta la documentación de la clase String para hacer un programa que pregunte
  una frase al usuario y se muestre la letra que hay justo en la mitad de la frase.*/
import java.util.Scanner;
import java.lang.*;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		//Declaracion de objetos y variables:
		Scanner teclado = new Scanner(System.in);
		String frase = " ";
		int puntoMedio = 0;
		char letra = '0';
		
		//Uso de metodos y variables:
		System.out.println("Introduzca una frase: ");
		frase=teclado.nextLine();
		puntoMedio=frase.length()/2;
		letra=frase.charAt(puntoMedio);
		
		System.out.println("El caracter intermedio es: "+letra);
		
		
		
	}

}
