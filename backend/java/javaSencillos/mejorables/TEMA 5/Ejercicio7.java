package T5_ejercicio7;
import java.lang.*;
import java.util.*;
public class Ejercicio7 {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escriba una frase: ");
		String frase = s.nextLine();
		StringTokenizer st = new StringTokenizer(frase, " ,./:;");
		int contador = 0;
		boolean repetir = true;
		while(repetir) {
			String palabra = st.nextToken();
			contador++;
			System.out.println(palabra);
			if(!st.hasMoreElements()) {
				repetir = false;
			}
		}
		System.out.println("Número total de palabras: "+contador);
	}

}
