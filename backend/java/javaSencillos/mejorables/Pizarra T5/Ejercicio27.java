import java.lang.*;
import java.util.*;
public class Ejercicio27 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = s.nextLine();
		String f = frase.replace(" ", ""); //Le quito los espacios.
		System.out.println(f);
		System.out.println("Descomposición de la frase en letras: ");
		for(int i=0;i<f.length();i++) {
			System.out.println(f.charAt(i));
		}
	}

}
