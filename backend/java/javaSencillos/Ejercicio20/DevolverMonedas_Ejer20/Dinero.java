package DevolverMonedas_Ejer20;

public class Dinero {

	public static String fragmentarDinero(double cantidadDinero) {
		final int[] centimos = {200, 100, 50, 20, 10, 5, 2, 1};
		cantidadDinero *= 100;
		int sobrante = (int) cantidadDinero;
		String[] cantidadImprimir = new String[8];
		int aux_division = 0;
		
		for(int i=0; i<centimos.length; i++) {
			aux_division = sobrante / centimos[i];
			if(aux_division != 0) {
				cantidadImprimir[i] = (centimos[i] < 100)? centimos[i] + " centimos - " + aux_division + " monedas" : centimos[i] / 100 + " euros - " + aux_division + " monedas";
			}
			sobrante %= centimos[i];
		}
		
		// Imprimir dinero
		String imprimirDinero = "Dinero: ";
		for(String item: cantidadImprimir) {
			if(item != null) {
				imprimirDinero += item + ", ";
			}
		}
		imprimirDinero = imprimirDinero.substring(0, imprimirDinero.length() - 2);
		imprimirDinero += ".";
		return imprimirDinero;
	}
	
}
