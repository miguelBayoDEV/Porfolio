import java.lang.*;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		//Crear programa que indica cantidad a cobrar o devolver al cliente de una tienda.
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca precio del producto: ");
		double precio = s.nextDouble();
		System.out.println("Introduzca cantidad de dinero que da el cliente: ");
		double pago = s.nextDouble();
		if(pago>precio) {
			double vuelta = pago-precio;
			System.out.println("Le devuelve al cliente: "+vuelta+" euros.");
		}
		if(pago<precio) {
			double falta = precio-pago;
			System.out.println("El cliente le falta pagar: "+falta+" euros.");
		}
		if(pago==precio) {
			System.out.println("Pago correcto.");
		}
	}

}
