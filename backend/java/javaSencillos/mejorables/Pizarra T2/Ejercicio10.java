import java.lang.*;
public class Ejercicio10{
	public static void main(String[] args){
		// El artículo es una camiseta de ciclismo.
		int precioNormal = 20;
		int porcentajeRebaja = 10;
		// El porcentajeRebaja sería otra forma multiplicar por 0.1.
		int descuento = (precioNormal * porcentajeRebaja)/100;
		// El resultado final sería el precio del artículo menos el descuento.
		int precioRebajado = precioNormal - descuento;
		System.out.println("Precio normal del artículo: "+precioNormal+" euros.");
		System.out.println("Porcentaje de rebaja aplicado: "+porcentajeRebaja+"%.");
		System.out.println("Descuento aplicado: "+descuento+" euros.");
		System.out.println("Precio final del artículo: "+precioRebajado+" euros.");
	}
}