import java.lang.*;
public class Ejercicio29 {
	public static void main(String[] args){
		// La edad de una persona.
		int edad = 22;
		int menoresEdad = 18;
		int mayores60A�os = 60;
		// Con la siguiente operaci�n se sabr� si hay descuento o no.
		// Para realizar un descuento una de las dos condiciones o las dos deben ser true (en este caso es false).
		boolean descuento = (edad < menoresEdad)||(edad > mayores60A�os);
		System.out.println("�Est� persona de 22 a�os tiene alg�n descuento? "+descuento);
	}
}