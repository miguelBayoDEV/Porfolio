import java.lang.*;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		
	List<String> lista = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	for(int i=10;i>0;i--) {
		System.out.println("Introduzca una palabra: ");
		String p = s.nextLine();
		lista.add(p);
	}
	System.out.println("Se muestra las palabras de las listas: ");
	for(int i=0;i<lista.size();i++) {
		System.out.println(lista.get(i));
	}
	}

}
