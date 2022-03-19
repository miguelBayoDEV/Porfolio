import java.lang.*;
public class Ejercicio20 {
	public static void main(String[] args){
		// Me daba 0.0 al dividir 60*(40/60).
		int velocidadCamión = 60;
		int tiempoCamión = 40;
		// Es el recorrido que recorrerán todos los vehículos.
		double recorrido = (velocidadCamión*tiempoCamión)/60;
		System.out.println("El recorrido del camión será: "+recorrido+" km.");
		int velocidadCoche1 = 100;
		double tiempoCoche1 = recorrido/velocidadCoche1;
		double minutos1 = tiempoCoche1*60;
		System.out.println("El coche1 que va a 100km/h tardará: "+minutos1+" minutos en recorrer 40km.");
		int velocidadCoche2 = 140;
		double tiempoCoche2 = recorrido/velocidadCoche2;
		double minutos2 = tiempoCoche2*60;
		System.out.println("El coche2 que va a 140km/h tardará: "+minutos2+" minutos en recorrer 40km.");
	}
}