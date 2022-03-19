package control;

import tools.StringReemplace;

public class Test {

	public static void test() {
		String frase1 = "Hola endeluego nos vemos";
		String frase2 = "Adiós endeluego nos encontraremos endeluego";
		String frase3 = "No hay nada aquí";
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluego(frase1));
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluego(frase2));
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluego(frase3));
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluegoStringBuilder(frase1));
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluegoStringBuilder(frase2));
		System.out.println(StringReemplace.reemplaceEndeluegoPorDesdeluegoStringBuilder(frase3));
	}
}
