package Ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el precio del articulo");
		double precio = s.nextDouble();
		System.out.println("¿Cuanto da el cliente?");
		double da = s.nextDouble();
		   
		if(da>=precio) {
			System.out.println("Es necesario devolver el cambio");
			double cambio = da - precio;
			System.out.println("Hay que devolverle " + cambio + " euros");
		}else {
			System.out.println("Al cliente le falta dinero");
			double falta = precio - da;
			System.out.println("Le falta " + falta + " euros");
		}
	}

}
