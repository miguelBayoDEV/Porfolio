import java.lang.*;
public class Ejercicio40 {
	public static void main(String[] args){
		int x = 2;
		// Podr�a hacerse tambi�n: int ecuaci�n = 3*(x*x)-8*x; luego: boolean resultado = ecuaci�n == 3;
		boolean ecuaci�n = (3*(x*x)-(8*x)) == 3;
		System.out.println("x=2,�Es soluci�n de est� ecuaci�n: 3x^2-8x=3? "+ecuaci�n);
	}
}