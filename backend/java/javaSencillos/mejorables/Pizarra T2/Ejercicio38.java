import java.lang.*;
public class Ejercicio38{
	public static void main(String[] args){
		System.out.println("Total de argumentos: "+args.length+".");
		System.out.println("Primer argumento: "+args[0]);
		/*
		La variable f seria el ultimo argumento porque le 
		resta 1 al total de argumentos, ya que siempre se 
		empieza por 0 y no por 1.
		*/
		int f = args.length - 1;
		System.out.println("Ultimo argumento: "+args[f]);
	}
}