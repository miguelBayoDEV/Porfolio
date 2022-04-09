package tools;

import model.Idioma;

public class Traductor {

	public static String palabraTraducida(String palabra, Idioma idioma) {
		String nuevaPalabra = "";
		
		if(idioma.equals(Idioma.ALEMAN)) {
			nuevaPalabra = traduccionAleman(palabra);
		}else if(idioma.equals(Idioma.BULGARO)) {
			nuevaPalabra = traduccionBulgaro(palabra);
		}else if(idioma.equals(Idioma.CATALAN)) {
			nuevaPalabra = traduccionCatalan(palabra);
		}
		
		return nuevaPalabra;
	}
	
	private static String traduccionAleman(String palabra) {
		String palabraTraducida = "";
		char letraFinal = palabra.charAt(palabra.length()-1);
		String vocales = "aeiouAEIOU";
		
		if(vocales.indexOf(letraFinal) != -1) {
			palabraTraducida = palabra.substring(0, palabra.length()-1);
			palabraTraducida += "ujem";
		}else {
			palabraTraducida = palabra.substring(0, palabra.length()-2);
			palabraTraducida += "ujem";
		}
			
		return palabraTraducida;
	}
	
	private static String traduccionBulgaro(String palabra) {
		String palabraTraducida = "";
		char letraFinal = palabra.charAt(palabra.length()-1);
		String vocales = "aeiouAEIOU";
		
		if(vocales.indexOf(letraFinal) != -1) {
			palabraTraducida += palabra + "kov";
		}else {
			palabraTraducida = palabra.substring(0, palabra.length()-1);
			palabraTraducida += "kov";
		}
			
		return palabraTraducida;
	}
	
	private static String traduccionCatalan(String palabra) {
		return palabra.substring(0, palabra.length()-1);
	}
	
}
