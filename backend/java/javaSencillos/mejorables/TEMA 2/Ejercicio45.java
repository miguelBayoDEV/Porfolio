import java.lang.*;
public class Ejercicio45{
	public static void main(String[] args){

		int numero = 12345; //Nuestro numero
		int numeroPremiado = 16285; //el numero premiado
		
		boolean coincide = numero == numeroPremiado; //comprobamos si coincide y es el numero premiado
		
		int cifra1prem = numeroPremiado/10000; //Cogemos la primera cifra del premiado
		int cifra5prem = numeroPremiado%10; //cogemos la cifra 5 del premiado
		
		int cifra1num = numero/10000; //cogemos la cifra uno de nuestro numero
		int cifra5num = numero%10; //cogemos la última cifra de nuestro numero
		
		boolean condicion1 = cifra1num == cifra1prem; //comprobamos si coincide la primera cifra de ambos 
		boolean condicion2 = cifra5num == cifra5prem; //comprobamos si coincide la ultima cifra de ambos
		
		boolean reintegro = condicion1 && condicion2;  //Si cumple ambas, tiene reintegro
		
		System.out.println("El numero es premiado? = "+coincide+
			"\nTiene reintegro? "+reintegro
		);
	}
}
