import java.lang.*;
public class Ejercicio28{
	public static void main(String[] args){
		// double nota=5.5;
		String nota=args[0];
		final double APROBADO=5;
		int notaNumero=Integer.parseInt(nota);
		boolean estaAprob=notaNumero >= APROBADO;
		System.out.println("¿Está aprobado? "+estaAprob);
		System.out.println("¿Está suspenso? "+!estaAprob);
	}
}