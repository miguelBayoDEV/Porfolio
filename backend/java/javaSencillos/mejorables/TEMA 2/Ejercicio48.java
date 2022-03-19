import java.lang.*;
public class Ejercicio48 {
	public static void main(String[] args){
		double distancia_entreCiudades = 80;
		int velocidadCoche = 120;
		int velocidadCami�n = 80;
		// Primero se suman las velocidades para saber la valocidad total en esa distancia.
		int sumaVelocidades = velocidadCoche+velocidadCami�n;
		// Como se sabe la distancia que es 80km se divide entre las velocidades por est� f�rmula t=d/v.
		double tiempoEncuentro = distancia_entreCiudades/sumaVelocidades;
		// Como el tiempo est� en horas se pas� a minutos (o segundos que ser�a volver a multiplicar por 60).
		double tiempo = tiempoEncuentro*60;
		// La distancia del coche hasta que se encuentran se obtiene multiplicando la velocidad del coche por el tiempo en horas.
		double distanciaCoche = velocidadCoche*tiempoEncuentro;
		// La distancia del cami�n se obtiene al restar la distancia total menos la distancia del coche.
		double distanciaCami�n = distancia_entreCiudades - distanciaCoche;
		System.out.println("El tiempo que pasa hasta que los dos veh�culos se encuentran son: "+tiempo+" minutos.");
		System.out.println("La distancia del coche es: "+distanciaCoche+" km.");
		System.out.println("La distancia del cami�n es: "+distanciaCami�n+" km.");
	}
}