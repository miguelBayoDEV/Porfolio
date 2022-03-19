package LoteriaPromitiva_Ejer16;

import Utilis.OperacionesScanner;

public class SimuladorLoteriaPrimitiva {

	public static void rellenarApuestasLoteria() {
		rellenarApuestasLoteriaDeseados(8);
    }

    public static void rellenarApuestasLoteriaDeseados(int numeroApuestas) {
        Apuesta[] arrayApuestasLoteria = new Apuesta[numeroApuestas];
    	for (int i = 0; i < numeroApuestas; i++) {
    		Apuesta apuesta = new Apuesta();
    		apuesta.rellenarApuesta();
    		arrayApuestasLoteria[i] = apuesta;
        }
		System.out.println("Apuestas: " + imprimirApuestas(arrayApuestasLoteria));
    }

    public static void rellenarApuestasLoteriaDeseados() {
        int nApuestas = OperacionesScanner.leerNumeroEnteroInt("Introduzca número de apuestas lotería: ");
        rellenarApuestasLoteriaDeseados(nApuestas);
    }
    
    public static String imprimirApuestas(Apuesta[] arrayApuestas) {
		String resultadoApuesta = "";
		for(Apuesta item: arrayApuestas) {
			resultadoApuesta += "[" + item.imprimirApuesta() + "] ";
		}
		return resultadoApuesta;
	}
	
}
