import java.lang.*;
public class Ejercicio12 {
	public static void main(String[] args){
		int horas = 7;
		int minutos = 27;
		int segundos = 47;
		// Pasar las horas y los minutos a segundos y sumar los segundos.
		int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
		System.out.println("El número total de segundos de"+horas+"h "+minutos+"min "+segundos+"seg es: "+totalSegundos+".");
	}
}