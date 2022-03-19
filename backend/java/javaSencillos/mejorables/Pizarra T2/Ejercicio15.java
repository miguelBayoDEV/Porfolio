import java.lang.*;
public class Ejercicio15 {
	public static void main(String[] args){
		// Para que salga el decimal se deben poner todos los tipos de variables con double.
		double función0 = 0;
		double función1 = 1;
		double función2 = (-2);
		// La operación de la potencia es multiplicar el valor por el valor según la potencia.
		double solución0 = (3*((función0/2)*(función0/2)*(función0/2)))/((función0*función0)-función0+3);
		double solución1 = (3*((función1/2)*(función1/2)*(función1/2)))/((función1*función1)-función1+3);
		double solución2 = (3*((función2/2)*(función2/2)*(función2/2)))/((función2*función2)-función2+3);
		System.out.println("Solución f(0) es: "+solución0);
		System.out.println("Solución f(1) es: "+solución1);
		System.out.println("Solución f(2) es: "+solución2);
	}
}