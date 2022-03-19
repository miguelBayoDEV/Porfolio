import java.lang.*;
public class Ejercicio52{
	public static void main (String[] args){

		int a = 1;
		int b = -3;
		int c = 1;
		int d = 5;
		int e = 2;
		int f = 10;
        
        int determinante = (a*d) - (c*b); 

		double x = ((e*d)-(b*f))/determinante;
		double y = ((a*f)-(c*e))/determinante;

		System.out.println("La x vale "+x+" y la y vale "+y);
	}
} 