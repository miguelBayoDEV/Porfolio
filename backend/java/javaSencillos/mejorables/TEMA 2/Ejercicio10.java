import java.lang.*;
public class Ejercicio10{
	public static void main(String[] args){
		// DATOS DEL PROBLEMA
		int precioNormal = 150 ;
		double porcentajeRebaja = 15 ;
		// CALCULOS
		double descuento = (precioNormal*porcentajeRebaja)/100;
		double precioRebajado = precioNormal - descuento;
		
		// SALIDA POR PANTALLA
		System.out.println("Precio normal del artículo: " + precioNormal + " Euros");
		System.out.println("Porcentaje de rebaja aplicado: " + porcentajeRebaja + "%");
		System.out.println("Descuento aplicado: " + descuento + " euros");
		System.out.println("Precio final del articulo: " + precioRebajado + " euros");
		
	}
}