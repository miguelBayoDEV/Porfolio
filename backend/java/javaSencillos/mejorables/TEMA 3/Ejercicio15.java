package lib;
import java.util.*;
public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		String c=entrada.nextLine();
		System.out.println("Nombre en minusculas :"+ c.toLowerCase());
		System.out.println("Nombre en mayusculas :"+ c.toUpperCase());
		System.out.println("Numero de caracteres :"+ c.length());

	}

}
