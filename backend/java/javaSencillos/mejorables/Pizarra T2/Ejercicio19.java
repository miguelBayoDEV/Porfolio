import java.lang.*;
public class Ejercicio19 {
	public static void main(String[] args){
		int	vagón = 10;
		double tren = 6*vagón;
		double kmTren = tren/1000;
		int velocidadTren = 70;
		double recorrido = 4+1;
		double tiempoRecorrido = (recorrido+kmTren)/velocidadTren;
		double segundos = tiempoRecorrido*60*60;
		System.out.println("El tiempo desde que el tren empieza el viaje hasta que sale completamente del túnel son: "+segundos+" segundos.");
	}
}