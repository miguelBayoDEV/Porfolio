import java.lang.*;
public class Ejercicio15 {
	public static void main(String[] args){
		// Para que salga el decimal se deben poner todos los tipos de variables con double.
		double funci�n0 = 0;
		double funci�n1 = 1;
		double funci�n2 = (-2);
		// La operaci�n de la potencia es multiplicar el valor por el valor seg�n la potencia.
		double soluci�n0 = (3*((funci�n0/2)*(funci�n0/2)*(funci�n0/2)))/((funci�n0*funci�n0)-funci�n0+3);
		double soluci�n1 = (3*((funci�n1/2)*(funci�n1/2)*(funci�n1/2)))/((funci�n1*funci�n1)-funci�n1+3);
		double soluci�n2 = (3*((funci�n2/2)*(funci�n2/2)*(funci�n2/2)))/((funci�n2*funci�n2)-funci�n2+3);
		System.out.println("Soluci�n f(0) es: "+soluci�n0);
		System.out.println("Soluci�n f(1) es: "+soluci�n1);
		System.out.println("Soluci�n f(2) es: "+soluci�n2);
	}
}