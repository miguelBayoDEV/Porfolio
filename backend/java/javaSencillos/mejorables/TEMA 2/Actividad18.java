import java.lang.*;
public class Actividad18{
	public static void main(String[] args){

		/*Un camion tiene capacidad para 3 toneladas necesita 15 viajes para transportar una cantidad de arena 
		realiza un progrma que muestre por pantalla cuantos viajes necesitara un camion con capacidad de 5 toneladas
		*/

		int camion1=3; 
		int camion2=5; 
		int viaje1=15;
		int viaje2=((camion1*viaje1)/camion2);

		System.out.println("El camion con 5 toneladas tiene que dar "+viaje2+" viajes");

	}
}