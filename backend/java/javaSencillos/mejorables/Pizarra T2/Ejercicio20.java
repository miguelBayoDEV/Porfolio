import java.lang.*;
public class Ejercicio20 {
	public static void main(String[] args){
		// Me daba 0.0 al dividir 60*(40/60).
		int velocidadCami�n = 60;
		int tiempoCami�n = 40;
		// Es el recorrido que recorrer�n todos los veh�culos.
		double recorrido = (velocidadCami�n*tiempoCami�n)/60;
		System.out.println("El recorrido del cami�n ser�: "+recorrido+" km.");
		int velocidadCoche1 = 100;
		double tiempoCoche1 = recorrido/velocidadCoche1;
		double minutos1 = tiempoCoche1*60;
		System.out.println("El coche1 que va a 100km/h tardar�: "+minutos1+" minutos en recorrer 40km.");
		int velocidadCoche2 = 140;
		double tiempoCoche2 = recorrido/velocidadCoche2;
		double minutos2 = tiempoCoche2*60;
		System.out.println("El coche2 que va a 140km/h tardar�: "+minutos2+" minutos en recorrer 40km.");
	}
}