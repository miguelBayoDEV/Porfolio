import java.lang.*;
public class Ejercicio44 {
	public static void main(String[] args){
		/*
		int a = 5;
		int b = 4;
		int c = 3;
		*/
		String letraA = args[0];
		String letraB = args[1];
		String letraC = args[2];
		int a = Integer.parseInt(letraA);
		int b = Integer.parseInt(letraB);
		int c = Integer.parseInt(letraC);
		boolean rectángulo = a*a==(b*b)+(c*c);
		boolean acutángulo = a*a<(b*b)+(c*c);
		boolean obtusángulo = a*a>(b*b)+(c*c);
		System.out.println("¿Es un rectángulo? "+rectángulo);
		System.out.println("¿Es un acutángulo? "+acutángulo);
		System.out.println("¿Es un obtusángulo? "+obtusángulo);
				
	}
}