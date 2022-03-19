package tools;

public class StringReemplace {

	public static String reemplaceEndeluegoPorDesdeluego(String frase) {
		String resultado = "";
		if(frase.contains("endeluego")) {
			resultado = frase.replace("endeluego", "desde luego");
		}else {
			resultado = "La frase no contiene endeluego.";
		}
		return resultado;
	}
	
	public static StringBuilder reemplaceEndeluegoPorDesdeluegoStringBuilder(String frase) {
		StringBuilder resultado = new StringBuilder();
		if(frase.contains("endeluego")) {
			resultado.append(frase.replace("endeluego", "desde luego"));
		}else {
			resultado.append("La frase no contiene endeluego.");
		}
		return resultado;
	}
	
}
