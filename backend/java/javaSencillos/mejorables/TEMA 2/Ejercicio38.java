import java.lang.*;
public class Ejercicio38{
	public static void main(String[] args) {
		String primerDato = args[0];
		String ultimoDato = args[args.length-1]; //para hallar el último, usamos el total -1
		int totalArgumentos = args.length;
		System.out.println ("¿Cuantos argumentos hay?" +totalArgumentos);
		System.out.println (primerDato);
		System.out.println (ultimoDato);
	}
}