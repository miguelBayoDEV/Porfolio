import java.lang.*;
public class Ejercicio10{
	public static void main(String[] args){
		// El art�culo es una camiseta de ciclismo.
		int precioNormal = 20;
		int porcentajeRebaja = 10;
		// El porcentajeRebaja ser�a otra forma multiplicar por 0.1.
		int descuento = (precioNormal * porcentajeRebaja)/100;
		// El resultado final ser�a el precio del art�culo menos el descuento.
		int precioRebajado = precioNormal - descuento;
		System.out.println("Precio normal del art�culo: "+precioNormal+" euros.");
		System.out.println("Porcentaje de rebaja aplicado: "+porcentajeRebaja+"%.");
		System.out.println("Descuento aplicado: "+descuento+" euros.");
		System.out.println("Precio final del art�culo: "+precioRebajado+" euros.");
	}
}