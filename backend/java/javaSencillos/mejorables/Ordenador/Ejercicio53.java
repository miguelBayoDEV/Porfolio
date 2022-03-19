import java.lang.*;
public class Ejercicio53 {
	public static void main(String[] args){
		double b = 1;
		double a = 0;
		double ecuación = ((b-a)/6)*(a + 4*((a+b)/2)+b);
		System.out.println("El cálculo aproximado de dicha integral es: "+ecuación);
	}
}