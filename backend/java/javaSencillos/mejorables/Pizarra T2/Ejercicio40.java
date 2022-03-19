import java.lang.*;
public class Ejercicio40 {
	public static void main(String[] args){
		int x = 2;
		// Podría hacerse también: int ecuación = 3*(x*x)-8*x; luego: boolean resultado = ecuación == 3;
		boolean ecuación = (3*(x*x)-(8*x)) == 3;
		System.out.println("x=2,¿Es solución de está ecuación: 3x^2-8x=3? "+ecuación);
	}
}