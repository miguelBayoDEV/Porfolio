package ejercicio4;
import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		List<String> lista = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			String palabra= entrada.nextLine();
			lista.add(palabra);
		}
		
		for(int i=0;i<lista.size();i++) {
			String dato= lista.get(i);
			System.out.println(dato);
		}
		
		for(String s:lista) {
			System.out.println(s);
		}
		

	}

}
