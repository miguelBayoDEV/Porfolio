package ejercicio7;
import java.util.*;
public class ej7tema4 {

	public static void main(String[] args) {
		String palabra="hola";
		System.out.print("Introduce un numero que este comprendido entre la longitud de la palabra y el 0");
		Scanner S=new Scanner(System.in);
		int numero=S.nextInt();
		int longitud=palabra.length();
		if(numero>=0&&numero<=longitud) { 
			char fin=palabra.charAt(numero-1);
			System.out.print("El carcter es: "+fin );
		}else {
			System.out.print("Intoduce un carracter valido entre 0 y"+longitud);
		}

	}

}
