import java.lang.*;
import java.util.*;
public class Actividad36Tema3 {
	public static void main(String[] args) {
	
		//Hacer un programa que calcule las dos soluciones de la ecuacion x cuadrado-5x+6
		
		//Primero guardamos las variables a, b y c
	
		double a=1;
		double b=-5;
		double c=6;
		
		//Escribimos la formula de las ecuaciones de segundo grado dos veces, para hacer los dos valores de X primero en positivo y luego en negativo.
		
		double cuadrado=Math.pow(b, 2);
		double raiz=Math.sqrt(cuadrado-4*a*c);
		
		double x1= (-b+(raiz))/2*a;
		double x2= (-b-(raiz))/2*a;
		
		//Mostramos por pantalla los resultados
		
		System.out.println("Al resolverla tenemos que una X vale: "+x1+" y la otra X vale: "+x2);
		
	}

}
