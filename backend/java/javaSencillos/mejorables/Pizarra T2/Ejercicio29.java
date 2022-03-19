import java.lang.*;
public class Ejercicio29 {
	public static void main(String[] args){
		// La edad de una persona.
		int edad = 22;
		int menoresEdad = 18;
		int mayores60Años = 60;
		// Con la siguiente operación se sabrá si hay descuento o no.
		// Para realizar un descuento una de las dos condiciones o las dos deben ser true (en este caso es false).
		boolean descuento = (edad < menoresEdad)||(edad > mayores60Años);
		System.out.println("¿Está persona de 22 años tiene algún descuento? "+descuento);
	}
}